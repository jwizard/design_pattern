package fly_weight.zum_blog;

/**
 * Created by jwizard on 2016. 2. 3..
 */
public class Test {
    public static void main(String[] args) {
        PersonFactory.Person p1 = PersonFactory.getPerson("홍길동");
        PersonFactory.Person p2 = PersonFactory.getPerson("김말자");
        PersonFactory.Person p3 = PersonFactory.getPerson("홍길동");

        System.out.println(p1 == p2);
        System.out.println(p1 == p3);
    }
}
