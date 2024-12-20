import java.util.Scanner;

class Fibonacci{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int first = 0;
        int next = 1;

        while(next<n){
            next = first + sec;
            System.out.print(next+", ");
            first = sec;
            sec = next;
 
        }
        
    }
    
}