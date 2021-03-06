package org.insightcentre.converter.impl.protegen.methylation.impl;


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
 * @version generated on Sat Oct 31 12:49:53 GMT 2015 by pc
 */

public class Vocabulary {

	private static final OWLDataFactory factory = OWLManager.createOWLOntologyManager().getOWLDataFactory();

    /* ***************************************************
     * Class http://cosmic.sels.insight.org/schema/Methylation#Chromosome
     */

    /**
     * A constant to give access to the Manchester OWL api representation of the class CHROMOSOME.<p>
     * 
     */
    public static final OWLClass CLASS_CHROMOSOME = factory.getOWLClass(IRI.create("http://cosmic.sels.insight.org/schema/Methylation#Chromosome"));

    /* ***************************************************
     * Class http://cosmic.sels.insight.org/schema/Methylation#Gene_Name
     */

    /**
     * A constant to give access to the Manchester OWL api representation of the class GENE_NAME.<p>
     * 
     */
    public static final OWLClass CLASS_GENE_NAME = factory.getOWLClass(IRI.create("http://cosmic.sels.insight.org/schema/Methylation#Gene_Name"));

    /* ***************************************************
     * Class http://cosmic.sels.insight.org/schema/Methylation#Methylation
     */

    /**
     * A constant to give access to the Manchester OWL api representation of the class METHYLATION.<p>
     * 
     */
    public static final OWLClass CLASS_METHYLATION = factory.getOWLClass(IRI.create("http://cosmic.sels.insight.org/schema/Methylation#Methylation"));

    /* ***************************************************
     * Object Property http://cosmic.sels.insight.org/schema/Methylation#Chromosome
     */
     
    /**
     * A constant to give access to the Manchester OWL API representation of the object property CHROMOSOME.<p>
     * 
     */
    public static final OWLObjectProperty OBJECT_PROPERTY_CHROMOSOME = factory.getOWLObjectProperty(IRI.create("http://cosmic.sels.insight.org/schema/Methylation#Chromosome"));

    /* ***************************************************
     * Object Property http://cosmic.sels.insight.org/schema/Methylation#Gene_Name
     */
     
    /**
     * A constant to give access to the Manchester OWL API representation of the object property GENE_NAME.<p>
     * 
     */
    public static final OWLObjectProperty OBJECT_PROPERTY_GENE_NAME = factory.getOWLObjectProperty(IRI.create("http://cosmic.sels.insight.org/schema/Methylation#Gene_Name"));

    /* ***************************************************
     * Data Property http://cosmic.sels.insight.org/schema/Methylation#ChromosomeNameLiteral
     */
     
    /**
     * A constant to give access to the Manchester OWL API representation of the data property CHROMOSOMENAMELITERAL.<p>
     * 
     */
    public static final OWLDataProperty DATA_PROPERTY_CHROMOSOMENAMELITERAL = factory.getOWLDataProperty(IRI.create("http://cosmic.sels.insight.org/schema/Methylation#ChromosomeNameLiteral"));

    /* ***************************************************
     * Data Property http://cosmic.sels.insight.org/schema/Methylation#Fragment_Id
     */
     
    /**
     * A constant to give access to the Manchester OWL API representation of the data property FRAGMENT_ID.<p>
     * 
     */
    public static final OWLDataProperty DATA_PROPERTY_FRAGMENT_ID = factory.getOWLDataProperty(IRI.create("http://cosmic.sels.insight.org/schema/Methylation#Fragment_Id"));

    /* ***************************************************
     * Data Property http://cosmic.sels.insight.org/schema/Methylation#GeneNameLiteral
     */
     
    /**
     * A constant to give access to the Manchester OWL API representation of the data property GENENAMELITERAL.<p>
     * 
     */
    public static final OWLDataProperty DATA_PROPERTY_GENENAMELITERAL = factory.getOWLDataProperty(IRI.create("http://cosmic.sels.insight.org/schema/Methylation#GeneNameLiteral"));

    /* ***************************************************
     * Data Property http://cosmic.sels.insight.org/schema/Methylation#Histology_Subtype_1
     */
     
    /**
     * A constant to give access to the Manchester OWL API representation of the data property HISTOLOGY_SUBTYPE_1.<p>
     * 
     */
    public static final OWLDataProperty DATA_PROPERTY_HISTOLOGY_SUBTYPE_1 = factory.getOWLDataProperty(IRI.create("http://cosmic.sels.insight.org/schema/Methylation#Histology_Subtype_1"));

    /* ***************************************************
     * Data Property http://cosmic.sels.insight.org/schema/Methylation#Histology_Subtype_3
     */
     
    /**
     * A constant to give access to the Manchester OWL API representation of the data property HISTOLOGY_SUBTYPE_3.<p>
     * 
     */
    public static final OWLDataProperty DATA_PROPERTY_HISTOLOGY_SUBTYPE_3 = factory.getOWLDataProperty(IRI.create("http://cosmic.sels.insight.org/schema/Methylation#Histology_Subtype_3"));

    /* ***************************************************
     * Data Property http://cosmic.sels.insight.org/schema/Methylation#Id_Study
     */
     
    /**
     * A constant to give access to the Manchester OWL API representation of the data property ID_STUDY.<p>
     * 
     */
    public static final OWLDataProperty DATA_PROPERTY_ID_STUDY = factory.getOWLDataProperty(IRI.create("http://cosmic.sels.insight.org/schema/Methylation#Id_Study"));

    /* ***************************************************
     * Data Property http://cosmic.sels.insight.org/schema/Methylation#Position
     */
     
    /**
     * A constant to give access to the Manchester OWL API representation of the data property POSITION.<p>
     * 
     */
    public static final OWLDataProperty DATA_PROPERTY_POSITION = factory.getOWLDataProperty(IRI.create("http://cosmic.sels.insight.org/schema/Methylation#Position"));

    /* ***************************************************
     * Data Property http://cosmic.sels.insight.org/schema/Methylation#Primary_Histology
     */
     
    /**
     * A constant to give access to the Manchester OWL API representation of the data property PRIMARY_HISTOLOGY.<p>
     * 
     */
    public static final OWLDataProperty DATA_PROPERTY_PRIMARY_HISTOLOGY = factory.getOWLDataProperty(IRI.create("http://cosmic.sels.insight.org/schema/Methylation#Primary_Histology"));

    /* ***************************************************
     * Data Property http://cosmic.sels.insight.org/schema/Methylation#Site_Subtype_1
     */
     
    /**
     * A constant to give access to the Manchester OWL API representation of the data property SITE_SUBTYPE_1.<p>
     * 
     */
    public static final OWLDataProperty DATA_PROPERTY_SITE_SUBTYPE_1 = factory.getOWLDataProperty(IRI.create("http://cosmic.sels.insight.org/schema/Methylation#Site_Subtype_1"));

    /* ***************************************************
     * Data Property http://cosmic.sels.insight.org/schema/Methylation#Site_Subtype_3
     */
     
    /**
     * A constant to give access to the Manchester OWL API representation of the data property SITE_SUBTYPE_3.<p>
     * 
     */
    public static final OWLDataProperty DATA_PROPERTY_SITE_SUBTYPE_3 = factory.getOWLDataProperty(IRI.create("http://cosmic.sels.insight.org/schema/Methylation#Site_Subtype_3"));


}
