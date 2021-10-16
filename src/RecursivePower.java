import java.util.Scanner;

public class RecursivePower {
    static int Power(int sub,int power){
        int num1=sub,num2=power;
        if(num2==0){return 1;}
        return Power(num1,num2-1)*num1;
    }
    public static void main(String[] args) {
        int sub,power;

        Scanner input=new Scanner(System.in);
        System.out.print("Enter a sub number : ");
        sub=input.nextInt();
        System.out.print("Enter a power number :  ");
        power=input.nextInt();

        System.out.println(sub+"^"+power+"="+Power(sub,power));

    }
}
