# TypeFichierApi

All URIs are relative to *https://ebad.herokuapp.com/ebad*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addTypeFichier**](TypeFichierApi.md#addTypeFichier) | **PUT** /file-kinds | 
[**getAllFromEnv**](TypeFichierApi.md#getAllFromEnv) | **GET** /file-kinds/application/{app} | 
[**removeTypeFichier**](TypeFichierApi.md#removeTypeFichier) | **POST** /file-kinds/delete | 
[**updateTypeFichier**](TypeFichierApi.md#updateTypeFichier) | **PATCH** /file-kinds | 

<a name="addTypeFichier"></a>
# **addTypeFichier**
> TypeFichierDto addTypeFichier(body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TypeFichierApi;


TypeFichierApi apiInstance = new TypeFichierApi();
TypeFichierDto body = new TypeFichierDto(); // TypeFichierDto | 
try {
    TypeFichierDto result = apiInstance.addTypeFichier(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TypeFichierApi#addTypeFichier");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**TypeFichierDto**](TypeFichierDto.md)|  |

### Return type

[**TypeFichierDto**](TypeFichierDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAllFromEnv"></a>
# **getAllFromEnv**
> PageTypeFichierDto getAllFromEnv(pageable, predicate, app)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TypeFichierApi;


TypeFichierApi apiInstance = new TypeFichierApi();
Pageable pageable = new Pageable(); // Pageable | 
Predicate predicate = new Predicate(); // Predicate | 
Long app = 789L; // Long | 
try {
    PageTypeFichierDto result = apiInstance.getAllFromEnv(pageable, predicate, app);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TypeFichierApi#getAllFromEnv");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pageable** | [**Pageable**](.md)|  |
 **predicate** | [**Predicate**](.md)|  |
 **app** | **Long**|  |

### Return type

[**PageTypeFichierDto**](PageTypeFichierDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="removeTypeFichier"></a>
# **removeTypeFichier**
> removeTypeFichier(body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TypeFichierApi;


TypeFichierApi apiInstance = new TypeFichierApi();
TypeFichierDto body = new TypeFichierDto(); // TypeFichierDto | 
try {
    apiInstance.removeTypeFichier(body);
} catch (ApiException e) {
    System.err.println("Exception when calling TypeFichierApi#removeTypeFichier");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**TypeFichierDto**](TypeFichierDto.md)|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="updateTypeFichier"></a>
# **updateTypeFichier**
> TypeFichierDto updateTypeFichier(body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TypeFichierApi;


TypeFichierApi apiInstance = new TypeFichierApi();
TypeFichierDto body = new TypeFichierDto(); // TypeFichierDto | 
try {
    TypeFichierDto result = apiInstance.updateTypeFichier(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TypeFichierApi#updateTypeFichier");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**TypeFichierDto**](TypeFichierDto.md)|  |

### Return type

[**TypeFichierDto**](TypeFichierDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

