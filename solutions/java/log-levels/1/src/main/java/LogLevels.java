public class LogLevels {
    private static final String ERROR_STR ="ERROR";
    private static final String WARNING_STR ="WARNING";
    private static final String INFO_STR ="INFO";
    public static String message(String logLine) {
        logLine = logLine.trim();
        logLine = logLine.substring(logLine.indexOf(":")+1);
        return logLine.trim();

    }

    public static String logLevel(String logLine) {
        if (logLine.contains(ERROR_STR)){
            return ERROR_STR.toLowerCase();
        } else if (logLine.contains(WARNING_STR)){
            return WARNING_STR.toLowerCase();
        } else {
            return INFO_STR.toLowerCase();
        }
    }

    public static String reformat(String logLine) {
        return message(logLine) + " (" +logLevel(logLine) +")";
    }
}
