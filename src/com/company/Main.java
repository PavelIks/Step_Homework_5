package com.company;
import  java.util.Scanner;
public class Main
{
    /*Домашнее задание*/
    public static void main(String[] args)
    {
        /*Задание 1. Выведите на экран надпись "Your time is limited, so don’t
        waste it living someone else’s life" Steve Jobs на разных строках.*/

        /*System.out.print("“Your time is limited,\n");
        System.out.print("\tso don’t waste it\n");
        System.out.print("\t\tliving someone else’s life”\n");
        System.out.print("\t\t\tSteve Jobs\n");*/


        /*Задание 2 Пользователь вводит с клавиатуры два числа. Первое
        число — это значение, второе число процент, который необходимо
        посчитать. Например, мы ввели с клавиатуры 50 и 10. Требуется
        вывести на экран 10 процентов от 50. Результат: 5*/

        /*Scanner in1 = new Scanner(System.in);
        System.out.print("Введите число: ");
        int a = in1.nextInt();
        Scanner in2 = new Scanner(System.in);
        System.out.print("Введите %: ");
        int b = in2.nextInt();
        System.out.print("Результат: " + a * b / 100);*/


        /*Задание 3 Пользователь вводит с клавиатуры три цифры.
        Необходимо создать число, содержащее эти цифры. Например,
        если с клавиатуры введено 7, 3, 8, тогда нужно сформировать
        число 738.*/

        /*Scanner in1 = new Scanner(System.in);
        System.out.print("Введите 1 число: ");
        int a = in1.nextInt();
        Scanner in2 = new Scanner(System.in);
        System.out.print("Введите 2 число: ");
        int b = in2.nextInt();
        Scanner in3 = new Scanner(System.in);
        System.out.print("Введите 3 число: ");
        int c = in3.nextInt();
        System.out.print("Результат: ");
        System.out.print(a);
        System.out.print(b);
        System.out.print(c);*/


        /*Задание 4 Пользователь вводит шестизначное число. Необходимо
        поменять в этом числе первую и шестую цифры, а также вторую и
        пятую цифры. Например, 723895 должно превратиться в 593827.
        Если пользователь ввел не шестизначное число требуется вывести
        сообщение об ошибке.*/

        /*Scanner in1 = new Scanner(System.in);
        System.out.print("Введите 6-значное число: ");
        String numb1 = in1.next();
        if((int)numb1.length() != 6)
        {
            System.out.print("Введите 6-значное число!!!");
        }
        else
        {
            int A1 = Integer.parseInt(numb1) / 100000;
            int A2 = Integer.parseInt(numb1) / 10000 % 10;
            int A3 = Integer.parseInt(numb1) / 1000 % 10;
            int A4 = Integer.parseInt(numb1) % 1000 / 100;
            int A5 = Integer.parseInt(numb1) % 100 / 10;
            int A6 = Integer.parseInt(numb1) % 10;
            System.out.print(A6);
            System.out.print(A5);
            System.out.print(A4);
            System.out.print(A3);
            System.out.print(A2);
            System.out.print(A1);
        }*/


        /*Задание 5 Пользователь вводит с клавиатуры номер месяца (от 1 до 12). В
        зависимости от полученного номера месяца программа выводит на
        экран надпись: Winter (если введено значение 1,2 или 12), Spring
        (если введено значение от 3 до 5), Summer (если введено значение
        от 6 до 8), Autumn (если введено значение от 9 до 11). Если
        пользователь ввел значение не в диапазоне от 1 до 12 требуется
        вывести сообщение об ошибке.*/

        /*Scanner in1 = new Scanner(System.in);
        System.out.print("Введите номер месяца: ");
        int a = in1.nextInt();
        if(a == 1 || a == 2 || a == 12)
        {
            System.out.print("Winter");
        }
        else if(a == 3 || a == 4 || a == 5)
        {
            System.out.print("Spring");
        }
        else if(a == 6 || a == 7 || a == 8)
        {
            System.out.print("Summer");
        }
        else if(a == 9 || a == 10 || a == 11)
        {
            System.out.print("Autumn");
        }
        else
        {
            System.out.print("Число не может быть больше 12-и!");
        }*/


        /*Задание 6 Пользователь вводит с клавиатуры количество метров.
        В зависимости от выбора пользователя программа переводит метры
        в мили, дюймы или ярды.*/

        Scanner in1 = new Scanner(System.in);
        System.out.print("Введите метры: ");
        int metry = in1.nextInt();

        System.out.println("1: Метр - миля;");
        System.out.println("2: Метр - дюйм;");
        System.out.println("3: Метр - ярд.");

        Scanner in2 = new Scanner(System.in);
        System.out.print("Введите число: ");
        int option1 = in2.nextInt();

        switch (option1)
        {
            case 1:
                System.out.println("Метр - миля: " + 0.000621371 * metry);
                break;
            case 2:
                System.out.println("Метр - дюйм: " + 39.3701 * metry);
                break;
            case 3:
                System.out.println("Метр - ярд: " + 1.09361 * metry);
                break;
        }
    }
}