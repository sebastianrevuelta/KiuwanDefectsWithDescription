# DeliveryApi

All URIs are relative to *https://api.kiuwan.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getDelivery**](DeliveryApi.md#getDelivery) | **GET** /deliveries/{code} | Get information of a delivery by code
[**listDeliveries**](DeliveryApi.md#listDeliveries) | **GET** /applications/deliveries | Get deliveries of an application


<a name="getDelivery"></a>
# **getDelivery**
> AnalysisResultResponse getDelivery(code)

Get information of a delivery by code

Obtains the information of delivery indicating the code of the delivery.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DeliveryApi;

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

DeliveryApi apiInstance = new DeliveryApi();
String code = "code_example"; // String | Delivery code
try {
    AnalysisResultResponse result = apiInstance.getDelivery(code);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeliveryApi#getDelivery");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **String**| Delivery code |

### Return type

[**AnalysisResultResponse**](AnalysisResultResponse.md)

### Authorization

[Cookie](../README.md#Cookie), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listDeliveries"></a>
# **listDeliveries**
> List&lt;AnalysisResponse&gt; listDeliveries(application, maxdays, page, count, auditSuccess, filterPurgedAnalyses, changeRequestFilter)

Get deliveries of an application

Obtains the deliveries indicating the name of the application.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DeliveryApi;

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

DeliveryApi apiInstance = new DeliveryApi();
String application = "application_example"; // String | Application name
Integer maxdays = 56; // Integer | Max number of days old of deliveries returned
Integer page = 1; // Integer | Number of results page (defaults to 1)
Integer count = 56; // Integer | Limit results
Boolean auditSuccess = true; // Boolean | Set to true or false to retrieve only succeeded or failed audit delivery, respectively
Boolean filterPurgedAnalyses = true; // Boolean | Set to true to not retrieve purged analyses
String changeRequestFilter = "changeRequestFilter_example"; // String | To filter deliveries by changeRequest
try {
    List<AnalysisResponse> result = apiInstance.listDeliveries(application, maxdays, page, count, auditSuccess, filterPurgedAnalyses, changeRequestFilter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeliveryApi#listDeliveries");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **application** | **String**| Application name |
 **maxdays** | **Integer**| Max number of days old of deliveries returned | [optional]
 **page** | **Integer**| Number of results page (defaults to 1) | [optional] [default to 1]
 **count** | **Integer**| Limit results | [optional]
 **auditSuccess** | **Boolean**| Set to true or false to retrieve only succeeded or failed audit delivery, respectively | [optional]
 **filterPurgedAnalyses** | **Boolean**| Set to true to not retrieve purged analyses | [optional] [default to true]
 **changeRequestFilter** | **String**| To filter deliveries by changeRequest | [optional]

### Return type

[**List&lt;AnalysisResponse&gt;**](AnalysisResponse.md)

### Authorization

[Cookie](../README.md#Cookie), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

