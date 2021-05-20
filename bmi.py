# 체중과 신장을 입력받아서 BMI지수를 계산하는 프로그럄
# BMI지수 = 몸무게(kg)/(신장(m)*(신장(m))
# 산출된 값이 18.5 이하면 저체중,
# 18.5 ~ 23은 정상
# 23 ~ 25는 과체중
# 25 ~ 30은 비만
# 30이상은 고도비만으로 나누어진다.

weight = float(input("몸무게(kg)"))
height = float(input("키(m)"))
bmi = weight/(height/100*height/100)
print(bmi)