package utez.edu.mx.Ferreteria.repository.compra;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import utez.edu.mx.Ferreteria.model.compra.Compra;

@Repository
public interface CompraRepository extends JpaRepository<Compra,Long> {
}
