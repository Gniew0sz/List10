public abstract class Person {
    private String name;
    private int age;
    public void introduce() {
        System.out.println(name+", "+age);
    }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
