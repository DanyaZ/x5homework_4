public class SportCar extends Car {
    int LimitSpead;


    public SportCar(String CarName, String CarClass, int weight, Engine motor, int LimitSpead) {
        super(CarName, CarClass, weight, motor);
        this.LimitSpead = LimitSpead;
    }

    @Override
    public void start() {
        System.out.println("SportCar поехал");

    }

    @Override
    public void stop() {
        System.out.println("SportCar остановился");

    }

    @Override
    public void printInfo() {

        System.out.println("Название " + super.getCarName());
        System.out.println("Класс " + super.getCarClass());
        System.out.println("Вес " + super.getWeight());
        System.out.println("Мощность " + super.getMotor().power);
        System.out.println("Производитель " + super.getMotor().manufacturer);
        System.out.println("Скорость " + LimitSpead);

    }


}
