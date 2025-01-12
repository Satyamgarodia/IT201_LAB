package riyab;
interface MotorBike {
    void displaySpeed();
    void setSpeed(int speed);
}

interface Cycle {
    void displayDistance();
    void setDistance(int distance);
}

class TwoWheeler implements MotorBike, Cycle {
    private int speed;
    private int distance;

    public TwoWheeler() {
        this.speed = 60;
        this.distance = 120;
    }

    public void displaySpeed() {
        System.out.println("Speed of the TwoWheeler is " + speed + " km/h");
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void displayDistance() {
        System.out.println("Distance covered by the TwoWheeler is " + distance + " km");
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }
}

public class q21 {
    public static void main(String[] args) {
        TwoWheeler obj = new TwoWheeler();
        obj.displaySpeed();
        obj.displayDistance();

        obj.setSpeed(80);
        obj.setDistance(150);

        System.out.println("Updated Speed and Distance:");
        obj.displaySpeed();
        obj.displayDistance();
    }
}