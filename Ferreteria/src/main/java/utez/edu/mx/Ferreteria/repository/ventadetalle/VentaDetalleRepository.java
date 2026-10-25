package utez.edu.mx.Ferreteria.repository.ventadetalle;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import utez.edu.mx.Ferreteria.model.ventadetalle.VentaDetalle;

@Repository
public interface VentaDetalleRepository extends JpaRepository<VentaDetalle,Long> {
}
