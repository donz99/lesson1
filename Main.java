package com.company;

public class Main {

    public static void main(String[] args) {
        //Begin1. Дана сторона квадрата a. Найти его периметр P = 4·a
        //Ввод или присвоение исходных данных
        /*int a = 5;
        //Вычисление результата
        int P = 4 * a;
        //Вывод результата
        System.out.println(P);
        */
        // Дана сторона квадрата a. Найти его площадь S = a**2
        /*int a = 8;
        int S = a * a;
        System.out.println("У квадрат со стороной " + a + " площадь " + S);
        */
        //Begin4 Дан диаметр окружности d. Найти ее длину L = π·d. В качестве
        //значения π использовать 3.14.
        /*int d = 10;
        final double pi = 3.14;
        double L = pi*d;
        System.out.println("У круга с диаметром " + d + " длина окружности " + L);

         */
        //Begin 5 Дана длина ребра куба a. Найти объем куба V = a**3 и площадь его поверхности S = 6·a**2
        /*int a = 5;
        int V = a * a * a;
        int S = 6 * a * a;
        System.out.println(V);
        System.out.println(S);

         */

        //Begin 6  Даны длины ребер a, b, c прямоугольного параллелепипеда. Найти его объем V = a·b·c и площадь поверхности S = 2·(a·b + b·c + a·c).
        /*int a = 5;
        int b = 7;
        int c = 9;
        int S = 2 * (a*b+b*c+a*c);
        System.out.println(S);

         */

        //Begin 7 Найти длину окружности L и площадь круга S заданного радиуса R: L = 2·π·R, S = π·R**2
        /*final double pi = 3.14;
        int R = 5;
        double L = 2 * pi * R;
        double S = pi * R * R;
        System.out.println(L);
        System.out.println(S);

         */

        //Begin 8 Даны два числа a и b. Найти их среднее арифметическое: (a + b)/2
        /*int a = 2;
        double b = 3;
        double x = (double)(a+b)/2;
        System.out.println(x);

         */


        //Begin 9 Даны два неотрицательных числа a и b. Найти их среднее геометрическое, то есть квадратный корень из их произведения: √a·b
        /*double a = 5;
        double b = 2.3;
        double g_avg = Math.sqrt(a * b);
        System.out.println(g_avg);

         */

        //Begin 10 Даны два ненулевых числа. Найти сумму, разность, произведение и частное их квадратов
        /*
        double a = 5;
        double b = 3;
        double c = a*a + b*b;
        System.out.println(c);
        с = a*a - b*b;
        System.out.println(c);
        с = (a*a) * (b*b);
        System.out.println(c);
        с = (a*a) / (b*b);
        System.out.println(c);

         */

        //Begin 11 Даны два ненулевых числа. Найти сумму, разность, произведение и частное их модулей.
        /*
        int a = -5;
        int b = 24;
        a = Math.abs(a);
        b = Math.abs(b);
        double s = a + b;
        System.out.println("Сумма модулей " + (int)s);
        s = a - b;
        System.out.println("Разность модулей " + (int)s);
        s = a * b;
        System.out.println("Произведение модулей " + (int)s);
        s = (double)a / b;
        System.out.println("Частное модулей " + s);

         */
        //Begin 22 Поменять местами содержимое переменных A и B и вывести новые значения A и B
        /*
        int a = 3;
        int b = 10;
        int c = a;
        a = b;
        b = c;
        System.out.println("a = " + a + " b = " + b);

               */
        // Begin 12 Даны катеты прямоугольного треугольника a и b. Найти его гипотенузу c и периметр P:/ c =√a2 + b2  P = a + b + c.
        /*
        double a = 3;
        int b = 5;
        double c = Math.sqrt(a*a+b*b);
        double P = a + b + c;
        System.out.println(c);
        System.out.println(P);

         */

        // Begin 13 Даны два круга с общим центром и радиусами R1 и R2 (R1 > R2).
        //Найти площади этих кругов S1 и S2, а также площадь S3 кольца, внешний
        //радиус которого равен R1, а внутренний радиус равен R2:
        //S1 = π·(R1)
        //2
        //, S2 = π·(R2)
        //2
        //, S3 = S1 − S2.

        int r = 2;
        int R = 3;
        final double pi = 3.14;
        double s = pi*r*r;
        System.out.println(s);
        double S = pi*R*r;
        System.out.println(S);
        double O = s - S;
        System.out.println(O);














        //2
        //.

    }
}
