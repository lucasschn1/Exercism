public class LogLevels {

    public static String message(String logLine) {
        return logLine.replaceAll("^\\[.*?\\]:\\s*", "").trim();
    }

    public static String logLevel(String logLine) {
        int start = logLine.indexOf('[') + 1;
        int end = logLine.indexOf(']');
        return logLine.substring(start, end).toLowerCase();
    }

    public static String reformat(String logLine) {
        return message(logLine) + " (" + logLevel(logLine) + ")";
    }
}
