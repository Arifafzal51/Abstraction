abstract class Vehicle {
    int no_of_tyres;
    abstract void start();
}
class Car extends Vehicle
{
    void start() {
        System.out.println("Starts with key");
    }
}
class Scooter extends Vehicle{

    void start()
    {
        System.out.println("starts with kick");
    }

    public static void main(String[] args) {
       //    Vehicle v = new Vehicle();
        Car c = new Car();
        c.start();
        Scooter s = new Scooter();
        s.start();


    }
}