package org.insightcentre.converter.impl.protegen.structuralgenomics.impl;


import java.util.Collection;

import org.insightcentre.converter.impl.protegen.structuralgenomics.impl.impl.DefaultId_Tumour;
import org.insightcentre.converter.impl.protegen.structuralgenomics.impl.impl.DefaultMutation_Id;
import org.insightcentre.converter.impl.protegen.structuralgenomics.impl.impl.DefaultSample_Id;
import org.insightcentre.converter.impl.protegen.structuralgenomics.impl.impl.DefaultSample_Name;
import org.insightcentre.converter.impl.protegen.structuralgenomics.impl.impl.DefaultStructuralGenomicsArrangements;
import org.protege.owl.codegeneration.CodeGenerationFactory;
import org.protege.owl.codegeneration.WrappedIndividual;
import org.protege.owl.codegeneration.impl.FactoryHelper;
import org.protege.owl.codegeneration.impl.ProtegeJavaMapping;
import org.protege.owl.codegeneration.inference.CodeGenerationInference;
import org.protege.owl.codegeneration.inference.SimpleInference;
import org.semanticweb.owlapi.model.OWLClass;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyStorageException;

/**
 * A class that serves as the entry point to the generated code providing access
 * to existing individuals in the ontology and the ability to create new individuals in the ontology.<p>
 * 
 * Generated by Protege (http://protege.stanford.edu).<br>
 * Source Class: StructuralGenomicsArrangementsFactory<br>
 * @version generated on Sat Oct 31 12:46:10 GMT 2015 by pc
 */
public class StructuralGenomicsArrangementsFactory implements CodeGenerationFactory {
    private OWLOntology ontology;
    private ProtegeJavaMapping javaMapping = new ProtegeJavaMapping();
    private FactoryHelper delegate;
    private CodeGenerationInference inference;

    public StructuralGenomicsArrangementsFactory(OWLOntology ontology) {
	    this(ontology, new SimpleInference(ontology));
    }
    
    public StructuralGenomicsArrangementsFactory(OWLOntology ontology, CodeGenerationInference inference) {
        this.ontology = ontology;
        this.inference = inference;
        javaMapping.initialize(ontology, inference);
        delegate = new FactoryHelper(ontology, inference);
    }

    public OWLOntology getOwlOntology() {
        return ontology;
    }
    
    public void saveOwlOntology() throws OWLOntologyStorageException {
        ontology.getOWLOntologyManager().saveOntology(ontology);
    }
    
    public void flushOwlReasoner() {
        delegate.flushOwlReasoner();
    }
    
    public boolean canAs(WrappedIndividual resource, Class<? extends WrappedIndividual> javaInterface) {
    	return javaMapping.canAs(resource, javaInterface);
    }
    
    public  <X extends WrappedIndividual> X as(WrappedIndividual resource, Class<? extends X> javaInterface) {
    	return javaMapping.as(resource, javaInterface);
    }
    
    public Class<?> getJavaInterfaceFromOwlClass(OWLClass cls) {
        return javaMapping.getJavaInterfaceFromOwlClass(cls);
    }
    
    public OWLClass getOwlClassFromJavaInterface(Class<?> javaInterface) {
	    return javaMapping.getOwlClassFromJavaInterface(javaInterface);
    }
    
    public CodeGenerationInference getInference() {
        return inference;
    }

    /* ***************************************************
     * Class http://cosmic.sels.insight.org/schema/structuralgenomicarrangements#Id_Tumour
     */

    {
        javaMapping.add("http://cosmic.sels.insight.org/schema/structuralgenomicarrangements#Id_Tumour", Id_Tumour.class, DefaultId_Tumour.class);
    }

    /**
     * Creates an instance of type Id_Tumour.  Modifies the underlying ontology.
     */
    public Id_Tumour createId_Tumour(String name) {
		return delegate.createWrappedIndividual(name, Vocabulary.CLASS_ID_TUMOUR, DefaultId_Tumour.class);
    }

    /**
     * Gets an instance of type Id_Tumour with the given name.  Does not modify the underlying ontology.
     * @param name the name of the OWL named individual to be retrieved.
     */
    public Id_Tumour getId_Tumour(String name) {
		return delegate.getWrappedIndividual(name, Vocabulary.CLASS_ID_TUMOUR, DefaultId_Tumour.class);
    }

    /**
     * Gets all instances of Id_Tumour from the ontology.
     */
    public Collection<? extends Id_Tumour> getAllId_TumourInstances() {
		return delegate.getWrappedIndividuals(Vocabulary.CLASS_ID_TUMOUR, DefaultId_Tumour.class);
    }


    /* ***************************************************
     * Class http://cosmic.sels.insight.org/schema/structuralgenomicarrangements#Mutation_Id
     */

    {
        javaMapping.add("http://cosmic.sels.insight.org/schema/structuralgenomicarrangements#Mutation_Id", Mutation_Id.class, DefaultMutation_Id.class);
    }

    /**
     * Creates an instance of type Mutation_Id.  Modifies the underlying ontology.
     */
    public Mutation_Id createMutation_Id(String name) {
		return delegate.createWrappedIndividual(name, Vocabulary.CLASS_MUTATION_ID, DefaultMutation_Id.class);
    }

    /**
     * Gets an instance of type Mutation_Id with the given name.  Does not modify the underlying ontology.
     * @param name the name of the OWL named individual to be retrieved.
     */
    public Mutation_Id getMutation_Id(String name) {
		return delegate.getWrappedIndividual(name, Vocabulary.CLASS_MUTATION_ID, DefaultMutation_Id.class);
    }

    /**
     * Gets all instances of Mutation_Id from the ontology.
     */
    public Collection<? extends Mutation_Id> getAllMutation_IdInstances() {
		return delegate.getWrappedIndividuals(Vocabulary.CLASS_MUTATION_ID, DefaultMutation_Id.class);
    }


    /* ***************************************************
     * Class http://cosmic.sels.insight.org/schema/structuralgenomicarrangements#Sample_Id
     */

    {
        javaMapping.add("http://cosmic.sels.insight.org/schema/structuralgenomicarrangements#Sample_Id", Sample_Id.class, DefaultSample_Id.class);
    }

    /**
     * Creates an instance of type Sample_Id.  Modifies the underlying ontology.
     */
    public Sample_Id createSample_Id(String name) {
		return delegate.createWrappedIndividual(name, Vocabulary.CLASS_SAMPLE_ID, DefaultSample_Id.class);
    }

    /**
     * Gets an instance of type Sample_Id with the given name.  Does not modify the underlying ontology.
     * @param name the name of the OWL named individual to be retrieved.
     */
    public Sample_Id getSample_Id(String name) {
		return delegate.getWrappedIndividual(name, Vocabulary.CLASS_SAMPLE_ID, DefaultSample_Id.class);
    }

    /**
     * Gets all instances of Sample_Id from the ontology.
     */
    public Collection<? extends Sample_Id> getAllSample_IdInstances() {
		return delegate.getWrappedIndividuals(Vocabulary.CLASS_SAMPLE_ID, DefaultSample_Id.class);
    }


    /* ***************************************************
     * Class http://cosmic.sels.insight.org/schema/structuralgenomicarrangements#Sample_Name
     */

    {
        javaMapping.add("http://cosmic.sels.insight.org/schema/structuralgenomicarrangements#Sample_Name", Sample_Name.class, DefaultSample_Name.class);
    }

    /**
     * Creates an instance of type Sample_Name.  Modifies the underlying ontology.
     */
    public Sample_Name createSample_Name(String name) {
		return delegate.createWrappedIndividual(name, Vocabulary.CLASS_SAMPLE_NAME, DefaultSample_Name.class);
    }

    /**
     * Gets an instance of type Sample_Name with the given name.  Does not modify the underlying ontology.
     * @param name the name of the OWL named individual to be retrieved.
     */
    public Sample_Name getSample_Name(String name) {
		return delegate.getWrappedIndividual(name, Vocabulary.CLASS_SAMPLE_NAME, DefaultSample_Name.class);
    }

    /**
     * Gets all instances of Sample_Name from the ontology.
     */
    public Collection<? extends Sample_Name> getAllSample_NameInstances() {
		return delegate.getWrappedIndividuals(Vocabulary.CLASS_SAMPLE_NAME, DefaultSample_Name.class);
    }


    /* ***************************************************
     * Class http://cosmic.sels.insight.org/schema/structuralgenomicarrangements#StructuralGenomicsArrangements
     */

    {
        javaMapping.add("http://cosmic.sels.insight.org/schema/structuralgenomicarrangements#StructuralGenomicsArrangements", StructuralGenomicsArrangements.class, DefaultStructuralGenomicsArrangements.class);
    }

    /**
     * Creates an instance of type StructuralGenomicsArrangements.  Modifies the underlying ontology.
     */
    public StructuralGenomicsArrangements createStructuralGenomicsArrangements(String name) {
		return delegate.createWrappedIndividual(name, Vocabulary.CLASS_STRUCTURALGENOMICSARRANGEMENTS, DefaultStructuralGenomicsArrangements.class);
    }

    /**
     * Gets an instance of type StructuralGenomicsArrangements with the given name.  Does not modify the underlying ontology.
     * @param name the name of the OWL named individual to be retrieved.
     */
    public StructuralGenomicsArrangements getStructuralGenomicsArrangements(String name) {
		return delegate.getWrappedIndividual(name, Vocabulary.CLASS_STRUCTURALGENOMICSARRANGEMENTS, DefaultStructuralGenomicsArrangements.class);
    }

    /**
     * Gets all instances of StructuralGenomicsArrangements from the ontology.
     */
    public Collection<? extends StructuralGenomicsArrangements> getAllStructuralGenomicsArrangementsInstances() {
		return delegate.getWrappedIndividuals(Vocabulary.CLASS_STRUCTURALGENOMICSARRANGEMENTS, DefaultStructuralGenomicsArrangements.class);
    }


}