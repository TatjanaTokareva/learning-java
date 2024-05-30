package classroom;

public class PlayPezDispenser {
    public static void main(String[] args) {
        PezDispenser dispenser = new PezDispenser("Mario", "Black", "xp1");
        System.out.println(dispenser);

        //try with 1 candy getting (cant get more than 10 candies)
        dispenser.giveOne();
        dispenser.giveOne();
        dispenser.giveOne();
        dispenser.giveOne();
        dispenser.giveOne();
        dispenser.giveOne();
        dispenser.giveOne();
        dispenser.giveOne();
        dispenser.giveOne();
        dispenser.giveOne();
        dispenser.giveOne();

        //Try with 1 candy loading (cant load more than 10 candies)
        dispenser.loadOne();
        dispenser.loadOne();
        dispenser.loadOne();
        dispenser.loadOne();
        dispenser.loadOne();
        dispenser.loadOne();
        dispenser.loadOne();
        dispenser.loadOne();
        dispenser.loadOne();
        dispenser.loadOne();
        dispenser.loadOne();

        // Try to take more than max candies,Try to take (n) candies:
        dispenser.giveMore(11);

        // Try to take (n) candies: can't take more than max = 10
        dispenser.giveMore(5);
        dispenser.giveMore(6);

        //Try to load more than max candies,Try to take (n) candies:
        dispenser.loadMore(13);

        //Try to load (n) candies: can't take more than max = 10
        dispenser.loadMore(4);
        dispenser.loadMore(4);
        dispenser.loadMore(4);

    }
}
