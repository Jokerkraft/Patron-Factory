package Factory;

import CasosDeUso.Connection;
import CasosDeUso.MySQLConnection;
import CasosDeUso.OracleConnection;
import CasosDeUso.PostgreSQLConnection;

// Ejemplo de JDBC - ConnectionFactory
public class ConnectionFactory {
    public static Connection createConnection(String type){
        if(type.equalsIgnoreCase("MySQL")){
            return new MySQLConnection();
        } else if(type.equalsIgnoreCase("Oracle")){
            return new OracleConnection();
        } else if(type.equalsIgnoreCase("PostgreSQL")){
            return new PostgreSQLConnection();
        }
        return null;
    }
}
