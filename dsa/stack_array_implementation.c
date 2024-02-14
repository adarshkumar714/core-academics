#include <stdio.h>
#include <stdlib.h>

#define MAX_SIZE 10

typedef struct {
    int arr[MAX_SIZE];
    int top;
} stack;

void init(stack *s){
    s->top = -1;
}

int isEmpty(stack *s){
    return s->top == -1;
}

int isFull(stack *s){
    return s->top == MAX_SIZE - 1;
}

void push(stack *s, int data){
    if(isFull(s)){
        printf("Stack is full!\n");
        return;
    }
    s->top++;
    s->arr[s->top] = data;
}

int pop(stack *s){
    if(isEmpty(s)){
        printf("Stack is empty!\n");
        return -1; // Changed return value to indicate an error
    }
    int temp = s->arr[s->top];
    s->top--;
    return temp;
}

void printS(stack *s){
    printf("top ");
    for(int i = 0; i <= s->top; i++){
        printf(": %d ", s->arr[i]);
    }
    printf("\n");
}

int main(){
    stack s;
    init(&s);

    push(&s, 10);
    push(&s, 20);
    push(&s, 30);
    printS(&s);

    return 0;
}

