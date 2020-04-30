#include <iostream>

using namespace std;

int main() {
    int r,c,i,j,count=0;
    cin>>r>>c;
    int matrix[r][c];
    int largest[c];
    for(i=0;i<r;i++){
        for(j=0;j<c;j++){
            cin>>matrix[i][j];
            if(j==0 && i==0){
                count=matrix[i][j];
            }
            else{
                if(count>=matrix[i][j]){
                    continue;
                }
                else{
                    count=matrix[i][j];
                }
            }
            //cout<<matrix[i][j]<<'\n';
        }
    }
    cout<<"The maximum element is " <<count;
}