package QSpider;

import java.util.Scanner;

public class EB_Bill {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter units consumed: ");
        int ec = scanner.nextInt();
        if(ec>500){
            System.out.println(ec*12);
        }else if(ec>300){
            System.out.println(ec*10);
        }else if(ec > 100){
            System.out.println(ec*8);
        }else if(ec>0){
            System.out.println(ec*5);
        }else{
            System.out.println("Invalid");
        }
    }
}
