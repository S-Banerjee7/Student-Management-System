package com.management;

import java.util.List;
import java.util.Scanner;

public class MainApplication {
    public static void main(String[] nullArgs) {
        DatabaseManager db = new DatabaseManager();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== Welcome to the Student Management System ===");
        
        while (true) {
            System.out.println("\n1. View All Students\n2. Add New Student\n3. Delete Student\n4. Exit");
            System.out.print("Select an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            
            try {
                switch (choice) {
                    case 1:
                        List<Student> list = db.getAllStudents();
                        if (list.isEmpty()) {
                            System.out.println("No records found.");
                        } else {
                            System.out.println("\n--- Student Records ---");
                            for (Student s : list) System.out.println(s);
                        }
                        break;
                        
                    case 2:
                        System.out.print("Enter Name: ");
                        String name = scanner.nextLine();
                        System.out.print("Enter Email: ");
                        String email = scanner.nextLine();
                        System.out.print("Enter Course: ");
                        String course = scanner.nextLine();
                        
                        db.addStudent(new Student(name, email, course));
                        break;
                        
                    case 3:
                        System.out.print("Enter Student ID to delete: ");
                        int id = scanner.nextInt();
                        db.deleteStudent(id);
                        break;
                        
                    case 4:
                        System.out.println("Exiting System. Goodbye!");
                        scanner.close();
                        System.exit(0);
                        
                    default:
                        System.out.println("Invalid selection. Try again.");
                }
            } catch (StudentNotFoundException e) {
                System.err.println("Custom Application Error: " + e.getMessage());
            } catch (Exception e) {
                System.err.println("System Error Occurred: " + e.getMessage());
            }
        }
    }
}