# Spring Boot 

### 전문 (Full Text) 
서로 주고 받을 데이터의 포맷을 약속(프로토콜)한 후 약속된 데이터 패킷을 전송하고 수신하는 것을 말한다.<br/>
전문 통신에서 가장 중요한 것은 <b>데이터의 포맷과 길이</b>이다.


- 문자와 숫자를 구별하여 공백(화이트스페이스)과 0  둘 중 하나로 데이터의 길이만큼 설정하는지가 중요하다. 

<b>예를들어</b> <br/>
총 길이가 8인 전문 통신을 한다고 가정할 때 <br/>
0 ~ 3 길이까지는  사용자 아이디로 <br/>
4 ~ 7 길이까지는  금액이라고 데이터 포맷을 설정한다. <br/>

사용자 아이디는 A, 금액은 10원이라고 할 때 <br/>
‘A   0010A’ 라는 전문을 보내게 된다.  <br/>
‘A   ’에서 사용자 아이디 A뒤에 공백3개, ‘0010’은 10원앞에 0이 2개가 채워지는 것이다.<br/>

<b>문자일 경우 공백으로, 숫자일 경우 0으로 데이터 포맷을 만들게 된다. </b><br/>


### Technique
- Annotation : Fiexed String(value, type) 문자열 길이와 타입 표시
- Enum : 데이터의 타입 정의 (NUMERIC, ALPHABET)
- Factory : Message Model 생성
- Parser : Full Text 생성


hotire blog : https://blog.naver.com/gngh0101