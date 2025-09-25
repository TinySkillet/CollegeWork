#include<stdio.h>

void changeValue(int *p) {
    *p = 50;
}

int main(){
    int x = 10;
    printf("Before calling 'changeValue' function, x = %d\n", x);

    changeValue(&x);
    printf("After calling 'changeValue' function, x = %d\n", x);
    return 0;
}
