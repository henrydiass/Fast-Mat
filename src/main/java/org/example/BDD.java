package org.example;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BDD {

    public Connection conexao;
    public BDD(){
        conexao = getConexao();
    }
    private Connection getConexao( )
    {

        String jdbcUrl = "jdbc:postgresql://localhost:5432/FIB";
        String username = "postgres";
        String password = "32371836";

        try {
            Connection connection = DriverManager.getConnection(jdbcUrl, username, password);
            return connection;

        }

        catch (SQLException e) {
            System.err.println("Erro de conexão: " + e.getMessage());
            return null;
        }

    }

    public void inserirValores(String name, int pontos){
        String query = "INSERT INTO jogosoma (nome_jogador, pontos) VALUES (?, ?)";
        try {
            PreparedStatement preparedStatement = conexao.prepareStatement(query);
            preparedStatement.setString(1, name);
            preparedStatement.setInt(2, pontos);
            int rowsInserted = preparedStatement.executeUpdate();
            if(rowsInserted > 0){
                System.out.println(" ");
                System.out.println("Sua pontuação foi registrada :)");
            }
            else{
                System.out.println("Falha na inserção");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void inserirJogador(String name){
        String query = "INSERT INTO jogosoma (nome_jogador) VALUES (?)";

        try {
            PreparedStatement preparedStatement = conexao.prepareStatement(query);
            preparedStatement.setString(1, name);
            preparedStatement.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


}
