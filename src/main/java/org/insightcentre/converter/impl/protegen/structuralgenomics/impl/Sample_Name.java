package org.insightcentre.converter.impl.protegen.structuralgenomics.impl;


import java.util.Collection;

import org.protege.owl.codegeneration.WrappedIndividual;
import org.semanticweb.owlapi.model.OWLNamedIndividual;
import org.semanticweb.owlapi.model.OWLOntology;

/**
 * 
 * <p>
 * Generated by Protege (http://protege.stanford.edu). <br>
 * Source Class: Sample_Name <br>
 * @version generated on Sat Oct 31 12:46:10 GMT 2015 by pc
 */

public interface Sample_Name extends WrappedIndividual {

    /* ***************************************************
     * Property http://cosmic.sels.insight.org/schema/structuralgenomicarrangements#SampleNameLiteral
     */
     
    /**
     * Gets all property values for the SampleNameLiteral property.<p>
     * 
     * @returns a collection of values for the SampleNameLiteral property.
     */
    Collection<? extends Object> getSampleNameLiteral();

    /**
     * Checks if the class has a SampleNameLiteral property value.<p>
     * 
     * @return true if there is a SampleNameLiteral property value.
     */
    boolean hasSampleNameLiteral();

    /**
     * Adds a SampleNameLiteral property value.<p>
     * 
     * @param newSampleNameLiteral the SampleNameLiteral property value to be added
     */
    void addSampleNameLiteral(Object newSampleNameLiteral);

    /**
     * Removes a SampleNameLiteral property value.<p>
     * 
     * @param oldSampleNameLiteral the SampleNameLiteral property value to be removed.
     */
    void removeSampleNameLiteral(Object oldSampleNameLiteral);



    /* ***************************************************
     * Common interfaces
     */

    OWLNamedIndividual getOwlIndividual();

    OWLOntology getOwlOntology();

    void delete();

}
