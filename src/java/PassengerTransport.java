package java;

import java.util.Scanner;

public class PassengerTransport extends GroundTransport {
    String bodyType;
    public int passengers;
    public double kilometers;
    public int time;
    public int fuelConsumption;
    public double answer;

    public void ScanTime() {
        Scanner enteredTime = new Scanner(System.in);
        System.out.println("Enter the travel time: ");
        time = Integer.parseInt(enteredTime.nextLine());
        System.out.println(this.value());
    }

    public void description() {
        this.bodyType = "SUV";
        this.passengers = 5;
        this.power = 200;
        this.weight = 1445;
        this.maxSpeed = 183;
        this.mark = "Peugeot 3008";
        this.wheels = 4;
        this.answer = 0.74 * power;
        this.fuelConsumption = 22;
        System.out.println("[ The car: " + mark + " has wheels: " + wheels + ", body type - " + bodyType +
                ", power = " + power + ", maximum speed = " + maxSpeed + ", \nweight the car = " + weight +
                ", maximum passengers = " + passengers + ", power kilowatts = " + answer +
                ", fuel consumption per 100 kilometers " + fuelConsumption + " ]\n");
    }

    private String value() {
        kilometers = time * maxSpeed;
        return "During this time " + time + " hours the car Peugeot is moving at the maximum speed " +
                maxSpeed + " kl/h will overcome " + kilometers + " kilometers\n";
    }
}
