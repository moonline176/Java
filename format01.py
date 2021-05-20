#format함수 연습
money = 5000
print("{0:,} 만원".format(money)) #콤마
print("{0:010,d} 만원".format(money)) #10자리로 출력
print("{0:+d} 만원".format(money)) #부호를 붙여서 출력
print("{0:08d} 만원".format(money)) #8자리로 출력 빈자리는 0을 채움

print("메뉴판")
print("----------------------"*2)
print( "{0:*^30} 메뉴는 {1} 입니다".format("김치찌개", 4000) )
print( "{0:*^30} 메뉴는 {1} 입니다".format("비빔밥", 5500) )
print( "%30s 메뉴는 %d 입니다"%("돌솥밥", 6000) )


avg1 = 89.27
avg2 = 90.2 
print("성적")
print("----------------------"*2)
print("평균1 ={0:6.1f}  평균2 ={1:6.1f}".format(avg1, avg2)) #6자리 소숫점 한자리
print(("평균1 =%6.1f  평균2 =%6.1f")%(avg1, avg2))