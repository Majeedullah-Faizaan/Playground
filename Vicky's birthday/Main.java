#include <iostream>
using namespace std;
int main() {
   int x;
  cin>>x;
   if (x % 4 == 0) {
      if (x % 100 == 0) {
         if (x % 400 == 0)
            cout << "Vicky can celebrate his birthday.";
         else
            cout << "Vicky can't celebrate.";
      } else
         cout << "Vicky can celebrate his birthday.";
   } else
      cout << "Vicky can't celebrate.";
   return 0;
}