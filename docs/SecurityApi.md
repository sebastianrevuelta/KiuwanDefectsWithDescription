# SecurityApi

All URIs are relative to *https://api.kiuwan.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAuthorizationForAction**](SecurityApi.md#getAuthorizationForAction) | **GET** /security/permissions/{action} | Get permissions for an action


<a name="getAuthorizationForAction"></a>
# **getAuthorizationForAction**
> AuthorizationResponse getAuthorizationForAction(action, application, appId)

Get permissions for an action

Returns grant information on the specified action for the authenticated user. Recognized actions: MUTE_DEFECTS, CHANGE_DEFECT_STATUS

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SecurityApi;

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

SecurityApi apiInstance = new SecurityApi();
String action = "action_example"; // String | Action name
String application = "application_example"; // String | Application name
String appId = "appId_example"; // String | Application identifier
try {
    AuthorizationResponse result = apiInstance.getAuthorizationForAction(action, application, appId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SecurityApi#getAuthorizationForAction");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **action** | **String**| Action name | [enum: MUTE_DEFECTS, CHANGE_DEFECT_STATUS]
 **application** | **String**| Application name | [optional]
 **appId** | **String**| Application identifier | [optional]

### Return type

[**AuthorizationResponse**](AuthorizationResponse.md)

### Authorization

[Cookie](../README.md#Cookie), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

