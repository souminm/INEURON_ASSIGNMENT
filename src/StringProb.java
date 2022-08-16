import java.util.Scanner;

public class StringProb {
    //3 Sorting Method for checking Anagram
    public static String checkSort(String s1){
        String sorted_str = "";
        char ch[] = s1.toCharArray();
        char temp;
        for(int i =0;i<ch.length;i++){
            for(int j=i+1;j<ch.length;j++){
                if(ch[i]>ch[j])
                {
                    temp = ch[i];
                    ch[i]=ch[j];
                    ch[j] = temp;
                }

            }
            sorted_str = sorted_str + ch[i];
        }
        return sorted_str;

    }
    public static void main(String[] args) {
        //1 WAP to reverse a String
        String s ="";
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Enter a string to do reverse operation-");
        String str = sc.nextLine();
        for(int i = str.length() -1;i>=0;i--){
            s= s+str.charAt(i);
        }
        System.out.println(s);
        //2 Reverse a sentence while preserving the position
        String s1 = "";
        System.out.println("2.Enter a sentence of String to reverse each word-");
        String str1 =sc.nextLine();
        String strArr[] = str1.split(" ");
        for(int i=0;i<strArr.length;i++){
            for(int j=strArr[i].length() -1 ;j>=0;j--) {
                s1 = s1 + strArr[i].charAt(j);
            }
            s1 = s1+" ";
        }
        System.out.println(s1);

        //3.Check if the String is Anagram or not
        //Sort and check if the strings are equal or not, if equal then they both are anagrams of each other.
        System.out.println("3.Enter first string to be checked as Anagram-");
        String anagram_str_1 = sc.nextLine();
        System.out.println("3.Enter Second sting to be checked as Anagram-");
        String anagram_str_2 = sc.nextLine();
        if(checkSort(anagram_str_1).equals((checkSort(anagram_str_2)))){
            System.out.println("Given String is anagram");
        }
        else{
            System.out.println("Strings are not anagram");
        }

        //4.String is Pangram or not
        char arr_ch[] = new char[26];






    }
}
