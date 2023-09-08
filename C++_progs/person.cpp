#include<iostream>
using namespace std;
class person{
    public:
        float height;
        float weight;
        person(float h, float w){
            height=h;
            weight=w;
        }
        void getheight(){
            cout<<height<<endl;
        }
        void getw(){
            getWeight();
        }
    private:
        void getWeight(){
            cout<<weight<<endl;
        }
    protected:
        void looseWeight(){
            cout<<"Congrats! you lose 5 kgs"<<endl;
        }
};
class male: public person{
    //derived class
    public:
        float p_size;
        male(float x,float y,float p):person(x,y){
            p_size=p;
        }
        using person::person;
        void getPSize(){
            cout<<p_size<<endl;
        }
        void lw(){
            looseWeight();
        }
};
class female: public person{
    public:
        float b_size;
        female(float x,float y,float b):person(x,y){
            b_size=b;
        }
        void getBSize(){
            cout<<b_size<<endl;
        }
        void lw(){
            looseWeight();
        }
};
int main()
{
    person a(5.3, 50.23);
    a.getw();
    a.getheight();
    male b(6.1,62.345,4.1);
    b.getw();
    b.getheight();
    b.lw();
    return 0;
}