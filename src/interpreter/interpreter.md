# interpreter pattern
## 개요
- SQL, 컴파일러의 동작
- 간단한 언어의 문법을 정의하고 해석하는데 사용
- 어떠한 언어에 대해 이 언어로 작성된 문장을 해석할 수 있도록, 언어의 문법을 표현하고 해석기능을 수행하는 디자인 패턴
- ex) 3+4*2-8
- ex) SELECT * FROM DUAL (BETWEEN, LIKE)

## Class Diagram
![interpreter pattern class diagram](http://a3ab771892fd198a96736e50.javacodegeeks.netdna-cdn.com/wp-content/uploads/2015/09/interpreter_design_pattern_class_diagram_1.jpg)

## 요소 설명
1. Context - 해석을 위한 전역정보
2. Abstract Expression - 해석 연산 정의 추상 class, 보통 interpret() method
3. Terminal Expression - 입력으로 들어오는 터미널 기호를 위한 연산(변수와 같은 것)
4. Nonterminal Expression - 문법 법칙을 위한 연산 구현(수식과 같은 것), 일반적으로 재귀호출을 통해 이루어짐.
5. Client - 특정 언어의 문장을 표현하는 Syntax tree 생성, 자료구조

## 활용범위
- 문법이 간단할 때 => 복잡하면 클래스가 많아짐
- 성능이 중요한 문제가 되지 않을 때 => 문장을 분석해서 객체들의 Tree구조를 생성하기 때문에 속도나 효율이 떨어짐.

## 장점
- 문법을 변경하고 확장하기 좋음
- 문법을 구현하기 쉬움 => 각 노드들에 표현된 클래스들은 비슷한 구현을 가진다.

## 단점
- 문법이 많은 규칙을 지니고 있으면 이를 표현하기 위해 너무 많은 클래스를 포함해야 하기 때문에 적절하지 않음.

## references
1. Interpreter Design Pattern
	- http://www.javacodegeeks.com/2015/09/interpreter-design-pattern.html
2. 객체지향 설계와 패턴
	- https://ocw.dongguk.edu/contents/2013/2013024151040/pdf2013024151040.pdf


```
/Library/Java/JavaVirtualMachines/jdk1.8.0_65.jdk/Contents/Home/bin/java -Didea.launcher.port=7532 "-Didea.launcher.bin.path=/Applications/IntelliJ IDEA 15.app/Contents/bin" -Dfile.encoding=UTF-8 -classpath "/Library/Java/JavaVirtualMachines/jdk1.8.0_65.jdk/Contents/Home/jre/lib/charsets.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_65.jdk/Contents/Home/jre/lib/deploy.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_65.jdk/Contents/Home/jre/lib/ext/cldrdata.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_65.jdk/Contents/Home/jre/lib/ext/dnsns.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_65.jdk/Contents/Home/jre/lib/ext/jaccess.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_65.jdk/Contents/Home/jre/lib/ext/jfxrt.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_65.jdk/Contents/Home/jre/lib/ext/localedata.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_65.jdk/Contents/Home/jre/lib/ext/nashorn.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_65.jdk/Contents/Home/jre/lib/ext/sunec.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_65.jdk/Contents/Home/jre/lib/ext/sunjce_provider.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_65.jdk/Contents/Home/jre/lib/ext/sunpkcs11.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_65.jdk/Contents/Home/jre/lib/ext/zipfs.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_65.jdk/Contents/Home/jre/lib/javaws.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_65.jdk/Contents/Home/jre/lib/jce.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_65.jdk/Contents/Home/jre/lib/jfr.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_65.jdk/Contents/Home/jre/lib/jfxswt.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_65.jdk/Contents/Home/jre/lib/jsse.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_65.jdk/Contents/Home/jre/lib/management-agent.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_65.jdk/Contents/Home/jre/lib/plugin.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_65.jdk/Contents/Home/jre/lib/resources.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_65.jdk/Contents/Home/jre/lib/rt.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_65.jdk/Contents/Home/lib/ant-javafx.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_65.jdk/Contents/Home/lib/dt.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_65.jdk/Contents/Home/lib/javafx-mx.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_65.jdk/Contents/Home/lib/jconsole.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_65.jdk/Contents/Home/lib/packager.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_65.jdk/Contents/Home/lib/sa-jdi.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_65.jdk/Contents/Home/lib/tools.jar:/Users/jwizard/IdeaProjects/holub_on_patterns_flyweight/out/production/holub_on_patterns_flyweight:/Applications/IntelliJ IDEA 15.app/Contents/lib/idea_rt.jar" com.intellij.rt.execution.application.AppMain interpreter.javacodegeeks.TestInterpreterPattern
s:7
s:3
s:-
getOperator s:-
7-3
result:4
s:2
s:1
s:+
getOperator s:+
2+1
result:3
s:*
getOperator s:*
4*3
result:12
( 7 3 - 2 1 + * ): 12

Process finished with exit code 0
```