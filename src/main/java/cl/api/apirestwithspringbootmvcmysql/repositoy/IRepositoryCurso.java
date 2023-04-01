package cl.api.apirestwithspringbootmvcmysql.repositoy;
import cl.api.apirestwithspringbootmvcmysql.model.Curso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRepositoryCurso extends JpaRepository<Curso, Integer> {
}
