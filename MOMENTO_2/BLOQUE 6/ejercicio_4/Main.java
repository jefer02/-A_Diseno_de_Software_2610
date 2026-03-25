public class Main {
    public static void main(String[] args) {
        // Prueba toString en cadena
        Animal a = new Animal("Generic");
        System.out.println(a);

        Mammal m = new Mammal("Mammal");
        System.out.println(m);

        Cat cat = new Cat("Whiskers");
        System.out.println(cat);

        Dog dog1 = new Dog("Rex");
        System.out.println(dog1);

        // Prueba greets
        System.out.println("\n--- Saludos ---");
        cat.greets();           // Meow

        dog1.greets();          // Woof

        Dog dog2 = new Dog("Buddy");
        dog1.greets(dog2);      // Woooof
    }
}
