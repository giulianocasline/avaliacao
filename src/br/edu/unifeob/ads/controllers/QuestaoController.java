package br.edu.unifeob.ads.controllers;

import javax.inject.Inject;

import avaliacao_models.Quiz;
import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;

@Controller
public class QuestaoController {

	private Result result;
	private QuestaoDAO questaoDAO;

	public QuestaoController(){		
	}
	
	@Inject
	public QuestaoController(Result result, QuestaoDAO questaoDAO) {		
		this.result = result;
		this.questaoDAO = questaoDAO;
	}
	
	@Path("quiz/")
	public void form(){
		
	}
	
	/*@Post
	public void create(Quiz quiz){
		quizDAO.salvar(quiz);
	}*/
	
	
	
}
