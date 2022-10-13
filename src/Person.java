import java.util.OptionalInt;

public class Person {
    protected final String name;
    protected final String surname;
    private int age;
    protected String city;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public boolean hasAge() {
        if (age >= 0) {
            return true;
        }
        return false;
    }
    public boolean hasCity() {
        if (city != null) {
            return true;
        }
        return false;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public OptionalInt getAge() {
        return OptionalInt.of(age);
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void happyBirthday() {
        age += 1;
    }

    @Override
    public String toString() {
        return  name + ' ' + surname + ' '+ age + " лет от роду по адресу г. " + city;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public PersonBuilder newChildBuilder() {
        return new PersonBuilder().setSurname(surname).setCity(city);
    }
}
