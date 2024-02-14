#include <stdio.h>
#include <stdlib.h>

typedef struct node {
    int data;
    struct node *next;
    struct node *prev;
} node;

node *head = NULL;
node *prev = NULL;

void createNode(int data){
    node *newNode = (node*) malloc(sizeof(node));
    newNode -> data = data;
    newNode -> next = NULL;
    if(!head){
        newNode -> prev = NULL;
        head = newNode;
        prev = head;
    }
    else{
        prev -> next = newNode;
        newNode -> prev = prev;
        prev = newNode;
    }

    // node *newNode = (node*) malloc(sizeof(node));
    // newNode -> data = data;
    // newNode -> next = NULL;
    // newNode -> prev = NULL;
}

void printLL(node* h){ // h -> head (local variable)
    node *current = h;
    while(current){
        printf("%d -> ", current->data);
        current = current -> next;
        // head = head->next;
    }
    printf("NULL\n");
}

int main(){
    // node *head = createNode(1);
    // head -> next = createNode(2);

    // head -> next -> next = createNode(3);
    // head -> next -> prev = head -> next;

    // head -> next -> next -> next = createNode(4);
    // head -> next -> prev = head -> next -> next;

    createNode(1);
    createNode(2);
    createNode(3);
    createNode(4);

    printLL(head);


    return 0;
}


