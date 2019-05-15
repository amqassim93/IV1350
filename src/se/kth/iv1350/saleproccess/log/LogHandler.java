package se.kth.iv1350.saleproccess.log;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

/** responsible for the log */

public class LogHandler {
    private static final String LOG_FILE_NAME = "saleProccess-log.txt";
    private PrintWriter logFile;

    public LogHandler() throws IOException {
        logFile = new PrintWriter(new FileWriter(LOG_FILE_NAME),true);

    }

    /** writes a log entry describing a thrown exception.
     *
     * @param exc the exception that shall be logged
     */

    public void logException(Exception exc){
        StringBuilder logMsgBuilder = new StringBuilder();
        logMsgBuilder.append(createTime());
        logMsgBuilder.append(", Exception was thrown: ");
        logMsgBuilder.append(exc.getMessage());
        logFile.println(logMsgBuilder);
        exc.printStackTrace(logFile);

    }

    private String createTime(){
        LocalDateTime now =LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
        return now.format(formatter);
    }

}
