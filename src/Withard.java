public class Withard extends Unit {
    public Withard() {
        super.hp = 70;
        super.mana = 140;
        super.strength = 13;
        super.critChance = 15;
    }
    @Override
    public int attack() {
        super.mana -= 10;
        if (mana > 0)
            return super.attack();
        else {
            super.mana += 15;
            return 0;
        }
    }

    @Override
    public String type() {
        return "Withard";
    }
}
