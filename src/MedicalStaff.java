public abstract class MedicalStaff {
    private final String employeeId;
    private final String name;
    private final String department;
    private int workingHours;

    public MedicalStaff(String employeeId, String name, String department, int workingHours) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.workingHours = workingHours;
    }

    public String getEmployeeId() { return employeeId; }
    public String getName() { return name; }
    public String getDepartment() { return department; }
    public int getWorkingHours() { return workingHours; }

    public void setWorkingHours(int fcy) {
        if (workingHours > 0) {
            this.workingHours = workingHours;
        }
    }
}
