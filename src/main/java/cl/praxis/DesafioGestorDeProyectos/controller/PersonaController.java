package cl.praxis.DesafioGestorDeProyectos.controller;

import cl.praxis.DesafioGestorDeProyectos.dto.Persona;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonaController {

    @GetMapping("/persona")
    public Persona getPersona() {
        return new Persona("Jacob", "Díaz", 45);
    }

}