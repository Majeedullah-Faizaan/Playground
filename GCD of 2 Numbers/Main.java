#include <iostream>

using namespace std;
int GCD(int a, int b){
    if(a<b){
        for(int i=a;i>0;i--){
            if(a%i==0 && b%i==0){
                return i;
            }
        }
        return 1;
    }
    else if(b<a){
        for(int i=b;i>0;i--){
            if(a%i==0 && b%i==0){
                return i;
            }
        }
        return 1;
    }
    else{
        return a;
    }
}

int main() {
    int num1, num2;
    cin>>num1>>num2;
    cout<<"G.C.D of "<<num1<<" and "<<num2<<" = "<<GCD(num1, num2);
}