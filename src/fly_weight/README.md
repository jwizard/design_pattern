# Holub on Patterns

## Flyweight pattern
1. 동일하거나 유사한 객체들 사이에 가능한 많은 데이터를 서로 공유하여 사용하도록 하여 메모리 사용량을 최소화하는 소프트웨어 디자인 패턴. 종종 오브젝트의 일부 상태 정보는 공유될 수 있는데, 플라이웨이트 패턴에서는 이와 같은 상태 정보를 외부 자료 구조에 저장하여 플라이웨이트 오브젝트가 잠깐 동안 사용할 수 있도록 전달
1. 동일한 것을 공유해서 객체 생성을 줄여 가볍게 만드는 것. 클래스 별로 factory pattern을 사용하고 그 factory에서는 자신이 찍어내는 객체들을 관리. 이미 가지고 있는 객체에 대한 요청이 들어왔을 때는 관리하고 있던 객체를 던져주고, 가지고 있지 않은 것을 요청하면 새로 객체를 만들어 관리 리스트에 추가시키고 던져주는 것이 핵심

## 장점
 - 메모리 사용량을 최소화 함

## 단점
 - 공유 가능한, immutable 값에는 유용하나 공유 불가능한 객체에는 사용불가

## 준비
1. 발표자료
2. 클래스다이어그램 + 예제코드

## References
 - https://ko.wikipedia.org/wiki/플라이웨이트_패턴
 - https://en.wikipedia.org/wiki/Flyweight_pattern#Example_in_Java
 - http://copynull.tistory.com/137
 - http://egloos.zum.com/iilii/v/4066794