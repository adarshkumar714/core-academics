#include <stdio.h>

int main(){
    int a[20];
    int i,j;
    
    for(i=0;i<20;i++){
        a[i] = 1;
    }
    for(i=2;i<21;i++){
        for(j=i;j<21;j+=i){
            a[j-1] = !a[j-1];
        }
    }

    int c;
    for(i=0;i<20;i++){
        c+=a[i];
    }
    printf("%d",c);
    // answer : 3 gates will be open
    // gates: 1 0 0 1 0 0 0 0 1 0
}