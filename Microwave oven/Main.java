/*#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int i;
  float t;
  cin>>i>>t;
  if(i<=3)
    (i==1)?cout<<t:cout<<(t+(t*0.5*(i-1)));
}*/
#include<iostream>
#include <iomanip>

using namespace std;
int main()
{
  //Type your code here.
  int i;
  float t;
  cin>>i>>t;
  if(i<=3){
    cout << std::fixed;
    cout << std::setprecision(2);
    (i==1)?cout<<t:cout<<(t+(t*0.5*((float)i-1.0)));
  }
  else
    cout<<"Number of items is more";
  return 0;
}