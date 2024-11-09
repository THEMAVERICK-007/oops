import java.util.Scanner;
class frequency{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);              //created a scanner Object
        System.out.println("Enter your String: ");             
        String s=sc.nextLine();              //taking input string from user
        System.out.println("Enter character to search: ");
        String l=sc.next();             //reading which character is to be searched from the input String
        int c=0;                
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==l.charAt(0)){               //comparing each element in input string with the character
                c++;                //if character is founf increment value of c
            }
        }
        if(c==0){
            System.out.println("Element not found");
        }
        else{
            System.out.println("Element "+l+" is found to repeat"+" "+c+" times");
        }
    }
}