import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {

       ClassPathXmlApplicationContext classPathXmlApplicationContext;
       classPathXmlApplicationContext = new ClassPathXmlApplicationContext("mySpringContext.xml");

       Object javaBeanObj= classPathXmlApplicationContext.getBean("sampleBean");
        System.out.println(javaBeanObj);
        Object javaBeanObj1=classPathXmlApplicationContext.getBean("mybean");
        System.out.println(javaBeanObj1);


    }
}
