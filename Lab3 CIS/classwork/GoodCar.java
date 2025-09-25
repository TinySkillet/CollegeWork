// GOOD CAR (Encapsulated)
class GoodCar {
    private String color;
    private int speed;

    public void setSpeed(int s) {
        if (s >= 0)
            speed = s; // Validation!
    }

    public int getSpeed() {
        return speed;
    }

    public String getColor() {
        return color;
    }
    // ... other getters/setters ...
}
