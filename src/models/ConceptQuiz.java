package models;

import java.util.*;

/**
 * La classes présentant les concepts des langages
 * Chaque concept à sa liste de questions
 * @author Mamadou Niakaté
 * @author Danko Konaté
 */
public class ConceptQuiz {
	
	/** Attributs de la classe ConceptQuiz */
	
	/**
	 * Attribut static permettant d'avoir une valeur unique à l'ID dz chaque instance de la classe
	 */
	private static int count;
	
	/**
	 * Liste des questions du concept
	 */
    public ArrayList<Question> questions= new ArrayList<>();
    
    /**
     * Titre du concept
     */

    public  String title;
    
    /**
     * Identifiant du concept
     */
    private  int id;

    
    /**
     *  Constructeur par défaut
     */
    public ConceptQuiz() {
    	this.questions = null;
    	this.title = "";
    }
    
    /**
     * Constructeur avec paramètre initialisant le titre du concept
     * @param title
     */
    public ConceptQuiz(String title) {
    	this.title = title;
    	this.id= ++count;
    }

    /**
     * Melange / désordonne les éléments de la liste des questions du concept
     * @param questions
     * @return ArrayList
     */
    public ArrayList<Question> randomize(ArrayList<Question> questions) { 
    	Collections.shuffle(questions);
    	
    	return questions;
    }

    /**
     * Ajotuer une question à la liste des questions d'un ConceptQuiz
     * @param q
     */
    public void addQuestion( Question q) {
        this.questions.add(q);
    }

    /**
     * Permet d'éditer une question
     * @param id
     * @param titre
     * @param code
     */
    public void editQuestion(int id,String titre,  String code) {
    	this.questions.get(id).setQuestion(titre, code);
    }

    /**
     * Supprime la Question dont 'ID est passé en paramètre
     * @param id
     */
    public void removeQuestion(int id) {
    	this.questions.remove(this.questions.get(id));
    }

    /**
     * Retourne la listes des questions d'un conceptQuiz
     * @return ArrayList
     */
	public ArrayList<Question> getQuestions() {
		ArrayList<Question> questionsRandomized = questions;
		Collections.shuffle(questionsRandomized);
		return questionsRandomized;
	}

	/**
	 * Mettre à jour la liste des questions du concept dépuis l'exterieur de la classe
	 * @param questions
	 */
	public void setQuestions(ArrayList<Question> questions) {
		this.questions = questions;
	}

	/**
	 * Permet d'accéder au titre du concept dépuis l'extérieur de la classes
	 * @return String
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * Mettre à jour le titre du concept dépuis l'exterieur de la classe
	 * @param title
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * Récupérer l'identifiant du concept dépuis l'exterieur de la classe
	 * @return int
	 */
	public int getId() {
		return id;
	}

	/**
	 * Mettre à jour l'identifiant du concept dépuis l'exterieur de la classe
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}


	/**
	 * Convertir la classe en String à travers son attribut titre
	 */
	public String toString() {
		return this.getTitle();
	}
	
	
	public boolean equals(Object obj) {
		  
		//On vérifie si les références d'objets sont identiques
		  if (this == obj)
		    return true;

		  //On s'assure que les objets sont du même type, ici de type ConceptQuiz
		  if (getClass() != obj.getClass())
		    return false;
			
		  //Maintenant, on compare les attributs de nos objets
		  ConceptQuiz other = (ConceptQuiz) obj;

		  return Objects.equals(other.getId(), this.getId()) && Objects.equals(other.getTitle(), this.getTitle());
	}

}