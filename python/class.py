class Calculator: # class명 첫글자는 대문자
    def __init__(self): # __init__ 무조건 처음 실행되는 함수(생성자)
        self.result = 0

    def add(self, num):
        self.result += num
        return self.result
    
cal1 = Calculator()
cal2 = Calculator()

print(cal1.add(3))
print(cal1.add(4))
print(cal2.add(3))
print(cal2.add(7))