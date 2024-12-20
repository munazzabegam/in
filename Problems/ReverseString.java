import java.util.Scanner;

class ReverseString{
    public static void main (String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter a word: ");
    String str = sc.nextLine();

    String reverseStr="";

    for(int i=str.length()-1;i>=0;i--){
        reverseStr += str.charAt(i);
    }

    System.out.println("Reverse String: "+ reverseStr);
}
}