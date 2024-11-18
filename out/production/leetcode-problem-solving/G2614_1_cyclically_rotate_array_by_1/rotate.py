def rotate( arr, n):
    lastElement = arr[n-1]
    newArray = []
    newArray[0] = lastElement
    i = 0
    while(i < n):
        if(i == 0) {
            newArray[i] = lastElement
        }
        i+=1

    print(newArray)


arr = [1, 2, 3, 4, 5]
rotate(arr,5)