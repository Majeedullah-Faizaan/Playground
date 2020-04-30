#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int p,i,r;
  float ia, da, sa, ta;   // ia= intreset amount; da= discount amount; sa= settlement amout
cin>>p;
  cin>>i;
  cin>>r;
  ia=(i*p*r)/100;
  ta=p+ia;
  da=0.02*ia;
  sa=ta-da;
  cout<<ia<<'\n';
  cout<<ta<<'\n';
  cout<<da<<'\n';
  cout<<sa;
  return 0;
}