package org.campus02.lists;

import java.util.ArrayList;
import java.util.HashMap;

public class LogEntryAnalyzer {
    private ArrayList<LogEntry> logEntries = new ArrayList<>();


    public void add(LogEntry logEntry){
        logEntries.add(logEntry);
    }

    public int getCountErrors(){
        int count = 0;
        for (LogEntry logEntry : logEntries) {
            count++;
        }
        return count;
    }

    public double getAverageFileSize(){
        double divider = 0;
        double sizeSum = 0;
        // TODO: Retourniert die durchschnittliche fileSize über alle Logentries hinweg
        for (LogEntry logEntry : logEntries) {
            sizeSum += logEntry.etFileSize();
            divider++;
        }
        return sizeSum / divider;
    }

    public HashMap<String, Integer> getCountByIPAddress(){
        // TODO: Liefert je applicationName, die Anzahl der LogEinträge zurück
        HashMap<String, Integer> result = new HashMap<>();
        for (LogEntry logEntry : logEntries) {
            if (result.containsKey(logEntry.getiPAddress())) {
                result.put(logEntry.getiPAddress(), result.get(logEntry.getiPAddress()) + 1);
            } else {
                result.put(logEntry.getiPAddress(), 1);
            }
        }
        return result;
    }

}
