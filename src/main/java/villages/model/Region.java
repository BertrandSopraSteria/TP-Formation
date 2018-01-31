package villages.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Version;

@Entity
public class Region {
	@Id
	@GeneratedValue
	private Long id;

	@Version
	private int version;

	@Column
	private String code;

	@Column
	private String libelle;

	public Region() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Region(String code, String libelle) {
		super();
		this.code = code;
		this.libelle = libelle;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
}