package org.example;

public class MainProgram {
    public static void main(String[] args) {
        try {
            Person person = new Person("Alice", 25);
            System.out.println("Person created: " + person.getName() + ", " + person.getAge());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        Calculator calculator = new Calculator();
        try {
            System.out.println("Factorial of 5: " + calculator.factorial(5));
            System.out.println("Binomial Coefficient of (5, 3): " + calculator.binomialCoefficient(5, 3));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        StandardSensor ten = new StandardSensor(10);
        StandardSensor minusFive = new StandardSensor(-5);
        System.out.println(ten.read());
        System.out.println(minusFive.read());
        System.out.println(ten.isOn());
        ten.setOff();
        System.out.println(ten.isOn());


        TemperatureSensor tempSensor = new TemperatureSensor();
        tempSensor.setOn();
        System.out.println("Temperature: " + tempSensor.read());

        AverageSensor avgSensor = new AverageSensor();
        avgSensor.addSensor(new TemperatureSensor());
        avgSensor.addSensor(new TemperatureSensor());
        avgSensor.addSensor(new TemperatureSensor());
        avgSensor.setOn();
        System.out.println("Average Temperature: " + avgSensor.read());
        System.out.println("Readings: " + avgSensor.readings());
    }
}
