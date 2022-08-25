public class homework3 {
    public static void zadan1() {
        int i = 1;
        while (i < 11) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println("");
        for (int z = 10; z > 0; z--) {
            System.out.print(z + " ");

        }
    }

    public static void zadan2() {
        for (int i = 2; i < 32; i = i + 7) {
            System.out.println(i);
        }


    }

    public static void zadan3() {
        for (int i = 0; i < 2100; i = i + 79 ) {
            if (i > 1822 && i < 2100) {

                System.out.println(i);
            }
        }
    }
    public static void zadan4(){
        for (int i = 0; i < 31; i ++) {
            if (i % 3 == 0 && i % 5 == 0 && i != 0){
                System.out.println(i + ": ping pong");
            }
            else if (i % 3 == 0 && i != 0) {
                System.out.println(i + ": ping");
            } else if (i % 5 == 0 && i != 0) {
                System.out.println(i+ ": pong");
            }
            else System.out.println(i + " null");
        }
    }
    public static void zadan5(){
        int i1 = 0;
        int i2 = 1;
        System.out.print(i1+ " ");
        System.out.print(i2 + " ");
        for (int i = 3; i < 11; i++){
            int i3 = i1 + i2;
            System.out.print(i3 + " ");
            i1 = i2;
            i2 = i3;
        }

    }
}
