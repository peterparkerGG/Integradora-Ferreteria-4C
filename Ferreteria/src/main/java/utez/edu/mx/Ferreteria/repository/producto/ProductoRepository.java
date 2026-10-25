package utez.edu.mx.Ferreteria.repository.producto;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import utez.edu.mx.Ferreteria.model.producto.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto,Long> {
}
