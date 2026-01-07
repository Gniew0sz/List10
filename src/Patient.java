public class Patient extends Person implements Treatable {
    private String condition;
    public void recieveTreatment(){
        System.out.println("Recieved treatment");
    }
    public Patient(String name, int age){
        super(name,age);
    }
}
