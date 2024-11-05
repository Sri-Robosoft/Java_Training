package Task_7.Problem4;

import java.util.*;

public class Player {
    private List<Token> tokenList = new ArrayList<>();

    public void createTokenList(int noOfTokens) {
        for(int i=0;i<noOfTokens;i++) {
            Token t = new Token();
            tokenList.add(t);
        }
    }

    public void showTokens() {
        System.out.println(tokenList.toString());
    }

    public void setTokensInactive(int idx) {
        tokenList.get(idx).setTokenActive(false);
    }

    public void resetTokens() {
//        for(Token t: tokenList) {
//            t.resetToken();
//        }
        tokenList.forEach(t->t.setTokenActive(true));
    }



}
