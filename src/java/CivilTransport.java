package java;

import java.util.Scanner;

public class CivilTransport extends AirTransport {
    int passengers;
    boolean businessCl;
    double answer;

    public void ScanCheckPassengers() {
        Scanner enteredPassengers = new Scanner(System.in);
        System.out.println("enter the number of passengers: ");
        passengers = Integer.parseInt(enteredPassengers.nextLine());
        System.out.println(checkingPassenger());
    }
    public void description() {
        this.power = 143;
        this.maxSpeed = 871;
        this.mark = "A321neo";
        this.weight = 93500;
        this.wingspan = 35.80;
        this.minRunwayLength = 300;
        this.businessCl = true;
        this.answer = 0.74 * power;
        System.out.println("[ The car: " + mark + ", power = " + power + ", maximum speed = " + maxSpeed +
                ", \nweight the car = " + weight + ", wingspan " + wingspan + ", minRunwayLength " +
                        minRunwayLength + ", businessCl = " + businessCl +
                ", power kilowatts = " + answer + " ]\n");
    }

    private String checkingPassenger() {
        if (passengers < 236) {
            return "Your Air is loaded";
        } else {
            return "You need a bigger Air";
        }
    }
}