

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
            if(!tmp.equals(""))
            {
                char[] charsArray = tmp.toCharArray();
                int sum1 = 0;
                for (int i = 0; i < charsArray.length; i++) {

                    sum1 = sum1 + Character.getNumericValue(charsArray[i]);
                }
                return sum1;
            }
            else
            {
                String delimiter = ",";
                if (text.matches("//(.*)\n(.*)")) {
                    delimiter = Character.toString(text.charAt(2));
                    text = text.substring(4);
                }

                String numList[] = splitNumbers(text, delimiter + "|\n");
                return sum(numList);
            }
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
        String negString = "";

        for(String number : numbers){
            if(toInt(number) < 0){
                if(negString.equals(""))
                    negString = number;
                else
                    negString += ("," + number);
            }
            if(toInt(number) < 1000)
                total += toInt(number);
        }

        if(!negString.equals("")){
            throw new IllegalArgumentException("Negatives not allowed: " + negString);
        }

        return total;
    }


}
