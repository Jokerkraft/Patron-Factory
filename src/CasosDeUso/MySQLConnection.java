package CasosDeUso;

public class MySQLConnection implements Connection {
    @Override
    public void connect() {
        System.out.println("Conectando a MySQL...");
    }

    @Override
    public void disconnect() {
        System.out.println("Desconectando de MySQL...");
    }
}

