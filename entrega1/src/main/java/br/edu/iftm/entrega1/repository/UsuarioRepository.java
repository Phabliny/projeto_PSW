package br.edu.iftm.entrega1.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import br.edu.iftm.entrega1.model.Usuario;

@Repository
public class UsuarioRepository {
 
    @Autowired
    JdbcTemplate jdbc;

    public List<Usuario> buscaTodosUsuarios() {
        String consulta = "SELECT * FROM usuario;";
        return jdbc.query(consulta,
                (resultados, numeroDaLinha) -> new Usuario(numeroDaLinha, resultados.getString("nome"), false, consulta, resultados.getInt("cpf"), 0, consulta, numeroDaLinha, 0, consulta));
    }

    public int gravaUsuario(Usuario Usuario){
        String consulta = "insert into Usuario(nome) values(?)";
        return jdbc.update(consulta, Usuario.getNome());
    }

    public int excluirUsuario(Integer id){
        System.out.println(" -------------> id = " + id);
        String consulta = "delete from Usuario where id = ?";
        return jdbc.update(consulta, id);
    }

    public Usuario buscaPorcpf(Integer cpf) {
        return jdbc.queryForObject(
                "select * from Usuario where cpf = ?",
                (resultSet, rowNum) -> { return new Usuario(rowNum, resultSet.getString("nome"),false, null, resultSet.getInt("cpf"), rowNum, null, rowNum, rowNum, null); }, cpf);
    }

    public int atualizaUsuario(Usuario usuario){
        String consulta = "update usuario set nome = ? where cpf = ?";
        return jdbc.update(consulta, usuario.getNome(), usuario.getCpf());
    }
}