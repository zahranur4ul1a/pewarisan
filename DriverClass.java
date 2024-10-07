package pewarisan;

import java.util.Scanner;

public class DriverClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Pilih salah satu: ");
        System.out.println("1.Student\n2. Teacher");
        String pilihan = input.nextLine();

        if(pilihan.equals("1")) {
            System.out.println("Detail Students: ");
            System.out.println("Name: ");
            String name = input.nextLine();
            System.out.println("Mjaor: ");
            String major = input.nextLine();
            System.out.println("Age: ");
            int age = input.nextInt();
            input.nextLine();
            System.out.println("Student Number: ");
            int StudentNumber = input.nextInt();
            input.nextLine();
            System.out.println("Score: ");
            int score = input.nextInt();
            Student student = new Student(name, age, StudentNumber, score, major);
            student.print();
        
            } else if (pilihan.equals("2")) {
                System.out.println("pilih salah satu: ");
                System.out.println("1. Part time\n2. full time: ");
                String pilihan2 = input.nextLine();
                if (pilihan2.equals("1")) {
                    System.out.println("Part time details : ");
                    System.out.println("Name: ");
                    String name = input.nextLine();
                    System.out.println("subject: ");
                    String subject = input.nextLine();
                    System.out.println("Age:");
                    int age = input.nextInt();
                    input.nextLine();
                    System.out.println("Hours Worked: ");
                    int hoursWorked = input.nextInt();
                    input.nextLine();
                    System.out.println("Salary: ");
                    int salary = input.nextInt();
                    input.nextLine();
                    PartTime PartTime = new PartTime(name, age, subject, hoursWorked, salary);
                    PartTime.print();
                }else if (pilihan2.equals("2")) {
                    System.out.println("Full time details: ");
                    System.out.println("Name: ");
                    String name = input.nextLine();
                    System.out.println("subject: ");
                    String subject = input.nextLine();
                    System.out.println("Age: ");
                    int age = input.nextInt();
                    System.out.println("Annual Salary: ");
                    int annualSalary = input.nextInt();
                    input.nextLine();
                    System.out.println("Unit: ");
                    String unit = input.nextLine();
                    FullTime fullTime = new FullTime(name, age, subject, unit, annualSalary);
                    fullTime.print();

                }


            }

    }
}
