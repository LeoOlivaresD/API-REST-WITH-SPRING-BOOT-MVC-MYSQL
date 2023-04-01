package cl.api.apirestwithspringbootmvcmysql.controller;
import cl.api.apirestwithspringbootmvcmysql.model.Curso;
import cl.api.apirestwithspringbootmvcmysql.service.CursoImplService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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
}
