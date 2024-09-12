package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
    public static boolean isPalindrome(int num){
        String strNum = String.valueOf(Math.abs(num));
        String[] numArr = strNum.split("");
        boolean result = false;
           for (int i=0; i<= numArr.length/2; i++){
               if (!numArr[i].equals(numArr[(numArr.length - 1) - i])){
                   return false;
               } else {
                   result = true;
               }

               /* if (numArr[i] == numArr[(numArr.length-1)-i]) {
                   result = true;
               }
               else result= false; */
           }
        return result;
    }
    public static boolean isPerfectNumber(int num){
        if (num<0) {
            return false;
        }
        int bolen = 0;
        boolean result = false;
        for (int i=1; i<num; i++){
            if(num % i == 0){
                bolen += i;
            }
        }
        if (bolen == num){
            result = true;
        }
        System.out.println(bolen);
        System.out.println(num);
        System.out.println(result);
        return result;
    }

    public static String numberToWords (int num) {
        String [] desc = {"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
        String strNum = String.valueOf(num);
        String[] numArr = strNum.split("");
        String result = "";
        //String [] result = new String[numArr.length];
        if (num < 0) {
            result = "Invalid Value";
        } else {
            for (int i = 0; i < numArr.length; i++) {

                result = result + " " + desc[Integer.parseInt(numArr[i])];
            }
        }
        return result.trim();
    }



}
