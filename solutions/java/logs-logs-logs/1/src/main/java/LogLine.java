public class LogLine {
    String logLine;

    public LogLine(String logLine) {
        this.logLine = logLine;
    }

    public String getMessage() {
        int startOfMessage = this.logLine.indexOf(':');
       return this.logLine.substring(startOfMessage);
    }


    public LogLevel getLogLevel() {
        int start = this.logLine.indexOf('[') + 1;
        int end = this.logLine.indexOf(']');

        String log = this.logLine.substring(start, end).trim();

        for (LogLevel level : LogLevel.values() ) {
            if (level.name().equals(log)) {
                return level;
            }
        }
        return LogLevel.UNKNOWN;
    }

    public String getOutputForShortLog() {
        LogLevel level = getLogLevel();
        int encoded = level.getEncodedLevel();

        return encoded + ": " + getMessage();
    }
}
