package com.example.demo.domain;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class VersionTest {

    @Before
    public void setUp() throws Exception {
        Version.reset();
    }

    @Test
    public void should_return_1_0_0_when_get_ver() {
        String result = Version.getVerStr();
        assertThat(result).isEqualTo("1.0.0");
    }

    @Test
    public void should_add_minor_when_update_minor() {
        Version.updateMinor();
        String result = Version.getVerStr();
        assertThat(result).isEqualTo("1.1.0");
    }
}