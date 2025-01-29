class Person {
    // Instance variables (fields)
    String name;
    int age;
    
    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    // Method to display information
    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

    public class LearningFields {
    public static void main(String[] args) {
        Person person1 = new Person("Walter", 23);
        person1.display();
    }
}

