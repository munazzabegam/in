import java.util.Scanner;
class Palindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word: ");
        String str = sc.nextLine();
        String rstr = "";

        for(int i=str.length()-1;i>=0;i--){
            rstr += str.charAt(i);
        }

        if(str.equals(rstr)){
            System.out.println("Is Palindrome");
        }else {
            System.out.println("Not a Palindrome");
        }

    }
}