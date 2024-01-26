s1 = set([1,2,3,4,5,6])
s2 = set([4,5,6,7,8,9])
print(s1.intersection(s2)) # 교집합
print(s1 & s2) # 교집합
print(s1 | s2) # 합집합
print(s2.difference(s1)) #차집합