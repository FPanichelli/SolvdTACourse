package connection;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ThreadRunner {
    private final static Logger LOGGER = LogManager.getLogger(ThreadRunner.class);

    private static User user1 = new User();
    private static User user2 = new User();
    private static User user3 = new User();
    private static User user4 = new User();

    public static void main(String[] args) {
        ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) Executors.newFixedThreadPool(4);
        user1.setConnected(true);
        user2.setConnected(true);
        user3.setConnected(true);
        user4.setConnected(true);
        Connection connection = new Connection();
        LOGGER.info(connection.getData());
        threadPoolExecutor.execute(user1);
        threadPoolExecutor.execute(user2);
        threadPoolExecutor.execute(user3);
        threadPoolExecutor.execute(user4);
        threadPoolExecutor.shutdown();
    }
}
