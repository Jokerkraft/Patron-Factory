package CasosDeUso;

public class OracleConnection implements Connection {
    @Override
    public void connect() {
        System.out.println("Conectando a Oracle...");
    }

    @Override
    public void disconnect() {
        System.out.println("Desconectando de Oracle...");
    }
}

