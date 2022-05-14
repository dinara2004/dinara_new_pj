package peaksoft;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {

    public static void main( String[] args ) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");

        Person person = context.getBean("person", Person.class);
        System.out.println("person: " + person);
        person.callAnimal();
        Person person1 = context.getBean("person1", Person.class);
        System.out.println("person1: " + person1);
        person1.callAnimal();
        context.close();
    }
}
