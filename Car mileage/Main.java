#include <iostream>
//#include <iomanip>

using namespace std;

int main()
{
   //cout << "Hello World" << endl; 
   float m;
   int l, d;
   cin>>m>>l>>d;
   (m*(float)l>=(float)d)?cout<<"Can reach":cout<<"Cannot reach";
}