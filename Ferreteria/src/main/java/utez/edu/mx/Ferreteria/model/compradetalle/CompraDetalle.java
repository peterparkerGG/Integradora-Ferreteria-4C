package utez.edu.mx.Ferreteria.model.compradetalle;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import utez.edu.mx.Ferreteria.model.compra.Compra;
import utez.edu.mx.Ferreteria.model.producto.Producto;

@Table(name = "compra_detalle")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CompraDetalle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_compra_detalle")
    private Long idCompraDetalle;

    @Column(name = "cantidad")
    private Integer cantidad;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_compra")
    private Compra compra;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_producto")
    private Producto producto;

    @Column(name = "costo_adquisicion")
    private double costoAdquisicion;
}
