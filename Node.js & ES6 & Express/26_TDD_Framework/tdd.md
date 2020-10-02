# TDD(Test Driven Development, 테스트 주도 개발)
- 반복 테스트를 이용한 소프트웨어 방법론
- 작은 단위의 테스트 케이스를 작성하고 이를 통과하는 코드를 추가하는 단계를 반복하여 구현

## MOCHA 
- Node.js뿐 아니라 프론트엔드 개발자를 위해 웹 브라우저상에서도 작동
- 풀 스택 개발에서 가장 많이 사용하는 TDD 프레임워크

## istanbul 
- Code coverage의 일종인 라이브러리
    - Code coverage : 테스트 수행 결과를 정량적인 수치로 나타내는 방법
- 라이브러리나 프레임워크 상에서 작성하는 코드, 브랜치, 함수 단위로도 테스트 가능
- Unit Test & 모듈별 확인 지표로 확인하기 좋음.
- 커멘드 라인 툴 제공, 웹 브라우저 상에서도 작동

## JEST : 프론트엔드 단에서 주로 사용되는 프레임워크
- 프론트엔드 단에서의 테스트를 도와줌

## Cypress
- EtoETest : End to End Test(UI 테스트)
- UI 테스트를 코드로서 자동화하여 테스트를 도와줌
- 실제 이벤트가 발생하는 것 처럼 시뮬레이팅하여 테스팅이 가능하다.


## 테스트의 중요성
- 오픈소스의 pull request시 새로운 기능이나 버그를 수정하는 것 이외에 
- 지금까지 개발된 기능들의 문제 없는 동작과 무결성의 보장이 필요.   
B기능이 A기능에 대한 의존성이 있을 때 다른 개발자가 A기능을 수정함으로서 오류가 날 수 있다.   
- Integration Test : 예측하지 못한 결과를 방지하기 위해 기존의 기능들과 잘 통합되는지를 검사하는 것   
test : 를 통한 commit은 매우 중요하다.