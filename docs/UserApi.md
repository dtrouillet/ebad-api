# UserApi

All URIs are relative to *https://ebad.herokuapp.com/ebad*

Method | HTTP request | Description
------------- | ------------- | -------------
[**activateAccount**](UserApi.md#activateAccount) | **GET** /users/activate | 
[**changeApplicationAuthority**](UserApi.md#changeApplicationAuthority) | **PATCH** /users/application | 
[**changeRoles**](UserApi.md#changeRoles) | **PATCH** /users/roles | 
[**currentUser**](UserApi.md#currentUser) | **GET** /users/current | 
[**getAll**](UserApi.md#getAll) | **GET** /users | 
[**getUser**](UserApi.md#getUser) | **GET** /users/{login} | 
[**inactivateAccount**](UserApi.md#inactivateAccount) | **GET** /users/inactivate/{login} | 
[**saveUser**](UserApi.md#saveUser) | **PUT** /users | 
[**updateUser**](UserApi.md#updateUser) | **PATCH** /users | 

<a name="activateAccount"></a>
# **activateAccount**
> activateAccount(key)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UserApi;


UserApi apiInstance = new UserApi();
String key = "key_example"; // String | 
try {
    apiInstance.activateAccount(key);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#activateAccount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **key** | **String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="changeApplicationAuthority"></a>
# **changeApplicationAuthority**
> UserDto changeApplicationAuthority(body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UserApi;


UserApi apiInstance = new UserApi();
AuthorityApplicationDTO body = new AuthorityApplicationDTO(); // AuthorityApplicationDTO | 
try {
    UserDto result = apiInstance.changeApplicationAuthority(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#changeApplicationAuthority");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AuthorityApplicationDTO**](AuthorityApplicationDTO.md)|  |

### Return type

[**UserDto**](UserDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="changeRoles"></a>
# **changeRoles**
> UserDto changeRoles(body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UserApi;


UserApi apiInstance = new UserApi();
RolesDTO body = new RolesDTO(); // RolesDTO | 
try {
    UserDto result = apiInstance.changeRoles(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#changeRoles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RolesDTO**](RolesDTO.md)|  |

### Return type

[**UserDto**](UserDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="currentUser"></a>
# **currentUser**
> UserDto currentUser()



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UserApi;


UserApi apiInstance = new UserApi();
try {
    UserDto result = apiInstance.currentUser();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#currentUser");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**UserDto**](UserDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getAll"></a>
# **getAll**
> PageUserDto getAll(pageable, predicate)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UserApi;


UserApi apiInstance = new UserApi();
Pageable pageable = new Pageable(); // Pageable | 
Predicate predicate = new Predicate(); // Predicate | 
try {
    PageUserDto result = apiInstance.getAll(pageable, predicate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#getAll");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pageable** | [**Pageable**](.md)|  |
 **predicate** | [**Predicate**](.md)|  |

### Return type

[**PageUserDto**](PageUserDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUser"></a>
# **getUser**
> UserDto getUser(login)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UserApi;


UserApi apiInstance = new UserApi();
String login = "login_example"; // String | 
try {
    UserDto result = apiInstance.getUser(login);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#getUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **login** | **String**|  |

### Return type

[**UserDto**](UserDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="inactivateAccount"></a>
# **inactivateAccount**
> UserDto inactivateAccount(login)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UserApi;


UserApi apiInstance = new UserApi();
String login = "login_example"; // String | 
try {
    UserDto result = apiInstance.inactivateAccount(login);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#inactivateAccount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **login** | **String**|  |

### Return type

[**UserDto**](UserDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="saveUser"></a>
# **saveUser**
> UserDto saveUser(body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UserApi;


UserApi apiInstance = new UserApi();
UserAccountDto body = new UserAccountDto(); // UserAccountDto | 
try {
    UserDto result = apiInstance.saveUser(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#saveUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UserAccountDto**](UserAccountDto.md)|  |

### Return type

[**UserDto**](UserDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateUser"></a>
# **updateUser**
> UserDto updateUser(body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UserApi;


UserApi apiInstance = new UserApi();
UserDto body = new UserDto(); // UserDto | 
try {
    UserDto result = apiInstance.updateUser(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#updateUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UserDto**](UserDto.md)|  |

### Return type

[**UserDto**](UserDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

