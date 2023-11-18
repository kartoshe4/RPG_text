public class Knight extends Unit {
    public Knight() {
        super.hp = 160;
        super.mana = 0;
        super.strength = 10;
        super.critChance = 10;
    }

    @Override
    public String type() {
        return "Knight";
    }
}
