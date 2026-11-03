import javax.imageio.stream.FileImageInputStream;

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

    public void setWorkingHours(int workingHours) {
        if (workingHours > 0) {
            this.workingHours = workingHours;
        }
    }
    public void displayStaffInfo() {
        System.out.println("-----------------------------------");
        System.out.println("Role        : " + getRole());
        System.out.println("Employee ID : " + employeeId);
        System.out.println("Name        : " + name);
        System.out.println("Department  : " + department);
        System.out.println("Hours/Week  : " + workingHours);
    }

    public abstract String getRole();

    public abstract void performPatientCare();                                                                                                                                                                 FileImageInputStream
}
