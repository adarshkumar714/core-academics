#include <stdio.h>
#include <stdlib.h>
#include <string.h>

typedef struct node {
    int data;
    struct node *next;
} node;

typedef struct {
    node *top;
} stack;

void init(stack *s){
    s->top = NULL;
}

int isEmpty(stack *s){
    return s->top==NULL;
}

void push(stack *s, int data){
    node *newNode = (node*) malloc(sizeof(node));
    if(!newNode){
        printf("Memory unavailable!");
        exit(1);
    }
    newNode->data = data;
    if(!(s->top)){
        s->top = newNode;
        s->top->next = NULL;
        return;
    }
    newNode->next = s->top;
    s->top = newNode;
}

int pop(stack *s){
    if(!(s->top)){
        printf("Stack is empty!\n");
        exit(1);
    }
    node *temp = s->top;
    int data = temp->data;
    s->top = s->top->next;
    free(temp);
    return data;
}

void reverseString(char str[]){
    int len = strlen(str);
    stack s;
    init(&s);
    for(int i=0;i<len;i++){
        push(&s, str[i]);
    }
    for(int i=0;i<len;i++){
        str[i] = pop(&s);
    }
}

int main(){
    stack s;
    init(&s);

    char str[] = "hello";
    reverseString(str);
    printf("reversed string: %s\n", str);

    return 0;
}

