package classroom;

public class ElecrtoCar {

    private String modelName;
    private String color;
    private final int MAX_ENERGY = 4;
    // Max energy should be 4 - Constanta;
    private int currentEnergy;

    public ElecrtoCar(String modelName, String color) {
        this.modelName = modelName;
        this.color = color;
        this.currentEnergy = MAX_ENERGY;
    }

    public ElecrtoCar() {
    }

    public String getModelName() {
        return modelName;
    }

    public String getColor() {
        return color;
    }

    public int getCurrentEnergy() {
        return currentEnergy;
    }

    @Override
    public String toString() {
        return "ElecrtoCar{" +
                "modelName='" + modelName + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    //Task 1: Create method with name :drive that will decrement energy for 1;
    public void drive() {
        if (getCurrentEnergy() <= 0) {
            System.out.println("Not enough energy, please charge me!");
        } else {
            System.out.println("Drive");
            currentEnergy--;
        }
    }
    //Task 2 : create method with name charge that fully restore energy count to 4;

    public void charge() {
        currentEnergy = MAX_ENERGY;
        System.out.println("Energy is full capacity now");
    }

    //Methods overloading;
    //Task 3: create method drive that will accept count and decrement accordingly

    public void drive(int energyCount) {
        if (energyCount > MAX_ENERGY) {
            System.out.println("Energy count cannot be greater than max energy");
        } else {
            if (currentEnergy - energyCount < 0) {
                System.out.println("Cant drive");
            } else {
                currentEnergy = currentEnergy - energyCount;
            }
        }
    }

    //Task 4: Create method with name charge that accepts energy count;
    public void charge(int energyCount) {
        if (energyCount > MAX_ENERGY) {
            System.out.println("Energy is more than max energy");
        } else {
            if (currentEnergy + energyCount > MAX_ENERGY) {
                System.out.println("Cant charge");
            } else {
                currentEnergy = currentEnergy + energyCount;
            }
        }
    }

}
