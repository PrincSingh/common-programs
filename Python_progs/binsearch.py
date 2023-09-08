def binSearch(arr, l, h, item):
    mid=(l+h)//2
    if arr[mid]==item:
        return mid
    if item < arr[mid]:
        binSearch(arr,l,mid-1,item)
    elif item > arr[mid]:
        binSearch(arr,mid+1,h,item)
    else:
        return -1
#main function
#if __name__=="__main__":
arr=[1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20]
data=15 #int(input("Enter element to search: "))
i = binSearch(arr,0,20,data)
if i==-1:
    print("Element not found!")
else:
    print("Element found at index",i,"in the list")

