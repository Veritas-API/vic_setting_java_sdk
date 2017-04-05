# SettingsApi

All URIs are relative to *http://veritas-nonprod-dev.apigee.net/vic/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getSettings**](SettingsApi.md#getSettings) | **GET** /settings | Get settings


<a name="getSettings"></a>
# **getSettings**
> Settings getSettings()

Get settings



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SettingsApi;


SettingsApi apiInstance = new SettingsApi();
try {
    Settings result = apiInstance.getSettings();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SettingsApi#getSettings");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Settings**](Settings.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

