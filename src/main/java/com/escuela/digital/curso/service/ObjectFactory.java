
package com.escuela.digital.curso.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.escuela.digital.curso.service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CrearCurso_QNAME = new QName("http://service.curso.digital.escuela.com/", "crearCurso");
    private final static QName _CrearCursoResponse_QNAME = new QName("http://service.curso.digital.escuela.com/", "crearCursoResponse");
    private final static QName _ObtenerCursos_QNAME = new QName("http://service.curso.digital.escuela.com/", "obtenerCursos");
    private final static QName _EliminaCurso_QNAME = new QName("http://service.curso.digital.escuela.com/", "eliminaCurso");
    private final static QName _ModificaCursoResponse_QNAME = new QName("http://service.curso.digital.escuela.com/", "modificaCursoResponse");
    private final static QName _ModificaCurso_QNAME = new QName("http://service.curso.digital.escuela.com/", "modificaCurso");
    private final static QName _ObtenerCursosResponse_QNAME = new QName("http://service.curso.digital.escuela.com/", "obtenerCursosResponse");
    private final static QName _EliminaCursoResponse_QNAME = new QName("http://service.curso.digital.escuela.com/", "eliminaCursoResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.escuela.digital.curso.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EliminaCurso }
     * 
     */
    public EliminaCurso createEliminaCurso() {
        return new EliminaCurso();
    }

    /**
     * Create an instance of {@link ModificaCursoResponse }
     * 
     */
    public ModificaCursoResponse createModificaCursoResponse() {
        return new ModificaCursoResponse();
    }

    /**
     * Create an instance of {@link ObtenerCursos }
     * 
     */
    public ObtenerCursos createObtenerCursos() {
        return new ObtenerCursos();
    }

    /**
     * Create an instance of {@link CrearCurso }
     * 
     */
    public CrearCurso createCrearCurso() {
        return new CrearCurso();
    }

    /**
     * Create an instance of {@link CrearCursoResponse }
     * 
     */
    public CrearCursoResponse createCrearCursoResponse() {
        return new CrearCursoResponse();
    }

    /**
     * Create an instance of {@link ObtenerCursosResponse }
     * 
     */
    public ObtenerCursosResponse createObtenerCursosResponse() {
        return new ObtenerCursosResponse();
    }

    /**
     * Create an instance of {@link EliminaCursoResponse }
     * 
     */
    public EliminaCursoResponse createEliminaCursoResponse() {
        return new EliminaCursoResponse();
    }

    /**
     * Create an instance of {@link ModificaCurso }
     * 
     */
    public ModificaCurso createModificaCurso() {
        return new ModificaCurso();
    }

    /**
     * Create an instance of {@link Curso }
     * 
     */
    public Curso createCurso() {
        return new Curso();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearCurso }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.curso.digital.escuela.com/", name = "crearCurso")
    public JAXBElement<CrearCurso> createCrearCurso(CrearCurso value) {
        return new JAXBElement<CrearCurso>(_CrearCurso_QNAME, CrearCurso.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearCursoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.curso.digital.escuela.com/", name = "crearCursoResponse")
    public JAXBElement<CrearCursoResponse> createCrearCursoResponse(CrearCursoResponse value) {
        return new JAXBElement<CrearCursoResponse>(_CrearCursoResponse_QNAME, CrearCursoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerCursos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.curso.digital.escuela.com/", name = "obtenerCursos")
    public JAXBElement<ObtenerCursos> createObtenerCursos(ObtenerCursos value) {
        return new JAXBElement<ObtenerCursos>(_ObtenerCursos_QNAME, ObtenerCursos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminaCurso }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.curso.digital.escuela.com/", name = "eliminaCurso")
    public JAXBElement<EliminaCurso> createEliminaCurso(EliminaCurso value) {
        return new JAXBElement<EliminaCurso>(_EliminaCurso_QNAME, EliminaCurso.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModificaCursoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.curso.digital.escuela.com/", name = "modificaCursoResponse")
    public JAXBElement<ModificaCursoResponse> createModificaCursoResponse(ModificaCursoResponse value) {
        return new JAXBElement<ModificaCursoResponse>(_ModificaCursoResponse_QNAME, ModificaCursoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModificaCurso }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.curso.digital.escuela.com/", name = "modificaCurso")
    public JAXBElement<ModificaCurso> createModificaCurso(ModificaCurso value) {
        return new JAXBElement<ModificaCurso>(_ModificaCurso_QNAME, ModificaCurso.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerCursosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.curso.digital.escuela.com/", name = "obtenerCursosResponse")
    public JAXBElement<ObtenerCursosResponse> createObtenerCursosResponse(ObtenerCursosResponse value) {
        return new JAXBElement<ObtenerCursosResponse>(_ObtenerCursosResponse_QNAME, ObtenerCursosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminaCursoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.curso.digital.escuela.com/", name = "eliminaCursoResponse")
    public JAXBElement<EliminaCursoResponse> createEliminaCursoResponse(EliminaCursoResponse value) {
        return new JAXBElement<EliminaCursoResponse>(_EliminaCursoResponse_QNAME, EliminaCursoResponse.class, null, value);
    }

}
