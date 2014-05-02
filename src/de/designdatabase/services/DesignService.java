package de.designdatabase.services;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import de.designdatabase.dao.DesignDAO;
import de.designdatabase.model.Design;

@Path("/design")
@RequestScoped
public class DesignService {
	
	public void constructor(){
		
	}
	
	@EJB
    private DesignDAO designDAO;

	
	@GET
	public String Hello(){
		
		Design design = new Design();
		design.setTitle("title");
		design.setDescription("description");
		design.setDesignerName("designername");
		designDAO.addPerson(design );
		return "Hello "+designDAO.findDesignById(1l);
	}
	
}
