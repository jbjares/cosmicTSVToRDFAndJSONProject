package org.insightcentre.converter.impl.protegen.structuralgenomics.impl;


import java.util.Collection;

import org.protege.owl.codegeneration.WrappedIndividual;
import org.semanticweb.owlapi.model.OWLNamedIndividual;
import org.semanticweb.owlapi.model.OWLOntology;

/**
 * 
 * <p>
 * Generated by Protege (http://protege.stanford.edu). <br>
 * Source Class: Mutation_Id <br>
 * @version generated on Sat Oct 31 12:46:10 GMT 2015 by pc
 */

public interface Mutation_Id extends WrappedIndividual {

    /* ***************************************************
     * Property http://cosmic.sels.insight.org/schema/structuralgenomicarrangements#MutationIdLiteral
     */
     
    /**
     * Gets all property values for the MutationIdLiteral property.<p>
     * 
     * @returns a collection of values for the MutationIdLiteral property.
     */
    Collection<? extends Object> getMutationIdLiteral();

    /**
     * Checks if the class has a MutationIdLiteral property value.<p>
     * 
     * @return true if there is a MutationIdLiteral property value.
     */
    boolean hasMutationIdLiteral();

    /**
     * Adds a MutationIdLiteral property value.<p>
     * 
     * @param newMutationIdLiteral the MutationIdLiteral property value to be added
     */
    void addMutationIdLiteral(Object newMutationIdLiteral);

    /**
     * Removes a MutationIdLiteral property value.<p>
     * 
     * @param oldMutationIdLiteral the MutationIdLiteral property value to be removed.
     */
    void removeMutationIdLiteral(Object oldMutationIdLiteral);



    /* ***************************************************
     * Common interfaces
     */

    OWLNamedIndividual getOwlIndividual();

    OWLOntology getOwlOntology();

    void delete();

}