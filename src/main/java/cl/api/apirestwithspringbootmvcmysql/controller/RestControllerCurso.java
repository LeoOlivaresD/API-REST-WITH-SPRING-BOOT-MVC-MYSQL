package cl.api.apirestwithspringbootmvcmysql.controller;
import cl.api.apirestwithspringbootmvcmysql.model.Curso;
import cl.api.apirestwithspringbootmvcmysql.service.CursoImplService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
public class RestControllerCurso {
    @Autowired
    CursoImplService cursoService;

    @PostMapping(value = "/api/crear", headers = "Accept=application/json")
    public void crearCurso(@RequestBody Curso curso){
        cursoService.crearCurso(curso);
    }
    @GetMapping(value ="/api/listar", headers = "Accept=application/json")
    public List<Curso> listaCursos(){
        return cursoService.listarCursos();
    }
    @GetMapping(value = "/api/listarPorId/{id}", headers = "Accept=application/json")
    public Optional<Curso> curso (@PathVariable Integer id){
        return cursoService.buscarCursoPorId(id);
    }
    @PutMapping(value = "/api/actualizar")
    public void actualizarCurso (@RequestBody Curso curso){
        cursoService.actualizar(curso);
    }
    @DeleteMapping(value = "/api/eliminar/{id}")
    public void eliminarCurso(@PathVariable Integer id){
        cursoService.eliminarCurso(id);
    }
}
