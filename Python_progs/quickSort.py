def quicksort(array,l,u):
    if l==u or array==[]:
        return
    pivot = u
    q = l
    while pivot>q:
        if array[pivot] <= array[q]:
            if pivot>q+1:
                temp = array[pivot-1]
                array[pivot-1] = array[pivot] 
                array[pivot] = array[q]
                array[q] = temp
                pivot-=1
            else:
                temp = array[q]
                array[q] = array[pivot]
                array[pivot] = temp
                pivot-=1
        else:
            q+=1

    quicksort(array,l,pivot-1)
    print(pivot)
    quicksort(array,pivot+1,u)
    print("array = ",array)

    return array

test = [21, 4, 1, 3, 9, 20, 25, 6, 21, 14]
print(quicksort(test,0,len(test)-1))