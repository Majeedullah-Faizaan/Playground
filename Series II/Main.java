#include <iostream>

using namespace std;

int main()
{
  int n;
  cin>>n;
  int s=0;
  int k=11;
  int j=0;
  if(n==1)
  cout<<k*k<<" ";
  else
  {
      cout<<k*k<<" ";
      int i=1;
      while(i!=n)
      {
          j=k+4;
          s=j*j;
          cout<<s<<" ";
          k=j;
          i++;
      }
      
  }
}