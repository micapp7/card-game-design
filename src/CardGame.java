public abstract class CardGame {
    String name;

    // Subclass will choose which game to play
    public abstract void beginPlay();

    public void deal() {
        System.out.println("Dealing for " + name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
