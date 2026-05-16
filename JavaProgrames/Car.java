package JavaProgrames;

public class Car {
    private String brand;
    private String model;
    private int wheels;
    private String engine;
    // ...

    public Car(String brand, String model, int wheels, String engine) {
        this.brand = brand;
        this.model = model;
        setWheels(wheels);
        this.engine = engine;
    }

    public void setWheels(int wheels) {
        if (wheels == 4) {
            this.wheels = wheels;
        } else {
            throw new IllegalArgumentException("Invalid number of wheels. A car must have 4 wheels.");
        }
    }

    void drive(int distance) {
        System.out.println("Can can move upto "+  distance + " KMs");
    }

    void drive(String direction) {
        System.out.println("Turn the car "+  direction );
    }

    void drive(int distance, String direction) {
        System.out.println("Go " + distance + " KM and turn the car "+  direction );
    }

    void startEngine() {
        System.out.println("Start the " + engine + " engine");
    }

    String honk(int times) {
        return "HONK ".repeat(times);
    }

    void displayCar() {
        System.out.println("Car: " + brand + " " + model);
        System.out.println("This car has " + wheels + " wheels");
        System.out.println("Engine: " + engine);
    }

}

class ElectricCar extends Car {
    int batteryLevel;

    public ElectricCar(String brand, String model, int batteryLevel) {
        super(brand, model, 4, "Electric Motor");
        this.batteryLevel = batteryLevel;
    }
    
    public int getBatteryLevel() {
        return batteryLevel;
    }
}

class Main {
    public static void main(String[] args) {
        Car myCar = new Car("BMW", "m340i", 4, "3L 6 Cylinder");
        //myAnotherCar

        // Car[] myCars = new Cars[5];
        
        Car myAnotherCar = new Car("Honda", "Civic", 4, "2L");
        
        // myCar.drive(5);
        myCar.displayCar();
        myCar.drive(5);
        myCar.startEngine();
        System.out.print(myCar.honk(3));
        
        System.out.print("\n \n");

        myAnotherCar.displayCar();

        myAnotherCar.drive("left");
        myAnotherCar.startEngine();
        System.out.print(myAnotherCar.honk(5));

        System.out.print("\n \n");


        ElectricCar myEv = new ElectricCar("Tesla", "Model Y", 90);

        myEv.displayCar();

        System.out.print("\n \n");
        myEv.drive(10,"right");
        System.out.print("\n \n");

        System.out.println(myEv.getBatteryLevel());
    }
}