public class Doctor extends MedicalStaff {
    private final String specialization;

    public Doctor(String employeeId, String name, String department,
                  int workingHours, String specialization) {
        super(employeeId, name, department, workingHours);
        this.specialization = specialization;
    }

    @Override
    public String getRole() {
        return "Doctor (" + specialization + ")";
    }

    @Override
    public void performPatientCare() {
        System.out.println("Duty        : Examining patients, diagnosing illnesses and prescribing treatment.");
    }
}