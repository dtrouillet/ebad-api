# ebad-java-client

EBAD API
- API version: 2.8.0
  - Build date: 2021-07-10T21:09:32.970Z[GMT]

This documentation describe EBAD API.


*Automatically generated by the [Swagger Codegen](https://github.com/swagger-api/swagger-codegen)*


## Requirements

Building the API client library requires:
1. Java 1.7+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>fr.icdc.ebad</groupId>
  <artifactId>ebad-java-client</artifactId>
  <version>2.7.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "fr.icdc.ebad:ebad-java-client:2.7.0"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/ebad-java-client-2.7.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java
import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.AccountApi;

import java.io.File;
import java.util.*;

public class AccountApiExample {

    public static void main(String[] args) {
        
        AccountApi apiInstance = new AccountApi();
        String key = "key_example"; // String | 
        try {
            String result = apiInstance.activateAccount1(key);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AccountApi#activateAccount1");
            e.printStackTrace();
        }
    }
}
import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.AccountApi;

import java.io.File;
import java.util.*;

public class AccountApiExample {

    public static void main(String[] args) {
        
        AccountApi apiInstance = new AccountApi();
        String body = "body_example"; // String | 
        try {
            apiInstance.changePassword(body);
        } catch (ApiException e) {
            System.err.println("Exception when calling AccountApi#changePassword");
            e.printStackTrace();
        }
    }
}
import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.AccountApi;

import java.io.File;
import java.util.*;

public class AccountApiExample {

    public static void main(String[] args) {
        
        AccountApi apiInstance = new AccountApi();
        try {
            UserAccountDto result = apiInstance.getAccount();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AccountApi#getAccount");
            e.printStackTrace();
        }
    }
}
import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.AccountApi;

import java.io.File;
import java.util.*;

public class AccountApiExample {

    public static void main(String[] args) {
        
        AccountApi apiInstance = new AccountApi();
        try {
            apiInstance.getCsrf();
        } catch (ApiException e) {
            System.err.println("Exception when calling AccountApi#getCsrf");
            e.printStackTrace();
        }
    }
}
import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.AccountApi;

import java.io.File;
import java.util.*;

public class AccountApiExample {

    public static void main(String[] args) {
        
        AccountApi apiInstance = new AccountApi();
        try {
            String result = apiInstance.isAuthenticated();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AccountApi#isAuthenticated");
            e.printStackTrace();
        }
    }
}
import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.AccountApi;

import java.io.File;
import java.util.*;

public class AccountApiExample {

    public static void main(String[] args) {
        
        AccountApi apiInstance = new AccountApi();
        UserAccountDto body = new UserAccountDto(); // UserAccountDto | 
        try {
            apiInstance.saveAccount(body);
        } catch (ApiException e) {
            System.err.println("Exception when calling AccountApi#saveAccount");
            e.printStackTrace();
        }
    }
}
```

## Documentation for API Endpoints

All URIs are relative to *https://ebad.herokuapp.com/ebad*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AccountApi* | [**activateAccount1**](docs/AccountApi.md#activateAccount1) | **GET** /activate | 
*AccountApi* | [**changePassword**](docs/AccountApi.md#changePassword) | **POST** /account/change_password | 
*AccountApi* | [**getAccount**](docs/AccountApi.md#getAccount) | **GET** /account | 
*AccountApi* | [**getCsrf**](docs/AccountApi.md#getCsrf) | **GET** /csrf | 
*AccountApi* | [**isAuthenticated**](docs/AccountApi.md#isAuthenticated) | **GET** /authenticate | 
*AccountApi* | [**saveAccount**](docs/AccountApi.md#saveAccount) | **POST** /account | 
*AccreditationRequestApi* | [**answerRequest**](docs/AccreditationRequestApi.md#answerRequest) | **POST** /accreditation-requests/response | 
*AccreditationRequestApi* | [**createAccreditationRequest**](docs/AccreditationRequestApi.md#createAccreditationRequest) | **PUT** /accreditation-requests | 
*AccreditationRequestApi* | [**findAll**](docs/AccreditationRequestApi.md#findAll) | **GET** /accreditation-requests/need-answer | 
*AccreditationRequestApi* | [**findAllMyRequest**](docs/AccreditationRequestApi.md#findAllMyRequest) | **GET** /accreditation-requests | 
*ApiTokenApi* | [**createToken**](docs/ApiTokenApi.md#createToken) | **PUT** /api-tokens | 
*ApiTokenApi* | [**deleteToken**](docs/ApiTokenApi.md#deleteToken) | **DELETE** /api-tokens/{id} | 
*ApiTokenApi* | [**findToken**](docs/ApiTokenApi.md#findToken) | **GET** /api-tokens | 
*ApplicationApi* | [**createApplication**](docs/ApplicationApi.md#createApplication) | **PUT** /applications/gestion | 
*ApplicationApi* | [**findApplication**](docs/ApplicationApi.md#findApplication) | **GET** /applications/search | 
*ApplicationApi* | [**getAll3**](docs/ApplicationApi.md#getAll3) | **GET** /applications | 
*ApplicationApi* | [**getAllManage**](docs/ApplicationApi.md#getAllManage) | **GET** /applications/gestion | 
*ApplicationApi* | [**getAllUsages**](docs/ApplicationApi.md#getAllUsages) | **GET** /applications/{id}/usages | 
*ApplicationApi* | [**getAllWrite**](docs/ApplicationApi.md#getAllWrite) | **GET** /applications/write | 
*ApplicationApi* | [**getModeratorsFromApplication**](docs/ApplicationApi.md#getModeratorsFromApplication) | **GET** /applications/moderators/{id} | 
*ApplicationApi* | [**getUsersFromApplication**](docs/ApplicationApi.md#getUsersFromApplication) | **GET** /applications/users/{id} | 
*ApplicationApi* | [**importAll1**](docs/ApplicationApi.md#importAll1) | **POST** /applications/import-all | 
*ApplicationApi* | [**removeApplication**](docs/ApplicationApi.md#removeApplication) | **DELETE** /applications/gestion | 
*ApplicationApi* | [**updateApplication**](docs/ApplicationApi.md#updateApplication) | **PATCH** /applications/gestion | 
*BatchApi* | [**addBatch**](docs/BatchApi.md#addBatch) | **PUT** /batchs | 
*BatchApi* | [**deleteBatch**](docs/BatchApi.md#deleteBatch) | **DELETE** /batchs/{id} | 
*BatchApi* | [**getByPredicate**](docs/BatchApi.md#getByPredicate) | **GET** /batchs | 
*BatchApi* | [**runBatch**](docs/BatchApi.md#runBatch) | **GET** /batchs/run/{id} | 
*BatchApi* | [**streamFlux**](docs/BatchApi.md#streamFlux) | **GET** /batchs/state/{id} | 
*BatchApi* | [**updateBatch**](docs/BatchApi.md#updateBatch) | **PATCH** /batchs | 
*ChainesApi* | [**addChaine**](docs/ChainesApi.md#addChaine) | **PUT** /chains | 
*ChainesApi* | [**getAllFromEnv2**](docs/ChainesApi.md#getAllFromEnv2) | **GET** /chains/env/{env} | 
*ChainesApi* | [**removeChaine**](docs/ChainesApi.md#removeChaine) | **DELETE** /chains/{id} | 
*ChainesApi* | [**runChaine**](docs/ChainesApi.md#runChaine) | **POST** /chains/{id}/run | 
*ChainesApi* | [**updateChaine**](docs/ChainesApi.md#updateChaine) | **PATCH** /chains | 
*DirectoryApi* | [**addDirectory**](docs/DirectoryApi.md#addDirectory) | **PUT** /directories | 
*DirectoryApi* | [**downloadFile**](docs/DirectoryApi.md#downloadFile) | **POST** /directories/files/read | 
*DirectoryApi* | [**getAllFromEnv1**](docs/DirectoryApi.md#getAllFromEnv1) | **GET** /directories/env/{env} | 
*DirectoryApi* | [**getFilesFromDirectory**](docs/DirectoryApi.md#getFilesFromDirectory) | **GET** /directories/files/{id} | 
*DirectoryApi* | [**removeDirectory**](docs/DirectoryApi.md#removeDirectory) | **POST** /directories/delete | 
*DirectoryApi* | [**removeFileFromDirectory**](docs/DirectoryApi.md#removeFileFromDirectory) | **POST** /directories/files/delete | 
*DirectoryApi* | [**updateDirectory**](docs/DirectoryApi.md#updateDirectory) | **PATCH** /directories | 
*DirectoryApi* | [**uploadFile**](docs/DirectoryApi.md#uploadFile) | **POST** /directories/files/upload | 
*EnvironmentApi* | [**addEnvironnement**](docs/EnvironmentApi.md#addEnvironnement) | **PUT** /environments | 
*EnvironmentApi* | [**changeDateTraitement**](docs/EnvironmentApi.md#changeDateTraitement) | **GET** /environments/dateTraitement/{env} | 
*EnvironmentApi* | [**deleteEnvironnement**](docs/EnvironmentApi.md#deleteEnvironnement) | **DELETE** /environments | 
*EnvironmentApi* | [**get1**](docs/EnvironmentApi.md#get1) | **GET** /environments/{env} | 
*EnvironmentApi* | [**getEnvironmentsFromApp**](docs/EnvironmentApi.md#getEnvironmentsFromApp) | **GET** /environments | 
*EnvironmentApi* | [**getInfo**](docs/EnvironmentApi.md#getInfo) | **GET** /environments/info/{env} | 
*EnvironmentApi* | [**importAll**](docs/EnvironmentApi.md#importAll) | **POST** /environments/import-all | 
*EnvironmentApi* | [**importEnvApp**](docs/EnvironmentApi.md#importEnvApp) | **POST** /environments/import/application/{id} | 
*EnvironmentApi* | [**updateEnvironnement**](docs/EnvironmentApi.md#updateEnvironnement) | **PATCH** /environments | 
*GlobalSettingApi* | [**getAllSettings**](docs/GlobalSettingApi.md#getAllSettings) | **GET** /global-settings | 
*GlobalSettingApi* | [**getValue**](docs/GlobalSettingApi.md#getValue) | **GET** /global-settings/{key} | 
*GlobalSettingApi* | [**setValue**](docs/GlobalSettingApi.md#setValue) | **POST** /global-settings/{key} | 
*IdentityApi* | [**addIdentity**](docs/IdentityApi.md#addIdentity) | **PUT** /identities | 
*IdentityApi* | [**deleteIdentity**](docs/IdentityApi.md#deleteIdentity) | **DELETE** /identities/{identityId} | 
*IdentityApi* | [**getAllIdentities**](docs/IdentityApi.md#getAllIdentities) | **GET** /identities | 
*IdentityApi* | [**getOneIdentity**](docs/IdentityApi.md#getOneIdentity) | **GET** /identities/{id} | 
*IdentityApi* | [**updateIdentity**](docs/IdentityApi.md#updateIdentity) | **PATCH** /identities | 
*JobRunrApi* | [**restartJobRunr**](docs/JobRunrApi.md#restartJobRunr) | **POST** /jobrunr/restart | 
*JwtApi* | [**authorize**](docs/JwtApi.md#authorize) | **POST** /authenticate | 
*LogApi* | [**getAllLog**](docs/LogApi.md#getAllLog) | **GET** /logs | 
*LogApi* | [**getAllLogFromEnv**](docs/LogApi.md#getAllLogFromEnv) | **GET** /logs/{env} | 
*LogApi* | [**getAllLogFromEnvBatch**](docs/LogApi.md#getAllLogFromEnvBatch) | **GET** /logs/{env}/{batch} | 
*LogApi* | [**getLogFromJobId**](docs/LogApi.md#getLogFromJobId) | **GET** /logs/job/{jobId} | 
*NewApi* | [**delete2**](docs/NewApi.md#delete2) | **DELETE** /news/{id} | 
*NewApi* | [**getActualityPublished**](docs/NewApi.md#getActualityPublished) | **GET** /news/public | 
*NewApi* | [**getAll2**](docs/NewApi.md#getAll2) | **GET** /news | 
*NewApi* | [**getOne1**](docs/NewApi.md#getOne1) | **GET** /news/{id} | 
*NewApi* | [**save1**](docs/NewApi.md#save1) | **PUT** /news | 
*NewApi* | [**update1**](docs/NewApi.md#update1) | **PATCH** /news | 
*NormsApi* | [**delete1**](docs/NormsApi.md#delete1) | **DELETE** /norms/{id} | 
*NormsApi* | [**getAll1**](docs/NormsApi.md#getAll1) | **GET** /norms | 
*NormsApi* | [**getAllForList**](docs/NormsApi.md#getAllForList) | **GET** /norms/name | 
*NormsApi* | [**getOne**](docs/NormsApi.md#getOne) | **GET** /norms/{id} | 
*NormsApi* | [**save**](docs/NormsApi.md#save) | **PUT** /norms | 
*NormsApi* | [**update**](docs/NormsApi.md#update) | **PATCH** /norms | 
*NotificationsApi* | [**getUnreadNotification**](docs/NotificationsApi.md#getUnreadNotification) | **GET** /notifications | 
*NotificationsApi* | [**markAsReadNotification**](docs/NotificationsApi.md#markAsReadNotification) | **PATCH** /notifications | 
*SchedulingApi* | [**addScheduling**](docs/SchedulingApi.md#addScheduling) | **PUT** /schedulings | 
*SchedulingApi* | [**delete**](docs/SchedulingApi.md#delete) | **DELETE** /schedulings/{schedulingId} | 
*SchedulingApi* | [**get**](docs/SchedulingApi.md#get) | **GET** /schedulings/{schedulingId} | 
*SchedulingApi* | [**listAll**](docs/SchedulingApi.md#listAll) | **GET** /schedulings | 
*SchedulingApi* | [**listByEnvironment**](docs/SchedulingApi.md#listByEnvironment) | **GET** /schedulings/env/{environmentId} | 
*StatisticsApi* | [**getGeneralStatistiques**](docs/StatisticsApi.md#getGeneralStatistiques) | **GET** /statistics | 
*TypeFichierApi* | [**addTypeFichier**](docs/TypeFichierApi.md#addTypeFichier) | **PUT** /file-kinds | 
*TypeFichierApi* | [**getAllFromEnv**](docs/TypeFichierApi.md#getAllFromEnv) | **GET** /file-kinds/application/{app} | 
*TypeFichierApi* | [**removeTypeFichier**](docs/TypeFichierApi.md#removeTypeFichier) | **POST** /file-kinds/delete | 
*TypeFichierApi* | [**updateTypeFichier**](docs/TypeFichierApi.md#updateTypeFichier) | **PATCH** /file-kinds | 
*UserApi* | [**activateAccount**](docs/UserApi.md#activateAccount) | **GET** /users/activate | 
*UserApi* | [**changeApplicationAuthority**](docs/UserApi.md#changeApplicationAuthority) | **PATCH** /users/application | 
*UserApi* | [**changeRoles**](docs/UserApi.md#changeRoles) | **PATCH** /users/roles | 
*UserApi* | [**currentUser**](docs/UserApi.md#currentUser) | **GET** /users/current | 
*UserApi* | [**getAll**](docs/UserApi.md#getAll) | **GET** /users | 
*UserApi* | [**getUser**](docs/UserApi.md#getUser) | **GET** /users/{login} | 
*UserApi* | [**inactivateAccount**](docs/UserApi.md#inactivateAccount) | **GET** /users/inactivate/{login} | 
*UserApi* | [**saveUser**](docs/UserApi.md#saveUser) | **PUT** /users | 
*UserApi* | [**updateUser**](docs/UserApi.md#updateUser) | **PATCH** /users | 

## Documentation for Models

 - [AccreditationRequestDto](docs/AccreditationRequestDto.md)
 - [ActualiteDto](docs/ActualiteDto.md)
 - [ApiTokenDto](docs/ApiTokenDto.md)
 - [ApiTokenWithKeyDto](docs/ApiTokenWithKeyDto.md)
 - [ApplicationDto](docs/ApplicationDto.md)
 - [ApplicationSimpleDto](docs/ApplicationSimpleDto.md)
 - [AuthorityApplicationDTO](docs/AuthorityApplicationDTO.md)
 - [AuthorityDto](docs/AuthorityDto.md)
 - [BatchDto](docs/BatchDto.md)
 - [BatchEnvironnementDto](docs/BatchEnvironnementDto.md)
 - [BatchLogDto](docs/BatchLogDto.md)
 - [Body](docs/Body.md)
 - [ChaineAssociationBatchDto](docs/ChaineAssociationBatchDto.md)
 - [ChaineAssociationDto](docs/ChaineAssociationDto.md)
 - [ChaineDto](docs/ChaineDto.md)
 - [ChaineSimpleDto](docs/ChaineSimpleDto.md)
 - [CompleteIdentityDto](docs/CompleteIdentityDto.md)
 - [CreationAccreditationRequestDto](docs/CreationAccreditationRequestDto.md)
 - [CreationSchedulingDto](docs/CreationSchedulingDto.md)
 - [DirectoryDto](docs/DirectoryDto.md)
 - [EnvironnementCreationDto](docs/EnvironnementCreationDto.md)
 - [EnvironnementDto](docs/EnvironnementDto.md)
 - [EnvironnementInfoDTO](docs/EnvironnementInfoDTO.md)
 - [FilesDto](docs/FilesDto.md)
 - [FluxCurrentJobDto](docs/FluxCurrentJobDto.md)
 - [GlobalSettingKeyValueDto](docs/GlobalSettingKeyValueDto.md)
 - [GlobalSettingValueDto](docs/GlobalSettingValueDto.md)
 - [JobDto](docs/JobDto.md)
 - [JobStateDto](docs/JobStateDto.md)
 - [LogBatchDto](docs/LogBatchDto.md)
 - [LoginDto](docs/LoginDto.md)
 - [NormLabelIdDto](docs/NormLabelIdDto.md)
 - [NormeDto](docs/NormeDto.md)
 - [NotificationDto](docs/NotificationDto.md)
 - [PageAccreditationRequestDto](docs/PageAccreditationRequestDto.md)
 - [PageActualiteDto](docs/PageActualiteDto.md)
 - [PageApiTokenDto](docs/PageApiTokenDto.md)
 - [PageApplicationDto](docs/PageApplicationDto.md)
 - [PageApplicationSimpleDto](docs/PageApplicationSimpleDto.md)
 - [PageBatchDto](docs/PageBatchDto.md)
 - [PageChaineDto](docs/PageChaineDto.md)
 - [PageDirectoryDto](docs/PageDirectoryDto.md)
 - [PageEnvironnementDto](docs/PageEnvironnementDto.md)
 - [PageLogBatchDto](docs/PageLogBatchDto.md)
 - [PageNormLabelIdDto](docs/PageNormLabelIdDto.md)
 - [PageNormeDto](docs/PageNormeDto.md)
 - [PagePublicIdentityDto](docs/PagePublicIdentityDto.md)
 - [PageSchedulingDto](docs/PageSchedulingDto.md)
 - [PageTypeFichierDto](docs/PageTypeFichierDto.md)
 - [PageUsageApplicationDto](docs/PageUsageApplicationDto.md)
 - [PageUserDto](docs/PageUserDto.md)
 - [Pageable](docs/Pageable.md)
 - [Predicate](docs/Predicate.md)
 - [PublicIdentityDto](docs/PublicIdentityDto.md)
 - [ResponseAccreditationRequestDto](docs/ResponseAccreditationRequestDto.md)
 - [RolesDTO](docs/RolesDTO.md)
 - [SchedulingDto](docs/SchedulingDto.md)
 - [Sort](docs/Sort.md)
 - [StatisticByDayDto](docs/StatisticByDayDto.md)
 - [StatisticsDto](docs/StatisticsDto.md)
 - [TypeFichierDto](docs/TypeFichierDto.md)
 - [UsageApplicationDto](docs/UsageApplicationDto.md)
 - [UsageApplicationSimpleDto](docs/UsageApplicationSimpleDto.md)
 - [UserAccountDto](docs/UserAccountDto.md)
 - [UserDto](docs/UserDto.md)
 - [UserPublicDto](docs/UserPublicDto.md)
 - [UserSimpleDto](docs/UserSimpleDto.md)

## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author


