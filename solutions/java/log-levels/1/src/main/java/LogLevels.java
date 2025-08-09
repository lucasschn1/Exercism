public class LogLevels {
    
    public static String message(String logLine) {
        return logLine.replaceAll("^\\[.*?\\]:\\s*","").trim();
    }

    public static String logLevel(String logLine) {
        int start = logLine.indexOf('[') + 1;
        int end = logLine.indexOf(']');
        return logLine.substring(start, end).toLowerCase();
        
    }

    public static String reformat(String logLine) {
        int start = logLine.indexOf('[') + 1;
        int end = logLine.indexOf(']');
        
        // constructed log level string
        String logLevel = logLine.substring(start, end);
        
        int message = logLine.indexOf(':') + 1;
        
        // constructed log message string
        String result = logLine.substring(message).trim() + " (" + logLevel.toLowerCase() + ")";
        return result;        
    }
}
