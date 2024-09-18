public class Main {
    public static void main(String[] args) {
        //Задача 1
        System.out.println("Задача 1");
        String firstName = "Ivan ";
        String middleName = "Ivanov ";
        String lastName = "Ivanovich ";
        String fullName = middleName+firstName+lastName;
        System.out.println("Ф. И. О. сотрудника — "+fullName);
        System.out.println();

        //Задача 2
        System.out.println("Задача 2");
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета —"+fullName.toUpperCase());
        System.out.println();

        //Задача 3
        System.out.println("Задача 3");
        String firstName1 = "Семён ";
        String middleName1 = "Иванов ";
        String lastName1 = "Семёнович ";
        String fullName1 = middleName1+firstName1+lastName1;
        fullName1 = fullName1.replace ("ё","е");
        System.out.println("Данные Ф. И. О. сотрудника — "+fullName1);

    }
}