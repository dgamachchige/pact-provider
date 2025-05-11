package com.dilan.provider;

import au.com.dius.pact.provider.junit.Consumer;
import au.com.dius.pact.provider.junit.Provider;
import au.com.dius.pact.provider.junit.State;
import au.com.dius.pact.provider.junit.loader.PactBroker;
import com.dilan.provider.service.ProviderService;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@Provider("provider")
@Consumer("consumer2")
@PactBroker(host = "localhost", port = "9292")
public class Consumer2PactTest {

    @State("get str2 from consumer2")
    public void testGetStr2() {

    }

}
