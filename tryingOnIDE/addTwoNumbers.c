#include<stdio.h>

int addNumbers(int a, int b){
    return a + b;
}

int main(){
    int a;
    int b;

    printf("Enter first number: ");
    scanf("%d", &a);

    printf("Enter second number: ");
    scanf("%d", &b);

    int sum = addNumbers(a, b);
    printf("\nThe sum is %d\n", sum);
}

