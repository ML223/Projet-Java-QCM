package models;


/**
 * Classe représentant les questions ouvertes
 * @author Mamadou Niakaté
 * @author Danko Konaté
 */
public class Numeric extends Question {

	/**
	 * Réponse de la question
	 */
	private String answer;
	
	
    /**
     * Constructeur par défaut
     */
    public Numeric() {
    	this.setAnswer("");
    }


    /**
     * Constructeur avec paramètre initialisant le titre, le code et la réponse de la question
     * @param title
     * @param code
     * @param answer
     */
    public Numeric(String title, String code,String answer) {
        super(title,code);
        this.answer = answer;
    }


    /**
     * Tranforme la classe en chaine de caractère grâce à ses attributs
     */
    public String toString() {
    	String output = "\n\t" + this.title + "\n\t" + this.code + "\n";

		return output ;
    }

	/**
	 * Retourne la réponse de la question
	 * @return answer
	 */
	public String getAnswer() {
		return answer;
	}


	/**
	 * Fixe la réponse de la question
	 * @param answer
	 */
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	


	/**
	 * Méthode hériter de la classe parent Question véfiant si la réponse passée en paramètre est vraie ou fausse
	 * @return Boolean
	 */
	public Boolean isCorrect(String answer) {
		return this.answer.equals(answer);
	}

}