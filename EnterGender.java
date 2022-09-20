public interface EnterGender {
    static String enterGender(){
        Reader reader = new Reader();
        System.out.println("Если вы девушка введите букву f, если вы мужчина введите букву m ");
        String gender = reader.scan();
        String genders = "fm";
        while (!genders.contains(gender)){
            System.out.println(new RuntimeException("Введите только букву f или m"));
            gender = reader.scan();
        }
        return gender;
    }
}
