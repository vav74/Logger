import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Logger {
    protected int num = 1;
    private static Logger logger;
    private final DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
    private final Calendar cal = Calendar.getInstance();

    public void log(String msg) {
        System.out.println("[" + dateFormat.format(cal.getTime()) + " " + num++ + "] " + msg);
    }

    private Logger() {
    }

    public static Logger getInstance() {
        if (logger == null) {
            logger = new Logger();
        }
        return logger;
    }
}