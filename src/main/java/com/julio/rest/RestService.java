package com.julio.rest;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import helper.HelperUtils;
import vo.ContaVO;

//http://localhost:8080/teste-ucb-web/rest/service/hello
@Path("/service")
public class RestService {

	@GET
	@Path("/{param}")
	public Response printMessage(@PathParam("param") String msg) {

		String result = "Restful example : " + msg;

		return Response.status(200).entity(result).build();

	}

	@RequestMapping(value = "/allcontas", method = RequestMethod.GET)
	public ResponseEntity<List<ContaVO>> listar() {
		List<ContaVO> body = HelperUtils.getAllContas();
		HttpStatus status = HttpStatus.OK;
		return new ResponseEntity<List<ContaVO>>(body, status);
	}

}