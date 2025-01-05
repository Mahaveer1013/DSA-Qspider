package QSpider;

public class NumberToSingleDigit {
    public static void main(String[] args) {
        System.out.println(convertToSingleDigit(1234567));
    }

    private static int convertToSingleDigit(int num) {
        if (num < 10) {
            System.out.println(num);
        }
        int sum = 0;
        while (num > 0) {
            sum += (num % 10);
            num /= 10;
        }
        if(sum>9){
            return convertToSingleDigit(sum);
        }else{
            return sum;
        }
    }
}
