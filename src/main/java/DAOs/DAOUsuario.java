package DAOs;

import Entidade.Usuario;
import java.util.ArrayList;
import java.util.List;

public class DAOUsuario extends DAOGenerico<Usuario> {
 public DAOUsuario() {
        super(Usuario.class);
    }

public List<Usuario> listByNome(String nome) {
return em.createQuery("SELECT e FROM Usuario e WHERE e.nome LIKE :nome").setParameter("nome", nome).getResultList();
}

public List<Usuario> listInOrderNome() {
return em.createQuery("SELECT e FROM Usuario e ORDER BY e.nome").getResultList();}

public List<Usuario> listBySenha(String senha) {
return em.createQuery("SELECT e FROM Usuario e WHERE e.senhaUsuarioLIKE :senha").setParameter("senha", "%" + senha + "%").getResultList();
}

public List<Usuario> listInOrderSenha() {
return em.createQuery("SELECT e FROM Usuario e ORDER BY e.senhaUsuario").getResultList();}

public List<String> listInOrderNomeStrings(String qualOrdem) {

List<Usuario> lf;

if (qualOrdem.equals("nome")){

lf = listInOrderNome();

} else {

lf = listInOrderSenha();
}

List<String> ls = new ArrayList<>();

for (int i = 0; i < lf.size(); i++) {

ls.add(lf.get(i).getNome() + "-" + lf.get(i).getSenha());

}

return ls;
}
}
