import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext=
                new ClassPathXmlApplicationContext("springconfig.xml");
        Object obj=classPathXmlApplicationContext.getBean("p");
        System.out.println(obj);

        Product obj1=(Product) classPathXmlApplicationContext.getBean("prod");
        System.out.println(obj1);

        Customer obj2=(Customer) classPathXmlApplicationContext.getBean("cus");
        System.out.println(obj2);

        Order order= (Order) classPathXmlApplicationContext.getBean("order");
        System.out.println(order);

    }
}
