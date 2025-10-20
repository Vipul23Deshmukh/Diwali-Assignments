#include<iostream>
using namespace std;
int main(){
    int n,sum=0;
    cout<<"Enter the value of n"<<endl;
    cin>>n;

        for (int i = 1; i <= n; i++){
            sum += (2 * i - 1);
        }
    cout<<"Sum of First "<<n<<" ODD Numbers is "<<sum;
}