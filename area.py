#area.py
# 반지름을 입력받아서 면적을 계산하는 프로그램
import math
radius = float(input("반지름(cm)"))
# pi = 3.14159265359   
area = math.pi*(radius**2)
print("면적은", area,"cm^2") 
