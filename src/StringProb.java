import java.util.Scanner;
//Author - Soumin Mohanty
//date - 17 -Aug - 2022
public class StringProb {
    //3, 6. Sorting Method for checking Anagram and problem no 6 Albhabetically sorting.
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
        System.out.println("  Enter Second sting to be checked as Anagram-");
        String anagram_str_2 = sc.nextLine();
        if(checkSort(anagram_str_1).equals((checkSort(anagram_str_2)))){
            System.out.println("Given String is anagram");
        }
        else{
            System.out.println("Strings are not anagram");
        }

        //4.String is Pangram or not
        //eg- Waltz, bad nymph, for quick jigs vex.
        System.out.println("4.Enter a String to check Pangram");
        String pam = sc.nextLine();
        String pam1 = pam.toLowerCase().replace(" ","");
        int tp_arr[] = new int[26];
        boolean flag = false;
        for(int i =0;i<pam1.length();i++){
            if(pam1.charAt(i)>='a' && pam1.charAt(i)<='z'){
                tp_arr[(int)pam1.charAt(i) - 97]++;
            }
        }
        /* traversing logic
        for(int z =0;z<tp_arr.length;z++)
        {
            System.out.println((char)(z+97)+"-"+tp_arr[z]);
        }*/
        for(int z =0;z<tp_arr.length;z++){
            if(tp_arr[z]==0)
            {
               flag = false;
            }
            else
            {
                flag = true;
            }
        }
        if(flag)
            System.out.println("Its a pangram string");
        else
            System.out.println("Not a pangram String");

        //5.Print repeatedly occuring characters in a string
        int use_arr[] = new int[256];
        System.out.println("5.Enter the string to find repeated characters!!");
        String type_Str = sc.nextLine();
        String type_str = type_Str.replace(" ","").toLowerCase();
        for(int i =0;i<type_str.length();i++){
            use_arr[type_str.charAt(i)]++;
        }
        for(int index = 0;index<use_arr.length;index++){
            if(use_arr[index]>1)
            {
                System.out.println("Repeated character is "+((char)index) +" and whose occurances are "+use_arr[index]+" times.");
            }
        }
        //6.WAP to Sort a string alphabetically.
        System.out.println("6.Enter a string to sort in alphabetical order");
        String alp_sort = sc.nextLine().replace(" ","").toLowerCase();
        String res ="";
        res = checkSort(alp_sort);
        System.out.println("Resulted String is: "+res);
        //7.Count no of vowels and Consonants of a String value.
        System.out.println("7.Enter a string to perform count of Vowels and Consonants");
        String data = sc.nextLine().toLowerCase();
        int count_vow=0,count_con=0;
        for(int val = 0 ;val<data.length();val++){
            if(data.charAt(val)=='a'||data.charAt(val)=='e'||
                    data.charAt(val)=='i'||data.charAt(val)=='o'||data.charAt(val)=='u')
            {
                count_vow++;
            }
            else
            {
                count_con++;
            }
        }
        System.out.println("Count of vowels are "+count_vow);
        System.out.println("Count of consonants are "+count_con);

        //8.WAP to count no of special characters
        System.out.println("Enter a string to count special characters");
        String spc = sc.nextLine().toLowerCase();
        int count_spc =0;
        for(int pos = 0 ; pos<spc.length();pos++){
            if(spc.charAt(pos)>=32 && spc.charAt(pos)<=47||spc.charAt(pos)>=58 && spc.charAt(pos)<=64||
                    spc.charAt(pos)>=91 && spc.charAt(pos)<=96||spc.charAt(pos)>=123 && spc.charAt(pos)<=126)
            {
                count_spc++;
            }
        }
        System.out.println("Special characters count : present in the string is :"+count_spc);
    }
}
