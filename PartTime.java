package pewarisan;

public class PartTime extends Teacher{
    private int hoursWorked;
    private int salary;

    public int getHoursWorked() {
        return this.hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public int getSalary() {
        return this.salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public PartTime(){
        super();
        hoursWorked = 0;
        salary = 0;
    }

    public PartTime(String name, int age, String subject, int hoursWorked, int salary) {
        super(name, age, subject);
        this.hoursWorked = hoursWorked;
        this.salary = salary;
    }
     public void print() {
        super.print();
        System.out.println("HoursWorked : \t" +hoursWorked);
        System.out.println("Salary : \t" +salary);
     }
}
