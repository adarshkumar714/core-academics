#include <stdio.h>
#include <stdlib.h>

typedef struct node {
    int data;
    struct node* next;
} node;

node* createNode(int data){
    node* newNode = (node*) malloc(sizeof(struct node));
    if(!newNode){
        printf("No memory available!\n");
        exit(1);
    }
    newNode -> data = data;
    newNode -> next = NULL;
    return newNode;
}

void printLL(node* head){
    node* current = head;
    while(current){
        printf("%d -> ", current->data);
        current = current -> next;
    }
    printf("NULL\n");
}

int main(){
    node* head = createNode(1);
    head -> next = createNode(2);
    head -> next -> next = createNode(3);
    printf("LL : ");
    printLL(head);

    return 0;
}


