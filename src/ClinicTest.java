import java.util.ArrayList;

class ClinicTest {
    void main() {
        Patient patient = new Patient("John Pork",33);
        Doctor doctor = new Doctor("John Beef",43,"Cardiologist");
        Receptionist receptionist = new Receptionist("John Chicken", 25,"Receptionist");
        Nurse nurse = new Nurse("John Burrito",25,"Nurse");
        ArrayList<Person> people = new ArrayList<>();
        ArrayList<Staff> staff = new ArrayList<>();
        people.add(patient);
        people.add(doctor);
        people.add(receptionist);
        people.add(nurse);
        for(Person person : people){
            person.introduce();
        }
        staff.add(nurse);
        staff.add(doctor);
        staff.add(receptionist);
        for (Staff staff1 : staff){
            staff1.performDuties();
        }
        patient.receiveTreatment();
        doctor.prescribeMedicine("Xanax");
        nurse.checkVitals(patient);
    }
}
