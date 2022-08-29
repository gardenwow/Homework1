public class Stroki {
    public static void zadan1(){
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName= "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println(fullName);
        String lowercase = fullName.toLowerCase();
        System.out.printf("Данные %s сотрудника для заполнения отчета —", lowercase);
        String fullNameNew = "Иванов Семён Семёнович";
        System.out.println("\nДанные ФИО сотрудника  — " + fullNameNew.replace("ё", "е"));
    }
    public static void zadan2(){

    }
}
