import java.util.Scanner;

public class iPhone {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        String seletor = "";

        seletor = input.nextLine();

        if (seletor == "a") {
            System.out.println("A");
        } else {
            System.out.println("B");
        };
    
    }
}
