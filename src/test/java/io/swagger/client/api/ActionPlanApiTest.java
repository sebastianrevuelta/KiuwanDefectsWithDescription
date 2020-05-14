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
import io.swagger.client.model.ActionPlanDefectsResponse;
import io.swagger.client.model.ActionPlanDetailResponse;
import io.swagger.client.model.ActionPlanPendingDefectsResponse;
import io.swagger.client.model.ActionPlanProgressResponse;
import io.swagger.client.model.ActionPlanRemovedDefectsResponse;
import org.threeten.bp.OffsetDateTime;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ActionPlanApi
 */
@Ignore
public class ActionPlanApiTest {

    private final ActionPlanApi api = new ActionPlanApi();

    
    /**
     * Get progress summary of an action plan
     *
     * Obtains the current and the past main metrics and indicators of an application for an action plan. If there are more than one action plans with the same name, this endpoint returns the most recent action plan&#39;s information.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getActionPlanTest() throws ApiException {
        String application = null;
        String name = null;
        OffsetDateTime creation = null;
        ActionPlanProgressResponse response = api.getActionPlan(application, name, creation);

        // TODO: test validations
    }
    
    /**
     * Get all defects of an action plan
     *
     * Obtains all defects included in an action plan. If there are more than one action plans with the same name, this endpoint returns the most recent action plan&#39;s information.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getActionPlanAllDefectsTest() throws ApiException {
        String application = null;
        String name = null;
        OffsetDateTime creation = null;
        ActionPlanDefectsResponse response = api.getActionPlanAllDefects(application, name, creation);

        // TODO: test validations
    }
    
    /**
     * Get pending defects of an action plan
     *
     * Obtains the pending defects of an action plan compared with a concrete analysis. If there are more than one action plans with the same name, this endpoint returns the most recent action plan&#39;s information. If there are more than one analysis with the same label, uses the most recent analysis of them.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getActionPlanPendingDefectsTest() throws ApiException {
        String application = null;
        String name = null;
        String analysisLabel = null;
        OffsetDateTime creation = null;
        String orderBy = null;
        Boolean asc = null;
        Integer limit = null;
        String characteristics = null;
        String languages = null;
        String priorities = null;
        String fileContains = null;
        ActionPlanPendingDefectsResponse response = api.getActionPlanPendingDefects(application, name, analysisLabel, creation, orderBy, asc, limit, characteristics, languages, priorities, fileContains);

        // TODO: test validations
    }
    
    /**
     * Get removed defects of an action plan
     *
     * Obtains the removed defects of an action plan compared with a concrete analysis. If there are more than one action plans with the same name, this endpoint returns the most recent action plan&#39;s information. If there are more than one analysis with the same label, uses the most recent analysis of them.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getActionPlanRemovedDefectsTest() throws ApiException {
        String application = null;
        String name = null;
        String analysisLabel = null;
        OffsetDateTime creation = null;
        ActionPlanRemovedDefectsResponse response = api.getActionPlanRemovedDefects(application, name, analysisLabel, creation);

        // TODO: test validations
    }
    
    /**
     * Get available action plans
     *
     * List action plans of an application.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getActionPlansTest() throws ApiException {
        String application = null;
        List<ActionPlanDetailResponse> response = api.getActionPlans(application);

        // TODO: test validations
    }
    
}
