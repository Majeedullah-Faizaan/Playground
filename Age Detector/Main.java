#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int b,c;
  cin>>b>>c;
  (b>=0&&b<c)?cout<<c-b:cout<<100-b+c;
}