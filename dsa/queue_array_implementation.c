#include <stdio.h>

#define MAX_SIZE 10

typedef struct {
    int arr[MAX_SIZE];
    int front;
    int rear;
} queue;

void init(queue *q){
    q->front = -1;
    q->rear = -1;
}

int isEmpty(queue *q){
    return q->front == -1;
}

int isFull(queue *q){
    return q->rear == MAX_SIZE - 1;
}

void enqueue(queue *q, int data){
    if(isFull(q)){
        printf("Queue is full!\n");
        return;
    }
    if(isEmpty(q)){
        q->front = 0;
    }
    q->arr[++(q->rear)] = data;
}

int dequeue(queue *q){
    if(isEmpty(q)){
        printf("Queue is already empty!\n");
        exit(1);
    }
    int deletedItem = q->arr[q->front];
    if(q->front==q->rear){
        q->front = -1;
        q->rear = -1;
    }
    else{
        q->front = q->front + 1;
    }
    return deletedItem;
}

int main(){
    queue q;
    init(&q);

    return 0;
}


