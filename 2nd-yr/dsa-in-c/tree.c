#include <stdio.h>
#include <stdlib.h>

typedef struct node {
    int data;
    int visited;
    struct node *left;
    struct node *right;
} node;

typedef struct tree {
    node *root;
} tree;

void init(tree *t){
    printf("init\n");
    t->root = NULL;
    printf("init\n");
}

node *findLeaf(tree *t, node *current, node *prev, int data){
    if(!current){
        return prev;
    }

    if(data<current->data){
        findLeaf(t, current->left, current, data);
    }
    else{
        findLeaf(t, current->right, current, data);
    }
}

node *createNode(int data){
    node *newNode = (node*) malloc(sizeof(node));
    if(!newNode){
        printf("space unavailable!\n");
        exit(1);
    }
    newNode->data = data;
    newNode->visited = 0;
    newNode->left = NULL;
    newNode->right = NULL;
    return newNode;
}

// void insert(tree *t, int data){
//     node *newNode = createNode(data);
//     if(!t) t->root = newNode;
//     else{
//         node *lastNode = findLeaf(t, t->root, NULL, data);
//         printf("%d\n", lastNode->data);
//     }
//     // else{
//     //     node *lastNode = endNode(t, t->root, t->root, data);
//     //     if(data<lastNode->data){
//     //         lastNode->left = newNode;
//     //     }
//     //     else{
//     //         lastNode->right = newNode;
//     //     }
//     // }
// }

#define COUNT 10

void print2DUtil(node* root, int space)
{
    // Base case
    if (root == NULL)
        return;
 
    // Increase distance between levels
    space += COUNT;
 
    // Process right child first
    print2DUtil(root->right, space);
 
    // Print current node after space
    // count
    printf("\n");
    for (int i = COUNT; i < space; i++)
        printf(" ");
    printf("%d\n", root->data);
 
    // Process left child
    print2DUtil(root->left, space);
}

int main(){
    node *t = createNode(10);
    t->left = createNode(20);
    t->right = createNode(30);

    t->left->left = createNode(40);
    t->right->left = createNode(50);

    print2DUtil(t, 0);


    return 0;
}

