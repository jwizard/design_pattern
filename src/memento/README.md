# Memento Pattern
 - 기념품, 유품, 추억거리
 - 분류 : Behavioral Pattern
 - 객체의 이전 상태를 저장하는 기능을 제공하는 패턴

## Class diagram
![class diagram](http://www.tutorialspoint.com/design_pattern/images/memento_pattern_uml_diagram.jpg)

## Role
1. Originator
 - 저장하고자 하는 상태를 갖는 객체
2. Memento
 - Originator의 상태를 저장하는 또다른 객체
3. Caretaker
 - 상태를 저장하는 타이밍을 관리하고 Memento를 저장하는 역할을 갖는 객체


## 장점
1. 어떤 시점의 인스턴스의 상태를 확실하게 기록해서 저장한 뒤, 나중에 그 상태로 정확히 복구가 필요한 상황에 유용
2. 프로그램의 유지 보수성을 해치지 않으면서 외부로 객체의 상태를 저장할 수 있도록 함
3. Caretaker 객체가 자신이 알지 못하는 객체의 상태를 저장할 수  있도록 함.

## 단점
1. 지속적으로 저장되어 있다면 버전 문제가 발생 할 수 있음
2. 깊은 복사 (deep copy)는 자신이 가지고 있는 레퍼런스 객체 뿐 아니라 레퍼런스 객체가 가지고 있는 레퍼런스 객체까지 재귀적으로 복사해야 하므로 개발이 어렵고 비용도 크며, shallow copy는 메모리 누출을 유발하며 레퍼런스 객체의 값이 변경될 수도 있음
3. Caretaker는 Memento가 얼마나 많은 상태를 갖는지 알 수 없기 때문에 효과적인 메모리 관리에 어려움이 있음

## 특징
1. Originator는 Memento의 state를 건드리지 않고 internal data 구조에 저장하여 Memento의 캡슐화를 구현
2. 기존 객체 정보를 건드리지 않고 새로운 메멘토 클래스에 정보를 옮겨 놓아 기존 클래스 객체 정보를 보호
3. Originator 객체는 기존 객체 정보보다 적어도 같거나 적은 정보를 지니고 있음 (사용되는 정보만 가져올 수 있도록)

## 사용 예
1. 텍스트 에디터의 undo 기능
2. 게임의 로그아웃 또는 아이템 뽑기시 저장
3. 바둑, 장기 등 기보 되돌리기
4. 스냅샷 저장

## References
- https://en.wikipedia.org/wiki/Memento_pattern (wikipedia)
- http://www.tutorialspoint.com/design_pattern/memento_pattern.htm (template.tutorialpoint)