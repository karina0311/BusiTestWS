package com.mycompany.busitestws.services;

import com.mycompany.busitestws.dao.EspecialidadDAO;
import com.mycompany.busitestws.model.Especialidad;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author Karina
 */
@Path("servicios")
public class Servicios {
    
    //SIMULACION DE BD
    /*private static Map<Integer,Especialidad> especialidades = new HashMap<Integer,Especialidad>();
    
    static{
        for(int i=0;i<10;i++){
            Especialidad especialidad = new Especialidad();
            int id = i+1;
            especialidad.setIdespecialidad(id);
            especialidad.setNombre("Especialidad "+id);
            especialidad.setDescripcion("Descripcion "+id);
            especialidad.setArea("Area "+id);
            
            especialidades.put(id,especialidad);
        }
    }*/
    
    private final EspecialidadDAO especialidadDAO = new EspecialidadDAO();
    
    @GET
    @Path("/getEspecialidadByIDXML/{id}")
    @Produces(MediaType.APPLICATION_XML)
    public Especialidad getEspecialidadByIDXML(@PathParam("id") int id){
        return especialidadDAO.getEspecialidadByID(id);
    }
    
    @GET
    @Path("/getEspecialidadByIDJSON/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Especialidad getEspecialidadByIDJSON(@PathParam("id") int id){
        return especialidadDAO.getEspecialidadByID(id);
    }
    
    @GET
    @Path("/getAllEspecialidadesXML")
    @Produces(MediaType.APPLICATION_XML)
    public List<Especialidad> getAllEspecialidadesXML(){
        return especialidadDAO.getAllEspecialidades();
    }
    
    @GET
    @Path("/getAllEspecialidadesJSON")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Especialidad> getAllEspecialidadesJSON(){
        return especialidadDAO.getAllEspecialidades();
    }
}
