import java.util.Random;
public class Unit {
    protected int hp = 100;
    protected int mana = 100;
    protected int strength = 10;
    protected int critChance = 10;
    protected int countAttack;
    protected int numberCritAttack;

    public int getHp() {
        return hp;
    }
    public void setHp(int hp) {
        this.hp = hp;
    }
    public int getMana() {
        return mana;
    }
    public void setMana(int mana) {
        this.mana = mana;
    }
    public int getStrength() {
        return strength;
    }
    public void setStrength(int strength) {
        this.strength = strength;
    }
    public int getCritChance() {
        return critChance;
    }
    public void setCritChance(int critChance) {
        this.critChance = critChance;
    }

    protected boolean isCrit(int criticalChance) {
        countAttack++;
        Random random = new Random();
        if (countAttack == 100/criticalChance) countAttack = 0;
        if (countAttack == 0) {
            numberCritAttack = random.nextInt(9) + 1;
        }
        return countAttack == numberCritAttack;
    }

    public int attack() {
        if (isCrit(critChance)) {
            return strength*2;
        } else {
            return strength;
        }
    }

    public String type() {
        return "Unit";
    }
}
