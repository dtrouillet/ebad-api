# EnvironmentApi

All URIs are relative to *https://ebad.herokuapp.com/ebad*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addEnvironnement**](EnvironmentApi.md#addEnvironnement) | **PUT** /environments | 
[**changeDateTraitement**](EnvironmentApi.md#changeDateTraitement) | **GET** /environments/dateTraitement/{env} | 
[**deleteEnvironnement**](EnvironmentApi.md#deleteEnvironnement) | **DELETE** /environments | 
[**get1**](EnvironmentApi.md#get1) | **GET** /environments/{env} | 
[**getEnvironmentsFromApp**](EnvironmentApi.md#getEnvironmentsFromApp) | **GET** /environments | 
[**getInfo**](EnvironmentApi.md#getInfo) | **GET** /environments/info/{env} | 
[**importAll**](EnvironmentApi.md#importAll) | **POST** /environments/import-all | 
[**importEnvApp**](EnvironmentApi.md#importEnvApp) | **POST** /environments/import/application/{id} | 
[**updateEnvironnement**](EnvironmentApi.md#updateEnvironnement) | **PATCH** /environments | 

<a name="addEnvironnement"></a>
# **addEnvironnement**
> EnvironnementDto addEnvironnement(body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.EnvironmentApi;


EnvironmentApi apiInstance = new EnvironmentApi();
EnvironnementCreationDto body = new EnvironnementCreationDto(); // EnvironnementCreationDto | 
try {
    EnvironnementDto result = apiInstance.addEnvironnement(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EnvironmentApi#addEnvironnement");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**EnvironnementCreationDto**](EnvironnementCreationDto.md)|  |

### Return type

[**EnvironnementDto**](EnvironnementDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="changeDateTraitement"></a>
# **changeDateTraitement**
> String changeDateTraitement(env, dateTraitement)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.EnvironmentApi;


EnvironmentApi apiInstance = new EnvironmentApi();
Long env = 789L; // Long | 
DateTime dateTraitement = new DateTime(); // DateTime | 
try {
    String result = apiInstance.changeDateTraitement(env, dateTraitement);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EnvironmentApi#changeDateTraitement");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **env** | **Long**|  |
 **dateTraitement** | **DateTime**|  |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteEnvironnement"></a>
# **deleteEnvironnement**
> deleteEnvironnement(idEnv)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.EnvironmentApi;


EnvironmentApi apiInstance = new EnvironmentApi();
Long idEnv = 789L; // Long | 
try {
    apiInstance.deleteEnvironnement(idEnv);
} catch (ApiException e) {
    System.err.println("Exception when calling EnvironmentApi#deleteEnvironnement");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **idEnv** | **Long**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="get1"></a>
# **get1**
> EnvironnementDto get1(env)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.EnvironmentApi;


EnvironmentApi apiInstance = new EnvironmentApi();
Long env = 789L; // Long | 
try {
    EnvironnementDto result = apiInstance.get1(env);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EnvironmentApi#get1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **env** | **Long**|  |

### Return type

[**EnvironnementDto**](EnvironnementDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getEnvironmentsFromApp"></a>
# **getEnvironmentsFromApp**
> PageEnvironnementDto getEnvironmentsFromApp(applicationId, predicate, pageable)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.EnvironmentApi;


EnvironmentApi apiInstance = new EnvironmentApi();
Long applicationId = 789L; // Long | 
Predicate predicate = new Predicate(); // Predicate | 
Pageable pageable = new Pageable(); // Pageable | 
try {
    PageEnvironnementDto result = apiInstance.getEnvironmentsFromApp(applicationId, predicate, pageable);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EnvironmentApi#getEnvironmentsFromApp");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **applicationId** | **Long**|  |
 **predicate** | [**Predicate**](.md)|  |
 **pageable** | [**Pageable**](.md)|  |

### Return type

[**PageEnvironnementDto**](PageEnvironnementDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getInfo"></a>
# **getInfo**
> EnvironnementInfoDTO getInfo(env)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.EnvironmentApi;


EnvironmentApi apiInstance = new EnvironmentApi();
Long env = 789L; // Long | 
try {
    EnvironnementInfoDTO result = apiInstance.getInfo(env);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EnvironmentApi#getInfo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **env** | **Long**|  |

### Return type

[**EnvironnementInfoDTO**](EnvironnementInfoDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="importAll"></a>
# **importAll**
> List&lt;EnvironnementDto&gt; importAll()



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.EnvironmentApi;


EnvironmentApi apiInstance = new EnvironmentApi();
try {
    List<EnvironnementDto> result = apiInstance.importAll();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EnvironmentApi#importAll");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;EnvironnementDto&gt;**](EnvironnementDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="importEnvApp"></a>
# **importEnvApp**
> List&lt;EnvironnementDto&gt; importEnvApp(id)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.EnvironmentApi;


EnvironmentApi apiInstance = new EnvironmentApi();
Long id = 789L; // Long | 
try {
    List<EnvironnementDto> result = apiInstance.importEnvApp(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EnvironmentApi#importEnvApp");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |

### Return type

[**List&lt;EnvironnementDto&gt;**](EnvironnementDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateEnvironnement"></a>
# **updateEnvironnement**
> EnvironnementDto updateEnvironnement(body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.EnvironmentApi;


EnvironmentApi apiInstance = new EnvironmentApi();
EnvironnementDto body = new EnvironnementDto(); // EnvironnementDto | 
try {
    EnvironnementDto result = apiInstance.updateEnvironnement(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EnvironmentApi#updateEnvironnement");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**EnvironnementDto**](EnvironnementDto.md)|  |

### Return type

[**EnvironnementDto**](EnvironnementDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

