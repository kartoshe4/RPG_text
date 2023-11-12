public class Game {
    public Game() {
        Player player1 = new Player("Gregory");
        Player player2 = new Player("Stef");
        player1.setNew_unit('W', "Gerundyi");
        player1.setNew_unit('W', "Gerundyi");
        player1.setNew_unit('W', "Gerundyi");
        player2.setNew_unit('W', "FuckingSlaves");
        player2.setNew_unit('W', "FuckingSlaves");
        player2.setNew_unit('W', "FuckingSlaves");
        Battle.battle(player1.getUnit(0), player2.getUnit(0));
    }
}
