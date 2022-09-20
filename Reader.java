import java.util.Scanner;

public class Reader implements AutoCloseable{
    Scanner scanner ;

    public Reader() {
        scanner = new Scanner(System.in);
    }

    public String scan() {
        String input = "";
        while (input.isEmpty()){
            input = scanner.nextLine();
            if (input.isEmpty()){
                System.out.println(new RuntimeException("Вводимое значение не может быть Null"));;
            }
        }

        return input;
    }

    public void close(){
        scanner.close();
    }
}
