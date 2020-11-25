import java.util.Scanner;

public class findArrayElement {
    public static void main(String[] args) {
        String[] studens = {"Chris", "Micheal", "Camila", "Sienna", "Tanya", "Connor", "Zac", "Mallory", "Zoe", "Emily"};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a name's student:");
        String input_name = scanner.nextLine();

        boolean isExist = false;
        for (int i = 0; i < studens.length; i++) {
            if(studens[i].equals(input_name)){
                System.out.println("Position of the student in the list " + input_name + " is: " + (i + 1));
                isExist = true;
                break;
            }
        }
        if(!isExist)
            System.out.println("Not found" + input_name + "in the list.");
    }
}
