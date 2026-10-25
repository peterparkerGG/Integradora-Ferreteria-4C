package utez.edu.mx.Ferreteria.repository.usuario;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import utez.edu.mx.Ferreteria.model.usuario.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario,Long> {
}
