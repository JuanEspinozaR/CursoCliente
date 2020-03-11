package org.cliente.CursoCliente;

import java.util.List;

import com.escuela.digital.curso.service.Categoria;
import com.escuela.digital.curso.service.Curso;
import com.escuela.digital.curso.service.CursoService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ClienteCursos clienteCurso = new ClienteCursos();
    	
    	if(args[0].equalsIgnoreCase("crear")) {
    		Curso curso = new Curso ();
    		curso.setClave(args[1]);
    		curso.setCategoria(Categoria.DISEÑO_WEB);
    		curso.setDescripcion(args[2]);
    		curso.setNombre(args[3]);
    		System.out.println(curso.getClave() + " "+ curso.getCategoria()+ "  " + curso.getDescripcion()+" "+ curso.getNombre());
    		clienteCurso.crearCurso(curso);
    	}else
    		if(args[0].equalsIgnoreCase("modificar")) {
        		Curso curso = new Curso ();
        		curso.setClave(args[1]);
        		curso.setCategoria(Categoria.DISEÑO_WEB);
        		curso.setDescripcion(args[2]);
        		curso.setNombre(args[3]);
        		clienteCurso.modificaCurso(curso);
    		}
    		else
        		if(args[0].equalsIgnoreCase("mostrar")) {
        			List<Curso> cursos = clienteCurso.obtieneCurso();
        			for(Curso cursoCopy :cursos ) {
        				System.out.println(cursoCopy.getClave() + " == " + cursoCopy.getCategoria());
        			}
        		}else
            		if(args[0].equalsIgnoreCase("elimina")) {
            			clienteCurso.eliminaCurso(args[1]);
            		}


        System.out.println( "Hello World!" );
    }
}
