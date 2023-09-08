#include<iostream>
using namespace std;
int main()
{
    int a=10,b=20;
    cout<<"a="<<a<<"b="<<b<<endl;
    int temp=a;
    a=b;
    b=temp;
    cout<<"after swapping\n"<<"a="<<a<<"b="<<b;
    return 0;
}