package peaksoft;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        AnnotationConfigApplicationContext context
                = new AnnotationConfigApplicationContext(myConfig.class);

        Person person = context.getBean("person",Person.class);
        person.sayYourAnimalsPlus();
        System.out.println(person.getName()+" "+person.getAge());

        Person person2 = context.getBean("person",Person.class);
        person2.sayYourAnimalsPlus();
        System.out.println(person2.getName()+" "+person2.getAge());



    }
}
