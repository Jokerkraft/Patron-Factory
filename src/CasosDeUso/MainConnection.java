package CasosDeUso;

import Factory.ConnectionFactory;

public class MainConnection {
    public static void main(String[] args) {
        // Crear conexión MySQL
        Connection mysql = ConnectionFactory.createConnection("MySQL");
        mysql.connect();
        mysql.disconnect();

        System.out.println();

        // Crear conexión Oracle
        Connection oracle = ConnectionFactory.createConnection("Oracle");
        oracle.connect();
        oracle.disconnect();

        System.out.println();

        // Crear conexión PostgreSQL
        Connection postgres = ConnectionFactory.createConnection("PostgreSQL");
        postgres.connect();
        postgres.disconnect();
    }
}

