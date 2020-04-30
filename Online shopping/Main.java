#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int fa,fd,fs,sa,sd,ss,aa,ad,as,fp,sp,ap;
  cin>>fa>>fd>>fs>>sa>>sd>>ss>>aa>>ad>>as;
  fp= (100-fd)*(fa/100)+fs;
  sp= (100-sd)*(sa/100)+ss;
  ap= (100-ad)*(aa/100)+as;
  cout<<"In Flipkart Rs."<< fp<<'\n'<<"In Snapdeal Rs."<< sp<<'\n'<<"In Amazon Rs."<< ap<<'\n';
    if(fp <= sp && fp < ap)
    cout<<"He will prefer Flipkart";
else if(sp < fp && sp < ap)
    cout<<"He will prefer Snapdeal";
else if(ap < fp && ap < sp)
    cout<<"He will prefer Amazon";
}