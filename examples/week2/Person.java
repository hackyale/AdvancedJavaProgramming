public abstract class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = Math.max(age, 0);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void markBirthday() {
        age++;
    }
}
