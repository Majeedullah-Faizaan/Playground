#include <iostream>

using namespace std;

int main()
{
   int n,i;
   cin>>n;
   for(i=1;i<=4;i++)
   {   int k=0;
       int j=1;
       while(j!=i+1)
       {
           k=n+(i-1);
           cout<<k;
           j++;
       }
       cout<<"\n";
   }   
   for(i=4;i>=1;i--)
   {   int k=0;
       int j=1;
       while(j!=i+1)
       {
           k=n+(i-1);
           cout<<k;
           j++;
       }
       cout<<"\n";
   }
   
   return 0;
}