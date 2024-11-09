import java.util.Scanner;
class palindrome{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your string: ");
        String s=sc.nextLine();
        int flag=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=s.charAt((s.length())-i-1)){
                flag=1;
            }
        }
        if(flag==0){
            System.out.println("String is palindrome");
        }
        else{
            System.out.println("String is not palindrome");
        }
    }
}