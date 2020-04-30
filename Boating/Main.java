#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int total_w, adults, childern, cal = 0;
  cin>>total_w>>adults>>childern;
  if(total_w<=((adults*75)+(childern*30))){
    cout<<"Boat will drow";
  }
  else{
    cout<<"Boat is stable";
  }
  return 0;
}