public class Teacher extends Person {
    private String subject;
    private double salary;

    public Teacher(String name, int age, String subject, double salary) {
        super(name, age);
        this.subject = subject;
        setSalary(salary);
    }

    public String getSubject() {
        return subject;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = Math.max(salary, 0.0);
    }

    @Override
    public String getName() {
        return "Dr. " + super.getName();
    }
}
