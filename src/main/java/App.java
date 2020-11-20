
import in.psg.model.HelloWorld;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "spring-module.xml");

        HelloWorld obj1 = (HelloWorld) context.getBean("helloBean");
        System.out.println(obj1);

        HelloWorld obj2 = (HelloWorld) context.getBean("helloBean");
        System.out.println(obj2);

        HelloWorld obj3 = (HelloWorld) context.getBean("helloBean2");
        System.out.println(obj3);

        HelloWorld obj4 = (HelloWorld) context.getBean("helloBean2");
        System.out.println(obj4);

//        HelloWorld h1 = new HelloWorld();
//        HelloWorld h2 = new HelloWorld();
//        System.out.println(h1);
//        System.out.println(h2);


    }
}