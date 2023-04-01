package cl.api.apirestwithspringbootmvcmysql.service;
import cl.api.apirestwithspringbootmvcmysql.model.Curso;
import cl.api.apirestwithspringbootmvcmysql.repositoy.IRepositoryCurso;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class CursoImplService {
    @Autowired
    IRepositoryCurso cursoRepo;

    public void crearCurso(Curso curso){
        cursoRepo.save(curso);
    }
    public List<Curso> listarCursos(){
        return cursoRepo.findAll();
    }
    public Optional<Curso> buscarCursoPorId(Integer id){
        return cursoRepo.findById(id);
    }
    public void actualizar(Curso curso){
        cursoRepo.save(curso);
    }
    public void eliminarCurso(Integer id){
        cursoRepo.deleteById(id);
    }
}
