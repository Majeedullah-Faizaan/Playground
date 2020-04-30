#include<iostream>
using namespace std;
int main()
{
 int n;
  int i=1;
  int s=0;
 cin>>n;
  while(i!=(n+1)){
    if(i%2!=0)
    {
      s=i*i-1;
      cout<<s<<" ";
    }
    else{
      s=i*i-2;
      cout<<s<<" ";
    }
    i++;
  }
}