package io.swagger.client.api;

import io.swagger.client.ApiClient;

import io.swagger.client.model.PageLogBatchDto;
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

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-07-04T22:32:11.845Z[GMT]")@Component("io.swagger.client.api.LogApi")
public class LogApi {
    private ApiClient apiClient;

    public LogApi() {
        this(new ApiClient());
    }

    @Autowired
    public LogApi(ApiClient apiClient) {
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
     * @param predicate The predicate parameter
     * @param pageable The pageable parameter
     * @return PageLogBatchDto
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PageLogBatchDto getAllLog(Predicate predicate, Pageable pageable) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'predicate' is set
        if (predicate == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'predicate' when calling getAllLog");
        }
        // verify the required parameter 'pageable' is set
        if (pageable == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'pageable' when calling getAllLog");
        }
        String path = UriComponentsBuilder.fromPath("/logs").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "predicate", predicate));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "pageable", pageable));

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "ebad-api-key", "jwt" };

        ParameterizedTypeReference<PageLogBatchDto> returnType = new ParameterizedTypeReference<PageLogBatchDto>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param env The env parameter
     * @param predicate The predicate parameter
     * @param pageable The pageable parameter
     * @return PageLogBatchDto
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PageLogBatchDto getAllLogFromEnv(Long env, Predicate predicate, Pageable pageable) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'env' is set
        if (env == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'env' when calling getAllLogFromEnv");
        }
        // verify the required parameter 'predicate' is set
        if (predicate == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'predicate' when calling getAllLogFromEnv");
        }
        // verify the required parameter 'pageable' is set
        if (pageable == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'pageable' when calling getAllLogFromEnv");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("env", env);
        String path = UriComponentsBuilder.fromPath("/logs/{env}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "predicate", predicate));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "pageable", pageable));

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "ebad-api-key", "jwt" };

        ParameterizedTypeReference<PageLogBatchDto> returnType = new ParameterizedTypeReference<PageLogBatchDto>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param env The env parameter
     * @param batch The batch parameter
     * @param predicate The predicate parameter
     * @param pageable The pageable parameter
     * @return PageLogBatchDto
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PageLogBatchDto getAllLogFromEnvBatch(Long env, Long batch, Predicate predicate, Pageable pageable) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'env' is set
        if (env == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'env' when calling getAllLogFromEnvBatch");
        }
        // verify the required parameter 'batch' is set
        if (batch == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'batch' when calling getAllLogFromEnvBatch");
        }
        // verify the required parameter 'predicate' is set
        if (predicate == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'predicate' when calling getAllLogFromEnvBatch");
        }
        // verify the required parameter 'pageable' is set
        if (pageable == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'pageable' when calling getAllLogFromEnvBatch");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("env", env);
        uriVariables.put("batch", batch);
        String path = UriComponentsBuilder.fromPath("/logs/{env}/{batch}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "predicate", predicate));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "pageable", pageable));

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "ebad-api-key", "jwt" };

        ParameterizedTypeReference<PageLogBatchDto> returnType = new ParameterizedTypeReference<PageLogBatchDto>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
