#include <iostream>
#include <cmath>

using namespace std;

int main() {
	int n,i,sum_eve=0,sum_odd=0;
	cin>>n;
	int ints[n];
	for(i=0;i<n;i++){
    	cin>>ints[i];
	}
	for(i=0;i<n;i++){
    	abs(ints[i])%2==0?sum_eve+=ints[i]:sum_odd+=ints[i];
	}
	cout<<"The sum of the even numbers in the array is "<<sum_eve<<'\n';
	cout<<"The sum of the odd numbers in the array is "<<sum_odd<<'\n';
	return 0;
}
