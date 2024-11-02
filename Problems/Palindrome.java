class Palindrome {
    public static boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
            String str = Integer.toString(x);
            return str.equals(new StringBuilder(str).reverse().toString());
    }

    public static void main(String[] args){
        System.out.println(isPalindrome(121));
    }
}