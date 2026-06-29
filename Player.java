public class Player {
    private Monster[] deck;

    public Player() {
        this.deck = new Monster[5];
    }

    public void drawMonsters() {
        for (int i = 0; i < deck.length; i++) {
            deck[i] = new Monster();
        }
    }

    public void showDeck() {
        for (int i = 0; i < deck.length; i++) {
            System.out.println(deck[i].toString());
        }
    }
}
