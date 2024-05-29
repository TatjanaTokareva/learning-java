package classroom;

public class PezDispenser {

    private String modelName;

    private String color;

    private String serie;

    private final int maxCapacity = 10;

    private int currentAmtCandy;

    public PezDispenser(String modelName, String color, String serie) {
        this.modelName = modelName;
        this.color = color;
        this.serie = serie;
        this.currentAmtCandy = maxCapacity;
    }

    public PezDispenser() {
    }

    //getter

    public String getModelName() {
        return modelName;
    }

    public String getColor() {
        return color;
    }

    public String getSerie() {
        return serie;
    }

    public int getCurrentAmtCandy() {
        return currentAmtCandy;
    }

    @Override
    public String toString() {
        return "PezDispenser{" +
                "modelName='" + modelName + '\'' +
                ", color='" + color + '\'' +
                ", serie='" + serie + '\'' +
                ", currentAmtCandy=" + currentAmtCandy +
                '}';
    }

    //1. Take only 1 candy
    public void giveOne() {
        if (getCurrentAmtCandy() <= 0) {
            System.out.println("Not enough candy! Please refill");
        } else {
            currentAmtCandy--;
            System.out.println("One candy dispensed. Candies left: " + getCurrentAmtCandy());
        }
    }
    //2. Take more candies

    public void giveMore(int number) {
        if (number <= getCurrentAmtCandy()) {
            currentAmtCandy = currentAmtCandy - number;
            System.out.println(number + " candies dispensed. Candies left: " + getCurrentAmtCandy());
        } else {
            if (number >= getCurrentAmtCandy()) {
                System.out.println("Not enough candies to dispense. Please load candies");
            }
        }
    }

    //3. Load 1 candie
    public void loadOne(int loadNumber) {
        if (loadNumber >= maxCapacity) {
            System.out.println("Dispenser fully loaded. Candies: " + getCurrentAmtCandy());
        } else {
            if (currentAmtCandy <= maxCapacity) {
                currentAmtCandy ++;
                System.out.println(loadNumber + " candy loaded. Candies now:" + getCurrentAmtCandy());
            }

        }
    }
}