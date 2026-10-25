package utez.edu.mx.Ferreteria.model.producto;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import utez.edu.mx.Ferreteria.model.categoria.Categoria;
import utez.edu.mx.Ferreteria.model.proveedor.Proveedor;

@Table(name = "producto")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto")
    private Long idProducto;

    @Column(name = "codigo_interno")
    private String codigoInterno;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_categoria")
    private Categoria categoria;

    @Column(name = "estado")
    private Boolean estado;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_proveedor")
    private Proveedor proveedor;

    @Column(name = "modalidad_venta")
    private String modalidadVenta;

    @Column(name = "unidad_medida")
    private String unidadMedida;

    @Column(name = "precio_proveedor")
    private double precioProveedor;

    @Column(name = "precio_venta")
    private double precioVenta;

    @Column(name = "venta_minima")
    private int ventaMinima;

    @Column(name = "existencia")
    private int existencia;

    @Column(name = "ubicacion")
    private String ubicacion;
}
