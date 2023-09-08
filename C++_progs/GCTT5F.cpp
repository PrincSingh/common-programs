#include<iostream>
using namespace std;

class Test{
    private:
    static int count;
    static bool incr;

    public:
    Test fun();
        
};

int Test::count = 5;
bool Test::incr = false;
Test Test::fun(){
    if(count%5==0 && incr){
        count--;
    }
    else{
        count++;
    }
    std::cout<<count<<" ";
    incr = !incr;
    return *this;
}

int main(){
    Test t;
    t.fun().fun().fun().fun().fun();
    return 0;
}

