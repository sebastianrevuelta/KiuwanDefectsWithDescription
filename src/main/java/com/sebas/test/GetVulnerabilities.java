package com.sebas.test;

import java.util.Iterator;
import java.util.List;

import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.Configuration;
import io.swagger.client.api.AnalysesApi;
import io.swagger.client.api.DocumentationApi;
import io.swagger.client.api.UserApi;
import io.swagger.client.auth.HttpBasicAuth;
import io.swagger.client.model.AnalysisDefectsResponse;
import io.swagger.client.model.ApplicationAnalysisResponse;
import io.swagger.client.model.DefectDetailResponse;
import io.swagger.client.model.RuleDocumentationResponse;

public class GetVulnerabilities {

	public static void main(String[] args) {
		
		
		if (args.length != 3) {
			System.out.println("Program receives 3 arguments: username password applicationName");
			return;
		}
    	
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername(args[0]);
        basicAuth.setPassword(args[1]);
        String application = args[2];

		// Instance API operation
		AnalysesApi analysis = new AnalysesApi(defaultClient);
		DocumentationApi doc = new DocumentationApi(defaultClient);
		
		try {
			ApplicationAnalysisResponse lastAnalysis = analysis.getLastAnalysis(application);
			String analysisCode = lastAnalysis.getAnalysisCode();
			Long modelId = lastAnalysis.getModelId();
			AnalysisDefectsResponse result = analysis.getAnalysisDefects(analysisCode, null, null, null, null, null, null, null, null);

			List<DefectDetailResponse> defects = result.getDefects();
			Iterator<DefectDetailResponse> i = defects.iterator();
			while (i.hasNext()) {
				DefectDetailResponse defect = i.next();
				System.out.println(defect.getRuleCode());
				String code = defect.getRuleCode();
				RuleDocumentationResponse ruleDoc = doc.getRuleDoc(modelId.toString(), code, application);
				System.out.println(ruleDoc.getDescription());				
			}
			
		} catch (ApiException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
