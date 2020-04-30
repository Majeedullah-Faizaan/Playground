#include <iostream>
//#include <cmath>
using namespace std;

bool Harshad(int num){
    //cout<<num;
    int sum=0, og_num = num;
    while(num){
        sum+=num%10;
        num = num/10;
    }
    if(og_num%sum == 0){
        return true;
    }
    else{
        return false;
    }
}

int main()
{
int num;
cin>>num;
Harshad(num)?cout<<"Harshad Number":cout<<"Not Harshad Number";
}