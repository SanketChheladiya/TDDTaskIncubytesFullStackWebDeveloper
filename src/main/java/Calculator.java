public class Calculator {

    private static String delimiter = ",|\n";
    public static int add(String text)
    {
        String[] numbers = text.split(delimiter);
        if(text.equals("")){
            return 0;
        }
        else if(text.charAt(0) == '/' && text.charAt(1) == '/' && text.charAt(3)=='\n')
        {
            char sp = text.charAt(2);
            String substr = text.substring(4);
            String[] numb = substr.split(String.valueOf(sp));
            return sum(numb);
        }
        else
        {

            String numList[] = splitNumbers(text, delimiter + "|\n");
            return sum(numList);
        }
    }

    private static String[] splitNumbers(String numbers, String divider){
        return numbers.split(divider);
    }

    private static int toInt(String number){
        return Integer.parseInt(number);
    }

    private static int sum(String[] numbers)
    {
        int total = 0;
        for(String number : numbers)
        {
            if(toInt(number) < 1000)
                total += toInt(number);
        }
        return total;
    }

}