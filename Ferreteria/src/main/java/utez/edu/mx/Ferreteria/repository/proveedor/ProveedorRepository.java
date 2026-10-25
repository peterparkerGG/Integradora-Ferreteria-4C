package utez.edu.mx.Ferreteria.repository.proveedor;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import utez.edu.mx.Ferreteria.model.proveedor.Proveedor;

@Repository
public interface ProveedorRepository extends JpaRepository<Proveedor,Long> {
}
