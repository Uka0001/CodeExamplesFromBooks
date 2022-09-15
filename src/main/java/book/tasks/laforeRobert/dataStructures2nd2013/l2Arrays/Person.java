package book.tasks.laforeRobert.dataStructures2nd2013.l2Arrays;

public class Person {
    private String lastName;
    private String firstName;
    private int age;

    public Person(String last, String first, int a) {
        this.lastName = last;
        this.firstName = first;
        this.age = a;
    }

    public void displayPerson() {
        System.out.println(" Last name: " + lastName);
        System.out.println(", First name: " + firstName);
        System.out.println(", Age " + age);
    }

    public String getLast() {
        return lastName;
    }
}
