package utez.edu.mx.Ferreteria.repository.venta;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import utez.edu.mx.Ferreteria.model.venta.Venta;

@Repository
public interface VentaRepository extends JpaRepository<Venta,Long> {
}
