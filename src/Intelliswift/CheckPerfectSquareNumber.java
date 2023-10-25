package src.Intelliswift;

/**
 * The value atleast consists of 1 perfect square
 * input - 224
 * Perfect Square
 *
 * input - 225
 * Not a perfect square
 */
public class CheckPerfectSquareNumber {
    public static void main(String[] args) {
        int num = 229;
        String s = perfectSquareNumber(num);
        System.out.println("s = " + s);
    }

    public static String perfectSquareNumber(int n){
        int[] perfectSquare = {1,4,9};
        for(int square : perfectSquare){
            if(String.valueOf(n).contains(String.valueOf(square))){
                return "Perfect square";
            }
        }
        return "Not a perfect square";
    }
}
