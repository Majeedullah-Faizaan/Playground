#include <iostream>
using namespace std;

int main()
{
   int num;
   float val = 0.5;
   cin>>num;
   for(int i=0;i<num;i++){
       cout<<val<<' ';
       val*=3.0;
   }
   return 0;
}