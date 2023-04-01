package cl.api.apirestwithspringbootmvcmysql.model;
import jakarta.persistence.*;

@Entity
public class Estudiantes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_estudiante")
    private Integer idEstudiante;
    @Column(length = 30,nullable = false)
    private String nombre;
    @Column(length = 30,nullable = false)
    private String apellido;
    @ManyToOne
    @JoinColumn(name = "estudiante_id")
    private Curso curso;
    public Estudiantes(){
    }

    public Integer getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(Integer idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        apellido = apellido;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }
}
