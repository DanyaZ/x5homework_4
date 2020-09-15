public class Lorry extends Car {
    int LiftingCapacity;

    public Lorry(String СarName, String CarClass, int weight, Engine motor, int LiftingCapacity) {
        super(СarName, CarClass, weight, motor);
        this.LiftingCapacity = LiftingCapacity;
    }

    @Override
    public void start() {
        System.out.println("Грузовик поехал");

    }

    @Override
    public void stop() {
        System.out.println("Грузовик остановился");

    }

    @Override
    public void printInfo() {
        System.out.println("Название " + super.getCarName());
        System.out.println("Класс " + super.getCarClass());
        System.out.println("Вес " + super.getWeight());
        System.out.println("Мощность " + super.getMotor().power);
        System.out.println("Производитель " + super.getMotor().manufacturer);
        System.out.println("Грузоподъемность " + LiftingCapacity);

    }

}
