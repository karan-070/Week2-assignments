import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Date;

// Logger interface
interface Logger {
    void logInfo(String message);

    void logWarning(String message);

    void logError(String message);
}

// ConsoleLogger implementation
class ConsoleLogger implements Logger {
    @Override
    public void logInfo(String message) {
        System.out.println("INFO: " + message);
    }

    @Override
    public void logWarning(String message) {
        System.out.println("WARNING: " + message);
    }

    @Override
    public void logError(String message) {
        System.err.println("ERROR: " + message);
    }
}

// FileLogger implementation
class FileLogger implements Logger {
    private String filePath;

    public FileLogger(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public void logInfo(String message) {
        logMessage("INFO: " + message);
    }

    @Override
    public void logWarning(String message) {
        logMessage("WARNING: " + message);
    }

    @Override
    public void logError(String message) {
        logMessage("ERROR: " + message);
    }

    private void logMessage(String message) {
        try (FileWriter writer = new FileWriter(filePath, true)) {
            writer.write(message + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class DatabaseLogger implements Logger {
    private String jdbcUrl;
    private Connection connection;

    public DatabaseLogger(String jdbcUrl) {
        this.jdbcUrl = jdbcUrl;
        try {
            // Establish a database connection
            this.connection = DriverManager.getConnection(jdbcUrl);
        } catch (SQLException e) {
            e.printStackTrace(); // Print the exception for debugging
        }
    }

    @Override
    public void logInfo(String message) {
        log("INFO: " + message);
    }

    @Override
    public void logWarning(String message) {
        log("WARNING: " + message);
    }

    @Override
    public void logError(String message) {
        log("ERROR: " + message);
    }

    private void log(String message) {
        String query = "INSERT INTO logs (message) VALUES (?)";
        try {
            // Prepare a statement and execute it to log the message in the database
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, message);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace(); // Print the exception for debugging
        }
    }
}

class Run {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        // Usage examples
        File logFile = new File("log.txt");

        try {
            if (logFile.createNewFile()) {
                System.out.println("Log file created: " + logFile.getAbsolutePath());
            } else {
                System.out.println("Log file already exists: " + logFile.getAbsolutePath());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        Logger consoleLogger = new ConsoleLogger();
        consoleLogger.logInfo("This is an informational message.");
        consoleLogger.logWarning("This is a warning message.");
        consoleLogger.logError("This is an error message.");

        // Create a FileLogger
        Logger fileLogger = new FileLogger("log.txt");
        fileLogger.logInfo("This is an informational message.");
        fileLogger.logWarning("This is a warning message.");
        fileLogger.logError("This is an error message.");

        // Create a DatabaseLogger (Make sure to replace the connection string with your database details)
        Logger databaseLogger = new DatabaseLogger("jdbc:mysql://localhost:3306/practice?user=root&password=1234");
        databaseLogger.logInfo("This is an informational message.");
        databaseLogger.logWarning("This is a warning message.");
        databaseLogger.logError("This is an error message.");


    }
}


