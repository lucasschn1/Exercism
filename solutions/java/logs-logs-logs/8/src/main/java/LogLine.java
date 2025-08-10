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

        return LogLevel.fromString(abbrev);
    }

    public String getOutputForShortLog() {
        LogLevel level = getLogLevel();
        return level.getNum() + ":" + getMessage();
    }
}
