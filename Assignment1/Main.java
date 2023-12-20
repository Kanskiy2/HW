package Assignment1;

public class Main {
    public static void main(String[] args) {
        Person Pavel= new Person();
        Person Yan = new Person(19,"Yan");
        Pavel.setAge(18);
        Pavel.setName("Pavel");
        Pavel.printDetails();
        Yan.printDetails();
    }
}