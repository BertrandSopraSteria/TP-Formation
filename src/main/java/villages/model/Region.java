package villages.model;

public class Region {
	private Integer id;
	private String code;
	private String libelle;
	public synchronized Integer getId() {
		return id;
	}
	public synchronized void setId(Integer id) {
		this.id = id;
	}
	public synchronized String getCode() {
		return code;
	}
	public synchronized void setCode(String code) {
		this.code = code;
	}
	public synchronized String getLibelle() {
		return libelle;
	}
	public synchronized void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	

}
