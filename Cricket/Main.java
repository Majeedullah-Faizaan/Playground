#include<iostream>
#include<cmath>
using namespace std;
int main()
{
  double a,b,c,d;
  double e,f,g,h,t,u;
  int s,v;
  std::cin>>a;
  std::cin>>b;
  std::cin>>c;
  std::cin>>d;
  e=a/6;
  std::cout<<e<<"\n";
  t=d/6.0;
  s=int(t);
  v=int(d);
  u=v%6;
  u=u*0.1;
  f=s+u;
  std::cout<<f<<"\n";
  g=c/f;
  printf("%.1f\n",g);
  //std::cout<<round(g)<<"\n";
  h=b/e;
    printf("%.1f\n",h);

  if(h<g){
    std::cout<<"Eligible to Win";
  }
  else{
    std::cout<<"Not Eligible to Win";
  }
}