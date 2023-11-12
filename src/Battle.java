public class Battle {
    public static void battle(Unit unit1, Unit unit2) {
        // Действие для первого игрока
        if (unit1.isFrese) {
            unit1.isFrese = false;
        }
        unit1.getType();
        // Действия для второго игрока
        if (unit2.isFrese) {
            unit2.isFrese = false;
            if (unit1.isProtect) {

            }
        }
    }
}