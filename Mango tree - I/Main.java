#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int col, row, location;
  cin>>row>>col>>location;
  float ans1 = (float)location/(float)row, ans2 = (float)location/(float)col;
  
  //cout<<ans;
  if(location <= 5 && ans1 >= 0){
    cout<<"Yes";
    //cout<<float(location/y);
  }
  /*else if((ans2 <= float(col-1)) && (ans > float(col))){
    cout<<"It is a mango tree";
  }*/
  else if(location%col == 0){
      cout<<"Yes";
  }
  else if((location+col-1)%col == 0){
      cout<<"Yes";
  }
  else{
    //cout<<float(location/y);
    cout<<"No";
  }
}