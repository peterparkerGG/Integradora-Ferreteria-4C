package utez.edu.mx.Ferreteria.model.compra;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import utez.edu.mx.Ferreteria.model.proveedor.Proveedor;
import utez.edu.mx.Ferreteria.model.usuario.Usuario;

import java.time.LocalDateTime;

@Table(name = "compra")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Compra {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_compra")
    private Long idCompra;

    @Column(name = "fecha")
    private LocalDateTime fecha;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_proveedor")
    private Proveedor proveedor;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_usuario")
    private Usuario usuario;
}
