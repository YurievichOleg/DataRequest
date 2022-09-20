public interface EnterTelNumber {
    static long enterTelNumber(){
        Reader reader = new Reader();
        System.out.println("Введите номер телефона");
        String number = reader.scan();

        while (!isNumeric(number) || number.length() != 11){
//            throw new RuntimeException("ФИО введены не корректно");
            System.out.println(new RuntimeException("телефон введен не корректно"));
            number = reader.scan();

        }
        return Long.parseLong(number);
    }

    static boolean isNumeric(String string) {
        long intValue;


        if(string == null || string.equals("")) {
            System.out.println(new RuntimeException("String cannot be parsed, it is null or empty."));
            return false;
        }

        try {
            intValue = Long.parseLong(string);
            return true;
        } catch (NumberFormatException e) {
            System.out.println(new RuntimeException("Input String cannot be parsed to Integer."));
        }
        return false;
    }
}
