package com.app;
/**
 * Interface for the controller the logic might changes in diffrent implementation  
 * but this provide a unify way to implement the two systems.
 * @author Tuan Nguyen 
 *
 */
import java.io.File;  
 interface Controller {
	 /**
	  * Remove the patient with such id 
	  * @param id
	  */
	    void remove(int id) ;
	    /**
	     * Remove the patient with that such name  
	     * @param name
	     */
	    void remove(String name) ;
	    /**
	     * Add a patient to the system  
	     * @param p
	     */
	    void add(Patient p) ;

	    /**
	     * Add the patient data to the system.
	     * The string arrays is a an array tokenized from the readline data 
	     * @param data
	     */
		void add(String[] data); 

	    /** 
	     * Edit the info of the patient  
	     * @param id of the patient  
	     */
	    void edit(int id )  ;
	    /**
	     * Edit the info of the patient with this name 
	     * @param name
	     */
	    void edit(String name) ;
	    /**
	     * Load file  to the controller with diffrent implementation 
	     * @param file
	     */
	    void load (File file) ;
	    /**
	     * Export file  
	     * @param path
	     */
	    void export(String path) ;

	    /**
	     * Print the summary details for the current system.
	     * Summary details will include: Total patient,Total high risk patient,Most busiest time . 
	     */
	    void summary() ;
	    /**
	     * 
	     * @return the current number of patient in the system
	     */
	    int count();
	    /** 
	     * 
	     * @param name
	     * @return
	     */
	    boolean search(String name) ;
	    /** 
	     * 
	     * @param id
	     * @return
	     */
	    boolean search(int id) ;
}
