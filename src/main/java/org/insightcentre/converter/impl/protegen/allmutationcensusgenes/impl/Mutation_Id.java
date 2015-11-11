package org.insightcentre.converter.impl.protegen.allmutationcensusgenes.impl;


import java.util.Collection;

import org.protege.owl.codegeneration.WrappedIndividual;
import org.semanticweb.owlapi.model.OWLNamedIndividual;
import org.semanticweb.owlapi.model.OWLOntology;

/**
 * 
 * <p>
 * Generated by Protege (http://protege.stanford.edu). <br>
 * Source Class: Mutation_Id <br>
 * @version generated on Sat Oct 31 09:17:42 GMT 2015 by pc
 */

public interface Mutation_Id extends WrappedIndividual {

    /* ***************************************************
     * Property http://cosmic.sels.insight.org/schema/allmutationgenes#MutatioIdLiteral
     */
     
    /**
     * Gets all property values for the MutatioIdLiteral property.<p>
     * 
     * @returns a collection of values for the MutatioIdLiteral property.
     */
    Collection<? extends Object> getMutatioIdLiteral();

    /**
     * Checks if the class has a MutatioIdLiteral property value.<p>
     * 
     * @return true if there is a MutatioIdLiteral property value.
     */
    boolean hasMutatioIdLiteral();

    /**
     * Adds a MutatioIdLiteral property value.<p>
     * 
     * @param newMutatioIdLiteral the MutatioIdLiteral property value to be added
     */
    void addMutatioIdLiteral(Object newMutatioIdLiteral);

    /**
     * Removes a MutatioIdLiteral property value.<p>
     * 
     * @param oldMutatioIdLiteral the MutatioIdLiteral property value to be removed.
     */
    void removeMutatioIdLiteral(Object oldMutatioIdLiteral);



    /* ***************************************************
     * Common interfaces
     */

    OWLNamedIndividual getOwlIndividual();

    OWLOntology getOwlOntology();

    void delete();

}