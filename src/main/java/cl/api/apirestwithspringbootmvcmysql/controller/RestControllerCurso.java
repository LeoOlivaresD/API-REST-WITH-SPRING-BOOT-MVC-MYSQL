package cl.api.apirestwithspringbootmvcmysql.controller;
import cl.api.apirestwithspringbootmvcmysql.model.Curso;
import cl.api.apirestwithspringbootmvcmysql.service.CursoImplService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RestControllerCurso {
    @Autowired
    CursoImplService cursoService;

    @GetMapping(value ="/api/listar", headers = "Accept=application/json")
    public List<Curso> listaCursos(){
        return cursoService.listarCursos();
    }
}
