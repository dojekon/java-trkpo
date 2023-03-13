package lab3;

public class Lab3 {
    public static void main(String[] args) {
        Space space = new Space();
        
        for (int i = 1000; i <= 10000; i += 1000) {
            space.addSpaceship(new Spaceship(i));
        }

        space.listSpaceship();
        System.out.println("Mid speed of spaceships: " + space.midSpeed());
        System.out.println("Min speed of spaceships: " + space.minSpeed());
    }
}
