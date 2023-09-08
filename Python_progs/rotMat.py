M = [[1,2,3,4],[5,6,7,8],[9,10,11,12],[13,14,15,16]]
r=4
c=4
n=r-1
for i in range(r//2):
    for j in range(c//2):
        elem = M[i][j]
        for k in range(r-1,-1,-1):
            M[j][n%r]