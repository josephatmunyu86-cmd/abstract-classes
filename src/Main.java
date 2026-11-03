public class Main {
    public static void main(String[] args) {

        MedicalStaff[] staff = {
                new Doctor("D001", "Dr. Kato Samuel", "Surgery", 45, "General Surgery"),
                new Nurse("N001", "Nakato Grace", "Inpatient", 40, "Maternity"),
                new Pharmacist("P001", "Okello Brian", "Pharmacy", 38, "PH-2041"),
                new LabTechnician("L001", "Namuli Joan", "Laboratory", 40, "Haematology")
        };
    }
}