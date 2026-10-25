package utez.edu.mx.Ferreteria.model.proveedor;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "proveedor")
@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Proveedor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_proveedor")
    private Long idProveedor;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "primero_apellido")
    private String primeroApellido;

    @Column(name = "segundo_apellido")
    private String segundoApellido;

    @Column(name = "empresa")
    private String empresa;

    @Column(name = "telefono")
    private String telefono;

    @Column(name = "correo")
    private String correo;
}
