package OOPs.Assignment3_interface;

public class p1 {
    public static void main(String[] args) {
        System.out.println("Testing Bicycle:");
        Bicycle b1 = new Bicycle();
        b1.changeGear();
        b1.changeGear();
        b1.changeGear(); // Max gear

        System.out.println();
        System.out.println("Testing Bike:");
        Bike bike = new Bike();
        bike.changeGear();
        bike.changeGear();
        bike.changeGear();
        bike.changeGear(); // Max gear

        System.out.println();
        System.out.println("Testing Car:");
        Car car = new Car();
        car.changeGear();
        car.changeGear();
        car.changeGear();
        car.changeGear();
        car.changeGear();
        car.changeGear(); // Max gear
    }
}

interface vehicle {
    void changeGear();
}

class Bicycle implements vehicle{
    int gear;
    static final int maxGear = 2;

    public void changeGear(){
        if (gear == maxGear){
            System.out.println("Max gear reached");
            return;
        }
        gear++;
        System.out.println("Bicycle gear changed to " + gear);
    }
}

class Car implements vehicle{
    int gear;
    static final int maxGear = 5;

    public void changeGear(){
        if (gear == maxGear){
            System.out.println("Max gear reached");
            return;
        }
        gear++;
        System.out.println("Car gear changed to " + gear);
    }
}

class Bike implements vehicle{
    int gear;
    static final int maxGear = 3;

    public void changeGear(){
        if (gear == maxGear){
            System.out.println("Max gear reached");
            return;
        }
        gear++;
        System.out.println("Bike gear changed to " + gear);
    }
}
