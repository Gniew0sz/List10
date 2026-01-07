import java.util.ArrayList;

public class Prescription {
    ArrayList<String> treatments = new ArrayList<>();

    public Prescription( ArrayList<String> treatments) {
        this.treatments = treatments;
    }
    public void getTreatments() {
        System.out.println("Treatments: ");
        for (String treatment : treatments) {
            System.out.println(treatment);
        }
    }
    public void setTreatments(ArrayList<String> treatments) {
        this.treatments = treatments;
    }
    public void addTreatment(String treatment) {
        this.treatments.add(treatment);
    }
}
