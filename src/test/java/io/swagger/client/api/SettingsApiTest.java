/*
 * Veritas Information Classifier (VIC)
 * APIs
 *
 * OpenAPI spec version: Resource Specific
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.ErrorResponse;
import io.swagger.client.model.Settings;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SettingsApi
 */
@Ignore
public class SettingsApiTest {

    private final SettingsApi api = new SettingsApi();

    
    /**
     * Get settings
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSettingsTest() throws ApiException {
        Settings response = api.getSettings();

        // TODO: test validations
    }
    
}
