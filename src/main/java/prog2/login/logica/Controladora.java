
package prog2.login.logica;

import java.util.List;
import prog2.login.persistencia.ControladoraPersistencia;


public class Controladora {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    
    public String validarUsuario(String usuario, String contrasenia) {
        String mensaje = "";
        List<Usuario> usuarios = controlPersis.traerUsuarios();
        for(Usuario usu : usuarios){
            if(usu.getNombreUsuario().equals(usuario)){
                if(usu.getContrasenia().equals(contrasenia)){
                    mensaje = "Usuario y contraseña correctos. Bienvenido!";
                    return mensaje;
                }
                else{
                    mensaje = "Contraseña incorrecta";
                    return mensaje;
                }
            }
            else{
                mensaje = "Usuario no encontrado";
            }
        }
        return mensaje;
    }
}
