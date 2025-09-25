// BAD CAR (Not Encapsulated)
public class BadCar {
    public String color;
    public int speed;
    public String engineType;

    public void displayStatus() {
        System.out.println("Car Status: " + color + ", " + speed + " km/h, " + engineType);
    }

    public static void main(String[] args) {
        BadCar car = new BadCar();
        // Invalid usage - direct field access allows this
        car.speed = -100; // Negative speed!
        car.engineType = "Rocket"; // Invalid engine type!
        car.color = null; // Null color!
        car.displayStatus(); // Outputs nonsense
    }
}
