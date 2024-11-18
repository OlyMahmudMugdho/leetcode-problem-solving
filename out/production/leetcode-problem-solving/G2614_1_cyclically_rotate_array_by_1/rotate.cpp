#include <iostream>
using namespace std;

void rotate(int arr[], int n)
{
    int newArray[n];
    int lastElement = arr[n-1];
    newArray[0] = lastElement;

    for (int i = 1; i <= n - 1; i++)
    {
        newArray[i] = arr[i-1];
    }
    int count = 0;
    for (int i = 0; i < n; i++)
    {
        if (count < n)
        {
            cout << newArray[i] << " ";
            count++;
        }
        
    }

    cout << endl;
    
    
}

int main(){
    int arr[5] = {1, 2, 3, 4, 5};
    rotate(arr,5);
}