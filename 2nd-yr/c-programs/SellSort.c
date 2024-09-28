// Time Complixity of Sell Sort
// Best Case: nlogn
// Average Case: n(log(n)^2)
// Worst Case: n^2

#include <stdio.h>
#include <math.h>

int main(){
    // 33 31 40 8 12 17 25 42
    // exception:  9 1 7 5 3 4
    int n;
    printf("Enter n: ");
    scanf("%d", &n);

    int a[n];

    printf("Enter %d elements of Array: ", n);
    int i;
    for(i=0;i<n;i++){
        scanf("%d", &a[i]);
    }

    int half = n/2;
    int j, temp, k;
    for(j=0;j<(log(n)/log(2));j++){
        printf("\nhalf: %d\n", half);
        for(i=0;i<(n-(half));i++){
            printf("\na[i]: %d, a[i+half]: %d\n", a[i], a[i+half]);
            if(a[i]>a[i+half]){
                temp = a[i];
                a[i] = a[i+half];
                a[i+half] = temp;
            }
        }
        for(k=0;k<n;k++){
            printf("%d ", a[k]);
        }
        half = half/2;
        printf("\n");
        if(half==0){
            break;
        }
    }

    printf("Sorted Array: ");
    for(i=0;i<n;i++){
        printf("%d ", a[i]);
    }

    return 0;
}
