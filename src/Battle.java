public class Battle {
    public Battle(Unit unit1, Unit unit2) {
        while (true) {
            System.out.println("Unit1 - " + unit1.type() + ":\n" +
                    "   hp: " + unit1.getHp() + "\n" +
                    "   mana: "+ unit1.getMana() + "\n");
            System.out.println("Unit2 - " + unit2.type() + ": " + unit2.getHp());
            unit2.setHp(unit2.getHp() - unit1.attack());
            if (!(unit2.getHp() > 0)) break;
            unit1.setHp(unit1.getHp() - unit2.attack());
            if (!(unit1.getHp() > 0)) break;

        }
        if (!(unit2.getHp() > 0)) System.out.println("Win unit 1");
        else System.out.println("Win unit 2");
    }
}