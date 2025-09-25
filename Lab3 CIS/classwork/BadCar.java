// Not Encapsulated
public class BadCar{
    public String color;
    public int speed;
    public String engineType;

     public BadCar() {
        // Empty constructor - fields will have default values (null, 0, null)
        System.out.println("Default constructor called - creating a car with no specifications");
    }

      // 2. Defined Constructor with parameters
    public BadCar(String color, int speed, String engineType) {
        this.color = color;
        this.speed = speed;
        this.engineType = engineType;
        System.out.println("Parameterized constructor called - creating a " + color + " car");
    }

    public void drive() {
        System.out.println(color + " car driving at " + speed + " km/h");
    }

    public void displayStatus(){
        System.out.println("Car Status " + color + ", " + speed + " km/h, " + engineType);
    }

    public static void main(String[] args){
        System.out.println("=== Using Default Constructor ===");
        BadCar car1 = new BadCar(); // Using explicit default constructor
        car1.color = "Blue";
        car1.speed = 60;
        car1.engineType = "Petrol";
        car1.drive();
        
        System.out.println("\n=== Using Defined Constructor ===");
        BadCar car2 = new BadCar("Red", 80, "Diesel"); // Using parameterized constructor
        car2.drive();

        System.out.println("\n=== Breaking the Car ===");
        car2.speed = -100;
        car2.engineType = "Rocket";
        car2.color = null;
        car2.displayStatus();
    }
    
}