

public class Calculator {

    private final static String delimiter = ",";
    public static int add(String text)
    {
        String[] numbers = text.split(delimiter);
        if(text.equals("")){
            return 0;
        }
        else if(text.length()==1)
        {
            return Integer.parseInt(text);
        }
        else
        {
            return Integer.parseInt(numbers[0]) + Integer.parseInt(numbers[1]);
        }
    }




}
