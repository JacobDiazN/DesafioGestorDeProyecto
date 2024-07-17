package cl.praxis.DesafioGestorDeProyectos;

import cl.praxis.DesafioGestorDeProyectos.dto.Persona;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesafioGestorDeProyectosApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesafioGestorDeProyectosApplication.class, args);

		// Crear y mostrar la persona en la consola
		Persona persona = new Persona("Jacob", "Diaz", 45);
		System.out.println(persona);
	}

}
