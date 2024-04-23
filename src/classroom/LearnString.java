package classroom;

import java.util.Locale;

public class LearnString {
    public static void main(String[] args) {

        //Stirng
        String name = "Tatjana";
        String lastName = "Tokareva";

        System.out.println(name);
        System.out.println(lastName);

        //Exercise: Print name and surname (Example: "Jonh Doe")
        //Concatenation
        String fullName = name + " " + lastName;
        System.out.println(fullName);

        //Same example
        System.out.println(name + " " + lastName);

        System.out.println(String.format("%s %s",name, lastName));

        //Can save into
        String myFullName = String.format("%s %s",name, lastName);
        System.out.println(myFullName);

        //Hello, world!
        String hello = "Hello, ";
        String world = "world!";

        String helloWorld = hello.concat(world);
        System.out.println(helloWorld);

        //Exercise:
        //Step 1: string = name;
        //Step 2:  string = java;
        //Step 3:  concat two string, to message "My name is {name}. i love coding in {language}
        //Step 4: print;


        String language = "Java";
        System.out.println("My name is " + name + ", I love programming in " + language);

        String randomString = "some text";
        System.out.println(randomString.toUpperCase());



    }
}
