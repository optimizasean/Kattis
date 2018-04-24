//IO and processing
#include <iostream>
#include <cstdio>
#include <cstring>
//Math and operations
#include <cmath>
#include <algorithm>
//Data structures
#include <vector>
#include <queue>

//Standard namespace because I dont feel like typing std:: every time I want to use a function
using namespace std;

//Edge struct, represented connected nodes as edges for simplicity(and avoiding saying node too much)
typedef struct edge {
	//ID of nodes(this node u and other node v) that form this edge, e.g. v is a connected node of u(this)
	int u, v;
	//w is weight of path to node v from this node(u)
	double w;
	//Constructor, set nodes and weight(used _ to prevent name collisions ex: edge u or constructor u)
	edge (int _u, int _v, double _w) {
		u = _u;
		v = _v;
		w = _w;
	}
	//Override the < operator to work natively with the struct for ease of coding, used for priority queue as well(sorting by lowest)
	bool operator < (edge e) const {
		return w > e.w;
	}
};

//Main method, Prim's algorithm is employed to solve this problem
int main() {
	//Variables for processing and loop control
	int N, freckles, u, v;
	//Distance holding variable(IE weight of edge, distance between nodes u and v)
    double distance;
	//Read in number of cases to run
	cin >> N;
	//Continue until number of cases is 0
	while (N--){
		//Read in the number of freckles
		cin >> freckles;
		//Make storage for the coordinates
		double x_coord[freckles], y_coord[freckles];
		//Read in the coordinates
		for (int i = 0; i < freckles; i++) cin >> x_coord[i] >> y_coord[i];
		//Create our vector of edges, first dimension[node] second dimension[][connected nodes] < how I visualized it
		vector<edge> graph[freckles];
		for (int i = 0; i < freckles; i++) {
			for (int j = i + 1 ; j < freckles; j++){   
				//Calculate Euclidean Distance formula for distance between each node
				distance = sqrt((pow(x_coord[i]-x_coord[j], 2) + pow(y_coord[i]-y_coord[j], 2)));
				//Save nodes into the graph
				graph[i].push_back(edge(i, j, distance));
				graph[j].push_back(edge(j, i, distance));                    
			}
		}

		//Prim Minimum Spanning Tree Algorithm
		priority_queue<edge> nodeQueue;
		//Track visited nodes so no loops
		bool visited[freckles];
		//Set memory and allocate for visited array
		memset(visited, false, sizeof(visited));
		double sum = 0;
		//Start with the first node which is already visited so mark early
		visited[0] = true;
		//Begin pushing into queue, start with node[0] and push all connected nodes[self(0)-n]
		for (int i = 0; i < graph[0].size(); i++) nodeQueue.push(graph[0][i]);//LINE 5 IN ALGORITHMS BOOK
		//Used to know when all edges have been found
		int edge_count = 0;
		//Empty the queue and process the tree
		while (edge_count < freckles - 1 && !nodeQueue.empty()) {//LINE 6 IN ALGORITHMS BOOK
			//Take first edge off the queue(lowest cost edge)
			edge e = nodeQueue.top();//LINE 7 IN ALGORITHMS BOOK E.G. EXTRACT-MIN[Q]
			//Remove from queue
			nodeQueue.pop();
			//Set the two nodes I work with
			u = e.u;//EG NODE U IN LINE 7
			v = e.v;//EG NODE V I COMPARE WITH IN LINE 8-9
			//Get the distance between the two nodes
			distance = e.w;//THIS IS THE MINIMUM DISTANCE DUE TO PRIORITY QUEUE PROPERTIES SO CAN TEST LESS NODES
			//If both are visited quit and go to next case because there must be an edge between these two already
			if (visited[u] && visited[v]) continue;
			//If u is visited then push nodes v is connected to
			if (visited[u]){
				//Push all nodes connected to node v
				for (int i = 0; i < graph[v].size(); i++) nodeQueue.push(graph[v][i]);
			}
			//If only v is visited then push nodes u is connected to
			if (visited[v]){
				//push all nodes connected to node u
				for (int i = 0; i < graph[u].size(); i++) nodeQueue.push(graph[u][i]);
			}
			//Set v to true and u to v(true) to make sure not processed again if has edge from other node in MST
			visited[u] = visited[v] = true;
			//Add the distance now put into MST
			sum += distance;
			//Increase number of edges in tree
			edge_count++;
		}
		//Return result
		printf("%.2lf\n",sum);
	}
	//End line for test cases format rules
	cout << endl;
	//Method end, program complete
	return 0;
}