package br.edu.unifeob.ads.controllers;

import java.util.List;

import javax.inject.Inject;

import avaliacao_models.Quiz;
import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.view.Results;

@Controller
public class QuizController {

	private Result result;
	private QuizDAO quizDAO;

	public QuizController(){		
	}
	
	@Inject
	public QuizController(Result result, QuizDAO quizDAO) {		
		this.result = result;
		this.quizDAO = quizDAO;
	}
	
	@Path("quizzes")
	public void listar(){
		List<Quiz> quizzes = quizDAO.listar();
		result.use(Results.json()).from(quizzes).serialize();
	}
	
	
	
}
