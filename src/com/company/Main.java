package com.company;
import java.util.Scanner;
public class Main {
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

        /*Scanner in1 = new Scanner(System.in);
        System.out.print("Введите метры: ");
        int metry = in1.nextInt();
        System.out.println("1: Метр - миля;");
        System.out.println("2: Метр - дюйм;");
        System.out.println("3: Метр - ярд.");
        Scanner in2 = new Scanner(System.in);
        System.out.print("Введите команду: ");
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
        }*/


        /*Задание 7 Пользователь вводит с клавиатуры два числа. Нужно показать все нечетные числа в указанном диапазоне.
        Если границы диапазона указаны неправильно требуется произвести нормализацию границ. Например, пользователь ввел
        20 и 11, требуется нормализация, после которой начало диапазона станет равно 11, а конец 20.*/

        /*Scanner in1 = new Scanner(System.in);
        System.out.print("Введите 1 число: ");
        int a = in1.nextInt();
        Scanner in2 = new Scanner(System.in);
        System.out.print("Введите 2 число: ");
        int z = in2.nextInt();
        if(a > z)
        {
            int tmp = a;
            a = z;
            z = tmp;
        }
        System.out.println("1: чётное;");
        System.out.println("2: нечётное.");
        Scanner in = new Scanner(System.in);
        System.out.print("Введите команду: ");
        int option1 = in.nextInt();
        switch (option1)
        {
            case 1:
                for (int i = a; i <= z; i++)
                {
                    if (i % 2 == 0)
                    {
                        System.out.print(i + "; ");
                    }
                }
                break;
            case 2:
                for (int i = a; i <= z; i++)
                {
                    if (i % 2 != 0)
                    {
                        System.out.print(i + "; ");
                    }
                }
                break;
        }*/


        /*Задание 8 Показать на экран таблицу умножения в диапазоне, указанном пользователем. */

        /*Scanner in1 = new Scanner(System.in);
        System.out.print("Введите 1 число: ");
        int a = in1.nextInt();
        Scanner in2 = new Scanner(System.in);
        System.out.print("Введите 2 число: ");
        int z = in2.nextInt();
        for (int i = a; i <= z; i++)
        {
            for (int i1 = 1; i1 <= 10; i1++)
            {
                System.out.print(i + " * " + i1 + " = " + i * i1 + "\n");
            }
        }*/


        /*Задание 9 В одномерном массиве, заполненном случайными числами, определить минимальный и максимальный
        элементы, посчитать количество отрицательных элементов, посчитать количество положительных элементов,
        посчитать количество нулей. Результаты вывести на экран. */

        /*int mass[] = {1, 34, 326, -32, 235, -1, 0};
        int max = mass[0];
        int min = mass[0];
        int masslength = mass.length;
        int otr = 0;
        int pol = 0;
        int zer = 0;
        for (int i1 = 0; i1 < masslength; i1++)
        {
            if (mass[i1] > max)
            {
                max = mass[i1];
            }
            if (mass[i1] < min)
            {
                min = mass[i1];
            }
            if(mass[i1] < 0)
            {
                otr++;
            }
            if (mass[i1] > 0)
            {
                pol++;
            }
            if (mass[i1] == 0)
            {
                zer++;
            }
        }
        System.out.println("Макс. число: " + max);
        System.out.println("Мин. число: " + min);
        System.out.println("Отр. чисел: " + otr);
        System.out.println("Пол. чисел: " + pol);
        System.out.println("Нулей: " + zer);*/


        /*Задание 10 Есть одномерный массив, заполненный случайными числами. На основании данных этого массива нужно:
        1) Создать одномерный массив, содержащий только четные числа из первого массива;
        2) Создать одномерный массив, содержащий только нечетные числа из первого массива;
        3) Создать одномерный массив, содержащий только отрицательные числа из первого массива;
        4) Создать одномерный массив, содержащий только положительные числа из первого массива.*/

        /*int mass1[] = {1, 34, 326, -32, 235, -1, 0};
        int a1 = 0;
        int a2 = 0;
        int a3 = 0;
        int a4 = 0;
        int masslength = mass1.length;
        for (int i = 0; i < masslength; i++)
        {
            if ((mass1[i] % 2 == 0) & (mass1[i]) != 0)
            {
                a1++;
            }
            if ((mass1[i] % 2 != 0) & (mass1[i]) != 0)
            {
                a2++;
            }
            if ((mass1[i] < 0) & (mass1[i]) != 0)
            {
                a3++;
            }
            if ((mass1[i] > 0) & (mass1[i]) != 0)
            {
                a4++;
            }
        }
        int mass2[] = new int[a1];
        int b1 = 0;
        int mass3[] = new int[a2];
        int b2 = 0;
        int mass4[] = new int[a3];
        int b3 = 0;
        int mass5[] = new int[a4];
        int b4 = 0;
        for (int each : mass1)
        {
            if ((each % 2 == 0) & (each != 0))
            {
                mass2[b1] = each;
                b1++;
            }
            if ((each % 2 != 0) & (each != 0))
            {
                mass3[b2] = each;
                b2++;
            }
            if ((each < 0) & (each != 0))
            {
                mass4[b3] = each;
                b3++;
            }
            if ((each > 0) & (each != 0))
            {
                mass5[b4] = each;
                b4++;
            }
        }
        for (int i = 0; i < a1; i++)
        {
            System.out.println(mass2[i]);
        }
        System.out.print("\n");
        for (int i = 0; i < a2; i++)
        {
            System.out.println(mass3[i]);
        }
        System.out.print("\n");
        for (int i = 0; i < a3; i++)
        {
            System.out.println(mass4[i]);
        }
        System.out.print("\n");
        for (int i = 0; i < a4; i++)
        {
            System.out.println(mass5[i]);
        }*/


        /*Задание 11 Напишите метод, который отображает горизонтальную или вертикальную линию из
        некоторого символа. Метод принимает в качестве параметра: длину линии, направление, символ.*/

        /*Scanner in1 = new Scanner(System.in);
        System.out.print("Введите длину линии: ");
        int a1 = in1.nextInt();
        Scanner in2 = new Scanner(System.in);
        System.out.print("Введите направление: ");
        int a2 = in2.nextInt();
        Scanner in3 = new Scanner(System.in);
        System.out.print("Введите символ: ");
        var a3 = in3.next();
        display1(a1, a2, a3);*/


        /*Задание 12 Напишите метод, сортирующий массив по убыванию
        или возрастанию в зависимости от выбора пользователя.*/

        /*Scanner in1 = new Scanner(System.in);
        System.out.print("Введите символ: ");
        int a1 = in1.nextInt();
        display2(a1);*/
    }
    /*static void display1(int a1, int a2, String a3)
    {
        switch (a2)
        {
            case 1:
                for(int i = 0; i < a1; i++)
                {
                    System.out.println(a3);
                }
                break;
            case 2:
                for(int i = 0; i < a1; i++)
                {
                    System.out.print(a3 + " ");
                }
                break;
        }
    }*/
    /*static void display2(int a1)
    {
        int masslength = 6;

        int[] array = new int[masslength];
        array[0] = 1;
        array[1] = 500;
        array[2] = 120;
        array[3] = 2;
        array[4] = 0;
        array[5] = -50;
        switch (a1)
        {
            case 1:
                for (int i = 0; i < array.length - 1; i++)
                {
                    for (int j = array.length - 1; j > i; j--)
                    {
                        if (array[j - 1] > array[j])
                        {
                            int tmp = array[j - 1];
                            array[j - 1] = array[j];
                            array[j] = tmp;
                        }
                    }
                }
                for (int index = 0; index < masslength; ++index)
                {
                    System.out.print(array[index] + "\n");
                }
                break;
            case 2:
                for (int i = 0; i < array.length - 1; i++)
                {
                    for (int j = array.length - 1; j > i; j--)
                    {
                        if (array[j - 1] < array[j])
                        {
                            int tmp = array[j - 1];
                            array[j - 1] = array[j];
                            array[j] = tmp;
                        }
                    }
                }
                for (int index = 0; index < masslength; ++index)
                {
                    System.out.print(array[index] + "\n");
                }
                break;
        }
    }*/
}