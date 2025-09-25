public class BadCar {
    public String color;
    public int speed;
    public String engineType;
    
    // Default constructor is implicitly provided by Java
    
    public void drive() {
        System.out.println(color + " car driving at " + speed + " km/h");
    }
    
    public void displayStatus() {
        System.out.println("Car Status: " + color + ", " + speed + " km/h, " + engineType);
    }
    
    public static void main(String[] args) {
        BadCar car = new BadCar(); // Using default constructor
        
        car.color = "Blue";
        car.speed = 60;
        car.engineType = "Petrol";
        car.drive();
        
        car.speed = -100;
        car.engineType = "Rocket";
        car.color = null;
        car.displayStatus();
    }
}
