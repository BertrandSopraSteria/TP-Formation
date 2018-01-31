package villages.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Version;

@Entity
public class Pays {
	@Id
	@GeneratedValue
	private Long id;
	
	@Version
	private int version;
	
	@Column
	private String code;
	
	@Column
	private String libelle;
}
