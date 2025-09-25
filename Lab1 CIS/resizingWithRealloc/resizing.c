#include<stdio.h>
#include<stdlib.h>

int main(){
    int *arr;
    arr = malloc(2 * sizeof(int));

    if (arr == NULL){
        printf("Memory not available!\n");
        return 1;
    }   

    for (int i = 0; i < 2; i++){
        printf("arr[%d] = %d\n",i, arr[i]);
    }
    
    printf("\n");

    arr[0] = 10;
    arr[1] = 20;

    arr = realloc(arr, 4 * sizeof(int));

    arr[2] = 30;
    arr[3] = 40;

    for(int i = 0; i < 4; i++){
        printf("arr[%d] = %d\n", i, arr[i]);
    }

    free(arr);
    return 0;
}