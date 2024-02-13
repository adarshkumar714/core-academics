#include <stdio.h>
#include <stdlib.h>

typedef struct node {
    int coeff;
    int power;
    struct node* next;
} node;

node* createNode(int coeff, int power){
    node* newNode = (node*) malloc(sizeof(struct node));
    if(!newNode){
        printf("No memory available!\n");
        exit(1);
    }
    newNode->coeff = coeff;
    newNode->power = power;
    newNode -> next = NULL;
    return newNode;
}

void printLL(node* head){
    node* current = head;
    while(current){
        printf("%d -> ", current->coeff);
        current = current -> next;
    }
    printf("NULL\n");
}

node* addPolynomial(node* head1, node* head2){
    node *head = head1, *temp1 = head1, *temp2 = head2;
    node* current = head1;
    while(current){
        current->coeff = temp1->coeff + temp2->coeff;
        current = current->next;
        temp1 = temp1->next;
        temp2 = temp2->next;
    }

    return head1;
}

int main(){
    node* head1 = createNode(3, 2);
    head1->next = createNode(2, 1);
    head1->next->next = createNode(1, 0);
    printf("\n-- polynomial 1 --\n");
    printLL(head1);

    node* head2 = createNode(5, 2);
    head2->next = createNode(1, 1);
    head2->next->next = createNode(3, 0);
    printf("\n-- polynomial 2 --\n");
    printLL(head2);

    node* head = addPolynomial(head1, head2);
    printf("\n-- addition of 2 polynomials --\n");
    printLL(head1);

    printf("\n");

    return 0;
}

