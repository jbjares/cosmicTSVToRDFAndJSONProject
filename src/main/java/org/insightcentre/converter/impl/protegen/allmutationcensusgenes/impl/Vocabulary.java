package org.insightcentre.converter.impl.protegen.allmutationcensusgenes.impl;


import org.semanticweb.owlapi.apibinding.OWLManager;
import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLClass;
import org.semanticweb.owlapi.model.OWLDataFactory;
import org.semanticweb.owlapi.model.OWLDataProperty;
import org.semanticweb.owlapi.model.OWLObjectProperty;

/**
 * Vocabulary class to provide access to the Manchester OWL API representatives for 
 * various entities in the ontology used to generate this code.<p> 
 * 
 * Generated by Protege (http://protege.stanford.edu).<br>
 * Source Class: ${javaClass}
 *
 * @version generated on Sat Oct 31 09:17:42 GMT 2015 by pc
 */

public class Vocabulary {

	private static final OWLDataFactory factory = OWLManager.createOWLOntologyManager().getOWLDataFactory();

    /* ***************************************************
     * Class http://cosmic.sels.insight.org/schema/allmutationgenes#All_Mutation_Census_Genes
     */

    /**
     * A constant to give access to the Manchester OWL api representation of the class ALL_MUTATION_CENSUS_GENES.<p>
     * 
     */
    public static final OWLClass CLASS_ALL_MUTATION_CENSUS_GENES = factory.getOWLClass(IRI.create("http://cosmic.sels.insight.org/schema/allmutationgenes#All_Mutation_Census_Genes"));

    /* ***************************************************
     * Class http://cosmic.sels.insight.org/schema/allmutationgenes#HGNC_Id
     */

    /**
     * A constant to give access to the Manchester OWL api representation of the class HGNC_ID.<p>
     * 
     */
    public static final OWLClass CLASS_HGNC_ID = factory.getOWLClass(IRI.create("http://cosmic.sels.insight.org/schema/allmutationgenes#HGNC_Id"));

    /* ***************************************************
     * Class http://cosmic.sels.insight.org/schema/allmutationgenes#Mutation_Id
     */

    /**
     * A constant to give access to the Manchester OWL api representation of the class MUTATION_ID.<p>
     * 
     */
    public static final OWLClass CLASS_MUTATION_ID = factory.getOWLClass(IRI.create("http://cosmic.sels.insight.org/schema/allmutationgenes#Mutation_Id"));

    /* ***************************************************
     * Object Property http://cosmic.sels.insight.org/schema/allmutationgenes#HGNC_Id
     */
     
    /**
     * A constant to give access to the Manchester OWL API representation of the object property HGNC_ID.<p>
     * 
     */
    public static final OWLObjectProperty OBJECT_PROPERTY_HGNC_ID = factory.getOWLObjectProperty(IRI.create("http://cosmic.sels.insight.org/schema/allmutationgenes#HGNC_Id"));

    /* ***************************************************
     * Object Property http://cosmic.sels.insight.org/schema/allmutationgenes#Mutation_Id
     */
     
    /**
     * A constant to give access to the Manchester OWL API representation of the object property MUTATION_ID.<p>
     * 
     */
    public static final OWLObjectProperty OBJECT_PROPERTY_MUTATION_ID = factory.getOWLObjectProperty(IRI.create("http://cosmic.sels.insight.org/schema/allmutationgenes#Mutation_Id"));

    /* ***************************************************
     * Data Property http://cosmic.sels.insight.org/schema/allmutationgenes#Gene_CDS_Length
     */
     
    /**
     * A constant to give access to the Manchester OWL API representation of the data property GENE_CDS_LENGTH.<p>
     * 
     */
    public static final OWLDataProperty DATA_PROPERTY_GENE_CDS_LENGTH = factory.getOWLDataProperty(IRI.create("http://cosmic.sels.insight.org/schema/allmutationgenes#Gene_CDS_Length"));

    /* ***************************************************
     * Data Property http://cosmic.sels.insight.org/schema/allmutationgenes#HGNCIdLiteral
     */
     
    /**
     * A constant to give access to the Manchester OWL API representation of the data property HGNCIDLITERAL.<p>
     * 
     */
    public static final OWLDataProperty DATA_PROPERTY_HGNCIDLITERAL = factory.getOWLDataProperty(IRI.create("http://cosmic.sels.insight.org/schema/allmutationgenes#HGNCIdLiteral"));

    /* ***************************************************
     * Data Property http://cosmic.sels.insight.org/schema/allmutationgenes#Histology_Subtype_1
     */
     
    /**
     * A constant to give access to the Manchester OWL API representation of the data property HISTOLOGY_SUBTYPE_1.<p>
     * 
     */
    public static final OWLDataProperty DATA_PROPERTY_HISTOLOGY_SUBTYPE_1 = factory.getOWLDataProperty(IRI.create("http://cosmic.sels.insight.org/schema/allmutationgenes#Histology_Subtype_1"));

    /* ***************************************************
     * Data Property http://cosmic.sels.insight.org/schema/allmutationgenes#Histology_Subtype_3
     */
     
    /**
     * A constant to give access to the Manchester OWL API representation of the data property HISTOLOGY_SUBTYPE_3.<p>
     * 
     */
    public static final OWLDataProperty DATA_PROPERTY_HISTOLOGY_SUBTYPE_3 = factory.getOWLDataProperty(IRI.create("http://cosmic.sels.insight.org/schema/allmutationgenes#Histology_Subtype_3"));

    /* ***************************************************
     * Data Property http://cosmic.sels.insight.org/schema/allmutationgenes#MutatioIdLiteral
     */
     
    /**
     * A constant to give access to the Manchester OWL API representation of the data property MUTATIOIDLITERAL.<p>
     * 
     */
    public static final OWLDataProperty DATA_PROPERTY_MUTATIOIDLITERAL = factory.getOWLDataProperty(IRI.create("http://cosmic.sels.insight.org/schema/allmutationgenes#MutatioIdLiteral"));

    /* ***************************************************
     * Data Property http://cosmic.sels.insight.org/schema/allmutationgenes#Mutation_CDS
     */
     
    /**
     * A constant to give access to the Manchester OWL API representation of the data property MUTATION_CDS.<p>
     * 
     */
    public static final OWLDataProperty DATA_PROPERTY_MUTATION_CDS = factory.getOWLDataProperty(IRI.create("http://cosmic.sels.insight.org/schema/allmutationgenes#Mutation_CDS"));

    /* ***************************************************
     * Data Property http://cosmic.sels.insight.org/schema/allmutationgenes#Mutation_Description
     */
     
    /**
     * A constant to give access to the Manchester OWL API representation of the data property MUTATION_DESCRIPTION.<p>
     * 
     */
    public static final OWLDataProperty DATA_PROPERTY_MUTATION_DESCRIPTION = factory.getOWLDataProperty(IRI.create("http://cosmic.sels.insight.org/schema/allmutationgenes#Mutation_Description"));

    /* ***************************************************
     * Data Property http://cosmic.sels.insight.org/schema/allmutationgenes#Site_Subtype_1
     */
     
    /**
     * A constant to give access to the Manchester OWL API representation of the data property SITE_SUBTYPE_1.<p>
     * 
     */
    public static final OWLDataProperty DATA_PROPERTY_SITE_SUBTYPE_1 = factory.getOWLDataProperty(IRI.create("http://cosmic.sels.insight.org/schema/allmutationgenes#Site_Subtype_1"));

    /* ***************************************************
     * Data Property http://cosmic.sels.insight.org/schema/allmutationgenes#Site_Subtype_3
     */
     
    /**
     * A constant to give access to the Manchester OWL API representation of the data property SITE_SUBTYPE_3.<p>
     * 
     */
    public static final OWLDataProperty DATA_PROPERTY_SITE_SUBTYPE_3 = factory.getOWLDataProperty(IRI.create("http://cosmic.sels.insight.org/schema/allmutationgenes#Site_Subtype_3"));


}
