#include <iostream>
#include <cstdlib>
int count=0, x,y;
int main()
{
	std::cin>>x;
	std::cin>>y;
	int xd = abs(x-3),yd = abs(y-4);
	int total = xd + yd, dis;
	if(xd<yd){
		dis = total-xd;
		std::cout<<dis;
	}
	else{
		dis = total-yd;
		std::cout<<dis;
	}
	return 0;
}