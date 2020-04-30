#include <iostream>

using namespace std;

int main()
{
   int no_students;
   cin>>no_students;
   cout<<(no_students*(no_students--))/2;
   return 0;
}