package Assignment1;

public class Person{
    private String name;
    private int age;

    public Person() {

    }

    public Person(int age, String name){
        this();
        setAge(age);
        setName(name);
    }

    public Person(String name){
        this();
        setName(name);
    }
    public Person(int age){
        this();
        setAge(age);
    }
    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age){
        this.age=age;
    }
    public void printDetails(){
        System.out.println(getAge()+" "+getName());
    }
}
