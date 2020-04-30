#include <iostream>

using namespace std;

int main()
{
   //cout << "Hello World" << endl; 
   char door[5];
   int railing;
   cin>>door>>railing;
   if(door[0] == 'f'){
       (railing == 1)?cout<<"Left Handed":cout<<"Right Handed";
   }
   else{
       (railing == 1)?cout<<"Right Handed":cout<<"Left Handed";
   }
   return 0;
}
