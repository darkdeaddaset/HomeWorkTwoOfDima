package com.savin.three.one;

public class Employee implements Measurable{
    private String name;
    private String company;
    private double salary;

    public Employee(String name,
                    String company,
                    double salary){
        this.name = name;
        this.company = company;
        this.salary = salary;
    }

    public Employee(){}

    public String getName() {
        return name;
    }

    public String getCompany() {
        return company;
    }

    @Override
    public double getMeasure() {
        /*
        * Вычисление премии
         */
        double p = salary * 0.3;
        double ndfl = (salary + p) * 0.13;

        return (salary + p) - ndfl;
    }

    public double getSalary(){
        return salary;
    }

    @Override
    public double average(Measurable[] objects) {
        double temp = 0;
        for (int i = 0; i < objects.length; i++){
            temp += objects[i].getSalary();
        }
        return temp/objects.length;
    }

    @Override
    public Measurable largest(Measurable[] objects) {
        Measurable result = null;

        for (int i = 0; i < objects.length; i++){
            for (int j = i + 1; j <= objects.length - 1; j++){
                if (objects[i].getSalary() < objects[j].getSalary()){
                    result = objects[j];
                }
                else {
                    result = objects[i];
                }
            }
        }
        return result;
    }
}

