public class Monster {
    private String name;
    private int rarity;

    public Monster() {
        this.name = "シーサーペント";
        this.rarity = 1;
    }

    public String toString() {
        return this.name + ":レア度[" + this.rarity + "]";
    }
}
