package utez.edu.mx.Ferreteria.repository.compradetalle;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import utez.edu.mx.Ferreteria.model.compradetalle.CompraDetalle;

@Repository
public interface CompraDetalleRepository extends JpaRepository<CompraDetalle,Long> {
}
