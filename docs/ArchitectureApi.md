# ArchitectureApi

All URIs are relative to *https://api.kiuwan.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listComponents**](ArchitectureApi.md#listComponents) | **POST** /arch/list | Get list of components by filter and pagination
[**searchSources**](ArchitectureApi.md#searchSources) | **POST** /arch/impact/searchSources | Get list of sources that impact on a component with the specified targetId
[**searchTargets**](ArchitectureApi.md#searchTargets) | **POST** /arch/impact/searchTargets | Get list of impacted components
[**subGraph**](ArchitectureApi.md#subGraph) | **POST** /arch/impact/subGraph | Get sub graph of analysis impact


<a name="listComponents"></a>
# **listComponents**
> ListComponentsResponse listComponents(body)

Get list of components by filter and pagination

List components in analysis for a concrete analysis specified by analysisCode parameter or application name specified in applicationName parameter by filter and pagination.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ArchitectureApi;

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

ArchitectureApi apiInstance = new ArchitectureApi();
ListComponentsRequest body = new ListComponentsRequest(); // ListComponentsRequest | List components request
try {
    ListComponentsResponse result = apiInstance.listComponents(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectureApi#listComponents");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ListComponentsRequest**](ListComponentsRequest.md)| List components request |

### Return type

[**ListComponentsResponse**](ListComponentsResponse.md)

### Authorization

[Cookie](../README.md#Cookie), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="searchSources"></a>
# **searchSources**
> SearchImpactResponse searchSources(body)

Get list of sources that impact on a component with the specified targetId

List of sources that impact on a component with the specified targetId in analysis for a concrete analysis specified by analysisCode parameter or application name specified in applicationName parameter by filters and pagination.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ArchitectureApi;

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

ArchitectureApi apiInstance = new ArchitectureApi();
SearchSourcesImpactRequest body = new SearchSourcesImpactRequest(); // SearchSourcesImpactRequest | Analysis impact request for sources
try {
    SearchImpactResponse result = apiInstance.searchSources(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectureApi#searchSources");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SearchSourcesImpactRequest**](SearchSourcesImpactRequest.md)| Analysis impact request for sources |

### Return type

[**SearchImpactResponse**](SearchImpactResponse.md)

### Authorization

[Cookie](../README.md#Cookie), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="searchTargets"></a>
# **searchTargets**
> SearchImpactResponse searchTargets(body)

Get list of impacted components

List impacted components in analysis for a concrete analysis specified by analysisCode parameter or application name specified in applicationName parameter by filters and pagination.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ArchitectureApi;

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

ArchitectureApi apiInstance = new ArchitectureApi();
SearchTargetsImpactRequest body = new SearchTargetsImpactRequest(); // SearchTargetsImpactRequest | Analysis impact request
try {
    SearchImpactResponse result = apiInstance.searchTargets(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectureApi#searchTargets");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SearchTargetsImpactRequest**](SearchTargetsImpactRequest.md)| Analysis impact request |

### Return type

[**SearchImpactResponse**](SearchImpactResponse.md)

### Authorization

[Cookie](../README.md#Cookie), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="subGraph"></a>
# **subGraph**
> SubGraphImpactResponse subGraph(body)

Get sub graph of analysis impact

Get sub graph of analysis impact in analysis for a concrete analysis specified by analysisCode parameter or application name specified in applicationName parameter by source id and target id.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ArchitectureApi;

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

ArchitectureApi apiInstance = new ArchitectureApi();
SubGraphImpactRequest body = new SubGraphImpactRequest(); // SubGraphImpactRequest | Get sub graph of analysis impact
try {
    SubGraphImpactResponse result = apiInstance.subGraph(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectureApi#subGraph");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SubGraphImpactRequest**](SubGraphImpactRequest.md)| Get sub graph of analysis impact |

### Return type

[**SubGraphImpactResponse**](SubGraphImpactResponse.md)

### Authorization

[Cookie](../README.md#Cookie), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

