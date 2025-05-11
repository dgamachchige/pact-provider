package com.dilan.provider;

import au.com.dius.pact.provider.junit.Consumer;
import au.com.dius.pact.provider.junit.Provider;
import au.com.dius.pact.provider.junit.State;
import au.com.dius.pact.provider.junit.loader.PactBroker;
import au.com.dius.pact.provider.junit.target.Target;
import au.com.dius.pact.provider.junit.target.TestTarget;
import au.com.dius.pact.provider.spring.SpringRestPactRunner;
import au.com.dius.pact.provider.spring.target.SpringBootHttpTarget;
import com.dilan.provider.service.ProviderService;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(SpringRestPactRunner.class)
@Provider("provider")
@Consumer("consumer1")
@PactBroker(host = "localhost", port = "9292")
@SpringBootTest(classes = ProviderApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class Consumer1PactTest {

    @TestTarget
    public Target target = new SpringBootHttpTarget();

    @State("get str1 from consumer1")
    public void testGetStr1() {
        ProviderService providerMockService = mock(ProviderService.class);
        when(providerMockService.getStr1())
                .thenReturn("str1");
    }

}
