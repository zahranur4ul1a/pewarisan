package pewarisan;

public class FullTime extends Teacher {
    private String unit;
    private int annualSalary;

    public String getUnit() {
        return this.unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public int getAnnualSalary() {
        return this.annualSalary;
    }

    public void setAnnualSalary(int annualSalary) {
        this.annualSalary = annualSalary;
    }
    

    public FullTime() {
        super();
        unit = "";
        annualSalary = 0;
    }

    public FullTime(String name, int age, String subject, String unit, int annualSalary) {
        super(name, age, subject);
        this.unit = unit;
        this.annualSalary = annualSalary;
    }

    public void print() {
        super.print();
        System.out.println("Unit : \t" + unit);
        System.out.println("Annual Salary : \t" + annualSalary);
    }

}
