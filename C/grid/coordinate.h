//Check if was imported yet
#ifndef COORDINATE_H
//Define as imported
#define COORDINATE_H

//Coordinate data type
typedef struct coordinate {
    short x_coord, y_coord;
    int cost;
};
//Coordinate Queue data type(queue of coordinates)
typedef struct coordinate_queue {
    //Address in memory of coordinate
    struct coordinate* address;
    //tail coordinate
    struct coordinate* tail;
    //head coordinate
    struct coordinate* head;
};

//Functional Definitions
void initialize(struct coordinate_queue*, int);
void destroy(struct coordinate_queue*);
int empty(struct coordinate_queue*);
void enqueue(struct coordinate_queue*, short, short, int);
struct coordinate* dequeue(struct coordinate_queue*);
//Import complete
#endif