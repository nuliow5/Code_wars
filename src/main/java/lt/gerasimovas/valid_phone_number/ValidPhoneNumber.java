package lt.gerasimovas.valid_phone_number;

import java.util.Arrays;

public class ValidPhoneNumber {
    public static void main(String[] args) {
        String fistPhoneNumber = "(123) 456-7890";
        String secondPhoneNumber = "(1111)555 2345";
        String thirdPhoneNumber = "(098) 123 4567";

        System.out.println(validPhoneNumber(fistPhoneNumber));
        System.out.println(validPhoneNumber(secondPhoneNumber));
        System.out.println(validPhoneNumber(thirdPhoneNumber));


//        String[] array = fistPhoneNumber.split("");
//        System.out.println(Arrays.toString(array));
//        System.out.println(array.length);

    }


    public static boolean validPhoneNumber(String phoneNumber) {
        String[] array = phoneNumber.split("");
        if (array.length != 14){
            return false;
        }

//        if (
//                array[0].equals("(") &&
//                        array[4].equals(")") &&
//                        for(int i = 1; i < 4; i++){
//                            if (Character.isDigit(Integer.parseInt(array[i]))){
//                                System.out.println(i);
//                            }
//                        }
//        )

        return true;
    }

}
