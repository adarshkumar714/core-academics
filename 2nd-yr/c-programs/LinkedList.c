// Online C compiler to run C program online
#include <stdio.h>
#include <stdlib.h>

struct node{
    int data;
    struct node *next;
};

struct node *head = NULL;
struct node *current = NULL;

void printLL(struct node* p){
    if(p==NULL){
        // printf("Your LinkedList is empty!\n");
        printf("Null\n");
    }
    while(p!=NULL){
        printf("%d -> ", p->data);
        p = p->next;
    }
    printf("NULL\n");
}

// adds one elemnet in ending of linkedlist
void insert(int d){
    struct node* newNode = malloc(sizeof(struct node));
    
    newNode->data = d;
    newNode->next = NULL;
    
    if(head==NULL && current==NULL){
        head = newNode;
        head->next = NULL;
        current = newNode;
    }
    else{
        current->next = newNode;
        current = newNode;
    }
}

void insertAfterNode(struct node* Node, int d){
    struct node* newNode = malloc(sizeof(struct node));
    
    newNode->data = d;
    newNode->next = Node->next;
    
    Node->next = newNode;
}

// deletes first element of linkedlist
void deleteHead(){
    head = head->next;
}

void deleteNode(struct node *toDelete){
    
}

int main() {
    insert(2);
    insert(3);
    insert(1);
    printLL(head);
    
    deleteHead();
    printLL(head);
    
    insertAfterNode(head->next, 4);
    printLL(head);
    
    insertAfterNode(head, 5);
    printLL(head);
    
    return 0;
}