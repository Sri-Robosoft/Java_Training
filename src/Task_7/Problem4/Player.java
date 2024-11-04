package Task_7.Problem4;

import java.util.*;

public class Player {
    private List<Token> tokenList = new ArrayList<>();

    public void createTokenList(int noOfTokens) {
        for(int i=0;i<noOfTokens;i++) {
            tokenList.add(new Token());
        }
    }

    public void showTokens() {
        System.out.println(tokenList.toString());
    }

    public void setTokensInactive(int idx) {
        tokenList.get(idx).setTokenActive(false);
    }

    public void resetTokens() {
        for(Token t: tokenList) {
            t.resetToken();
        }
    }


}
