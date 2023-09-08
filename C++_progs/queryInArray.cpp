#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;

int main() {
    int n1, n2;
    cout<<"enter the number of elements in a[] and query, q:";
    cin>>n1>>n2;
    int** arr = new int*[n1];
    for (int i = 0; i < n1; i++){
        int n;
        cout<<"enter k";
        cin>>n;
        arr[i] = new int[n];
        cout<<"enter array elements:";
        for (int j = 0; j < n; j++){
            cin>>arr[i][j];
        }
    }
    int queries[2][n2];
    cout<<"enter queries";
    for (int i = 0; i < n2; i++){
        cin>>queries[0][i]>>queries[1][i];
    }
    cout<<"**********output***************\n";
    for (int i = 0; i < n2; i++){
        cout<<arr[queries[0][i]][queries[1][i]]<<endl;
    }
    return 0;
}
