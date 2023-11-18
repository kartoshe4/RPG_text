public class Until {
    public void Screensaver() {
        System.out.print("\n\n");
        System.out.print("╔════════════════════════════════════════════════╗\n" +
                         "║                                                ║\n" +
                         "║      Добро пожаловать на арену, путник         ║\n" +
                         "║                                                ║\n" +
                         "║       Здесь сражаются сильнейшие воины         ║\n" +
                         "║                света и тьмы                    ║\n" +
                         "║         ради звания                            ║\n" +
                         "║                     ВЕЛИЧАЙШЕГО ГЕРОЯ          ║\n" +
                         "║                                                ║\n" +
                         "║    Хотите попытать удачу? - Назовитесь         ║\n" +
                         "║                                                ║\n" +
                         "║          И да прибудет с вами сила             ║\n" +
                         "║                                                ║\n" +
                         "╚════════════════════════════════════════════════╝\n");
        System.out.println("\n\n");
    }
    public void Hello() {
        System.out.println("- Добро пожаловать, вы хотите попасть на арену? Прошу, назовите своё имя.");
    }
    public void Characterisic() {
        System.out.println("- Вот характеристики персонажей:\n" +
                "╔════════════════════════════════════════════════╗\n" +
                "║                                                ║\n" +
                "║   Knight:                                      ║\n" +
                "║ ╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌                   ║\n" +
                "║   Hp: 150;                                     ║\n" +
                "║   Mana: 0;                                     ║\n" +
                "║   Strength: 10                                 ║\n" +
                "║   Crit Chance: 10%.                            ║\n" +
                "║                                                ║\n" +
                "║   Withard:                                     ║\n" +
                "║ ╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌                   ║\n" +
                "║   Hp: 70;                                      ║\n" +
                "║   Mana: 140;                                   ║\n" +
                "║   Strength: 20                                 ║\n" +
                "║   Crit Chance: 50%.                            ║\n" +
                "║                                                ║\n" +
                "║   Terminator:                                  ║\n" +
                "║ ╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌                   ║\n" +
                "║   Hp: 150;                                     ║\n" +
                "║   Mana: 0;                                     ║\n" +
                "║   Strength: 10                                 ║\n" +
                "║   Crit Chance: 10%.                            ║\n" +
                "║                                                ║\n" +
                "╚════════════════════════════════════════════════╝\n");
    }

    public void ChooseHeroes() {
        System.out.println("- Выберете 3 своих героев: \n" +
                           "  • Knight - K;\n" +
                           "  • Withard - W;\n" +
                           "  • Terminator - T.\n");
    }

    public void StartBattle() {
        System.out.println(
                "╔════════════════════════════════════════════════╗\n" +
                "║                                                ║\n" +
                "║           Б О Й  Н А Ч И Н А Е Т С Я           ║\n" +
                "║                                                ║\n" +
                "╚════════════════════════════════════════════════╝\n");
    }

    public void choiseHero(Player player) {
        System.out.println("- " + player.name + ", выберете своего героя: ");
    }
    public void isDeath() {
        System.out.println("- Вы не можете выбирать уже выбывших героев");
    }

    public void isWinPlayer(Player player) {
        System.out.println("- " + player.name + ", поздравляю, вы одержали верх и теперь заслуживате звание ВЕЛИЧАЙШЕГО ГЕРОЯ");
    }
}
