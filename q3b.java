package it201;

interface MotorBike {
    void displaySpeed();
}

interface Cycle {
    void displayDistance();
}

class TwoWheeler implements MotorBike, Cycle {
    public void displaySpeed() {
        System.out.println("Speed of the TwoWheeler is 60 km/h");
    }

    public void displayDistance() {
        System.out.println("Distance covered by the TwoWheeler is 120 km");
    }
}

public class q3b {
    public static void main(String[] args) {
        TwoWheeler obj = new TwoWheeler();
        obj.displaySpeed();
        obj.displayDistance();
    }
}
