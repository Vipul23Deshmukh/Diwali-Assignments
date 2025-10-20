#include<iostream>
using namespace std;

int rev(int n){
    int sum=n;
    int rev=0;
    while (n != 0) {
        int rem = n % 10;      
        rev = rev * 10 + rem; 
        n = n / 10;           
    }
    return rev;
}
int main(){
    int n;
    cout<<"Enter the NUmber to check Paliindrome"<<endl;
    cin>>n;
    cout<<"Reverse is"<<rev(n);
}