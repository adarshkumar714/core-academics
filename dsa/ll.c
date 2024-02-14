#include <stdio.h>
#include <stdlib.h>

typedef struct node {
    int data;
    struct node *next;
} node;

node *createNode(int data){
    node *newNode = (node*) malloc(sizeof(struct node));
    if(!newNode){
        printf("No memory available!\n");
        exit(1);
    }
    newNode -> data = data;
    newNode -> next = NULL;
    return newNode;
}

void printLL(node *head){
    node *current = head;
    while(current){
        printf("%d -> ", current->data);
        current = current -> next;
    }
    printf("NULL\n");
}

void printLL_recursive(node *head){
    if(head==NULL){
        printf("NULL\n");
        return;
    }
    printf("%d -> ", head->data);
    printLL_recursive(head->next);
}

node *insertAtStart(node *head, int data){
    node *newNode = createNode(data);
    newNode->next = head;

    head = newNode;

    return head;
}

void insertAfterNode(node *Node, int data){
    node *newNode = createNode(data);
    
    newNode->next = Node->next;
    Node->next = newNode;
}

node *deleteFromStarting(node *head){
    if(head==NULL){
        printf("LL is empty!\n");
        return NULL;
    }

    node *temp = head;
    head = head->next;
    free(temp);

    return head;
}

void deleteAfterNode(node *Node){
    if(Node==NULL){
        printf("No node to delete!\n");
        return;
    }
    node *temp = Node->next;
    Node->next = Node->next->next;
    free(temp);
}

// node *reverseLL(node *head){
//     node *prev = NULL;
//     node *current = head;
//     node *next = head->next;
//     while(next){
//         current->next = prev;
//         prev = current;
//         current = next;
//         next = current->next;
//     }
//     return current;
// }

void reverseLL(node* *head){
    node *prev = NULL;
    node *current = *head;
    node *next = NULL;
    while(current){
        next = current->next;
        current->next = prev;
        prev = current;
        current = next;
    }
    *head = prev;
}

// node *reverseLL_recursive(node *prevNode, node *current){
//     if(current==NULL){
//         printf("`%d`\n", prevNode->data);
//         return prevNode;
//     }

//     reverseLL_recursive(current, current->next);
//     // printf();
//     current->next = prevNode;
//     printf("\n%d %d\n", current->data, prevNode->data);
// }

node *reverseLL_recursive(node *head){
    if(head || head->next){
        return head;
    }
    node *rest = reverseLL_recursive(head->next);
    head->next->next = head;
    head->next = NULL;
    return rest;
}


int main(){
    // creating a simaple linked list
    node *head = createNode(1);
    head -> next = createNode(2);
    head -> next -> next = createNode(3);
    printf("\n-- simple linked list --\n");
    printLL(head);

    // inserting a node at beginning
    head = insertAtStart(head, 0);
    printf("\n-- insert 0 at starting --\n");
    printLL(head);

    // inserting a node after any node
    insertAfterNode(head->next, 4);
    printf("\n-- insert 4 after head->next --\n");
    printLL(head);

    // deleting a node from starting
    head = deleteFromStarting(head);
    printf("\n-- deleting head --\n");
    printLL_recursive(head);

    // deleting a node after head->next->next
    deleteAfterNode(head->next->next);
    printf("\n-- deleting a node after head->next->next --\n");
    printLL_recursive(head);
    
    // reversing a linkedlist
    reverseLL(&head);
    printf("\n-- reversing a linkedlist --\n");
    printLL_recursive(head);

    // reversing a linkedlist (recursive)
    head = reverseLL_recursive(head);
    printf("\n-- reversing a linkedlist (recursive) --\n");
    printLL_recursive(head);

    printf("\n");

    return 0;
}


