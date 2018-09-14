package Entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;



/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
 
@javax.persistence.Entity 
public class Lieu
{
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	 
	@Column(nullable = false)
	protected String nomLieu;

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	 
	@Column(nullable = false)
	protected int CodePostal;

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	 
	@ManyToMany(mappedBy = "lieu")
	protected Set<Personne> personne;

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	 
	@ManyToMany(mappedBy = "lieu")
	protected Set<Sport> sport;

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false)
	protected Long id;

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public Lieu(){
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public String getNomLieu() {
		return this.nomLieu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public int getCodePostal() {
		return this.CodePostal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public Set<Personne> getPersonne() {
		if(this.personne == null) {
				this.personne = new HashSet<Personne>();
		}
		return (Set<Personne>) this.personne;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public Set<Sport> getSport() {
		if(this.sport == null) {
				this.sport = new HashSet<Sport>();
		}
		return (Set<Sport>) this.sport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public long getId() {
		return this.id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void addAllPersonne(Set<Personne> newPersonne) {
		if (this.personne == null) {
			this.personne = new HashSet<Personne>();
		}
		for (Personne tmp : newPersonne)
			tmp.addLieu(this);
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void addAllSport(Set<Sport> newSport) {
		if (this.sport == null) {
			this.sport = new HashSet<Sport>();
		}
		for (Sport tmp : newSport)
			tmp.addLieu(this);
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void removeAllPersonne(Set<Personne> newPersonne) {
		if(this.personne == null) {
			return;
		}
		
		this.personne.removeAll(newPersonne);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void removeAllSport(Set<Sport> newSport) {
		if(this.sport == null) {
			return;
		}
		
		this.sport.removeAll(newSport);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void setNomLieu(String myNomLieu) {
		this.nomLieu = myNomLieu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void setCodePostal(int myCodePostal) {
		this.CodePostal = myCodePostal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void addPersonne(Personne newPersonne) {
		if(this.personne == null) {
			this.personne = new HashSet<Personne>();
		}
		
		if (this.personne.add(newPersonne))
			newPersonne.addLieu(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void addSport(Sport newSport) {
		if(this.sport == null) {
			this.sport = new HashSet<Sport>();
		}
		
		if (this.sport.add(newSport))
			newSport.addLieu(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void unsetNomLieu() {
		this.nomLieu = "";
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void unsetCodePostal() {
		this.CodePostal = 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void removePersonne(Personne oldPersonne) {
		if(this.personne == null)
			return;
		
		if (this.personne.remove(oldPersonne))
			oldPersonne.removeLieu(this);
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void removeSport(Sport oldSport) {
		if(this.sport == null)
			return;
		
		if (this.sport.remove(oldSport))
			oldSport.removeLieu(this);
		
	}

}

