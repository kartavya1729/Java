    
 public class Time_span {
    private long days;
    private long hours;
    private long minutes;
    private long seconds;

    // Constructor to initialize the TimeSpan from seconds
    public Time_span(long totalSeconds) 
    {
        convertFromSeconds(totalSeconds);
    }

    // Convert total seconds into days, hours, minutes, and seconds
    private void convertFromSeconds(long totalSeconds) 
    {
        this.days = totalSeconds / (24 * 3600);
        totalSeconds %= (24 * 3600);

        this.hours = totalSeconds / 3600;
        totalSeconds %= 3600;

        this.minutes = totalSeconds / 60;

        this.seconds = totalSeconds % 60;
    }

    // Method to add more seconds to the current TimeSpan
    public void addSeconds(long secondsToAdd) 
    {
        long totalSeconds = toTotalSeconds() + secondsToAdd;
        convertFromSeconds(totalSeconds);
    }

    // Method to convert the TimeSpan back into total seconds
    public long toTotalSeconds() 
    {
        return (days * 24 * 3600) + (hours * 3600) + (minutes * 60) + seconds;
    }

    // Getters for each field
    public long getDays() 
    {
        return days;
    }

    public long getHours() 
    {
        return hours;
    }

    public long getMinutes() 
    {
        return minutes;
    }

    public long getSeconds() 
    {
        return seconds;
    }

    // Method to represent the TimeSpan as a string
    @Override
    public String toString() 
    {
        return days + " days, " + hours + " hours, " + minutes + " minutes, " + seconds + " seconds";
    }

    // Main method for testing the TimeSpan class
    public static void main(String[] args) 
    {
        // Create a TimeSpan object with 100,000 seconds
        Time_span timeSpan = new Time_span(100000);
        System.out.println("Initial TimeSpan: " + timeSpan);

        // Add 10,000 more seconds to the TimeSpan
        timeSpan.addSeconds(10000);
        System.out.println("After adding 10,000 seconds: " + timeSpan);

        // Get total seconds back from the TimeSpan
        long totalSeconds = timeSpan.toTotalSeconds();
        System.out.println("Total seconds: " + totalSeconds);
    }
}