package org.insightcentre.converter.impl;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.insightcentre.converter.impl.protegen.allmutationcensusgenes.impl.AllMutationCensusGenesFactory;
import org.insightcentre.converter.impl.protegen.allmutationcensusgenes.impl.All_Mutation_Census_Genes;
import org.insightcentre.converter.impl.protegen.allmutationcensusgenes.impl.HGNC_Id;
import org.insightcentre.converter.impl.protegen.allmutationcensusgenes.impl.Mutation_Id;
import org.semanticweb.owlapi.apibinding.OWLManager;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyManager;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import au.com.bytecode.opencsv.CSVReader;

public class AllMutationCensusGenesConverterImpl implements IConverter {

	Logger logger = Logger.getLogger(AllMutationCensusGenesConverterImpl.class);

	private OWLOntologyManager owlOntologyManager;
	private OWLOntology onto;
	private AllMutationCensusGenesFactory factory;
	private PropertiesUtil propertiesUtil;
	private String propertiesFileLocations;

	public AllMutationCensusGenesConverterImpl(String propertiesFileLocations) throws Exception {
		this.propertiesFileLocations = propertiesFileLocations;
		propertiesUtil = new PropertiesUtil();
		owlOntologyManager = OWLManager.createOWLOntologyManager();
		onto = owlOntologyManager.loadOntologyFromOntologyDocument(new File(
				propertiesUtil.getPropertyValue(propertiesFileLocations, COSMICMUTANTEXPORTCENSUS_OWL_FILE_LOCATION)));
		factory = new AllMutationCensusGenesFactory(onto);
	}

	public void execute() {

		int rowCount = 0;
		try {

			String fileLoction = propertiesUtil.getPropertyValue(propertiesFileLocations,
					COSMICMUTANTEXPORTCENSUS_TSV_FILE_LOCATION);
			File file = new File(fileLoction);

			logger.info("[0123] Processing File " + file.getName() + " ...... ");

			CSVReader reader = new CSVReader(new FileReader(file), '\t');
			JsonArray jsonArr = new JsonArray();
			String[] record;
			while ((record = reader.readNext()) != null) {

				if (rowCount != 0) {
					All_Mutation_Census_Genes amcg = factory.createAll_Mutation_Census_Genes(AMCG2 + rowCount);
					JsonObject jsonObject = new JsonObject();
					String gene_CDS_LengthValue = record[2];
					amcg.addGene_CDS_Length(gene_CDS_LengthValue);
					jsonObject.addProperty(GENE_CDS_LENGTH, gene_CDS_LengthValue);

					amcg.addHGNC_Id(getHGNC_Id(record[3]));
					jsonObject.addProperty(HGNC_ID, record[3]);

					String histology_Subtype_1Value = record[12];
					amcg.addHistology_Subtype_1(histology_Subtype_1Value);
					jsonObject.addProperty(HISTOLOGY_SUBTYPE_1, histology_Subtype_1Value);

					String histology_Subtype_3Value = record[14];
					amcg.addHistology_Subtype_3(histology_Subtype_3Value);
					jsonObject.addProperty(HISTOLOGY_SUBTYPE_3, histology_Subtype_3Value);

					String mutation_CDSValue = record[17];
					amcg.addMutation_CDS(mutation_CDSValue);
					jsonObject.addProperty(MUTATION_CDS, mutation_CDSValue);

					String mutation_Description = record[19];
					amcg.addMutation_Description(mutation_Description);
					jsonObject.addProperty(MUTATION_DESCRIPTION2, mutation_Description);

					amcg.addMutation_Id(getNewMutation_Id(record[16]));
					jsonObject.addProperty(MUTATION_ID_VALUE, record[16]);

					String site_Subtype_1Value = record[8];
					amcg.addSite_Subtype_1(site_Subtype_1Value);
					jsonObject.addProperty(SITE_SUBTYPE_1_VALUE, site_Subtype_1Value);

					String site_Subtype_3Value = record[10];
					amcg.addSite_Subtype_3(site_Subtype_3Value);
					jsonObject.addProperty(SITE_SUBTYPE_3_VALUE, site_Subtype_3Value);
					jsonArr.add(jsonObject);

					// TODO Uncomment before the .jar generation
//					 owlOntologyManager.saveOntology(amcg.getOwlOntology(),
//					 new FileOutputStream(new
//					 File(propertiesUtil.getPropertyValue(propertiesFileLocations,
//							 COSMICMUTANTEXPORTCENSUS_RDF_FILE_LOCATION))));

					// TODO Use the code below to create samples.
//					 if(rowCount==100){
					 File jsonSampleFile = new
					 File(propertiesUtil.getPropertyValue(propertiesFileLocations,
					 COSMICMUTANTEXPORTCENSUS_JSON_FILE_LOCATION));
					 FileUtils.writeStringToFile(jsonSampleFile,
					 jsonArr.toString());
					 owlOntologyManager.saveOntology(amcg.getOwlOntology(),
					 new FileOutputStream(new
					 File(propertiesUtil.getPropertyValue(propertiesFileLocations,
					 COSMICMUTANTEXPORTCENSUS_RDF_FILE_LOCATION))));
//					 break;
//					 }
				}

				rowCount++;
			}
		} catch (Exception e) {
			logger.error("[0123] Error! "+e.getMessage());
			throw new RuntimeException(e.getMessage(),e);
		} finally {
			logger.info("[0123] Axioms size: "+onto.getAxioms().size());
			logger.info("[0123] Records: "+rowCount);
			logger.info("[0123] Process AllMutationCensusGenesConverterImpl finished!");

		}

	}

	private Mutation_Id getNewMutation_Id(String value) {
		return factory.createMutation_Id(value);
	}

	private HGNC_Id getHGNC_Id(String value) {
		return factory.createHGNC_Id(value);
	}

}
