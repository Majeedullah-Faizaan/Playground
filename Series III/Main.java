#include <iostream>
using namespace std;

int main()
{
   int num;
   int val = 6, inc = 5;
   cin>>num;
   for(int i=0;i<num;i++){
       cout<<val<<' ';
       val+=inc;
       inc+=5;
   }
   return 0;
}