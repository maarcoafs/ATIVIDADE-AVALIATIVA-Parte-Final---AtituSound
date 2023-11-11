package br.edu.atitus.pooavancado.atitusound.controllers;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.edu.atitus.pooavancado.atitusound.entities.ArtistEntity;
import br.edu.atitus.pooavancado.atitusound.entities.MusicEntity;
import br.edu.atitus.pooavancado.atitusound.entities.dtos.ArtistDTO;
import br.edu.atitus.pooavancado.atitusound.entities.dtos.MusicDTO;
import br.edu.atitus.pooavancado.atitusound.services.ArtistService;
import br.edu.atitus.pooavancado.atitusound.services.GenericService;
import br.edu.atitus.pooavancado.atitusound.services.MusicService;

@RestController
@RequestMapping("/musics")
public class MusicController extends GenericController<MusicEntity, MusicDTO>{
	
	//Spring, Injeção de Dependências
	//Aqui o Spring Framework é responsável pela implementação, 
	//instanciação e injeção dentro do objeto ArtistController
	
	//@Autowired >> Spring recomenda utilizar métodos construtores
	
	private MusicService musicService;
	
	public MusicController(MusicService musicService) {
		super();
		this.musicService = musicService;
	}
	
	protected MusicEntity convertDTO2Entity(MusicDTO dto) {
		MusicEntity entidade = new MusicEntity();
		entidade.setName(dto.getName());
		entidade.setDuration(dto.getDuration());
		return entidade;
	}

	@Override
	GenericService<MusicEntity> getService() {
		return musicService;
	}

	

}