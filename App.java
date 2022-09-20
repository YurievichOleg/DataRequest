import javax.imageio.IIOException;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class App {
    public static void main(String[] args) {

        try (Reader reader = new Reader()){
            String a = "yes";
            System.out.println("Если желаете ввести данные введите yes.");
            String answer = reader.scan();
            while (a.equals(answer)){
                WriteData.writeData();
                System.out.println("Если желаете ввести данные введите yes.");
                answer = reader.scan();
            }
        }


    }

}


