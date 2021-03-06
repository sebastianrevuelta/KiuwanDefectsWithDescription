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

import io.swagger.client.ApiCallback;
import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.ApiResponse;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;
import io.swagger.client.ProgressRequestBody;
import io.swagger.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import io.swagger.client.model.AnalysisResponse;
import io.swagger.client.model.AnalysisResultResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DeliveryApi {
    private ApiClient apiClient;

    public DeliveryApi() {
        this(Configuration.getDefaultApiClient());
    }

    public DeliveryApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getDelivery
     * @param code Delivery code (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getDeliveryCall(String code, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/deliveries/{code}"
            .replaceAll("\\{" + "code" + "\\}", apiClient.escapeString(code.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "Cookie", "basicAuth" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getDeliveryValidateBeforeCall(String code, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'code' is set
        if (code == null) {
            throw new ApiException("Missing the required parameter 'code' when calling getDelivery(Async)");
        }
        

        com.squareup.okhttp.Call call = getDeliveryCall(code, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get information of a delivery by code
     * Obtains the information of delivery indicating the code of the delivery.
     * @param code Delivery code (required)
     * @return AnalysisResultResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public AnalysisResultResponse getDelivery(String code) throws ApiException {
        ApiResponse<AnalysisResultResponse> resp = getDeliveryWithHttpInfo(code);
        return resp.getData();
    }

    /**
     * Get information of a delivery by code
     * Obtains the information of delivery indicating the code of the delivery.
     * @param code Delivery code (required)
     * @return ApiResponse&lt;AnalysisResultResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<AnalysisResultResponse> getDeliveryWithHttpInfo(String code) throws ApiException {
        com.squareup.okhttp.Call call = getDeliveryValidateBeforeCall(code, null, null);
        Type localVarReturnType = new TypeToken<AnalysisResultResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get information of a delivery by code (asynchronously)
     * Obtains the information of delivery indicating the code of the delivery.
     * @param code Delivery code (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getDeliveryAsync(String code, final ApiCallback<AnalysisResultResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getDeliveryValidateBeforeCall(code, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<AnalysisResultResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for listDeliveries
     * @param application Application name (required)
     * @param maxdays Max number of days old of deliveries returned (optional)
     * @param page Number of results page (defaults to 1) (optional, default to 1)
     * @param count Limit results (optional)
     * @param auditSuccess Set to true or false to retrieve only succeeded or failed audit delivery, respectively (optional)
     * @param filterPurgedAnalyses Set to true to not retrieve purged analyses (optional, default to true)
     * @param changeRequestFilter To filter deliveries by changeRequest (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call listDeliveriesCall(String application, Integer maxdays, Integer page, Integer count, Boolean auditSuccess, Boolean filterPurgedAnalyses, String changeRequestFilter, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/applications/deliveries";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (maxdays != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("maxdays", maxdays));
        if (application != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("application", application));
        if (page != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("page", page));
        if (count != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("count", count));
        if (auditSuccess != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("auditSuccess", auditSuccess));
        if (filterPurgedAnalyses != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("filterPurgedAnalyses", filterPurgedAnalyses));
        if (changeRequestFilter != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("changeRequestFilter", changeRequestFilter));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "Cookie", "basicAuth" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call listDeliveriesValidateBeforeCall(String application, Integer maxdays, Integer page, Integer count, Boolean auditSuccess, Boolean filterPurgedAnalyses, String changeRequestFilter, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'application' is set
        if (application == null) {
            throw new ApiException("Missing the required parameter 'application' when calling listDeliveries(Async)");
        }
        

        com.squareup.okhttp.Call call = listDeliveriesCall(application, maxdays, page, count, auditSuccess, filterPurgedAnalyses, changeRequestFilter, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get deliveries of an application
     * Obtains the deliveries indicating the name of the application.
     * @param application Application name (required)
     * @param maxdays Max number of days old of deliveries returned (optional)
     * @param page Number of results page (defaults to 1) (optional, default to 1)
     * @param count Limit results (optional)
     * @param auditSuccess Set to true or false to retrieve only succeeded or failed audit delivery, respectively (optional)
     * @param filterPurgedAnalyses Set to true to not retrieve purged analyses (optional, default to true)
     * @param changeRequestFilter To filter deliveries by changeRequest (optional)
     * @return List&lt;AnalysisResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<AnalysisResponse> listDeliveries(String application, Integer maxdays, Integer page, Integer count, Boolean auditSuccess, Boolean filterPurgedAnalyses, String changeRequestFilter) throws ApiException {
        ApiResponse<List<AnalysisResponse>> resp = listDeliveriesWithHttpInfo(application, maxdays, page, count, auditSuccess, filterPurgedAnalyses, changeRequestFilter);
        return resp.getData();
    }

    /**
     * Get deliveries of an application
     * Obtains the deliveries indicating the name of the application.
     * @param application Application name (required)
     * @param maxdays Max number of days old of deliveries returned (optional)
     * @param page Number of results page (defaults to 1) (optional, default to 1)
     * @param count Limit results (optional)
     * @param auditSuccess Set to true or false to retrieve only succeeded or failed audit delivery, respectively (optional)
     * @param filterPurgedAnalyses Set to true to not retrieve purged analyses (optional, default to true)
     * @param changeRequestFilter To filter deliveries by changeRequest (optional)
     * @return ApiResponse&lt;List&lt;AnalysisResponse&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<AnalysisResponse>> listDeliveriesWithHttpInfo(String application, Integer maxdays, Integer page, Integer count, Boolean auditSuccess, Boolean filterPurgedAnalyses, String changeRequestFilter) throws ApiException {
        com.squareup.okhttp.Call call = listDeliveriesValidateBeforeCall(application, maxdays, page, count, auditSuccess, filterPurgedAnalyses, changeRequestFilter, null, null);
        Type localVarReturnType = new TypeToken<List<AnalysisResponse>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get deliveries of an application (asynchronously)
     * Obtains the deliveries indicating the name of the application.
     * @param application Application name (required)
     * @param maxdays Max number of days old of deliveries returned (optional)
     * @param page Number of results page (defaults to 1) (optional, default to 1)
     * @param count Limit results (optional)
     * @param auditSuccess Set to true or false to retrieve only succeeded or failed audit delivery, respectively (optional)
     * @param filterPurgedAnalyses Set to true to not retrieve purged analyses (optional, default to true)
     * @param changeRequestFilter To filter deliveries by changeRequest (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listDeliveriesAsync(String application, Integer maxdays, Integer page, Integer count, Boolean auditSuccess, Boolean filterPurgedAnalyses, String changeRequestFilter, final ApiCallback<List<AnalysisResponse>> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = listDeliveriesValidateBeforeCall(application, maxdays, page, count, auditSuccess, filterPurgedAnalyses, changeRequestFilter, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<AnalysisResponse>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
