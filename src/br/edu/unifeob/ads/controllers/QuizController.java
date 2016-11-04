package br.edu.unifeob.ads.controllers;

import javax.inject.Inject;

import avaliacao_models.Quiz;
import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;

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
	
	@Path("quiz/")
	public void form(){
		
	}
	
	/*@Post
	public void create(Quiz quiz){
		quizDAO.salvar(quiz);
	}*/
	
	
	
}
