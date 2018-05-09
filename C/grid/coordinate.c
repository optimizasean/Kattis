//System libraries
#include <stdlib.h>
//Custom libraries
#include "coordinate.h"

//Initialize the coordinate queue struct
void initialize(struct coordinate_queue* s, int max_capacity) {
    //Set the address in memory of the priority queue first field
    s->address = (struct coordinate*)malloc(max_capacity * sizeof(struct coordinate));
    //Set the tail coordinates address
    s->tail = s->address;
    //Set the tail coordinates address
    s->head = s->address;
}
//Destroy the objects the coordinate queue holds
void destroy(struct coordinate_queue* s) {
    //Free the coordinate queue which starts at address in memory
    free(s->address);
}

//Checks if the coordinate queue is empty
int empty(struct coordinate_queue* s) {
    //Return true if the queue is empty
    return s->tail == s->head;
}

//Adds a coordinate to the coordinate queue
void enqueue(struct coordinate_queue* s, short x_coord, short y_coord, int cost) {
    //Set the tail coordinates x coordinate
    s->tail->x_coord = x_coord;
    //Set the tail coordinates y coordinate
    s->tail->y_coord = y_coord;
    //Set the tail cooordinates cost
    s->tail->cost = cost;
    //Increment the tail coordinate
    s->tail++;
}
//Removes a coordinate from to the coordinate queue
struct coordinate* dequeue(struct coordinate_queue* s) {
    //Get the address of the coordinate
    struct coordinate* front = s->head;
    //Move the front of the queue forward
    s->head++;
    //Return the address of the coordinate removed
    return front;
}