#include <iostream>
#include <cmath> 
using namespace std;

int main() {
    int n, original, rem, sum = 0;
    cout << "Enter a number: ";
    cin >> n;

    original = n;

    int digits = 0;
    int temp = n;
    while (temp != 0) {
        digits++;
        temp /= 10;
    }

    temp = n;
    while (temp != 0) {
        rem = temp % 10;
        sum += pow(rem, digits);
        temp /= 10;
    }

    if (sum == original)
        cout << "True (Armstrong number)";
    else
        cout << "False (Not an Armstrong number)";

    return 0;
}
