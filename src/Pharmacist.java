public class Pharmacist extends MedicalStaff {
    private final String licenseNumber;

    public Pharmacist(String employeeId, String name, String department,
                      int workingHours, String licenseNumber) {
        super(employeeId, name, department, workingHours);
        this.licenseNumber = licenseNumber;
    }

    @Override
    public String getRole() {
        return "Pharmacist (License: " + licenseNumber + ")";
    }

    @Override
    public void performPatientCare() {
        System.out.println("Duty        : Dispensing prescribed drugs and advising patients on correct dosage.");
    }
}