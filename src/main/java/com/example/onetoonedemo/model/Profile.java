package com.example.onetoonedemo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_profile")
public class Profile {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cod_profile")
	private Long codigo;
	
	@Column(name = "youtube_channel")
	private String youtubeChannel;
	
	@Column(name = "facebook")
	private String facebook;
	
	@Column(name = "linkedin")
	private String linkedin;

	public Profile() {

	}

	public Profile(String youtubeChannel, String facebook, String linkedin) {
		super();
		this.youtubeChannel = youtubeChannel;
		this.facebook = facebook;
		this.linkedin = linkedin;
	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getYoutubeChannel() {
		return youtubeChannel;
	}

	public void setYoutubeChannel(String youtubeChannel) {
		this.youtubeChannel = youtubeChannel;
	}

	public String getFacebook() {
		return facebook;
	}

	public void setFacebook(String facebook) {
		this.facebook = facebook;
	}

	public String getLinkedin() {
		return linkedin;
	}

	public void setLinkedin(String linkedin) {
		this.linkedin = linkedin;
	}

}
