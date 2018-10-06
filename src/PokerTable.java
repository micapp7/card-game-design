public class PokerTable extends Table {
    @Override
    CardGame createCardGame(GameType gameType) {
        switch (gameType) {
            case TEXAS_HOLDEM:
                System.out.println("Creating TEXAS_HOLDEM Poker game...");
                return new StandardBlackJack();
            case OMAHA:
                System.out.println("Creating OMAHA Poker game...");
                return new SpanishBlackJack();
            default:
                return null;
        }
    }
}
