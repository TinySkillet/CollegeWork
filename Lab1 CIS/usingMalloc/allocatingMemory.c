#include<stdio.h>
#include<stdlib.h>

int main() {
    int* p;
    printf("%d\n",sizeof(int));

    p = malloc(sizeof(int));

    if (p == NULL){
        printf("Memory not available!\n");
        return 1;
    }

    *p = 25;
    printf("Value = %d\n", *p);
    free(p);
    return 0;
}