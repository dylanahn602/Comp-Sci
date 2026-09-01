public class Unit0Exercises {
    public static void main(String[] args) {
        int score = 85;
        double price = 19.99;
        boolean isPassing = true;

        System.out.println("---Variable Snapshot---");
        System.out.print("Score: ");
        System.out.println(score);
        System.out.print("Price: ");
        System.out.println(price);
        System.out.print("Passing: ");
        System.out.println(isPassing);
        
        score = 90;
        price = 22.49;
        isPassing = false;
        
        System.out.println("---After Updates---");
        System.out.print("Score: ");
        System.out.println(score);
        System.out.print("Price: ");
        System.out.println(price);
        System.out.print("Passing: ");
        System.out.println(isPassing);
    }
}
