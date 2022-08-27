public class Main {
    public static void main(String[] args) {

        byte work1 = 1;
        short work2 = 11;
        int work3 = 4;
        long work4 = 55555555L;
        float work5 = 4.3f;
        double work6 = 4.2;
        char work7 = 'a';
        // 2 zadacha
        double firstbox = 78.2;
        double secondbox = 82.7;
        //System.out.println(firstbox+secondbox);
        //System.out.println(secondbox-firstbox);
        //eda();
        //loseweight();
        //salary();
        //homework2.zadan1();
       // homework2.zadan3();
        //homework2.zadan4();
       // homework2.zadan5();
        //homework3.zadan1();
        //homework3.zadan2();
        //homework3.zadan3();
        //homework3.zadan4();
        //homework3.zadan5();
        massiv.zadan1();


    }
    public static void eda() {
        var banana = 80;
        var milk = 105;
        var icecream = 100;
        var egg = 70;
        var breakfast_gramm = banana * 5 + milk * 2 + icecream * 2 + egg *4;
        var breakfast = breakfast_gramm / 1000;
        System.out.println(breakfast + " kg ");

    }
    public static void loseweight(){
        int weight = 7000;
        int weight1 = 250;
        int weight2 = 500;
        var days_250 = weight / weight1;
        var days_500 = weight / weight2;
        System.out.println(days_250);
        System.out.println(days_500);
        var middledays = (days_250 + days_500) / 2;
        System.out.println(middledays);


    }
    public static void salary(){
        int salary_masha = 67760;
        int salary_denis = 83690;
        int salary_kris = 76230;
        var salary_masha_new = salary_masha + salary_masha * 0.1;
        var salary_denis_new = salary_denis + salary_denis * 0.1;
        var salary_kris_new = salary_kris + salary_kris * 0.1;
        //System.out.println(salary_masha_new);
        //System.out.println(salary_denis_new);
        //System.out.println(salary_kris_new);
        // можно и 10% умножить на год, то же самое
        var margin_masha = salary_masha_new*12 - salary_masha*12;
        var margin_denis = salary_denis_new*12 - salary_denis*12;
        var margin_kris = salary_kris_new*12 - salary_kris*12;
        System.out.println("теперь получает " + salary_masha_new + " рублей. Годовой доход вырос на " + margin_masha + " рублей" );
        System.out.println("Маша теперь получает " + salary_denis_new + " рублей. Годовой доход вырос на " + margin_denis + " рублей" );
        System.out.println("Маша теперь получает " + salary_kris_new + " рублей. Годовой доход вырос на " + margin_kris + " рублей" );
    }


}