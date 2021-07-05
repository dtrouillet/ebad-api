# JobRunrApi

All URIs are relative to *https://ebad.herokuapp.com/ebad*

Method | HTTP request | Description
------------- | ------------- | -------------
[**restartJobRunr**](JobRunrApi.md#restartJobRunr) | **POST** /jobrunr/restart | 

<a name="restartJobRunr"></a>
# **restartJobRunr**
> restartJobRunr()



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.JobRunrApi;


JobRunrApi apiInstance = new JobRunrApi();
try {
    apiInstance.restartJobRunr();
} catch (ApiException e) {
    System.err.println("Exception when calling JobRunrApi#restartJobRunr");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

