

public class Calculator {

    private static String delimiter = ",|\n";
    public static int add(String text)
    {
        String[] numbers = text.split(delimiter);
        if(text.equals("")){
            return 0;
        }
        else
        {
            String tmp = text.replaceAll("\\D", "");
            char[] charsArray = tmp.toCharArray();
            int sum1 = 0;
            for (int i = 0; i < charsArray.length; i++)
            {

                sum1 = sum1 + Character.getNumericValue(charsArray[i]);
            }
            return sum1;
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
                total += toInt(number);
        }
        return total;
    }

}
