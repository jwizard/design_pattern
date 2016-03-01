# Visitor Pattern

## 개요
- 알고리즘을 객체 구조에서 분리시키는 디자인 패턴, 이렇게 분리를 하면 구조를 수정하지 않고 실질적으로 새로운 동작을 기존의 객체 구조에 추가할 수 있게 됨
- 개방폐쇄 원칙을 적용하는 방법
- 개방-폐쇄 원칙(OCP, Open-Closed Principle)은 '소프트웨어 개체(클래스, 모듈, 함수 등등)는 확장에 대해 열려 있어야 하고, 수정에 대해서는 닫혀 있어야 한다.'는 프로그래밍 원칙

## Class Diagram
![Visitor Pattern](https://upload.wikimedia.org/wikipedia/commons/thumb/5/59/VisitorPatternUML.png/660px-VisitorPatternUML.png)

## 사용처
- 상속 없이 클래스에 메서드를 효과적으로 추가하기 위해 사용
- 데이터 구조를 돌아다니며 처리하는 구조 (print/do)


## 장점
- 생각하지 못했던 연산을 쉽게 추가 가능
- 드물게 사용되는 연산을 외부에 정의할 수 있어서 클래스가 작아짐


## 단점
- 객체의 내부 구조가 visitor에 의해 열리게 되는 캡슐화 위반의 단점

## References
- https://ko.wikipedia.org/wiki/%EB%B9%84%EC%A7%80%ED%84%B0_%ED%8C%A8%ED%84%B4
- http://www.tutorialspoint.com/design_pattern/visitor_pattern.htm
- http://zetawiki.com/wiki/Visitor_%ED%8C%A8%ED%84%B4



```
Visiting front left wheel
Visiting front right wheel
Visiting back left wheel
Visiting back right wheel
Visiting body
Visiting engine
Visiting car
Kicking my front left wheel
Kicking my front right wheel
Kicking my back left wheel
Kicking my back right wheel
Moving my body
Starting my engine
Starting my car
```

