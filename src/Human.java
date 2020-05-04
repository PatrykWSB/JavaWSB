import java.util.Date;

public class Human {
    public String firstName;
    public String lastName;
    public Animal pet;
    public Phone phone;
    public Car auto;

    private Double salary = 200.0;
    private Date checkDate = new Date();
    private Double checkSalary = 200.0;

    public Double getSalary() {
        System.out.println("Last time your salary was " + checkSalary + " actual for date: " + checkDate);
        checkDate = new Date();
        checkSalary = salary;
        return salary;
    }

    public void setSalary(Double sal) {
        if (sal < 0) System.out.println("ERROR: You cannot pay us");
        else {
            System.out.println("New data send to system. Go to Ms. Hania, she will give u annex. Ahh and one more thing ZUS and US know about this so you know don't try to hide it.");
            this.salary = sal;
        }
    }
}
