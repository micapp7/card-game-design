public class BlackJackTable extends Table {
    @Override
    CardGame createCardGame(GameType gameType) {
        switch (gameType) {
            case STANDARD_BLACKJACK:
                System.out.println("Creating StandardBlackJack game...");
                return new StandardBlackJack();
            case SPANISH_BLACKJACK:
                System.out.println("Creating SpanishBlackJack game...");
                return new SpanishBlackJack();
            default:
                return null;
        }
    }
}
