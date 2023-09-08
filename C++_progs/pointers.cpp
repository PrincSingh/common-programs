#include<iostream>
using namespace std;
int main(){
    int a=1,b=3,c;
    int* ap, *bp;
    string s="prince kumar";
    string* sp;
    ap=&a;
    bp=&b;
    sp=&s;
    cout<<*ap<<"\n"<<*bp<<"\n"<<*sp<<endl;
    return 0;
}