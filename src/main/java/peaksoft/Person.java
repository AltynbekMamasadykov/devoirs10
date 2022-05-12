package peaksoft;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

public class Person {

    @Value("${person.name}")
    private String name;
    @Value("${person.age}")
    private String age;
    private Animal animal;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Person(@Qualifier("horse")Animal animal){
        this.animal = animal;
    }

    public void sayYourAnimalsPlus(){
        System.out.println("davay");
        animal.animalPlus();
    }

}
