package com.webauthn4j.test.authenticator.model;

import com.webauthn4j.test.authenticator.AuthenticatorExtensionInput;
import com.webauthn4j.test.client.*;

import java.util.List;
import java.util.Map;

public class MakeCredentialRequest {

    private byte[] hash;
    private PublicKeyCredentialRpEntity rpEntity;
    private PublicKeyCredentialUserEntity userEntity;
    private boolean requireResidentKey;
    private boolean requireUserPresence;
    private boolean requireUserVerification;
    private List<PublicKeyCredentialParameters> credTypesAndPublicKeyAlgs;
    private List<PublicKeyCredentialDescriptor> excludeCredentialDescriptorList;
    private Map<String, AuthenticatorExtensionInput> extensions;

    public byte[] getHash() {
        return hash;
    }

    public void setHash(byte[] hash) {
        this.hash = hash;
    }

    public PublicKeyCredentialRpEntity getRpEntity() {
        return rpEntity;
    }

    public void setRpEntity(PublicKeyCredentialRpEntity rpEntity) {
        this.rpEntity = rpEntity;
    }

    public PublicKeyCredentialUserEntity getUserEntity() {
        return userEntity;
    }

    public void setUserEntity(PublicKeyCredentialUserEntity userEntity) {
        this.userEntity = userEntity;
    }

    public boolean isRequireResidentKey() {
        return requireResidentKey;
    }

    public void setRequireResidentKey(boolean requireResidentKey) {
        this.requireResidentKey = requireResidentKey;
    }

    public boolean isRequireUserPresence() {
        return requireUserPresence;
    }

    public void setRequireUserPresence(boolean requireUserPresence) {
        this.requireUserPresence = requireUserPresence;
    }

    public boolean isRequireUserVerification() {
        return requireUserVerification;
    }

    public void setRequireUserVerification(boolean requireUserVerification) {
        this.requireUserVerification = requireUserVerification;
    }

    public List<PublicKeyCredentialParameters> getCredTypesAndPublicKeyAlgs() {
        return credTypesAndPublicKeyAlgs;
    }

    public void setCredTypesAndPublicKeyAlgs(List<PublicKeyCredentialParameters> credTypesAndPublicKeyAlgs) {
        this.credTypesAndPublicKeyAlgs = credTypesAndPublicKeyAlgs;
    }

    public List<PublicKeyCredentialDescriptor> getExcludeCredentialDescriptorList() {
        return excludeCredentialDescriptorList;
    }

    public void setExcludeCredentialDescriptorList(List<PublicKeyCredentialDescriptor> excludeCredentialDescriptorList) {
        this.excludeCredentialDescriptorList = excludeCredentialDescriptorList;
    }

    public Map<String, AuthenticatorExtensionInput> getExtensions() {
        return extensions;
    }

    public void setExtensions(Map<String, AuthenticatorExtensionInput> extensions) {
        this.extensions = extensions;
    }
}
