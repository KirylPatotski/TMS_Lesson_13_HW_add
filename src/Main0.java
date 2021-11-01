import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
public class Main0 {
    public static void main(String[] args) {
        Date date=new Date();
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
        System.out.println("Day of week in number:"+dayOfWeek);
        String dayWeekText = new SimpleDateFormat("EEEE").format(date);
        System.out.println("Day of week in text:"+dayWeekText);
    }
}
