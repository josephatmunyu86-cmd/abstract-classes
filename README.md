# Mukono Hospital Staff Management System

A Java program that shows how abstract classes work.

## Classes
- MedicalStaff: abstract parent class with the shared details (employee ID, name, department, working hours)
- Doctor, Nurse, Pharmacist, LabTechnician: subclasses that implement their own patient-care duties
- Main: creates the staff and displays their information

## What abstraction shows
- MedicalStaff cannot be created directly
- Every subclass must implement getRole() and performPatientCare()
- New staff types can be added by extending MedicalStaff

## How to run
Run Main.java in IntelliJ IDEA.