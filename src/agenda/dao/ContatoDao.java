//pacotes onde vai acessar o banco de dados
package agenda.dao;

import agenda.bancodedados.CriaConexao;
import agenda.logica.Contato;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ContatoDao {

    private Connection conexao; //Puxa a conexao com o banco de dados

    public ContatoDao() throws SQLException { //Metodo construtor
        this.conexao = CriaConexao.getConexao();
    }

//metodos de inclusao do banco de dados
    public void adiciona(Contato c1) throws SQLException {
        String sql = "insert into contato (nome, endereco, telefone, email, sexo)"
                + "values (?, ?, ?, ?, ?)";//prepara a conexao para mandar um condigo sql para o banco de dados.

        PreparedStatement stmt = conexao.prepareStatement(sql);//executar as clausulas dentro do banco de dados/seta-las

        //Setar os valores
        stmt.setString(1, c1.getNome());
        stmt.setString(2, c1.getEndereco());
        stmt.setString(3, c1.getTelefone());
        stmt.setString(4, c1.getEmail());
        stmt.setString(5, c1.getSexo());

        //executar o codigo de setar os valores
        stmt.execute();
        stmt.close();
    }
//Cria o metodo de pesquiza

    public List<Contato> getLista(String nome) throws SQLException {
        String sql = "select * from contato where nome like?";
        PreparedStatement stmt = this.conexao.prepareStatement(sql);
        stmt.setString(1, nome);
        ResultSet rs = stmt.executeQuery();

        List<Contato> minhaLista = new ArrayList<Contato>();

        while (rs.next()) {
            Contato c1 = new Contato();
            
            c1.setId(Long.valueOf(rs.getShort("Id")));
            c1.setNome(rs.getString("nome"));
            c1.setEndereco(rs.getString("endereco"));
            c1.setTelefone(rs.getString("telefone"));
            c1.setEmail(rs.getString("email"));
            c1.setSexo(rs.getString("sexo"));
            minhaLista.add(c1);
        }
            rs.close();
            stmt.close();
            return minhaLista;
    }
    
    //ALTERACAO NO BANCO
public void altera(Contato c1) throws SQLException{
	 String sql = "update contato set nome=?, endereco=?, telefone=?, email=?, sexo=? where id=?";
	 PreparedStatement stmt = conexao.prepareStatement(sql);
	 
        //Setar os valores
        stmt.setString(1, c1.getNome());
        stmt.setString(2, c1.getEndereco());
        stmt.setString(3, c1.getTelefone());
        stmt.setString(4, c1.getEmail());
        stmt.setString(5, c1.getSexo());
        stmt.setLong(6, c1.getId());

        //executar o codigo de setar os valores
        stmt.execute();
        stmt.close();
    }
//DELETA VALORES DO BANCO
public void remove(Contato c1) throws SQLException{
	String sql = "delete from contato where id=?";
	PreparedStatement stmt = conexao.prepareStatement(sql);
	stmt.setLong(1, c1.getId());

	stmt.execute();
	stmt.close();	
    }
}
