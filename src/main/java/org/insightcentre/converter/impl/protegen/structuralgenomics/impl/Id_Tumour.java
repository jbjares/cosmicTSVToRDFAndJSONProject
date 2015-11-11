package org.insightcentre.converter.impl.protegen.structuralgenomics.impl;


import java.util.Collection;

import org.protege.owl.codegeneration.WrappedIndividual;
import org.semanticweb.owlapi.model.OWLNamedIndividual;
import org.semanticweb.owlapi.model.OWLOntology;

/**
 * 
 * <p>
 * Generated by Protege (http://protege.stanford.edu). <br>
 * Source Class: Id_Tumour <br>
 * @version generated on Sat Oct 31 12:46:10 GMT 2015 by pc
 */

public interface Id_Tumour extends WrappedIndividual {

    /* ***************************************************
     * Property http://cosmic.sels.insight.org/schema/structuralgenomicarrangements#IdTumourLiteral
     */
     
    /**
     * Gets all property values for the IdTumourLiteral property.<p>
     * 
     * @returns a collection of values for the IdTumourLiteral property.
     */
    Collection<? extends Object> getIdTumourLiteral();

    /**
     * Checks if the class has a IdTumourLiteral property value.<p>
     * 
     * @return true if there is a IdTumourLiteral property value.
     */
    boolean hasIdTumourLiteral();

    /**
     * Adds a IdTumourLiteral property value.<p>
     * 
     * @param newIdTumourLiteral the IdTumourLiteral property value to be added
     */
    void addIdTumourLiteral(Object newIdTumourLiteral);

    /**
     * Removes a IdTumourLiteral property value.<p>
     * 
     * @param oldIdTumourLiteral the IdTumourLiteral property value to be removed.
     */
    void removeIdTumourLiteral(Object oldIdTumourLiteral);



    /* ***************************************************
     * Common interfaces
     */

    OWLNamedIndividual getOwlIndividual();

    OWLOntology getOwlOntology();

    void delete();

}
