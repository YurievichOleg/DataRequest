import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;
import java.util.Arrays;

public interface WriteData {
    static void writeData(){
        String[] fio = EnterFullName.enterFullName();
        long telNumber = EnterTelNumber.enterTelNumber();
        LocalDate birthDay = EnterBirthDay.enterBirthDay();
        String gender = EnterGender.enterGender();
        String filePath = fio[0] + ".txt";
        Path path = Paths.get(filePath);

        if (!Files.exists(path)){
            try(FileWriter fw = new FileWriter(filePath, false)){
                fw.write(fio[0] + " " + fio[1] + " " + fio[2] + " " + telNumber + " " + birthDay + " " + gender);
                fw.append("\n");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }else {
            try (FileWriter fw = new FileWriter(filePath, true)){
//                Files.write(path, Arrays.stream(fio).toList(), StandardCharsets.UTF_8, StandardOpenOption.APPEND);
                fw.write(fio[0] + " " + fio[1] + " " + fio[2] + " "+ telNumber + " " + birthDay + " " + gender);
                fw.append("\n");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
