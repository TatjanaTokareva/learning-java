package classroom;

public class PlayPezDispenser {
    public static void main(String[] args) {
        PezDispenser dispenser = new PezDispenser("Mario", "Black", "xp1");
        System.out.println(dispenser);

        dispenser.giveMore(3);
        dispenser.loadOne(6);
    }
}
