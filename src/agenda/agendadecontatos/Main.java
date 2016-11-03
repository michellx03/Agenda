package agenda.agendadecontatos;

import agenda.bancodedados.CriaConexao;
import agenda.dao.ContatoDao;
import agenda.forms.JTAgendaContatos;
import agenda.logica.Contato;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class Main {
   
    public static void main(String[] args) throws SQLException {
        
    }
}
        //Estao todos fora da classe principal
             /*DELETA CONTATO NO BANCO
            Contato contato = new Contato();
            contato.setId(Long.valueOf(1));
            
            //objeto de conexao
            ContatoDao dao = new ContatoDao();
            dao.remove(contato);
            System.out.println("Contato removido com sucesso");
    }*/
        /*ALTERA CONTATO NO BANCO
            //seta os valores
            Contato contato = new Contato();
            contato.setId(Long.valueOf(2));
            contato.setNome("Michell");
            contato.setEndereco("Av Flamboyant");
            contato.setTelefone("0000000");
            contato.setEmail("michellx03@gmail.com");
            contato.setSexo("M");
            
            //objeto de conexao
            ContatoDao dao = new ContatoDao();
            dao.altera(contato);
            System.out.println("Contato alterado com sucesso");
    }*/
        
        /*PESQUIZA USUARIOS NO BANCO
        ContatoDao dao = new ContatoDao();

        List<Contato> minhalista = dao.getLista();
        
        for (Contato contato : minhalista) {
	System.out.println("Nome: " + contato.getNome());
	System.out.println("Endereço: " + contato.getEndereco());
	System.out.println("Telefone: " + contato.getTelefone());
	System.out.println("Email: " + contato.getEmail());
	System.out.println("Sexo: " + contato.getSexo());	
        }
    }*/
        //Connection conexao = CriaConexao.getConexao();//Chama a classe CriaConexao.
            
        /*INCLUI CONTATOS NO BANCO
            //seta os valores
            Contato contato = new Contato();
            contato.setNome("Primero Nome");
            contato.setEndereco("Primeira Rua");
            contato.setTelefone("9999999");
            contato.setEmail("primeiro@primeiro.com");
            contato.setSexo("E");
            
            //objeto de conexao
            ContatoDao dao = new ContatoDao();
            dao.adiciona(contato);
            System.out.println("Contato adicionado com sucesso");
    } 

    private static void adiciona(Contato contato) {
        throw new UnsupportedOperationException("Not supported yet.");
    }*/




