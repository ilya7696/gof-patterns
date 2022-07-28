package by.tovpenets.patterns.singleton;

public class Logger {
    private static Logger logger;
    private static String logFile = "This is log file! \n\n";

    private Logger() {}

    public static synchronized Logger getLogger() {
        if (logger == null)
            return new Logger();
        return logger;
    }

    public void addLogInfo(String logInfo) {
        logFile += logInfo + "\n";
    }

    public void showLogFile() {
        System.out.println(logFile);
    }
}
