package lab3;

import java.util.ArrayList;
import java.util.List;

public class Space {
    List<Spaceship> space = new ArrayList<Spaceship>();

    public void addSpaceship(Spaceship a) {
        this.space.add(a);
    }

    public void removeSpaceship(Spaceship a) {
        if (space.size() > 0) {
            this.space.remove(a);
        }
    }

   public void listSpaceship() {
    if (space.size() > 0) {
        for (int i = 0; i < space.size(); i++) {
            System.out.println("Spaceship " + (i+1) + ". Speed: " + this.space.get(i).getSpeed());
        }
    }
   }

   public float midSpeed() {
    if (space.size() > 0) {
        float sumSpeed = 0;
        for (Spaceship spaceship : space) {
            sumSpeed += spaceship.getSpeed();
        }
        return sumSpeed / space.size();
    }
    return 0;
   }

   public int minSpeed() {
    if (space.size() > 0) {
        int min = 0;
        min = space.get(0).getSpeed();
        for (Spaceship spaceship : space) {
            if (spaceship.getSpeed() < min) min = spaceship.getSpeed();
        }
        return min;
    }
    return 0;
   }
}
