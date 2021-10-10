public class Palindrome{
        public static void main(String[] args) {
            String s="";
            for (int i = 0; i < args.length; i++) {
                s = args[i];
                if (isPalindrome(s)) {
                    System.out.println("Слово"+" "+s+" "+"является палиндромом");
                } else {
                    System.out.println("Слово"+" "+s+" "+"не является палиндромом");
                }
            }
        }
        public static boolean isPalindrome(String s) {
            s=s.toLowerCase();
            if(s.equals(reverseString(s))){
                return true;
            }
            return false;
        }
        public static String reverseString(String L){//Метод перевората слова
            String l="";
            for (int n=L.length()-1;n>=0;n--){
                l+=L.charAt(n);
            }
            return l;
        }
    }

