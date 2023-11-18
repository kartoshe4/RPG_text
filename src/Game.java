import java.util.Scanner;
public class Game {
    Scanner in = new Scanner(System.in);
    public Game() {
        Until until = new Until();
        until.Screensaver();
        until.Hello();

        String name = in.next();
        Player player1 = new Player(name);

        until.Hello();
        name = in.next();
        Player player2 = new Player(name);

        until.Characterisic();
        until.ChooseHeroes();

        player1.setHero(in.next());
        player2.setHero(in.next());

        until.StartBattle();
        boolean isWinPlayer1 = false;
        boolean isWinPlayer2 = false;

        int numUnit1;
        int numUnit2;

        while (true) {
            isWinPlayer1 = true;
            isWinPlayer2 = true;
            for (int i = 0; i < player1.hero.size(); i++) {
                if ((player1.hero.get(i).getHp() > 0)) {
                    isWinPlayer2 = false;
                }
                if ((player2.hero.get(i).getHp() > 0)) {
                    isWinPlayer1 = false;
                }
            }
            if (isWinPlayer1 || isWinPlayer2) break;
            until.choiseHero(player1);
            numUnit1 = in.nextInt()-1;
            while (player1.hero.get(numUnit1).getHp() <= 0) {
                until.isDeath();
                until.choiseHero(player1);
                numUnit1 = in.nextInt()-1;
            }
            until.choiseHero(player2);
            numUnit2 = in.nextInt()-1;
            while (player2.hero.get(numUnit2).getHp() <= 0) {
                until.isDeath();
                until.choiseHero(player2);
                numUnit2 = in.nextInt()-1;
            }
            Battle battle = new Battle(player1.hero.get(numUnit1), player2.hero.get(numUnit2));
        }
        if (isWinPlayer1) until.isWinPlayer(player2);
        if (isWinPlayer2) until.isWinPlayer(player2);
    }
}
