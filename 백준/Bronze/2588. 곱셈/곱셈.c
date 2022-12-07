#include <stdio.h>

int main()
{
    int num1, num2;
    scanf("%d %d", &num1, &num2);
    
    int n1, n2, n3;
    n1=num2/100;
    n2=(num2-n1*100)/10;
    n3=num2%10;
    
    printf("%d \n", num1*n3);
    printf("%d \n", num1*n2);
    printf("%d \n", num1*n1);
    printf("%d ", num1*num2);

    return 0;
}