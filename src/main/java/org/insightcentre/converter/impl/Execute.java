package org.insightcentre.converter.impl;

public class Execute {
	
	private static final String TRANSLATION_TYPE_WAS_NOT_DEFINED = "translation type was not defined!";
	private static final String PROPERTIES_FILE_LOCATION_WAS_NOT_DEFINED = "propertiesFileLocation was not defined!";
	private static final String COSMIC_MUTANT_EXPORT_CENSUS = "CosmicMutantExportCensus";
	private static final String COSMIC_STRUCT_EXPORT = "CosmicStructExport";
	private static final String COSMIC_COMPLETE_DIFFERENTIAL_METHYLATION = "CosmicCompleteDifferentialMethylation";
	private static final String COSMIC_FUSION_EXPORT = "CosmicFusionExport";

	public static void main(String[] args) throws Exception {
		if(args==null || args[0]==null || "".equals(args[0])){
			throw new RuntimeException(PROPERTIES_FILE_LOCATION_WAS_NOT_DEFINED);
		}
		if(args==null || args[1]==null || "".equals(args[1])){
			throw new RuntimeException(TRANSLATION_TYPE_WAS_NOT_DEFINED);
		}
		String propertiesFileLocations = args[0];
		String translationTypeName = args[1];
		execute(propertiesFileLocations,translationTypeName);
	}

	private static void execute(String propertiesFileLocations, String translationTypeName) throws Exception {
		if(translationTypeName.equals(COSMIC_MUTANT_EXPORT_CENSUS)){
			AllMutationCensusGenesConverterImpl amc = new AllMutationCensusGenesConverterImpl(propertiesFileLocations);
			amc.execute();
			return;
		}
		if(translationTypeName.equals(COSMIC_STRUCT_EXPORT)){
			StructuralGenomicsArrangementsConverterImpl sga = new StructuralGenomicsArrangementsConverterImpl(propertiesFileLocations);
			sga.execute();
			return;
		}
		if(translationTypeName.equals(COSMIC_FUSION_EXPORT)){
			CompleteFusionExportConverterImpl cfe = new CompleteFusionExportConverterImpl(propertiesFileLocations);
			cfe.execute();
			return;	
		}
		if(translationTypeName.equals(COSMIC_COMPLETE_DIFFERENTIAL_METHYLATION)){
			MethylationModelConverterImpl met = new MethylationModelConverterImpl(propertiesFileLocations);
			met.execute();
			return;
		}
		
		throw new RuntimeException("Name not found for specified translation type.. \n"
				+ "Try: [CosmicMutantExportCensus, CosmicStructExport, CosmicFusionExport, CosmicCompleteDifferentialMethylation]");
		
	}

}
