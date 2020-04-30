#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n;
  int k=11;
  int p=0;
  int s=0;
  cin>>n;
  if(n==1){
    s=k*k;
    cout<<s<<" ";
  }
  else{
    cout<<k*k<<" ";
    int i=1;
    while(i!=n)
    {
      p=k+4;
      s=p*p;
      cout<<s<<" ";
      k=p;
      i++;
    }
  }
}