#include <stdio.h>

int main(){
    int n;
    printf("enter n: ");
    scanf("%d", &n);
    int a[n];

    int i,j;
    for(i=0;i<n;i++){
        scanf("%d", &a[i]);
    }

    int temp;
    for(i=0;i<n-1;i++){
        if(a[i]>a[i+1]){
            for(j=i+1;j>=0;j--){
                // printf("%d %d %d %d| ", i, j, j-1, i+1);
                if(a[j]<a[j-1]){
                    temp = a[j-1];
                    a[j-1] = a[j];
                    a[j] = temp;
                }
            }
        }
        printf("\n");
    }

    for(i=0;i<n;i++){
        printf("%d ", a[i]);
    }
}