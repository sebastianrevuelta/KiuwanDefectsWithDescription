# ManagementApi

All URIs are relative to *https://api.kiuwan.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createApplicationNew**](ManagementApi.md#createApplicationNew) | **POST** /applications | Create application
[**deleteApplication**](ManagementApi.md#deleteApplication) | **DELETE** /applications | Delete application
[**getUsersRolesApplication**](ManagementApi.md#getUsersRolesApplication) | **GET** /applications/{application}/users/roles | Get users roles for application
[**updateApplication**](ManagementApi.md#updateApplication) | **PUT** /applications/{application} | Update application
[**updateApplicationWithQueryParameter**](ManagementApi.md#updateApplicationWithQueryParameter) | **PUT** /applications | Update application with query parameter


<a name="createApplicationNew"></a>
# **createApplicationNew**
> createApplicationNew(body)

Create application

Creates a new application in your account.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementApi;

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

ManagementApi apiInstance = new ManagementApi();
ApplicationManagementRequest body = new ApplicationManagementRequest(); // ApplicationManagementRequest | the application to create
try {
    apiInstance.createApplicationNew(body);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementApi#createApplicationNew");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ApplicationManagementRequest**](ApplicationManagementRequest.md)| the application to create |

### Return type

null (empty response body)

### Authorization

[Cookie](../README.md#Cookie), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteApplication"></a>
# **deleteApplication**
> deleteApplication(application)

Delete application

Deletes an application of your account.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementApi;

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

ManagementApi apiInstance = new ManagementApi();
String application = "application_example"; // String | Application name
try {
    apiInstance.deleteApplication(application);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementApi#deleteApplication");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **application** | **String**| Application name |

### Return type

null (empty response body)

### Authorization

[Cookie](../README.md#Cookie), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUsersRolesApplication"></a>
# **getUsersRolesApplication**
> UserApplicationRoleResponse getUsersRolesApplication(application, username, exactUsername)

Get users roles for application

Get users roles for application. Use &#39;username&#39; and &#39;exactUsername&#39; to filter results.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementApi;

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

ManagementApi apiInstance = new ManagementApi();
String application = "application_example"; // String | Application name
String username = "username_example"; // String | 'username' mask to filter results
Boolean exactUsername = true; // Boolean | Indicates if the username must be equals (ignore case). Only apply if username is provided
try {
    UserApplicationRoleResponse result = apiInstance.getUsersRolesApplication(application, username, exactUsername);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementApi#getUsersRolesApplication");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **application** | **String**| Application name |
 **username** | **String**| &#39;username&#39; mask to filter results | [optional]
 **exactUsername** | **Boolean**| Indicates if the username must be equals (ignore case). Only apply if username is provided | [optional]

### Return type

[**UserApplicationRoleResponse**](UserApplicationRoleResponse.md)

### Authorization

[Cookie](../README.md#Cookie), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateApplication"></a>
# **updateApplication**
> updateApplication(body, application)

Update application

Modifies the information of an application in your account.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementApi;

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

ManagementApi apiInstance = new ManagementApi();
ApplicationManagementRequest body = new ApplicationManagementRequest(); // ApplicationManagementRequest | the application to modify
String application = "application_example"; // String | Application name
try {
    apiInstance.updateApplication(body, application);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementApi#updateApplication");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ApplicationManagementRequest**](ApplicationManagementRequest.md)| the application to modify |
 **application** | **String**| Application name |

### Return type

null (empty response body)

### Authorization

[Cookie](../README.md#Cookie), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateApplicationWithQueryParameter"></a>
# **updateApplicationWithQueryParameter**
> updateApplicationWithQueryParameter(body)

Update application with query parameter

Modifies the information of an application in your account.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementApi;

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

ManagementApi apiInstance = new ManagementApi();
ApplicationManagementRequest body = new ApplicationManagementRequest(); // ApplicationManagementRequest | the application to modify
try {
    apiInstance.updateApplicationWithQueryParameter(body);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementApi#updateApplicationWithQueryParameter");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ApplicationManagementRequest**](ApplicationManagementRequest.md)| the application to modify |

### Return type

null (empty response body)

### Authorization

[Cookie](../README.md#Cookie), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

