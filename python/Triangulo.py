import numpy as np
I = np.eye
A = np.array([1,0,0],[0,1,1],[0,0,3])
A.dot(I)
np.linalg.det(A)
A_inv = np.linalg.inv(A)
print A_inv
