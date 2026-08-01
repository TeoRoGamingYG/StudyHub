package com.example.studyhub.appengine.config;

import com.example.studyhub.openkm.auth.OKMAuth;
import com.example.studyhub.openkm.auth.OKMAuth_Service;
import com.example.studyhub.openkm.document.OKMDocument;
import com.example.studyhub.openkm.document.OKMDocument_Service;
import com.example.studyhub.openkm.folder.OKMFolder;
import com.example.studyhub.openkm.folder.OKMFolder_Service;
import jakarta.xml.ws.BindingProvider;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenKMConfig {

    @Value("${openkm.url}")
    private String openKmUrl;

    @Bean
    public OKMAuth okmAuth() {

        OKMAuth port = new OKMAuth_Service().getOKMAuthPort();

        ((BindingProvider) port).getRequestContext().put(
                BindingProvider.ENDPOINT_ADDRESS_PROPERTY,
                openKmUrl + "/services/OKMAuth"
        );

        return port;
    }

    @Bean
    public OKMFolder okmFolder() {

        OKMFolder port = new OKMFolder_Service().getOKMFolderPort();

        ((BindingProvider) port).getRequestContext().put(
                BindingProvider.ENDPOINT_ADDRESS_PROPERTY,
                openKmUrl + "/services/OKMFolder"
        );

        return port;
    }

    @Bean
    public OKMDocument okmDocument() {

        OKMDocument port = new OKMDocument_Service().getOKMDocumentPort();

        ((BindingProvider) port).getRequestContext().put(
                BindingProvider.ENDPOINT_ADDRESS_PROPERTY,
                openKmUrl + "/services/OKMDocument"
        );

        return port;
    }

}