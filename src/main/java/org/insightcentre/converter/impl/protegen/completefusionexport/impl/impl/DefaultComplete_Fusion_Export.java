package org.insightcentre.converter.impl.protegen.completefusionexport.impl.impl;


import java.util.Collection;

import org.insightcentre.converter.impl.protegen.completefusionexport.impl.Complete_Fusion_Export;
import org.insightcentre.converter.impl.protegen.completefusionexport.impl.Fusion_Id;
import org.insightcentre.converter.impl.protegen.completefusionexport.impl.Vocabulary;
import org.protege.owl.codegeneration.impl.WrappedIndividualImpl;
import org.protege.owl.codegeneration.inference.CodeGenerationInference;
import org.semanticweb.owlapi.model.IRI;


/**
 * Generated by Protege (http://protege.stanford.edu).<br>
 * Source Class: DefaultComplete_Fusion_Export <br>
 * @version generated on Fri Nov 06 12:26:57 GMT 2015 by pc
 */
public class DefaultComplete_Fusion_Export extends WrappedIndividualImpl implements Complete_Fusion_Export {

    public DefaultComplete_Fusion_Export(CodeGenerationInference inference, IRI iri) {
        super(inference, iri);
    }





    /* ***************************************************
     * Object Property http://cosmic.sels.insight.org/schema/completefusionexport#Fusion_Id
     */
     
    public Collection<? extends Fusion_Id> getFusion_Id() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_FUSION_ID,
                                               DefaultFusion_Id.class);
    }

    public boolean hasFusion_Id() {
	   return !getFusion_Id().isEmpty();
    }

    public void addFusion_Id(Fusion_Id newFusion_Id) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_FUSION_ID,
                                       newFusion_Id);
    }

    public void removeFusion_Id(Fusion_Id oldFusion_Id) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_FUSION_ID,
                                          oldFusion_Id);
    }


    /* ***************************************************
     * Data Property http://cosmic.sels.insight.org/schema/completefusionexport#Fusion_Type
     */
     
    public Collection<? extends Object> getFusion_Type() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_FUSION_TYPE, Object.class);
    }

    public boolean hasFusion_Type() {
		return !getFusion_Type().isEmpty();
    }

    public void addFusion_Type(Object newFusion_Type) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_FUSION_TYPE, newFusion_Type);
    }

    public void removeFusion_Type(Object oldFusion_Type) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_FUSION_TYPE, oldFusion_Type);
    }


    /* ***************************************************
     * Data Property http://cosmic.sels.insight.org/schema/completefusionexport#Histology_Subtype_1
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
     * Data Property http://cosmic.sels.insight.org/schema/completefusionexport#Histology_Subtype_3
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
     * Data Property http://cosmic.sels.insight.org/schema/completefusionexport#Primary_Site
     */
     
    public Collection<? extends Object> getPrimary_Site() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_PRIMARY_SITE, Object.class);
    }

    public boolean hasPrimary_Site() {
		return !getPrimary_Site().isEmpty();
    }

    public void addPrimary_Site(Object newPrimary_Site) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_PRIMARY_SITE, newPrimary_Site);
    }

    public void removePrimary_Site(Object oldPrimary_Site) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_PRIMARY_SITE, oldPrimary_Site);
    }


    /* ***************************************************
     * Data Property http://cosmic.sels.insight.org/schema/completefusionexport#Pubmed_PMID
     */
     
    public Collection<? extends Object> getPubmed_PMID() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_PUBMED_PMID, Object.class);
    }

    public boolean hasPubmed_PMID() {
		return !getPubmed_PMID().isEmpty();
    }

    public void addPubmed_PMID(Object newPubmed_PMID) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_PUBMED_PMID, newPubmed_PMID);
    }

    public void removePubmed_PMID(Object oldPubmed_PMID) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_PUBMED_PMID, oldPubmed_PMID);
    }


    /* ***************************************************
     * Data Property http://cosmic.sels.insight.org/schema/completefusionexport#Site_Subtype_1
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
     * Data Property http://cosmic.sels.insight.org/schema/completefusionexport#Site_Subtype_3
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


    /* ***************************************************
     * Data Property http://cosmic.sels.insight.org/schema/completefusionexport#Translocation_Name
     */
     
    public Collection<? extends String> getTranslocation_Name() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_TRANSLOCATION_NAME, String.class);
    }

    public boolean hasTranslocation_Name() {
		return !getTranslocation_Name().isEmpty();
    }

    public void addTranslocation_Name(String newTranslocation_Name) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_TRANSLOCATION_NAME, newTranslocation_Name);
    }

    public void removeTranslocation_Name(String oldTranslocation_Name) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_TRANSLOCATION_NAME, oldTranslocation_Name);
    }


}
