#include<iostream>
using namespace std;
class demo{
    int a=10;
    public:
    virtual void print()=0;
    virtual void getdata(){
        cout<<"enter value a: ";
        cin>>a;
    }
    void putdata(){
        cout<<"a= "<<a<<endl;
    }
    void operator+(demo X){
       cout<<this->a<<endl<<X.a<<endl;
    }
};
class femo:public demo{
    public:
    void getdata(){
        cout<<"child class called\n";
    }
};

int main(){
    demo A,B,C;
    demo* Ap;
    femo D;
    Ap=&A;
    Ap->getdata();
    A.putdata();
    B.getdata();
    B.putdata();
    A+B;
    B+A;
    D.getdata();
    D.putdata();
}