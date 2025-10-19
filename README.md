# Assignments-d

Q1

#include <iostream>
using namespace std;

int main() {
    int n;
    cout << "Enter a number: ";
    cin >> n;

    bool isPrime = true;

    if (n <= 1)
        isPrime = false;
    else {
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
    }

    if (isPrime)
        cout << n << " is a Prime number." << endl;
    else
        cout << n << " is not a Prime number." << endl;

    return 0;
}


Q2
#include <iostream>
using namespace std;

bool isPrime(int num) {
    if (num <= 1) return false;
    for (int i = 2; i * i <= num; i++) {
        if (num % i == 0)
            return false;
    }
    return true;
}

int main() {
    int n;
    cout << "Enter a number: ";
    cin >> n;

    cout << "Prime numbers up to " << n << " are: ";
    for (int i = 2; i <= n; i++) {
        if (isPrime(i))
            cout << i << " ";
    }

    cout << endl;
    return 0;
}

Q3
#include <iostream>
using namespace std;

int main() {
    int n;
    cout << "Enter a number: ";
    cin >> n;

    long long fact = 1;

    for (int i = 1; i <= n; i++) {
        fact *= i;
    }

    cout << "Factorial of " << n << " = " << fact << endl;
    return 0;




}



Q4

#include <iostream>
using namespace std;

int main() {
    int n;
    cout << "Enter number of terms: ";
    cin >> n;

    int a = 0, b = 1, next;

    cout << "Fibonacci Series: ";
    for (int i = 1; i <= n; i++) {
        cout << a << " ";
        next = a + b;
        a = b;
        b = next;
    }

    cout << endl;
    return 0;
}




Q5

#include <iostream>
using namespace std;

int main() {
    int n;
    cout << "Enter a number: ";
    cin >> n;

    if (n % 2 == 0)
        cout << n << " is Even." << endl;
    else
        cout << n << " is Odd." << endl;

    return 0;
}

Q.Find the length of the longest string in an array


#include <iostream>
#include <string>
using namespace std;

int main() {
    int n;
    cout << "Enter number of strings: ";
    cin >> n;

    string arr[n];
    cout << "Enter " << n << " strings:" << endl;
    for (int i = 0; i < n; i++) {
        cin >> arr[i];
    }

    int maxLength = 0;
    string longestWord = "";

    for (int i = 0; i < n; i++) {
        int len = arr[i].length();
        if (len > maxLength) {
            maxLength = len;
            longestWord = arr[i];
        }
    }

    cout << "Longest string: " << longestWord << endl;
    cout << "Length of longest string: " << maxLength << endl;

    return 0;
}



Q2
