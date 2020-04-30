#include <iostream>

using namespace std;

int type_array(int n,int* arr){
    int ret=0;
    for(int i=0;i<n;i++){
        (arr[i]%2==0)?ret++:ret--;
    }
    //cout<<ret;
    if(ret==n)
    return 1;
    else if(ret==-n)
    return 2;
    else
    return 3;
}

int main() {
    int n;
    cout<<"Enter the number of elements in the array\n";
    cin>>n;
    int arr[n];
    cout<<"Enter the elements in the array\n";
    for(int i=0;i<n;i++){
        cin>>arr[i];
    }
    switch(type_array(n,arr)){
        case 1:
        cout<<"The array is Even";
        break;
        case 2:
        cout<<"The array is Odd";
        break;
        default:
        cout<<"The array is Mixed";
        break;
    }
}