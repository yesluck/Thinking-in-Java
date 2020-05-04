package access;

class Connection {
    private Connection() {}

    private static Connection connection = new Connection();
    public static Connection getConnection() {
        return connection;
    }

}

class ConnectionManager {
    private static Connection[] connections = new Connection[5];
    public static int counter;

    public static void fillConnections() {
        if (counter > 4)
            System.out.println("More than 5 connections is not allowed.");
        connections[counter++] = Connection.getConnection();
    }

    public static Connection getConnection(int i) {
        return connections[i];
    }
}

public class Practice8 {
    public static void main(String[] args) {
        ConnectionManager.fillConnections();
        ConnectionManager.fillConnections();
        System.out.println(ConnectionManager.getConnection(1));
        System.out.println(ConnectionManager.getConnection(2));
    }
}

/* output
access.Connection@2503dbd3
null
 */