#include<iostream>
using namespace std;
int add(int x, int y){
    return x+y;
}
int add(int x, int y, int z){
    return x+y+z;
}
int add(char x, char y){
    return x+y;
}
float add(float x){
    return x+10.5;
}
//main function
int main(){
    cout<<add(10,13)<<"\n"<<add('a','b')<<"\n"<<add(10,23,12)<<"\n"<<add(12.5)<<endl;
}