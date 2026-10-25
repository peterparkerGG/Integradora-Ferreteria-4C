package utez.edu.mx.Ferreteria.model.ventadetalle;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import utez.edu.mx.Ferreteria.model.producto.Producto;
import utez.edu.mx.Ferreteria.model.venta.Venta;


@Table(name = "venta_detalle")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class VentaDetalle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_venta_detalle")
    private Long idVentaDetalle;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_venta")
    private Venta venta;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_producto")
    private Producto producto;

    @Column(name = "cantidad")
    private Integer cantidad;

    @Column(name = "precio_venta_capturado")
    private double precioVentaCapturado;
}
