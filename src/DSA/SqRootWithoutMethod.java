package DSA;

public class SqRootWithoutMethod {
    public static void main(String[] args) {
        System.out.println(sqroot(9));
    }

    private static int sqroot(int number) {
        double temp;
        int sr = number/2;
        do{
            temp = sr;
            sr = (int)(temp + (number/temp))/2;
        }while(temp-sr != 0);
        return sr;
    }
}
