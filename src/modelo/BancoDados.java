package modelo;

import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;

public class BancoDados {
    private boolean statusConexao;
    private Connection conexao;
    private String mensagemErro;
    
    public BancoDados(String servidor, String usuario, String porta, String nomeBanco, String senha){
        String nomeDriver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://"+servidor+":"+porta+"/"+nomeBanco
                +"?autoReconnect=true&useUnicode=true&useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC";
        try{
            Class.forName(nomeDriver);
            conexao = DriverManager.getConnection(url, usuario, senha);
            statusConexao = true;
        }
        catch(ClassNotFoundException e){
            mensagemErro = "Não foi possível carregar o driver "+e.getMessage();
            statusConexao = false;                
        }
        catch(SQLException e){
            mensagemErro = "Não foi possível conectar "+e.getMessage();
        }
    }

    public boolean isConnected() {
        return statusConexao;
    }

    public Connection getConexao() {
        return conexao;
    }

    public String getMensagemErro() {
        return mensagemErro;
    }
    
    
}
