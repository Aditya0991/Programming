#include<stdio.h>
int main()
{
    int num,r,sum=0;
    printf("enter the number:");
    scanf("%d",&num);
    while(num!=0)
    {
        r=num%10;
        sum=sum+r;
        num=num/10;
        
    }
    printf("sum:%d",sum);
    return 0;
}