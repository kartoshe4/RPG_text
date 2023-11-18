import java.util.*;

public class Player {
    public String name;

    public Player(String name) {
        this.name = name;
    }

    public ArrayList<Unit> hero;
    {
        hero = new ArrayList<>();
    }

    public void setHero(String heroType) {
        for (int i = 0; i < 3; i++) {
            switch (heroType.charAt(i)) {
                case 'K':
                    hero.add(new Knight());
                    break;
                case 'W':
                    hero.add(new Withard());
                    break;
                case 'T':
                    hero.add(new Terminator());
                    break;
            }
        }
    }
}
