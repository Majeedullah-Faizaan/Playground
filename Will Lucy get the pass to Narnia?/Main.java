#include<iostream>
int main(){
  std::cout<<"Enter first number : Enter second number : Menu\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Remainder\n";
  int x, y, op;
  std::cin>>x>>y>>op;
  switch(op){
    default:
      std::cout<<"Invalid operation";
      break;
    case 1:
      std::cout<<(x+y);
      break;
    case 2:
       std::cout<<(x-y);
      break;
        case 3:
       std::cout<<(x*y);
      break;
        case 4:
       std::cout<<(x/y);
      break;
        case 5:
       std::cout<<(x%y);
      break;
  }
  return 0;
}
      