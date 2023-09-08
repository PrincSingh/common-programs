M = [[1,2,3,4],[5,6,7,8],[9,10,11,12],[13,14,15,16]]
R=[[0 for j in range(4)] for i in range(4)]
for i in range(4-1,-1,-1):
    for j in range(4):
        R[j][3-i] = M[i][j]
print(R)