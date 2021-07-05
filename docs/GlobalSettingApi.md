# GlobalSettingApi

All URIs are relative to *https://ebad.herokuapp.com/ebad*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAllSettings**](GlobalSettingApi.md#getAllSettings) | **GET** /global-settings | 
[**getValue**](GlobalSettingApi.md#getValue) | **GET** /global-settings/{key} | 
[**setValue**](GlobalSettingApi.md#setValue) | **POST** /global-settings/{key} | 

<a name="getAllSettings"></a>
# **getAllSettings**
> List&lt;GlobalSettingKeyValueDto&gt; getAllSettings()



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.GlobalSettingApi;


GlobalSettingApi apiInstance = new GlobalSettingApi();
try {
    List<GlobalSettingKeyValueDto> result = apiInstance.getAllSettings();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GlobalSettingApi#getAllSettings");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;GlobalSettingKeyValueDto&gt;**](GlobalSettingKeyValueDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getValue"></a>
# **getValue**
> GlobalSettingKeyValueDto getValue(key)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.GlobalSettingApi;


GlobalSettingApi apiInstance = new GlobalSettingApi();
String key = "key_example"; // String | 
try {
    GlobalSettingKeyValueDto result = apiInstance.getValue(key);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GlobalSettingApi#getValue");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **key** | **String**|  |

### Return type

[**GlobalSettingKeyValueDto**](GlobalSettingKeyValueDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="setValue"></a>
# **setValue**
> GlobalSettingKeyValueDto setValue(body, key)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.GlobalSettingApi;


GlobalSettingApi apiInstance = new GlobalSettingApi();
GlobalSettingValueDto body = new GlobalSettingValueDto(); // GlobalSettingValueDto | 
String key = "key_example"; // String | 
try {
    GlobalSettingKeyValueDto result = apiInstance.setValue(body, key);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GlobalSettingApi#setValue");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**GlobalSettingValueDto**](GlobalSettingValueDto.md)|  |
 **key** | **String**|  |

### Return type

[**GlobalSettingKeyValueDto**](GlobalSettingKeyValueDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

