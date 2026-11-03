public class Nurse extends MedicalStaff {
    private final String ward;

    public Nurse(String employeeId, String name, String department,
                 int workingHours, String ward) {
        super(employeeId, name, department, workingHours);
        this.ward = ward;
    }

    @Override
    public String getRole() {
        return "Nurse (" + ward + " Ward)";
    }

    @Override
    public void performPatientCare() {
        System.out.println("Duty        : Monitoring vital signs, administering medication and caring for admitted patients.");
    }
}