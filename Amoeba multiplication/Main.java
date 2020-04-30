#include <iostream>
using namespace std;


int main()
{
   int i = 0, temp = 0, month, ans = 1;
   cin>>month;
while(month!=2)
{
    i = ans;
    ans = temp + ans;
    temp = i;
    month--;
    //cout<<ans<<'\n';
}
cout<<ans;
   return 0;
}