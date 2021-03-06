package org.insightcentre.converter.impl.protegen.structuralgenomics.impl.impl;


import java.util.Collection;

import org.insightcentre.converter.impl.protegen.structuralgenomics.impl.Id_Tumour;
import org.insightcentre.converter.impl.protegen.structuralgenomics.impl.Vocabulary;
import org.protege.owl.codegeneration.impl.WrappedIndividualImpl;
import org.protege.owl.codegeneration.inference.CodeGenerationInference;
import org.semanticweb.owlapi.model.IRI;


/**
 * Generated by Protege (http://protege.stanford.edu).<br>
 * Source Class: DefaultId_Tumour <br>
 * @version generated on Sat Oct 31 12:46:10 GMT 2015 by pc
 */
public class DefaultId_Tumour extends WrappedIndividualImpl implements Id_Tumour {

    public DefaultId_Tumour(CodeGenerationInference inference, IRI iri) {
        super(inference, iri);
    }





    /* ***************************************************
     * Data Property http://cosmic.sels.insight.org/schema/structuralgenomicarrangements#IdTumourLiteral
     */
     
    public Collection<? extends Object> getIdTumourLiteral() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_IDTUMOURLITERAL, Object.class);
    }

    public boolean hasIdTumourLiteral() {
		return !getIdTumourLiteral().isEmpty();
    }

    public void addIdTumourLiteral(Object newIdTumourLiteral) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_IDTUMOURLITERAL, newIdTumourLiteral);
    }

    public void removeIdTumourLiteral(Object oldIdTumourLiteral) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_IDTUMOURLITERAL, oldIdTumourLiteral);
    }


}
