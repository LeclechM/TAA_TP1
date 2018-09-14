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
public class Sport
{
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	 
	@Column(nullable = false)
	protected String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	 
	@Enumerated(javax.persistence.EnumType.STRING)
	@Column(nullable = false)
	protected Niveaux niveau;

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
	public Sport(){
		super();
	}

	public Sport(String name,Niveaux niveau){
	    this.setName(name);
	    this.setNiveau(niveau);
    }
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public Niveaux getNiveau() {
		return this.niveau;
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
			tmp.addSport(this);
		
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
	public void setName(String myName) {
		this.name = myName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void setNiveau(Niveaux myNiveau) {
		this.niveau = myNiveau;
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
			newLieu.addSport(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void unsetName() {
		this.name = "";
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void unsetNiveau() {
		this.niveau = Niveaux.BEGINNER;
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
			oldLieu.removeSport(this);
		
	}

}

