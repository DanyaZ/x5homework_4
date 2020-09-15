public abstract class Car {
    private String CarName;
    private String CarClass;
    private int weight;
    private Engine motor;


    public Car(String СarName, String CarClass, int weight, Engine motor) {
        this.CarName = СarName;
        this.CarClass = CarClass;
        this.weight = weight;
        this.motor = motor;
    }

    public String getCarName() {
        return CarName;
    }

    public String getCarClass() {
        return CarName;
    }

    public int getWeight() {
        return weight;
    }

    public Engine getMotor() {
        return motor;
    }

    public abstract void start();

    public abstract void stop();

    public void turnRight() {
        System.out.println("Поворот направо");
    }

    public void turnLeft() {
        System.out.println("Поворот налево");
    }

    public abstract void printInfo();
}
