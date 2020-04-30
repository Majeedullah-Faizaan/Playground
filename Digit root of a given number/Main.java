#include <iostream>

using namespace std;
int ana(int num){
    int a=num,sum = num%10;
    if(num>=10){
        while(a>10){
            a-=a%10;
            a/=10;
            sum+=a%10;
        }
        return ana(sum);
    }
    else{
        return num;
    }
    //return ana(sum);
    //return ana(a+b);
}
int main() {
    int num;
    cin>>num;
    cout<<ana(num);
}