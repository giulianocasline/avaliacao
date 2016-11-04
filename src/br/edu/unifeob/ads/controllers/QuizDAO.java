package br.edu.unifeob.ads.controllers;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import javax.persistence.EntityManager;



@Dependent
public class QuizDAO {
	
	private EntityManager entityManager;
	
	@Inject
	public QuizDAO(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	
}
