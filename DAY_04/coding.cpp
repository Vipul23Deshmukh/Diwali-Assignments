#include <iostream>
using namespace std;

int main() {
    int n;
    cout << "Enter n: ";
    cin >> n;

    int arr[n];
    cout << "Enter " << n << " elements (from 0 to " << n << " with one missing): ";
    for (int i = 0; i < n; i++) {
        cin >> arr[i];
    }

    int expectedSum = n * (n + 1) / 2;

    int actualSum = 0;
    for (int i = 0; i < n; i++) {
        actualSum += arr[i];
    }

    int missingNumber = expectedSum - actualSum;

    cout << "Missing Number = " << missingNumber << endl;

    return 0;
}
