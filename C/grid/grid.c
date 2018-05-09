//System libraries
#include <stdio.h>
#include <stdlib.h>
//Custom libraries
#include "coordinate.h"

//Main method
int main() {
    //Two variables being read in which define the grid x and y size
    short n, m;
    scanf("%hi %hi",&n,&m);
    //Create the board based on the grid size
    char board[n][m];
    //Load the data into the board
    for (int i = 0; i < n; i++) scanf("%s",board[i]);

    //Calculate total units(coordinates) on the board
    int total_units = m * n;
    //Get memory requirements
    int* taken_space = (int*)calloc((size_t)total_units, sizeof(int));
    //Create coordinate queue of free spaces
    struct coordinate_queue free_space;
    //Create coordinate queue
    initialize(&free_space, total_units << 2);

    //Add first coordinate
    enqueue(&free_space, 0, 0, 0);
    //Initialize goal cost
    int goal_cost = -1;

    //Until queue of empty coordinates is cleared, continue
    while (!empty(&free_space)) {
        //Current coordinate removed from queue
        struct coordinate* current = dequeue(&free_space);
        //Current m position
        short current_m = current->x_coord;
        //Current n position
        short current_n = current->y_coord;
        //Current cost of move
        int curr_cost = current->cost;
        //Safety variable making sure you do not exceed grid size
        int one_dim = current_n * m + current_m;

        //Continue on next iteration of while loop if exceed grid size
        if (taken_space[one_dim]) continue;

        //Set space
        taken_space[one_dim] = 1;
        //Get value of move
        short value = (short)(board[current_n][current_m] - '0');

        //Move up on grid
        if (current_n >= value && !taken_space[(current_n - value) * m + current_m]) {
            //Load move into potential free space queue
            enqueue(&free_space, current_m, current_n - value, curr_cost + 1);
        }

        //Move down on grid
        if (current_n < n - value && !taken_space[(current_n + value) * m + current_m]) {
            //Test for valid move
            if (current_m == m - 1 && current_n + value == n - 1) {
                //Do move and increment cost
                goal_cost = curr_cost + 1;
                break;
            }
            else {
                //Load move into potential free space queue
                enqueue(&free_space, current_m, current_n + value, curr_cost + 1);
            }
        }

        //Move left on grid
        if (current_m >= value && !taken_space[current_n * m + current_m - value]) {
            //Load move into potential free space queue
            enqueue(&free_space, current_m - value, current_n, curr_cost + 1);
        }

        //Move right on grid
        if (current_m < m - value && !taken_space[current_n * m + current_m + value]) {
            //Test for valid move
            if (current_m + value == m - 1 && current_n == n - 1) {
                //Do move and increment cost
                goal_cost = curr_cost + 1;
                break;
            }
            else {
                //Load move into potential free space queue
                enqueue(&free_space, current_m + value, current_n, curr_cost + 1);
            }
        }
    }

    //Print resulting cost of goal
    printf("%d\n", goal_cost);

    //Make free_space release memory it holds
    destroy(&free_space);
    //Release free_space from memory
    free(taken_space);
    //Main complete
    return 0;
}