public class PersonBuilder {
    private String name;
    private String surname;
    private int age;
    private String city;

    public PersonBuilder setName(String name) throws IllegalArgumentException {
        if (name.isBlank()) {
            throw new IllegalArgumentException("Ошибка! Введите имя.");
        } else {
            this.name = name;
        }
        return this;
    }
    public PersonBuilder setSurname(String surname) {
        if (surname.isBlank()) {
            throw new IllegalArgumentException("Ошибка! Введите фамилию.");
        } else {
            this.surname = surname;
        }
        return this;
    }
    public PersonBuilder setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Ошибка! Возраст должен быть больше 0.");
        } else {
            this.age = age;
        } return this;
    }
    public PersonBuilder setCity(String address) {
        this.city = city;
        return this;
    }

    public Person build() {
        return new Person(name, surname, age);
    }
}
