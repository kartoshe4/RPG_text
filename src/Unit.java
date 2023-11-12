import java.util.Random;
public class Unit {
    protected String characterName; // Имя героя
    protected int hp = 100;
    protected int str = 10;
    protected int power = 10;
    protected final float criticalChance = 0.1f;
    protected int countAttack;
    protected int numberCritAttack;

    // Состояния героя
    protected boolean isFrese;
    protected boolean isProtect;
    protected boolean isEvasion;

    protected int getHp() {
        return hp;
    }
    protected void setHp(int hp) {
        this.hp = hp;
    }
    protected int getStr() {
        return str;
    }
    protected void setStr(int str) {
        this.str = str;
    }
    protected int getPower() {
        return power;
    }
    protected void setPower(int power) {
        this.power = power;
    }
    public Unit(String characterName, char unitType) {
        this.characterName = characterName; // Получние имени героя
        switch (unitType) {
            case 'W':
                Withard withard = new Withard(characterName);
                break;
            case 'K':
                //this.unit_type = "Knight";
                break;
            case 'A':
                //this.unit_type = "Artificer";
                break;
        } // Назначение типа героя
    } // Информация о герое
    protected int attack(int attackType) {
        switch (attackType) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
        }
        if (isCrit(criticalChance)) return str*2;
        else return str;
    } // Атака героя
    protected boolean isCrit(float criticalChance) {
        countAttack++;
        Random random = new Random();
        if (countAttack == (int)(1/criticalChance)) countAttack = 0;
        if (countAttack == 0) {
            numberCritAttack = random.nextInt(9) + 1;
        }
        return countAttack == numberCritAttack;
    } // Проверка на крит
    public void getType() {
        System.out.println(" ");
    }
}