#include <stdio.h>

int main(){
    int n = 8;
    int arr[] = {2,6,3,6,8,5,8};
    int isfound = 0;
    for(int i=0;i<7;i++){
        if(arr[i]==n){
            printf("%d found on index %d\n", n, i);
            isfound = 1;
            break;
        }
    }
    if(!isfound){
        printf("The array does not contain %d\n", n);
    }
}
