public class Doctor extends Staff{
    @Override
    void performDuties() {
        System.out.println("Performing doctor duties");
    }
    void prescribeMedicine(String medicine){
        System.out.println("Prescribing medicine "+medicine);
    }
    public Doctor(String name, int age, String role) {
        super(name,age,role);

    }
}
