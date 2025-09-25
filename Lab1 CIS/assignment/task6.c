#include<stdio.h>

int main() {
    int x= 10;
    int* ptr = &x;

    printf("Before changing value with the pointer: %d\n", x);

    *ptr = 20;
    
    printf("After changing value with the pointer: %d\n", x);
    return 0;
}