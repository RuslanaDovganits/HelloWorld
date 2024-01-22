public class HelloWorld {
    public static void main(String[] args) {

        /* AIT-RT, cohort 42-1,
        Java Basic , homework #3
         @author Ruslana Dovganits
         @version 22.01.24
         */
        // task # 1

        int a = 0;
        int b = 1;
        int c = 2;
        int d = 3;
        int e = 4;
        int f = 5;
        int g = 6;
        int h = 7;
        int i = 8;
        int j = 9;
        int sum = ((a + b + c + d + e + f + g + h + i + j) / 10);
        System.out.println(sum);

        // не будет среднего арифметического, int для целых чисел
        // int надо заменить на double

        // task # 2

        double A = 1000; //цена товара А
        double B = 500; //цена товара В
        // если клиент покупает товары вместе то действует скидка 10%
        double C = (A + B) - ((A + B) * 10) / 100; // цена со скидкой в 10%
        System.out.println(C);
        double D = ((A + B) * 10) / 100; // сумма скидки от покупки
        System.out.println(D);

        //task # 3

        // z,x,t,v,r,n,m = температура по 1 замеру на каждый день за прошлую неделюю

        double z = 29;
        double x = 30;
        double t = 29;
        double v = 28;
        double r = 33;
        double n = 34;
        double m = 33;

        double sumtem = z + x + t + v + r + n + m; // сумма температур за последние 7 дней
        double sumtem2 = (sumtem / 7); // средняя сумма за неделю
        System.out.println( sumtem2);