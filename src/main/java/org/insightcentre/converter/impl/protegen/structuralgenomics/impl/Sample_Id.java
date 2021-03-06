package org.insightcentre.converter.impl.protegen.structuralgenomics.impl;


import java.util.Collection;

import org.protege.owl.codegeneration.WrappedIndividual;
import org.semanticweb.owlapi.model.OWLNamedIndividual;
import org.semanticweb.owlapi.model.OWLOntology;

/**
 * 
 * <p>
 * Generated by Protege (http://protege.stanford.edu). <br>
 * Source Class: Sample_Id <br>
 * @version generated on Sat Oct 31 12:46:10 GMT 2015 by pc
 */

public interface Sample_Id extends WrappedIndividual {

    /* ***************************************************
     * Property http://cosmic.sels.insight.org/schema/structuralgenomicarrangements#SampleIdLiteral
     */
     
    /**
     * Gets all property values for the SampleIdLiteral property.<p>
     * 
     * @returns a collection of values for the SampleIdLiteral property.
     */
    Collection<? extends Object> getSampleIdLiteral();

    /**
     * Checks if the class has a SampleIdLiteral property value.<p>
     * 
     * @return true if there is a SampleIdLiteral property value.
     */
    boolean hasSampleIdLiteral();

    /**
     * Adds a SampleIdLiteral property value.<p>
     * 
     * @param newSampleIdLiteral the SampleIdLiteral property value to be added
     */
    void addSampleIdLiteral(Object newSampleIdLiteral);

    /**
     * Removes a SampleIdLiteral property value.<p>
     * 
     * @param oldSampleIdLiteral the SampleIdLiteral property value to be removed.
     */
    void removeSampleIdLiteral(Object oldSampleIdLiteral);



    /* ***************************************************
     * Common interfaces
     */

    OWLNamedIndividual getOwlIndividual();

    OWLOntology getOwlOntology();

    void delete();

}
