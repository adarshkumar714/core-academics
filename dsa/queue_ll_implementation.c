#include <stdio.h>
#include <stdlib.h>

typedef struct node {
    int data;
    struct node *next;
} node;

typedef struct queue {
    node *front;
    node *rear;
} queue;

void init(queue *q){
    q->front = NULL;
    q->rear = NULL;
}

int isEmpty(queue *q){
    return q->front==NULL;
}

void enqueue(queue *q, int data){
    node *newNode = (node*) malloc(sizeof(node));
    newNode->data = data;
    if(isEmpty(q)){
        newNode->next = NULL;
        q->front = newNode;
        q->rear = newNode;
        return;
    }
    q->front->next = newNode;
    q->rear = newNode;
}

int dequeue(queue *q){
    if(isEmpty(q)){
        printf("Queue is empty");
        exit(1);
    }
    node *temp = q->front;
    int deletedData = temp->data;
    q->front = q->front->next;
    if(q->front==NULL) q->rear = NULL;
    free(temp);
    return deletedData;
}

int main(){
    queue q;
    init(&q);
    
    enqueue(&q, 10);

    enqueue(&q, 20);
    
    dequeue(&q);
    
    dequeue(&q);
    
    enqueue(&q, 30);

    enqueue(&q, 40);

    // dequeue(&q);
    
    
    enqueue(&q, 50);

    printf("\n%d\n", (&q)->front->next->data);
    
    dequeue(&q);
    

    return 0;
}



