public class Terminator extends Unit {

    public Terminator() {
        super.hp = 110;
        super.mana = 70;
        super.strength = 18;
        super.critChance = 30;
    }

    @Override
    public int attack() {
        if (mana >= 10) {
            super.mana -= 10;
            return super.attack();
        } else {
            super.mana += 5;
            return 0;
        }
    }

    @Override
    public String type() {
        return "Terminator";
    }

}
