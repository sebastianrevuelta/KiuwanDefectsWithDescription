# ActionPlanApi

All URIs are relative to *https://api.kiuwan.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getActionPlan**](ActionPlanApi.md#getActionPlan) | **GET** /actionPlan | Get progress summary of an action plan
[**getActionPlanAllDefects**](ActionPlanApi.md#getActionPlanAllDefects) | **GET** /actionPlan/defects/all | Get all defects of an action plan
[**getActionPlanPendingDefects**](ActionPlanApi.md#getActionPlanPendingDefects) | **GET** /actionPlan/defects/pending | Get pending defects of an action plan
[**getActionPlanRemovedDefects**](ActionPlanApi.md#getActionPlanRemovedDefects) | **GET** /actionPlan/defects/removed | Get removed defects of an action plan
[**getActionPlans**](ActionPlanApi.md#getActionPlans) | **GET** /actionPlans | Get available action plans


<a name="getActionPlan"></a>
# **getActionPlan**
> ActionPlanProgressResponse getActionPlan(application, name, creation)

Get progress summary of an action plan

Obtains the current and the past main metrics and indicators of an application for an action plan. If there are more than one action plans with the same name, this endpoint returns the most recent action plan&#39;s information.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ActionPlanApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Cookie
ApiKeyAuth Cookie = (ApiKeyAuth) defaultClient.getAuthentication("Cookie");
Cookie.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Cookie.setApiKeyPrefix("Token");

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ActionPlanApi apiInstance = new ActionPlanApi();
String application = "application_example"; // String | Application name
String name = "name_example"; // String | Action plan name
OffsetDateTime creation = OffsetDateTime.now(); // OffsetDateTime | Action plan creation date
try {
    ActionPlanProgressResponse result = apiInstance.getActionPlan(application, name, creation);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ActionPlanApi#getActionPlan");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **application** | **String**| Application name |
 **name** | **String**| Action plan name |
 **creation** | **OffsetDateTime**| Action plan creation date | [optional]

### Return type

[**ActionPlanProgressResponse**](ActionPlanProgressResponse.md)

### Authorization

[Cookie](../README.md#Cookie), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getActionPlanAllDefects"></a>
# **getActionPlanAllDefects**
> ActionPlanDefectsResponse getActionPlanAllDefects(application, name, creation)

Get all defects of an action plan

Obtains all defects included in an action plan. If there are more than one action plans with the same name, this endpoint returns the most recent action plan&#39;s information.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ActionPlanApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Cookie
ApiKeyAuth Cookie = (ApiKeyAuth) defaultClient.getAuthentication("Cookie");
Cookie.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Cookie.setApiKeyPrefix("Token");

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ActionPlanApi apiInstance = new ActionPlanApi();
String application = "application_example"; // String | Application name
String name = "name_example"; // String | Action plan name
OffsetDateTime creation = OffsetDateTime.now(); // OffsetDateTime | Action plan creation date
try {
    ActionPlanDefectsResponse result = apiInstance.getActionPlanAllDefects(application, name, creation);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ActionPlanApi#getActionPlanAllDefects");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **application** | **String**| Application name |
 **name** | **String**| Action plan name |
 **creation** | **OffsetDateTime**| Action plan creation date | [optional]

### Return type

[**ActionPlanDefectsResponse**](ActionPlanDefectsResponse.md)

### Authorization

[Cookie](../README.md#Cookie), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getActionPlanPendingDefects"></a>
# **getActionPlanPendingDefects**
> ActionPlanPendingDefectsResponse getActionPlanPendingDefects(application, name, analysisLabel, creation, orderBy, asc, limit, characteristics, languages, priorities, fileContains)

Get pending defects of an action plan

Obtains the pending defects of an action plan compared with a concrete analysis. If there are more than one action plans with the same name, this endpoint returns the most recent action plan&#39;s information. If there are more than one analysis with the same label, uses the most recent analysis of them.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ActionPlanApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Cookie
ApiKeyAuth Cookie = (ApiKeyAuth) defaultClient.getAuthentication("Cookie");
Cookie.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Cookie.setApiKeyPrefix("Token");

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ActionPlanApi apiInstance = new ActionPlanApi();
String application = "application_example"; // String | Application name
String name = "name_example"; // String | Action plan name
String analysisLabel = "analysisLabel_example"; // String | Analysis label. If empty it compares with last analysis
OffsetDateTime creation = OffsetDateTime.now(); // OffsetDateTime | Action plan creation date
String orderBy = "orderBy_example"; // String | Sorting criteria: priority/effort
Boolean asc = true; // Boolean | Sort ascending: true/false
Integer limit = 56; // Integer | Max number of defects returned
String characteristics = "characteristics_example"; // String | Comma-separated list of characteristics to filter by
String languages = "languages_example"; // String | Comma-separated list of languages to filter by
String priorities = "priorities_example"; // String | Comma-separated list of priorities(Very low, Low, Normal, High, Very high) to filter by
String fileContains = "fileContains_example"; // String | Use this param to filter defects by file name
try {
    ActionPlanPendingDefectsResponse result = apiInstance.getActionPlanPendingDefects(application, name, analysisLabel, creation, orderBy, asc, limit, characteristics, languages, priorities, fileContains);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ActionPlanApi#getActionPlanPendingDefects");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **application** | **String**| Application name |
 **name** | **String**| Action plan name |
 **analysisLabel** | **String**| Analysis label. If empty it compares with last analysis | [optional]
 **creation** | **OffsetDateTime**| Action plan creation date | [optional]
 **orderBy** | **String**| Sorting criteria: priority/effort | [optional] [enum: priority, effort]
 **asc** | **Boolean**| Sort ascending: true/false | [optional]
 **limit** | **Integer**| Max number of defects returned | [optional]
 **characteristics** | **String**| Comma-separated list of characteristics to filter by | [optional] [enum: Efficiency, Maintainability, Portability, Reliability, Security]
 **languages** | **String**| Comma-separated list of languages to filter by | [optional]
 **priorities** | **String**| Comma-separated list of priorities(Very low, Low, Normal, High, Very high) to filter by | [optional] [enum: Very low, Low, Normal, High, Very high]
 **fileContains** | **String**| Use this param to filter defects by file name | [optional]

### Return type

[**ActionPlanPendingDefectsResponse**](ActionPlanPendingDefectsResponse.md)

### Authorization

[Cookie](../README.md#Cookie), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getActionPlanRemovedDefects"></a>
# **getActionPlanRemovedDefects**
> ActionPlanRemovedDefectsResponse getActionPlanRemovedDefects(application, name, analysisLabel, creation)

Get removed defects of an action plan

Obtains the removed defects of an action plan compared with a concrete analysis. If there are more than one action plans with the same name, this endpoint returns the most recent action plan&#39;s information. If there are more than one analysis with the same label, uses the most recent analysis of them.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ActionPlanApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Cookie
ApiKeyAuth Cookie = (ApiKeyAuth) defaultClient.getAuthentication("Cookie");
Cookie.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Cookie.setApiKeyPrefix("Token");

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ActionPlanApi apiInstance = new ActionPlanApi();
String application = "application_example"; // String | Application name
String name = "name_example"; // String | Action plan name
String analysisLabel = "analysisLabel_example"; // String | Analysis label. If empty it compares with last analysis
OffsetDateTime creation = OffsetDateTime.now(); // OffsetDateTime | Action plan creation date
try {
    ActionPlanRemovedDefectsResponse result = apiInstance.getActionPlanRemovedDefects(application, name, analysisLabel, creation);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ActionPlanApi#getActionPlanRemovedDefects");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **application** | **String**| Application name |
 **name** | **String**| Action plan name |
 **analysisLabel** | **String**| Analysis label. If empty it compares with last analysis | [optional]
 **creation** | **OffsetDateTime**| Action plan creation date | [optional]

### Return type

[**ActionPlanRemovedDefectsResponse**](ActionPlanRemovedDefectsResponse.md)

### Authorization

[Cookie](../README.md#Cookie), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getActionPlans"></a>
# **getActionPlans**
> List&lt;ActionPlanDetailResponse&gt; getActionPlans(application)

Get available action plans

List action plans of an application.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ActionPlanApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Cookie
ApiKeyAuth Cookie = (ApiKeyAuth) defaultClient.getAuthentication("Cookie");
Cookie.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Cookie.setApiKeyPrefix("Token");

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ActionPlanApi apiInstance = new ActionPlanApi();
String application = "application_example"; // String | Application name
try {
    List<ActionPlanDetailResponse> result = apiInstance.getActionPlans(application);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ActionPlanApi#getActionPlans");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **application** | **String**| Application name |

### Return type

[**List&lt;ActionPlanDetailResponse&gt;**](ActionPlanDetailResponse.md)

### Authorization

[Cookie](../README.md#Cookie), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

