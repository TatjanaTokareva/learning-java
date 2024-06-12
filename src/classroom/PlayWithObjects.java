package classroom;

public class PlayWithObjects {
    public static void main(String[] args) {

        Animal barsik = new Animal();
        System.out.println(barsik.getName());

        barsik.setName( "Barsik");
        barsik.setAge(1);
        barsik.setColor("Gray");
        System.out.println(barsik.getName());

        Animal leo = new Animal();
        leo.setName("Leo");
        leo.setAge(2);
        leo.setColor("Ginger");
        System.out.println(leo.getName());

        System.out.println(barsik);
        System.out.println(leo);

        barsik.walk();
        leo.walk();

        barsik.eat();
        leo.eat();

        //create 2 object
        //uptdate info
        //call walk and eat

        Animal krisa = new Animal();
        krisa.setName("Krisa");
        krisa.setAge(3);
        krisa.setColor("Black");

        System.out.println(krisa.getName());
        krisa.eat();
        krisa.walk();

        Animal monkey = new Animal();
        monkey.setName("Boonie");
        monkey.setAge(10);
        monkey.setColor("Brown");

        System.out.println(monkey.getName());
        monkey.eat();
        monkey.walk();
    }

}
