

public class Calculator {

    private final static String delimiter = ",|\n";
    public static int add(String text)
    {
        String[] numbers = text.split(delimiter);
        if(text.equals("")){
            return 0;
        }
        else
        {
          return sum(numbers);
        }
    }

    private static int toInt(String number){
        return Integer.parseInt(number);
    }

    private static int sum(String[] numbers)
    {
        int total = 0;
        for(String number : numbers)
        {
                total += toInt(number);
        }
        return total;
    }

}
