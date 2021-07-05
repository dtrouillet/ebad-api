# ApplicationApi

All URIs are relative to *https://ebad.herokuapp.com/ebad*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createApplication**](ApplicationApi.md#createApplication) | **PUT** /applications/gestion | 
[**findApplication**](ApplicationApi.md#findApplication) | **GET** /applications/search | 
[**getAll3**](ApplicationApi.md#getAll3) | **GET** /applications | 
[**getAllManage**](ApplicationApi.md#getAllManage) | **GET** /applications/gestion | 
[**getAllUsages**](ApplicationApi.md#getAllUsages) | **GET** /applications/{id}/usages | 
[**getAllWrite**](ApplicationApi.md#getAllWrite) | **GET** /applications/write | 
[**getModeratorsFromApplication**](ApplicationApi.md#getModeratorsFromApplication) | **GET** /applications/moderators/{id} | 
[**getUsersFromApplication**](ApplicationApi.md#getUsersFromApplication) | **GET** /applications/users/{id} | 
[**importAll1**](ApplicationApi.md#importAll1) | **POST** /applications/import-all | 
[**removeApplication**](ApplicationApi.md#removeApplication) | **DELETE** /applications/gestion | 
[**updateApplication**](ApplicationApi.md#updateApplication) | **PATCH** /applications/gestion | 

<a name="createApplication"></a>
# **createApplication**
> ApplicationDto createApplication(body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ApplicationApi;


ApplicationApi apiInstance = new ApplicationApi();
ApplicationDto body = new ApplicationDto(); // ApplicationDto | 
try {
    ApplicationDto result = apiInstance.createApplication(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApplicationApi#createApplication");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ApplicationDto**](ApplicationDto.md)|  |

### Return type

[**ApplicationDto**](ApplicationDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findApplication"></a>
# **findApplication**
> PageApplicationSimpleDto findApplication(pageable, predicate)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ApplicationApi;


ApplicationApi apiInstance = new ApplicationApi();
Pageable pageable = new Pageable(); // Pageable | 
Predicate predicate = new Predicate(); // Predicate | 
try {
    PageApplicationSimpleDto result = apiInstance.findApplication(pageable, predicate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApplicationApi#findApplication");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pageable** | [**Pageable**](.md)|  |
 **predicate** | [**Predicate**](.md)|  |

### Return type

[**PageApplicationSimpleDto**](PageApplicationSimpleDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAll3"></a>
# **getAll3**
> PageApplicationDto getAll3(pageable)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ApplicationApi;


ApplicationApi apiInstance = new ApplicationApi();
Pageable pageable = new Pageable(); // Pageable | 
try {
    PageApplicationDto result = apiInstance.getAll3(pageable);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApplicationApi#getAll3");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pageable** | [**Pageable**](.md)|  |

### Return type

[**PageApplicationDto**](PageApplicationDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAllManage"></a>
# **getAllManage**
> PageApplicationDto getAllManage(pageable, predicate)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ApplicationApi;


ApplicationApi apiInstance = new ApplicationApi();
Pageable pageable = new Pageable(); // Pageable | 
Predicate predicate = new Predicate(); // Predicate | 
try {
    PageApplicationDto result = apiInstance.getAllManage(pageable, predicate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApplicationApi#getAllManage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pageable** | [**Pageable**](.md)|  |
 **predicate** | [**Predicate**](.md)|  |

### Return type

[**PageApplicationDto**](PageApplicationDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAllUsages"></a>
# **getAllUsages**
> PageUsageApplicationDto getAllUsages(id, pageable)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ApplicationApi;


ApplicationApi apiInstance = new ApplicationApi();
Long id = 789L; // Long | 
Pageable pageable = new Pageable(); // Pageable | 
try {
    PageUsageApplicationDto result = apiInstance.getAllUsages(id, pageable);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApplicationApi#getAllUsages");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |
 **pageable** | [**Pageable**](.md)|  |

### Return type

[**PageUsageApplicationDto**](PageUsageApplicationDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getAllWrite"></a>
# **getAllWrite**
> PageApplicationDto getAllWrite(pageable)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ApplicationApi;


ApplicationApi apiInstance = new ApplicationApi();
Pageable pageable = new Pageable(); // Pageable | 
try {
    PageApplicationDto result = apiInstance.getAllWrite(pageable);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApplicationApi#getAllWrite");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pageable** | [**Pageable**](.md)|  |

### Return type

[**PageApplicationDto**](PageApplicationDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getModeratorsFromApplication"></a>
# **getModeratorsFromApplication**
> List&lt;UserSimpleDto&gt; getModeratorsFromApplication(id)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ApplicationApi;


ApplicationApi apiInstance = new ApplicationApi();
Long id = 789L; // Long | 
try {
    List<UserSimpleDto> result = apiInstance.getModeratorsFromApplication(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApplicationApi#getModeratorsFromApplication");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |

### Return type

[**List&lt;UserSimpleDto&gt;**](UserSimpleDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUsersFromApplication"></a>
# **getUsersFromApplication**
> List&lt;UserSimpleDto&gt; getUsersFromApplication(id)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ApplicationApi;


ApplicationApi apiInstance = new ApplicationApi();
Long id = 789L; // Long | 
try {
    List<UserSimpleDto> result = apiInstance.getUsersFromApplication(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApplicationApi#getUsersFromApplication");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |

### Return type

[**List&lt;UserSimpleDto&gt;**](UserSimpleDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="importAll1"></a>
# **importAll1**
> importAll1()



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ApplicationApi;


ApplicationApi apiInstance = new ApplicationApi();
try {
    apiInstance.importAll1();
} catch (ApiException e) {
    System.err.println("Exception when calling ApplicationApi#importAll1");
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

<a name="removeApplication"></a>
# **removeApplication**
> removeApplication(appId)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ApplicationApi;


ApplicationApi apiInstance = new ApplicationApi();
Long appId = 789L; // Long | 
try {
    apiInstance.removeApplication(appId);
} catch (ApiException e) {
    System.err.println("Exception when calling ApplicationApi#removeApplication");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **Long**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="updateApplication"></a>
# **updateApplication**
> ApplicationDto updateApplication(body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ApplicationApi;


ApplicationApi apiInstance = new ApplicationApi();
ApplicationDto body = new ApplicationDto(); // ApplicationDto | 
try {
    ApplicationDto result = apiInstance.updateApplication(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApplicationApi#updateApplication");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ApplicationDto**](ApplicationDto.md)|  |

### Return type

[**ApplicationDto**](ApplicationDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

