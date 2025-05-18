package com.example.design.patterns.creational.builder;

import java.util.HashMap;
import java.util.Map;

public class HttpRequest {
    private String method;
    private String url;
    private Map<String, String> headers;
    private Map<String, String> queryParams;
    private String body;
    private Integer timeout;

    public HttpRequest(HttpRequestBuilder httpRequestBuilder) {
        this.method = httpRequestBuilder.method;
        this.url = httpRequestBuilder.url;
        this.headers = httpRequestBuilder.headers;
        this.queryParams = httpRequestBuilder.queryParams;
        this.body = httpRequestBuilder.body;
        this.timeout = httpRequestBuilder.timeout;
    }

    public static class HttpRequestBuilder {
        private String method;
        private String url;
        private final Map<String, String> headers = new HashMap<>();
        private final Map<String, String> queryParams = new HashMap<>();
        private String body;
        private Integer timeout;

        public HttpRequestBuilder method(String method) {
            this.method = method;
            return this;
        }

        public HttpRequestBuilder url(String url) {
            this.url = url;
            return this;
        }

        public HttpRequestBuilder addHeader(String key, String value) {
            this.headers.put(key, value);
            return this;
        }

        public HttpRequestBuilder addQueryParam(String key, String value) {
            this.queryParams.put(key, value);
            return this;
        }

        public HttpRequestBuilder body(String body) {
            this.body = body;
            return this;
        }

        public HttpRequestBuilder timeout(Integer timeout) {
            this.timeout = timeout;
            return this;
        }

        public HttpRequest build() {
            if(this.method == null) {
                this.method = "GET";
            }
            return new HttpRequest(this);
        }
    }

    @Override
    public String toString() {
        return "HttpRequest{" +
                "method='" + method + '\'' +
                ", url='" + url + '\'' +
                ", headers=" + headers +
                ", queryParams=" + queryParams +
                ", body='" + body + '\'' +
                ", timeout=" + timeout +
                '}';
    }
}
