import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Date;
import java.util.Scanner; 

class TestDate {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please fill a day (1-31) :");
        int day = sc.nextInt();
        System.out.println("Please fill a month (1-12) :");
        int month = sc.nextInt();
        System.out.println("Please fill a year :");
        int year = sc.nextInt();
        sc.close();

        // TODO : your code after this line
        //Format de la date
        SimpleDateFormat format = new SimpleDateFormat("MM-dd-YY");
        //Initialization de la date
        Calendar date = new GregorianCalendar(year, (month-1), day);
        //Crée un object date avec une date donnée
        Date finalDate = date.getTime();
        //Met notre date au bon format
        System.out.println("The date is : " + format.format(finalDate));
        
        int dayOfWeek = date.get(Calendar.DAY_OF_WEEK);
        System.out.println("The day of the week is : " + (dayOfWeek-1));
        
        int dayOfMonth = date.get(Calendar.DAY_OF_MONTH);
        System.out.println("The day of the month is : " + (dayOfMonth));
        
//        Autre manière :
//        Calendar date = Calendar.getInstance();
//        date.set(Calendar.YEAR, year);
//        date.set(Calendar.MONTH, (month-1));
//        date.set(Calendar.DATE, day);
//        Date finalDate = date.getTime();
//        System.out.println("The date is : " + format.format(finalDate)); 
        
    }
}