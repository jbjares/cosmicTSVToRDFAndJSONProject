package org.insightcentre.converter.impl;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.insightcentre.converter.impl.protegen.structuralgenomics.impl.Sample_Name;
import org.insightcentre.converter.impl.protegen.structuralgenomics.impl.StructuralGenomicsArrangements;
import org.insightcentre.converter.impl.protegen.structuralgenomics.impl.StructuralGenomicsArrangementsFactory;
import org.semanticweb.owlapi.apibinding.OWLManager;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyManager;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import au.com.bytecode.opencsv.CSVReader;

public class StructuralGenomicsArrangementsConverterImpl implements IConverter {

	Logger logger = Logger.getLogger(StructuralGenomicsArrangementsConverterImpl.class);
	private OWLOntologyManager owlOntologyManager;
	private OWLOntology onto;
	private StructuralGenomicsArrangementsFactory factory;
	private PropertiesUtil propertiesUtil;
	private String propertiesFileLocations;

	public StructuralGenomicsArrangementsConverterImpl(String propertiesFileLocations) throws Exception {
		this.propertiesFileLocations = propertiesFileLocations;
		propertiesUtil = new PropertiesUtil();
		owlOntologyManager = OWLManager.createOWLOntologyManager();
		onto = owlOntologyManager.loadOntologyFromOntologyDocument(new File(
				propertiesUtil.getPropertyValue(propertiesFileLocations, COSMICSTRUCTEXPORT_OWL_FILE_LOCATION)));
		factory = new StructuralGenomicsArrangementsFactory(onto);
	}

	public void execute() throws Exception {
		int rowCount = 0;
		try{
			
			String fileLoction = propertiesUtil.getPropertyValue(propertiesFileLocations, COSMICSTRUCTEXPORT_TSV_FILE_LOCATION);
			File file = new File(fileLoction);
			logger.info("[0123456] Processing File " + file.getName() + " ...... ");

			CSVReader reader = new CSVReader(new FileReader(file), '\t');
			JsonArray jsonArr = new JsonArray();
			String[] record;
			while ((record = reader.readNext()) != null) {


				if (rowCount != 0) {
					StructuralGenomicsArrangements sga = factory.createStructuralGenomicsArrangements("SGA"+rowCount);
					JsonObject jsonObject = new JsonObject(); 
					
					
					String histology_Subtype_1Value = record[6]==null?"":record[6];
					sga.addHistology_Subtype_1(histology_Subtype_1Value);
					jsonObject.addProperty(HISTOLOGY_SUBTYPE_1,histology_Subtype_1Value);
					
					String histology_Subtype_3Value = record[8]==null?"":record[8];
					sga.addHistology_Subtype_3(histology_Subtype_3Value);
					jsonObject.addProperty(HISTOLOGY_SUBTYPE_3,histology_Subtype_3Value);
					
					String idStudyValue = record[14]==null?"":record[14];
					sga.addId_Study(idStudyValue);
					jsonObject.addProperty("Id_Study",idStudyValue);
					
					
					//Sample name, Sample id, Id tumour is resumed in sampleName
					String sampleName = record[0]==null?"":record[0];
					sga.addSample_Name(getSampleName(sampleName));
					jsonObject.addProperty("Sample_Name",sampleName);
					
					String mutationIdValue = record[9]==null?"":record[9];
					sga.addMutation_Id(getMutationId(mutationIdValue));
					jsonObject.addProperty("Mutation_Id",mutationIdValue);
					
					String mutationTypeValue = record[10]==null?"":record[10];
					sga.addMutation_Type(mutationTypeValue);
					jsonObject.addProperty("Mutation_Type",mutationTypeValue);
					
					
					String site_Subtype_1Value = record[3]==null?"":record[3];
					sga.addSite_Subtype_1(site_Subtype_1Value);
					jsonObject.addProperty(SITE_SUBTYPE_1_VALUE,site_Subtype_1Value);
					
					String site_Subtype_3Value = record[4]==null?"":record[4];
					sga.addSite_Subtype_3(site_Subtype_3Value);
					jsonObject.addProperty(SITE_SUBTYPE_3_VALUE,site_Subtype_3Value);

					
					
					jsonArr.add(jsonObject);
					
					//TODO Uncomment before the .jar generation 
//					owlOntologyManager.saveOntology(sga.getOwlOntology(), 
//							new FileOutputStream(new File(propertiesUtil.getPropertyValue(propertiesFileLocations, COSMICSTRUCTEXPORT_RDF_FILE_LOCATION))));

					
					//TODO Use the code below to create samples.
//					if(rowCount==100){
						File jsonSampleFile = new File(propertiesUtil.getPropertyValue(propertiesFileLocations, COSMICSTRUCTEXPORT_JSON_FILE_LOCATION));
						FileUtils.writeStringToFile(jsonSampleFile, jsonArr.toString());
						owlOntologyManager.saveOntology(sga.getOwlOntology(), 
						new FileOutputStream(new File(propertiesUtil.getPropertyValue(propertiesFileLocations, COSMICSTRUCTEXPORT_RDF_FILE_LOCATION))));
//						break;
//					}
				}

				rowCount++;
			}

		}catch(Exception e){
			logger.error("[0123456] Error! "+e.getMessage());
			throw new RuntimeException(e.getMessage(),e);
		}finally {
			logger.info("[0123456] Axioms size: "+onto.getAxioms().size());
			logger.info("[0123456] Records: "+rowCount);
			logger.info("[0123456] Process of StructuralGenomicsArrangementsConverterImpl finished!");
		}
			
	}

	private org.insightcentre.converter.impl.protegen.structuralgenomics.impl.Mutation_Id getMutationId(
			String mutationIdValue) {
		return factory.createMutation_Id(mutationIdValue);
	}

	private Sample_Name getSampleName(String sampleName) {
		return factory.createSample_Name(sampleName);
	}

}