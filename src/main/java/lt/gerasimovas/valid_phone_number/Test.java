package lt.gerasimovas.valid_phone_number;

public class Test {
    public static void main(String[] args) {
        String fistPhoneNumber = "(123) 456-7890";
        String secondPhoneNumber = "((111)555 2345";
        String[] array = secondPhoneNumber.split("");

        int count = 0;
        for(int i = 1; i < 4; i++){
            try {
                Integer.parseInt(array[i]);
                count++;
            } catch (NumberFormatException e){
                count = -1;
                break;
            }
        }

        System.out.println(count);
    }
}
