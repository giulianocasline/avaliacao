package br.edu.unifeob.ads.controllers;

import javax.inject.Inject;

import avaliacao_models.Quiz;
import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;

@Controller
public class RespostaController {

	private Result result;
	private RespostaDAO respostaDAO;

	public RespostaController(){		
	}
	
	@Inject
	public RespostaController(Result result, RespostaDAO respostaDAO) {		
		this.result = result;
		this.respostaDAO = respostaDAO;
	}
	
	@Path("quiz/")
	public void form(){
		
	}
	
	/*@Post
	public void create(Quiz quiz){
		quizDAO.salvar(quiz);
	}*/
	
	
	
}
