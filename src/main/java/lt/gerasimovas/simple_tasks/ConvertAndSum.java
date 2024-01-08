package lt.gerasimovas.simple_tasks;


import java.util.IllegalFormatException;

public class ConvertAndSum {
    public static void main(String[] args) {
        String s1 = "12345678";
        String s2 = "123asfff";

        System.out.println(sumString(s1));
        System.out.println(sumString(s2));
    }
    public static Integer sumString(String word){
        int sum = 0;
        try{
            int number = Integer.parseInt(word);

            while(number > 0){
                int digits = number % 10;
                sum += digits;
                number = number / 10;
            }
        } catch (NumberFormatException e){
            throw new NumberFormatException("Wrong String format " + e);
        }
        return sum;
    }
}
