package org.insightcentre.converter.impl.protegen.structuralgenomics.impl.impl;


import java.util.Collection;

import org.insightcentre.converter.impl.protegen.structuralgenomics.impl.Sample_Id;
import org.insightcentre.converter.impl.protegen.structuralgenomics.impl.Vocabulary;
import org.protege.owl.codegeneration.impl.WrappedIndividualImpl;
import org.protege.owl.codegeneration.inference.CodeGenerationInference;
import org.semanticweb.owlapi.model.IRI;


/**
 * Generated by Protege (http://protege.stanford.edu).<br>
 * Source Class: DefaultSample_Id <br>
 * @version generated on Sat Oct 31 12:46:10 GMT 2015 by pc
 */
public class DefaultSample_Id extends WrappedIndividualImpl implements Sample_Id {

    public DefaultSample_Id(CodeGenerationInference inference, IRI iri) {
        super(inference, iri);
    }





    /* ***************************************************
     * Data Property http://cosmic.sels.insight.org/schema/structuralgenomicarrangements#SampleIdLiteral
     */
     
    public Collection<? extends Object> getSampleIdLiteral() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_SAMPLEIDLITERAL, Object.class);
    }

    public boolean hasSampleIdLiteral() {
		return !getSampleIdLiteral().isEmpty();
    }

    public void addSampleIdLiteral(Object newSampleIdLiteral) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_SAMPLEIDLITERAL, newSampleIdLiteral);
    }

    public void removeSampleIdLiteral(Object oldSampleIdLiteral) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_SAMPLEIDLITERAL, oldSampleIdLiteral);
    }


}
