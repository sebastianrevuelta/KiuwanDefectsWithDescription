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
import io.swagger.client.model.PortfolioDefinitionData;
import io.swagger.client.model.UserPortfolioRoleData;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PortfolioApi
 */
@Ignore
public class PortfolioApiTest {

    private final PortfolioApi api = new PortfolioApi();

    
    /**
     * Create or update portfolio definitions
     *
     * Creates or update portfolio definitions for an account.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createPortfolioGroupsTest() throws ApiException {
        PortfolioDefinitionData body = null;
        api.createPortfolioGroups(body);

        // TODO: test validations
    }
    
    /**
     * Get if portfolio and portfolio value exists
     *
     * Check if portfolio and portfolio value exists. This endpoint return an error code 15 if the portfolio name not exists and return true if exists the pair protfolio name and value and false if exists portfolio name but not exists the portfolio value for this portfolio name.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void existsPortfolioValueTest() throws ApiException {
        String portfolio = null;
        String value = null;
        Boolean response = api.existsPortfolioValue(portfolio, value);

        // TODO: test validations
    }
    
    /**
     * Get portfolio definitions
     *
     * Obtains the portfolio definitions of an account.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPortfolioGroupsTest() throws ApiException {
        List<PortfolioDefinitionData> response = api.getPortfolioGroups();

        // TODO: test validations
    }
    
    /**
     * Get list of portfolio values by portfolio name
     *
     * List all portfolio values asociated to portfolio name. This endpoint return an error code 15 if the portfolio name not exists, in other case, it return the list of portfolio values.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPortfolioValuesByNameTest() throws ApiException {
        String portfolio = null;
        List<String> response = api.getPortfolioValuesByName(portfolio);

        // TODO: test validations
    }
    
    /**
     * Get users roles by portfolio
     *
     * List the users roles for the portfolio. Use &#39;username&#39;, &#39;exactUsername&#39;, &#39;portfolioValue&#39; and &#39;exactPortfolioValue&#39; to filter results.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUserRolesPortfolioTest() throws ApiException {
        String portfolio = null;
        String username = null;
        Boolean exactUsername = null;
        String portfolioValue = null;
        Boolean exactPortfolioValue = null;
        List<UserPortfolioRoleData> response = api.getUserRolesPortfolio(portfolio, username, exactUsername, portfolioValue, exactPortfolioValue);

        // TODO: test validations
    }
    
}
