package utez.edu.mx.Ferreteria.repository.categoria;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import utez.edu.mx.Ferreteria.model.categoria.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
}
