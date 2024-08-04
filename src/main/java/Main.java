public class Main {
    public static void main(String[] args) {
        //Задание 1
        String firstName = "Ivan";
        String middleNAme = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleNAme;
        System.out.println("ФИО сотрудника - " + fullName);
        //Задание 2
        fullName = "ivanov ivan ivanovich";
        String upperFullName = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + upperFullName);
        //Задание 3
        fullName = "Иванов Семён Семёнович";
        System.out.println("Данные ФИО сотрудника — " + fullName.replace("ё","е"));
        //или
        fullName = "Иванов Семён Семёнович";
        String fixedFullName = fullName.replace("ё","е");
        System.out.println("Данные ФИО сотрудника — " + fixedFullName);
    }
}
