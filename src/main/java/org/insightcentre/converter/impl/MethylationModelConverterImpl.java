package org.insightcentre.converter.impl;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.insightcentre.converter.impl.protegen.methylation.impl.Chromosome;
import org.insightcentre.converter.impl.protegen.methylation.impl.CosmicCompleteDifferentialMethylationFactory;
import org.insightcentre.converter.impl.protegen.methylation.impl.Gene_Name;
import org.insightcentre.converter.impl.protegen.methylation.impl.Methylation;
import org.semanticweb.owlapi.apibinding.OWLManager;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyManager;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import au.com.bytecode.opencsv.CSVReader;

public class MethylationModelConverterImpl implements IConverter {


	Logger logger = Logger.getLogger(MethylationModelConverterImpl.class);
	
	private OWLOntologyManager owlOntologyManager;
	private OWLOntology onto;
	private CosmicCompleteDifferentialMethylationFactory factory;
	private PropertiesUtil propertiesUtil;
	private String propertiesFileLocations;

	public MethylationModelConverterImpl(String propertiesFileLocations) throws Exception {
		this.propertiesFileLocations = propertiesFileLocations;
		propertiesUtil = new PropertiesUtil();
		owlOntologyManager = OWLManager.createOWLOntologyManager();
		onto = owlOntologyManager.loadOntologyFromOntologyDocument(new File(
				propertiesUtil.getPropertyValue(propertiesFileLocations, COSMICCOMPLETEDIFFERENTIALMETHYLATION_OWL_FILE_LOCATION)));
		factory = new CosmicCompleteDifferentialMethylationFactory(onto);
	}

	public void execute() throws Exception {
		
		int rowCount = 0;
		try{
			
			String fileLoction = propertiesUtil.getPropertyValue(propertiesFileLocations, COSMICCOMPLETEDIFFERENTIALMETHYLATION_TSV_FILE_LOCATION);
			File file = new File(fileLoction);
			logger.info("[012345] Processing File " + file.getName() + " ...... ");
			CSVReader reader = new CSVReader(new FileReader(file), '\t');
			JsonArray jsonArr = new JsonArray();
			String[] record;
			while ((record = reader.readNext()) != null) {


				if (rowCount != 0) {
					Methylation methylation = factory.createMethylation("Methylation"+rowCount);
					
					JsonObject jsonObject = new JsonObject(); 
					methylation.addChromosome(getChromosome(record[14]));
					jsonObject.addProperty("Chromosome",record[14]);
					
					String fragmentIdValue = record[12];
					methylation.addFragment_Id(fragmentIdValue);
					jsonObject.addProperty("Fragment_Id",fragmentIdValue);
					
					methylation.addGene_Name(getGeneName(record[16]==null?"":record[16]));
					jsonObject.addProperty("Gene_Name",record[16]);
					
					String histology_Subtype_1Value = record[9];
					methylation.addHistology_Subtype_1(histology_Subtype_1Value);
					jsonObject.addProperty(HISTOLOGY_SUBTYPE_1,histology_Subtype_1Value);
					
					String histology_Subtype_3Value = record[11];
					methylation.addHistology_Subtype_3(histology_Subtype_3Value);
					jsonObject.addProperty(HISTOLOGY_SUBTYPE_3,histology_Subtype_3Value);
					
					String id_StudyValue = record[0];
					methylation.addId_Study(id_StudyValue);
					jsonObject.addProperty("Id_Study",id_StudyValue);
					
					String positionValue = record[15];
					methylation.addPosition(positionValue);
					jsonObject.addProperty("Position",positionValue);
					
					String primaryHistologyValue = record[8];
					methylation.addPrimary_Histology(primaryHistologyValue);
					jsonObject.addProperty("Primary_Histology",primaryHistologyValue);
					
					
					String site_Subtype_1Value = record[5];
					methylation.addSite_Subtype_1(site_Subtype_1Value);
					jsonObject.addProperty(SITE_SUBTYPE_1_VALUE,site_Subtype_1Value);
					
					String site_Subtype_3Value = record[7];
					methylation.addSite_Subtype_3(site_Subtype_3Value);
					jsonObject.addProperty(SITE_SUBTYPE_3_VALUE,site_Subtype_3Value);
					jsonArr.add(jsonObject);

					
					//TODO Uncomment before the .jar generation 
//					owlOntologyManager.saveOntology(methylation.getOwlOntology(), 
//							new FileOutputStream(new File(propertiesUtil.getPropertyValue(propertiesFileLocations, COSMICCOMPLETEDIFFERENTIALMETHYLATION_RDF_FILE_LOCATION))));

					
					//TODO Use the code below to create samples.
//					if(rowCount==100){
						File jsonSampleFile = new File(propertiesUtil.getPropertyValue(propertiesFileLocations, COSMICCOMPLETEDIFFERENTIALMETHYLATION_JSON_FILE_LOCATION));
						FileUtils.writeStringToFile(jsonSampleFile, jsonArr.toString());
						owlOntologyManager.saveOntology(methylation.getOwlOntology(), 
						new FileOutputStream(new File(propertiesUtil.getPropertyValue(propertiesFileLocations, COSMICCOMPLETEDIFFERENTIALMETHYLATION_RDF_FILE_LOCATION))));
//						break;
//					}
				}

				rowCount++;
			}

		}catch(Exception e){
			logger.info("[012345] Axioms size: "+onto.getAxioms().size());
			logger.info("[012345] Records: "+rowCount);
			logger.error("[012345] Error! "+e.getMessage());
			throw new RuntimeException(e.getMessage(),e);
		}finally{
			logger.info("[012345] Process of MethylationModelConverterImpl finished!");
		}
			
	}

	private Gene_Name getGeneName(String value) {
		return factory.createGene_Name(value);
	}

	private Chromosome getChromosome(String value) {
		return factory.createChromosome(value);
	}


}