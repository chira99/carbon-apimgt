/*
 *  Copyright (c) 2021, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 *  WSO2 Inc. licenses this file to you under the Apache License,
 *  Version 2.0 (the "License"); you may not use this file except
 *  in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.carbon.apimgt.impl;

import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.xml.namespace.QName;

/**
 * This class represents the constants that are used for APIManager implementation
 */
public final class APIConstants {

    public static final String STRING = "string";
    public static final String OBJECT = "object";
    //key value of the provider rxt
    public static final String PROVIDER_KEY = "provider";

    //key value of the APIImpl rxt
    public static final String API_KEY = "api";

    public static final String VERSION_PLACEHOLDER = "{version}";

    //governance registry apimgt root location
    public static final String APIMGT_REGISTRY_LOCATION = "/apimgt";

    public static final String POLICY_ENABLED_FOR_ANALYTICS = "policyEnabled";

    public static final String API_CONTEXT_ID = "api.context.id";
    //This is the resource name of API
    public static final String API_RESOURCE_NAME = "/api";

    //Association between documentation and its content
    public static final String DOCUMENTATION_CONTENT_ASSOCIATION = "hasContent";

    public static final String DOCUMENTATION_FILE_ASSOCIATION = "hasFile";

    public static final String DOCUMENTATION_KEY = "document";

    //association type between provider and APIImpl
    public static final String PROVIDER_ASSOCIATION = "provides";

    //association type between API and Documentation
    public static final String DOCUMENTATION_ASSOCIATION = "document";

    //registry location of providers
    public static final String PROVIDERS_PATH = "/providers";

    public static final String API_LIFE_CYCLE_HISTORY =
            "/repository/components/org.wso2.carbon.governance/lifecycles/history";

    public static final String API_APPLICATION_DATA_LOCATION = APIMGT_REGISTRY_LOCATION + "/applicationdata";

    // Registry location where descriptions and thumbnails of the tags are
    // stored.
    public static final String TAGS_INFO_ROOT_LOCATION = API_APPLICATION_DATA_LOCATION + "/tags";

    //registry location of API
    public static final String API_LOCATION = API_APPLICATION_DATA_LOCATION + "/provider";

    public static final String API_REVISION_LOCATION = API_APPLICATION_DATA_LOCATION + "/apis";

    public static final String COMMERCIAL_TIER_PLAN = "COMMERCIAL";

    public static final int TIER_API_TYPE = 0;

    public static final int TIER_RESOURCE_TYPE = 1;

    public static final int TIER_APPLICATION_TYPE = 2;

    public static final String APPLICATION_JSON_MEDIA_TYPE = "application/json";

    public static final String APPLICATION_XML_MEDIA_TYPE = "application/xml";

    public static final String APPLICATION_WSDL_MEDIA_TYPE = "application/wsdl";

    public static final String APPLICATION_XML_SOAP_MEDIA_TYPE = "application/soap+xml";

    public static final String WSDL_NAMESPACE_URI = "http://www.w3.org/2005/08/addressing";

    public static final String WSDL_ELEMENT_LOCAL_NAME = "Address";

    public static final String API_TENANT_CONF = "tenant-conf.json";

    public static final String API_TENANT_CONF_LOCATION = API_APPLICATION_DATA_LOCATION + "/" + API_TENANT_CONF;

    public static final String API_TENANT_CONF_MEDIA_TYPE = "tenant-config";
    public static final String TENANT_CONFIG_CACHE_NAME = "tenantConfigCache";

    public static final String API_MAX_REVISION_COUNT_PROPERTY_NAME = "ApiMaxRevisionCount";

    public static final String RESOURCE_FOLDER_LOCATION = "repository" + File.separator + "resources";

    public static final String API_TENANT_CONF_ENABLE_MONITZATION_KEY = "EnableMonetization";

    public static final String API_TENANT_CONF_DEFAULT_ROLES = "DefaultRoles";
    public static final String API_TENANT_CONF_DEFAULT_ROLES_ROLENAME = "RoleName";
    public static final String API_TENANT_CONF_DEFAULT_ROLES_CREATE_ON_TENANT_LOAD = "CreateOnTenantLoad";
    public static final String API_TENANT_CONF_DEFAULT_ROLES_PUBLISHER_ROLE = "PublisherRole";
    public static final String API_TENANT_CONF_DEFAULT_ROLES_CREATOR_ROLE = "CreatorRole";
    public static final String API_TENANT_CONF_DEFAULT_ROLES_SUBSCRIBER_ROLE = "SubscriberRole";
    public static final String API_TENANT_CONF_DEFAULT_ROLES_DEVOPS_ROLE = "DevOpsRole";
    public static final String API_TENANT_CONF_DEFAULT_ROLES_OBSERVER_ROLE = "ObserverRole";
    public static final String API_TENANT_CONF_DEFAULT_ROLES_INTEGRATIONDEVELOPER_ROLE = "IntegrationDeveloperRole";
    public static final String ANALYTICS_ROLE = "Internal/analytics";
    public static final String API_TENANT_CONF_ENABLE_ANONYMOUS_MODE = "EnableAnonymous";

    public static final String ENDPOINT_REGISTRY_ADMIN_ROLE = "Internal/registry_admin";
    public static final String ENDPOINT_REGISTRY_USER_ROLE = "Internal/registry_user";
    public static final String ENDPOINT_REGISTRY_BROWSER_ROLE = "Internal/registry_browser";

    public static final String API_TENANT_CONF_IS_UNLIMITED_TIER_PAID = "IsUnlimitedTierPaid";

    public static final String API_TENANT_CONF_DEFAULT_API_TIER = "DefaultAPILevelTier";
    public static final String API_TENANT_CONF_DEFAULT_APPLICATION_TIER = "DefaultApplicationLevelTier";
    public static final String API_TENANT_CONF_DEFAULT_SUBSCRIPTION_TIER = "DefaultSubscriptionLevelTier";

    public static final String API_TENANT_CONF_EXPOSE_ENDPOINT_PASSWORD = "ExposeEndpointPassword";
    public static final String API_TENANT_CONF_ALLOW_SUBSCRIPTION_VALIDATION_DISABLING
            = "AllowSubscriptionValidationDisabling";

    public static final String API_CATEGORY_FREE = "Free";

    public static final String API_CATEGORY_FREEMIUM = "Freemium";

    public static final String API_CATEGORY_PAID = "Paid";

    public static final String SSL_VERIFY_CLIENT = "SSLVerifyClient";

    public static final String SSL_VERIFY_CLIENT_STATUS_REQUIRE = "require";

    //location for custom url domain mapings. "<tenant-id>" will be replaced by actual tenant name.
    public static final String API_DOMAIN_MAPPINGS = "/customurl/api-cloud/<tenant-id>/urlMapping/<tenant-id>";
    public static final String API_DOMAIN_MAPPING_TENANT_ID_IDENTIFIER = "<tenant-id>";
    //domain mapping app keys
    public static final String API_DOMAIN_MAPPINGS_GATEWAY = "gateway";
    public static final String API_DOMAIN_MAPPINGS_STORE = "store";
    public static final String API_DOMAIN_MAPPINGS_PUBLISHER = "publisher";
    public static final String API_DOMAIN_MAPPINGS_CONTEXT = "context";
    public static final String API_DOMAIN_MAPPINGS_LOGIN_CALLBACK = "login";
    public static final String API_DOMAIN_MAPPINGS_LOGOUT_CALLBACK = "logout";

    public static final String API_IMAGE_LOCATION = API_APPLICATION_DATA_LOCATION + "/icons";

    //registry location for consumer
    public static final String API_ROOT_LOCATION = API_APPLICATION_DATA_LOCATION + "/provider";

    //registry location for API documentation
    public static final String API_DOC_LOCATION = API_APPLICATION_DATA_LOCATION + "/api-docs";

    public static final String API_DOC_1_2_LOCATION = "1.2";

    //registry location for Custom sequences
    public static final String API_CUSTOM_SEQUENCE_LOCATION = APIMGT_REGISTRY_LOCATION + "/customsequences";

    public static final String API_CUSTOM_INSEQUENCE_LOCATION = API_CUSTOM_SEQUENCE_LOCATION + "/in/";

    public static final String API_CUSTOM_OUTSEQUENCE_LOCATION = API_CUSTOM_SEQUENCE_LOCATION + "/out/";

    public static final String API_CUSTOM_FAULTSEQUENCE_LOCATION = API_CUSTOM_SEQUENCE_LOCATION + "/fault/";

    // registry location for secure vault passwords
    public static final String API_SYSTEM_CONFIG_SECURE_VAULT_LOCATION = "/repository/components/secure-vault";

    // registry location of the governance component
    public static final String GOVERNANCE_COMPONENT_REGISTRY_LOCATION = "/repository/components/org.wso2.carbon" +
            ".governance";

    // registry location for OpenAPI files
    public static final String OPENAPI_ARCHIVES_TEMP_FOLDER = "OPENAPI-archives";
    public static final String OPENAPI_EXTRACTED_DIRECTORY = "extracted";
    public static final String OPENAPI_ARCHIVE_ZIP_FILE = "openapi-archive.zip";
    public static final String OPENAPI_MASTER_JSON = "swagger.json";
    public static final String OPENAPI_MASTER_YAML = "swagger.yaml";

    // registry location for wsdl files
    public static final String API_WSDL_RESOURCE_LOCATION = API_APPLICATION_DATA_LOCATION + "/wsdls/";
    public static final String API_WSDL_RESOURCE = API_APPLICATION_DATA_LOCATION + "/wsdls";
    public static final String WSDL_FILE_EXTENSION = ".wsdl";
    public static final String WSDL_PROVIDER_SEPERATOR = "--";
    public static final String API_WSDL_ARCHIVE_LOCATION = "archives/";
    public static final String API_WSDL_EXTRACTED_DIRECTORY = "extracted";
    public static final String WSDL_ARCHIVES_TEMP_FOLDER = "WSDL-archives";
    public static final String WSDL_ARCHIVE_ZIP_FILE = "wsdl-archive.zip";
    public static final String WSDL_ARCHIVE_UPDATED_ZIP_FILE = "wsdl-archive-updated.zip";
    public static final String WSDL_FILE = "wsdlFile";
    public static final String UPDATED_WSDL_ZIP = "updated.zip";
    public static final String FILE_URI_PREFIX = "file://";
    public static final String API_DOC_RESOURCE_NAME = "api-doc.json";

    public static final String WSDL_VERSION_11 = "1.1";
    public static final String WSDL_VERSION_20 = "2.0";

    public static final String API_DOC_1_2_RESOURCE_NAME = "/api-doc";
    public static final String API_OAS_DEFINITION_RESOURCE_NAME = "swagger.json";
    public static final String API_ASYNCAPI_DEFINITION_RESOURCE_NAME = "asyncapi.json";

    public static final String API_ICON_IMAGE = "icon";

    public static final String API_GLOBAL_VISIBILITY = "public";
    public static final String VISIBILITY = "visibility";

    public static final String API_RESTRICTED_VISIBILITY = "restricted";
    public static final String API_RESTRICTED_BY_ORG = "restricted_by_org";

    public static final String API_PRIVATE_VISIBILITY = "private";

    public static final String API_CONTROLLED_VISIBILITY = "controlled";
    public static final String DOC_API_BASED_VISIBILITY = "API_LEVEL";
    public static final String DOC_OWNER_VISIBILITY = "OWNER_ONLY";
    public static final String DOC_SHARED_VISIBILITY = "PRIVATE";

    public static final String EXTERNAL_API_STORES_LOCATION =
            APIMGT_REGISTRY_LOCATION + "/externalstores/external-api-stores.xml";

    public static final String EXTERNAL_API_DEVPORTAL_URL_REGEX = "^./devportal$";

    public static final String GA_CONFIGURATION_LOCATION = APIMGT_REGISTRY_LOCATION + "/statistics/ga-config.xml";

    public static final String GA_CONF_KEY = "ga-config-key";
    public static final String GA_CONF_MEDIA_TYPE = "ga-config";

    public static final String WORKFLOW_EXECUTOR_LOCATION = API_APPLICATION_DATA_LOCATION + "/workflow-extensions.xml";

    public static final String WORKFLOW_MEDIA_TYPE = "workflow-config";

    // Constants used in API Security Audit feature
    // For configs
    public static final String API_SECURITY_AUDIT = "APISecurityAudit.";
    public static final String API_SECURITY_AUDIT_API_TOKEN = API_SECURITY_AUDIT + "APIToken";
    public static final String API_SECURITY_AUDIT_CID = API_SECURITY_AUDIT + "CollectionID";
    public static final String API_SECURITY_AUDIT_BASE_URL = API_SECURITY_AUDIT + "BaseUrl";
    public static final String API_SECURITY_AUDIT_GLOBAL = API_SECURITY_AUDIT + "Global";

    public static final String SECURITY_AUDIT_CONFIGURATION = "SecurityAuditConfig";
    public static final String SECURITY_AUDIT_API_TOKEN = "apiToken";
    public static final String SECURITY_AUDIT_COLLECTION_ID = "collectionId";
    public static final String SECURITY_AUDIT_BASE_URL = "baseUrl";
    public static final String SECURITY_AUDIT_OVERRIDE_GLOBAL = "overrideGlobal";
    // For HTTP requests
    public static final String HEADER_ACCEPT = "Accept";
    public static final String HEADER_CONTENT_TYPE = "Content-Type";
    public static final String HEADER_CONTENT_LENGTH = "Content-Length";
    public static final String HEADER_API_TOKEN = "X-API-KEY";
    public static final String HEADER_USER_AGENT = "User-Agent";
    public static final String MULTIPART_FORM_BOUNDARY = "X-WSO2-BOUNDARY";
    public static final String MULTIPART_LINE_FEED = "\r\n";
    public static final String BASE_AUDIT_URL = "https://platform.42crunch.com/api/v1/apis";
    public static final String MULTIPART_CONTENT_TYPE = "multipart/form-data; boundary=";
    public static final String USER_AGENT_APIM = "WSO2-APIM";
    public static final String DATA = "data";
    public static final String ATTR = "attr";
    public static final String GRADE = "grade";
    public static final String NUM_ERRORS = "numErrors";
    public static final String DESC = "desc";
    public static final String ID = "id";
    public static final String IS_VALID = "isValid";
    public static final String ASSESSMENT_REPORT = "/assessmentreport?";

    //registry resource containing the self signup user config
    public static final String SELF_SIGN_UP_NAME = "SelfSignUp";

    public static final String DOCUMENTATION_SEARCH_PATH_FIELD = "path";

    public static final String DOCUMENTATION_SEARCH_MEDIA_TYPE_FIELD = "mediaType";

    public static final String DOCUMENTATION_INLINE_CONTENT_TYPE = "text/plain";

    public static final String DOCUMENTATION_RESOURCE_MAP_DATA = "Data";
    public static final String DOCUMENTATION_RESOURCE_MAP_CONTENT_TYPE = "contentType";
    public static final String DOCUMENTATION_RESOURCE_MAP_NAME = "name";

    public static final String SYNAPSE_NAMESPACE = "http://ws.apache.org/ns/synapse";
    // Those constance are used in API artifact.
    public static final String API_OVERVIEW_NAME = "overview_name";
    public static final String API_OVERVIEW_TYPE = "overview_type";
    public static final String API_OVERVIEW_VERSION = "overview_version";
    public static final String API_OVERVIEW_VERSION_COMPARABLE = "overview_versionComparable";
    public static final String API_OVERVIEW_VERSION_TYPE = "overview_versionType";
    public static final String API_OVERVIEW_IS_DEFAULT_VERSION = "overview_isDefaultVersion";
    public static final String API_OVERVIEW_CONTEXT = "overview_context";
    public static final String API_OVERVIEW_CONTEXT_TEMPLATE = "overview_contextTemplate";
    public static final String API_OVERVIEW_DESCRIPTION = "overview_description";
    public static final String API_OVERVIEW_WSDL = "overview_wsdl";
    public static final String API_OVERVIEW_WADL = "overview_wadl";
    public static final String API_OVERVIEW_PROVIDER = "overview_provider";
    public static final String API_OVERVIEW_THUMBNAIL_URL = "overview_thumbnail";
    public static final String API_OVERVIEW_STATUS = "overview_status";
    public static final String API_OVERVIEW_TIER = "overview_tier";
    public static final String API_OVERVIEW_ORGANIZATION_TIERS = "overview_organizationTiers";
    public static final String API_OVERVIEW_SUB_POLICY = "overview_subPolicy";
    public static final String API_OVERVIEW_API_POLICY = "overview_apiPolicy";
    public static final String API_OVERVIEW_IS_LATEST = "overview_isLatest";
    public static final String API_URI_TEMPLATES = "uriTemplates_entry";
    public static final String API_OVERVIEW_TEC_OWNER = "overview_technicalOwner";
    public static final String API_OVERVIEW_TEC_OWNER_EMAIL = "overview_technicalOwnerEmail";
    public static final String API_OVERVIEW_BUSS_OWNER = "overview_businessOwner";
    public static final String API_OVERVIEW_BUSS_OWNER_EMAIL = "overview_businessOwnerEmail";
    public static final String API_OVERVIEW_VISIBILITY = "overview_visibility";
    public static final String API_OVERVIEW_VISIBLE_ROLES = "overview_visibleRoles";
    public static final String API_OVERVIEW_VISIBLE_TENANTS = "overview_visibleTenants";
    public static final String API_OVERVIEW_ENVIRONMENTS = "overview_environments";
    public static final String API_PROVIDER = "Provider";
    public static final String API_NAME = "Name";
    public static final String API_VERSION_LABEL = "Version";
    public static final String API_OVERVIEW_GATEWAY_VENDOR = "overview_gatewayVendor";
    public static final String API_CONTEXT = "Context";
    public static final String API_DESCRIPTION = "Description";
    public static final String API_OVERVIEW_TAG = "tags";
    public static final String API_TAG = "Tag";
    public static final String API_STATUS = "STATUS";
    public static final String API_URI_PATTERN = "URITemplate_urlPattern";
    public static final String API_URI_HTTP_METHOD = "URITemplate_httpVerb";
    public static final String API_URI_AUTH_TYPE = "URITemplate_authType";
    public static final String API_URI_MEDIATION_SCRIPT = "URITemplate_mediationScript";
    public static final String API_OVERVIEW_ENDPOINT_SECURED = "overview_endpointSecured";
    public static final String API_OVERVIEW_ENDPOINT_AUTH_DIGEST = "overview_endpointAuthDigest";
    public static final String API_OVERVIEW_ENDPOINT_USERNAME = "overview_endpointUsername";
    public static final String API_OVERVIEW_ENDPOINT_PASSWORD = "overview_endpointPpassword";
    public static final String API_OVERVIEW_ENDPOINT_PASSWORD_ALT = "overview_endpointPassword";
    public static final String API_OVERVIEW_TRANSPORTS = "overview_transports";
    public static final String API_OVERVIEW_INSEQUENCE = "overview_inSequence";
    public static final String API_OVERVIEW_OUTSEQUENCE = "overview_outSequence";
    public static final String API_OVERVIEW_FAULTSEQUENCE = "overview_faultSequence";
    public static final String API_OVERVIEW_AUTHORIZATION_HEADER = "overview_authorizationHeader";
    public static final String API_OVERVIEW_API_KEY_HEADER = "overview_apiKeyHeader";
    public static final String API_OVERVIEW_API_SECURITY = "overview_apiSecurity";
    public static final String API_OVERVIEW_WS_URI_MAPPING = "overview_wsUriMapping";
    public static final String AUTHORIZATION_HEADER_BASIC = "Basic";
    public static final String DEFAULT_API_SECURITY_OAUTH2 = "oauth2";
    public static final String API_SECURITY_MUTUAL_SSL = "mutualssl";
    public static final String API_SECURITY_BASIC_AUTH = "basic_auth";
    public static final String SWAGGER_API_SECURITY_BASIC_AUTH_TYPE = "basic";
    public static final String API_SECURITY_API_KEY = "api_key";
    public static final String API_SECURITY_MUTUAL_SSL_MANDATORY = "mutualssl_mandatory";

    public static final String API_SECURITY_MUTUAL_SSL_OPTIONAL = "mutualssl_optional";
    public static final String API_SECURITY_OAUTH_BASIC_AUTH_API_KEY_MANDATORY = "oauth_basic_auth_api_key_mandatory";

    public static final String API_SECURITY_OAUTH_BASIC_AUTH_API_KEY_OPTIONAL = "oauth_basic_auth_api_key_optional";
    public static final String CERTIFICATE_COMMON_NAME = "CN";
    public static final List<String> APPLICATION_LEVEL_SECURITY = Arrays.asList("basic_auth", "api_key", "oauth2");
    public static final String BEGIN_CERTIFICATE_STRING = "-----BEGIN CERTIFICATE-----";
    public static final String END_CERTIFICATE_STRING = "-----END CERTIFICATE-----";

    public static final String API_RELATED_CUSTOM_PROPERTIES_SURFIX = "__display";

    public static final String API_OVERVIEW_RESPONSE_CACHING = "overview_responseCaching";
    public static final String API_OVERVIEW_CACHE_TIMEOUT = "overview_cacheTimeout";

    public static final String PROTOTYPE_OVERVIEW_IMPLEMENTATION = "overview_implementation";
    public static final String API_PRODUCTION_THROTTLE_MAXTPS = "overview_productionTps";
    public static final String API_SANDBOX_THROTTLE_MAXTPS = "overview_sandboxTps";
    public static final String API_BACKEND_THROTTLE_TIMEUNIT_SECOND = "SECOND";
    public static final String API_BACKEND_THROTTLE_TIMEUNIT_SECOND_MS = "1000";
    public static final String API_BACKEND_THROTTLE_TIMEUNIT_MINUTE = "MINUTE";
    public static final String API_BACKEND_THROTTLE_TIMEUNIT_MINUTE_MS = "60000";
    public static final String API_BACKEND_THROTTLE_TIMEUNIT_HOUR = "HOUR";
    public static final String API_BACKEND_THROTTLE_TIMEUNIT_HOUR_MS = "3600000";

    public static final String IMPLEMENTATION_TYPE_ENDPOINT = "ENDPOINT";
    public static final String IMPLEMENTATION_TYPE_INLINE = "INLINE";
    public static final String IMPLEMENTATION_TYPE_MARKDOWN = "MARKDOWN";
    public static final String IMPLEMENTATION_TYPE_FILE = "FILE";

    public static final String API_OVERVIEW_REDIRECT_URL = "overview_redirectURL";
    public static final String API_OVERVIEW_EXTERNAL_PRODUCTION_ENDPOINT = "overview_apiExternalProductionEndpoint";
    public static final String API_OVERVIEW_EXTERNAL_SANDBOX_ENDPOINT = "overview_apiExternalSandboxEndpoint";
    public static final String API_OVERVIEW_OWNER = "overview_apiOwner";
    public static final String API_OVERVIEW_ADVERTISE_ONLY = "overview_advertiseOnly";
    public static final String API_OVERVIEW_ENDPOINT_CONFIG = "overview_endpointConfig";

    public static final String API_OVERVIEW_SUBSCRIPTION_AVAILABILITY = "overview_subscriptionAvailability";
    public static final String API_OVERVIEW_SUBSCRIPTION_AVAILABLE_TENANTS = "overview_tenants";

    public static final String API_OVERVIEW_DESTINATION_BASED_STATS_ENABLED = "overview_destinationStatsEnabled";
    public static final String API_OVERVIEW_WEBSOCKET = "overview_ws";

    //This constant is used in Json schema validator
    public static final String API_OVERVIEW_ENABLE_JSON_SCHEMA = "overview_enableSchemaValidation";

    public static final String API_OVERVIEW_ENABLE_STORE = "overview_enableStore";

    public static final String API_OVERVIEW_TESTKEY = "overview_testKey";

    //Those constance are used in Provider artifact.
    public static final String PROVIDER_OVERVIEW_NAME = "overview_name";
    public static final String PROVIDER_OVERVIEW_EMAIL = "overview_email";
    public static final String PROVIDER_OVERVIEW_DESCRIPTION = "overview_description";

    public static final String API_LABELS_GATEWAY_LABELS = "labels_labelName";
    public static final String LABEL_NAME = "labelName";
    public static final String LABEL_DESCRIPTION = "labelDescription";
    public static final String LABEL_ACCESS_URLS = "accessURLs";
    public static final String LABEL = "label";

    //database columns for Subscriber
    public static final String SUBSCRIBER_FIELD_EMAIL_ADDRESS = "EMAIL_ADDRESS";
    public static final String SUBSCRIBER_FIELD_USER_ID = "USER_ID";
    public static final String SUBSCRIBER_FIELD_DATE_SUBSCRIBED = "DATE_SUBSCRIBED";

    //tables columns for subscription
    public static final String SUBSCRIPTION_FIELD_SUBSCRIPTION_ID = "SUBSCRIPTION_ID";
    public static final String SUBSCRIPTION_FIELD_TIER_ID = "TIER_ID";
    public static final String SUBSCRIPTION_FIELD_TIER_ID_PENDING = "TIER_ID_PENDING";
    public static final String SUBSCRIPTION_FIELD_API_ID = "API_ID";
    public static final String SUBSCRIPTION_FIELD_ACCESS_TOKEN = "ACCESS_TOKEN";
    public static final String SUBSCRIPTION_FIELD_SUB_STATUS = "SUB_STATUS";

    public static final String SUBSCRIPTION_KEY_TYPE = "KEY_TYPE";
    public static final String SUBSCRIPTION_USER_TYPE = "USER_TYPE";
    public static final String ACCESS_TOKEN_USER_TYPE_APPLICATION = "APPLICATION";
    public static final String USER_TYPE_END_USER = "END_USER";
    public static final String REFRESH_TOKEN_TYPE = "Refresh";
    public static final String FIELD_API_NAME = "API_NAME";
    public static final String FIELD_API_VERSION = "API_VERSION";
    public static final String FIELD_CONSUMER_KEY = "CONSUMER_KEY";
    public static final String FIELD_API_PUBLISHER = "API_PROVIDER";

    //table columns for AM_APPLICATION
    public static final String APPLICATION_ID = "APPLICATION_ID";
    public static final String APPLICATION_NAME = "NAME";
    public static final String APPLICATION_CREATED_BY = "CREATED_BY";
    public static final String APPLICATION_SUBSCRIBER_ID = "SUBSCRIBER_ID";
    public static final String APPLICATION_TIER = "APPLICATION_TIER";
    public static final String APPLICATION_STATUS = "APPLICATION_STATUS";

    //IDENTITY OAUTH2 table
    public static final String IDENTITY_OAUTH2_FIELD_TOKEN_STATE = "TOKEN_STATE";
    public static final String IDENTITY_OAUTH2_FIELD_TOKEN_SCOPE = "TOKEN_SCOPE";
    public static final String IDENTITY_OAUTH2_FIELD_AUTHORIZED_USER = "AUTHZ_USER";
    public static final String IDENTITY_OAUTH2_FIELD_TIME_CREATED = "TIME_CREATED";
    public static final String IDENTITY_OAUTH2_FIELD_VALIDITY_PERIOD = "VALIDITY_PERIOD";
    public static final String IDENTITY_OAUTH2_FIELD_USER_DOMAIN = "USER_DOMAIN";
    public static final String DOT = ".";
    public static final String DEFAULT = "DEFAULT";
    public static final String API_KEY_AUTH_TYPE = "API_KEY";
    public static final String API_KEY_AUTH = "API-KEY";
    public static final String EXP = "exp";
    public static final String JWT = "JWT";
    public static final String JWT_DEFAULT_AUDIENCE = "http://org.wso2.apimgt/gateway";
    public static final String JWT_CONFIGS = "JWTConfiguration";
    public static final String JWT_HEADER = "JWTHeader";
    public static final String JWT_DECODING = "JWTDecoding";
    public static final String ENABLE_USER_CLAIMS = "EnableUserClaims";
    public static final String BINDING_FEDERATED_USER_CLAIMS = "EnableBindingFederatedUserClaims";
    public static final String TOKEN_GENERATOR_IMPL = "JWTGeneratorImpl";
    public static final String ENABLE_JWT_GENERATION = "EnableJWTGeneration";
    public static final String Enable_JWKS_API = "EnableJWKSApi";
    public static final String CLAIMS_RETRIEVER_CLASS = "ClaimsRetrieverImplClass";
    public static final String USE_KID = "UseKidProperty";
    public static final String CONSUMER_DIALECT_URI = "ConsumerDialectURI";
    public static final String JWT_SIGNATURE_ALGORITHM = "SignatureAlgorithm";
    public static final String USE_SHA256_HASH = "UseSHA256Hash";

    public static final String X5T_PARAMETER = "x5t";
    public static final String X5T256_PARAMETER = "x5t#S256";
    public static final String GATEWAY_JWT_GENERATOR = "GatewayJWTGeneration";
    public static final String GATEWAY_JWT_GENERATOR_IMPL = "ImplClass";
    public static final String ENCODE_X5T_WITHOUT_PADDING = "EncodeX5tWithoutPadding";
    public static final String TOKEN_ISSUERS = "TokenIssuers";
    public static final String GATEWAY_JWT_CONFIGURATION = "Configuration";
    public static final String GATEWAY_JWT_GENERATOR_CLAIMS = "ExcludedClaims";
    public static final String ENABLE_BASE64_PADDING = "EnableBase64Padding";
    public static final String GATEWAY_JWT_GENERATOR_CLAIM = "Claim";
    public static final String CONVERT_CLAIMS_TO_CONSUMER_DIALECT = JWT_CONFIGS + ".ConvertClaimsToConsumerDialect";

    public static final String MEDIATOR_CONFIG = "MediatorConfigs.";
    public static final String OAUTH_CONFIGS = "OAuthConfigurations.";
    public static final String AUTHORIZATION_HEADER = "AuthorizationHeader";
    public static final String API_KEY_HEADER = "ApiKeyHeader";
    public static final String API_SECURITY = "APISecurity";
    public static final String API_LEVEL_POLICY = "APILevelPolicy";
    public static final String CERTIFICATE_INFORMATION = "CertificateInformation";
    public static final String AUTHORIZATION_HEADER_DEFAULT = "Authorization";
    public static final String API_KEY_HEADER_DEFAULT = "ApiKey";
    public static final String HEADER_TENANT = "xWSO2Tenant";
    public static final String X_WSO2_TENANT_HEADER = "X-WSO2-Tenant";
    public static final String AUTHORIZATION_QUERY_PARAM_DEFAULT = "access_token";
    public static final String API_KEY_HEADER_QUERY_PARAM = "apikey";
    public static final String REMOVE_OAUTH_HEADER_FROM_OUT_MESSAGE = "RemoveOAuthHeadersFromOutMessage";
    public static final String REMOVE_OAUTH_HEADER_FROM_OUT_MESSAGE_DEFAULT = "true";
    public static final String REMOVE_OAUTH_HEADERS_FROM_MESSAGE = OAUTH_CONFIGS + "RemoveOAuthHeadersFromOutMessage";
    public static final String APPLICATION_TOKEN_SCOPE = OAUTH_CONFIGS + "ApplicationTokenScope";
    public static final String ALLOWED_SCOPES = OAUTH_CONFIGS + "AllowedScopes.Scope";
    public static final String TOKEN_ENDPOINT_NAME = OAUTH_CONFIGS + "TokenEndPointName";
    public static final String REVOKE_API_URL = OAUTH_CONFIGS + "RevokeAPIURL";
    public static final String ENCRYPT_TOKENS_ON_PERSISTENCE = OAUTH_CONFIGS + "EncryptPersistedTokens";
    public static final String HASH_TOKENS_ON_PERSISTENCE = OAUTH_CONFIGS + "EnableTokenHashMode";
    public static final String TOKEN_ENDPOINT_CONTEXT = OAUTH_CONFIGS + "TokenEndPointName";
    public static final String REVOKE_ENDPOINT_CONTEXT = OAUTH_CONFIGS + "RevokeEndpointName";
    public static final String ENABLE_REVOKE_TOKEN_CLEANUP = OAUTH_CONFIGS + "EnableRevokeTokenCleanup";
    public static final String DEFAULT_MODIFIED_ENDPOINT_PASSWORD = "*****"; //5 stars
    public static final String REGISTRY_HIDDEN_ENDPOINT_PROPERTY = "registry.HiddenEpProperty";
    public static final String OVERVIEW_ELEMENT = "overview";
    public static final String ENDPOINT_PASSWORD_ELEMENT = "endpointPpassword";
    public static final String ENDPOINT_PASSWORD_ELEMENT_ALT = "endpointPassword";
    public static final String FEDERATED_USER = "FEDERATED";
    public static final String ENABLE_CERTIFICATE_BOUND_ACCESS_TOKEN = OAUTH_CONFIGS + "EnableCertificateBoundAccessToken";
    public static final String DIGEST = "x5t#S256";
    public static final String CNF = "cnf";
    public static final String HASHING = "Hashing";
    public static final String HASGING_ALGORITHM= "HashingAlgorithm";

    // Constants related to AI features: API chat, Marketplace Assistant, Guardrails
    public static class AI {
        public static final String AI = "AI";
        public static final String API_CHAT = "APIChat";
        public static final String ENABLED = "Enabled";
        public static final String API_CHAT_AUTH_TOKEN = "AuthToken";
        public static final String API_CHAT_KEY = "Key";
        public static final String API_CHAT_ENDPOINT = "Endpoint";
        public static final String API_CHAT_TOKEN_ENDPOINT = "TokenEndpoint";
        public static final String RESOURCES = "Resources";
        public static final String API_CHAT_PREPARE_RESOURCE = "PrepareResource";
        public static final String API_CHAT_EXECUTE_RESOURCE = "ExecuteResource";
        public static final String API_CHAT_ACTION_PREPARE = "PREPARE";
        public static final String API_CHAT_ACTION_EXECUTE = "EXECUTE";
        public static final String API_CHAT_REQUEST_ID = "apiChatRequestId";

        public static final String MARKETPLACE_ASSISTANT = "MarketplaceAssistant";
        public static final String MARKETPLACE_ASSISTANT_ENABLED = "Enabled";
        public static final String MARKETPLACE_ASSISTANT_AUTH_TOKEN = "AuthToken";
        public static final String MARKETPLACE_ASSISTANT_KEY = "Key";
        public static final String MARKETPLACE_ASSISTANT_ENDPOINT = "Endpoint";
        public static final String MARKETPLACE_ASSISTANT_TOKEN_ENDPOINT = "TokenEndpoint";
        public static final String MARKETPLACE_ASSISTANT_CHAT_RESOURCE = "ChatResource";
        public static final String MARKETPLACE_ASSISTANT_PUBLISH_API_RESOURCE = "ApiPublishResource";
        public static final String MARKETPLACE_ASSISTANT_DELETE_API_RESOURCE = "ApiDeleteResource";
        public static final String MARKETPLACE_ASSISTANT_API_COUNT_RESOURCE = "ApiCountResource";
        public static final String AI_CONFIGURATION = "AiConfiguration";
        public static final String AI_CONFIGURATION_FAILOVER_CONFIGURATIONS = "FailoverConfigurations";
        public static final String AI_CONFIGURATION_ROUND_ROBIN_CONFIGURATIONS = "RoundRobinConfigurations";
        public static final String AI_CONFIGURATION_FAILOVER_CONFIGURATIONS_FAILOVER_ENDPOINTS_LIMIT =
                "FailoverEndpointsLimit";
        public static final String AI_CONFIGURATION_DEFAULT_REQUEST_TIMEOUT = "DefaultRequestTimout";

        public static final String DESIGN_ASSISTANT = "DesignAssistant";
        public static final String DESIGN_ASSISTANT_ENABLED = "Enabled";
        public static final String DESIGN_ASSISTANT_AUTH_TOKEN = "AuthToken";
        public static final String DESIGN_ASSISTANT_KEY = "Key";
        public static final String DESIGN_ASSISTANT_ENDPOINT = "Endpoint";
        public static final String DESIGN_ASSISTANT_TOKEN_ENDPOINT = "TokenEndpoint";
        public static final String DESIGN_ASSISTANT_CHAT_RESOURCE = "ChatResource";
        public static final String DESIGN_ASSISTANT_GEN_API_PAYLOAD_RESOURCE = "GenApiPayloadResource";

        public static final String OPENAI_EMBEDDING_PROVIDER_TYPE = "openai";
        public static final String AZURE_OPENAI_EMBEDDING_PROVIDER_TYPE = "azure-openai";
        public static final String MISTRAL_EMBEDDING_PROVIDER_TYPE = "mistral";
        public static final String EMBEDDING_PROVIDER = "EmbeddingProvider";
        public static final String EMBEDDING_PROVIDER_TYPE = "type";
        public static final String EMBEDDING_PROVIDER_PROPERTY = "Property";
        public static final String EMBEDDING_PROVIDER_PROPERTY_KEY = "name";
        public static final String EMBEDDING_PROVIDER_API_KEY = "apikey";
        public static final String EMBEDDING_PROVIDER_EMBEDDING_ENDPOINT = "embedding_endpoint";
        public static final String EMBEDDING_PROVIDER_EMBEDDING_MODEL = "embedding_model";
        public static final String EMBEDDING_PROVIDER_EMBEDDING_REQUEST_MODEL = "model";
        public static final String EMBEDDING_PROVIDER_EMBEDDING_REQUEST_INPUT = "input";
        public static final String EMBEDDING_PROVIDER_RESPONSE_EMBEDDING_PATH = "/data/0/embedding";

        public static final String GUARDRAIL_PROVIDERS = "GuardrailProviders";
        public static final String GUARDRAIL_PROVIDER = "GuardrailProvider";
        public static final String GUARDRAIL_PROVIDER_TYPE = "type";
        public static final String GUARDRAIL_PROVIDER_PROPERTY = "Property";
        public static final String GUARDRAIL_PROVIDER_PROPERTY_KEY = "name";
        public static final String AZURE_OCP_APIM_SUBSCRIPTION_KEY_HEADER = "Ocp-Apim-Subscription-Key";
        public static final String GUARDRAIL_PROVIDER_AZURE_CONTENTSAFETY_TYPE = "azure-contentsafety";
        public static final String GUARDRAIL_PROVIDER_AZURE_CONTENTSAFETY_KEY = "key";
        public static final String GUARDRAIL_PROVIDER_AZURE_CONTENTSAFETY_ENDPOINT = "endpoint";
        public static final String GUARDRAIL_PROVIDER_AZURE_CONTENTSAFETY_CALLOUT_SERVICE = "service";
        public static final String GUARDRAIL_PROVIDER_AZURE_CONTENTSAFETY_CALLOUT_PAYLOAD = "request_payload";

        public static final String GUARDRAIL_PROVIDER_AWSBEDROCK_TYPE = "awsbedrock-guardrails";
        public static final String GUARDRAIL_PROVIDER_AWSBEDROCK_ACCESS_KEY = "access_key";
        public static final String GUARDRAIL_PROVIDER_AWSBEDROCK_SECRET_KEY = "secret_key";
        public static final String GUARDRAIL_PROVIDER_AWSBEDROCK_SESSION_TOKEN = "session_token";
        public static final String GUARDRAIL_PROVIDER_AWSBEDROCK_ROLE_ARN = "role_arn";
        public static final String GUARDRAIL_PROVIDER_AWSBEDROCK_ROLE_REGION = "role_region";
        public static final String GUARDRAIL_PROVIDER_AWSBEDROCK_ROLE_EXTERNAL_ID = "role_external_id";
        public static final String GUARDRAIL_PROVIDER_AWSBEDROCK_CALLOUT_SERVICE = "service";
        public static final String GUARDRAIL_PROVIDER_AWSBEDROCK_CALLOUT_SERVICE_REGION = "guardrail_region";
        public static final String GUARDRAIL_PROVIDER_AWSBEDROCK_CALLOUT_HOST = "request_host";
        public static final String GUARDRAIL_PROVIDER_AWSBEDROCK_CALLOUT_URI = "request_uri";
        public static final String GUARDRAIL_PROVIDER_AWSBEDROCK_CALLOUT_URL = "request_url";
        public static final String GUARDRAIL_PROVIDER_AWSBEDROCK_CALLOUT_PAYLOAD = "request_payload";

        // Retry configuration
        public static final String RETRIEVAL_TIMEOUT = "retrieval_timeout";
        public static final String RETRY_COUNT = "retry_count";
        public static final String RETRY_PROGRESSION_FACTOR = "retry_progression_factor";
        public static final String DEFAULT_RETRIEVAL_TIMEOUT = "500"; // 500 milliseconds
        public static final String DEFAULT_RETRY_COUNT = "0"; // 0 retry
        public static final String DEFAULT_RETRY_PROGRESSION_FACTOR = "1"; // No progression factor, fixed retry time

        private AI() {

        }
    }

    // AWS S4 Constants
    public static final String AMZ_DATE_FORMAT = "yyyyMMdd'T'HHmmss'Z'";
    public static final String DATE_FORMAT = "yyyyMMdd";
    public static final String HOST_HEADER = "host";
    public static final String AMZ_DATE_HEADER = "x-amz-date";
    public static final String AMZ_SECURITY_TOKEN_HEADER = "x-amz-security-token";
    public static final String AMZ_CONTENT_SHA_HEADER = "x-amz-content-sha256";
    public static final String AWS4_ALGORITHM = "AWS4-HMAC-SHA256";
    public static final String AWS4_REQUEST = "aws4_request";
    public static final String AWS4_CREDENTIAL = "Credential";
    public static final String AWS4_SIGNED_HEADERS = "SignedHeaders";
    public static final String AWS4_SIGNATURE = "Signature";
    public static final String AWS4 = "AWS4";
    public static final String HMAC_SHA_256 = "HmacSHA256";
    public static final String DEFAULT_REGION = "us-east-1";
    public static final String STS = "sts";
    public static final String AWS_DOMAIN = "amazonaws.com";
    public static final String SESSION_FORMAT = "%d%d%d";
    public static final String ASSUME_ROLE_QUERY_ACTION = "Action=AssumeRole";
    public static final String ASSUME_ROLE_QUERY_VERSION = "&Version=2011-06-15";
    public static final String ASSUME_ROLE_QUERY_ROLE_ARN_KEY = "&RoleArn=";
    public static final String ASSUME_ROLE_QUERY_ROLE_SESSION_KEY = "&RoleSessionName=";
    public static final String ASSUME_ROLE_QUERY_ROLE_EXTERNAL_ID_KEY = "&ExternalId=";
    public static final String ASSUME_ROLE_ACCESS_KEY = "AccessKeyId";
    public static final String ASSUME_ROLE_SECRET_KEY = "SecretAccessKey";
    public static final String ASSUME_ROLE_SESSION_TOKEN = "SessionToken";


    //documentation rxt

    public static final String DOC_NAME = "overview_name";
    public static final String DOC_SUMMARY = "overview_summary";
    public static final String DOC_TYPE = "overview_type";
    public static final String DOC_VISIBILITY = "overview_visibility";
    public static final String DOC_DIR = "documentation";
    public static final String INLINE_DOCUMENT_CONTENT_DIR = "contents";
    public static final String NO_CONTENT_UPDATE = "no_content_update";
    public static final String DOCUMENT_FILE_DIR = "files";
    public static final String DOC_API_BASE_PATH = "overview_apiBasePath";
    public static final String DOC_SOURCE_URL = "overview_sourceURL";
    public static final String DOC_FILE_PATH = "overview_filePath";
    public static final String DOC_SOURCE_TYPE = "overview_sourceType";
    public static final String DOC_OTHER_TYPE_NAME = "overview_otherTypeName";
    public static final String PUBLISHED = "PUBLISHED";
    public static final String CREATED = "CREATED";
    public static final String DEPRECATED = "DEPRECATED";
    public static final String PROTOTYPED = "PROTOTYPED";
    public static final String RETIRED = "RETIRED";
    public static final String BLOCKED = "BLOCKED";
    public static final String VERB_INFO_DTO = "VERB_INFO";
    public static final String RESOURCE_AUTHENTICATION_SCHEME = "ResourceAuthenticationScheme";
    public static final String GOVERNANCE = "governance";

    public static final String DEFAULT_CARBON_DIALECT = "http://wso2.org/claims";
    public static final String FULL_NAME = DEFAULT_CARBON_DIALECT + "/fullname";
    public static final String FIRST_NAME = DEFAULT_CARBON_DIALECT + "/givenname";
    public static final String LAST_NAME = DEFAULT_CARBON_DIALECT + "/lastname";

    //Overview constants for CORS configuration
    public static final String API_OVERVIEW_CORS_CONFIGURATION = "overview_corsConfiguration";
    //Registry lifecycle related info
    public static final String API_LIFE_CYCLE = "APILifeCycle";
    public static final String LC_NEXT_STATES = "nextStates";
    public static final String LC_PROPERTY_LIFECYCLE_NAME_PREFIX = "registry.lifecycle.";
    public static final String LC_PROPERTY_CHECKLIST_PREFIX = "registry.custom_lifecycle.checklist.";
    public static final String LC_PROPERTY_STATE_SUFFIX = ".state";
    public static final String LC_PROPERTY_PERMISSION_SUFFIX = ".item.permission";
    public static final String LC_PROPERTY_ITEM_SUFFIX = ".item";
    public static final String LC_STATUS = "status:";
    public static final String LC_CHECK_ITEMS = "items";
    public static final String LC_CHECK_ITEM_NAME = "name:";
    public static final String LC_CHECK_ITEM_VALUE = "value:";
    public static final String LC_CHECK_ITEM_ORDER = "order:";
    public static final String LC_PUBLISH_LC_STATE = "Publish";

    public static final String SUPER_TENANT_DOMAIN = "carbon.super";
    public static final String TENANT_PREFIX = "/t/";
    public static final String GRANT_TYPE_CLIENT_CREDENTIALS = "client_credentials";
    public static final String OAUTH_RESPONSE_ACCESSTOKEN = "access_token";
    public static final String OAUTH_RESPONSE_TOKEN_SCOPE = "scope";
    public static final String OAUTH_RESPONSE_EXPIRY_TIME = "expires_in";
    public static final String APP_DISPLAY_NAME = "DisplayName";
    public static final String APP_TOKEN_TYPE = "TokenType";
    public static final String APP_SKIP_CONSENT_DISPLAY = "Skip Consent";
    public static final String APP_SKIP_CONSENT_NAME = "skipConsent";
    public static final String APP_SKIP_CONSENT_VALUE = "true";
    public static final String APP_SKIP_LOGOUT_CONSENT_DISPLAY = "Skip Logout Consent";
    public static final String APP_SKIP_LOGOUT_CONSENT_NAME = "skipLogoutConsent";
    public static final String APP_SKIP_LOGOUT_CONSENT_VALUE = "true";
    public static final String APP_ORG_ID_DISPLAY = "Organization ID";
    public static final String APP_ORG_ID_NAME = "orgId";
    public static final String RECEIVER_URL = "receiverURL";
    public static final String AUTHENTICATOR_URL = "authenticatorURL";
    public static final String USERNAME = "username";
    public static final String PASSWORD = "password";
    public static final String PROTOCOL = "protocol";
    public static final String PUBLISHING_MODE = "publishingMode";
    public static final String PUBLISHING_TIME_OUT = "publishTimeout";
    public static final String NON_BLOCKING = "non-blocking";
    public static final String IS_ENABLED = "is_enabled";
    public static final String BLOCKING_CONDITIONS_STREAM_ID = "org.wso2.blocking.request.stream:1.0.0";
    public static final String TOKEN_REVOCATION_STREAM_ID = "org.wso2.apimgt.token.revocation.stream:1.0.0";
    public static final String CACHE_INVALIDATION_STREAM_ID = "org.wso2.apimgt.cache.invalidation.stream:1.0.0";
    public static final String NOTIFICATION_STREAM_ID = "org.wso2.apimgt.notification.stream:1.0.0";
    public static final String WEBHOOKS_SUBSCRIPTION_STREAM_ID = "org.wso2.apimgt.webhooks.request.stream:1.0.0";

    //Property for enabling scope sharing between APIs
    public static final String ENABLE_API_SCOPES_SHARING = "enable-api-scopes-sharing";

    // Constants for obtaining organization claims
    public static final String READ_ORGANIZATION_FROM_SAML_ASSERTION = "readOrganizationClaimFromSamlAssertion";
    public static final String SAML2_SSO_AUTHENTICATOR_NAME = "SAML2SSOAuthenticator";
    public static final String ORGANIZATION_CLAIM_ATTRIBUTE = "OrganizationClaimAttribute";
    public static final String DEFAULT_ORGANIZATION_CLAIM_NAME = "http://wso2.org/claims/organization";
    public static final String DEFAULT_TOKEN_TYPE = "DEFAULT";
    public static final String TOKEN_TYPE_OAUTH = "OAUTH";
    public static final String TOKEN_TYPE_DEFAULT = "Default";
    public static final String TOKEN_TYPE_JWT = "JWT";

    public static final String PASSWORD_RESOLVER_IMPL_CLASS = "PasswordResolverImpl";
    public static final String CACHE_INVALIDATION_TYPE = "type";
    public static final String GATEWAY_JWKS_CACHE = "JWKS_CACHE";
    public static final String BLOCKING_CONDITION_ID = "id";
    public static final String API_OVERVIEW_KEY_MANAGERS = "overview_keyManagers";
    public static final String KEY_MANAGER_CONSUMER_KEY = "consumer_key";
    public static final String KEY_MANAGER_CONSUMER_SECRET = "consumer_secret";
    public static final String REVOKED_TOKEN_TYPE = "type";
    public static final String IDENTITY_REVOKE_ENDPOINT = "/oauth2/revoke";
    public static final String IDENTITY_TOKEN_ENDPOINT_CONTEXT = "/oauth2/token";
    public static final String GATEWAY_SIGNED_JWT_CACHE = "SignedJWTParseCache";

    public static final String DEFAULT_WEBSOCKET_VERSION = "defaultVersion";
    public static final String ENCRYPTED_VALUE = "encrypted";
    public static final String VALUE = "value";
    public static final String GATEWAY_INTROSPECT_CACHE_NAME = "GatewayIntrospectCache";
    public static final String ENABLE_USER_CLAIMS_RETRIEVAL_FROM_KEY_MANAGER = "EnableUserClaimRetrievalFromKeyManager";

    public static final String DELEM_COLON = ":";
    public static final String DELEM_COMMA = ",";
    public static final String DELEM_UNDERSCORE = "_";
    public static final String CHAR_ASTERIX = "*";
    public static final String CERTIFICATE_RETRIEVAL_ENDPOINT = "/endpoint-certificates";
    public static final String GA_CONFIG_RETRIEVAL_ENDPOINT = "/ga-config";
    public static final String TENANT_INFO_ENDPOINT = "/tenant-info";
    public static final String API_OVERVIEW_WEBSUB_SUBSCRIPTION_CONFIGURATION
            = "overview_websubSubscriptionConfiguration";
    public static final String WEBSUB_DEFAULT_TOPIC_NAME = "_default";
    public static final String API_TYPE_WS = "WS";
    public static final String GATEWAY_INTERNAL_KEY_DATA_CACHE_NAME = "gatewayInternalKeyDataCache";
    public static final String GATEWAY_INVALID_INTERNAL_KEY_CACHE_NAME = "gatewayInvalidInternalKeyCache";
    public static final String GRANT_TYPE_PASSWORD = "password";
    public static final String ENABLE_TENANT_BASE_SIGNING = "EnableTenantBasedSigning";
    public static final String DEFAULT_WEBSUB_SIGNING_ALGO = "SHA1";
    public static final String DEFAULT_WEBSUB_SIGNATURE_HEADER = "x-hub-signature";
    public static final String INTERNAL_KEY_APP_NAME = "internal-key-app";

    // Constants for for api quota limit feature
    public static final String API_QUOTA_LIMIT = "ResourceQuotaLimit.";
    public static final String API_QUOTA_LIMIT_ENABLE = API_QUOTA_LIMIT + "EnableAPIQuotaLimit";
    public static final String JWKS_URI = "jwksUri";

    public static final String ORG_ALL_QUERY_PARAM = "ALL";
    public static final String JWT_HEADER_ACCESS_TOKEN_TYPE = "at+jwt";

    public static final String GOVERNANCE_COMPLIANCE_KEY = "isCompliant";
    public static final String GOVERNANCE_COMPLIANCE_ERROR_MESSAGE = "message";

    public static class TokenStatus {

        public static final String ACTIVE = "ACTIVE";
        public static final String BLOCKED = "BLOCKED";
        public static final String REVOKED = "REVOKED";
        public static final String INACTIVE = "INACTIVE";

        private TokenStatus() {

        }
    }

    public static class SubscriptionStatus {

        public static final String BLOCKED = "BLOCKED";
        public static final String PROD_ONLY_BLOCKED = "PROD_ONLY_BLOCKED";
        public static final String UNBLOCKED = "UNBLOCKED";
        public static final String ON_HOLD = "ON_HOLD";
        public static final String TIER_UPDATE_PENDING = "TIER_UPDATE_PENDING";
        public static final String REJECTED = "REJECTED";
        public static final String DELETE_PENDING = "DELETE_PENDING";

        private SubscriptionStatus() {

        }
    }

    public enum OAuthAppMode {
        CREATED, MAPPED
    }

    public enum CommentEntryPoint {
        PUBLISHER, DEVPORTAL
    }

    public static class SubscriptionCreatedStatus {

        public static final String SUBSCRIBE = "SUBSCRIBE";
        public static final String UN_SUBSCRIBE = "UN_SUBSCRIBE";

        private SubscriptionCreatedStatus() {

        }
    }

    public static final String RXT_MEDIA_TYPE = "application/vnd.wso2.registry-ext-type+xml";
    public static final String API_RXT_MEDIA_TYPE = "application/vnd.wso2-api+xml";
    public static final String DOCUMENT_RXT_MEDIA_TYPE = "application/vnd.wso2-document+xml";
    public static final String API_PRODUCT_RXT_MEDIA_TYPE = "application/vnd.wso2-product+xml";
    public static final int TOP_TATE_MARGIN = 4;

    public static final class Permissions {

        public static final String API_CREATE = "/permission/admin/manage/api/create";
        public static final String API_PUBLISH = "/permission/admin/manage/api/publish";
        public static final String API_SUBSCRIBE = "/permission/admin/manage/api/subscribe";
        public static final String API_WORKFLOWADMIN = "/permission/admin/manage/workflowadmin";
        public static final String APIM_ADMIN = "/permission/admin/manage/apim_admin";
        public static final String MANAGE_TIERS = "/permission/admin/manage/manage_tiers";

        public static final String LOGIN = "/permission/admin/login";
        public static final String CONFIGURE_GOVERNANCE = "/permission/admin/configure/governance";
        public static final String RESOURCE_GOVERN = "/permission/admin/manage/resources/govern";

        private Permissions() {

        }
    }

    public static final String API_GATEWAY = "APIGateway.";
    public static final String API_GATEWAY_NAME = "Name";
    public static final String API_GATEWAY_DISPLAY_NAME = "DisplayName";
    public static final String API_GATEWAY_VISIBILITY = "Visibility";
    public static final String API_GATEWAY_SERVER_URL = "ServerURL";
    public static final String API_GATEWAY_USERNAME = "Username";
    public static final String API_GATEWAY_PASSWORD = "Password";
    public static final String API_GATEWAY_ENDPOINT = "GatewayEndpoint";
    public static final String API_WEBSOCKET_GATEWAY_ENDPOINT = "GatewayWSEndpoint";
    public static final String API_WEBSUB_GATEWAY_ENDPOINT = "GatewayWebSubEndpoint";
    public static final String API_GATEWAY_TYPE = "GatewayType";
    public static final String API_GATEWAY_TYPE_SYNAPSE = "Synapse";
    public static final String API_GATEWAY_TYPE_ENVOY = "Envoy";
    public static final String API_GATEWAY_TYPE_REGULAR = "Regular";
    public static final String API_GATEWAY_TYPE_APK = "APK";
    public static final String API_GATEWAY_VIRTUAL_HOSTS = "VirtualHosts";
    public static final String API_GATEWAY_VIRTUAL_HOST = "VirtualHost";
    public static final String API_GATEWAY_VIRTUAL_HOST_HTTP_ENDPOINT = "HttpEndpoint";
    public static final String API_GATEWAY_VIRTUAL_HOST_HTTPS_ENDPOINT = "HttpsEndpoint";
    public static final String API_GATEWAY_VIRTUAL_HOST_WS_ENDPOINT = "WsEndpoint";
    public static final String API_GATEWAY_VIRTUAL_HOST_WSS_ENDPOINT = "WssEndpoint";
    public static final String API_GATEWAY_VIRTUAL_HOST_WEBSUB_HTTP_ENDPOINT = "WebSubHttpEndpoint";
    public static final String API_GATEWAY_VIRTUAL_HOST_WEBSUB_HTTPS_ENDPOINT = "WebSubHttpsEndpoint";
    public static final String API_GATEWAY_NONE = "none";
    public static final String GATEWAY_STATS_SERVICE = "GatewayStatsUpdateService";
    public static final String API_GATEWAY_PROVIDER = "Provider";
    public static final String API_GATEWAY_ADDITIONAL_PROPERTIES = "Properties";
    public static final String API_GATEWAY_ADDITIONAL_PROPERTY = "Property";


    public static final String CACHE_CONFIGS = "CacheConfigurations.";
    public static final String GATEWAY_TOKEN_CACHE_ENABLED = CACHE_CONFIGS + "EnableGatewayTokenCache";
    public static final String GATEWAY_RESOURCE_CACHE_ENABLED = CACHE_CONFIGS + "EnableGatewayResourceCache";
    public static final String JWT_CLAIM_CACHE_EXPIRY = CACHE_CONFIGS + "JWTClaimCacheExpiry";
    public static final String ENABLED_JWT_CLAIM_CACHE = CACHE_CONFIGS + "EnableJWTClaimCache";
    public static final String KEY_MANAGER_TOKEN_CACHE = CACHE_CONFIGS + "EnableKeyManagerTokenCache";
    public static final String TOKEN_CACHE_EXPIRY = CACHE_CONFIGS + "TokenCacheExpiry";
    public static final String REST_API_TOKEN_CACHE_ENABLED = CACHE_CONFIGS + "EnableRESTAPITokenCache";
    public static final String REST_API_TOKEN_CACHE_EXPIRY = CACHE_CONFIGS + "RESTAPITokenCacheExpiry";
    public static final String REST_API_CACHE_CONTROL_HEADERS_ENABLED = CACHE_CONFIGS
            + "EnableRESTAPICacheControlHeaders";
    public static final String REST_API_CACHE_CONTROL_HEADERS_MAX_AGE = CACHE_CONFIGS
            + "RESTAPICacheControlHeadersMaxAge";

    public static final String STORE_TAG_CACHE_DURATION = CACHE_CONFIGS + "TagCacheDuration";
    public static final String API_STORE_RECENTLY_ADDED_API_CACHE_ENABLE =
            CACHE_CONFIGS + "EnableRecentlyAddedAPICache";
    public static final String SCOPE_CACHE_ENABLED = CACHE_CONFIGS + "EnableScopeCache";
    public static final String PUBLISHER_ROLE_CACHE_ENABLED = CACHE_CONFIGS + "EnablePublisherRoleCache";
    public static final String GATEWAY_RESOURCE_CACHE_TIMEOUT = CACHE_CONFIGS + "GatewayResourceCacheExpiry";
    public static final String DEFAULT_CACHE_TIMEOUT = "Cache.DefaultCacheTimeout";
    public static final String REST_API_SCOPE_CACHE = "REST_API_SCOPE_CACHE";
    public static final long DEFAULT_TIMEOUT = 900;

    public static final String API_KEY_VALIDATOR = "APIKeyValidator.";
    public static final String API_KEY_VALIDATOR_URL = API_KEY_VALIDATOR + "ServerURL";
    public static final String API_KEY_VALIDATOR_USERNAME = API_KEY_VALIDATOR + "Username";
    public static final String API_KEY_VALIDATOR_PASSWORD = API_KEY_VALIDATOR + "Password";
    public static  final String CLIENT_CERTIFICATE_TIER = "TIER";
    public static final String CLIENT_CERTIFICATE_KEY_TYPE = "KEY_TYPE";

    public static final String ENABLE_DEFAULT_KEY_MANAGER_REGISTRATION = API_KEY_VALIDATOR +
            "EnableDefaultKeyManagerRegistration";
    public static final String ENABLE_KEY_MANAGER_RETRIVAL = API_KEY_VALIDATOR +
            "EnableKeyManagerConfigurationRetriever";
    public static final String DEFAULT_KEY_MANAGER_TYPE = API_KEY_VALIDATOR + "DefaultKeyManagerType";
    public static final String KEY_VALIDATION_HANDLER_CLASSNAME = API_KEY_VALIDATOR + "KeyValidationHandlerClassName";
    // Constants needed for KeyManager section
    public static final String API_KEY_MANAGER = "APIKeyManager.";
    public static final String KEY_MANAGER_CLIENT = API_KEY_MANAGER + "KeyManagerClientImpl";
    public static final String KEY_MANAGER = "KeyManager";
    public static final String KEY_MANAGER_USERNAME = "Username";
    public static final String KEY_MANAGER_PASSWORD = "Password";
    public static final String KEY_MANAGER_TENANT_DOMAIN = "KeyManagerTenantDomain";
    public static final String AUTHSERVER_URL = "ServerURL";
    public static final String API_KEY_VALIDATOR_ENABLE_PROVISION_APP_VALIDATION =
            API_KEY_VALIDATOR + "EnableProvisionedAppValidation";
    public static final String LIGHTWEIGHT_API_KEY_GENERATION_ENABLED =
            API_KEY_VALIDATOR + "EnableLightWeightAPIKeyGeneration";
    public static final String ALLOW_SUBSCRIPTION_VALIDATION_DISABLING = API_KEY_VALIDATOR +
            "AllowSubscriptionValidationDisabling";
    public static final String KEY_MANAGER_OAUTH2_SCOPES_REST_API_BASE_PATH = "/api/identity/oauth2/v1.0/scopes";
    public static final String KEY_MANAGER_OAUTH2_SCOPES_SCOPE_NAME_PARAM = "{scope_name}";
    public static final String KEY_MANAGER_OAUTH2_SCOPES_REST_API_SCOPE_NAME = "/name/"
            + KEY_MANAGER_OAUTH2_SCOPES_SCOPE_NAME_PARAM;
    public static final String[] KEY_MANAGER_OAUTH2_REST_API_MGT_SCOPES = {"internal_application_mgt_create",
            "internal_application_mgt_delete", "internal_application_mgt_update", "internal_application_mgt_view",
            "internal_user_mgt_list"};
    public static final String KEY_MANAGER_CLIENT_APPLICATION_PREFIX = "wso2_apim_km_";
    public static final String DEFAULT_APP_SHARING_KEYWORD = "private";
    public static final String APP_SHARING_WITH_THE_ORGANIZATION_DISABLED = "Private";
    public static final String APP_SHARING_WITH_THE_ORGANIZATION_ENABLED = "Shared";

    public static final String TOKEN_URL = "TokenURL";
    public static final String REVOKE_URL = "RevokeURL";
    public static final String SERVICES_URL_RELATIVE_PATH = "services";

    public static final String PORT_OFFSET_SYSTEM_VAR = "portOffset";
    public static final String PORT_OFFSET_CONFIG = "Ports.Offset";

    public static final String DEVICE_SCOPE_PATTERN = "^device_.*";
    public static final String OPEN_ID_SCOPE_NAME = "openid";
    public static final String API_KEY_MANGER_VALIDATIONHANDLER_CLASS_NAME = API_KEY_VALIDATOR
            + "KeyValidationHandlerClassName";

    public static final String USER_DEFAULT_PROFILE = "default";
    public static final String USER_PROFILE_MGT_SERVICE = "UserProfileMgtService";
    public static final String USER_INFO_RECOVERY_SERVICE = "UserInformationRecoveryService";

    public static final String API_RESTAPI = "RESTAPI.";
    public static final String API_RESTAPI_ALLOWED_URI = API_RESTAPI + "AllowedURIs.AllowedURI.";
    public static final String API_RESTAPI_ALLOWED_URI_URI = API_RESTAPI_ALLOWED_URI + "URI";
    public static final String API_RESTAPI_ALLOWED_URI_HTTPMethods = API_RESTAPI_ALLOWED_URI + "HTTPMethods";
    public static final String API_RESTAPI_BASIC_AUTH_BLOCKED_URI = API_RESTAPI + "BasicAuthBlockedURIs.BasicAuthBlockedURI.";
    public static final String API_RESTAPI_BASIC_AUTH_BLOCKED_URI_URI = API_RESTAPI_BASIC_AUTH_BLOCKED_URI + "URI";
    public static final String API_RESTAPI_BASIC_AUTH_BLOCKED_URI_HTTPMethods =
            API_RESTAPI_BASIC_AUTH_BLOCKED_URI + "HTTPMethods";
    public static final String API_RESTAPI_ETAG_SKIP_LIST = API_RESTAPI + "ETagSkipList.";
    public static final String API_RESTAPI_ETAG_SKIP_URI = API_RESTAPI_ETAG_SKIP_LIST + "ETagSkipURI.";
    public static final String API_RESTAPI_ETAG_SKIP_URI_URI = API_RESTAPI_ETAG_SKIP_URI + "URI";
    public static final String API_RESTAPI_ETAG_SKIP_URI_HTTPMETHOD = API_RESTAPI_ETAG_SKIP_URI + "HTTPMethods";

    public static final String JWT_EXPIRY_TIME = API_KEY_VALIDATOR + "JWTExpiryTime";
    public static final String JWT_AUDIENCES = "JWTAudiences";
    public static final String JWT_AUDIENCE = "JWTAudience";
    public static final String AUDIENCE = "Audience";
    public static final String AUDIENCES = "Audiences";
    public static final String ALL_AUDIENCES = "all";
    public static final String BASEPATH = "Basepath";
    public static final String URN_CHOREO = "urn:choreo:";
    public static final String BASE_PATH = "http.base.path";

    public static final String API_KEY_VALIDATOR_ENABLE_ASSERTIONS = API_KEY_VALIDATOR + "EnableAssertions.";

    public static final String API_STORE = "APIStore.";
    public static final String SHOW_API_STORE_URL_FROM_PUBLISHER = API_STORE + "DisplayURL";
    public static final String API_STORE_URL = API_STORE + "URL";
    public static final String API_STORE_SERVER_URL = API_STORE + "ServerURL";
    public static final String API_STORE_USERNAME = API_STORE + "Username";
    public static final String API_STORE_PASSWORD = API_STORE + "Password";
    public static final String API_STORE_DISPLAY_ALL_APIS = API_STORE + "DisplayAllAPIs";
    public static final String API_STORE_DISPLAY_MULTIPLE_VERSIONS = API_STORE + "DisplayMultipleVersions";
    public static final String API_STORE_DISPLAY_COMMENTS = API_STORE + "DisplayComments";
    public static final int REPLYLIMIT = 3;
    public static final int REPLYOFFSET = 0;
    public static final String API_STORE_DISPLAY_RATINGS = API_STORE + "DisplayRatings";
    public static final String STORE_TOKEN_DISPLAY_URL = API_STORE + "StoreTokenDisplayURL";
    public static final String API_STORE_FORCE_CI_COMPARISIONS = API_STORE + "CompareCaseInsensitively";
    public static final String API_STORE_DISABLE_PERMISSION_CHECK = API_STORE + "DisablePermissionCheck";
    public static final String API_STORE_APIS_PER_PAGE = API_STORE + "APIsPerPage";
    public static final String API_STORE_FORUM_ENABLED = API_STORE + "isStoreForumEnabled";
    public static final String MULTI_TENANT_USER_ADMIN_SERVICE = "MultiTenantUserAdminService";
    public static final String API_STORE_GROUP_EXTRACTOR_CLAIM_URI = API_STORE + "DefaultGroupExtractorClaimUri";
    public static final String API_STORE_MAP_EXISTING_AUTH_APPS = API_STORE + "MapExistingAuthApps";
    public static final String API_STORE_API_KEY_ALIAS = API_STORE + "ApiKeyAlias";
    public static final String API_STORE_API_KEY_GENERATOR_IMPL = API_STORE + "ApiKeyGeneratorImpl";
    public static final String API_STORE_API_KEY_SIGN_KEY_STORE = API_STORE + "APIKeyKeystore";
    public static final String WSO2_ANONYMOUS_USER = "wso2.anonymous.user";
    public static final String API_DEVPORTAL_ANONYMOUS_MODE = API_STORE + "EnableAnonymousMode";
    public static final String ENABLE_ANONYMOUS_MODE = "EnableAnonymous";
    public static final String API_DEVPORTAL_ENABLE_CROSS_TENANT_SUBSCRIPTION = API_STORE +
            "EnableCrossTenantSubscription";
    public static final String API_DEVPORTAL_DEFAULT_RESERVED_USERNAME = API_STORE +
            "DefaultReservedUsername";
    public static final String API_STORE_CREATE_DEFAULT_APPLICATION = API_STORE + "CreateDefaultApplication";

    public static final String API_PUBLISHER = "APIPublisher.";
    public static final String SHOW_API_PUBLISHER_URL_FROM_STORE = API_PUBLISHER + "DisplayURL";
    public static final String API_PUBLISHER_URL = API_PUBLISHER + "URL";
    public static final String API_PUBLISHER_ENABLE_API_DOC_VISIBILITY_LEVELS = API_PUBLISHER
            + "EnableAPIDocVisibilityLevels";
    public static final String API_PUBLISHER_ENABLE_PORTAL_CONFIGURATION_ONLY_MODE = API_PUBLISHER + "EnablePortalConfigurationOnlyMode";
    public static final String API_PUBLISHER_INTERNAL_KEY_ISSUER = API_PUBLISHER + "InternalKeyIssuer";
    // Configuration that need to enable to add access control to APIs in publisher
    public static final String API_PUBLISHER_ENABLE_ACCESS_CONTROL_LEVELS = API_PUBLISHER
            + "EnableAccessControl";
    public static final String API_PUBLISHER_APIS_PER_PAGE = API_PUBLISHER + "APIsPerPage";
    public static final String API_PUBLISHER_SUBSCRIBER_CLAIMS = API_PUBLISHER + "SubscriberClaims";
    public static final String API_PUBLISHER_INTERNAL_API_KEY_ALIAS = API_PUBLISHER + "InternalKeyAlias";
    public static final String API_PUBLISHER_SUPPORTED_DOC_TYPES = API_PUBLISHER + "SupportedDocumentTypes";
    public static final String WSO2_API_STORE_TYPE = "wso2";

    public static final String EXTERNAL_API_STORES = "ExternalAPIStores";
    public static final String LOGIN_CONFIGS = "LoginConfig";
    public static final String EXTERNAL_API_STORES_STORE_URL = "StoreURL";
    public static final String EXTERNAL_API_STORE = "ExternalAPIStore";
    public static final String EXTERNAL_API_STORE_ID = "id";
    public static final String EXTERNAL_API_STORE_TYPE = "type";
    public static final String EXTERNAL_API_STORE_CLASS_NAME = "className";
    public static final String EXTERNAL_API_STORE_DISPLAY_NAME = "DisplayName";
    public static final String EXTERNAL_API_STORE_ENDPOINT = "Endpoint";
    public static final String EXTERNAL_API_STORE_USERNAME = "Username";
    public static final String EXTERNAL_API_STORE_PASSWORD = "Password";

    public static final String ENABLE_MTLS_FOR_APIS = "EnableMTLSForAPIs";
    public static final String IS_KM_REVERSE_PROXY_ENABLED = "ISKMReverseProxyEnabled";

    public static final String IDENTITY_PROVIDER = "IdentityProvider.";
    public static final String IDENTITY_PROVIDER_AUTHORIZE_ENDPOINT = IDENTITY_PROVIDER + "AuthorizeEndpoint";
    public static final String IDENTITY_PROVIDER_OIDC_LOGOUT_ENDPOINT = IDENTITY_PROVIDER + "OIDCLogoutEndpoint";
    public static final String IDENTITY_PROVIDER_SERVER_URL = IDENTITY_PROVIDER + "ServerURL";
    public static final String IDENTITY_PROVIDER_OIDC_CHECK_SESSION_ENDPOINT = IDENTITY_PROVIDER + "CheckSessionEndpoint";
    public static final String IDENTITY_PROVIDER_OIDC_CHECK_SESSION_URL = "/oidc/checksession";

    public static final String SELF_SIGN_UP = "SelfSignUp.";
    public static final String SELF_SIGN_UP_ENABLED = SELF_SIGN_UP + "Enabled";
    public static final String SELF_SIGN_UP_ROLE = SELF_SIGN_UP + "SubscriberRoleName";

    //elements in the configuration file in the advance tenant configuration related to self signup
    public static final String SELF_SIGN_UP_REG_ROLES_ELEM = "SignUpRoles";

    public static final String ORG_RESOLVER = "OrganizationResolver";

    public static final String STATUS_OBSERVERS = "StatusObservers.";
    public static final String OBSERVER = STATUS_OBSERVERS + "Observer";

    public static final String SUBSCRIBER_CONFIGURATION = "SubscriberContactConfiguration";
    public static final String SUBSCRIBER_CONFIGURATION_RECIPIENT = "EmailRecipientField";
    public static final String SUBSCRIBER_CONFIGURATION_DELIMITER= "EmailAddressDelimiter";

    public static final String CORS_CONFIGURATION = "CORSConfiguration.";
    public static final String CORS_CONFIGURATION_ENABLED = CORS_CONFIGURATION + "Enabled";
    public static final String CORS_CONFIGURATION_ENABLE_VALIDATION_FOR_WS = CORS_CONFIGURATION + "EnableValidationForWS";
    public static final String CORS_CONFIGURATION_ACCESS_CTL_ALLOW_ORIGIN = CORS_CONFIGURATION
            + "Access-Control-Allow-Origin";
    public static final String CORS_CONFIGURATION_ACCESS_CTL_ALLOW_HEADERS = CORS_CONFIGURATION
            + "Access-Control-Allow-Headers";
    public static final String CORS_CONFIGURATION_ACCESS_CTL_ALLOW_METHODS = CORS_CONFIGURATION
            + "Access-Control-Allow-Methods";

    public static final String CORS_CONFIGURATION_ACCESS_CTL_EXPOSE_HEADERS = CORS_CONFIGURATION
            + "Access-Control-Expose-Headers";

    public static final String CORS_CONFIGURATION_ACCESS_CTL_ALLOW_CREDENTIALS = CORS_CONFIGURATION
            + "Access-Control-Allow-Credentials";

    public static final String API_KEY_TYPE = "AM_KEY_TYPE";
    public static final String API_KEY_TYPE_PRODUCTION = "PRODUCTION";
    public static final String API_KEY_TYPE_SANDBOX = "SANDBOX";

    public static final String BILLING_AND_USAGE_CONFIGURATION = "EnableBillingAndUsage";

    public static final String DEFAULT_APPLICATION_NAME = "DefaultApplication";
    public static final String DEFAULT_APPLICATION_DESCRIPTION = "This is the default application";
    public static final String BASIC_AUTH_APPLICATION_NAME = "BasicAuthApplication";
    public static final String BASIC_AUTH_APPLICATION_OWNER = " BasicAuthApplicationOwner";
    public static final String MUTUAL_SSL_AUTH_APPLICATION_NAME = "MutualSSLAuthApplication";
    public static final String MUTUAL_SSL_AUTH_APPLICATION_OWNER = "MutualSSLAuthApplicationOwner";
    public static final String SUBSCRIPTIONLESS_APPLICATION_NAME = "SubscriptionLessApplication";
    public static final String SUBSCRIPTIONLESS_APPLICATION_OWNER = "SubscriptionLessApplicationOwner";
    public static final String SUBSCRIPTIONLESS_APPLICATION_DESCRIPTION = "This application is used to internally" +
            " subscribe to APIs when subscription validation is disabled";

    public static final QName POLICY_ELEMENT = new QName("http://schemas.xmlsoap.org/ws/2004/09/policy",
            "Policy");

    public static final String THROTTLE_NAMESPACE = "http://www.wso2.org/products/wso2commons/throttle";

    public static final QName ASSERTION_ELEMENT = new QName(THROTTLE_NAMESPACE, "MediatorThrottleAssertion");
    public static final QName THROTTLE_ID_ELEMENT = new QName(THROTTLE_NAMESPACE, "ID");
    public static final QName THROTTLE_ID_DISPLAY_NAME_ELEMENT = new QName(THROTTLE_NAMESPACE, "displayName");

    public static final String THROTTLE_TIER_DESCRIPTION_ATTRIBUTE = "Description";

    //"Billing plan" and "Stop on quota reach" are considered as x-wso2 type attributes
    public static final String THROTTLE_TIER_PLAN_ATTRIBUTE = "x-wso2-BillingPlan";
    public static final String THROTTLE_TIER_QUOTA_ACTION_ATTRIBUTE = "x-wso2-StopOnQuotaReach";

    public static final String TIER_MANAGEMENT = "TierManagement.";
    public static final String ENABLE_UNLIMITED_TIER = TIER_MANAGEMENT + "EnableUnlimitedTier";
    public static final String THROTTLE_POLICY_TEMPLATE =
            "<wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\" xmlns:throttle=\"http://www.wso2" +
                    ".org/products/wso2commons/throttle\">" +
                    "<throttle:ID throttle:type=\"ROLE\">%s</throttle:ID>" +
                    "<wsp:Policy>" +
                    "<throttle:Control>" +
                    "<wsp:Policy>" +
                    "<throttle:MaximumCount>%d</throttle:MaximumCount>" +
                    "<throttle:UnitTime>%d</throttle:UnitTime>" +
                    "<wsp:Policy>" +
                    "<throttle:Attributes>%s</throttle:Attributes>" +
                    "</wsp:Policy>" +
                    "</wsp:Policy>" +
                    "</throttle:Control>" +
                    "</wsp:Policy>" +
                    "</wsp:Policy>";

    public static final String THROTTLE_POLICY_ATTRIBUTE_TEMPLATE =
            "<throttle:%s xmlns:throttle=\"http://www.wso2.org/products/wso2commons/throttle\">%s</throttle:%s>";

    // This property is used to indicate whether a throttle out event has happened
    // There is a property added to the message context when such an event happens.
    public static final String API_USAGE_THROTTLE_OUT_PROPERTY_KEY = "isThrottleOutIgnored";

    public static final String THROTTLE_OUT_REASON_KEY = "THROTTLED_OUT_REASON";
    public static final String BLOCKED_REASON_KEY = "BLOCKED_REASON";
    // The following properties describes the reason for the throttle out.
    public static final String THROTTLE_OUT_REASON_HARD_LIMIT_EXCEEDED = "HARD_LIMIT_EXCEEDED";
    public static final String THROTTLE_OUT_REASON_SOFT_LIMIT_EXCEEDED = "SOFT_LIMIT_EXCEEDED";
    public static final String THROTTLE_OUT_REASON_API_LIMIT_EXCEEDED = "API_LIMIT_EXCEEDED";
    public static final String THROTTLE_OUT_REASON_RESOURCE_LIMIT_EXCEEDED = "RESOURCE_LIMIT_EXCEEDED";
    public static final String THROTTLE_OUT_REASON_APPLICATION_LIMIT_EXCEEDED = "APPLICATION_LIMIT_EXCEEDED";
    public static final String THROTTLE_OUT_REASON_SUBSCRIPTION_LIMIT_EXCEEDED = "SUBSCRIPTION_LIMIT_EXCEEDED";

    public static final String API_ANALYTICS = "Analytics.";
    public static final String API_USAGE_ENABLED = API_ANALYTICS + "Enabled";
    public static final String API_ANALYTICS_REPORTER_CLASS = API_ANALYTICS + "ReporterClass";
    public static final String API_ANALYTICS_PROPERTIES = API_ANALYTICS + "Properties";
    public static final String API_ANALYTICS_RESPONSE_SCHEMA_NAME = API_ANALYTICS + "ResponseSchemaName";
    public static final String API_ANALYTICS_FAULT_SCHEMA_NAME = API_ANALYTICS + "FaultSchemaName";
    public static final String API_USAGE_BAM_SERVER_URL_GROUPS = API_ANALYTICS + "StreamProcessorServerURL";
    public static final String API_USAGE_BAM_SERVER_AUTH_URL_GROUPS = API_ANALYTICS + "StreamProcessorAuthServerURL";
    public static final String API_USAGE_BUILD_MSG = API_ANALYTICS + "PublishResponseMessageSize";
    public static final String API_USAGE_BAM_SERVER_USER = API_ANALYTICS + "StreamProcessorUsername";
    public static final String API_USAGE_BAM_SERVER_PASSWORD = API_ANALYTICS + "StreamProcessorPassword";
    public static final String API_USAGE_SKIP_EVENT_RECEIVER_CONN = API_ANALYTICS + "SkipEventReceiverConnection";
    public static final String API_USAGE_PUBLISHER_CLASS = API_ANALYTICS + "PublisherClass";
    public static final String API_USAGE_DATA_SOURCE_NAME = "WSO2AM_STATS_DB";
    public static final String API_USAGE_STREAMS = API_ANALYTICS + "Streams.";
    public static final String STAT_PROVIDER_IMPL = API_ANALYTICS + "StatsProviderImpl";
    public static final String API_USAGE_REQUEST_STREAM = API_USAGE_STREAMS + "Request.";
    public static final String API_USAGE_RESPONSE_STREAM = API_USAGE_STREAMS + "Response.";
    public static final String API_USAGE_FAULT_STREAM = API_USAGE_STREAMS + "Fault.";
    public static final String API_USAGE_THROTTLE_STREAM = API_USAGE_STREAMS + "Throttle.";
    public static final String API_USAGE_EXECUTION_TIME_STREAM = API_USAGE_STREAMS + "ExecutionTime.";
    public static final String API_ALERT_TYPES_STREAM = API_USAGE_STREAMS + "AlertTypes.";
    public static final String API_REQUEST_STREAM_NAME = API_USAGE_REQUEST_STREAM + "Name";
    public static final String API_REQUEST_STREAM_VERSION = API_USAGE_REQUEST_STREAM + "Version";
    public static final String API_RESPONSE_STREAM_NAME = API_USAGE_RESPONSE_STREAM + "Name";
    public static final String API_RESPONSE_STREAM_VERSION = API_USAGE_RESPONSE_STREAM + "Version";
    public static final String API_FAULT_STREAM_NAME = API_USAGE_FAULT_STREAM + "Name";
    public static final String API_FAULT_STREAM_VERSION = API_USAGE_FAULT_STREAM + "Version";
    public static final String API_THROTTLE_STREAM_NAME = API_USAGE_THROTTLE_STREAM + "Name";
    public static final String API_THRORRLE_STREAM_VERSION = API_USAGE_THROTTLE_STREAM + "Version";
    public static final String API_EXECUTION_TIME_STREAM_NAME = API_USAGE_EXECUTION_TIME_STREAM + "Name";
    public static final String API_EXECUTION_TIME_STREAM_VERSION = API_USAGE_EXECUTION_TIME_STREAM + "Version";
    public static final String API_ALERT_TYPES_STREAM_NAME = API_ALERT_TYPES_STREAM + "Name";
    public static final String API_ALERT_TYPES_STREAM_VERSION = API_ALERT_TYPES_STREAM + "Version";
    public static final String API_USAGE_SKIP_WORKFLOW_EVENT_RECEIVER_CONN =
            API_ANALYTICS + "SkipWorkflowEventPublisher";

    public static final String API_USAGE_WF_STREAM = API_USAGE_STREAMS + "Workflow.";
    public static final String API_WF_STREAM_NAME = API_USAGE_WF_STREAM + "Name";
    public static final String API_WF_STREAM_VERSION = API_USAGE_WF_STREAM + "Version";
    //Rest API Config data in api-config.xml
    public static final String API_USAGE_DAS_REST_API_URL = API_ANALYTICS + "StreamProcessorRestApiURL";
    public static final String API_USAGE_DAS_REST_API_USER = API_ANALYTICS + "StreamProcessorRestApiUsername";
    public static final String API_USAGE_DAS_REST_API_PASSWORD = API_ANALYTICS + "StreamProcessorRestApiPassword";

    public static final String UNLIMITED_TIER = "Unlimited";
    public static final String THROTTLING_TIER = "THROTTLING_TIER";
    public static final String UNLIMITED_TIER_DESC = "Allows unlimited requests";

    public static final String UNAUTHENTICATED_TIER = "Unauthenticated";
    public static final String BLOCKING_EVENT_PUBLISHER = "blockingEventPublisher";
    public static final String EVENT_HUB_NOTIFICATION_EVENT_PUBLISHER = "eventHubNotificationEventPublisher";
    public static final String NOTIFICATION_EVENT_PUBLISHER = "notificationPublisher";

    public static final int AM_CREATOR_APIMGT_EXECUTION_ID = 200;
    public static final int AM_CREATOR_GOVERNANCE_EXECUTION_ID = 201;
    public static final int AM_PUBLISHER_APIMGT_EXECUTION_ID = 202;
    public static final int AM_CREATOR_LIFECYCLE_EXECUTION_ID = 203;
    public static final int AM_PUBLISHER_LIFECYCLE_EXECUTION_ID = 204;

    public static final QName THROTTLE_CONTROL_ELEMENT = new QName(THROTTLE_NAMESPACE, "Control");
    public static final QName THROTTLE_MAXIMUM_COUNT_ELEMENT = new QName(THROTTLE_NAMESPACE, "MaximumCount");
    public static final QName THROTTLE_UNIT_TIME_ELEMENT = new QName(THROTTLE_NAMESPACE, "UnitTime");
    public static final QName THROTTLE_ATTRIBUTES_ELEMENT = new QName(THROTTLE_NAMESPACE, "Attributes");
    public static final QName THROTTLE_ATTRIBUTE_ELEMENT = new QName(THROTTLE_NAMESPACE, "Attribute");
    public static final QName THROTTLE_DESCRIPTION_ELEMENT = new QName(THROTTLE_NAMESPACE, "Description");
    public static final QName THROTTLE_TIER_PLAN_ELEMENT = new QName(THROTTLE_NAMESPACE, THROTTLE_TIER_PLAN_ATTRIBUTE);
    public static final String THROTTLE_ATTRIBUTE_DISPLAY_NAME = "displayName";

    public static final String TIER_DESC_NOT_AVAILABLE = "Tire Description is not available";

    public static final String AUTH_TYPE_DEFAULT = "DEFAULT";
    public static final String AUTH_TYPE_NONE = "NONE";
    public static final String AUTH_TYPE_USER = "USER";
    public static final String AUTH_TYPE_APP = "APP";

    public static final String TIER_PERMISSION_ALLOW = "allow";
    public static final String TIER_PERMISSION_DENY = "deny";

    public static final String SUBSCRIPTION_TO_CURRENT_TENANT = "current_tenant";
    public static final String SUBSCRIPTION_TO_ALL_TENANTS = "all_tenants";
    public static final String SUBSCRIPTION_TO_SPECIFIC_TENANTS = "specific_tenants";
    public static final String NO_PERMISSION_ERROR = "noPermissions";
    public static final String JSON_PARSE_ERROR = "parseErrors";

    public static final String ACCOUNT_LOCKED_CLAIM = "http://wso2.org/claims/identity/accountLocked";

    //TODO: move this to a common place (& Enum) to be accessible by all components
    public static class KeyValidationStatus {

        public static final int API_AUTH_GENERAL_ERROR = 900900;
        public static final int API_AUTH_INVALID_CREDENTIALS = 900901;
        public static final int API_AUTH_INCORRECT_ACCESS_TOKEN_TYPE = 900905;
        public static final int API_BLOCKED = 900907;
        public static final int API_AUTH_RESOURCE_FORBIDDEN = 900908;
        public static final int SUBSCRIPTION_INACTIVE = 900909;
        public static final int INVALID_SCOPE = 900910;
        public static final int KEY_MANAGER_NOT_AVAILABLE = 900912;

        private KeyValidationStatus() {

        }
    }

    public static final String EMAIL_DOMAIN_SEPARATOR = "@";

    public static final String EMAIL_DOMAIN_SEPARATOR_REPLACEMENT = "-AT-";

    //API caching related constants
    public static final String API_MANAGER_CACHE_MANAGER = "API_MANAGER_CACHE";
    public static final String API_CONTEXT_CACHE_MANAGER = "API_CONTEXT_CACHE_MANAGER";
    public static final String RESOURCE_CACHE_NAME = "resourceCache";
    public static final String POLICY_CACHE_CONTEXT = "POLICY:";
    public static final String GATEWAY_KEY_CACHE_NAME = "gatewayKeyCache";
    public static final String GATEWAY_USERNAME_CACHE_NAME = "gatewayUsernameCache";
    public static final String GATEWAY_INVALID_USERNAME_CACHE_NAME = "gatewayInvalidUsernameCache";
    public static final String GATEWAY_BASIC_AUTH_RESOURCE_CACHE_NAME = "gatewayBasicAuthResourceCache";
    public static final String GATEWAY_CERTIFICATE_CACHE_NAME = "gatewayCertificateCache";
    public static final String GATEWAY_API_KEY_CACHE_NAME = "gatewayApiKeyCache";
    public static final String GATEWAY_INTERNAL_KEY_CACHE_NAME = "gatewayInternalKeyCache";
    public static final String GATEWAY_API_KEY_DATA_CACHE_NAME = "gatewayApiKeyKeyCache";
    public static final String GATEWAY_INVALID_API_KEY_CACHE_NAME = "gatewayInvalidApiKeyCache";
    public static final String GATEWAY_TOKEN_CACHE_NAME = "GATEWAY_TOKEN_CACHE";
    public static final String GATEWAY_INVALID_TOKEN_CACHE_NAME = "GATEWAY_INVALID_TOKEN_CACHE";
    public static final String REST_API_TOKEN_CACHE_NAME = "RESTAPITokenCache";
    public static final String REST_API_INVALID_TOKEN_CACHE_NAME = "RESTAPIInvalidTokenCache";
    public static final String GATEWAY_JWT_TOKEN_CACHE = "GatewayJWTTokenCache";

    public static final String KEY_CACHE_NAME = "keyCache";
    public static final String API_CONTEXT_CACHE = "apiContextCache";
    public static final String WORKFLOW_CACHE_NAME = "workflowCache";
    public static final String LC_CACHE_NAME = "lcCache";
    public static final String APP_SCOPE_CACHE = "appScopeCache";
    public static final String TIERS_CACHE = "tiersCache";
    public static final int API_CONTEXT_CACHE_EXPIRY_TIME_IN_DAYS = 3650;
    public static final String CLAIMS_APIM_CACHE = "claimsLocalCache";
    public static final String APP_SUBSCRIPTION_SCOPE_CACHE = "appSubscriptionScopeCache";
    public static final String APP_SUBSCRIPTION_FILTERED_SCOPE_CACHE = "appSubscriptionFilteredScopeCache";
    public static final String API_USER_ROLE_CACHE = "appPublisherUserRoleCache";
    public static final String API_PUBLISHER_ADMIN_PERMISSION_CACHE = "apimAdminPermissionCache";
    public static final String API_SUBSCRIBER_CACHE = "subscriberCache";
    public static final String EMAIL_CLAIM = "http://wso2.org/claims/emailaddress";

    //URI Authentication Schemes
    public static final Set<String> SUPPORTED_METHODS =
            Collections.unmodifiableSet(new HashSet<String>(
                    Arrays.asList(new String[]{"get", "put", "post", "delete", "patch", "head", "options"})));
    public static final String PARAMETERS = "parameters";
    public static final String AUTH_NO_AUTHENTICATION = "None";
    public static final String AUTH_APPLICATION_LEVEL_TOKEN = "Application";
    public static final String AUTH_APPLICATION_USER_LEVEL_TOKEN = "Application_User";
    public static final String AUTH_APP_AND_USER = "Application_User";
    public static final String AUTH_APPLICATION_OR_USER_LEVEL_TOKEN = "Any";
    public static final String NO_MATCHING_AUTH_SCHEME = "noMatchedAuthScheme";

    public static final String EVERYONE_ROLE = "internal/everyone";
    public static final String ANONYMOUS_ROLE = "system/wso2.anonymous.role";
    public static final String SUBSCRIBER_ROLE = "Internal/subscriber";

    // Anonymous end user, to be used with ACCESS_TOKEN_USER_TYPE_APPLICATION
    public static final String END_USER_ANONYMOUS = "anonymous";

    public static final String READ_ACTION = "2";
    public static final String WRITE_ACTION = "3";
    public static final String DELETE_ACTION = "4";
    public static final String PERMISSION_ENABLED = "1";
    public static final String PERMISSION_DISABLED = "0";

    public static final String API_ACTION = "action";
    public static final String API_ADD_ACTION = "addAPI";
    public static final String API_GET_ACTION = "getAPI";
    public static final String API_UPDATE_ACTION = "updateAPI";
    public static final String API_CHANGE_STATUS_ACTION = "updateStatus";
    public static final String API_REMOVE_ACTION = "removeAPI";
    public static final String API_COPY_ACTION = "createNewAPI";
    public static final String API_LOGIN_ACTION = "login";
    public static final String API_LOGOUT_ACTION = "logout";
    public static final String APISTORE_LOGIN_USERNAME = "username";
    public static final String APISTORE_LOGIN_PASSWORD = "password";
    public static final String APISTORE_LOGIN_URL = "/site/blocks/user/login/ajax/login.jag";
    public static final String APISTORE_PUBLISH_URL = "/site/blocks/life-cycles/ajax/life-cycles.jag";
    public static final String APISTORE_ADD_URL = "/site/blocks/item-add/ajax/add.jag";
    public static final String APISTORE_DELETE_URL = "/site/blocks/item-add/ajax/remove.jag";
    public static final String APISTORE_LIST_URL = "/site/blocks/listing/ajax/item-list.jag";
    public static final String APISTORE_COPY_URL = "/site/blocks/overview/ajax/overview.jag";

    public static final String SWAGGER_VERSION = "1.1";

    public static class OperationParameter {

        public static final String AUTH_PARAM_NAME = "Authorization";
        public static final String AUTH_PARAM_DESCRIPTION = "OAuth2 Authorization Header";
        public static final String AUTH_PARAM_TYPE = "header";
        public static final String PAYLOAD_PARAM_NAME = "Payload";
        public static final String PAYLOAD_PARAM_DESCRIPTION = "Request Payload";
        public static final String QUERY_PARAM_NAME = "Query Parameters";
        public static final String QUERY_PARAM_DESCRIPTION = "Request Query Parameters";
        public static final String PAYLOAD_PARAM_TYPE = "body";

        private OperationParameter() {

        }
    }

    public static class SubscriptionValidationResources {

        public static final String APIS = "/apis";
        public static final String APPLICATIONS = "/applications";
        public static final String SUBSCRIPTIONS = "/subscriptions";
        public static final String SUBSCRIBERS = "/subscribers";
        public static final String SUBSCRIBE_INTERNAL = "/subscribe-internal";
        public static final String APPLICATION_KEY_MAPPINGS = "/application-key-mappings";
        public static final String APPLICATION_POLICIES = "/application-policies";
        public static final String API_POLICIES = "/api-policies";
        public static final String GLOBAL_POLICIES = "/global-policies";
        public static final String SUBSCRIPTION_POLICIES = "/subscription-policies";
        public static final String SCOPES = "/scopes";

        private SubscriptionValidationResources() {

        }
    }

    public static class CORSHeaders {

        public static final String ACCESS_CONTROL_ALLOW_ORIGIN = "Access-Control-Allow-Origin";
        public static final String ACCESS_CONTROL_ALLOW_HEADERS = "Access-Control-Allow-Headers";
        public static final String ACCESS_CONTROL_EXPOSE_HEADERS = "Access-Control-Expose-Headers";
        public static final String ACCESS_CONTROL_ALLOW_METHODS = "Access-Control-Allow-Methods";
        public static final String ACCESS_CONTROL_ALLOW_CREDENTIALS = "Access-Control-Allow-Credentials";
        public static final String ACCESS_CONTROL_REQUEST_METHOD = "Access-Control-Request-Method";
        public static final String ALLOW_HEADERS_HANDLER_VALUE = "allowHeaders";
        public static final String ALLOW_METHODS_HANDLER_VALUE = "allowedMethods";
        public static final String ALLOW_ORIGIN_HANDLER_VALUE = "allowedOrigins";
        public static final String ALLOW_CREDENTIALS_HANDLER_VALUE = "allowCredentials";
        public static final String IMPLEMENTATION_TYPE_HANDLER_VALUE = "apiImplementationType";

        private CORSHeaders() {

        }
    }

    public static class WebHookProperties {
        public static final String DEFAULT_TOPIC_QUERY_PARAM_NAME = "hub.topic";
        public static final String WEB_HOOK_SUBSCRIPTION_FAILURE_HANDLER = "_web_hook_subscription_failure_handler";
        public static final String DEFAULT_SUBSCRIPTION_RESOURCE_PATH = "/webhooks_events_receiver_resource";
        public static final String EVENT_RECEIVING_RESOURCE_PATH = "eventReceiverResourcePath";
        public static final String TOPIC_QUERY_PARAM_NAME = "topicQueryParamName";
    }

    public static final String EXTENSION_HANDLER_POSITION = "ExtensionHandlerPosition";
    public static final String ENABLE_PER_TENANT_SERVICE_PROVIDER_CREATION = "EnablePerTenantServiceProviderCreation";
    public static final String DISABLE_DEFAULT_APPLICATION_CREATION = "DisableDefaultApplicationCreation";
    public static final String GATEWAY_ENV_TYPE_HYBRID = "hybrid";
    public static final String GATEWAY_ENV_TYPE_PRODUCTION = "production";
    public static final String GATEWAY_ENV_TYPE_SANDBOX = "sandbox";

    public static final String ENABLED = "Enabled";
    public static final String DISABLED = "Disabled";
    public static final int API_RESPONSE_CACHE_TIMEOUT = 300;

    public static class ApplicationStatus {

        public static final String APPLICATION_CREATED = "CREATED";
        public static final String APPLICATION_APPROVED = "APPROVED";
        public static final String APPLICATION_REJECTED = "REJECTED";
        public static final String APPLICATION_ONHOLD = "ON_HOLD";
        public static final String DELETE_PENDING = "DELETE_PENDING";
        public static final String UPDATE_PENDING = "UPDATE_PENDING";
        public static final String UPDATE_REJECTED = "UPDATE_REJECTED";
    }

    public static class APIRevisionStatus {

        public static final String API_REVISION_CREATED = "CREATED";
        public static final String API_REVISION_APPROVED = "APPROVED";
        public static final String API_REVISION_REJECTED = "REJECTED";
        public static final String API_REVISION_DELETE_PENDING = "DELETE_PENDING";
    }

    public static class AppRegistrationStatus {

        public static final String REGISTRATION_CREATED = "CREATED";
        public static final String REGISTRATION_APPROVED = "APPROVED";
        public static final String REGISTRATION_REJECTED = "REJECTED";
        public static final String REGISTRATION_COMPLETED = "COMPLETED";
    }

    public static class FrontEndParameterNames {

        public static final String CONSUMER_KEY = "consumerKey";
        public static final String CONSUMER_SECRET = "consumerSecret";
        public static final String CLIENT_DETAILS = "appDetails";
        public static final String CALLBACK_URL = "callbackUrl";
        public static final String KEY_STATE = "keyState";
        public static final String KEY_MAPPING_ID = "keyMappingId";
        public static final String MODE = "mode";
    }

    public static class AccessTokenConstants {

        public static final String ACCESS_TOKEN = "accessToken";
        public static final String VALIDITY_TIME = "validityTime";
        public static final String TOKEN_SCOPES = "tokenScope";
    }

    //key  of the endpoint securevault
    public static final String API_SECUREVAULT_ENABLE = "EnableSecureVault";

    public static final String API_RESOURCE_CACHE_KEY = "API_RESOURCE_CACHE_KEY";
    public static final String API_ELECTED_RESOURCE = "API_ELECTED_RESOURCE";
    public static final String REST_METHOD = "REST_METHOD";

    // GraphQL related constants
    public static final String API_TYPE = "ApiType";
    public static final String HTTP_VERB = "HTTP_VERB";
    public static final String GRAPHQL_API = "GRAPHQL";
    public static final String GRAPHQL_SUBSCRIPTION_REQUEST = "isGraphqlSubscriptionRequest";
    public static final String GRAPHQL_API_OPERATION_RESOURCE = "OPERATION_RESOURCE";
    public static final String GRAPHQL_API_OPERATION_TYPE = "OPERATION_TYPE";
    public static final String GRAPHQL_API_OPERATION_VERB_INFO_DTO = "OPERATION_VERB_INFO_DTO";
    public static final String[] GRAPHQL_SUPPORTED_METHODS = {"QUERY", "MUTATION", "SUBSCRIPTION"};
    public static final String API_GRAPHQL_SCHEMA_RESOURCE_LOCATION = API_APPLICATION_DATA_LOCATION + "/graphql/";
    public static final String GRAPHQL_SCHEMA_FILE_EXTENSION = ".graphql";
    public static final String GRAPHQL_LOCAL_ENTRY_EXTENSION = "_graphQL";
    public static final String GRAPHQL_SCHEMA_PROVIDER_SEPERATOR = "--";
    public static final String GRAPHQL_RESOURCE_PATH = "/*";
    public static final String GRAPHQL_SCHEMA_DEFINITION_SEPARATOR = "schemaDefinition=";
    public static final String GRAPHQL_QUERY = "Query";
    public static final String GRAPHQL_SWAGGER_QUERY = "query";
    public static final String GRAPHQL_MUTATION = "Mutation";
    public static final String GRAPHQL_SUBSCRIPTION = "Subscription";
    public static final String SCOPE_ROLE_MAPPING = "WSO2ScopeRoleMapping";
    public static final String SCOPE_OPERATION_MAPPING = "WSO2ScopeOperationMapping";
    public static final String OPERATION_THROTTLING_MAPPING = "WSO2OperationThrottlingMapping";
    public static final String OPERATION_AUTH_SCHEME_MAPPING = "WSO2OperationAuthSchemeMapping";
    public static final String OPERATION_SECURITY_ENABLED = "Enabled";
    public static final String OPERATION_SECURITY_DISABLED = "Disabled";
    public static final String GRAPHQL_PAYLOAD = "GRAPHQL_PAYLOAD";
    public static final String GRAPHQL_SCHEMA = "GRAPHQL_SCHEMA";
    public static final String GRAPHQL_ACCESS_CONTROL_POLICY = "WSO2GraphQLAccessControlPolicy";
    public static final String QUERY_ANALYSIS_COMPLEXITY = "complexity";
    public static final String GRAPHQL_ADDITIONAL_TYPE_PREFIX = "WSO2";
    public static final String GRAPHQL_INTROSPECTION_QUERY_FILE = "graphql/introspection_query.graphql";

    public static final String VELOCITY_GRAPHQL_API_SUBSCRIPTION_AVAILABLE = "isSubscriptionAvailable";
    public static final String VELOCITY_API_WEBSOCKET_TOPIC_MAPPINGS = "topicMappings";

    //URI Authentication Schemes
    public static final Set<String> GRAPHQL_SUPPORTED_METHOD_LIST =
            Collections.unmodifiableSet(new HashSet<String>(
                    Arrays.asList(new String[]{"QUERY", "MUTATION", "SUBSCRIPTION", "head", "options"})));

    public static final Set<String> WEBSUB_SUPPORTED_METHOD_LIST =
            Collections.unmodifiableSet(new HashSet<>(Arrays.asList(new String[]{"SUBSCRIBE"})));
    public static final Set<String> SSE_SUPPORTED_METHOD_LIST =
            Collections.unmodifiableSet(new HashSet<>(Arrays.asList(new String[]{"SUBSCRIBE"})));
    public static final Set<String> WS_SUPPORTED_METHOD_LIST =
            Collections.unmodifiableSet(new HashSet<>(Arrays.asList(new String[]{"SUBSCRIBE", "PUBLISH"})));

    public static final String HTTP_VERB_PUBLISH = "PUBLISH";
    public static final String HTTP_VERB_SUBSCRIBE = "SUBSCRIBE";
    public static final String OAUTH2_DEFAULT_SCOPE = "default";

    public static final String RECENTLY_ADDED_API_CACHE_NAME = "RECENTLY_ADDED_API";
    public static final String VELOCITY_LOGGER = "VelocityLogger";

    public static final String SHA_256 = "SHA-256";

    public static final String SHA_1 = "SHA-1";

    public static final String US_ASCII = "US-ASCII";
    public static final String HASH = "hash";

    public static class DigestAuthConstants {

        public static final String REALM = "realm";
        public static final String NONCE = "nonce";
        public static final String ALGORITHM = "algorithm";
        public static final String OPAQUE = "opaque";
        public static final String QOP = "qop";

        public static final String AUTH = "auth";
        public static final String AUTH_INT = "auth-int";
        public static final String MD5 = "MD5";
        public static final String MD5_SESS = "MD5-sess";

        public static final String POSTFIX = "POSTFIX";
        public static final String HTTP_METHOD = "HTTP_METHOD";
        public static final String MESSAGE_BODY = "MessageBody";
        public static final String UNAMEPASSWORD = "UNAMEPASSWORD";
        public static final String NONCE_COUNT = "NonceCount";
        public static final String INIT_NONCE_COUNT = "00000000";
        public static final String AUTH_HEADER = "AuthHeader";
        public static final String BACKEND_URL = "BACKEND_URL";
        public static final String CHARSET = "UTF-8";

        private DigestAuthConstants() {

        }
    }

    public static class OAuthConstants {

        public static final String OAUTH = "OAUTH";
        public static final String OAUTH_ID = "id";
        public static final String UNIQUE_IDENTIFIER = "uniqueIdentifier";
        public static final String TOKEN_API_URL = "tokenUrl";
        public static final String OAUTH_CLIENT_ID = "clientId";
        public static final String OAUTH_CLIENT_SECRET = "clientSecret";
        public static final String OAUTH_USERNAMEPASSWORD = "usernamePassword";
        public static final String GRANT_TYPE = "grantType";
        public static final String OAUTH_CUSTOM_PARAMETERS = "customParameters";
        public static final String CLIENT_CREDENTIALS = "CLIENT_CREDENTIALS";
        public static final String PASSWORD = "PASSWORD";
        public static final String TOKEN_EXCHANGE = "urn:ietf:params:oauth:grant-type:token-exchange";
        public static final String SUBJECT_TOKEN = "subject_token";
        public static final String SUBJECT_TOKEN_TYPE = "subject_token_type";
        public static final String JWT_TOKEN_TYPE = "urn:ietf:params:oauth:token-type:jwt";

        public static final String AUTHORIZATION_HEADER = "Authorization";
        public static final String CONTENT_TYPE_HEADER = "Content-Type";
        public static final String APPLICATION_X_WWW_FORM_URLENCODED = "application/x-www-form-urlencoded";
        public static final String CLIENT_CRED_GRANT_TYPE = "grant_type=client_credentials";
        public static final String PASSWORD_GRANT_TYPE = "grant_type=password";
        public static final String REFRESH_TOKEN_GRANT_TYPE = "grant_type=refresh_token";

        public static final String OAUTH_MEDIATION_CONFIG = "OAuth.";
        public static final String ACCESS_TOKEN = "access_token";
        public static final String REFRESH_TOKEN = "refresh_token";
        public static final String SCOPE = "scope";
        public static final String TOKEN_TYPE = "token_type";
        public static final String EXPIRES_IN = "expires_in";
        public static final String EXPIRES_IN_CONFIG = "ExpiresIn";
        public static final String ENABLE_RETRY_CALL_WITH_NEW_TOKEN = "EnableRetryCallWithNewToken";

        // Properties in Endpoint Config
        public static final String ENDPOINT_SECURITY_PRODUCTION = "production";
        public static final String ENDPOINT_SECURITY_SANDBOX = "sandbox";
        public static final String ENDPOINT_SECURITY_PASSWORD = "password";
        public static final String ENDPOINT_SECURITY_TYPE = "type";
        public static final String ENDPOINT_SECURITY_ENABLED = "enabled";
        public static final String ENDPOINT_SECURITY_USERNAME = "username";

        public static final String CUSTOM_PARAMETERS_SECURED = "secured";
        public static final String CUSTOM_PARAMETERS_VALUE = "value";

        private OAuthConstants() {

        }
    }

    // For Redis Configuration
    public static final String REDIS_CONFIG = "RedisConfig";
    public static final String CONFIG_REDIS_HOST = "RedisHost";
    public static final String CONFIG_REDIS_PORT =  "RedisPort";
    public static final String CONFIG_REDIS_USER =  "RedisUser";
    public static final String CONFIG_REDIS_PASSWORD =  "RedisPassword";
    public static final String CONFIG_REDIS_DATABASE_ID =  "RedisDatabaseId";
    public static final String CONFIG_REDIS_CONNECTION_TIMEOUT =  "RedisConnectionTimeout";
    public static final String CONFIG_REDIS_IS_SSL_ENABLED =  "RedisIsSslEnabled";
    public static final String CONFIG_REDIS_PROPERTIES = "Properties";
    public static final String CONFIG_REDIS_MAX_TOTAL = "maxTotal";
    public static final String CONFIG_REDIS_MAX_IDLE = "maxIdle";
    public static final String CONFIG_REDIS_MIN_IDLE = "minIdle";
    public static final String CONFIG_REDIS_TEST_ON_BORROW = "testOnBorrow";
    public static final String CONFIG_REDIS_TEST_ON_RETURN = "testOnReturn";
    public static final String CONFIG_REDIS_TEST_WHILE_IDLE = "testWhileIdle";
    public static final String CONFIG_REDIS_BLOCK_WHEN_EXHAUSTED = "blockWhenExhausted";
    public static final String CONFIG_REDIS_MIN_EVICTABLE_IDLE_TIME_IN_MILLIS = "minEvictableIdleTimeMillis";
    public static final String CONFIG_REDIS_TIME_BETWEEN_EVICTION_RUNS_IN_MILLIS = "timeBetweenEvictionRunsMillis";
    public static final String CONFIG_REDIS_NUM_TESTS_PER_EVICTION_RUNS = "numTestsPerEvictionRun";
    public static final String CONFIG_REDIS_GATEWAY_ID = "GatewayId";

    public static final String CONFIG_REDIS_MIN_GATEWAY_COUNT = "MinGatewayCount";

    public static final String CONFIG_REDIS_KEY_LOCK_RETRIEVAL_TIMEOUT = "KeyLockRetrievalTimeout";
    public static final String HYBRID_THROTTLE_PROCESSOR_TYPE_START_TIME_BASED = "start_time_based";

    // Primary/Secondary Login configuration
    public static final String USERID_LOGIN = "UserIdLogin";
    public static final String EMAIL_LOGIN = "EmailLogin";
    public static final String PRIMARY_LOGIN = "primary";
    public static final String CLAIM_URI = "ClaimUri";

    public static final String DEFAULT_VERSION_PREFIX = "_default_";
    public static final String OAUTH_HEADER_SPLITTER = ",";
    public static final String CONSUMER_KEY_SEGMENT = "Bearer";
    public static final String CONSUMER_KEY_SEGMENT_DELIMITER = " ";

    public static final String HTTP_PROXY_HOST = "http.proxyHost";
    public static final String HTTP_PROXY_PORT = "http.proxyPort";

    public static final String HTTP_CLIENT_MAX_TOTAL = "HttpClient.MaxTotal";
    public static final String HTTP_CLIENT_DEFAULT_MAX_PER_ROUTE = "HttpClient.DefaultMaxPerRoute";
    public static final String HTTP_CLIENT_CONNECTION_TIMEOUT = "HttpClient.ConnectionTimeout";

    public static final String PROXY_ENABLE = "ProxyConfig.Enable";
    public static final String PROXY_HOST = "ProxyConfig.Host";
    public static final String PROXY_PORT = "ProxyConfig.Port";
    public static final String PROXY_USERNAME = "ProxyConfig.Username";
    public static final String PROXY_PASSWORD = "ProxyConfig.Password";
    public static final String NON_PROXY_HOSTS = "ProxyConfig.NonProxyHosts";
    public static final String PROXY_PROTOCOL = "ProxyConfig.Protocol";

    public static final String KEYMANAGER_HOSTNAME = "keyManagerHostname";
    public static final String KEYMANAGER_PORT = "keyManagerPort";
    public static final String KEYMANAGER_SERVERURL = API_KEY_VALIDATOR + "ServerURL";
    public static final String CARBON_LOCALIP = "carbon.local.ip";
    public static final String HTTPS_TRANSPORT_PORT = "https.transport.port";

    public static final String APIPROVIDER_HOSTCACHE = "apiProvideHostObjectCache";
    public static final String TENANTCOUNT_CACHEKEY = "apiProviderCacheKey";

    public static final String API_STORE_GROUP_EXTRACTOR_IMPLEMENTATION = API_STORE + "GroupingExtractor";
    public static final String API_STORE_REST_API_GROUP_EXTRACTOR_IMPLEMENTATION =
            API_STORE + "RESTApiGroupingExtractor";
    public static final String IS_ENABLE_JWT_FOR_PORTALS = OAUTH_CONFIGS + "EnableJWTForPortals";
    public static final String API_CUSTOM_SEQUENCES_FOLDER_LOCATION =
            "repository" + File.separator + "resources" + File.separator + "customsequences";
    public static final String WORKFLOW_EXTENSION_LOCATION =
            "repository" + File.separator + "resources" + File.separator + "default-workflow-extensions.xml";
    public static final String API_CUSTOM_SEQUENCE_TYPE_IN = "in";
    public static final String API_CUSTOM_SEQUENCE_TYPE_OUT = "out";
    public static final String API_CUSTOM_SEQUENCE_TYPE_FAULT = "fault";
    public static final String MEDIATION_SEQUENCE_ELEM = "sequence";
    public static final String MEDIATION_CONFIG_EXT = ".xml";
    public static final String API_CUSTOM_SEQ_IN_EXT = "--In";
    public static final String API_CUSTOM_SEQ_OUT_EXT = "--Out";
    public static final String API_CUSTOM_SEQ_FAULT_EXT = "--Fault";

    public static final String API_MANAGER_HOSTNAME = "HostName";
    public static final String API_MANAGER_HOSTNAME_UNKNOWN = "UNKNOWN_HOST";

    public enum SupportedHTTPVerbs {
        GET,
        POST,
        PUT,
        DELETE,
        PATCH,
        HEAD,
        OPTIONS
    }

    public enum SupportedCustomPolicyKeys {
        APP_ID("APP_ID"),
        IP("IP"),
        STARTING_IP("STARTING_IP"),
        END_IP("END_IP"),
        ACCESS_TOKEN("ACCESS_TOKEN"),
        USERNAME("APP_ID"),
        QUERY_PARAM("QUERY_PARAM"),
        HEADER("HEADER"),
        BANDWIDTH("BANDWIDTH"),
        JWT_CLAIM("JWT_CLAIM"),
        CONTEXT("CONTEXT"),
        VERSION("VERSION");

        private final String name;

        SupportedCustomPolicyKeys(String s) {

            name = s;
        }

        public String getValue() {

            return this.name;
        }
    }

    public static class ConfigParameters {

        private ConfigParameters() {

            throw new AssertionError();
        }
    }

    public static final String CORS_SEQUENCE_NAME = "_cors_request_handler_";
    public static final String CUSTOM_HTTP_STATUS_CODE = "CUSTOM_HTTP_SC";
    public static final String CUSTOM_ERROR_CODE = "ERROR_CODE";
    public static final String CUSTOM_ERROR_MESSAGE = "ERROR_MESSAGE";
    //Swagger v2.0 constants
    public static final String SWAGGER_X_SCOPE = "x-scope";
    public static final String SWAGGER_X_AMZN_RESOURCE_NAME = "x-amzn-resource-name";
    public static final String SWAGGER_X_AMZN_RESOURCE_TIMEOUT = "x-amzn-resource-timeout";
    public static final String SWAGGER_X_AMZN_RESOURCE_CONTNET_ENCODED = "x-amzn-resource-content-encode";
    public static final String SWAGGER_X_AUTH_TYPE = "x-auth-type";
    public static final String SWAGGER_X_THROTTLING_TIER = "x-throttling-tier";
    public static final String SWAGGER_X_THROTTLING_BANDWIDTH = "x-throttling-bandwidth";
    public static final String SWAGGER_X_MEDIATION_SCRIPT = "x-mediation-script";
    public static final String SWAGGER_X_WSO2_SECURITY = "x-wso2-security";
    public static final String WSO2_APP_SECURITY_TYPES = "security-types";
    public static final String OPTIONAL = "optional";
    public static final String MANDATORY = "mandatory";
    public static final String RESPONSE_CACHING_ENABLED = "enabled";
    public static final String RESPONSE_CACHING_TIMEOUT = "cacheTimeoutInSeconds";
    public static final String SWAGGER_X_WSO2_SCOPES = "x-wso2-scopes";
    public static final String SWAGGER_X_EXAMPLES = "x-examples";
    public static final String SWAGGER_SCOPE_KEY = "key";
    public static final String SWAGGER_NAME = "name";
    public static final String SWAGGER_SCHEMES = "schemes";
    public static final String SWAGGER_DESCRIPTION = "description";
    public static final String SWAGGER_SERVERS = "servers";
    public static final String SWAGGER_SUMMARY = "summary";
    public static final String SWAGGER_ROLES = "roles";
    public static final String SWAGGER_TITLE = "title";
    public static final String SWAGGER_EMAIL = "email";
    public static final String SWAGGER_CONTACT = "contact";
    public static final String SWAGGER_SECURITY_TYPE = "type";
    public static final String SWAGGER_SECURITY_OAUTH2 = "oauth2";
    public static final String SWAGGER_SECURITY_OAUTH2_IMPLICIT = "implicit";
    public static final String SWAGGER_SECURITY_OAUTH2_PASSWORD = "password";
    public static final String SWAGGER_SECURITY_OAUTH2_AUTHORIZATION_URL = "authorizationUrl";
    public static final String SWAGGER_SECURITY_OAUTH2_TOKEN_URL = "tokenUrl";
    public static final String SWAGGER_SECURITY_OAUTH2_FLOW = "flow";
    public static final String SWAGGER_VER = "version";
    public static final String SWAGGER_OBJECT_NAME_APIM = "apim";
    public static final String SWAGGER_PATHS = "paths";
    public static final String SWAGGER_RESPONSES = "responses";
    public static final String SWAGGER = "swagger";
    public static final String SWAGGER_HOST = "host";
    public static final String SWAGGER_V2 = "2.0";
    public static final String SWAGGER_INFO = "info";
    public static final String SWAGGER_RESPONSE_200 = "200";
    public static final String SWAGGER_SECURITY_DEFINITIONS = "securityDefinitions";
    public static final String SWAGGER_APIM_DEFAULT_SECURITY = "default";
    public static final String SWAGGER_APIM_RESTAPI_SECURITY = "OAuth2Security";
    public static final String OPEN_API_V3 = "3.0.x";
    public static final String OPEN_API = "openapi";
    public static final String OAS_V31 = "v31";
    public static final String OAS_V30 = "v30";
    public static final String OPEN_API_V31_VERSION = "3.1.0";
    public static final String OPEN_API_VERSION_REGEX = "3\\.0\\.\\d{1,}";
    public static final String SWAGGER_IS_MISSING_MSG = "swagger is missing";
    public static final String OPENAPI_IS_MISSING_MSG = "openapi is missing";
    public static final String SWAGGER_X_SCOPES_BINDINGS = "x-scopes-bindings";
    public static final String SWAGGER_X_BASIC_AUTH_SCOPES = "x-scopes";
    public static final String SWAGGER_X_BASIC_AUTH_RESOURCE_SCOPES = "x-basic-auth-scopes";
    public static final String OPENAPI_SECURITY_SCHEMA_KEY = "default";

    //swagger v1.2 constants
    public static final String SWAGGER_RESOURCES = "resources";
    public static final String ENVIRONMENTS_NONE = "none";
    public static final String SWAGGER_BASEPATH = "basePath";
    public static final String SWAGGER_OPERATIONS = "operations";
    public static final String SWAGGER_SCOPE = "scope";
    public static final String SWAGGER_SCOPES = "scopes";
    public static final String SWAGGER_AUTH_TYPE = "auth_type";
    public static final String API_THROTTLING_TIER = "throttling_tier";
    public static final String API_MEDIATION_SCRIPT = "mediation_script";
    public static final String API_SWAGGER_DOC = "api_doc";
    public static final String SWAGGER_12_AUTH = "authorizations";
    public static final String SWAGGER_12_OAUTH2 = "oauth2";
    public static final String SWAGGER_12_SCOPES = "scopes";
    public static final String API_ARRAY_NAME = "apis";
    public static final String SWAGGER_HTTP_METHOD = "method";
    public static final String SWAGGER_FILE = "file";
    public static final String SWAGGER_RESOURCE_PATH = "resourcePath";
    public static final String API_VERSION = "apiVersion";

    public static final String OPENAPI_OBJECT_DATA_TYPE = "object";
    public static final String OPENAPI_ARRAY_DATA_TYPE = "array";
    public static final String OPENAPI_STRING_DATA_TYPE = "string";
    public static final String OPENAPIV31_SCHEMA_TYPE_NULLABLE = "null";

    //swagger MG related constants
    public static final String X_WSO2_AUTH_HEADER = "x-wso2-auth-header";
    public static final String X_WSO2_API_KEY_HEADER = "x-wso2-api-key-header";
    public static final String X_THROTTLING_TIER = "x-throttling-tier";
    public static final String X_WSO2_CORS = "x-wso2-cors";
    public static final String X_WSO2_PRODUCTION_ENDPOINTS = "x-wso2-production-endpoints";
    public static final String X_WSO2_SANDBOX_ENDPOINTS = "x-wso2-sandbox-endpoints";
    public static final String X_WSO2_BASEPATH = "x-wso2-basePath";
    public static final String X_WSO2_TRANSPORTS = "x-wso2-transports";
    public static final String X_WSO2_MUTUAL_SSL = "x-wso2-mutual-ssl";
    public static final String X_WSO2_APP_SECURITY = "x-wso2-application-security";
    public static final String X_WSO2_RESPONSE_CACHE = "x-wso2-response-cache";
    public static final String X_WSO2_DISABLE_SECURITY = "x-wso2-disable-security";
    public static final String X_WSO2_THROTTLING_TIER = "x-wso2-throttling-tier";
    public static final String X_WSO2_REQUEST_INTERCEPTOR = "x-wso2-request-interceptor";
    public static final String X_WSO2_RESPONSE_INTERCEPTOR = "x-wso2-response-interceptor";
    public static final String X_WSO2_ENDPOINT_TYPE = "type";
    public static final String ADVANCE_ENDPOINT_CONFIG = "advanceEndpointConfig";
    public static final String TIMEOUT_IN_MILLIS = "timeoutInMillis";

    //API Constants
    public static final String API_DATA_NAME = "name";
    public static final String API_DATA_PROVIDER = "provider";
    public static final String API_DATA_VERSION = "version";
    public static final String API_DATA_DESCRIPTION = "description";
    public static final String API_DATA_BUSINESS_OWNER = "businessOwner";
    public static final String API_DATA_RATES = "rates";
    public static final String API_DATA_ENDPOINT = "endpoint";
    public static final String API_DATA_THUMB_URL = "thumbnailurl";
    public static final String API_DATA_VISIBILITY = "visibility";
    public static final String API_DATA_VISIBLE_ROLES = "visibleRoles";
    public static final String DOC_DATA_NAME = "docName";
    public static final String DOC_DATA_SUMMARY = "docSummary";
    public static final String DOC_DATA_SOURCEURL = "docSourceURL";
    public static final String DOC_DATA_FILEPATH = "docFilePath";
    public static final String API_DATA_DEFAULT_THUMB = "images/api-default.png";
    public static final String API_DATA_APIS = "apis";
    public static final String API_DATA_TOT_LENGTH = "totalLength";
    public static final String ADMIN_API_LIST_RESPONSE_PARAMS_TOTAL = "totalLength";
    public static final String API_DATA_LENGTH = "length";
    public static final String API_DATA_ISMORE = "isMore";
    public static final String API_DATA_PRODUCTION_ENDPOINTS = "production_endpoints";
    public static final String API_DATA_SANDBOX_ENDPOINTS = "sandbox_endpoints";
    public static final String API_DATA_URL = "url";
    public static final String API_UUID = "apiUUID";


    public static final String UUID = "uuid";
    public static final String API_SPEC_TYPE = "api_type";
    public static final String API_SPEC_NAME = "api_name";
    public static final String TENANT_DOMAIN = "tenant_domain";
    public static final String QUERY = "query";
    public static final String HISTORY = "history";
    public static final String VERSION = "version";
    public static final String VISIBILITYROLES = "visibility_roles";
    public static final String APIM_VERSION = "apim_version";
    public static final String DESCRIPTION = "description";
    public static final String USERROLES = "user_roles";

    public static final String DEMOTE_TO_CREATED= "Demote to Created";
    public static final String BLOCK = "Block";
    public static final String DEPRECATE = "Deprecate";
    public static final String PUBLISH = "Publish";
    public static final String DEPLOY_AS_A_PROTOTYPE = "Deploy as a Prototype";
    public static final String REPUBLISH = "Re-Publish";

    public static final String API_SPEC_TYPE_REST = "api_spec";
    public static final String API_SPEC_TYPE_GRAPHQL = "sdl_schema";
    public static final String API_SPEC_TYPE_ASYNC = "async_spec";
    public static final String API_TYPE_HTTP = "HTTP";
    public static final String API_TYPE_WEBHOOK = "WEBHOOK";

    public static final String API_TYPE_REST = "REST";

    public static final String API_TYPE_GRAPHQL = "GRAPHQL";
    public static final String API_TYPE_ASYNC = "ASYNC";
    public static final String API_TYPE_PRODUCT = "APIPRODUCT";

    public static final String TRANSPORT_URL_IN = "TransportInURL";

    // mock response generation
    public static final String MOCK_GEN_POLICY_LIST = "policyList";

    public static final String IMPLEMENTATION_STATUS = "implementation_status";
    public static final String ENDPOINT_TYPE_DEFAULT = "default";
    public static final String ENDPOINT_TYPE_FAILOVER = "failover";
    public static final String ENDPOINT_TYPE_LOADBALANCE = "load_balance";
    public static final String ENDPOINT_CONFIG = "endpoint_config";
    public static final String ENDPOINT_TYPE_HTTP = "http";
    public static final String ENDPOINT_TYPE_SERVICE = "service";
    public static final String ENDPOINT_TYPE_ADDRESS = "address";
    public static final String ENDPOINT_TYPE_AWSLAMBDA = "awslambda";
    public static final String ENDPOINT_TYPE_SEQUENCE = "sequence_backend";
    public static final String SEQUENCE_DATA = "sequence";
    public static final String ENDPOINT_PRODUCTION_FAILOVERS = "production_failovers";
    public static final String ENDPOINT_SANDBOX_FAILOVERS = "sandbox_failovers";
    public static final String ENDPOINT_PRODUCTION_ENDPOINTS = "production_endpoints";
    public static final String ENDPOINT_SANDBOX_ENDPOINTS = "sandbox_endpoints";
    public static final String ENDPOINT_URLS = "urls";
    public static final String ENDPOINT_URL = "url";
    public static final String ENDPOINT_SECURITY_TYPE = "type";
    public static final String ENDPOINT_SECURITY_TYPE_NONE = "none";
    public static final String ENDPOINT_SECURITY_TYPE_BASIC = "basic";
    public static final String ENDPOINT_SECURITY_TYPE_DIGEST = "digest";
    public static final String ENDPOINT_SECURITY_TYPE_OAUTH = "oauth";
    public static final String ENDPOINT_SECURITY_TYPE_API_KEY = "apikey";
    public static final String ENDPOINT_SECURITY_API_KEY_IDENTIFIER = "apiKeyIdentifier";
    public static final String ENDPOINT_SECURITY_API_KEY_VALUE = "apiKeyValue";
    public static final String ENDPOINT_SECURITY_API_KEY_IDENTIFIER_TYPE = "apiKeyIdentifierType";
    public static final String ENDPOINT_SECURITY_USERNAME = "username";
    public static final String ENDPOINT_SECURITY_CONFIG = "securityConfig";
    public static final String ENDPOINT_SECURITY = "endpoint_security";
    public static final String ENDPOINT_SECURITY_PRODUCTION = "production";
    public static final String ENDPOINT_SECURITY_SANDBOX = "sandbox";
    public static final String ENDPOINT_SECURITY_PASSWORD = "password";
    public static final String ENDPOINT_SECURITY_CLIENT_ID = "clientId";
    public static final String ENDPOINT_SECURITY_CLIENT_SECRET = "clientSecret";
    public static final String ENDPOINT_SECURITY_ENABLED = "enabled";
    public static final String ENDPOINT_SECURITY_PROXY_PASSWORD = "proxyPassword";
    public static final String CONNECTION_TIMEOUT_CONFIG_TYPE = "connectionTimeoutConfigType";
    public static final String PROXY_CONFIG_TYPE = "proxyConfigType";
    public static final String CONNECTION_TIMEOUT_DURATION = "connectionTimeoutDuration";
    public static final String CONNECTION_REQUEST_TIMEOUT_DURATION = "connectionRequestTimeoutDuration";
    public static final String SOCKET_TIMEOUT_DURATION = "socketTimeoutDuration";
    public static final String PROXY_CONFIGS = "proxyConfigs";
    public static final String PROXY_ENABLED = "proxyEnabled";
    public static final String CONNECTION_TIMEOUT_DEFAULT = "-1";
    public static final String ENDPOINT_SPECIFIC_CONFIG = "config";
    public static final String ENDPOINT_CONFIG_ACTION_DURATION = "actionDuration";
    public static final String ENDPOINT_TYPE_GRAPHQL = "graphql";
    public static final String ENABLE_RETRY_CALL_WITH_NEW_OAUTH_TOKEN = "enableRetryCallWithNewOauthToken";

    public static final String API_ENDPOINT_CONFIG_TIMEOUT = "timeout";
    public static final String API_ENDPOINT_CONFIG_PROTOCOL_TYPE = "endpoint_type";

    public static final String ACTIVITY_ID = "activityID";
    public static final String USER_AGENT = "User-Agent";

    public static final String REST_API_SCOPE = "Scope";
    public static final String REST_API_SCOPE_NAME = "Name";
    public static final String REST_API_SCOPE_ROLE = "Roles";
    public static final String REST_API_SCOPES_CONFIG = "RESTAPIScopes";
    public static final String REST_API_ROLE_MAPPINGS_CONFIG = "RoleMappings";
    public static final String APIM_SUBSCRIBE_SCOPE = "apim:subscribe";
    public static final String APIM_CREATOR_SCOPE = "apim:api_create";
    public static final String APIM_PUBLISHER_SCOPE = "apim:api_publish";

    public static final String HTTPS_PROTOCOL = "https";
    public static final String HTTPS_PROTOCOL_URL_PREFIX = "https://";
    public static final String HTTP_PROTOCOL = "http";
    public static final String HTTP_PROTOCOL_URL_PREFIX = "http://";
    public static final int HTTPS_PROTOCOL_PORT = 443;
    public static final int HTTP_PROTOCOL_PORT = 80;

    public static final String WS_PROTOCOL = "ws";
    public static final String WS_PROTOCOL_URL_PREFIX = "ws://";
    public static final String WSS_PROTOCOL = "wss";
    public static final String WSS_PROTOCOL_URL_PREFIX = "wss://";
    public static final int WSS_PROTOCOL_PORT = 8099;
    public static final int WS_PROTOCOL_PORT = 9099;

    public static final String EMAIL_TRANSPORT = "mailto";

    public static final long MAX_FILE_SIZE = 1024L;

    public static final String REGISTRY_RESOURCE_PREFIX = "/registry/resource";
    public static final String REGISTRY_RESOURCE_URL_PREFIX =
            "/registry/resource/_system/governance/apimgt/applicationdata/provider/";

    public static final String APPLICATION_DATA_RESOURCE_URL_PREFIX =
            "/apimgt/applicationdata/provider/";

    public enum RegistryResourceTypesForUI {
        TAG_THUMBNAIL
    }

    public static final String API_LC_ACTION_DEPRECATE = "Deprecate";
    public static final String DEPRECATE_CHECK_LIST_ITEM = "Deprecate old versions after publishing the API";
    public static final String DEPRECATE_CHECK_LIST_ITEM_API_PRODUCT = "Deprecate old versions after publishing the API Product";
    public static final String RESUBSCRIBE_CHECK_LIST_ITEM = "Requires re-subscription when publishing the API";
    public static final String RESUBSCRIBE_CHECK_LIST_ITEM_API_PRODUCT = "Requires re-subscription when publishing the API Product";
    public static final String PUBLISH_IN_PRIVATE_JET_MODE = "Publish In Private-Jet Mode";

    public static final String METRICS_PREFIX = "org.wso2.am";

    public static final String MSG_JSON_PARSE_ERROR = "Unable to parse endpoint config JSON";
    public static final String MSG_TIER_RET_ERROR = "Error while retrieving API tiers from registry";
    public static final String MSG_MALFORMED_XML_ERROR = "Malformed XML found in the API tier policy resource";

    //Doc search related constants

    public static final String PUBLISHER_CLIENT = "Publisher";
    public static final String STORE_CLIENT = "Store";

    public static final String WSDL_REGISTRY_LOCATION_PREFIX = "/registry/resource";
    public static final String HOST_NAME = "HostName";
    public static final int DEFAULT_HTTPS_PORT = 443;
    public static final String PROXY_CONTEXT_PATH = "ProxyContextPath";

    //Constants for swagger-codegen client generation
    public static final String CLIENT_CODEGEN_GROUPID = "SwaggerCodegen.ClientGeneration.GroupId";
    public static final String CLIENT_CODEGEN_ARTIFACTID = "SwaggerCodegen.ClientGeneration.ArtifactId";
    public static final String CLIENT_CODEGEN_MODAL_PACKAGE = "SwaggerCodegen.ClientGeneration.ModelPackage";
    public static final String CLIENT_CODEGEN_API_PACKAGE = "SwaggerCodegen.ClientGeneration.ApiPackage";
    public static final String CLIENT_CODEGEN_SUPPORTED_LANGUAGES =
            "SwaggerCodegen.ClientGeneration.SupportedLanguages";

    public static final String TEMP_DIRECTORY_NAME = "tmp";
    public static final String SWAGGER_CODEGEN_DIRECTORY = "swaggerCodegen";
    public static final String JSON_FILE_EXTENSION = ".json";
    public static final String ZIP_FILE_EXTENSION = ".zip";
    public static final String YAML_FILE_EXTENSION = ".yaml";
    public static final String YML_FILE_EXTENSION = ".yml";

    //Starts CEP based throttling policy implementation related constants
    public static final String CPS_SERVER_URL = "CPSServerUrl";
    public static final String CPS_SERVER_USERNAME = "CPSServerUsername";
    public static final String CPS_SERVER_PASSWORD = "CPSServerPassword";
    public static final String POLICY_FILE_FOLDER = "repository" + File.separator + "deployment" + File.separator +
            "server" + File.separator + "throttle-config";
    public static final String SEQUENCE_FILE_FOLDER = "repository" + File.separator + "deployment" + File.separator +
            "server" + File.separator + "synapse-configs" + File.separator + "default" + File.separator + "sequences";
    public static final String POLICY_FILE_LOCATION = POLICY_FILE_FOLDER + File.separator;
    public static final String SEQUENCE_FILE_LOCATION = SEQUENCE_FILE_FOLDER + File.separator;

    public static final String ELIGIBILITY_QUERY_ELEM = "eligibilityQuery";
    public static final String POLICY_NAME_ELEM = "name";
    public static final String DECISION_QUERY_ELEM = "decisionQuery";
    public static final String XML_EXTENSION = ".xml";

    public static final String POLICY_TEMPLATE_KEY = "keyTemplateValue";
    public static final String TEMPLATE_KEY_STATE = "keyTemplateState";

    public static final String THROTTLE_POLICY_DEFAULT = "_default";
    public static final String THROTTLE_POLICY_CONDITION = "_condition_";

    //Advanced throttling related constants
    public static final String TIME_UNIT_SECOND = "sec";
    public static final String TIME_UNIT_MINUTE = "min";
    public static final String TIME_UNIT_HOUR = "hours";
    public static final String TIME_UNIT_DAY = "days";
    public static final String TIME_UNIT_MONTH = "months";

    public static final String SUBSCRIPTION_TIERS = "availableTiers";

    public static final String DEFAULT_APP_POLICY_FIFTY_REQ_PER_MIN = "50PerMin";
    public static final String DEFAULT_APP_POLICY_TWENTY_REQ_PER_MIN = "20PerMin";
    public static final String DEFAULT_APP_POLICY_TEN_REQ_PER_MIN = "10PerMin";
    public static final String DEFAULT_APP_POLICY_UNLIMITED = "Unlimited";

    public static final String DEFAULT_APP_POLICY_LARGE_DESC = "Allows 50 request per minute";
    public static final String DEFAULT_APP_POLICY_MEDIUM_DESC = "Allows 20 request per minute";
    public static final String DEFAULT_APP_POLICY_SMALL_DESC = "Allows 10 request per minute";
    public static final String DEFAULT_APP_POLICY_UNLIMITED_DESC = "Allows unlimited requests";

    public static final String DEFAULT_SUB_POLICY_GOLD = "Gold";
    public static final String DEFAULT_SUB_POLICY_SILVER = "Silver";
    public static final String DEFAULT_SUB_POLICY_BRONZE = "Bronze";
    public static final String DEFAULT_SUB_POLICY_UNLIMITED = "Unlimited";
    public static final String DEFAULT_SUB_POLICY_UNAUTHENTICATED = "Unauthenticated";
    public static final String DEFAULT_SUB_POLICY_SUBSCRIPTIONLESS = "DefaultSubscriptionless";

    public static final String DEFAULT_SUB_POLICY_ASYNC_GOLD = "AsyncGold";
    public static final String DEFAULT_SUB_POLICY_ASYNC_SILVER = "AsyncSilver";
    public static final String DEFAULT_SUB_POLICY_ASYNC_BRONZE = "AsyncBronze";
    public static final String DEFAULT_SUB_POLICY_ASYNC_UNLIMITED = "AsyncUnlimited";
    public static final String DEFAULT_SUB_POLICY_ASYNC_SUBSCRIPTIONLESS = "AsyncDefaultSubscriptionless";

    public static final String DEFAULT_SUB_POLICY_ASYNC_WH_GOLD = "AsyncWHGold";
    public static final String DEFAULT_SUB_POLICY_ASYNC_WH_SILVER = "AsyncWHSilver";
    public static final String DEFAULT_SUB_POLICY_ASYNC_WH_BRONZE = "AsyncWHBronze";
    public static final String DEFAULT_SUB_POLICY_ASYNC_WH_UNLIMITED = "AsyncWHUnlimited";

    public static final String DEFAULT_SUB_POLICY_AI_GOLD = "AIGold";
    public static final String DEFAULT_SUB_POLICY_AI_SILVER = "AISilver";
    public static final String DEFAULT_SUB_POLICY_AI_BRONZE = "AIBronze";

    public static final String DEFAULT_SUB_POLICY_GOLD_DESC = "Allows 5000 requests per minute";
    public static final String DEFAULT_SUB_POLICY_SILVER_DESC = "Allows 2000 requests per minute";
    public static final String DEFAULT_SUB_POLICY_BRONZE_DESC = "Allows 1000 requests per minute";
    public static final String DEFAULT_SUB_POLICY_UNLIMITED_DESC = "Allows unlimited requests";
    public static final String DEFAULT_SUB_POLICY_UNAUTHENTICATED_DESC = "Allows 500 request(s) per minute";
    public static final String DEFAULT_SUB_POLICY_SUBSCRIPTIONLESS_DESC =
            "Allows 10000 requests per minute when subscription validation is disabled";

    public static final String DEFAULT_SUB_POLICY_ASYNC_GOLD_DESC = "Allows 50000 events per day";
    public static final String DEFAULT_SUB_POLICY_ASYNC_SILVER_DESC = "Allows 25000 events per day";
    public static final String DEFAULT_SUB_POLICY_ASYNC_BRONZE_DESC = "Allows 5000 events per day";
    public static final String DEFAULT_SUB_POLICY_ASYNC_UNLIMITED_DESC = "Allows unlimited events";
    public static final String DEFAULT_SUB_POLICY_ASYNC_SUBSCRIPTIONLESS_DESC =
            "Allows 10000 events per day when subscription validation is disabled";

    public static final String DEFAULT_SUB_POLICY_ASYNC_WH_GOLD_DESC = "Allows 10000 events per month and " +
            "1000 active subscriptions";
    public static final String DEFAULT_SUB_POLICY_ASYNC_WH_SILVER_DESC = "Allows 5000 events per month and " +
            "500 active subscriptions";
    public static final String DEFAULT_SUB_POLICY_ASYNC_WH_BRONZE_DESC = "Allows 1000 events per month and " +
            "500 active subscriptions";
    public static final String DEFAULT_SUB_POLICY_ASYNC_WH_UNLIMITED_DESC = "Allows unlimited events and " +
            "unlimited active subscriptions";

    public static final String DEFAULT_SUB_POLICY_AI_GOLD_DESC = "Allows 50000 total tokens and 500 requests per minute";
    public static final String DEFAULT_SUB_POLICY_AI_SILVER_DESC = "Allows 10000 total tokens and 100 requests per minute";
    public static final String DEFAULT_SUB_POLICY_AI_BRONZE_DESC = "Allows 1000 total tokens and 10 requests per minute";

    public static final String DEFAULT_API_POLICY_FIFTY_THOUSAND_REQ_PER_MIN = "50KPerMin";
    public static final String DEFAULT_API_POLICY_TWENTY_THOUSAND_REQ_PER_MIN = "20KPerMin";
    public static final String DEFAULT_API_POLICY_TEN_THOUSAND_REQ_PER_MIN = "10KPerMin";
    public static final String DEFAULT_API_POLICY_UNLIMITED = "Unlimited";

    public static final String DEFAULT_API_POLICY_ULTIMATE_DESC = "Allows 50000 requests per minute";
    public static final String DEFAULT_API_POLICY_PLUS_DESC = "Allows 20000 requests per minute";
    public static final String DEFAULT_API_POLICY_BASIC_DESC = "Allows 10000 requests per minute";
    public static final String DEFAULT_API_POLICY_UNLIMITED_DESC = "Allows unlimited requests";

    public static final String API_POLICY_USER_LEVEL = "userLevel";
    public static final String API_POLICY_API_LEVEL = "apiLevel";

    public static final String BILLING_PLAN_FREE = "FREE";
    public static final String DEFAULT_VISIBLE_ORG = "all";
    public static final String VISIBLE_ORG_NONE = "none";
    public static final String VISIBLE_ORG_ALL = "all";
    public static final String POLICY_RESET = "reset";

    public static final String BLOCKING_EVENT_TYPE = "wso2event";
    public static final String BLOCKING_EVENT_FORMAT = "wso2event";
    public static final String THROTTLE_KEY = "throttleKey";
    public static final String BLOCKING_CONDITION_STATE = "state";
    public static final String BLOCKING_CONDITION_KEY = "blockingCondition";
    public static final String BLOCKING_CONDITION_VALUE = "conditionValue";
    public static final String BLOCKING_CONDITION_DOMAIN = "tenantDomain";
    public static final String BLOCKING_CONDITIONS_APPLICATION = "APPLICATION";
    public static final String BLOCKING_CONDITIONS_API = "API";
    public static final String BLOCKING_CONDITIONS_USER = "USER";
    public static final String BLOCKING_CONDITIONS_SUBSCRIPTION = "SUBSCRIPTION";
    public static final String BLOCKING_CONDITIONS_IP = "IP";
    public static final String BLOCK_CONDITION_IP_RANGE = "IPRANGE";
    public static final String BLOCK_CONDITION_FIXED_IP = "fixedIp";
    public static final String BLOCK_CONDITION_START_IP = "startingIp";
    public static final String BLOCK_CONDITION_ENDING_IP = "endingIp";
    public static final String BLOCK_CONDITION_INVERT = "invert";
    public static final String BLOCK_CONDITION_IP_TYPE = "type";
    public static final String BLOCK_CONDITION_TYPE = "conditionType";
    public static final String BLOCK_CONDITION_VALUE = "conditionValue";
    public static final String REVOKED_TOKEN_KEY = "revokedToken";
    public static final String REVOKED_TOKEN_EXPIRY_TIME = "expiryTime";
    public static final String EVENT_TYPE = "eventType";
    public static final String EVENT_WAITING_TIME_CONFIG = "EventWaitingTime";
    public static final String EVENT_TIMESTAMP = "timestamp";
    public static final String EVENT_PAYLOAD = "event";
    public static final String EVENT_PAYLOAD_DATA = "payloadData";

    public static final String SEARCH_AND_TAG = "&";
    public static final String LCSTATE_SEARCH_TYPE_KEY = "lcState=";
    public static final String ENABLE_STORE_SEARCH_TYPE_KEY = "enableStore=(true OR null)";
    public static final String LCSTATE_SEARCH_KEY = "lcState";
    public static final String DOCUMENTATION_SEARCH_TYPE_PREFIX = "doc";
    public static final String DOCUMENTATION_SEARCH_TYPE_PREFIX_WITH_EQUALS = "doc=";
    public static final String TAGS_SEARCH_TYPE_PREFIX = "tags";
    public static final String TAGS_EQ_SEARCH_TYPE_PREFIX = "tags=";
    public static final String TAG_SEARCH_TYPE_PREFIX = "tag";
    public static final String TAG_COLON_SEARCH_TYPE_PREFIX = "tag:";
    public static final String NAME_TYPE_PREFIX = "name";
    private static final String PROVIDER_SEARCH_TYPE_PREFIX = "provider";
    private static final String VERSION_SEARCH_TYPE_PREFIX = "version";
    private static final String CONTEXT_SEARCH_TYPE_PREFIX = "context";
    public static final String CONTENT_SEARCH_TYPE_PREFIX = "content";
    public static final String TYPE_SEARCH_TYPE_PREFIX = "type";
    public static final String LABEL_SEARCH_TYPE_PREFIX = "label";
    public static final String CATEGORY_SEARCH_TYPE_PREFIX = "api-category";
    public static final String ENABLE_STORE = "enableStore";

    //api-product related constants
    public static final String API_PRODUCT_VERSION_1_0_0 = "1.0.0";
    public static final String API_IDENTIFIER_TYPE = "API";
    public static final String API_PRODUCT_IDENTIFIER_TYPE = "API Product";
    public static final String[] API_SUPPORTED_TYPE_LIST = {"HTTP", "WS", "SOAPTOREST", "GRAPHQL", "SOAP", "WEBSUB",
            "SSE", "ASYN" +
            "C"};
    public static final String API_SUBTYPE_DEFAULT = "DEFAULT";
    public static final String API_SUBTYPE_AI_API = "AIAPI";
    public static final String API_PRODUCT_REVISION = "Current";
    public static class AdvancedThrottleConstants {

        public static final String THROTTLING_CONFIGURATIONS = "ThrottlingConfigurations";
        public static final String TRAFFIC_MANAGER = "TrafficManager";

        public static final String DATA_PUBLISHER_CONFIGURATION = "DataPublisher";
        public static final String DATA_PUBLISHER_CONFIGURAION_TYPE = "Type";
        public static final String PROPERTIES_CONFIGURATION = "Properties";
        public static final String DATA_PUBLISHER_CONFIGURAION_REVEIVER_URL_GROUP = "ReceiverUrlGroup";
        public static final String DATA_PUBLISHER_CONFIGURAION_AUTH_URL_GROUP = "AuthUrlGroup";
        public static final String USERNAME = "Username";
        public static final String PASSWORD = "Password";

        public static final String DATA_PUBLISHER_POOL_CONFIGURATION = "DataPublisherPool";
        public static final String DATA_PUBLISHER_POOL_CONFIGURAION_MAX_IDLE = "MaxIdle";
        public static final String DATA_PUBLISHER_POOL_CONFIGURAION_INIT_IDLE = "InitIdleCapacity";

        public static final String GLOBAL_POLICY_ENGINE_WS_CONFIGURATION = "GlobalPolicyEngineWSConnectionDetails";
        public static final String SERVICE_URL = "ServiceURL";
        public static final String JMS_CONNECTION_DETAILS = "JMSConnectionDetails";
        public static final String JMS_CONNECTION_PARAMETERS = "JMSConnectionParameters";
        public static final String JMS_PUBLISHER_PARAMETERS = "JMSEventPublisherParameters";
        public static final String DEFAULT_THROTTLE_LIMITS = "DefaultLimits";
        public static final String SUBSCRIPTION_THROTTLE_LIMITS = "SubscriptionTierLimits";
        public static final String APPLICATION_THROTTLE_LIMITS = "ApplicationTierLimits";
        public static final String RESOURCE_THROTTLE_LIMITS = "ResourceLevelTierLimits";
        public static final String JMS_TASK_MANAGER = "JMSTaskManager";
        public static final String MIN_THREAD_POOL_SIZE = "MinThreadPoolSize";
        public static final String MAX_THREAD_POOL_SIZE = "MaxThreadPoolSize";
        public static final String KEEP_ALIVE_TIME_IN_MILLIS = "KeepAliveTimeInMillis";
        public static final String JOB_QUEUE_SIZE = "JobQueueSize";
        public static final String ENABLE_UNLIMITED_TIER = "EnableUnlimitedTier";
        public static final String POLICY_DEPLOYER_CONFIGURATION = "PolicyDeployer";
        public static final String BLOCK_CONDITION_RETRIEVER_CONFIGURATION = "BlockCondition";
        public static final String DATA_PUBLISHER_THREAD_POOL_CONFIGURATION = "DataPublisherThreadPool";
        public static final String DATA_PUBLISHER_THREAD_POOL_CONFIGURATION_CORE_POOL_SIZE = "CorePoolSize";
        public static final String DATA_PUBLISHER_THREAD_POOL_CONFIGURATION_MAXMIMUM_POOL_SIZE = "MaxmimumPoolSize";
        public static final String DATA_PUBLISHER_THREAD_POOL_CONFIGURATION_KEEP_ALIVE_TIME = "KeepAliveTime";
        public static final String BLOCK_CONDITION_RETRIEVER_INIT_DELAY = "InitDelay";
        public static final String BLOCK_CONDITION_RETRIEVER_PERIOD = "Period";
        public static final String ENABLE_SUBSCRIPTION_SPIKE_ARREST = "EnableSubscriptionSpikeArrest";
        public static final String ENABLE_HEADER_CONDITIONS = "EnableHeaderConditions";
        public static final String ENABLE_JWT_CLAIM_CONDITIONS = "EnableJWTClaimConditions";
        public static final String ENABLE_QUERY_PARAM_CONDITIONS = "EnableQueryParamConditions";
        public static final String SKIP_REDEPLOYING_POLICIES = "SkipRedeployingPolicies";
        public static final String ENABLED = "Enabled";
        public static final String IS_THROTTLED = "isThrottled";
        public static final String THROTTLE_KEY = "throttleKey";
        public static final String EXPIRY_TIMESTAMP = "expiryTimeStamp";
        public static final String EVALUATED_CONDITIONS = "evaluatedConditions";
        public static final String TRUE = "true";
        public static final String ADD = "add";
        public static final String ENABLE_POLICY_DEPLOYMENT = "EnablePolicyDeployment";
        public static final String ENABLE_POLICY_RECREATE = "EnablePolicyRecreationOnStartup";
    }

    /**
     * Parameter for adding custom attributes against application in API Store
     */
    public static class ApplicationAttributes {

        public static final String APPLICATION_CONFIGURATIONS = "ApplicationConfigs";
        public static final String APPLICATION_ATTRIBUTES = "ApplicationAttributes";
        public static final String ATTRIBUTES = "Attributes";
        public static final String ATTRIBUTE = "Attribute";
        public static final String REQUIRED = "Required";
        public static final String HIDDEN = "Hidden";
        public static final String DESCRIPTION = "Description";
        public static final String DEFAULT = "Default";
        public static final String NAME = "Name";
        public static final String TOOLTIP = "Tooltip";
        public static final String TYPE = "Type";
        public static final String ENABLE_EMPTY_VALUES_IN_APPLICATION_ATTRIBUTES = "EnableEmptyValuesInApplicationAttributes";
        public static final String USER_ORGANIZATION = "INTERNAL_USER_ORGANIZATION_PROP";
    }

    public static class CustomPropertyAttributes {
        public static final String PROPERTY_CONFIGURATIONS = "PropertyConfigurations";
        public static final String CUSTOM_PROPERTIES = "CustomProperties";
        public static final String PROPERTIES = "Properties";
        public static final String PROPERTY = "Property";
        public static final String REQUIRED = "Required";
        public static final String HIDDEN = "Hidden";
        public static final String DESCRIPTION = "Description";
        public static final String DEFAULT = "Default";
        public static final String NAME = "Name";
    }

    public static final String REGISTRY_ARTIFACT_SEARCH_DESC_ORDER = "DES";
    public static final String REGISTRY_ARTIFACT_SORT_BY_CREATED_TIME = "meta_created_date";

    public static final String MULTI_ATTRIBUTE_SEPARATOR_DEFAULT = ",";
    public static final String MULTI_ATTRIBUTE_SEPARATOR = "MultiAttributeSeparator";
    public static final String CUSTOM_URL = "customUrl";
    public static final String API_PRODUCT = "APIProduct";

    public static class AuditLogConstants {

        public static final String CREATED = "created";
        public static final String UPDATED = "updated";
        public static final String DELETED = "deleted";
        public static final String DEPLOYED = "deployed";
        public static final String UNDEPLOYED = "undeployed";
        public static final String LIFECYCLE_CHANGED = "lifecycle-changed";

        public static final String API = "API";
        public static final String SYSTEM = "SYSTEM";
        public static final String ORGANIZATION = "Organization";
        public static final String API_PRODUCT = "APIProduct";
        public static final String APPLICATION = "Application";
        public static final String SUBSCRIPTION = "Subscription";
        public static final String KEY_MANAGER = "KeyManager/IdP";
        public static final String DOCUMENT = "Document";
        public static final String DOCUMENT_CONTENT = "DocumentContent";

        public static final String NAME = "name";
        public static final String SCOPE = "scope";
        public static final String OPERATION_POLICY = "operation_policy";
        public static final String VERSION = "version";
        public static final String CONTEXT = "context";
        public static final String PROVIDER = "provider";
        public static final String OWNER = "owner";
        public static final String TIER = "tier";
        public static final String API_ID = "apiId";
        public static final String DOCUMENT_ID = "documentId";
        public static final String TYPE = "type";
        public static final String REQUESTED_TIER = "requested_tier";
        public static final String CALLBACK = "callbackURL";
        public static final String GROUPS = "groups";
        public static final String STATUS = "status";
        public static final String API_NAME = "api_name";
        public static final String API_PRODUCT_NAME = "api_product_name";
        public static final String APPLICATION_NAME = "application_name";
        public static final String APPLICATION_ID = "application_id";

        public static final String ADVANCED_POLICIES = "AdvancedPolicies";
        public static final String APPLICATION_POLICIES = "ApplicationPolicies";
        public static final String SUBSCRIPTION_POLICIES = "SubscriptionPolicies";
        public static final String CUSTOM_POLICIES = "CustomPolicies";
        public static final String DENY_POLICIES = "DenyPolicies";

        public static final String TENANT_CONFIG = "TenantConfig";
        public static final String TENANT_CONFIG_INFO = "User updated Tenant Config";

        public static final String API_CATEGORIES = "APICategories";
        public static final String LABELS = "Labels";
        public static final String APPLICATIONS = "Applications";
        public static final String GATEWAY_ENVIRONMENTS = "GatewayEnvironments";
        public static final String ROLES_FOR_SCOPE = "RolesForScope";
        public static final String ROLES_FOR_SCOPE_INFO = "User updated roles for a scope";
        public static final String SYSTEM_SCOPE_ROLE_ALIASES = "SystemScopesRoleAliases";
        public static final String WORKFLOW_STATUS = "WorkflowStatus";
    }

    public static final String API_WORKFLOW_STATE_ATTR = "overview_workflowState";

    public static class WorkflowConfigConstants {

        public static final String WORKFLOW = "WorkflowConfigurations";
        public static final String WORKFLOW_ENABLED = "Enabled";
        public static final String WORKFLOW_SERVER_URL = "ServerUrl";
        public static final String WORKFLOW_SERVER_USER = "ServerUser";
        public static final String WORKFLOW_SERVER_PASSWORD = "ServerPassword";
        public static final String WORKFLOW_CALLBACK = "WorkflowCallbackAPI";
        public static final String WORKFLOW_TOKEN_EP = "TokenEndPoint";
        public static final String WORKFLOW_DCR_EP = "DCREndPoint";
        public static final String WORKFLOW_DCR_EP_USER = "DCREndPointUser";
        public static final String WORKFLOW_DCR_EP_PASSWORD = "DCREndPointPassword";
        public static final String LIST_PENDING_TASKS = "ListPendingTasks";

    }

    public static class AccessTokenBinding {

        public static final String ACCESS_TOKEN_BINDING = "AccessTokenBinding";
        public static final String ACCESS_TOKEN_BINDING_ENABLED = ACCESS_TOKEN_BINDING + ".Enabled";
    }

    public static class JwtTokenConstants {

        public static final String APPLICATION = "application";
        public static final String APPLICATION_ID = "id";
        public static final String APPLICATION_UUID = "uuid";
        public static final String APPLICATION_NAME = "name";
        public static final String APPLICATION_TIER = "tier";
        public static final String APPLICATION_OWNER = "owner";
        public static final String KEY_TYPE = "keytype";
        public static final String CONSUMER_KEY = "consumerKey";
        public static final String AUTHORIZED_PARTY = "azp";
        public static final String KEY_ID = "kid";
        public static final String AUDIENCE = "aud";
        public static final String JWT_ID = "jti";
        public static final String SUBSCRIPTION_TIER = "subscriptionTier";
        public static final String SUBSCRIBER_TENANT_DOMAIN = "subscriberTenantDomain";
        public static final String TIER_INFO = "tierInfo";
        public static final String STOP_ON_QUOTA_REACH = "stopOnQuotaReach";
        public static final String SPIKE_ARREST_LIMIT = "spikeArrestLimit";
        public static final String SPIKE_ARREST_UNIT = "spikeArrestUnit";
        public static final String SCOPE = "scope";
        public static final String SCOPE_DELIMITER = " ";
        public static final String ISSUED_TIME = "iat";
        public static final String EXPIRY_TIME = "exp";
        public static final String JWT_KID = "kid";
        public static final String SIGNATURE_ALGORITHM = "alg";
        public static final String BACKEND_TOKEN = "backendJwt";
        public static final String SUBSCRIBED_APIS = "subscribedAPIs";
        public static final String API_CONTEXT = "context";
        public static final String API_VERSION = "version";
        public static final String API_PUBLISHER = "publisher";
        public static final String API_NAME = "name";
        public static final String QUOTA_TYPE = "tierQuotaType";
        public static final String QUOTA_TYPE_BANDWIDTH = "bandwidthVolume";
        public static final String PERMITTED_IP = "permittedIP";
        public static final String PERMITTED_REFERER = "permittedReferer";
        public static final String GRAPHQL_MAX_DEPTH = "graphQLMaxDepth";
        public static final String GRAPHQL_MAX_COMPLEXITY = "graphQLMaxComplexity";
        public static final String AUTHORIZED_USER_TYPE = "aut";
        public static final String ISSUER_IDENTIFIER = "iss";
        public static final String END_USERNAME = "sub";
        public static final String INTERNAL_KEY_TOKEN_TYPE = "InternalKey";
        public static final String TOKEN_TYPE = "token_type";
        public static final String API_KEY_TOKEN_TYPE = "apiKey";
        public static final String DECODING_ALGORITHM_BASE64URL = "base64url";
        public static final String APP_DOMAIN = "app_td";
        public static final String USER_DOMAIN = "user_td";
    }

    public static final String SIGNATURE_ALGORITHM_RS256 = "RS256";
    public static final String SIGNATURE_ALGORITHM_SHA256_WITH_RSA = "SHA256withRSA";

    public static class APIEndpointSecurityConstants {

        public static final String BASIC_AUTH = "BasicAuth";
        public static final String DIGEST_AUTH = "DigestAuth";
        public static final String OAUTH = "OAuth";
    }

    public enum APITransportType {
        HTTP, WS, GRAPHQL, WEBSUB, SSE, WEBHOOK, ASYNC
    }

    public static final String API_TYPE_WEBSUB = "WEBSUB";
    public static final String API_TYPE_SSE = "SSE";

    public static final String API_TYPE_SOAP = "SOAP";
    public static final String API_TYPE_SOAPTOREST = "SOAPTOREST";

    public static final String[] HTTP_DEFAULT_METHODS = {"get", "put", "post", "delete", "patch"};
    public static final String[] SOAP_DEFAULT_METHODS = {"post"};
    public static final String[] SSE_DEFAULT_METHODS = {"get"};
    public static final String[] WS_DEFAULT_METHODS = {"post"};
    public static final String[] WEBSUB_DEFAULT_METHODS = {"post"};
    public static final String[] WEBSUB_SUPPORTED_METHODS = { "subscribe" };
    public static final String[] SSE_SUPPORTED_METHODS = { "subscribe" };
    public static final String[] WS_SUPPORTED_METHODS = { "subscribe", "publish" };

    public static final String JSON_GRANT_TYPES = "grant_types";
    public static final String JSON_USERNAME = "username";
    public static final String REGEX_ILLEGAL_CHARACTERS_FOR_API_METADATA = "[~!@#;:%^*()+={}|<>\"\',\\[\\]&/$\\\\]";
    public static final String REGEX_URL_TEMPLATE_PLACEHOLDERS = "\\{.*?}";
    public static final String URL_SCHEME_SEPARATOR = "://";
    public static final String JSON_CLIENT_ID = "client_id";
    public static final String JSON_ADDITIONAL_PROPERTIES = "additionalProperties";
    public static final String JSON_CLIENT_SECRET = "client_secret";
    public static final String JSON_CALLBACK_URL = "callbackUrl";

    /**
     * Publisher Access Control related registry properties and values.
     */
    public static final String PUBLISHER_ROLES = "publisher_roles";
    public static final String DISPLAY_PUBLISHER_ROLES = "display_publisher_roles";
    public static final String ACCESS_CONTROL = "publisher_access_control";
    public static final String NO_ACCESS_CONTROL = "all";
    public static final String NULL_USER_ROLE_LIST = "null";

    /**
     * CustomIndexer property to indicate whether it is gone through API Custom Indexer.
     */
    public static final String CUSTOM_API_INDEXER_PROPERTY = "registry.customIndexer";
    public static final String VISIBLE_ORGANIZATION_PROPERTY = "visible_organizations";

    /**
     * Parameter related with accessControl support.
     */
    public static final String ACCESS_CONTROL_PARAMETER = "accessControl";
    public static final String ACCESS_CONTROL_ROLES_PARAMETER = "accessControlRoles";

    // Error message that will be shown when the user tries to access the API, that is not authorized for him.
    public static final String UN_AUTHORIZED_ERROR_MESSAGE = "User is not authorized to";

    // Prefix used for saving the custom properties related with APIs
    public static final String API_RELATED_CUSTOM_PROPERTIES_PREFIX = "api_meta.";
    // Reserved keywords for search.
    public static final String[] API_SEARCH_PREFIXES = {DOCUMENTATION_SEARCH_TYPE_PREFIX, TAGS_SEARCH_TYPE_PREFIX,
            NAME_TYPE_PREFIX, PROVIDER_SEARCH_TYPE_PREFIX, CONTEXT_SEARCH_TYPE_PREFIX,
            VERSION_SEARCH_TYPE_PREFIX, LCSTATE_SEARCH_KEY.toLowerCase(), API_DESCRIPTION.toLowerCase(),
            API_STATUS.toLowerCase(), CONTENT_SEARCH_TYPE_PREFIX, TYPE_SEARCH_TYPE_PREFIX, LABEL_SEARCH_TYPE_PREFIX,
            CATEGORY_SEARCH_TYPE_PREFIX, ENABLE_STORE.toLowerCase()};
    // Prefix for registry attributes.
    public static final String OVERVIEW_PREFIX = "overview_";
    /**
     * Parameter for enabling tenant load notifications to members in the same HZ cluster
     */
    public static final String ENABLE_TENANT_LOAD_NOTIFICATION = "enableTenantLoadNotification";

    public static final String STORE_VIEW_ROLES = "store_view_roles";
    public static final String PUBLIC_STORE_VISIBILITY = "public";
    public static final String RESTRICTED_STORE_VISIBILITY = "restricted";

    public static final String CREATED_DATE = "createdDate";

    public static final String UNLIMITED_TIER_NAME = "unlimited";
    public static final String FAULT_SEQUENCE = "fault";
    public static final String OUT_SEQUENCE = "out";

    public static final String ENABLE_DUPLICATE_SCOPES = "enableDuplicateScopes";

    public static final String USER = "user";
    public static final String IS_SUPER_TENANT = "isSuperTenant";
    public static final String NULL_GROUPID_LIST = "null";

    public static final String APPLICATION_GZIP = "application/gzip";
    public static final String APPLICATION_ZIP = "application/zip";
    public static final String APPLICATION_X_ZIP_COMPRESSED = "application/x-zip-compressed";
    public static final String JAVA_IO_TMPDIR = "java.io.tmpdir";
    public static final String JSON_FILENAME_EXTENSION = ".json";
    public static final String JSON_GZIP_FILENAME_EXTENSION = ".json.gz";
    public static final String MIGRATION_MODE = "migrationMode";

    /**
     * Constants for correlation logging
     */
    public static final String CORRELATION_ID = "Correlation-ID";
    public static final String ENABLE_CORRELATION_LOGS = "enableCorrelationLogs";
    public static final String CORRELATION_LOGGER = "correlation";
    public static final String LOG_ALL_METHODS = "logAllMethods";
    public static final String AM_ACTIVITY_ID = "activityid";
    public static final String CORRELATION_LOG_COMPONENTS = "CorrelationLogComponents.CorrelationLogComponent";

    /**
     * Constants for API logging
     */
    public static final String API_LOGGER = "API_LOG";
    public static final String LOG_LEVEL = "LOG_LEVEL";
    public static final String LOG_LEVEL_OFF = "OFF";
    public static final String LOG_LEVEL_BASIC = "BASIC";
    public static final String LOG_LEVEL_STANDARD = "STANDARD";
    public static final String LOG_LEVEL_FULL = "FULL";
    public static final String RESOURCE_METHOD = "HTTP_METHOD";
    public static final String RESOURCE_PATH = "URL_PATTERN";
    public static final String METHOD_FOR_RESOURCE = "resourceMethod";
    public static final String PATH_FOR_RESOURCE = "resourcePath";
    public static final String API_CONTEXT_FOR_RESOURCE = "context";
    public static final String PDF_EXTENSION = "pdf";
    public static final String XLS_EXTENSION = "xls";
    public static final String XLSX_EXTENSION = "xlsx";
    public static final String PPT_EXTENSION = "ppt";
    public static final String PPTX_EXTENSION = "pptx";
    public static final String DOC_EXTENSION = "doc";
    public static final String DOCX_EXTENSION = "docx";
    public static final String XML_DOC_EXTENSION = "xml";
    public static final String TXT_EXTENSION = "txt";
    public static final String WSDL_EXTENSION = "wsdl";

    public static final String API_STATE_CHANGE_INDICATOR = "registry.api.state.change.indicator";
    public static final String DOCUMENT_MEDIA_TYPE_KEY = "application/vnd.wso2-document\\+xml";
    public static final String DOCUMENT_INDEXER_INDICATOR = "document_indexed";

    public static final String KEY_SUFFIX = "_KEY";

    public static final String COLUMN_PRODUCT_DEFINITION = "DEFINITION";
    public static final String PRODUCTSCOPE_PREFIX = "productscope";
    public static final String API_PRODUCT_SUBSCRIPTION_TYPE = "APIProduct";
    public static final String API_SUBSCRIPTION_TYPE = "API";
    public static final String TYPE = "type";
    public static final String TYPE_SEARCH_TYPE_KEY = "type=";
    public static final String API_USAGE_BY_KEY_MANAGER_QUERY = "overview_keyManagers:\\*\"$1\"\\*";

    public static class OASResourceAuthTypes {

        public static final String APPLICATION_OR_APPLICATION_USER = "Application & Application User";
        public static final String APPLICATION_USER = "Application User";
        public static final String APPLICATION = "Application";
        public static final String NONE = "None";
    }

    public static class Analytics {

        public static final String API_NAME = "apiName";
        public static final String API_VERSION = "apiVersion";
        public static final String API_CREATOR = "apiCreator";
        public static final String API_CREATOR_TENANT_DOMAIN = "apiCreatorTenantDomain";
        public static final String APPLICATION_ID = "applicationId";
        public static final String RECORDS_DELIMITER = "records";
    }

    public static class Monetization {

        public static final String MONETIZATION_USAGE_RECORD_APP = "APIM_MONETIZATION_SUMMARY";
        public static final String MONETIZATION_USAGE_RECORD_AGG = "MonetizationAgg";
        public static final String USAGE_PUBLISH_TIME_FORMAT = "yyyy-MM-dd HH:mm:ss";
        public static final String USAGE_PUBLISH_TIME_ZONE = "UTC";
        public static final String COMPLETED = "COMPLETED";
        public static final String RUNNING = "RUNNING";
        public static final String INPROGRESS = "INPROGRESS";
        public static final String INITIATED = "INITIATED";
        public static final String SUCCESSFULL = "SUCCESSFULL";
        public static final String FAILED = "FAILED";
        public static final String USAGE_PUBLISH_DEFAULT_GRANULARITY = "days";
        public static final String USAGE_PUBLISH_DEFAULT_TIME_GAP_IN_DAYS = "1";
        public static final String USAGE_PUBLISHER_JOB_NAME = "USAGE_PUBLISHER";

        public static final String MONETIZATION_CONFIG = "Monetization";
        public static final String MONETIZATION_IMPL_CONFIG = "MonetizationImpl";
        public static final String USAGE_PUBLISHER_CONFIG = "UsagePublisher";
        public static final String INSIGHT_API_ENDPOINT_CONFIG = "ChoreoInsightAPIEndpoint";
        public static final String ANALYTICS_ACCESS_TOKEN_CONFIG = "AnalyticsAccessToken";
        public static final String CHOREO_TOKEN_URL_CONFIG = "ChoreoTokenEndpoint";
        public static final String CHOREO_INSIGHT_APP_CONSUMER_KEY_CONFIG = "ChoreoInsightAppConsumerKey";
        public static final String CHOREO_INSIGHT_APP_CONSUMER_SECRET_CONFIG = "ChoreoInsightAppConsumerSecret";
        public static final String USAGE_PUBLISHER_GRANULARITY_CONFIG = "Granularity";
        public static final String FROM_TIME_CONFIGURATION_PROPERTY = "PublishTimeDurationInDays";
        public static final String ADDITIONAL_ATTRIBUTES = "AdditionalAttributes";
        public static final String ATTRIBUTE = "Attribute";

        public static final String ANALYTICS_HOST = "AnalyticsHost";
        public static final String ANALYTICS_PORT = "AnalyticsPort";
        public static final String ANALYTICS_USERNAME = "AnalyticsUsername";
        public static final String ANALYTICS_PASSWORD = "AnalyticsPassword";
        public static final String ANALYTICS_INDEX_NAME = "AnalyticsIndexName";
        public static final String IS_ATTRIBITE_REQUIRED = "Required";
        public static final String IS_ATTRIBUTE_HIDDEN = "Hidden";
        public static final String ATTRIBUTE_DESCRIPTION = "Description";
        public static final String ATTRIBUTE_DEFAULT = "Default";
        public static final String ATTRIBUTE_DISPLAY_NAME = "DisplayName";
        public static final String ATTRIBUTE_NAME = "Name";

        public static final String CURRENCY = "currencyType";
        public static final String BILLING_CYCLE = "billingCycle";
        public static final String FIXED_RATE = "fixedRate";
        public static final String DYNAMIC_RATE = "dynamicRate";
        public static final String FIXED_PRICE = "fixedPrice";
        public static final String PRICE_PER_REQUEST = "pricePerRequest";
        public static final String API_MONETIZATION_STATUS = "isMonetizationEnabled";
        public static final String API_MONETIZATION_PROPERTIES = "monetizationProperties";
    }

    // HTTP methods
    public static final String HTTP_GET = "GET";
    public static final String HTTP_POST = "POST";
    public static final String HTTP_PUT = "PUT";
    public static final String HTTP_DELETE = "DELETE";
    public static final String HTTP_HEAD = "HEAD";
    public static final String HTTP_OPTIONS = "OPTIONS";
    public static final String HTTP_PATCH = "PATCH";

    // Supported API Types
    public enum ApiTypes {
        API,
        PRODUCT_API
    }

    public static final String TENANT_STATE_ACTIVE = "ACTIVE";
    public static final String TENANT_STATE_INACTIVE = "INACTIVE";

    public static final String DEFAULT_API_KEY_SIGN_KEY_STORE = "KeyStore";
    public static final String GATEWAY_PUBLIC_CERTIFICATE_ALIAS = "gateway_certificate_alias";
    public static final String DEFAULT_API_KEY_GENERATOR_IMPL = "org.wso2.carbon.apimgt.impl.token" +
            ".DefaultApiKeyGenerator";

    //Constants for user API ratings
    public static final String API_ID = "apiId";
    public static final String RATING_ID = "ratingId";
    public static final String RATING = "rating";
    public static final String USER_NAME = "username";

    public static class RestApiConstants {

        public static final String REST_API_PUBLISHER_DEFAULT_VERSION = "v4";
        public static final String REST_API_OLD_VERSION = "v0.17";
        public static final String REST_API_PUBLISHER_CONTEXT = "/api/am/publisher/";
        public static final String REST_API_PUBLISHER_CONTEXT_FULL_1 =
                REST_API_PUBLISHER_CONTEXT + REST_API_PUBLISHER_DEFAULT_VERSION;
        public static final String REST_API_ADMIN_CONTEXT = "/api/am/admin/";
        public static final String REST_API_ADMIN_VERSION = "v0.17";
        public static final String REST_API_ADMIN_CONTEXT_FULL_0 = REST_API_ADMIN_CONTEXT + REST_API_ADMIN_VERSION;
        public static final String REST_API_PUBLISHER_API_IMPORT_RESOURCE = "/apis/import";
        public static final String IMPORT_API_PRESERVE_PROVIDER = "preserveProvider";
        public static final String IMPORT_API_OVERWRITE = "overwrite";
        public static final String IMPORT_API_ARCHIVE_FILE = "file";
        public static final String IMPORT_API_SUCCESS = "API imported successfully.";
        public static final String REST_API_PUB_RESOURCE_PATH_APIS = "/apis";
        public static final String REST_API_PUB_SEARCH_API_QUERY = "query";
        public static final String PUB_SEARCH_API_QUERY_PARAMS_NAME = "name:";
        public static final String PUB_SEARCH_API_QUERY_PARAMS_VERSION = "version:";
        public static final String PUB_API_LIST_RESPONSE_PARAMS_LIST = "list";
        public static final String PUB_API_LIST_RESPONSE_PARAMS_COUNT = "count";
        public static final String PUB_API_RESPONSE_PARAMS_ID = "id";
        public static final String DYNAMIC_CLIENT_REGISTRATION_URL_SUFFIX =
                "/client-registration/" + REST_API_OLD_VERSION + "/register";
    }

    public static final int MAX_LENGTH_API_NAME = 60;
    public static final int MAX_LENGTH_VERSION = 30;
    public static final int MAX_LENGTH_PROVIDER = 200;
    public static final int MAX_LENGTH_CONTEXT = 232; //context becomes context + version + two '/'. Max context is 200
    public static final int MAX_LENGTH_MEDIATION_POLICY_NAME = 255;

    /**
     * Constants for trust store access
     */
    public static final String TRUST_STORE_PASSWORD = "Security.TrustStore.Password";
    public static final String TRUST_STORE_LOCATION = "Security.TrustStore.Location";
    public static final String INTERNAL_WEB_APP_EP = "/internal/data/v1";
    public static final String API_KEY_REVOKE_PATH = "/key/revoke";

    public static final String SKIP_ROLES_BY_REGEX = "skipRolesByRegex";

    /**
     * API categories related constants
     */
    public static final String API_CATEGORIES_CATEGORY_NAME = "apiCategories_categoryName";
    public static final String API_CATEGORY = "api-category";

    // AWS Lambda: Constants for aws lambda
    public static final String AWS_SECRET_KEY = "AWS_SECRET_KEY";
    public static final int AWS_ENCRYPTED_SECRET_KEY_LENGTH = 620;
    public static final int AWS_DEFAULT_CONNECTION_TIMEOUT = 50000;
    public static final String AMZN_ACCESS_KEY = "amznAccessKey";
    public static final String AMZN_SECRET_KEY = "amznSecretKey";
    public static final String AMZN_REGION = "amznRegion";
    public static final String AMZN_ROLE_ARN = "amznRoleArn";
    public static final String AMZN_ROLE_SESSION_NAME = "amznRoleSessionName";
    public static final String AMZN_ROLE_REGION = "amznRoleRegion";
    public static final String NO_ENTITY_BODY = "NO_ENTITY_BODY";
    public static final String JWT_AUTHENTICATION_CONFIG = "JWTAuthentication";
    public static final String JWT_AUTHENTICATION_SUBSCRIPTION_VALIDATION =
            JWT_AUTHENTICATION_CONFIG + ".EnableSubscriptionValidationViaKeyManager";
    public static final String APPLICATION_TOKEN_TYPE_JWT = "JWT";
    /**
     * Constants for the recommendation system
     */
    public static final String API_RECOMMENDATION = "APIRecommendations";
    public static final String RECOMMENDATION_ENDPOINT = "recommendationAPI";
    public static final String AUTHENTICATION_ENDPOINT = "authenticationEndpoint";
    public static final String RECOMMENDATION_API_CONSUMER_KEY = "consumerKey";
    public static final String RECOMMENDATION_API_CONSUMER_SECRET = "consumerSecret";
    public static final String MAX_RECOMMENDATIONS = "maxRecommendations";
    public static final String WAIT_DURATION = "waitDuration";
    public static final String APPLY_RECOMMENDATIONS_FOR_ALL_APIS = "applyForAllTenants";
    public static final String RECOMMENDATION_USERNAME = "userName";
    public static final String RECOMMENDATION_PASSWORD = "password";
    public static final String ADD_API = "ADD_API";
    public static final String DELETE_API = "DELETE_API";
    public static final String ADD_NEW_APPLICATION = "ADD_APPLICATION";
    public static final String UPDATED_APPLICATION = "UPDATED_APPLICATION";
    public static final String DELETE_APPLICATION = "DELETE_APPLICATION";
    public static final String ADD_USER_CLICKED_API = "ADD_USER_CLICKED_API";
    public static final String ADD_USER_SEARCHED_QUERY = "ADD_USER_SEARCHED_QUERY";
    public static final String PUBLISHED_STATUS = "PUBLISHED";
    public static final String DELETED_STATUS = "DELETED";
    public static final String ACTION_STRING = "action";
    public static final String PAYLOAD_STRING = "payload";
    public static final String API_TENANT_CONF_ENABLE_RECOMMENDATION_KEY = "EnableRecommendation";
    public static final String RECOMMENDATIONS_WSO2_EVENT_PUBLISHER = "recommendationEventPublisher";
    public static final String RECOMMENDATIONS_GET_RESOURCE = "/getRecommendations";
    public static final String RECOMMENDATIONS_PUBLISH_RESOURCE = "/publishEvents";
    public static final String RECOMMENDATIONS_USER_HEADER = "User";
    public static final String RECOMMENDATIONS_ACCOUNT_HEADER = "Account";
    public static final String ACCESS_TOKEN = "access_token";
    public static final String CONTENT_TYPE_HEADER = "Content-Type";
    public static final String CONTENT_TYPE_APPLICATION_FORM = "application/x-www-form-urlencoded";
    public static final String AUTHORIZATION_BASIC = "Basic ";
    public static final String AUTHORIZATION_BEARER = "Bearer ";
    public static final String TOKEN_GRANT_TYPE_KEY = "grant_type";
    public static final String SCOPES_KEY = "scopes";
    public static final String TOKEN_KEY = "token";
    public static final String GRANT_TYPE_VALUE = "client_credentials";
    public static final String RECOMMENDATIONS_CACHE_NAME = "APIRecommendationsCache";
    public static final String RECOMMENDATIONS_CACHE_KEY = "Recommendations";
    public static final String LAST_UPDATED_CACHE_KEY = "LastUpdated";

    public static final String CLONED_ITERATION_INDEX_PROPERTY = "CLONED_ITERATION_INDEX";
    public static final String TENANT_DOMAIN_INFO_PROPERTY = "tenant.info.domain";
    public static final String TENANT_ID_INFO_PROPERTY = "tenant.info.id";

    public static class CertificateReLoaderConfiguration {

        public static final String CERTIFICATE_RELOADER_CONFIGURATION_ROOT = "CertificateReLoaderConfiguration";
        public static final String PERIOD = CERTIFICATE_RELOADER_CONFIGURATION_ROOT + ".Period";
    }

    public static class MutualSSL {

        public static final String MUTUAL_SSL_CONFIG_ROOT = "MutualSSL";
        public static final String CLIENT_CERTIFICATE_HEADER = MUTUAL_SSL_CONFIG_ROOT + ".ClientCertificateHeader";
        public static final String CLIENT_CERTIFICATE_ENCODE = MUTUAL_SSL_CONFIG_ROOT + ".ClientCertificateEncode";
        public static final String ENABLE_CLIENT_CERTIFICATE_VALIDATION = MUTUAL_SSL_CONFIG_ROOT +
                ".EnableClientCertificateValidation";
        public static final String ENABLE_CERTIFICATE_CHAIN_VALIDATION = MUTUAL_SSL_CONFIG_ROOT +
                ".EnableCertificateChainValidation";
    }

    public static final String DEFAULT_SCOPE_TYPE = "OAUTH2";
    public static final String DEFAULT_BINDING_TYPE = "DEFAULT";

    public static class TokenIssuer {

        public static final String SCOPES_CLAIM = "ScopesClaim";
        public static String TOKEN_ISSUER = "TokenIssuer";
        public static final String JWKS_CONFIGURATION = "JWKSConfiguration";
        public static final String CLAIM_MAPPINGS = "ClaimMappings";
        public static final String CLAIM_MAPPING = "ClaimMapping";
        public static final String CONSUMER_KEY_CLAIM = "ConsumerKeyClaim";


        public static class JWKSConfiguration {

            public static final String URL = "URL";
        }

        public static class ClaimMapping {

            public static final String LOCAL_CLAIM = "LocalClaim";
            public static final String REMOTE_CLAIM = "RemoteClaim";

        }
    }

    public static class KeyManager {

        public static final String SERVICE_URL = "ServiceURL";
        public static final String INIT_DELAY = "InitDelay";
        public static final String INTROSPECTION_ENDPOINT = "introspection_endpoint";
        public static final String CLIENT_REGISTRATION_ENDPOINT = "client_registration_endpoint";
        public static final String KEY_MANAGER_OPERATIONS_DCR_ENDPOINT = "/keymanager-operations/dcr/register";
        public static final String KEY_MANAGER_OPERATIONS_USERINFO_ENDPOINT = "/keymanager-operations/user-info";
        public static final String KEY_MANAGER_OPERATIONS_REVOKE_TOKEN_ENDPOINT = "/keymanager-operations/revoke-one-time-token";
        public static final String TOKEN_ENDPOINT = "token_endpoint";
        public static final String DISPLAY_TOKEN_ENDPOINT = "display_token_endpoint";
        public static final String REVOKE_ENDPOINT = "revoke_endpoint";
        public static final String DISPLAY_REVOKE_ENDPOINT = "display_revoke_endpoint";
        public static final String WELL_KNOWN_ENDPOINT = "well_known_endpoint";
        public static final String SCOPE_MANAGEMENT_ENDPOINT = "scope_endpoint";
        public static final String AVAILABLE_GRANT_TYPE = "grant_types";
        public static final String ENABLE_TOKEN_GENERATION = "enable_token_generation";
        public static final String ENABLE_TOKEN_HASH = "enable_token_hash";
        public static final String ENABLE_TOKEN_ENCRYPTION = "enable_token_encryption";
        public static final String ENABLE_OAUTH_APP_CREATION = "enable_oauth_app_creation";
        public static final String DEFAULT_KEY_MANAGER = "Resident Key Manager";
        public static final String DEFAULT_KEY_MANAGER_TYPE = "default";
        public static final String DEFAULT_KEY_MANAGER_DESCRIPTION = "This is Resident Key Manager";
        public static final String WSO2_IS_KEY_MANAGER_TYPE = "WSO2-IS";
        public static final String SP_NAME_APPLICATION = "sp.name.application";

        public static final String ISSUER = "issuer";
        public static final String JWKS_ENDPOINT = "jwks_endpoint";
        public static final String USERINFO_ENDPOINT = "userinfo_endpoint";
        public static final String REVOKE_TOKEN_ENDPOINT = "revoke_token_endpoint";
        public static final String AUTHORIZE_ENDPOINT = "authorize_endpoint";
        public static final String EVENT_HUB_CONFIGURATIONS = "EventHubConfigurations";
        public static final String KEY_MANAGER = "KeyManager";
        public static final String APPLICATION_CONFIGURATIONS = "ApplicationConfigurations";
        public static final String EVENT_RECEIVER_CONFIGURATION = "EventReceiverConfiguration";

        public static final String ENABLE = "Enable";
        public static final String USERNAME = "Username";
        public static final String PASSWORD = "Password";
        public static final String KM_ADMIN_AS_APP_OWNER = "km_admin_as_app_owner";
        public static final String SELF_VALIDATE_JWT = "self_validate_jwt";
        public static final String CLAIM_MAPPING = "claim_mappings";
        public static final String VALIDATION_TYPE = "validation_type";
        public static final String VALIDATION_JWT = "jwt";
        public static final String VALIDATION_REFERENCE = "reference";
        public static final String VALIDATION_CUSTOM = "custom";
        public static final String TOKEN_FORMAT_STRING = "token_format_string";
        public static final String ENABLE_TOKEN_VALIDATION = "validation_enable";
        public static final String VALIDATION_ENTRY_JWT_BODY = "body";
        public static final String API_LEVEL_ALL_KEY_MANAGERS = "all";
        public static final String REGISTERED_TENANT_DOMAIN = "tenantDomain";
        public static final String ENABLE_MAP_OAUTH_CONSUMER_APPS = "enable_map_oauth_consumer_apps";
        public static final String KEY_MANAGER_TYPE = "type";
        public static final String UUID_REGEX = "[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[1-5][0-9a-fA-F]{3}-[89abAB][0-9a-fA-F" +
                "]{3}-[0-9a-fA-F]{12}";
        public static final String CONSUMER_KEY_CLAIM = "consumer_key_claim";
        public static final String SCOPES_CLAIM = "scopes_claim";
        public static final String CERTIFICATE_TYPE = "certificate_type";
        public static final String CERTIFICATE_VALUE = "certificate_value";
        public static final String CERTIFICATE_TYPE_JWKS_ENDPOINT = "JWKS";
        public static final String CERTIFICATE_TYPE_PEM_FILE = "PEM";
        public static final String EVENT_PUBLISHER_CONFIGURATIONS = "EventPublisherConfiguration";
        public static final String KEY_MANAGER_TYPE_HEADER = "X-WSO2-KEY-MANAGER";
        public static final String ACCESS_TOKEN = "accessToken";
        public static final String AUTH_CODE = "authCode";
        public static final String CLAIM_DIALECT = "dialect";
        public static final String BINDING_FEDERATED_USER_CLAIMS = "bindFederatedUserClaims";
        public static final String DEFAULT_KEY_MANAGER_OPENID_CONNECT_DISCOVERY_ENDPOINT = "/oauth2/token/.well-known/openid-configuration";
        public static final String DEFAULT_JWKS_ENDPOINT = "/oauth2/jwks";
        public static final String PRODUCTION_TOKEN_ENDPOINT = "production_token_endpoint";
        public static final String SANDBOX_TOKEN_ENDPOINT = "sandbox_token_endpoint";
        public static final String PRODUCTION_REVOKE_ENDPOINT = "production_revoke_endpoint";
        public static final String SANDBOX_REVOKE_ENDPOINT = "sandbox_revoke_endpoint";
        public static final String APPLICATION_ACCESS_TOKEN_EXPIRY_TIME = "application_access_token_expiry_time";
        public static final String USER_ACCESS_TOKEN_EXPIRY_TIME = "user_access_token_expiry_time";
        public static final String REFRESH_TOKEN_EXPIRY_TIME = "refresh_token_expiry_time";
        public static final String ID_TOKEN_EXPIRY_TIME = "id_token_expiry_time";
        public static final String NOT_APPLICABLE_VALUE = "N/A";
        public static final String PKCE_MANDATORY = "pkceMandatory";
        public static final String PKCE_SUPPORT_PLAIN = "pkceSupportPlain";
        public static final String BYPASS_CLIENT_CREDENTIALS = "bypassClientCredentials";
        public static final String PERMISSIONS = "permissions";
        public static final String ROLES = "roles";
        public static final String PERMISSION_TYPE = "permissionType";
        public static final String ALL_KEY_MANAGERS = "ALL";
        public static final String AUTHORIZATION_CODE_GRANT_TYPE = "authorization_code";
        public static final String IMPLICIT_GRANT_TYPE = "implicit";
        public static final String PASSWORD_GRANT_TYPE = "password";
        public static final String CLIENT_CREDENTIALS_GRANT_TYPE = "client_credentials";
        public static final String APPLICATION_GRANT_TYPE = "application";
        public static final String ACCESS_CODE_GRANT_TYPE = "accessCode";

        public static class KeyManagerEvent {

            public static final String EVENT_TYPE = "event_type";
            public static final String KEY_MANAGER_CONFIGURATION = "key_manager_configuration";
            public static final String ACTION = "action";
            public static final String NAME = "name";
            public static final String ENABLED = "enabled";
            public static final String VALUE = "value";
            public static final String ORGANIZATION = "organization";
            public static final String ACTION_ADD = "add";
            public static final String ACTION_UPDATE = "update";
            public static final String ACTION_DELETE = "delete";
            public static final String TYPE = "type";
            public static final String TOKEN_TYPE = "tokenType";
            public static final String KEY_MANAGER_STREAM_ID = "org.wso2.apimgt.keymgt.stream:1.0.0";
        }
    }

    public static class GlobalCacheInvalidation {

        public static final String ENABLED = "Enabled";
        public static final Object GLOBAL_CACHE_INVALIDATION = "GlobalCacheInvalidation";

        public static final String Domain = "Domain";
        public static final String Stream = "Stream";
        public static final String REVEIVER_URL_GROUP = "ReceiverUrlGroup";
        public static final String AUTH_URL_GROUP = "AuthUrlGroup";
        public static final String USERNAME = "Username";
        public static final String PASSWORD = "Password";
        public static final String TOPIC_NAME = "Topic";
        public static final String EXCLUDED_CACHES = "ExcludedCaches";
        public static final String ReceiverConnectionDetails = "ReceiverConnectionDetails";
    }

    // Supported Notifier Types
    public enum NotifierType {
        API,
        GATEWAY_PUBLISHED_API,
        APPLICATION,
        APPLICATION_REGISTRATION,
        POLICY,
        SUBSCRIPTIONS,
        SCOPE,
        SCOPES,
        CERTIFICATE,
        GA_CONFIG,
        KEY_TEMPLATE,
        CORRELATION_CONFIG,
        GATEWAY_POLICY,
        LLM_PROVIDER,
        LABEL,
        TENANT
    }

    // Supported Event Types
    public enum EventType {
        LLM_PROVIDER_CREATE,
        LLM_PROVIDER_UPDATE,
        LLM_PROVIDER_DELETE,
        API_CREATE,
        API_UPDATE,
        API_DELETE,
        API_LIFECYCLE_CHANGE,
        APPLICATION_CREATE,
        APPLICATION_UPDATE,
        APPLICATION_DELETE,
        APPLICATION_REGISTRATION_CREATE,
        POLICY_CREATE,
        POLICY_UPDATE,
        POLICY_DELETE,
        POLICY_RESET,
        SUBSCRIPTIONS_CREATE,
        SUBSCRIPTIONS_UPDATE,
        SUBSCRIPTIONS_DELETE,
        DEPLOY_API_IN_GATEWAY,
        REMOVE_API_FROM_GATEWAY,
        REMOVE_APPLICATION_KEYMAPPING,
        SCOPE_CREATE,
        SCOPE_UPDATE,
        SCOPE_DELETE,
        SCOPES_UPDATE,
        ENDPOINT_CERTIFICATE_ADD,
        ENDPOINT_CERTIFICATE_UPDATE,
        ENDPOINT_CERTIFICATE_REMOVE,
        GA_CONFIG_UPDATE,
        UDATE_API_LOG_LEVEL,
        CUSTOM_POLICY_ADD,
        CUSTOM_POLICY_DELETE,
        CUSTOM_POLICY_UPDATE,
        UPDATE_CORRELATION_CONFIGS,
        DEPLOY_POLICY_MAPPING_IN_GATEWAY,
        REMOVE_POLICY_MAPPING_FROM_GATEWAY,
        LABEL_CREATE,
        LABEL_UPDATE,
        LABEL_DELETE,
        TENANT_CREATE,
        TENANT_UPDATE,
        TENANT_DELETE,
        TENANT_ACTIVATION,
        TENANT_DEACTIVATION
    }

    public enum EventAction {
        DEFAULT_VERSION
    }

    public static class GatewayArtifactSynchronizer {

        public static final String SYNC_RUNTIME_ARTIFACTS_PUBLISHER_CONFIG = "SyncRuntimeArtifactsPublisher";
        public static final String SYNC_RUNTIME_ARTIFACTS_GATEWAY_CONFIG = "SyncRuntimeArtifactsGateway";
        public static final String ENABLE_CONFIG = "Enable";
        public static final String SAVER_CONFIG = "ArtifactSaver";
        public static final String RETRIEVER_CONFIG = "ArtifactRetriever";
        public static final String RETRY_DUARTION = "RetryDuration";
        public static final String MAX_RETRY_COUNT = "MaxRetryCount";
        public static final String RETRY_PROGRESSION_FACTOR = "RetryProgressionFactor";
        public static final String PUBLISH_DIRECTLY_TO_GW_CONFIG = "PublishDirectlyToGW";
        public static final String GATEWAY_LABELS_CONFIG = "GatewayLabels";
        public static final String LABEL_CONFIG = "Label";
        public static final String DB_SAVER_NAME = "DBSaver";
        public static final String DB_RETRIEVER_NAME = "DBRetriever";
        public static final String GATEWAY_INSTRUCTION_PUBLISH = "Publish";
        public static final String GATEWAY_INSTRUCTION_REMOVE = "Remove";
        public static final String GATEWAY_INSTRUCTION_ANY = "ANY";
        public static final String SYNAPSE_ATTRIBUTES = "/synapse-attributes";
        public static final String GATEAY_SYNAPSE_ARTIFACTS = "/runtime-artifacts";
        public static final String GATEWAY_POLICY_SYNAPSE_ARTIFACTS = "/gateway-policy-artifacts";
        public static final String DATA_SOURCE_NAME = "DataSourceName";
        public static final String DATA_RETRIEVAL_MODE = "DataRetrievalMode";
        public static final String GATEWAY_STARTUP_SYNC = "sync";
        public static final String GATEWAY_STARTUP_ASYNC = "async";
        public static final String API_ID = "apiId";
        public static final String LABEL = "label";
        public static final String LABELS = "labels";
        public static final String FILE_BASED_API_CONTEXTS = "FileBasedApiContexts";
        public static final String FILE_BASED_API_CONTEXT = "FileBasedApiContext";
        public static final String EnableOnDemandLoadingAPIS = "EnableOnDemandLoadingAPIS";
        public static final String TENANT_LOADING = "TenantLoading";
        public static final String ENABLE_TENANT_LOADING = "Enable";
        public static final String TENANT_LOADING_TENANTS = "Tenants";

    }

    public static class AsyncApi {
        public static final String ASYNC_MESSAGE_TYPE = "ASYNC_MESSAGE_TYPE";
        public static final String ASYNC_MESSAGE_TYPE_SUBSCRIBE = "init-request:";
        public static final String ASYNC_DEFAULT_SUBSCRIBER = "x-default-subscriber";
    }

    public static class TopicNames {

        //APIM default topic names
        public static final String TOPIC_THROTTLE_DATA = "throttleData";
        public static final String TOPIC_TOKEN_REVOCATION = "tokenRevocation";
        public static final String TOPIC_CACHE_INVALIDATION = "cacheInvalidation";
        public static final String TOPIC_KEY_MANAGER = "keyManager";
        public static final String TOPIC_NOTIFICATION = "notification";
        public static final String TOPIC_ASYNC_WEBHOOKS_DATA = "asyncWebhooksData";
    }

    public static class Webhooks {
        public static final String API_UUID_COLUMN = "API_UUID";
        public static final String APPLICATION_ID_COLUMN = "APPLICATION_ID";
        public static final String CALLBACK_COLUMN = "HUB_CALLBACK_URL";
        public static final String SECRET_COLUMN = "HUB_SECRET";
        public static final String TOPIC_COLUMN = "HUB_TOPIC";
        public static final String EXPIRY_AT_COLUMN = "EXPIRY_AT";
        public static final String WH_SUBSCRIPTION_ID_COLUMN = "WH_SUBSCRIPTION_ID";
        public static final String CONNECTIONS_COUNT_COLUMN = "CONNECTIONS_COUNT";
        public static final String SUB_COUNT_COLUMN = "SUB_COUNT";
        public static final String API_CONTEXT_COLUMN = "API_CONTEXT";
        public static final String API_VERSION_COLUMN = "API_VERSION";
        public static final String API_TIER_COLUMN = "API_TIER";
        public static final String SUB_TIER_COLUMN = "SUB_TIER";
        public static final String APPLICATION_TIER_COLUMN = "APPLICATION_TIER";
        public static final String SUBSCRIBER_COLUMN = "SUBSCRIBER";
        public static final String TENANT_ID_COLUMN = "TENANT_ID";
        public static final String SUBSCRIBE_MODE = "subscribe";
        public static final String UNSUBSCRIBE_MODE = "unsubscribe";
        public static final String UPDATED_AT = "updatedAt";
        public static final String EXPIRY_AT = "expireAt";
        public static final String API_UUID = "apiUUID";
        public static final String APP_ID = "appID";
        public static final String TENANT_DOMAIN = "tenantDomain";
        public static final String TENANT_ID = "tenantId";
        public static final String CALLBACK = "callback";
        public static final String TOPIC = "topic";
        public static final String MODE = "mode";
        public static final String SECRET = "secret";
        public static final String LEASE_SECONDS = "leaseSeconds";
        public static final String STATUS = "status";
        public static final String TIER = "tier";
        public static final String APPLICATION_TIER = "applicationTier";
        public static final String API_TIER = "apiTier";
        public static final String SUBSCRIBER_NAME = "subscriberName";
        public static final String API_NAME = "apiName";
        public static final String API_CONTEXT = "apiContext";
        public static final String API_VERSION = "apiVersion";
        public static final String IS_THROTTLED = "isThrottled";
        public static final String SUBSCRIPTION_EVENT_TYPE = "subscriptionEventType";
        public static final String DELIVERY_EVENT_TYPE = "diliveryStatusEventType";
        public static final String GET_SUBSCRIPTIONS_URL = "/webhooks-subscriptions";
        public static final String HUB_TOPIC_QUERY_PARAM = "hub.topic";
        public static final String HUB_CALLBACK_QUERY_PARAM = "hub.callback";
        public static final String HUB_SECRET_QUERY_PARAM = "hub.secret";
        public static final String HUB_MODE_QUERY_PARAM = "hub.mode";
        public static final String HUB_LEASE_SECONDS_QUERY_PARAM = "hub.lease_seconds";
        public static final String TOPIC_QUERY_PARAM = "topic";
        public static final String SUBSCRIBERS_LIST_PROPERTY = "SUBSCRIBERS_LIST";
        public static final String SUBSCRIBERS_COUNT_PROPERTY = "SUBSCRIBERS_COUNT";
        public static final String SUBSCRIBER_CALLBACK_PROPERTY = "SUBSCRIBER_CALLBACK";
        public static final String SUBSCRIBER_SECRET_PROPERTY = "SUBSCRIBER_SECRET";
        public static final String SUBSCRIBER_TOPIC_PROPERTY = "SUBSCRIBER_TOPIC";
        public static final String SUBSCRIBER_APPLICATION_ID_PROPERTY = "SUBSCRIBER_APPLICATION_ID";
        public static final String PAYLOAD_PROPERTY = "ORIGINAL_PAYLOAD";

        public static final String SUBSCRIPTION_PARAMETER_PROPERTY = "SUBSCRIPTION_PARAMETERS";
    }

    public enum PolicyType {
        API,
        APPLICATION,
        SUBSCRIPTION,
        GLOBAL
    }

    public static class NotificationEvent {

        public static final String TOKEN_TYPE = "token_type";
        public static final String TOKEN_REVOCATION_EVENT = "token_revocation";
        public static final String CONSUMER_APP_REVOCATION_EVENT
                = "consumer_app_revocation_event";
        public static final String SUBJECT_ENTITY_REVOCATION_EVENT
                = "subject_entity_revocation_event";
        public static final String CONSUMER_KEY = "consumer_key";
        public static final String EVENT_ID = "eventId";
        public static final String TENANT_ID = "tenantId";
        public static final String TENANT_DOMAIN = "tenant_domain";
        public static final String ORG_ID = "org_id";
        public static final String APPLICATION_TOKEN_TYPE_OAUTH2 = "Default";
        public static final String EXPIRY_TIME = "expiryTime";
        public static final String REVOCATION_TIME = "revocationTime";
        public static final String ORGANIZATION = "organization";
        public static final String STREAM_ID = "streamId";
        public static final String ENTITY_ID = "entityId";
        public static final String ENTITY_TYPE = "entityType";
        public static final String ENTITY_TYPE_CLIENT_ID = "CLIENT_ID";
        public static final String ENTITY_TYPE_USER_ID = "USER_ID";
        public static final String EVENT_TYPE = "eventType";
    }

    //Constants related to user password
    public static final String ENABLE_CHANGE_PASSWORD = "EnableChangePassword";
    public static final String IS_PASSWORD_POLICY_ENABLED_PROPERTY = "passwordPolicy.enable";
    public static final String PASSWORD_POLICY_MIN_LENGTH_PROPERTY = "passwordPolicy.min.length";
    public static final String PASSWORD_POLICY_MAX_LENGTH_PROPERTY = "passwordPolicy.max.length";
    public static final String PASSWORD_POLICY_PATTERN_PROPERTY = "passwordPolicy.pattern";
    public static final String PASSWORD_JAVA_REGEX_PROPERTY = "PasswordJavaRegEx";

    public class SkipListConstants {

        public static final String SKIP_LIST_CONFIG = "SkipList";
        public static final String SKIPPED_APIS = "APIS";
        public static final String SKIPPED_API = "API";
        public static final String SKIPPED_ENDPOINTS = "Endpoints";
        public static final String SKIPPED_ENDPOINT = "Endpoint";
        public static final String SKIPPED_SEQUENCE = "Sequence";
        public static final String SKIPPED_SEQUENCES = "Sequences";
        public static final String SKIPPED_LOCAL_ENTRIES = "LocalEntries";
        public static final String SKIPPED_LOCAL_ENTRY = "LocalEntry";
    }

    public static final String USER_CTX_PROPERTY_ISADMIN = "isAdmin";
    public static final String USER_CTX_PROPERTY_SKIP_ROLES = "skipRoles";
    public static final String USER_CTX_PROPERTY_ORGS_AVAILABLE = "organizationsAvailable";

    // Constants related to Service Catalog
    public static final String METADATA_FILE_NAME = "metadata";
    public static final String METADATA_FILE = "metadata.yaml";
    public static final String DEFINITION_FILE = "definition.yaml";
    public static final String DEFINITION_WSDL_FILE = "definition.wsdl";
    public static final String KEY_SEPARATOR = "-";
    public static final String MAP_KEY_ACCEPTED_NEW_SERVICE = "accepted";
    public static final String MAP_KEY_IGNORED_EXISTING_SERVICE = "ignored";
    public static final String MAP_KEY_VERIFIED_EXISTING_SERVICE = "verified";
    public static final String MAP_KEY_HASH_NOT_CHANGED_EXISTING_SERVICE = "notChanged";
    public static final String PROXY_SERVICE_NAME_SUFFIX = "_proxy";

    public static final String ALLOW_MULTIPLE_STATUS = "allowMultipleStatus";
    public static final String ALLOW_MULTIPLE_VERSIONS = "allowMultipleVersions";

    public static class ServiceCatalogConstants {
        public static final String SERVICE_UUID = "UUID";
        public static final String SERVICE_NAME = "SERVICE_NAME";
        public static final String SERVICE_KEY = "SERVICE_KEY";
        public static final String MD5 = "MD5";
        public static final String SERVICE_VERSION = "SERVICE_VERSION";
        public static final String SERVICE_URL = "SERVICE_URL";
        public static final String DEFINITION_TYPE = "DEFINITION_TYPE";
        public static final String DEFINITION_URL = "DEFINITION_URL";
        public static final String DESCRIPTION = "DESCRIPTION";
        public static final String SECURITY_TYPE = "SECURITY_TYPE";
        public static final String MUTUAL_SSL_ENABLED = "MUTUAL_SSL_ENABLED";
        public static final String CREATED_TIME = "CREATED_TIME";
        public static final String LAST_UPDATED_TIME = "LAST_UPDATED_TIME";
        public static final String CREATED_BY = "CREATED_BY";
        public static final String UPDATED_BY = "UPDATED_BY";
        public static final String METADATA = "METADATA";
        public static final String SERVICE_DEFINITION = "SERVICE_DEFINITION";
    }

    public static class KeyStoreManagement {
        public static final String KeyStoreName = "KeyStoreName";
        public static final String SERVER_APIKEYSIGN_KEYSTORE_FILE = "Security.KeyStoreName.Location";
        public static final String SERVER_APIKEYSIGN_KEYSTORE_PASSWORD = "Security.KeyStoreName.Password";
        public static final String SERVER_APIKEYSIGN_KEYSTORE_KEY_ALIAS = "Security.KeyStoreName.KeyAlias";
        public static final String SERVER_APIKEYSIGN_KEYSTORE_TYPE = "Security.KeyStoreName.Type";
        public static final String SERVER_APIKEYSIGN_PRIVATE_KEY_PASSWORD = "Security.KeyStoreName.KeyPassword";
        public static final String KEY_STORE_EXTENSION_JKS = ".jks";
    }

    public static class ExtensionListenerConstants {

        public static final String EXTENSION_LISTENERS = "ExtensionListeners";
        public static final String EXTENSION_LISTENER = "ExtensionListener";
        public static final String EXTENSION_TYPE = "Type";
        public static final String EXTENSION_LISTENER_CLASS_NAME = "ClassName";
        public static final int API_EXTENSION_LISTENER_ERROR = 900300;
        public static final String API_EXTENSION_LISTENER_ERROR_MESSAGE = "API Extension Listener Error";
    }

    public static class GatewayArtifactConstants {
        public static final String DEPLOYMENT_DESCRIPTOR_FILE = "deployments";
        public static final String DEPLOYMENT_DESCRIPTOR_FILE_TYPE = "deployments";
        public static final String ENVIRONMENT_SPECIFIC_API_PROPERTY_FILE = "env_properties";
        public static final String ENVIRONMENT_SPECIFIC_API_PROPERTY_KEY_NAME = "apis";
    }

    public static class OrganizationDeletion {
        public static final String API_RETRIEVER = "APIRetriever";
        public static final String API_DB_DATA_REMOVER = "APIDataRemover";
        public static final String ARTIFACT_SERVER_DATA_REMOVER = "ArtifactRemover";
        public static final String GW_ARTIFACT_DATA_REMOVER = "GWArtifactRemover";
        public static final String API_ARTIFACT_DATA_REMOVER = "APIArtifactRemover";
        public static final String API_ORG_EXIST = "APIOrganizationExist";

        public static final String PENDING_SUBSCRIPTION_REMOVAL = "PendingSubscriptionRemoval";
        public static final String APPLICATION_CREATION_WF_REMOVAL = "ApplicationCreationWFRemoval";
        public static final String APPLICATION_REGISTRATION_REMOVAL = "ApplicationRegistrationRemoval";
        public static final String APPLICATION_REMOVAL = "ApplicationRemoval";
        public static final String APPLICATION_ORG_EXIST = "ApplicationOrganizationExist";

        public static final String PENDING = "Pending";
        public static final String COMPLETED = "Completed";
        public static final String FAIL = "Fail";
        public static final String KM_RETRIEVER = "KMRetriever";
        public static final String IDP_DATA_REMOVER = "IDPDataRemover";
        public static final String KM_DATA_REMOVER = "KMDataRemover";
        public static final String KM_ORGANIZATION_EXIST = "IDPOrganizationExist";
    }

    public static class SystemScopeConstants {
        public static final String CHECK_ROLES_FROM_SAML_ASSERTION = "checkRolesFromSamlAssertion";
        public static final String SAML2_ASSERTION = "SAML2Assertion";
        public static final String SAML2_SSO_AUTHENTICATOR_NAME = "SAML2SSOAuthenticator";
        public static final String ROLE_CLAIM_ATTRIBUTE = "RoleClaimAttribute";
        public static final String ATTRIBUTE_VALUE_SEPARATOR = "AttributeValueSeparator";
        public static final String ROLE_ATTRIBUTE_NAME = "http://wso2.org/claims/role";
        public static final String ATTRIBUTE_VALUE_SEPERATER = ",";
        public static final String
                RETRIEVE_ROLES_FROM_USERSTORE_FOR_SCOPE_VALIDATION = "retrieveRolesFromUserStoreForScopeValidation";
        public static final String ROLE_CLAIM = "ROLE_CLAIM";
        public static final String OAUTH2_DEFAULT_SCOPE = "default";
        public static final String REST_API_SCOPE_CACHE = "REST_API_SCOPE_CACHE";
        public static final String EXTENTIONS_CACHE_MANAGER = "EXTENTIONS_CACHE_MANAGER";
        public static final String TENANT_CONFIG_CACHE_NAME = "tenantConfigCache";
        public static final String REST_API_SCOPE = "Scope";
        public static final String REST_API_SCOPE_NAME = "Name";
        public static final String REST_API_SCOPE_ROLE = "Roles";
        public static final String REST_API_SCOPES_CONFIG = "RESTAPIScopes";
        public static final String REST_API_ROLE_MAPPINGS_CONFIG = "RoleMappings";

        public static final String OAUTH_JWT_BEARER_GRANT_TYPE = "urn:ietf:params:oauth:grant-type:jwt-bearer";
        public static final String OAUTH_JWT_ASSERTION = "assertion";
    }

    public enum ConfigType {
        TENANT,
        WORKFLOW,
        EXTERNAL_STORE,
        GA,
        SELF_SIGNUP
    }

    public static final String  PROPERTY_QUERY_KEY = "query";
    public static final String  PROPERTY_HEADERS_KEY = "headers";
    public static final String DEFAULT_ORG_RESOLVER = "org.wso2.carbon.apimgt.impl.resolver.OnPremResolver";

    //Constants related to Operation Policies
    public static final String OPERATION_POLICIES = "operation policies";
    public static final String OPERATION_SEQUENCE_TYPE_REQUEST = "request";
    public static final String OPERATION_SEQUENCE_TYPE_RESPONSE = "response";
    public static final String OPERATION_SEQUENCE_TYPE_FAULT = "fault";
    public static final String SYNAPSE_POLICY_DEFINITION_EXTENSION = ".j2";
    public static final String SYNAPSE_POLICY_DEFINITION_EXTENSION_XML = ".xml";
    public static final String CC_POLICY_DEFINITION_EXTENSION = ".gotmpl";
    public static final String YAML_CONTENT_TYPE = "yaml";
    public static final String J2_CONTENT_TYPE = "j2";
    public static final String COMMON_OPERATION_POLICY_SPECIFICATIONS_LOCATION = "repository" + File.separator
            + "resources" + File.separator + "operation_policies" + File.separator + "specifications";
    public static final String COMMON_OPERATION_POLICY_DEFINITIONS_LOCATION = "repository" + File.separator
            + "resources" + File.separator + "operation_policies" + File.separator + "definitions";
    public static final String OPERATION_POLICY_SUPPORTED_GATEWAY_SYNAPSE = "Synapse";
    public static final String OPERATION_POLICY_SUPPORTED_API_TYPE_HTTP = "HTTP";
    public static final String OPERATION_POLICY_SUPPORTED_API_TYPE_SOAP = "SOAP";
    public static final String OPERATION_POLICY_SUPPORTED_API_TYPE_SOAPTOREST = "SOAPTOREST";
    public static final String OPERATION_POLICY_SUPPORTED_API_TYPE_GRAPHQL = "GRAPHQL";
    public static final String DEFAULT_POLICY_VERSION = "v1";
    public static final String POLICY_FILENAME_INVALID_CHARS_REGEX = "[\\/:*?\"<>|]";


    public static final String WSO2_GATEWAY_ENVIRONMENT = "wso2";
    public static final String EXTERNAL_GATEWAY_VENDOR = "external";
    public static final String WSO2_APK_GATEWAY = "wso2/apk";
    public static final String WSO2_SYNAPSE_GATEWAY = "wso2/synapse";
    public static final String EXTERNAL_AWS_GATEWAY = "AWS";
    public static final List<String> API_TYPES = Arrays.asList("rest", "soap", "graphql", "ws", "wh", "sse", "ai");

    public static final String PERMISSION_ALLOW = "ALLOW";
    public static final String PERMISSION_DENY = "DENY";
    public static final String PERMISSION_NOT_RESTRICTED = "PUBLIC";

    // Protocol variables
    public static final String HTTP_TRANSPORT_PROTOCOL_NAME = "http";
    public static final String HTTPS_TRANSPORT_PROTOCOL_NAME = "https";
    public static final String WS_TRANSPORT_PROTOCOL_NAME = "ws";
    public static final String KAFKA_TRANSPORT_PROTOCOL_NAME = "kafka";
    public static final String AMQP_TRANSPORT_PROTOCOL_NAME = "amqp";
    public static final String AMQPS_TRANSPORT_PROTOCOL_NAME = "amqps";
    public static final String AMQP1_TRANSPORT_PROTOCOL_NAME = "amqp1";
    public static final String MQTT_TRANSPORT_PROTOCOL_NAME = "mqtt";
    public static final String SECURE_MQTT_TRANSPORT_PROTOCOL_NAME = "secure-mqtt";
    public static final String WS_MQTT_TRANSPORT_PROTOCOL_NAME = "ws-mqtt";
    public static final String WSS_MQTT_TRANSPORT_PROTOCOL_NAME = "wss-mqtt";
    public static final String MQTT5_TRANSPORT_PROTOCOL_NAME = "mqtt5";
    public static final String NATS_TRANSPORT_PROTOCOL_NAME = "nats";
    public static final String JMS_TRANSPORT_PROTOCOL_NAME = "jms";
    public static final String SNS_TRANSPORT_PROTOCOL_NAME = "sns";
    public static final String SQS_TRANSPORT_PROTOCOL_NAME = "sqs";
    public static final String STOMP_TRANSPORT_PROTOCOL_NAME = "stomp";
    public static final String REDIS_TRANSPORT_PROTOCOL_NAME = "redis";
    public static final String SMF_TRANSPORT_PROTOCOL_NAME = "smf";
    public static final String SMF_TRANSPORT_PROTOCOL_VERSION = "smf";
    public static final String SMFS_TRANSPORT_PROTOCOL_NAME = "smfs";
    public static final String SMFS_TRANSPORT_PROTOCOL_VERSION = "smfs";

    public static class APILogHandler {
        public static final String DELETE = "delete";
        public static final String DELETE_ALL = "deleteAll";
        public static final String OFF = "OFF";
        public static final String BASIC = "BASIC";
        public static final String STANDARD = "STANDARD";
        public static final String FULL = "FULL";
    }

    // Constants related to basic health check APIs
    public static final String WEB_SOCKET_HEALTH_CHECK_PATH = "/health";
    public static final String EAGER_LOADING_ENABLED_TENANTS = "Tenant.LoadingPolicy.EagerLoading.Include";

    public static final String CASE_SENSITIVE_CHECK_PATH =    "caseSensitiveRoleValidation";
    public static final String SOAP_TO_REST_PRESERVE_ELEMENT_ORDER = "soapToRestPreserveElementOrder";

    public static final String GLOBAL_KEY_MANAGER_TENANT_DOMAIN = "WSO2/System";

    public static final String MIGRATE = "migrate";
    public static final String SWAGGER_RELAXED_VALIDATION = "swaggerRelaxedValidation";

    //Property for enabling tenant aware sub claims when invoking APIs with API key
    public static final String ENABLE_TENANT_AWARE_SUB_CLAIM= "enable.tenant.aware.subclaim";
    public static final String OM_ELEMENT_NAME = "name";
    public static class TokenValidationConstants {
        public static final String TOKEN_VALIDATION_CONFIG = "TokenValidation";
        public static final String ENFORCE_JWT_TYPE_HEADER_VALIDATION = "EnforceTypeHeaderValidation";
    }
    
    // For Organization access control Configuration
    public static final String ORG_BASED_ACCESS_CONTROL = "OrganizationBasedAccessControl";
    public static final String ORG_BASED_ACCESS_CONTROL_ENABLE = "Enable";
    public static final String ORG_BASED_ACCESS_CONTROL_ORG_NAME_CLAIM = "OrganizationNameLocalClaim";
    public static final String ORG_BASED_ACCESS_CONTROL_ORG_ID_CLAIM = "OrganizationIDLocalClaim";

    public static class TransactionCounter {

        public static final String TRANSACTIONCOUNTER = "TransactionCounter";
        public static final String COUNTER_ENABLED = "Enabled";
    }

    //Property for enabling application update capabilities for users in the same organization.
    public static final String ORGANIZATION_WIDE_APPLICATION_UPDATE_ENABLED = "orgWideAppUpdateEnabled";

    public static class APIEndpoint {
        public static final String PRODUCTION = "PRODUCTION";
        public static final String SANDBOX = "SANDBOX";
        public static final String DEFAULT_PROD_ENDPOINT_ID = "default_production_endpoint";
        public static final String DEFAULT_SANDBOX_ENDPOINT_ID = "default_sandbox_endpoint";
        public static final String DEFAULT_PROD_ENDPOINT_NAME = "Default Production Endpoint";
        public static final String DEFAULT_SANDBOX_ENDPOINT_NAME = "Default Sandbox Endpoint";
        public static final String ENDPOINT_CONFIG_PRODUCTION_ENDPOINTS = "production_endpoints";
        public static final String ENDPOINT_CONFIG_SANDBOX_ENDPOINTS = "sandbox_endpoints";
    }

    // For APIM governance configurations
    public static class APIMGovernance {
        public static final String GOVERNANCE_CONFIG = "APIMGovernance";
        public static final String DATA_SOURCE_NAME = "DataSource";
        public static final String SCHEDULER_CONFIG = "SchedulerConfigurations";
        public static final String SCHEDULER_THREAD_POOL_SIZE = "ThreadPoolSize";
        public static final String SCHEDULER_QUEUE_SIZE = "QueueSize";
        public static final String SCHEDULER_TASK_CHECK_INTERVAL = "TaskCheckIntervalMinutes";
        public static final String SCHEDULER_TASK_CLEANUP_INTERVAL = "TaskCleanupIntervalMinutes";
    }

    public static final String SYNAPSE_API_NAME_PREFIX = "prod";
}
