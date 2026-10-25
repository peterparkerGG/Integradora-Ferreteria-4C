package utez.edu.mx.Ferreteria.model.venta;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import utez.edu.mx.Ferreteria.model.usuario.Usuario;

import java.time.LocalDateTime;

@Table(name = "venta")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Venta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_venta")
    private Long idVenta;

    @Column(name = "id_cliente")
    private Long idCliente;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_usuario")
    private Usuario usuario;

    @Column(name = "fecha")
    private LocalDateTime fecha;
}
