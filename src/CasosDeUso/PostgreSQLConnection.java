package CasosDeUso;

public class PostgreSQLConnection implements Connection {
    @Override
    public void connect() {
        System.out.println("Conectando a PostgreSQL...");
    }

    @Override
    public void disconnect() {
        System.out.println("Desconectando de PostgreSQL...");
    }
}

