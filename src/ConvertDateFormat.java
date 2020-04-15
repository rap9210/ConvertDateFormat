import java.util.Scanner;
public class ConvertDateFormat {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Please input the date as so mm/dd/yyyy: ");
        String date_input = scn.nextLine();
// Take input, turn the characters to strings, and combine the related ones.
        String month_1 = Character.toString(date_input.charAt(0));
        String month_2 = Character.toString(date_input.charAt(1));
        String day_1 = Character.toString(date_input.charAt(3));
        String day_2 = Character.toString(date_input.charAt(4));
        String year_1 = Character.toString(date_input.charAt(6));
        String year_2 = Character.toString(date_input.charAt(7));
        String year_3 = Character.toString(date_input.charAt(8));
        String year_4 = Character.toString(date_input.charAt(9));
        String month = month_1+month_2;
        String day_str = day_1+day_2;
        String year_str = year_1+year_2+year_3+year_4;
        int day = Integer.parseInt(day_str);
        int year = Integer.parseInt(year_str);
//if statements to find out which month was entered and if wrong display error message
        if (month.equals("01")) {
            String month_word = "January";
            if ((day <= 0) || (day > 31)) {
                System.out.println("Error entering day. Please enter a correct number from 01-31");
            }//Testing numbers for errors, month, then day, then year.
            else if ((year < 2000) || (year > 2020)) {
                System.out.println("Error entering year please enter a correct number from 2000-2020");
            }//Only after no errors found, execute desired message.
            else {
                System.out.println(month_word+" "+day+", " + year);
            }
        }
        else if (month.equals("02")){
            String month_word = "February";
            if ((day <= 0)||(day > 28)){
                System.out.println("Error entering day. Please enter a correct number from 01-31");
            }
            else if ((year < 2000) || (year > 2020)) {
                System.out.println("Error entering year please enter a correct number from 2000-2020");
            }
            else{
                System.out.println(month_word+" "+day+", "+year);}
        }
        else if (month.equals("03")){
            String month_word = "March";
            if ((day <= 0)||(day > 31)){
                System.out.println("Error entering day. Please enter a correct number from 01-31");
            }
            else if ((year < 2000) || (year > 2020)) {
                System.out.println("Error entering year please enter a correct number from 2000-2020");
            }
            else{
            System.out.println(month_word+" "+day+", "+year);
        }
        }
        else if (month.equals("04")){
            String month_word = "April";
            if ((day <= 0)||(day > 30)){
                System.out.println("Error entering day. Please enter a correct number from 01-31");
            }
            else if ((year < 2000) || (year > 2020)) {
                System.out.println("Error entering year please enter a correct number from 2000-2020");
            }
            else{
                System.out.println(month_word+" "+day+", "+year);}
        }
        else if (month.equals("05")){
            String month_word = "May";
            if ((day <= 0)||(day > 31)){
                System.out.println("Error entering day. Please enter a correct number from 01-31");
            }
            else if ((year < 2000) || (year > 2020)) {
                System.out.println("Error entering year please enter a correct number from 2000-2020");
            }
            else{
                System.out.println(month_word+" "+day+", "+year);
        }}
        else if (month.equals("06")){
            String month_word = "June";
            if ((day <= 0)||(day > 30)){
                System.out.println("Error entering day. Please enter a correct number from 01-31");
            }
            else if ((year < 2000) || (year > 2020)) {
                System.out.println("Error entering year please enter a correct number from 2000-2020");
            }
            else{
                System.out.println(month_word+" "+day+", "+year);}
        }
        else if (month.equals("07")){
            String month_word = "July";
            if ((day <= 0)||(day > 31)){
                System.out.println("Error entering day. Please enter a correct number from 01-31");
            }
            else if ((year < 2000) || (year > 2020)) {
                System.out.println("Error entering year please enter a correct number from 2000-2020");
            }
            else{
                System.out.println(month_word+" "+day+", "+year);
        }
        }
        else if (month.equals("08")){
            String month_word = "August";
            if ((day <= 0)||(day > 31)){
                System.out.println("Error entering day. Please enter a correct number from 01-31");
            }
            else if ((year < 2000) || (year > 2020)) {
                System.out.println("Error entering year please enter a correct number from 2000-2020");
            }
            else{
                System.out.println(month_word+" "+day+", "+year);
            }
        }
        else if (month.equals("09")){
            String month_word = "September";
            if ((day <= 0)||(day > 30)){
                System.out.println("Error entering day. Please enter a correct number from 01-31");
            }
            else if ((year < 2000) || (year > 2020)) {
                System.out.println("Error entering year please enter a correct number from 2000-2020");
            }
            else{
                System.out.println(month_word+" "+day+", "+year);}
        }
        else if (month.equals("10")){
            String month_word = "October";
            if ((day <= 0)||(day > 31)){
                System.out.println("Error entering day. Please enter a correct number from 01-31");
            }
            else if ((year < 2000) || (year > 2020)) {
                System.out.println("Error entering year please enter a correct number from 2000-2020");
            }
            else{
                System.out.println(month_word+" "+day+", "+year);}
        }
        else if (month.equals("11")){
            String month_word = "November";
            if ((day <= 0)||(day > 30)){
                System.out.println("Error entering day. Please enter a correct number from 01-31");
            }
            else if ((year < 2000) || (year > 2020)) {
                System.out.println("Error entering year please enter a correct number from 2000-2020");
            }
            else{
                System.out.println(month_word+" "+day+", "+year);}
        }
        else if (month.equals("12")){
            String month_word = "December";
            if ((day <= 0)||(day > 31)){
                System.out.println("Error entering day. Please enter a correct number from 01-31");
            }
            else if ((year < 2000) || (year > 2020)) {
                System.out.println("Error entering year please enter a correct number from 2000-2020");
            }
            else{
                System.out.println(month_word+" "+day+", "+year);}
        }
        else{
            System.out.println("Error. Please enter a correct month number as such: 01,02...11,12");
        }
    }
}
