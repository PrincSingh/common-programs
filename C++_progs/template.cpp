#include<iostream>
using namespace std;
template <typename T> T calcMax(T x, T y){
    T res=((x>y)?x:y);
    return res;
}
int main(){
    cout<<calcMax<int>(2,4)<<endl;
    cout<<calcMax<float>(2.9,3.5)<<endl;
    return 0;
}