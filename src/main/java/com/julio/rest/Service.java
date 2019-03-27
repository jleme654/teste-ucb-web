package com.julio.rest;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import com.julio.helper.HelperUtils;
import com.julio.vo.ContaVO;

import org.springframework.stereotype.Service;

@Service
public class Service {
	
	private final List<ContaVO> contas = new ArrayList<>();
	
	@PostConstruct
	public void init() {
		contas = HelperUtils.getAllContas();
	}
	
/*	public Tutorial getById(Long tutorialId) {
		return tutorials.stream().filter((tutorial) -> tutorial.getId() == tutorialId).findFirst().get();
	}
*/	
	public List<ContaVO> getAllContas() {
		return contas;
	}
}