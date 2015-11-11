package org.insightcentre.converter.impl.protegen.methylation.impl.impl;


import java.util.Collection;

import org.insightcentre.converter.impl.protegen.methylation.impl.Chromosome;
import org.insightcentre.converter.impl.protegen.methylation.impl.Vocabulary;
import org.protege.owl.codegeneration.impl.WrappedIndividualImpl;
import org.protege.owl.codegeneration.inference.CodeGenerationInference;
import org.semanticweb.owlapi.model.IRI;


/**
 * Generated by Protege (http://protege.stanford.edu).<br>
 * Source Class: DefaultChromosome <br>
 * @version generated on Sat Oct 31 12:49:53 GMT 2015 by pc
 */
public class DefaultChromosome extends WrappedIndividualImpl implements Chromosome {

    public DefaultChromosome(CodeGenerationInference inference, IRI iri) {
        super(inference, iri);
    }





    /* ***************************************************
     * Data Property http://cosmic.sels.insight.org/schema/Methylation#ChromosomeNameLiteral
     */
     
    public Collection<? extends Object> getChromosomeNameLiteral() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_CHROMOSOMENAMELITERAL, Object.class);
    }

    public boolean hasChromosomeNameLiteral() {
		return !getChromosomeNameLiteral().isEmpty();
    }

    public void addChromosomeNameLiteral(Object newChromosomeNameLiteral) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_CHROMOSOMENAMELITERAL, newChromosomeNameLiteral);
    }

    public void removeChromosomeNameLiteral(Object oldChromosomeNameLiteral) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_CHROMOSOMENAMELITERAL, oldChromosomeNameLiteral);
    }


}