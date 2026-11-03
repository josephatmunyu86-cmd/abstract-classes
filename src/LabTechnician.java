public class LabTechnician extends MedicalStaff {
    private final String testType;

    public LabTechnician(String employeeId, String name, String department, int workingHours, String testType) {
        super(employeeId, name, department, workingHours);
        this.testType = testType;
    }

    @Override
    public String getRole() {
        return "Laboratory Technician (" + testType + ")";
    }

    @Override
    public void performPatientCare() {
        System.out.println("Duty: Collecting samples, running lab tests and reporting results to doctors.");
    }
}