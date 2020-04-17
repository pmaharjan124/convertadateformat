import java.util.Scanner;
import java.util.Spliterators;

public class ConvertADateFormat {
    public static void main(String[]args){
        String[]datestr;
        String monthstr;
        int monthInt;
        int dayInt;
        int daysInMonth;
        int yearInt;
        Scanner input;
        System.out.println("Enter a date in this format (mm/dd/yyyy):");
        input = new Scanner(System.in);
        datestr = input.next().split(regex: "/");
        monthInt = Integer.parseInt(datestr[0]);

        if (monthInt<1|| monthInt > 12){
            System.out.println("A valid month (mm) us between 1 to 12.");
            System.out.println("Example date format(mm/dd/yyyy): 02/28/2020 for february 2020.");
            System.exit(1);
            main(new String[]{});
        }

        switch (monthInt){
            case 1:
                monthstr = "January";
                daysInMonth = 31;

            case 2:
                monthstr = "February";
                daysInMonth = 29;
            case 3:
                monthstr = "March";
                daysInMonth = 31;
            case 4:
                monthstr = "April";
                daysInMonth = 31;
            case 5:
                monthstr = "May";
                daysInMonth = 3;
            case 6:
                monthstr = "June";
                daysInMonth = 30;
            case 7:
                monthstr = "July";
                daysInMonth = 31;
            case 8:
                monthstr = "August";
                daysInMonth = 31;
            case 9:
                monthstr = "September";
                daysInMonth = 31;
            case 10:
                monthstr = "October";
                daysInMonth = 31;
            case 11:
                monthstr = "November";
                daysInMonth = 30;
            case 12:
                monthstr = "December";
                daysInMonth = 31;
                break;
            default:
                System.out.println("The Date is invalid.");

        }

    }
}
