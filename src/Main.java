public class Main {
    public static void main(String[] args) {
        Person mom = new PersonBuilder()
                .setName("Анна")
                .setSurname("Вольф")
                .setAge(31)
                .setCity("Сидней")
                .build();
        Person son = mom.newChildBuilder()
                .setName("Антошка")
                .build();
        System.out.println("У " + mom + " есть сын, " + son);

        try {
            // Не хватает обязательных полей
            Person dad = new PersonBuilder()
                    .setSurname("Вольф")
                    .build();
            System.out.println("У " + mom + " есть муж, " + dad);
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }

        try {
            // Возраст недопустимый
            Person granddad = new PersonBuilder()
                    .setName("Валериан")
                    .setSurname("Ленин")
                    .setAge(-100)
                    .build();
            System.out.println("У " + mom + " есть дедушка, " + granddad);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }
}
