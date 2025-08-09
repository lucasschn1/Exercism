public class LogLine {
    String logLine;

    public LogLine(String logLine) {
        this.logLine = logLine;
    }

    public String getMessage() {
        int startOfMessage = this.logLine.indexOf(':') + 1;
       return this.logLine.substring(startOfMessage).trim();
    }


    public LogLevel getLogLevel() {
        int start = this.logLine.indexOf('[') + 1;
        int end = this.logLine.indexOf(']');

        String abbrev = this.logLine.substring(start, end);

        return switch (abbrev) {
            case "TRC" -> LogLevel.TRACE;
            case "DBG" -> LogLevel.DEBUG;
            case "INF" -> LogLevel.INFO;
            case "WRN" -> LogLevel.WARNING;
            case "ERR" -> LogLevel.ERROR;
            case "FTL" -> LogLevel.FATAL;
            default -> LogLevel.UNKNOWN;
        };
    }

    public String getOutputForShortLog() {
        LogLevel level = getLogLevel();
        int encoded = level.getEncodedLevel();

        return encoded + ":" + getMessage();
    }
}
