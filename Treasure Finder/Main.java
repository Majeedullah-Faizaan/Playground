#include<iostream>
using namespace std;
int main()
{
  int a,b,c,d,i;
  cin>>a;
  cin>>b;
  cin>>c;
  if(a>=b&&a>=c)
  {
    if(b>=c)
    {
      d=b;
    }
    else{
      d=c;
    }
  }
  else if(b>=a&&b>=c)
  {
    if(a>=c)
    {
      d=a;
    }
    else{
      d=c;
    }
  }
  else if(c>=a&&c>=b)
  {
    if(a>=b)
    {
      d=a;
    }
    else{
      d=b;
    }
  }
  cout<<"The treasure is in box which has number "<<d<<"\n";
  for(i=d;i>=1;i--)
  {
    if(a%i==0&&b%i==0&&c%i==0)
    {
     cout<<"The code to open the box is "<<i;
      break;
    }
  }
}