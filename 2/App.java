public class App {
    public static void main(String[] args) {
        Car a = new SportCar("kia", "d", 15, new Engine(150, "fsfsdf"), 250);
        a.start();
        a.stop();
        a.turnLeft();
        a.turnRight();
        a.printInfo();
    }
}
