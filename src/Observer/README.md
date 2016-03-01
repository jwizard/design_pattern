# Observer pattern(발생/구독 모델)

## 개요
 - 객체의 상태 변화를 관찰하는 관찰자들 즉, 옵저버들의 목록을 객체에 등록하여 상태 변화가 있을 때마다 메서드 등을 통해 객체가 직접 목록의 각 옵저버에게 통지하도록 하는 디자인 패턴
- 런타임에 객체가 상태를 변화시킬 때 자신을 등록한 다른 객체들에 통지함
- 한 객체의 상태가 바뀌면 그 객체에 의존하는 다른 객체들한테 연락이 자동으로 전달됨

## Class Diagram
![Observer Patter](https://upload.wikimedia.org/wikipedia/commons/thumb/8/8d/Observer.svg/1708px-Observer.svg.png)

## java class
1. Observer
	- interface, update()
2. Observable
	- class, onClick시 notifyObservers()

## 장점
- 서비시스템을 분리, 서브시스템의 클래스가 서로에 대해 아무 것도 알 필요가 없음. 이는 코드의 재사용성을 향상시키고, 상호간의 결합도를 낮춤.

## 단점
- 구독자가 구독을 취소하는 동안 발생한 이벤트에 대해 통지를 받지 않는 다는 보장이 없음.
- 메모리 누수
	1. 구독자가 더 이상 적절치 않을 때 출판자에게 통지하는 방버비 없으며 명시적으로 구독을 취소하는 것도 잊기 쉬움
	1. 허상참조로 인한 메모리 누수의 가능ㅇ성
	2. 단 하나의 참조가 Subject에 의한 것이라면 가비지 컬렉션 되지 않음.

## 그외 논의사항
1. 순환실행을 막는 매커니즘 필요
	- 이벤트 A와 이벤트B가 서로를 변경시키는 경우
1. 내장 옵저버 클래스
	- setChanged()를 사용하여 옵저버 메서드를 갱신(protected)
	- 객체 생성자 관련 옵저버를 처리하기 위한 자료구조 만들 필요 없음
	- 서브 클래스만 만들면 되나, java는 다중상속이 되지 않으므로 다른 클래스를 상속 받고 있을 경우 제약이 따름


## 대표적 사례
 - 이벤트 기반 프로그래밍

## References
 - http://warmz.tistory.com/entry/Observer-Pattern-%EC%98%B5%EC%A0%80%EB%B2%84-%ED%8C%A8%ED%84%B4
 - https://ko.wikipedia.org/wiki/%EC%98%B5%EC%84%9C%EB%B2%84_%ED%8C%A8%ED%84%B4