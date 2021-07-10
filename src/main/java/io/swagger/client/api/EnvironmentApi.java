package io.swagger.client.api;

import io.swagger.client.ApiClient;

import org.joda.time.DateTime;
import io.swagger.client.model.EnvironnementCreationDto;
import io.swagger.client.model.EnvironnementDto;
import io.swagger.client.model.EnvironnementInfoDTO;
import io.swagger.client.model.PageEnvironnementDto;
import io.swagger.client.model.Pageable;
import io.swagger.client.model.Predicate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.util.UriComponentsBuilder;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-07-10T21:22:29.539Z[GMT]")@Component("io.swagger.client.api.EnvironmentApi")
public class EnvironmentApi {
    private ApiClient apiClient;

    public EnvironmentApi() {
        this(new ApiClient());
    }

    @Autowired
    public EnvironmentApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param body The body parameter
     * @return EnvironnementDto
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public EnvironnementDto addEnvironnement(EnvironnementCreationDto body) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling addEnvironnement");
        }
        String path = UriComponentsBuilder.fromPath("/environments").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "ebad-api-key", "jwt" };

        ParameterizedTypeReference<EnvironnementDto> returnType = new ParameterizedTypeReference<EnvironnementDto>() {};
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param env The env parameter
     * @param dateTraitement The dateTraitement parameter
     * @return String
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public String changeDateTraitement(Long env, DateTime dateTraitement) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'env' is set
        if (env == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'env' when calling changeDateTraitement");
        }
        // verify the required parameter 'dateTraitement' is set
        if (dateTraitement == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'dateTraitement' when calling changeDateTraitement");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("env", env);
        String path = UriComponentsBuilder.fromPath("/environments/dateTraitement/{env}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "dateTraitement", dateTraitement));

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "ebad-api-key", "jwt" };

        ParameterizedTypeReference<String> returnType = new ParameterizedTypeReference<String>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param idEnv The idEnv parameter
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void deleteEnvironnement(Long idEnv) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'idEnv' is set
        if (idEnv == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'idEnv' when calling deleteEnvironnement");
        }
        String path = UriComponentsBuilder.fromPath("/environments").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "idEnv", idEnv));

        final String[] accepts = {  };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "ebad-api-key", "jwt" };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param env The env parameter
     * @return EnvironnementDto
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public EnvironnementDto get1(Long env) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'env' is set
        if (env == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'env' when calling get1");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("env", env);
        String path = UriComponentsBuilder.fromPath("/environments/{env}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "ebad-api-key", "jwt" };

        ParameterizedTypeReference<EnvironnementDto> returnType = new ParameterizedTypeReference<EnvironnementDto>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param applicationId The applicationId parameter
     * @param predicate The predicate parameter
     * @param pageable The pageable parameter
     * @return PageEnvironnementDto
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PageEnvironnementDto getEnvironmentsFromApp(Long applicationId, Predicate predicate, Pageable pageable) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'applicationId' is set
        if (applicationId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'applicationId' when calling getEnvironmentsFromApp");
        }
        // verify the required parameter 'predicate' is set
        if (predicate == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'predicate' when calling getEnvironmentsFromApp");
        }
        // verify the required parameter 'pageable' is set
        if (pageable == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'pageable' when calling getEnvironmentsFromApp");
        }
        String path = UriComponentsBuilder.fromPath("/environments").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "applicationId", applicationId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "predicate", predicate));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "pageable", pageable));

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "ebad-api-key", "jwt" };

        ParameterizedTypeReference<PageEnvironnementDto> returnType = new ParameterizedTypeReference<PageEnvironnementDto>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param env The env parameter
     * @return EnvironnementInfoDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public EnvironnementInfoDTO getInfo(Long env) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'env' is set
        if (env == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'env' when calling getInfo");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("env", env);
        String path = UriComponentsBuilder.fromPath("/environments/info/{env}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "ebad-api-key", "jwt" };

        ParameterizedTypeReference<EnvironnementInfoDTO> returnType = new ParameterizedTypeReference<EnvironnementInfoDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @return List&lt;EnvironnementDto&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<EnvironnementDto> importAll() throws RestClientException {
        Object postBody = null;
        String path = UriComponentsBuilder.fromPath("/environments/import-all").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "ebad-api-key", "jwt" };

        ParameterizedTypeReference<List<EnvironnementDto>> returnType = new ParameterizedTypeReference<List<EnvironnementDto>>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param id The id parameter
     * @return List&lt;EnvironnementDto&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<EnvironnementDto> importEnvApp(Long id) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling importEnvApp");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/environments/import/application/{id}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "ebad-api-key", "jwt" };

        ParameterizedTypeReference<List<EnvironnementDto>> returnType = new ParameterizedTypeReference<List<EnvironnementDto>>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param body The body parameter
     * @return EnvironnementDto
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public EnvironnementDto updateEnvironnement(EnvironnementDto body) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling updateEnvironnement");
        }
        String path = UriComponentsBuilder.fromPath("/environments").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "ebad-api-key", "jwt" };

        ParameterizedTypeReference<EnvironnementDto> returnType = new ParameterizedTypeReference<EnvironnementDto>() {};
        return apiClient.invokeAPI(path, HttpMethod.PATCH, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
