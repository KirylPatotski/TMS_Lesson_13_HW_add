import java.util.Calendar;

public class Main1 {
    public static Calendar nextDayOfWeek(int dow) {
        Calendar date = Calendar.getInstance();
        int diff = dow - date.get(Calendar.DAY_OF_WEEK);
        if (diff <= 0) {
            diff += 7;
        }
        date.add(Calendar.DAY_OF_MONTH, diff);
        return date;
    }
    public static void main(String[] args) {
        System.out.printf("%ta, %<tb %<te",nextDayOfWeek(Calendar.TUESDAY));
    }
}