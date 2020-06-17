import java.util.Scanner;

//Comment
public class ReverseString1 {
        //Reverse Function
	public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        System.out.println("Enter string:");
        str = sc.nextLine();
        reverse(str);
    }
    
    //Main Function
    public static void reverse (String string) {
        if(string.isEmpty()) {
            System.out.print(string);
        } else {
            reverse(string.substring(1));
            System.out.print(string.charAt(0));
        }
    }
}
