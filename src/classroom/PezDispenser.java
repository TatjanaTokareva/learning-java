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
            System.out.println("No more candies! Please refill");
        } else {
            currentAmtCandy--;
            System.out.println("One candy dispensed. Candies left: " + getCurrentAmtCandy());
        }
    }

    //2. Load one candy
    public void loadOne() {
        if (currentAmtCandy == maxCapacity) {
            System.out.println("Dispenser is full");
        } else {
            currentAmtCandy = currentAmtCandy + 1;
            System.out.println("One candy loaded, candies now: " + getCurrentAmtCandy());
        }
    }

    //3. Take (n) candies
    public void giveMore(int numberGive) {
        if (numberGive > maxCapacity) {
            System.out.println("Cant take candies greater than max = " + maxCapacity);
        } else {
            if (currentAmtCandy - numberGive < 0) {
                currentAmtCandy=0;
                System.out.println("No more candies, please refill");
            } else {
                currentAmtCandy = currentAmtCandy - numberGive;
                System.out.println(numberGive + " candies dispensed. Candies left: " + getCurrentAmtCandy());
                ;
            }
        }
    }

    //4. Load (n) candies
    public void loadMore(int numberLoad) {
        if (numberLoad > maxCapacity) {
            System.out.println("Cant load candies greater than max = " + maxCapacity);
        } else {
            if (currentAmtCandy + numberLoad >= 10) {
                System.out.println("Dispenser is full, cant load more");
            } else {
                currentAmtCandy = currentAmtCandy + numberLoad;
                System.out.println(numberLoad + " candies loaded, candies now: " + getCurrentAmtCandy());
            }
        }
    }
}