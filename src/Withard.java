public class Withard extends Unit {
    public Withard(String characterName) {
        super(characterName, 'W'); // Вызов конструктора суперкласса
        super.setHp(100);
        super.setStr(2);
        super.setPower(100);
    }

    @Override
    public void getType() {
        System.out.println("W");
    }

    @Override
    protected int attack(int attackType) {
        switch (attackType) {
            case 1: // fireball
                isEvasion = true;
                if (isCrit(criticalChance))
                    return 20;
            case 2: // ice ray
                isFrese = true;
                break;
            case 3:
                break;
        }
        if (isCrit(criticalChance)) return str * 2;
        else return str;
    }
}
