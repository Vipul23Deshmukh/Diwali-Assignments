#include<iostream>
using namespace std;

bool ispalindrome(int n){
    int sum=n;
    int rev=0;
    while (n != 0) {
        int rem = n % 10;     
        rev = rev * 10 + rem;  
        n = n / 10;           
    }
    if(rev==sum){
        return true;
    }
    else{
        return false;
    }
}
int main(){
    int n;
    cout<<"Enter the NUmber to check Paliindrome"<<endl;
    cin>>n;
    if(ispalindrome(n)){
        cout<<"Number is Palindrome"<<endl;
    }
    else{
        cout<<"Number is not palindrome"<<endl;
    }
}