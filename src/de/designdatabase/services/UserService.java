package de.designdatabase.services;


import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;

@Path("/generic")
public class UserService {
    @SuppressWarnings("unused")
    @Context
    private UriInfo context;

    /**
     * Default constructor. 
     */
    public UserService() {
        // TODO Auto-generated constructor stub
    }

    /**
     * Retrieves representation of an instance of User
     * @return an instance of String
     */
    @GET
    @Path("user")
    @Produces("application/json")
    public String get() {
        // TODO return proper representation object
        //throw new UnsupportedOperationException();
    	
    	return "{ \"message\" : \"HELLO WORLD\" }";
    }

    /**
     * PUT method for updating or creating an instance of User
     * @param content representation for the resource
     * @return an HTTP response with content of the updated or created resource.
     */
    @PUT
    @Consumes("application/xml")
    public void putXml(String content) {
    }

}