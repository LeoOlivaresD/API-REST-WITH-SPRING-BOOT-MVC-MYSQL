package cl.api.apirestwithspringbootmvcmysql.repositoy;
import cl.api.apirestwithspringbootmvcmysql.model.Estudiantes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRepositoryEstudiantes extends JpaRepository<Estudiantes, Integer> {

}
