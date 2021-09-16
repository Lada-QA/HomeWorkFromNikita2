package java;

import java.util.Scanner;

public class CargoTransport extends GroundTransport {
    int loadCapacity;
    double answer;

    public void ScanLoadCapacity() {
        Scanner enteredValue = new Scanner(System.in);
        System.out.println("Enter the weight of the cargo: ");
        loadCapacity = Integer.parseInt(enteredValue.nextLine());
        System.out.println(checkingCapacity() + "\n");
    }

    public void description() {
        this.power = 180;
        this.weight = 8250;
        this.maxSpeed = 170;
        this.mark = "МАЗ-5440М9";
        this.wheels = 10;
        this.answer = 0.74 * power;
        this.fuelConsumption = 27;
        System.out.println("[ The car: " + mark + " has wheels: " + wheels +
                ", power = " + power + ", maximum speed = " + maxSpeed + ", \nweight the car = " + weight +
                ", power kilowatts = " + answer + ", fuel consumption per 100 kilometers " + fuelConsumption + "]\n");
    }

    private String checkingCapacity() {
        if (loadCapacity < 40000) {
            return "Your truck is loaded";
        } else {
            return "You need a bigger truck";
        }
    }
}
