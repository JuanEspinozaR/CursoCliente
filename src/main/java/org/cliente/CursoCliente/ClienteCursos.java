package org.cliente.CursoCliente;

import java.util.List;

import com.escuela.digital.curso.service.Curso;
import com.escuela.digital.curso.service.CursoService;
import com.escuela.digital.curso.service.CursoServiceImplService;

public class ClienteCursos {
	CursoService cursoService = new CursoServiceImplService().getCursoServiceImplPort();
	
	public Curso crearCurso(Curso curso) {
		return cursoService.crearCurso(curso);
	}
	
	public List<Curso> obtieneCurso(){
		return cursoService.obtenerCursos();
	}
	
	public Curso modificaCurso(Curso curso) {
		return cursoService.modificaCurso(curso);
	}
	
	public Curso eliminaCurso(String clave) {
		return cursoService.eliminaCurso(clave);
	}
}
