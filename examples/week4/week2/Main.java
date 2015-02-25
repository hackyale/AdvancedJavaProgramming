public class Main {
    public static void main(String[] args) {
        Person dani = new Teacher("Dani", 21, "Adv Java", 0);
        System.out.println("Name: " + dani.getName());
        System.out.println("Age: " + dani.getAge());

        if (dani instanceof Teacher) {
            Teacher daniT = (Teacher)dani;
            System.out.println("Subject: " + daniT.getSubject());
            System.out.println("Salary: " + daniT.getSalary());
        }

        Person jack = new ConcretePerson("Jack", 18);
        if (jack instanceof Teacher) {
            Teacher jackT = (Teacher)jack;
            System.out.println("Subject: " + jackT.getSubject());
            System.out.println("Salary: " + jackT.getSalary());
        }
    }
}
