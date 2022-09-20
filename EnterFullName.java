import java.io.FileWriter;

public interface EnterFullName {
    static String[] enterFullName()  {
        Reader reader = new Reader();
        System.out.println("Введите Фамилию Имя Отчество:");
        String fullName = reader.scan();
        String[] args = fullName.split(" ");
        while (args.length != 3){
//            throw new RuntimeException("ФИО введены не корректно");
            System.out.println("ФИО введены не корректно");
            fullName = reader.scan();
            args = fullName.split(" ");
        }

        return  args;
    }
}
