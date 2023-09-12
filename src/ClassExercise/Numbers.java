package ClassExercise;

public class Numbers {

    public static int sumOfDigits(int number){
        int num = 0;
        if(10<=number && number <= 99) {
            String digits = Integer.toString(number);
            char[] digitsArray = digits.toCharArray();
            for (char c : digitsArray) {
                num += Character.getNumericValue(c);
            }
            return num;
        }else return -1;

    }

    public static void main(String[] args) {
        System.out.println(sumOfDigits(74));
        System.out.println(sumOfDigits(111));
    }
}
