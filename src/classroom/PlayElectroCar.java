package classroom;

public class PlayElectroCar {
    public static void main(String[] args) {

        ElecrtoCar tesla  = new ElecrtoCar("Model S", "black");
        System.out.println(tesla.getModelName());
        System.out.println(tesla.getColor());
        System.out.println(tesla);

        tesla.drive();
        tesla.drive();
        tesla.drive();
        tesla.drive();
        tesla.drive();
        System.out.println(tesla.getCurrentEnergy());

        tesla.charge();
        System.out.println(tesla.getCurrentEnergy());

        tesla.charge();
        tesla.charge();
        System.out.println(tesla.getCurrentEnergy());

        tesla.drive(2);
        System.out.println(tesla.getCurrentEnergy());

        tesla.charge(4);
        System.out.println(tesla.getCurrentEnergy());
        tesla.charge(2);
        System.out.println(tesla.getCurrentEnergy());
        tesla.charge(20);
        System.out.println(tesla.getCurrentEnergy());

    }
}
