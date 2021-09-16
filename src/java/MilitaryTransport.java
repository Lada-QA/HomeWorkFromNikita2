package java;

import java.util.Scanner;

public class MilitaryTransport extends AirTransport {
    boolean catapult = true;
    int rockets;
    double answer;
    String halk = "OH, NO!!!HAAAAALK!!!";

    public void ScanShot() {
        Scanner enteredShot = new Scanner(System.in);
        System.out.println(this.halk +"Enter the number of missiles");
        rockets = Integer.parseInt(enteredShot.nextLine());
        System.out.println(shot());
        System.out.println("System of catapult: " + checkingCatapult());
        System.out.println(  attackHalk(this.catapult));
            }

    public void description() {
        this.wingspan = 48.1;
        this.minRunwayLength = 2240;
        this.weight = 171000;
        this.power = 7700;
        this.maxSpeed = 1010;
        this.mark = "Northrop B-2 Spirit";
        this.answer = 0.74 * power;
        System.out.println("[ The military transport: " + mark + ", power = " + power + ", maximum speed = " + maxSpeed +
                ", \nweight the car = " + weight + ", power kilowatts = " + answer +
                ", minimum runway length " + minRunwayLength + ", wingspan" + wingspan + "]\n");


    }

    private String shot() {
        if (rockets < 5) {
            return "The rocket went!";
        } else {
            return "There is no ammunition";
        }
    }

    private String checkingCatapult() {
        if (catapult = true) {
            return "The ejection was successful";
        } else {
            return "You don't have such a system";
        }
    }

    private String attackHalk(boolean catapult) {
        if (!catapult) {
            return "You died!!! You were attacked by the Halk";
        } else {
            return "You successfully ejected! The Halk didn't get you!\n";
        }
    }
}
