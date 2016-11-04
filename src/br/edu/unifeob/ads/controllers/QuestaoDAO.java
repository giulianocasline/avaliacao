package br.edu.unifeob.ads.controllers;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import javax.persistence.EntityManager;



@Dependent
public class QuestaoDAO {
	
	private EntityManager entityManager;
	
	@Inject
	public QuestaoDAO(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	
}
