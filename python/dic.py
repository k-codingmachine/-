dic = {'name' : 'Eric', 'age' : 15}

print(dic['name'])

a = {1 : 'a', 2: 'a'} # key값이 겹치면 안된다.(중복x)

print(a)
print(a.keys())
print(a.values())

print(a.get(4, '없음')) # 4라는 값이 없을때 오류말고 없음이라는 문자를 띄어라

print(4 in a) 

