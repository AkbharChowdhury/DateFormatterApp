import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Helper {
    private Helper(){}

    public static String formatDate(String dateStr) {

        return LocalDate.parse(dateStr, DateTimeFormatter.ofPattern("MMMM d, yyyy")).toString();

    }

}
