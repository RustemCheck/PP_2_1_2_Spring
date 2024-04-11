import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld beanOne = applicationContext.getBean("helloworld", HelloWorld.class);
        HelloWorld beanTwo = applicationContext.getBean("helloworld", HelloWorld.class);
        System.out.println(beanOne==beanTwo);

        Cat catOne = applicationContext.getBean("cat", Cat.class);
        Cat catTwo = applicationContext.getBean("cat", Cat.class);
        System.out.println(catOne==catTwo);
    }
}