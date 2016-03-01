# Template Method Pattern

## 개요
- 상위 클래스에 템플릿에 해당하는 메소드가 정의되어 있고 그 메소드의 정의 안에는 추상메서드가 있음
상위 클래스의 프로그램만 보면 추상 메서드를 어떻게 호출하고 있는 지 알 수 있지만 최종적으로 어떤 처리가 수행되는지는 알 수 없음
- concreteClass에서 메서드를 구현하면 구체적인 처리가 결정됨
- 서로 다른 하위 클래스가 서로 다른 구현을 실행하면 서로 다른 처리가 실행됨 그러나 어떤 하위 클래스에서 어떤 구현을 하더라도 처리의 뼈대를 결정하고 하위 클래스에서 그 구체적인 내용을 결정하는 디자인 패턴을 Template Method 패턴이라고 함
- 일정한 프로세스를 가진 요구사항을 템플릿 페서드를 이용하여 구현할 수 있음
- 알고리즘의 구조를 메서드에 정의하고 하위 클래스에서 알고리즘 구조의 변경없이 알고리즘을 재정의 하는 패턴

## Class Diagram
![template method](http://www.tutorialspoint.com/design_pattern/images/template_pattern_uml_diagram.jpg)


## 사용처
- 상속 기반의 프레임워크에서 많이 사용됨. 프레임워크는 작업의 90% 정도를 기반 클래스를 통해 제공하고, 어플리켕션 용도에 맞게 맞춤화할 필요가 있는 부분은 추상 메서로 남겨놓음. 사용자는 클래스를 상속하고 추상 메서드를 필요에 맞게 구현함으로써 프레임워크를 사용하게 됨.
- 구현하려는 알고리즘이 일정한 프로세스가 있음.
- 구현하려는 알고리즘이 변경 가능성이 있음.

## 구현 프로세스
1. 알고리즘을 여러 단계로 나눔
2. 나눠진 알고리즘의 단계를 메서드로 선언
3. 알고리즘을 수행할 템플릿 메서드를 만듦
4. 하위 클래스에서 나눠진 메서드들을 구현

## factory method pattern과의 비교
- 팩토리 메서드 패턴은 객체를 생성하는 템플릿 메서드 패턴임

## 단점
- 하위 클래스에서 모든 세부작업을 정해야 하므로 기본행위를 직접 구현해야 한다는 관점에서 패턴이라고 하기에는 약하다

## References
- http://www.tutorialspoint.com/design_pattern/template_pattern.htm
- http://choipattern.blogspot.kr/2013/08/template-method.html


##

```
Cricket Game Initialized! Start playing.
Cricket Game Started. Enjoy the game!
Cricket Game Finished!

Football Game Initialized! Start playing.
Football Game Started. Enjoy the game!
Football Game Finished!
```

