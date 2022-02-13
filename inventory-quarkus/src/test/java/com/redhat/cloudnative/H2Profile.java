package com.redhat.cloudnative;

import java.util.Map;

import io.quarkus.test.junit.QuarkusTestProfile;

public class H2Profile implements QuarkusTestProfile {

    @Override
    public Map<String, String> getConfigOverrides() {
        return Map.of("quarkus.datasource.db-kind", "h2",
                      "quarkus.datasource.jdbc.url", "jdbc:h2:mem:test");
    }

}
