# AccreditationRequestApi

All URIs are relative to *https://ebad.herokuapp.com/ebad*

Method | HTTP request | Description
------------- | ------------- | -------------
[**answerRequest**](AccreditationRequestApi.md#answerRequest) | **POST** /accreditation-requests/response | 
[**createAccreditationRequest**](AccreditationRequestApi.md#createAccreditationRequest) | **PUT** /accreditation-requests | 
[**findAll**](AccreditationRequestApi.md#findAll) | **GET** /accreditation-requests/need-answer | 
[**findAllMyRequest**](AccreditationRequestApi.md#findAllMyRequest) | **GET** /accreditation-requests | 

<a name="answerRequest"></a>
# **answerRequest**
> answerRequest(body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccreditationRequestApi;


AccreditationRequestApi apiInstance = new AccreditationRequestApi();
ResponseAccreditationRequestDto body = new ResponseAccreditationRequestDto(); // ResponseAccreditationRequestDto | 
try {
    apiInstance.answerRequest(body);
} catch (ApiException e) {
    System.err.println("Exception when calling AccreditationRequestApi#answerRequest");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ResponseAccreditationRequestDto**](ResponseAccreditationRequestDto.md)|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="createAccreditationRequest"></a>
# **createAccreditationRequest**
> AccreditationRequestDto createAccreditationRequest(body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccreditationRequestApi;


AccreditationRequestApi apiInstance = new AccreditationRequestApi();
CreationAccreditationRequestDto body = new CreationAccreditationRequestDto(); // CreationAccreditationRequestDto | 
try {
    AccreditationRequestDto result = apiInstance.createAccreditationRequest(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccreditationRequestApi#createAccreditationRequest");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CreationAccreditationRequestDto**](CreationAccreditationRequestDto.md)|  |

### Return type

[**AccreditationRequestDto**](AccreditationRequestDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="findAll"></a>
# **findAll**
> PageAccreditationRequestDto findAll(pageable)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccreditationRequestApi;


AccreditationRequestApi apiInstance = new AccreditationRequestApi();
Pageable pageable = new Pageable(); // Pageable | 
try {
    PageAccreditationRequestDto result = apiInstance.findAll(pageable);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccreditationRequestApi#findAll");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pageable** | [**Pageable**](.md)|  |

### Return type

[**PageAccreditationRequestDto**](PageAccreditationRequestDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="findAllMyRequest"></a>
# **findAllMyRequest**
> PageAccreditationRequestDto findAllMyRequest(pageable)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccreditationRequestApi;


AccreditationRequestApi apiInstance = new AccreditationRequestApi();
Pageable pageable = new Pageable(); // Pageable | 
try {
    PageAccreditationRequestDto result = apiInstance.findAllMyRequest(pageable);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccreditationRequestApi#findAllMyRequest");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pageable** | [**Pageable**](.md)|  |

### Return type

[**PageAccreditationRequestDto**](PageAccreditationRequestDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

