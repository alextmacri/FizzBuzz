public class Multiples {

    public static void main(String[] args) {
        int n = 1000;

        int multiplesOfThree = (int) Math.floor(n / 3.0);
        int multiplesOfFive = (int) Math.floor(n / 5.0);

        int multiplesOfThreeOrFive = multiplesOfThree + multiplesOfFive;
        System.out.println(multiplesOfThreeOrFive);
    }
}
