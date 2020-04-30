#include <iostream>

using namespace std;

int main() {
    int num,i,temp,val,val_loc;
    int eli[20];
    cout<<"Enter the number of elements in the array\n";
    cin>>num;
    cout<<"Enter the elements in the array\n";
    for(i=0;i<num;i++){
        cin>>eli[i];
    }
    cout<<"Enter the location where you wish to insert an element\n";
    cin>>val_loc>>val;
    if(val_loc>num){
        cout<<"Invalid Input";
        return 0;
    }
    cout<<"Enter the value to insert\n";
    for(i=num-1;i>=val_loc-1;i--){
        temp = eli[i];
        eli[i+1] = temp;
        if(i==val_loc-1){
            eli[i] = val;
        }
    }
    cout<<"Array after insertion is\n";
    for(i=0;i<=num;i++){
        cout<<eli[i]<<'\n';
    }
}