package org.campus02.lists;

public class LogEntry {
	private String date;
	private String applicationName;
	private String iPAddress;	
	private String logLevel;
	private String message;
	private String countryID;
	private int fileSize;


	public LogEntry(String date, String applicationName, String iPAddress, String logLevel, String message, String countryID, int fileSize) {
		this.date = date;
		this.applicationName = applicationName;
		this.iPAddress = iPAddress;
		this.logLevel = logLevel;
		this.message = message;
		this.countryID = countryID;
		this.fileSize = fileSize;
	}

	public int etFileSize() {
		return fileSize;
	}

	public String getDate() {
		return date;
	}

	public String getApplicationName() {
		return applicationName;
	}

	public String getiPAddress() {
		return iPAddress;
	}

	public String getLogLevel() {
		return logLevel;
	}

	public String getMessage() {
		return message;
	}

	public String getCountryID() {
		return countryID;
	}
}
