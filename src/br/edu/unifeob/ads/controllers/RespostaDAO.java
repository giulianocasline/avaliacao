package br.edu.unifeob.ads.controllers;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import javax.persistence.EntityManager;



@Dependent
public class RespostaDAO {
	
	private EntityManager entityManager;
	
	@Inject
	public RespostaDAO(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	
}
