#include <iostream>
using namespace std;

int main()
{
   int num, count =0;
   cin>>num;
   cout<<num<<'\n';
while(num!=1)
{
    if(num%2 == 0){
        num = num/2;
        count++;
        cout<<num<<'\n';
    }
    else{
        num = (3*num)+1;
        count++;
        cout<<num<<'\n';
    }
//(num%0 == 0)?cout<<num/2<<'\n':cout<<(3*num)+1<<'\n';
}
cout<<count++;
   return 0;
}