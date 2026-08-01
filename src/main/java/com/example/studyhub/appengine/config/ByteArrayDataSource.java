package com.example.studyhub.appengine.config;

import jakarta.activation.DataSource;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class ByteArrayDataSource implements DataSource {

    private final byte[] data;
    private final String type;

    public ByteArrayDataSource(byte[] data, String type) {

        this.data = data;
        this.type = type;
    }

    @Override
    public InputStream getInputStream() {

        return new ByteArrayInputStream(data);
    }

    @Override
    public OutputStream getOutputStream() {

        throw new UnsupportedOperationException();
    }

    @Override
    public String getContentType() {

        return type;
    }

    @Override
    public String getName() {

        return "StudyHub";
    }
}