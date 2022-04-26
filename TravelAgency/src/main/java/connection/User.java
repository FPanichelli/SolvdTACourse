package connection;

import com.solvd.Runner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class User extends Thread{
    private final static Logger LOGGER = LogManager.getLogger(User.class);

    private String connection = ("Connected successfully");
    private boolean isConnected;

    private void Connect() {
        LOGGER.info(getConnection());
        setConnected(true);
    }


    public String getConnection() {
        return connection;
    }

    public void setConnection(String connection) {
        this.connection = connection;
    }

    public boolean isConnected() {
        return isConnected;
    }

    public void setConnected(boolean connected) {
        isConnected = connected;
    }
}
