package pacote;
public class Employee extends Person {
    private String allergies;
    private String medicalConditions;

    public Employee(String id, String name, String allergies, String medicalConditions, String contactPhone, String contactEmail) {
        super(id, name, contactPhone, contactEmail);
        this.allergies = allergies;
        this.medicalConditions = medicalConditions;
    }

    // Getters
    public String getAllergies() {
        return allergies;
    }

    public String getMedicalConditions() {
        return medicalConditions;
    }

    // Setters
    public void setAllergies(String allergies) {
        this.allergies = allergies;
    }

    public void setMedicalConditions(String medicalConditions) {
        this.medicalConditions = medicalConditions;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Allergies: " + allergies);
        System.out.println("Medical Conditions: " + medicalConditions);
    }
}
