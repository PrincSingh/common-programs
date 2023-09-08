#include<iostream>
using namespace std;
int main()
{
    int i;
    for(i=0; i<10;i++)
    {
        printf("\n%d",i+1);
    }
    printf("\n");
    while(i<20)
    {
        cout<<i+1<<endl;
        i++;
    }
    do
    {
        cout<<i+1<<endl;
        i+=1;
    }while(i<30);
}