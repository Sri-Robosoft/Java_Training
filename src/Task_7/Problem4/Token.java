package Task_7.Problem4;

public class Token {
    private boolean isTokenActive;

    Token() {
        this.isTokenActive = true;
    }

    public void setTokenActive(boolean tokenActive) {
        isTokenActive = tokenActive;
    }

    public void resetToken() {
        this.isTokenActive = true;
    }


    @Override
    public String toString() {
        return isTokenActive ? "Active" : "Inactive";
    }
}
