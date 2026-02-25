package com.nest.erc.parser;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("parserproject")
public class ERCParserProjectProperties {

    private String containerlocation;
    private String yamlSchemaversion;
    private String rateTableFileLocation;
    private String inputFilelocation;
    private String yamlTemplateText;
    private String algFileNameStartCharcter;
    private String dsFileNameStartCharacter;
    private String rcFileNameStartCharcter;
    private String version;
    private String ercPackageDetails;
    private String algFileNameState;
    private String algFileNameCw;
    private String dsFileName;
    private String rcFileName;
    private String rcFileNameState;
    private String projectType;
    private String coverageAvailabiltyFileName;
    private String commonConfigFile;
    private String lobName;
    private final S3InputProperties s3 = new S3InputProperties();
    private final AzureInputProperties azure = new AzureInputProperties();

    public String getContainerlocation() {
        return containerlocation;
    }

    public void setContainerlocation(String containerlocation) {
        this.containerlocation = containerlocation;
    }

    public String getYamlSchemaversion() {
        return yamlSchemaversion;
    }

    public void setYamlSchemaversion(String yamlSchemaversion) {
        this.yamlSchemaversion = yamlSchemaversion;
    }

    public String getRateTableFileLocation() {
        return rateTableFileLocation;
    }

    public void setRateTableFileLocation(String rateTableFileLocation) {
        this.rateTableFileLocation = rateTableFileLocation;
    }

    public String getInputFilelocation() {
        return inputFilelocation;
    }

    public void setInputFilelocation(String inputFilelocation) {
        this.inputFilelocation = inputFilelocation;
    }

    public String getYamlTemplateText() {
        return yamlTemplateText;
    }

    public void setYamlTemplateText(String yamlTemplateText) {
        this.yamlTemplateText = yamlTemplateText;
    }

    public String getAlgFileNameStartCharcter() {
        return algFileNameStartCharcter;
    }

    public void setAlgFileNameStartCharcter(String algFileNameStartCharcter) {
        this.algFileNameStartCharcter = algFileNameStartCharcter;
    }

    public String getDsFileNameStartCharacter() {
        return dsFileNameStartCharacter;
    }

    public void setDsFileNameStartCharacter(String dsFileNameStartCharacter) {
        this.dsFileNameStartCharacter = dsFileNameStartCharacter;
    }

    public String getRcFileNameStartCharcter() {
        return rcFileNameStartCharcter;
    }

    public void setRcFileNameStartCharcter(String rcFileNameStartCharcter) {
        this.rcFileNameStartCharcter = rcFileNameStartCharcter;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getErcPackageDetails() {
        return ercPackageDetails;
    }

    public void setErcPackageDetails(String ercPackageDetails) {
        this.ercPackageDetails = ercPackageDetails;
    }

    public String getAlgFileNameState() {
        return algFileNameState;
    }

    public void setAlgFileNameState(String algFileNameState) {
        this.algFileNameState = algFileNameState;
    }

    public String getAlgFileNameCw() {
        return algFileNameCw;
    }

    public void setAlgFileNameCw(String algFileNameCw) {
        this.algFileNameCw = algFileNameCw;
    }

    public String getDsFileName() {
        return dsFileName;
    }

    public void setDsFileName(String dsFileName) {
        this.dsFileName = dsFileName;
    }

    public String getRcFileName() {
        return rcFileName;
    }

    public void setRcFileName(String rcFileName) {
        this.rcFileName = rcFileName;
    }

    public String getRcFileNameState() {
        return rcFileNameState;
    }

    public void setRcFileNameState(String rcFileNameState) {
        this.rcFileNameState = rcFileNameState;
    }

    public String getProjectType() {
        return projectType;
    }

    public void setProjectType(String projectType) {
        this.projectType = projectType;
    }

    public String getCoverageAvailabiltyFileName() {
        return coverageAvailabiltyFileName;
    }

    public void setCoverageAvailabiltyFileName(String coverageAvailabiltyFileName) {
        this.coverageAvailabiltyFileName = coverageAvailabiltyFileName;
    }

    public String getCommonConfigFile() {
        return commonConfigFile;
    }

    public void setCommonConfigFile(String commonConfigFile) {
        this.commonConfigFile = commonConfigFile;
    }

    public String getLobName() {
        return lobName;
    }

    public void setLobName(String lobName) {
        this.lobName = lobName;
    }

    public S3InputProperties getS3() {
        return s3;
    }

    public AzureInputProperties getAzure() {
        return azure;
    }

    public static class S3InputProperties {

        private String region;
        private String profile;
        private String endpointOverride;

        public String getRegion() {
            return region;
        }

        public void setRegion(String region) {
            this.region = region;
        }

        public String getProfile() {
            return profile;
        }

        public void setProfile(String profile) {
            this.profile = profile;
        }

        public String getEndpointOverride() {
            return endpointOverride;
        }

        public void setEndpointOverride(String endpointOverride) {
            this.endpointOverride = endpointOverride;
        }
    }

    public static class AzureInputProperties {

        private String connectionString;

        public String getConnectionString() {
            return connectionString;
        }

        public void setConnectionString(String connectionString) {
            this.connectionString = connectionString;
        }
    }

}
