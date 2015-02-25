/**
 * The Person class is designed to represent simple people.
 * @author Dani Dickstein
 * @version  0.1
 */
public class Person {
    private String name;
    private String gender;
    private int age;

    /**
     * Constructor for a person
     * @param  name   This person's name
     * @param  gender This person's gender
     * @param  age    This person's current age
     */
    public Person(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = Math.max(age, 0);
    }

    /**
     * Get the name of this person
     * @return This person's name
     */
    public String getName() {
        return name;
    }

    /**
     * Get the gender of this person
     * @return This person's gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * Get the age of this person
     * @return This person's age
     */
    public String getAge() {
        return age;
    }

    /**
     * Increase the age of this person by 1 year
     */
    public void increaseAge() {
        age++;
    }
}
