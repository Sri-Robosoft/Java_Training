package Task_7.Problem4;

public class Problem4 {
    public static void main(String[] args) {

        Player p = new Player();

        p.createTokenList(5);
        p.showTokens();

        p.setTokensInactive(4);
        p.setTokensInactive(1);
        p.showTokens();

        p.resetTokens();
        p.showTokens();

    }
}
