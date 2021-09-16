package java;

public class Main {
    public static void main(String[] args) {
        PassengerTransport passenger = new PassengerTransport();
        passenger.description();
        passenger.ScanTime();

        CargoTransport cargo = new CargoTransport();
        cargo.description();
        cargo.ScanLoadCapacity();

        CivilTransport civil = new CivilTransport();
        civil.description();
        civil.ScanCheckPassengers();

        MilitaryTransport military = new MilitaryTransport();
        military.description();
        military.ScanShot();
    }
}