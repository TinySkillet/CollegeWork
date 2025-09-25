#include<stdio.h>
#include<stdlib.h>

int main(){
    int* arr;
    arr = calloc(5, sizeof(int));

    if (arr == NULL){
        printf("Memory not available!\n");
        return 1;
    }

    for(int i = 0; i < 5; i++){
        printf("arr[%d] = %d\n", i, arr[i] );
    }

    free(arr);
    return 0;
}