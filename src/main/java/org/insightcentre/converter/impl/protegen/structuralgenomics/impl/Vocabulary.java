package org.insightcentre.converter.impl.protegen.structuralgenomics.impl;


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
 * @version generated on Sat Oct 31 12:46:10 GMT 2015 by pc
 */

public class Vocabulary {

	private static final OWLDataFactory factory = OWLManager.createOWLOntologyManager().getOWLDataFactory();

    /* ***************************************************
     * Class http://cosmic.sels.insight.org/schema/structuralgenomicarrangements#Id_Tumour
     */

    /**
     * A constant to give access to the Manchester OWL api representation of the class ID_TUMOUR.<p>
     * 
     */
    public static final OWLClass CLASS_ID_TUMOUR = factory.getOWLClass(IRI.create("http://cosmic.sels.insight.org/schema/structuralgenomicarrangements#Id_Tumour"));

    /* ***************************************************
     * Class http://cosmic.sels.insight.org/schema/structuralgenomicarrangements#Mutation_Id
     */

    /**
     * A constant to give access to the Manchester OWL api representation of the class MUTATION_ID.<p>
     * 
     */
    public static final OWLClass CLASS_MUTATION_ID = factory.getOWLClass(IRI.create("http://cosmic.sels.insight.org/schema/structuralgenomicarrangements#Mutation_Id"));

    /* ***************************************************
     * Class http://cosmic.sels.insight.org/schema/structuralgenomicarrangements#Sample_Id
     */

    /**
     * A constant to give access to the Manchester OWL api representation of the class SAMPLE_ID.<p>
     * 
     */
    public static final OWLClass CLASS_SAMPLE_ID = factory.getOWLClass(IRI.create("http://cosmic.sels.insight.org/schema/structuralgenomicarrangements#Sample_Id"));

    /* ***************************************************
     * Class http://cosmic.sels.insight.org/schema/structuralgenomicarrangements#Sample_Name
     */

    /**
     * A constant to give access to the Manchester OWL api representation of the class SAMPLE_NAME.<p>
     * 
     */
    public static final OWLClass CLASS_SAMPLE_NAME = factory.getOWLClass(IRI.create("http://cosmic.sels.insight.org/schema/structuralgenomicarrangements#Sample_Name"));

    /* ***************************************************
     * Class http://cosmic.sels.insight.org/schema/structuralgenomicarrangements#StructuralGenomicsArrangements
     */

    /**
     * A constant to give access to the Manchester OWL api representation of the class STRUCTURALGENOMICSARRANGEMENTS.<p>
     * 
     */
    public static final OWLClass CLASS_STRUCTURALGENOMICSARRANGEMENTS = factory.getOWLClass(IRI.create("http://cosmic.sels.insight.org/schema/structuralgenomicarrangements#StructuralGenomicsArrangements"));

    /* ***************************************************
     * Object Property http://cosmic.sels.insight.org/schema/structuralgenomicarrangements#Id_Tumour
     */
     
    /**
     * A constant to give access to the Manchester OWL API representation of the object property ID_TUMOUR.<p>
     * 
     */
    public static final OWLObjectProperty OBJECT_PROPERTY_ID_TUMOUR = factory.getOWLObjectProperty(IRI.create("http://cosmic.sels.insight.org/schema/structuralgenomicarrangements#Id_Tumour"));

    /* ***************************************************
     * Object Property http://cosmic.sels.insight.org/schema/structuralgenomicarrangements#Mutation_Id
     */
     
    /**
     * A constant to give access to the Manchester OWL API representation of the object property MUTATION_ID.<p>
     * 
     */
    public static final OWLObjectProperty OBJECT_PROPERTY_MUTATION_ID = factory.getOWLObjectProperty(IRI.create("http://cosmic.sels.insight.org/schema/structuralgenomicarrangements#Mutation_Id"));

    /* ***************************************************
     * Object Property http://cosmic.sels.insight.org/schema/structuralgenomicarrangements#Sample_Id
     */
     
    /**
     * A constant to give access to the Manchester OWL API representation of the object property SAMPLE_ID.<p>
     * 
     */
    public static final OWLObjectProperty OBJECT_PROPERTY_SAMPLE_ID = factory.getOWLObjectProperty(IRI.create("http://cosmic.sels.insight.org/schema/structuralgenomicarrangements#Sample_Id"));

    /* ***************************************************
     * Object Property http://cosmic.sels.insight.org/schema/structuralgenomicarrangements#Sample_Name
     */
     
    /**
     * A constant to give access to the Manchester OWL API representation of the object property SAMPLE_NAME.<p>
     * 
     */
    public static final OWLObjectProperty OBJECT_PROPERTY_SAMPLE_NAME = factory.getOWLObjectProperty(IRI.create("http://cosmic.sels.insight.org/schema/structuralgenomicarrangements#Sample_Name"));

    /* ***************************************************
     * Data Property http://cosmic.sels.insight.org/schema/structuralgenomicarrangements#Histology_Subtype_1
     */
     
    /**
     * A constant to give access to the Manchester OWL API representation of the data property HISTOLOGY_SUBTYPE_1.<p>
     * 
     */
    public static final OWLDataProperty DATA_PROPERTY_HISTOLOGY_SUBTYPE_1 = factory.getOWLDataProperty(IRI.create("http://cosmic.sels.insight.org/schema/structuralgenomicarrangements#Histology_Subtype_1"));

    /* ***************************************************
     * Data Property http://cosmic.sels.insight.org/schema/structuralgenomicarrangements#Histology_Subtype_3
     */
     
    /**
     * A constant to give access to the Manchester OWL API representation of the data property HISTOLOGY_SUBTYPE_3.<p>
     * 
     */
    public static final OWLDataProperty DATA_PROPERTY_HISTOLOGY_SUBTYPE_3 = factory.getOWLDataProperty(IRI.create("http://cosmic.sels.insight.org/schema/structuralgenomicarrangements#Histology_Subtype_3"));

    /* ***************************************************
     * Data Property http://cosmic.sels.insight.org/schema/structuralgenomicarrangements#IdTumourLiteral
     */
     
    /**
     * A constant to give access to the Manchester OWL API representation of the data property IDTUMOURLITERAL.<p>
     * 
     */
    public static final OWLDataProperty DATA_PROPERTY_IDTUMOURLITERAL = factory.getOWLDataProperty(IRI.create("http://cosmic.sels.insight.org/schema/structuralgenomicarrangements#IdTumourLiteral"));

    /* ***************************************************
     * Data Property http://cosmic.sels.insight.org/schema/structuralgenomicarrangements#Id_Study
     */
     
    /**
     * A constant to give access to the Manchester OWL API representation of the data property ID_STUDY.<p>
     * 
     */
    public static final OWLDataProperty DATA_PROPERTY_ID_STUDY = factory.getOWLDataProperty(IRI.create("http://cosmic.sels.insight.org/schema/structuralgenomicarrangements#Id_Study"));

    /* ***************************************************
     * Data Property http://cosmic.sels.insight.org/schema/structuralgenomicarrangements#MutationIdLiteral
     */
     
    /**
     * A constant to give access to the Manchester OWL API representation of the data property MUTATIONIDLITERAL.<p>
     * 
     */
    public static final OWLDataProperty DATA_PROPERTY_MUTATIONIDLITERAL = factory.getOWLDataProperty(IRI.create("http://cosmic.sels.insight.org/schema/structuralgenomicarrangements#MutationIdLiteral"));

    /* ***************************************************
     * Data Property http://cosmic.sels.insight.org/schema/structuralgenomicarrangements#Mutation_Type
     */
     
    /**
     * A constant to give access to the Manchester OWL API representation of the data property MUTATION_TYPE.<p>
     * 
     */
    public static final OWLDataProperty DATA_PROPERTY_MUTATION_TYPE = factory.getOWLDataProperty(IRI.create("http://cosmic.sels.insight.org/schema/structuralgenomicarrangements#Mutation_Type"));

    /* ***************************************************
     * Data Property http://cosmic.sels.insight.org/schema/structuralgenomicarrangements#SampleIdLiteral
     */
     
    /**
     * A constant to give access to the Manchester OWL API representation of the data property SAMPLEIDLITERAL.<p>
     * 
     */
    public static final OWLDataProperty DATA_PROPERTY_SAMPLEIDLITERAL = factory.getOWLDataProperty(IRI.create("http://cosmic.sels.insight.org/schema/structuralgenomicarrangements#SampleIdLiteral"));

    /* ***************************************************
     * Data Property http://cosmic.sels.insight.org/schema/structuralgenomicarrangements#SampleNameLiteral
     */
     
    /**
     * A constant to give access to the Manchester OWL API representation of the data property SAMPLENAMELITERAL.<p>
     * 
     */
    public static final OWLDataProperty DATA_PROPERTY_SAMPLENAMELITERAL = factory.getOWLDataProperty(IRI.create("http://cosmic.sels.insight.org/schema/structuralgenomicarrangements#SampleNameLiteral"));

    /* ***************************************************
     * Data Property http://cosmic.sels.insight.org/schema/structuralgenomicarrangements#Site_Subtype_1
     */
     
    /**
     * A constant to give access to the Manchester OWL API representation of the data property SITE_SUBTYPE_1.<p>
     * 
     */
    public static final OWLDataProperty DATA_PROPERTY_SITE_SUBTYPE_1 = factory.getOWLDataProperty(IRI.create("http://cosmic.sels.insight.org/schema/structuralgenomicarrangements#Site_Subtype_1"));

    /* ***************************************************
     * Data Property http://cosmic.sels.insight.org/schema/structuralgenomicarrangements#Site_Subtype_3
     */
     
    /**
     * A constant to give access to the Manchester OWL API representation of the data property SITE_SUBTYPE_3.<p>
     * 
     */
    public static final OWLDataProperty DATA_PROPERTY_SITE_SUBTYPE_3 = factory.getOWLDataProperty(IRI.create("http://cosmic.sels.insight.org/schema/structuralgenomicarrangements#Site_Subtype_3"));


}
