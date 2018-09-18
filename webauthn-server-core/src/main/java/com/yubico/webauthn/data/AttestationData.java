package com.yubico.webauthn.data;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NonNull;
import lombok.Value;

@Value
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Builder
public class AttestationData {

    /**
     * The AAGUID of the authenticator.
     */
    @NonNull
    private final ByteArray aaguid;

    /**
     * The ID of the attested credential.
     */
    @NonNull
    private final ByteArray credentialId;

    /**
     * The ''credential public key'' encoded in COSE_Key format.
     *
     * @todo verify requirements https://www.w3.org/TR/webauthn/#sec-attestation-data
     */
    @NonNull
    private final ByteArray credentialPublicKey;

}
