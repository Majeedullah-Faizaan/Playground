#include <iostream>
using namespace std;

int main()
{
    int a,n,ans = 1, i;
    cout<<"Enter the value of a\n";
    cin>>a;
    cout<<"Enter the value of n\n";
    cin>>n;
    for(i=0;i<n;i++){
        ans*=a;
    }
    cout<<"The value of "<<a<<" power "<<n<<" is "<<ans;
    return 0;
}