#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int x, y, location;
  cin>>y>>x>>location;
  float ans = (float)location/(float)y;
  //cout<<ans;
  if(ans <= 2.0 && ans > 1.0){
    cout<<"It is a mango tree";
    //cout<<float(location/y);
  }
  else if((ans <= float(y-1)) && (ans > float(y-2))){
    cout<<"It is a mango tree";
  }
  else{
    //cout<<float(location/y);
    cout<<"It is not a mango tree";
  }
}