// je suis le boss

import java.util.*;

/**
 * 
 */
public class Langage {
	
	  private String name;
	  private Set<ConceptQuiz> conceptQuiz=new HashSet<>();
	  private int id;

    /**
     * Default constructor
     */
    public Langage() {
    	
    }

   public Langage( String name, int id) {
	   this.name=name;
	   this.id=id;
   }
  


    /**
     * Permet de d'ajouter des nouveaux conceptes  
     * @param String title 
     * @return
     */
    public void addConceptQuiz( ConceptQuiz c) {
        // TODO implement here
    	this.conceptQuiz.add(c);
    	
    }

    /**
     * Permet de modifier le tritre d'une concepte 
     * @param String title 
     * @return
     */
    public void editConceptQuiz(int id, String title) {
       
    	Iterator iterator = this.conceptQuiz.iterator();
    	while(iterator.hasNext()) {
    		
    		if(((ConceptQuiz)iterator.next()).getId() == id) {
    			  ((ConceptQuiz)iterator.next()).setTitle(title);
    		}
    	}
    }

    /**
     * Permet de supprimer des conceptes
     * @param String title 
     * @return
     */
    public void removeConceptQuiz( int id) {
    	Iterator iterator = this.conceptQuiz.iterator();
    	while(iterator.hasNext()) {
    		
    		if(((ConceptQuiz)iterator.next()).getId() == id) {
    			 this.conceptQuiz.remove(iterator.next());
    		}
    	}
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<ConceptQuiz> getConceptQuiz() {
		return conceptQuiz;
	}

	public void setConceptQuiz(Set<ConceptQuiz> conceptQuiz) {
		this.conceptQuiz = conceptQuiz;
	}
	
	public String toString() {
		return this.getName();
	}
    

}