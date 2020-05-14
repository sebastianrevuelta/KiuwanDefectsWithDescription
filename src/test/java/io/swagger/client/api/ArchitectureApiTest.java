/*
 * Kiuwan REST API
 * Kiuwan REST API specification
 *
 * OpenAPI spec version: 2.8.2004.3-SNAPSHOT
 * Contact: support@kiuwan.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.ListComponentsRequest;
import io.swagger.client.model.ListComponentsResponse;
import io.swagger.client.model.SearchImpactResponse;
import io.swagger.client.model.SearchSourcesImpactRequest;
import io.swagger.client.model.SearchTargetsImpactRequest;
import io.swagger.client.model.SubGraphImpactRequest;
import io.swagger.client.model.SubGraphImpactResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ArchitectureApi
 */
@Ignore
public class ArchitectureApiTest {

    private final ArchitectureApi api = new ArchitectureApi();

    
    /**
     * Get list of components by filter and pagination
     *
     * List components in analysis for a concrete analysis specified by analysisCode parameter or application name specified in applicationName parameter by filter and pagination.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listComponentsTest() throws ApiException {
        ListComponentsRequest body = null;
        ListComponentsResponse response = api.listComponents(body);

        // TODO: test validations
    }
    
    /**
     * Get list of sources that impact on a component with the specified targetId
     *
     * List of sources that impact on a component with the specified targetId in analysis for a concrete analysis specified by analysisCode parameter or application name specified in applicationName parameter by filters and pagination.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void searchSourcesTest() throws ApiException {
        SearchSourcesImpactRequest body = null;
        SearchImpactResponse response = api.searchSources(body);

        // TODO: test validations
    }
    
    /**
     * Get list of impacted components
     *
     * List impacted components in analysis for a concrete analysis specified by analysisCode parameter or application name specified in applicationName parameter by filters and pagination.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void searchTargetsTest() throws ApiException {
        SearchTargetsImpactRequest body = null;
        SearchImpactResponse response = api.searchTargets(body);

        // TODO: test validations
    }
    
    /**
     * Get sub graph of analysis impact
     *
     * Get sub graph of analysis impact in analysis for a concrete analysis specified by analysisCode parameter or application name specified in applicationName parameter by source id and target id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void subGraphTest() throws ApiException {
        SubGraphImpactRequest body = null;
        SubGraphImpactResponse response = api.subGraph(body);

        // TODO: test validations
    }
    
}
