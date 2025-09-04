public class PersonMain {
    public static void main(String[] args) {
       
        Person person1 = new Person("Alice", 25);
        person1.displayDetails();

        
        Person person2 = new Person(person1);
        person2.displayDetails();
    }
}
