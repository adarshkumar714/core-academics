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

    // selection sort
    int min=a[0];
    for(i=0;i<n-1;i++){
        for(j=i+1;j<n;j++){
            if(a[j]<min){
                min = a[j];
                k = j;
            }
        }
        if(k!=-1){
            temp = a[i];
            a[i] = a[k];
            a[k] = temp;
            min = a[i+1];
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