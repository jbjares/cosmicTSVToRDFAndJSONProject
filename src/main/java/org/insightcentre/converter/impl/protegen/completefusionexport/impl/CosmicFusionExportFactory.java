package org.insightcentre.converter.impl.protegen.completefusionexport.impl;


import java.util.Collection;

import org.insightcentre.converter.impl.protegen.completefusionexport.impl.impl.DefaultComplete_Fusion_Export;
import org.insightcentre.converter.impl.protegen.completefusionexport.impl.impl.DefaultFusion_Id;
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
 * Source Class: CosmicFusionExportFactory<br>
 * @version generated on Fri Nov 06 12:26:57 GMT 2015 by pc
 */
public class CosmicFusionExportFactory implements CodeGenerationFactory {
    private OWLOntology ontology;
    private ProtegeJavaMapping javaMapping = new ProtegeJavaMapping();
    private FactoryHelper delegate;
    private CodeGenerationInference inference;

    public CosmicFusionExportFactory(OWLOntology ontology) {
	    this(ontology, new SimpleInference(ontology));
    }
    
    public CosmicFusionExportFactory(OWLOntology ontology, CodeGenerationInference inference) {
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
     * Class http://cosmic.sels.insight.org/schema/completefusionexport#Complete_Fusion_Export
     */

    {
        javaMapping.add("http://cosmic.sels.insight.org/schema/completefusionexport#Complete_Fusion_Export", Complete_Fusion_Export.class, DefaultComplete_Fusion_Export.class);
    }

    /**
     * Creates an instance of type Complete_Fusion_Export.  Modifies the underlying ontology.
     */
    public Complete_Fusion_Export createComplete_Fusion_Export(String name) {
		return delegate.createWrappedIndividual(name, Vocabulary.CLASS_COMPLETE_FUSION_EXPORT, DefaultComplete_Fusion_Export.class);
    }

    /**
     * Gets an instance of type Complete_Fusion_Export with the given name.  Does not modify the underlying ontology.
     * @param name the name of the OWL named individual to be retrieved.
     */
    public Complete_Fusion_Export getComplete_Fusion_Export(String name) {
		return delegate.getWrappedIndividual(name, Vocabulary.CLASS_COMPLETE_FUSION_EXPORT, DefaultComplete_Fusion_Export.class);
    }

    /**
     * Gets all instances of Complete_Fusion_Export from the ontology.
     */
    public Collection<? extends Complete_Fusion_Export> getAllComplete_Fusion_ExportInstances() {
		return delegate.getWrappedIndividuals(Vocabulary.CLASS_COMPLETE_FUSION_EXPORT, DefaultComplete_Fusion_Export.class);
    }


    /* ***************************************************
     * Class http://cosmic.sels.insight.org/schema/completefusionexport#Fusion_Id
     */

    {
        javaMapping.add("http://cosmic.sels.insight.org/schema/completefusionexport#Fusion_Id", Fusion_Id.class, DefaultFusion_Id.class);
    }

    /**
     * Creates an instance of type Fusion_Id.  Modifies the underlying ontology.
     */
    public Fusion_Id createFusion_Id(String name) {
		return delegate.createWrappedIndividual(name, Vocabulary.CLASS_FUSION_ID, DefaultFusion_Id.class);
    }

    /**
     * Gets an instance of type Fusion_Id with the given name.  Does not modify the underlying ontology.
     * @param name the name of the OWL named individual to be retrieved.
     */
    public Fusion_Id getFusion_Id(String name) {
		return delegate.getWrappedIndividual(name, Vocabulary.CLASS_FUSION_ID, DefaultFusion_Id.class);
    }

    /**
     * Gets all instances of Fusion_Id from the ontology.
     */
    public Collection<? extends Fusion_Id> getAllFusion_IdInstances() {
		return delegate.getWrappedIndividuals(Vocabulary.CLASS_FUSION_ID, DefaultFusion_Id.class);
    }


}
