package org.insightcentre.converter.impl.protegen.structuralgenomics.impl.impl;


import java.util.Collection;

import org.insightcentre.converter.impl.protegen.structuralgenomics.impl.Id_Tumour;
import org.insightcentre.converter.impl.protegen.structuralgenomics.impl.Mutation_Id;
import org.insightcentre.converter.impl.protegen.structuralgenomics.impl.Sample_Id;
import org.insightcentre.converter.impl.protegen.structuralgenomics.impl.Sample_Name;
import org.insightcentre.converter.impl.protegen.structuralgenomics.impl.StructuralGenomicsArrangements;
import org.insightcentre.converter.impl.protegen.structuralgenomics.impl.Vocabulary;
import org.protege.owl.codegeneration.impl.WrappedIndividualImpl;
import org.protege.owl.codegeneration.inference.CodeGenerationInference;
import org.semanticweb.owlapi.model.IRI;


/**
 * Generated by Protege (http://protege.stanford.edu).<br>
 * Source Class: DefaultStructuralGenomicsArrangements <br>
 * @version generated on Sat Oct 31 12:46:10 GMT 2015 by pc
 */
public class DefaultStructuralGenomicsArrangements extends WrappedIndividualImpl implements StructuralGenomicsArrangements {

    public DefaultStructuralGenomicsArrangements(CodeGenerationInference inference, IRI iri) {
        super(inference, iri);
    }





    /* ***************************************************
     * Object Property http://cosmic.sels.insight.org/schema/structuralgenomicarrangements#Id_Tumour
     */
     
    public Collection<? extends Id_Tumour> getId_Tumour() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_ID_TUMOUR,
                                               DefaultId_Tumour.class);
    }

    public boolean hasId_Tumour() {
	   return !getId_Tumour().isEmpty();
    }

    public void addId_Tumour(Id_Tumour newId_Tumour) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_ID_TUMOUR,
                                       newId_Tumour);
    }

    public void removeId_Tumour(Id_Tumour oldId_Tumour) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_ID_TUMOUR,
                                          oldId_Tumour);
    }


    /* ***************************************************
     * Object Property http://cosmic.sels.insight.org/schema/structuralgenomicarrangements#Mutation_Id
     */
     
    public Collection<? extends Mutation_Id> getMutation_Id() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_MUTATION_ID,
                                               DefaultMutation_Id.class);
    }

    public boolean hasMutation_Id() {
	   return !getMutation_Id().isEmpty();
    }

    public void addMutation_Id(Mutation_Id newMutation_Id) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_MUTATION_ID,
                                       newMutation_Id);
    }

    public void removeMutation_Id(Mutation_Id oldMutation_Id) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_MUTATION_ID,
                                          oldMutation_Id);
    }


    /* ***************************************************
     * Object Property http://cosmic.sels.insight.org/schema/structuralgenomicarrangements#Sample_Id
     */
     
    public Collection<? extends Sample_Id> getSample_Id() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_SAMPLE_ID,
                                               DefaultSample_Id.class);
    }

    public boolean hasSample_Id() {
	   return !getSample_Id().isEmpty();
    }

    public void addSample_Id(Sample_Id newSample_Id) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_SAMPLE_ID,
                                       newSample_Id);
    }

    public void removeSample_Id(Sample_Id oldSample_Id) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_SAMPLE_ID,
                                          oldSample_Id);
    }


    /* ***************************************************
     * Object Property http://cosmic.sels.insight.org/schema/structuralgenomicarrangements#Sample_Name
     */
     
    public Collection<? extends Sample_Name> getSample_Name() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_SAMPLE_NAME,
                                               DefaultSample_Name.class);
    }

    public boolean hasSample_Name() {
	   return !getSample_Name().isEmpty();
    }

    public void addSample_Name(Sample_Name newSample_Name) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_SAMPLE_NAME,
                                       newSample_Name);
    }

    public void removeSample_Name(Sample_Name oldSample_Name) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_SAMPLE_NAME,
                                          oldSample_Name);
    }


    /* ***************************************************
     * Data Property http://cosmic.sels.insight.org/schema/structuralgenomicarrangements#Histology_Subtype_1
     */
     
    public Collection<? extends Object> getHistology_Subtype_1() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HISTOLOGY_SUBTYPE_1, Object.class);
    }

    public boolean hasHistology_Subtype_1() {
		return !getHistology_Subtype_1().isEmpty();
    }

    public void addHistology_Subtype_1(Object newHistology_Subtype_1) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HISTOLOGY_SUBTYPE_1, newHistology_Subtype_1);
    }

    public void removeHistology_Subtype_1(Object oldHistology_Subtype_1) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HISTOLOGY_SUBTYPE_1, oldHistology_Subtype_1);
    }


    /* ***************************************************
     * Data Property http://cosmic.sels.insight.org/schema/structuralgenomicarrangements#Histology_Subtype_3
     */
     
    public Collection<? extends Object> getHistology_Subtype_3() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HISTOLOGY_SUBTYPE_3, Object.class);
    }

    public boolean hasHistology_Subtype_3() {
		return !getHistology_Subtype_3().isEmpty();
    }

    public void addHistology_Subtype_3(Object newHistology_Subtype_3) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HISTOLOGY_SUBTYPE_3, newHistology_Subtype_3);
    }

    public void removeHistology_Subtype_3(Object oldHistology_Subtype_3) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HISTOLOGY_SUBTYPE_3, oldHistology_Subtype_3);
    }


    /* ***************************************************
     * Data Property http://cosmic.sels.insight.org/schema/structuralgenomicarrangements#Id_Study
     */
     
    public Collection<? extends Object> getId_Study() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_ID_STUDY, Object.class);
    }

    public boolean hasId_Study() {
		return !getId_Study().isEmpty();
    }

    public void addId_Study(Object newId_Study) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_ID_STUDY, newId_Study);
    }

    public void removeId_Study(Object oldId_Study) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_ID_STUDY, oldId_Study);
    }


    /* ***************************************************
     * Data Property http://cosmic.sels.insight.org/schema/structuralgenomicarrangements#Mutation_Type
     */
     
    public Collection<? extends Object> getMutation_Type() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_MUTATION_TYPE, Object.class);
    }

    public boolean hasMutation_Type() {
		return !getMutation_Type().isEmpty();
    }

    public void addMutation_Type(Object newMutation_Type) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_MUTATION_TYPE, newMutation_Type);
    }

    public void removeMutation_Type(Object oldMutation_Type) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_MUTATION_TYPE, oldMutation_Type);
    }


    /* ***************************************************
     * Data Property http://cosmic.sels.insight.org/schema/structuralgenomicarrangements#Site_Subtype_1
     */
     
    public Collection<? extends Object> getSite_Subtype_1() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_SITE_SUBTYPE_1, Object.class);
    }

    public boolean hasSite_Subtype_1() {
		return !getSite_Subtype_1().isEmpty();
    }

    public void addSite_Subtype_1(Object newSite_Subtype_1) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_SITE_SUBTYPE_1, newSite_Subtype_1);
    }

    public void removeSite_Subtype_1(Object oldSite_Subtype_1) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_SITE_SUBTYPE_1, oldSite_Subtype_1);
    }


    /* ***************************************************
     * Data Property http://cosmic.sels.insight.org/schema/structuralgenomicarrangements#Site_Subtype_3
     */
     
    public Collection<? extends Object> getSite_Subtype_3() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_SITE_SUBTYPE_3, Object.class);
    }

    public boolean hasSite_Subtype_3() {
		return !getSite_Subtype_3().isEmpty();
    }

    public void addSite_Subtype_3(Object newSite_Subtype_3) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_SITE_SUBTYPE_3, newSite_Subtype_3);
    }

    public void removeSite_Subtype_3(Object oldSite_Subtype_3) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_SITE_SUBTYPE_3, oldSite_Subtype_3);
    }


}
