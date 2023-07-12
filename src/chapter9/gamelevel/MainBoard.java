package chapter9.gamelevel;

public class MainBoard {
    public static void main(String[] args) {
        Player player = new Player();
        player.play(1);

        AdvancedLevel adLevel = new AdvancedLevel();
        player.upgradeLevel(adLevel);
        player.play(2);

        SuperLevel spLevel = new SuperLevel();
        player.upgradeLevel(spLevel);
        player.play(3);
    }
}
