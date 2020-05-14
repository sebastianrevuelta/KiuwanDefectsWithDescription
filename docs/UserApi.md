# UserApi

All URIs are relative to *https://api.kiuwan.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createUser**](UserApi.md#createUser) | **POST** /users | Create user
[**deleteUser**](UserApi.md#deleteUser) | **DELETE** /users/{username} | Delete user
[**getUserApplicationsRoles**](UserApi.md#getUserApplicationsRoles) | **GET** /user/{username}/applications/roles | Get applications roles by user
[**getUserPortfoliosRoles**](UserApi.md#getUserPortfoliosRoles) | **GET** /user/{username}/portfolios/roles | Get portfolios roles by user
[**listUsers**](UserApi.md#listUsers) | **GET** /users | Get list of users
[**listUsersWithPermissions**](UserApi.md#listUsersWithPermissions) | **GET** /users/applications/permissions | Get list of users and application permissions
[**updateUser**](UserApi.md#updateUser) | **PUT** /users/{username} | Update user


<a name="createUser"></a>
# **createUser**
> createUser(body)

Create user

Creates a new user in your account.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UserApi;

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

UserApi apiInstance = new UserApi();
UserManagementRequest body = new UserManagementRequest(); // UserManagementRequest | the user to create
try {
    apiInstance.createUser(body);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#createUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UserManagementRequest**](UserManagementRequest.md)| the user to create |

### Return type

null (empty response body)

### Authorization

[Cookie](../README.md#Cookie), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteUser"></a>
# **deleteUser**
> deleteUser(username)

Delete user

Delete a user of your account.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UserApi;

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

UserApi apiInstance = new UserApi();
String username = "username_example"; // String | User name
try {
    apiInstance.deleteUser(username);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#deleteUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**| User name |

### Return type

null (empty response body)

### Authorization

[Cookie](../README.md#Cookie), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json, text/plain
 - **Accept**: application/json

<a name="getUserApplicationsRoles"></a>
# **getUserApplicationsRoles**
> List&lt;ApplicationRoleData&gt; getUserApplicationsRoles(username, applicationName, exactApplicationName)

Get applications roles by user

List the applications roles for the username. Use &#39;applicationName&#39; and &#39;exactApplicationName&#39; to filter results.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UserApi;

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

UserApi apiInstance = new UserApi();
String username = "username_example"; // String | User name
String applicationName = "applicationName_example"; // String | 'applicationName' mask to filter results
Boolean exactApplicationName = true; // Boolean | Indicates if the applicationName must be equals (ignore case). Only apply if applicationName is provided
try {
    List<ApplicationRoleData> result = apiInstance.getUserApplicationsRoles(username, applicationName, exactApplicationName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#getUserApplicationsRoles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**| User name |
 **applicationName** | **String**| &#39;applicationName&#39; mask to filter results | [optional]
 **exactApplicationName** | **Boolean**| Indicates if the applicationName must be equals (ignore case). Only apply if applicationName is provided | [optional]

### Return type

[**List&lt;ApplicationRoleData&gt;**](ApplicationRoleData.md)

### Authorization

[Cookie](../README.md#Cookie), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUserPortfoliosRoles"></a>
# **getUserPortfoliosRoles**
> List&lt;PortfolioRoleData&gt; getUserPortfoliosRoles(username, portfolioName, exactPortfolioName, portfolioValue, exactPortfolioValue)

Get portfolios roles by user

List the portfolios roles for the username. Use &#39;portfolioName&#39;, &#39;exactPortfolioName&#39;, &#39;portfolioValue&#39; and &#39;exactPortfolioValue&#39; to filter results.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UserApi;

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

UserApi apiInstance = new UserApi();
String username = "username_example"; // String | User name
String portfolioName = "portfolioName_example"; // String | 'portfolioName' mask to filter results
Boolean exactPortfolioName = true; // Boolean | Indicates if the portfolioName must be equals (ignore case). Only apply if portfolioName is provided
String portfolioValue = "portfolioValue_example"; // String | 'portfolioValue' mask to filter results
Boolean exactPortfolioValue = true; // Boolean | Indicates if the portfolioValue must be equals (ignore case). Only apply if portfolioValue is provided
try {
    List<PortfolioRoleData> result = apiInstance.getUserPortfoliosRoles(username, portfolioName, exactPortfolioName, portfolioValue, exactPortfolioValue);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#getUserPortfoliosRoles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**| User name |
 **portfolioName** | **String**| &#39;portfolioName&#39; mask to filter results | [optional]
 **exactPortfolioName** | **Boolean**| Indicates if the portfolioName must be equals (ignore case). Only apply if portfolioName is provided | [optional]
 **portfolioValue** | **String**| &#39;portfolioValue&#39; mask to filter results | [optional]
 **exactPortfolioValue** | **Boolean**| Indicates if the portfolioValue must be equals (ignore case). Only apply if portfolioValue is provided | [optional]

### Return type

[**List&lt;PortfolioRoleData&gt;**](PortfolioRoleData.md)

### Authorization

[Cookie](../README.md#Cookie), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listUsers"></a>
# **listUsers**
> List&lt;UserDetailResponse&gt; listUsers(username, exactUsername, emailAddress)

Get list of users

List the users of your account. Use &#39;username&#39; and &#39;emailAddress&#39; (logical AND) to filter results.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UserApi;

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

UserApi apiInstance = new UserApi();
String username = "username_example"; // String | 'username' mask to filter results
Boolean exactUsername = true; // Boolean | Indicates if the username must be equals (ignore case). Only apply if username is provided
String emailAddress = "emailAddress_example"; // String | 'emailAddress' mask to filter results
try {
    List<UserDetailResponse> result = apiInstance.listUsers(username, exactUsername, emailAddress);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#listUsers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**| &#39;username&#39; mask to filter results | [optional]
 **exactUsername** | **Boolean**| Indicates if the username must be equals (ignore case). Only apply if username is provided | [optional]
 **emailAddress** | **String**| &#39;emailAddress&#39; mask to filter results | [optional]

### Return type

[**List&lt;UserDetailResponse&gt;**](UserDetailResponse.md)

### Authorization

[Cookie](../README.md#Cookie), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listUsersWithPermissions"></a>
# **listUsersWithPermissions**
> List&lt;UserAppsPermissionsResponse&gt; listUsersWithPermissions(username, emailAddress, applicationName, exactUsername, exactApplicationName)

Get list of users and application permissions

List the users of your account with their application permissions. Use &#39;username&#39; and &#39;emailAddress&#39; and &#39;applicationName&#39; (logical AND) to filter results.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UserApi;

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

UserApi apiInstance = new UserApi();
String username = "username_example"; // String | 'username' mask to filter results
String emailAddress = "emailAddress_example"; // String | 'emailAddress' mask to filter results
String applicationName = "applicationName_example"; // String | 'applicationName' mask to filter results
Boolean exactUsername = true; // Boolean | Indicates if the username must be equals (ignore case). Only apply if username is provided
Boolean exactApplicationName = true; // Boolean | Indicates if the applicationName must be equals (ignore case). Only apply if applicationName is provided
try {
    List<UserAppsPermissionsResponse> result = apiInstance.listUsersWithPermissions(username, emailAddress, applicationName, exactUsername, exactApplicationName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#listUsersWithPermissions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**| &#39;username&#39; mask to filter results | [optional]
 **emailAddress** | **String**| &#39;emailAddress&#39; mask to filter results | [optional]
 **applicationName** | **String**| &#39;applicationName&#39; mask to filter results | [optional]
 **exactUsername** | **Boolean**| Indicates if the username must be equals (ignore case). Only apply if username is provided | [optional]
 **exactApplicationName** | **Boolean**| Indicates if the applicationName must be equals (ignore case). Only apply if applicationName is provided | [optional]

### Return type

[**List&lt;UserAppsPermissionsResponse&gt;**](UserAppsPermissionsResponse.md)

### Authorization

[Cookie](../README.md#Cookie), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateUser"></a>
# **updateUser**
> updateUser(body, username)

Update user

Modifies the information of an user in your account.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UserApi;

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

UserApi apiInstance = new UserApi();
UserManagementRequest body = new UserManagementRequest(); // UserManagementRequest | the user to update
String username = "username_example"; // String | User name
try {
    apiInstance.updateUser(body, username);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#updateUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UserManagementRequest**](UserManagementRequest.md)| the user to update |
 **username** | **String**| User name |

### Return type

null (empty response body)

### Authorization

[Cookie](../README.md#Cookie), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

