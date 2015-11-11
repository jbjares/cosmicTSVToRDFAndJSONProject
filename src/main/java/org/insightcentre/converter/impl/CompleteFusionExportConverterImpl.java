package org.insightcentre.converter.impl;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.insightcentre.converter.impl.protegen.completefusionexport.impl.Complete_Fusion_Export;
import org.insightcentre.converter.impl.protegen.completefusionexport.impl.CosmicFusionExportFactory;
import org.insightcentre.converter.impl.protegen.completefusionexport.impl.Fusion_Id;
import org.semanticweb.owlapi.apibinding.OWLManager;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyFormat;
import org.semanticweb.owlapi.model.OWLOntologyManager;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import au.com.bytecode.opencsv.CSVReader;

public class CompleteFusionExportConverterImpl implements IConverter {

	Logger logger = Logger.getLogger(CompleteFusionExportConverterImpl.class);

	private OWLOntologyManager owlOntologyManager;
	private OWLOntology onto;
	private CosmicFusionExportFactory factory;
	private PropertiesUtil propertiesUtil;
	private String propertiesFileLocations;

	public CompleteFusionExportConverterImpl(String propertiesFileLocations) throws Exception {
		this.propertiesFileLocations = propertiesFileLocations;
		propertiesUtil = new PropertiesUtil();
		owlOntologyManager = OWLManager.createOWLOntologyManager();
		onto = owlOntologyManager.loadOntologyFromOntologyDocument(new File(
				propertiesUtil.getPropertyValue(propertiesFileLocations, COSMICFUSIONEXPORT_OWL_FILE_LOCATION)));
		factory = new CosmicFusionExportFactory(onto);
	}

	public void execute() throws Exception {
		int rowCount = 0;
		try {

			String fileLoction = propertiesUtil.getPropertyValue(propertiesFileLocations,
					COSMICFUSIONEXPORT_TSV_FILE_LOCATION);
			File file = new File(fileLoction);
			logger.info("[01234] Processing File " + file.getName() + " ...... ");

			CSVReader reader = new CSVReader(new FileReader(file), '\t');
			JsonArray jsonArr = new JsonArray();
			String[] record;
			while ((record = reader.readNext()) != null) {

				if (rowCount != 0) {
					Complete_Fusion_Export cfe = factory.createComplete_Fusion_Export(CFE + rowCount);
					JsonObject jsonObject = new JsonObject();

					String fusion_IdValue = record[10] == null ? EMPTY_STRING : record[10];
					cfe.addFusion_Id(getFusionId(fusion_IdValue));
					jsonObject.addProperty(FUSION_ID, fusion_IdValue);

					String fusionTypeValue = record[12] == null ? EMPTY_STRING : record[12];
					cfe.addFusion_Type(fusionTypeValue);
					jsonObject.addProperty(FUSION_TYPE, fusionTypeValue);

					String histology_Subtype_1Value = record[9] == null ? EMPTY_STRING : record[9];
					cfe.addHistology_Subtype_1(histology_Subtype_1Value);
					jsonObject.addProperty(HISTOLOGY_SUBTYPE_1, histology_Subtype_1Value);

					String histology_Subtype_3Value = record[11] == null ? EMPTY_STRING : record[11];
					cfe.addHistology_Subtype_3(histology_Subtype_3Value);
					jsonObject.addProperty(HISTOLOGY_SUBTYPE_3, histology_Subtype_3Value);

					String primarySiteValue = record[2] == null ? EMPTY_STRING : record[2];
					cfe.addPrimary_Site(primarySiteValue);
					jsonObject.addProperty(PRIMARY_SITE, primarySiteValue);

					String pubmedPMIDValue = record[13] == null ? EMPTY_STRING : record[13];
					cfe.addPubmed_PMID(pubmedPMIDValue);
					jsonObject.addProperty(PUBMED_PMID, pubmedPMIDValue);

					String site_Subtype_1Value = record[3];
					cfe.addSite_Subtype_1(site_Subtype_1Value);
					jsonObject.addProperty(SITE_SUBTYPE_1_VALUE, site_Subtype_1Value);

					String site_Subtype_3Value = record[5];
					cfe.addSite_Subtype_3(site_Subtype_3Value);
					jsonObject.addProperty(SITE_SUBTYPE_3_VALUE, site_Subtype_3Value);

					String translocationName = record[11] == null ? EMPTY_STRING : record[11];
					cfe.addTranslocation_Name(translocationName);
					jsonObject.addProperty(TRANSLOCATION_NAME, translocationName);

					jsonArr.add(jsonObject);

					// TODO Uncomment before the .jar generation
//					 owlOntologyManager.saveOntology(cfe.getOwlOntology(),
//					 new FileOutputStream(new
//					 File(propertiesUtil.getPropertyValue(propertiesFileLocations,
//							 COSMICFUSIONEXPORT_RDF_FILE_LOCATION))));

					// TODO Use the code below to create samples.
//					if (rowCount == 100) {
						File jsonSampleFile = new File(propertiesUtil.getPropertyValue(propertiesFileLocations,
								COSMICFUSIONEXPORT_JSON_FILE_LOCATION));
						FileUtils.writeStringToFile(jsonSampleFile, jsonArr.toString());
						owlOntologyManager.saveOntology(cfe.getOwlOntology(),
								new FileOutputStream(new File(propertiesUtil.getPropertyValue(propertiesFileLocations,
										COSMICFUSIONEXPORT_RDF_FILE_LOCATION))));
						
//						break;
//					}
				}

				rowCount++;
			}
		} catch (Exception e) {
			logger.error("[01234] Error! "+e.getMessage());
			throw new RuntimeException(e.getMessage(),e);
		} finally {
			logger.info("[01234] Axioms size: "+onto.getAxioms().size());
			logger.info("[01234] Records: "+rowCount);
			logger.info("[01234] Process of CompleteFusionExportConverterImpl finished!");
		}

	}


	private Fusion_Id getFusionId(String fusion_IdValue) {
		return factory.createFusion_Id(fusion_IdValue);
	}

}