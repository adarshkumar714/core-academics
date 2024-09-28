#include <stdio.h>

void fun(int x){
    if(x>0){
        printf("%d", x);
        fun(x-1);
        printf("%d", x);
        fun(x-1);
        printf("%d", x);
    }
}

int x(int n){
    if(n<3) return 1;
    else return x(n-1) + x(n-1) +1;
}

void get(int n){
    if(n<1) return;
    get(n-1);
    get(n-3);
    printf("%d", n);
}

int main(){
    // fun(3);
    // printf("%d", x(5));
    get(5);
    printf("\n");
    return 0;
}



