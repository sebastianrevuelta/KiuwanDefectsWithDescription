
# UserAppsPermissionsResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**username** | **String** | User name |  [optional]
**email** | **String** | User email |  [optional]
**firstName** | **String** | User first name |  [optional]
**lastName** | **String** | User last name |  [optional]
**managementFeatures** | **List&lt;String&gt;** | Management features. Allowed values are { MANAGE_APPLICATIONS | MANAGE_ALL_USERS | MANAGE_MODELS } |  [optional]
**enabled** | **Boolean** | Indicates if the user is enabled or not |  [optional]
**supportEnabled** | **Boolean** | Indicates if the user has the support enabled |  [optional]
**overrideUserGroup** | **Boolean** | Indicates if the user override group permissions |  [optional]
**manageApplications** | **Boolean** | Indicates if the user has permissions to manage applications |  [optional]
**manageUsers** | **Boolean** | Indicates if the user has permissions to manage users |  [optional]
**manageModels** | **Boolean** | Indicates if the user has permissions to manage models |  [optional]
**manageAudits** | **Boolean** | Indicates if the user has permissions to manage audits |  [optional]
**manageReports** | **Boolean** | Indicates if the user has permissions to manage reports |  [optional]
**applicationPermissionsData** | [**List&lt;ApplicationPermissionsData&gt;**](ApplicationPermissionsData.md) | List of applicaction names and their permissions for this user |  [optional]



