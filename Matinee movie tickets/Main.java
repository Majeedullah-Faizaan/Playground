#include<iostream>
//#include <iomanip>

using namespace std;
int main()
{
  //Type your code here.
  int age;
  float t;
  cin>>age>>t;
  //cout<<t<<'\n';
  if(age>=13){
    //cout << std::fixed;
    //cout << std::setprecision(2);
    (t == (float)13.3)?cout<<"$5.00":cout<<"$8.00";
  }
  else
    (t == (float)13.3)?cout<<"$2.00":cout<<"$4.00";
  return 0;
}