# 자동차 경주 게임
## 진행 방법
* 자동차 경주 게임 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 코드 리뷰 요청을 한다.
* 코드 리뷰 피드백에 대한 개선 작업을 하고 다시 PUSH한다.
* 모든 피드백을 완료하면 다음 단계를 도전하고 앞의 과정을 반복한다.

## 온라인 코드 리뷰 과정
* [텍스트와 이미지로 살펴보는 온라인 코드 리뷰 과정](https://github.com/next-step/nextstep-docs/tree/master/codereview)

## 문자열 계산기  

### 객체 도출

* StringCalculator: 문자열 계산기
    * 입력받은 문자열 및 Operator에 따라 계산을 수행한다.
* Operator: 수식 기호 (Enum)
    * 수식 기호에 맞게 계산 수행 로직을 갖는다.

## 자동차 경주

### 기능 목록
* 0에서 9사이의 랜덤 숫자를 구한다.  
* 랜덤 숫자가 4 이상일 경우 True를 반환하고, 전진한다.

### 객체 도출  
* RacingGame: 게임 객체
  * 입력받은 시도 횟수, 자동차 객체의 목록, 자동차가 움직이는 룰 규칙 정보를 갖는다.  
* Car: 자동차 객체  
  * 차 번호(순서), 움직인 거리, 차 이름에 대한 정보를 갖는다.
  * 전진 여부를 입력받아 전진하거나 멈추는 책임을 갖는다.
  * 매 Round 별 움직임을 저장하는 History 정보도 필요하다.  
* RandomNumberGenerator: 유틸성 객체  
  * 랜덤 숫자를 생성하는 역할을 한다.
* Round: 매 라운드 정보를 담는 객체  
  * 매 라운드 정보를 담아 Car가 갖는다.
  * Round Time과 움직인 거리 정보를 갖는다.  
* MoveRule: 게임에서 움직일 규칙 객체  
  * carMove 여부를 결정해주는 규칙을 갖는다.  
  * 게임의 룰이 변경될 경우를 고려하여 interface 형태로 구현한다.  
* RandomMoveRule: MoveRule의 콘크리트 객체  
  * 주어진대로 랜덤 수에 따라 움직임을 결정한다.  
  * MoveRule을 구현한다.
* Cars: Car의 목록을 관리하는 객체
  * Car 목록 중 우승자 목록을 반환하는 책임을 갖는다.