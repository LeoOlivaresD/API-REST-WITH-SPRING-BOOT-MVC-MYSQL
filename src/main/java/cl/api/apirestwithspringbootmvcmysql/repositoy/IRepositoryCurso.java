package cl.api.apirestwithspringbootmvcmysql.repositoy;
import cl.api.apirestwithspringbootmvcmysql.model.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRepositoryCurso extends JpaRepository<Curso, Integer> {
}
