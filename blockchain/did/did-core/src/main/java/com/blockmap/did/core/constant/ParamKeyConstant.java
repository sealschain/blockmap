/*
 *       Copyright© (2020) blockmap Co., Ltd.
 *
 *       This file is part of did-core.
 *
 *       did-core is free software: you can redistribute it and/or modify
 *       it under the terms of the GNU Lesser General Public License as published by
 *       the Free Software Foundation, either version 3 of the License, or
 *       (at your option) any later version.
 *
 *       did-core is distributed in the hope that it will be useful,
 *       but WITHOUT ANY WARRANTY; without even the implied warranty of
 *       MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *       GNU Lesser General Public License for more details.
 *
 *       You should have received a copy of the GNU Lesser General Public License
 *       along with did-core.  If not, see <https://www.gnu.org/licenses/>.
 */


package com.blockmap.did.core.constant;

/**
 * @Author: admin@xuzhijun.com.cn
 * @Description: Define param key names to be allowed to enable calls to Java SDK.
 * @File: ParamKeyConstant
 * @Version: 1.0.0
 * @Date: 2019/12/15 20:22
 */

public final class ParamKeyConstant {

    /**
     * Universal param key names.
     */
    public static final String DID = "did";

    /**
     * DidService related param names.
     */
    public static final String PUBLIC_KEY = "publicKey";

    /**
     * AuthorityIssuer related param names.
     */
    public static final String AUTHORITY_ISSUER_NAME = "name";

    /**
     * CptService related param names.
     */
    public static final String CPT_JSON_SCHEMA = "cptJsonSchema";
    public static final String CPT_SIGNATURE = "cptSignature";
    public static final String CPT = "Cpt";

    /**
     * CredentialService related param names.
     */
    public static final String CPT_ID = "cptId";
    public static final String ISSUER = "issuer";
    public static final String CLAIM = "claim";
    public static final String EXPIRATION_DATE = "expirationDate";
    public static final String CREDENTIAL_SIGNATURE = "signature";
    public static final String CONTEXT = "context";
    public static final String CREDENTIAL_ID = "id";
    public static final String ISSUANCE_DATE = "issuanceDate";
    public static final String POLICY = "Policy";
    public static final String POLICY_PACKAGE = "com.blockmap.did.cpt.policy.";

    /**
     * proof key.
     */
    public static final String PROOF = "proof";
    public static final String PROOF_SIGNATURE = "signatureValue";
    public static final String PROOF_TYPE = "type";
    public static final String PROOF_CREATED = "created";
    public static final String PROOF_CREATOR = "creator";
    public static final String PROOF_SALT = "salt";
    public static final String PROOF_VERIFICATION_METHOD = "verificationMethod";
    public static final String PROOF_NONCE = "nonce";
    public static final String PROOF_VERIFICATIONREQUEST = "verificationRequest";
    public static final String PROOF_ENCODEDVERIFICATIONRULE = "encodedVerificationRule";

    /**
     * 秘钥存储KEY.
     */
    public static final String KEY_DATA = "keyData";
    public static final String KEY_VERIFIERS = "verifiers";
    public static final String KEY_EXPIRE = "expirationDate";
    public static final String MASTER_SECRET = "masterSecret";
    public static final String BLINDING_FACTORS = "credentialSecretsBlindingFactors";


}