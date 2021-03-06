/*
 * EBAD API
 * This documentation describe EBAD API.
 *
 * OpenAPI spec version: 2.7.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package fr.dtrouillet.api;

import io.swagger.client.model.BatchDto;
import io.swagger.client.model.FluxCurrentJobDto;
import io.swagger.client.model.JobDto;
import io.swagger.client.model.PageBatchDto;
import io.swagger.client.model.Pageable;
import io.swagger.client.model.Predicate;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for BatchApi
 */
@Ignore
public class BatchApiTest {

    private final BatchApi api = new BatchApi();

    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addBatchTest() {
        BatchDto body = null;
        BatchDto response = api.addBatch(body);

        // TODO: test validations
    }
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteBatchTest() {
        Long id = null;
        api.deleteBatch(id);

        // TODO: test validations
    }
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getByPredicateTest() {
        Predicate predicate = null;
        Pageable pageable = null;
        PageBatchDto response = api.getByPredicate(predicate, pageable);

        // TODO: test validations
    }
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void runBatchTest() {
        Long id = null;
        Long env = null;
        String param = null;
        JobDto response = api.runBatch(id, env, param);

        // TODO: test validations
    }
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void streamFluxTest() {
        Long id = null;
        FluxCurrentJobDto response = api.streamFlux(id);

        // TODO: test validations
    }
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateBatchTest() {
        BatchDto body = null;
        BatchDto response = api.updateBatch(body);

        // TODO: test validations
    }
}
