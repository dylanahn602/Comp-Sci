public class Ball {
    private String sport;
    private double heightInCM;
    private String color;
    private boolean inflated;
    private int numTimesUsed;
    private boolean isClean;
    private int GamesToday;

    Ball() {
        sport = "Baseball";
        heightInCM = 15.2;
        color = "White";
        inflated = true;
        numTimesUsed = 4;
        isClean = true;
        GamesToday = 3;
    }

    public void playWith() {
        System.out.println("Lets play " + sport);
        if (isClean = true) {
            isClean = false;
        }
        numTimesUsed += 1;
    }
    public void pop() {
        if (inflated = true) {
            inflated = false;
        }
    }

    public void inflate() {
        if (inflated = false) {
            inflated = true;
        }
    }

    public void pickUp() {

    }

    public void checkStats() {
        System.out.println("Sport: " + sport);
        System.out.println("Height: " + heightInCM);
        System.out.println("Color: " + color);
        System.out.println("Number of Times Used: " + numTimesUsed);
        System.out.println("Inflated: " + inflated);
        System.out.println("Is Clean: " + isClean);
        
    }

    public void GamesToday () {
        System.out.println("Number of Games today: " + GamesToday);
    }

    public void setGamesToday (int GamesTomorrow) {
        GamesToday = GamesTomorrow;
    }

    public int getGamesToday () {
        return GamesToday;
    }

}
