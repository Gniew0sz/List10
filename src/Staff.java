public abstract class Staff extends Person{
    String role;
    abstract void performDuties();
    public Staff(String name, int age, String role) {
        super(name, age);
        this.role = role;
    }
}
