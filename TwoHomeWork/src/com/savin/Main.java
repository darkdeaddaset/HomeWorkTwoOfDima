package com.savin;

import com.savin.one.eight.NonStringEmpty;
import com.savin.one.fourteen.TwoMassive;
import com.savin.one.six.Factorial;
import com.savin.one.thirteen.Lottery;
import com.savin.one.two.AngleNormalization;
import com.savin.three.four.IntSequence;
import com.savin.three.four.Sequence;
import com.savin.three.four.SequenceOne;
import com.savin.three.one.Employee;
import com.savin.three.one.Measurable;
import com.savin.two.five.Point;
import com.savin.two.nine.Car;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Angle();
        Lottery();
        Factorial();
        NonStringEmpty();
        TwoMassive();
        Point();
        Car();
        Employee();
        IntSequence();
    }

    private static void Angle(){
        System.out.println(AngleNormalization.normalizeFloor(360));
        System.out.println(AngleNormalization.normalizeFloor(380));
        System.out.println(AngleNormalization.normalizeFloor(-20));
        System.out.println(AngleNormalization.normalizeFloor(-1));
        System.out.println(AngleNormalization.normalizeFloor(-359));

        System.out.println(AngleNormalization.normalize360(360));
        System.out.println(AngleNormalization.normalize360(380));
        System.out.println(AngleNormalization.normalize360(-20));
        System.out.println(AngleNormalization.normalize360(-1));
        System.out.println(AngleNormalization.normalize360(-359));
    }
    private static void Lottery(){
        int[] a = Lottery.getMassOfNumber();

        int[] z = Lottery.generatedOFNumbers();

        for (int h : z){
            System.out.println(h);
        }

        System.out.println("=========================");
        int[] c = Lottery.deletedNumbers(a, z);
        for (int c1 : c){
            System.out.println(c1);
        }
    }
    private static void Factorial(){
        BigInteger integer = new BigInteger("1000");

        System.out.println(Factorial.factorial(1000));
        System.out.println(Factorial.factorial(integer));


        System.out.println("=============================");
    }
    private static void NonStringEmpty(){
        String s = "Привет, я Дима!";
        String s1 = " Этот мир жесток!    ";
        String s2 = "";
        String s3 = null;
        String s4 = " ";

        System.out.println(NonStringEmpty.substringNonEmpty(s));
        System.out.println(NonStringEmpty.substringNonEmpty(s1));
        System.out.println(NonStringEmpty.substringNonEmpty(s2));
        System.out.println(NonStringEmpty.substringNonEmpty(s3));
        System.out.println(NonStringEmpty.substringNonEmpty(s4));
    }
    private static void TwoMassive(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите числа: ");

        if (scanner.hasNextLine()){
            String number = scanner.nextLine();
            System.out.println("Numbers: " + number);

            if (number.isEmpty()) {
                System.out.println("Read Enter Key.");
                System.exit(0);
            }

            scanner.close();

            TwoMassive twoMassive = new TwoMassive(number);
            int[][] a = twoMassive.makeMassive();


            for (int[] i : a){
                for (int j : i){
                    System.out.print(j + "\t");
                }
                System.out.println();
            }

            int[] r = twoMassive.sumAllRows(a);
            int[] c = twoMassive.sumAllColumns(a);

            for (int z : r){
                System.out.println(z);
            }

            System.out.println("=============================");


            for (int x : c){
                System.out.println(x);
            }
            boolean g = twoMassive.checkAllSumRowsOrColumns(r);
            System.out.println(g);
            System.out.println(twoMassive.compareRowsAndColumns(a));

            System.out.println(twoMassive.getMainDiagonal(a));
            System.out.println(twoMassive.getSideDiagonal(a));
        } else {
            System.out.println("It`s not string");
        }
    }

    private static void Point(){
        Point point = new Point(3, 4);

        point.translate(1,3);

        point.scale(0.5);

        System.out.println(point.getX());
        System.out.println(point.getY());
    }
    private static void Car(){
        Car car = new Car(50);
        car.addGas(20);
        car.move(100);
        System.out.println(car.getGas());
        car.move(1000);
        System.out.println(car.getGas());
    }

    private static void Employee(){
        Employee employee = new Employee("Mustang", "Microsoft", 18000);
        System.out.println(employee.getMeasure());


        Employee employee1 = new Employee("Ida", "Microsoft", 1000);
        Employee employee2 = new Employee("Sally", "Orion Innovation", 2000);
        Employee employee3 = new Employee("Anton", "СБЕР", 3000);
        Employee employee4 = new Employee("Jill", "Effective Technology", 4000);
        Employee employee5 = new Employee("Isabella", "Теком", 5000);
        Employee employee6 = new Employee("Andrey", "BioWare", 6000);
        Employee employee7 = new Employee("Dima", "Netcraсker Technology", 7000);
        Measurable[] s = new Employee[]{employee1, employee2, employee3, employee4, employee5, employee6, employee7};
        Measurable measurable = new Employee();

        System.out.println(measurable.average(s));

        Employee temp = (Employee) measurable.largest(s);
        System.out.println(temp.getName());}
    private static void IntSequence(){
        Sequence sequence = Sequence.of(3,1,4,1,5,9);
        Sequence sequence1 = Sequence.constant(1);
        sequence.foreach();
        sequence1.foreach();
        SequenceOne sequenceOne = (x) -> x;
        System.out.println();
        for (int i = 0; i < 100; i++){
            System.out.print(sequenceOne.constantOne(1));
        }


        System.out.println();
        IntSequence intSequence = new IntSequence(3,1,4,1,5,9);
        intSequence.foreach();
        intSequence.constant(1);
    }
}