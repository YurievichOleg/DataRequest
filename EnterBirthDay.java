import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Date;

public interface EnterBirthDay {
    static LocalDate enterBirthDay(){
        Reader reader = new Reader();
        System.out.println("Введите дату своего рождения в формате dd.MM.yyyy");
        String date = reader.scan();
        while (!isDate(date)){
            System.out.println(new RuntimeException("Введите дату корректно!"));
            date = reader.scan();
        }
        return LocalDate.parse(date, DateTimeFormatter.ofPattern("dd.MM.yyyy"));

    }

    static boolean isDate(String date){
        if(date == null || date.equals("")) {
            System.out.println(new RuntimeException("String is null or empty."));
            return false;
        }
        try{
            LocalDate isDate = LocalDate.parse(date, DateTimeFormatter.ofPattern("dd.MM.yyyy"));
            return true;
        }catch ( DateTimeParseException e){
            System.out.println(new RuntimeException("Invalid date entry"));
            return false;
        }catch (Exception e){
            System.out.println(new RuntimeException("the date was entered incorrectly or does not match the date format"));
        }
        return false;
    }
}
