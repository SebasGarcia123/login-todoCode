
package prog2.login.persistencia;

import java.util.List;
import prog2.login.logica.Usuario;


public class ControladoraPersistencia {
    UsuarioJpaController usuJPA = new UsuarioJpaController();

    public List<Usuario> traerUsuarios() {
        return usuJPA.findUsuarioEntities();
    }
}
