#include <iostream>

using namespace std;

int printresult(int* vol_list, int n, int s){
	int culm_vol=0;
	for(int i=0;i<n;i++){
    	s-=vol_list[i];
    	//cout<<vol_list[i];
	}
	//cout<<"fn s: "<<s<<"\n";
	if(s<0){
    	return 0;
	}
	else{
    	return 1;
	}
}

int main() {
	int n,s,i;
	cin>>n>>s;
	//cout<<"n: "<<n<<"  s: "<<s<<"\n";
	int vol_list[n];
	for(i=0;i<n;i++){
    	cin>>vol_list[i];
	}
	//cout<<vol_list[0];
	printresult(vol_list,n,s)==1?cout<<"YES":cout<<"NO";
	return 0;
}
