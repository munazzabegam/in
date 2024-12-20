import java.util.Scanner;

class Prime{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number: ");
        int num = sc.nextInt();

        if(isPrime(num)){
            System.out.println("It is a Prime number");
        }else{
            System.out.println("Not a Prime number");
        }
        
        sc.close();

    }

    public static boolean isPrime(int n){
        if (n<=1){
            return false;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i == 0){
                return false;
            } 
        }

        return true;
        
    }
}