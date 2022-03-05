import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("ss");
        JOptionPane.showMessageDialog(null, "h" + name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("ff"));
        JOptionPane.showMessageDialog(null, "hello" + age);
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("name");
//        String name = scanner.nextLine();
//        System.out.println("you");
//        int age = scanner.nextInt();
//        System.out.println("www");
//        String food = scanner.nextLine();
//        System.out.println("eee");
//        String r = scanner.nextLine();
//
//        System.out.println("hi" + name);
//        System.out.println("ss" + food);
//        System.out.println("you" + age);
//        System.out.println("ss" + r);
    }
}
