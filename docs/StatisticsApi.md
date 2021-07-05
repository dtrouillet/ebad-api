# StatisticsApi

All URIs are relative to *https://ebad.herokuapp.com/ebad*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getGeneralStatistiques**](StatisticsApi.md#getGeneralStatistiques) | **GET** /statistics | 

<a name="getGeneralStatistiques"></a>
# **getGeneralStatistiques**
> StatisticsDto getGeneralStatistiques()



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.StatisticsApi;


StatisticsApi apiInstance = new StatisticsApi();
try {
    StatisticsDto result = apiInstance.getGeneralStatistiques();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StatisticsApi#getGeneralStatistiques");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**StatisticsDto**](StatisticsDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

