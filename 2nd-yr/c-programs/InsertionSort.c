#include <stdio.h>

int main() {
    int n;
    printf("enter n: ");
    scanf("%d", &n);
    int a[n];
    
    printf("enter %d elements of array:\n", n);
    int i,j,temp, k;
    for(i=0;i<n;i++){
        scanf("%d", &a[i]);
    }

    // inseration sort
    for(i=0;i<n-1;i++){
        if(a[i]>a[i+1]){
            // printf("inner loop\n");
            for(j=i+1;j>0;j--){
                if(a[j]<a[j-1]){
                    temp = a[j-1];
                    a[j-1] = a[j];
                    a[j] = temp;
                }
            }
        }
        printf("iteration %d: ", i+1);
        for(k=0;k<n;k++){
            printf("%d ", a[k]);
        }
        printf("\n");
        k = -1;
    }
    
    printf("your sorted array is : ");
    for(i=0;i<n;i++){
        printf("%d ", a[i]);
    }

    return 0;
}