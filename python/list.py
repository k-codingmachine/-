a = [1,2,3]
b=a  # b =a[:]  주소를 공유하는것이 아닌 단순히 a복사
a[1] = 4
print(id(a)) # id는 주소값을 알아보는것
print(b)


