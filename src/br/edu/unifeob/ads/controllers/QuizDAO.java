package br.edu.unifeob.ads.controllers;

import java.util.List;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import avaliacao_models.Quiz;



@Dependent
public class QuizDAO {
	
	private EntityManager entityManager;
	
	@Inject
	public QuizDAO(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	
	public List<Quiz> listar(){
		return entityManager.createQuery("from Quiz", Quiz.class).getResultList();
	}
	
}
