
def find(prefix, suffix):
    # Write your code here.
    global PRE_SUF_SEARCH
    res = ""
    for word in PRE_SUF_SEARCH:
        if word[:len(prefix)+1]==prefix and word[len(word)-len(suffix):]==suffix:
            res = word
    if res=="":
        return -1
    ind = -1
    for i in range(len(PRE_SUF_SEARCH)):
        if PRE_SUF_SEARCH[i]==res:
            ind = i
    return ind

PRE_SUF_SEARCH = list(map(str, input().split()))
print(find("ca", "t"))