#include <iostream>
using namespace std;

int main()
{
    int a , b ,n ,m , temp;
    cin>>n>>m;
    cout << "Before swapping" << " a= " << n << " and b=" << m ;
   // cout << "a = " << n << "and b = " << m << endl;

    temp = a;
    a = b;
    b = temp;

    cout << "\nAfter swapping" << " a= " << m << " and b=" << n ;
    //cout << "a = " << a << ", b = " << b << endl;

    return 0;
}