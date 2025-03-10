package org.gitlab4j.api.models;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.gitlab4j.models.Constants;
import org.gitlab4j.models.utils.JacksonJson;

public class DeployToken implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;
    private String name;
    private String username;
    private Date expiresAt;
    private List<Constants.DeployTokenScope> scopes;
    private String token;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getExpiresAt() {
        return expiresAt;
    }

    public void setExpiresAt(Date expiresAt) {
        this.expiresAt = expiresAt;
    }

    public List<Constants.DeployTokenScope> getScopes() {
        return scopes;
    }

    public void setScopes(List<Constants.DeployTokenScope> scopes) {
        this.scopes = scopes;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Override
    public String toString() {
        return JacksonJson.toJsonString(this);
    }
}
