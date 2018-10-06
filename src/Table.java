public abstract class Table {
    CardGame cardGame;

    public final CardGame InitializeGame(GameType gameType) {
        cardGame = createCardGame(gameType);

        cardGame.deal();

        return cardGame;
    }

    abstract CardGame createCardGame(GameType gameType);
}
