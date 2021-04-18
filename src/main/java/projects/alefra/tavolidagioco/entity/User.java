package projects.alefra.tavolidagioco.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter@Setter@NoArgsConstructor
@Table(name = "User")
public class User {

	@Id
	long id ;
	
	@Column(columnDefinition = "VARCHAR(20)")
	String username;
	
	@Column(columnDefinition = "VARCHAR(20)")
	String email;
	
	@Column(columnDefinition = "VARCHAR(20)")
	String password;
	
	//TODO add boolean isEnabled for springsecurity
	
	Date creationDate;
	
	Date udpatingDate;
	
	
	
	
	
}
