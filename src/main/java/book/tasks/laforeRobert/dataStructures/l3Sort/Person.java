package book.tasks.laforeRobert.dataStructures.l3Sort;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class Person {
    private String lastName;
    private String firstName;
    private int age;

    public void displayPerson(){
        System.out.println("Last name: " + lastName);
        System.out.println(", First name: " + firstName);
        System.out.println(", Age: " + age);
    }

    public String getLastName() {
        return lastName;
    }
}

