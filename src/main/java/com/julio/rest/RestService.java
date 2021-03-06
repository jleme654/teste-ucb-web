package com.julio.rest;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.julio.helper.HelperUtils;
import com.julio.vo.ContaVO;


//http://localhost:8080/teste-ucb-web/rest/service/hello
@Path("/service")
public class RestService {
	
	@Inject
	private ServiceApplication tutorialService;
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getById() {
		System.out.println("aqui");
		final List<ContaVO> tutorials = tutorialService.getAllContas();
		return Response.ok(tutorials).build();
	}

	@GET
	@Path("/{param}")
	public Response printMessage(@PathParam("param") String msg) {
		String result = "Restful example : " + msg;
		return Response.status(200).entity(result).build();

	}

	@RequestMapping(value = "/allcontas", method = RequestMethod.GET)
	public ResponseEntity<List<ContaVO>> listar() {
		System.out.println("aqui de novo");
		List<ContaVO> body = HelperUtils.getAllContas();
		HttpStatus status = HttpStatus.OK;
		return new ResponseEntity<List<ContaVO>>(body, status);
	}

}