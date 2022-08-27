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
}
