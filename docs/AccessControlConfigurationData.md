
# AccessControlConfigurationData

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**assignmentMode** | [**AssignmentModeEnum**](#AssignmentModeEnum) | Indicates how to update the permissions. Can be ADD, DELETE or OVERWRITE. |  [optional]
**overrideUserGroupConfig** | **Boolean** | Indicates if override user group config or not |  [optional]
**managementFeatures** | **List&lt;String&gt;** | Management features to enable/disable. Allowed values are { MANAGE_APPLICATIONS | MANAGE_ALL_USERS | MANAGE_MODELS } |  [optional]
**portfolioRoles** | [**List&lt;PortfolioRoleData&gt;**](PortfolioRoleData.md) | Portfolio roles list |  [optional]
**applicationRoles** | [**List&lt;ApplicationRoleData&gt;**](ApplicationRoleData.md) | Application roles list |  [optional]
**businessValueRoles** | [**List&lt;BusinessValuePortfolioRoleData&gt;**](BusinessValuePortfolioRoleData.md) | Business value portofolio roles list |  [optional]
**providerRoles** | [**List&lt;ProviderPortfolioRoleData&gt;**](ProviderPortfolioRoleData.md) | Provider portfolio roles list |  [optional]


<a name="AssignmentModeEnum"></a>
## Enum: AssignmentModeEnum
Name | Value
---- | -----
ADD | &quot;ADD&quot;
DELETE | &quot;DELETE&quot;
OVERWRITE | &quot;OVERWRITE&quot;



