package br.edu.atitus.pooavancado.atitusound.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_playlist_music")
public class PlaylistEntity extends GenericEntity{
	
	
	private String name;
	private Boolean public_share;
	public String getName() {
		return name;
	}
    public void setName(String name) {
        this.name = name;
    }
    public Boolean getPublic_share() {
        return public_share;
    }
    public void setPublic_share(Boolean public_share) {
        this.public_share = public_share;
    }
	
}