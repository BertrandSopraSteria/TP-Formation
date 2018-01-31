import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Version;

@Entity
public class Ville {

	@Id
	@GeneratedValue
	private Long id;
	@Version
	private int version;
	private String code;
	private String libelle;
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
	
	public Ville(String code, String libelle) {
		super();
		this.code = code;
		this.libelle = libelle;
	}
	
	public Ville() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
