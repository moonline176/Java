#calc.py 백준 10869번
# 두 수를 입력받아서 사칙연산하는 프로그램
# 두 자연수 A와 B가 주어진다. 이때, A+B, A-B, A*B, A/B(몫), A%B(나머지)를 출력하는 프로그램을 작성하시오. 
num1, num2 = map(int, input("두 수 입력").split())
print(num1+num2)
print(num1-num2)
print(num1*num2)
print(num1//num2)
print(num1%num2)

