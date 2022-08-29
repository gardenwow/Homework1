import java.util.Arrays;
public class massiv {
    public static void zadan1(){
        int[] arrayInt = {1, 2, 3, 4, 5};

        double[] arrayDouble = new double[3];
        arrayDouble[0] = 1.57;
        arrayDouble[1] = 7.654;
        arrayDouble[2] = 9.986;

        int [] weight = {0, 1, 2, 3 , 4, 5};


        for( int i = 0; i < arrayInt.length-1; i++){
            System.out.print(arrayInt[i]+ ", ");
        }
        System.out.println(arrayInt[arrayInt.length-1]);

        for(int i = arrayInt.length-1; i > 0;  i -- ){
            System.out.print(arrayInt[i]+ ", ");
        }
            System.out.println(arrayInt[0]);


        for (int j = 0; j <= weight.length; j ++){
            if (j % 2 != 0){ weight[j] += 1;
                System.out.print(weight[j]+ " ");

            }
        }


    }
    public static void zadanChast2() {
        int salaryMouth = 0;
        int maxSpend = -1;
        int minSpend = 3000000;
        for (int z = 0; z < generateRandomArray().length; z++){
            salaryMouth += generateRandomArray()[z];
            if (generateRandomArray()[z] > maxSpend){
                maxSpend = generateRandomArray()[z];
            } else if (generateRandomArray()[z] < minSpend) {
                minSpend = generateRandomArray()[z];
            }
        }
        double middleSalary = salaryMouth / generateRandomArray().length;
        System.out.printf("Сумма трат за месяц составила %s рублей", salaryMouth);
        System.out.println();
        System.out.printf("Минимальная сумма трат за день составила %s рублей. Максимальная сумма трат за день составила %s рублей", minSpend, maxSpend);
        System.out.println();
        System.out.printf("Средняя сумма трат за месяц составила %s рублей", middleSalary);
    }


    int[] arr = generateRandomArray();

    public static int[] generateRandomArray(){
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;

        }
        return arr;
        }
    public static void zadanChast2zadan4(){
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        System.out.println();
        for (int i = reverseFullName.length-1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}

