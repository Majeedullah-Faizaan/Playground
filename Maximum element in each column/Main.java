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
            //cout<<matrix[i][j]<<'\n';
        }
    }
    for(i=0;i<c;i++){
        for(j=0;j<r;j++){
            if(j==0){
                count=matrix[j][i];
            }
            else{
                if(count>=matrix[j][i]){
                    continue;
                }
                else{
                    count=matrix[j][i];
                }
            }
        }
        cout<<count<<'\n';
    }
}