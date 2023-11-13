package br.edu.atitus.pooavancado.atitusound.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.edu.atitus.pooavancado.atitusound.entities.PlaylistEntity;
import br.edu.atitus.pooavancado.atitusound.entities.dtos.PlaylistDTO;
import br.edu.atitus.pooavancado.atitusound.services.GenericService;
import br.edu.atitus.pooavancado.atitusound.services.PlaylistService;

@RestController
@RequestMapping("/playlist")
public class PlaylistController extends GenericController <PlaylistEntity, PlaylistDTO>{
	
	//Spring, Injeção de Dependências
	//Aqui o Spring Framework é responsável pela implementação, 
	//instanciação e injeção dentro do objeto ArtistController
	
	//@Autowired >> Spring recomenda utilizar métodos construtores
	
	private PlaylistService playlistService;
	
	public PlaylistController(PlaylistService playlistService) {
		super();
		this.playlistService = playlistService;
	}
	
	protected PlaylistEntity convertDTO2Entity(PlaylistDTO dto) {
		PlaylistEntity entidade = new PlaylistEntity();
		entidade.setName(dto.getName());
		entidade.setPublic_share(dto.getPublic_share());
		return entidade;
	}

	@Override
	GenericService<PlaylistEntity> getService() {
		return playlistService;
	}

	

}
