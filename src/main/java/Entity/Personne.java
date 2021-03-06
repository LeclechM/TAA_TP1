package Entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;



/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
 
@Entity
public class Personne
{
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	 
	@Column(nullable = false)
	protected String Nom;

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	 
	@Column(nullable = false)
	protected String Prenom;

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	 
	@Column(nullable = false)
	protected String email;

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	 
	@ManyToMany
	protected Set<Lieu> lieu;

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false)
	protected Long id ;

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public Personne(){
		super();
	}

	public Personne(String prenom, String nom, String email){
	    this.setPrenom(prenom);
	    this.setNom(nom);
	    this.setEmail(email);
    }
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public String getNom() {
		return this.Nom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public String getPrenom() {
		return this.Prenom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public String getEmail() {
		return this.email;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public Set<Lieu> getLieu() {
		if(this.lieu == null) {
				this.lieu = new HashSet<Lieu>();
		}
		return (Set<Lieu>) this.lieu;
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
	public void addAllLieu(Set<Lieu> newLieu) {
		if (this.lieu == null) {
			this.lieu = new HashSet<Lieu>();
		}
		for (Lieu tmp : newLieu)
			tmp.addPersonne(this);
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void removeAllLieu(Set<Lieu> newLieu) {
		if(this.lieu == null) {
			return;
		}
		
		this.lieu.removeAll(newLieu);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void setNom(String myNom) {
		this.Nom = myNom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void setPrenom(String myPrenom) {
		this.Prenom = myPrenom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void setEmail(String myEmail) {
		this.email = myEmail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void addLieu(Lieu newLieu) {
		if(this.lieu == null) {
			this.lieu = new HashSet<Lieu>();
		}
		
		if (this.lieu.add(newLieu))
			newLieu.addPersonne(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void unsetNom() {
		this.Nom = "";
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void unsetPrenom() {
		this.Prenom = "";
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void unsetEmail() {
		this.email = "";
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void removeLieu(Lieu oldLieu) {
		if(this.lieu == null)
			return;
		
		if (this.lieu.remove(oldLieu))
			oldLieu.removePersonne(this);
		
	}
	@Override
	public String toString(){
	    return this.getNom() + " " + this.getPrenom() + " " + this.getEmail();
    }

}

