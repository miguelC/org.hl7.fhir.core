package org.hl7.fhir.convertors.conv30_50;

import org.hl7.fhir.convertors.VersionConvertor_30_50;
import org.hl7.fhir.exceptions.FHIRException;
import java.util.Collections;

public class Bundle30_50 {

    public static org.hl7.fhir.r5.model.Bundle convertBundle(org.hl7.fhir.dstu3.model.Bundle src) throws FHIRException {
        if (src == null)
            return null;
        org.hl7.fhir.r5.model.Bundle tgt = new org.hl7.fhir.r5.model.Bundle();
        VersionConvertor_30_50.copyResource(src, tgt);
        if (src.hasIdentifier())
            tgt.setIdentifier(VersionConvertor_30_50.convertIdentifier(src.getIdentifier()));
        if (src.hasType())
            tgt.setType(convertBundleType(src.getType()));
        if (src.hasTotalElement())
            tgt.setTotalElement((org.hl7.fhir.r5.model.UnsignedIntType) VersionConvertor_30_50.convertType(src.getTotalElement()));
        if (src.hasLink()) {
            for (org.hl7.fhir.dstu3.model.Bundle.BundleLinkComponent t : src.getLink()) tgt.addLink(convertBundleLinkComponent(t));
        }
        if (src.hasEntry()) {
            for (org.hl7.fhir.dstu3.model.Bundle.BundleEntryComponent t : src.getEntry()) tgt.addEntry(convertBundleEntryComponent(t));
        }
        if (src.hasSignature())
            tgt.setSignature(VersionConvertor_30_50.convertSignature(src.getSignature()));
        return tgt;
    }

    public static org.hl7.fhir.dstu3.model.Bundle convertBundle(org.hl7.fhir.r5.model.Bundle src) throws FHIRException {
        if (src == null)
            return null;
        org.hl7.fhir.dstu3.model.Bundle tgt = new org.hl7.fhir.dstu3.model.Bundle();
        VersionConvertor_30_50.copyResource(src, tgt);
        if (src.hasIdentifier())
            tgt.setIdentifier(VersionConvertor_30_50.convertIdentifier(src.getIdentifier()));
        if (src.hasType())
            tgt.setType(convertBundleType(src.getType()));
        if (src.hasTotalElement())
            tgt.setTotalElement((org.hl7.fhir.dstu3.model.UnsignedIntType) VersionConvertor_30_50.convertType(src.getTotalElement()));
        if (src.hasLink()) {
            for (org.hl7.fhir.r5.model.Bundle.BundleLinkComponent t : src.getLink()) tgt.addLink(convertBundleLinkComponent(t));
        }
        if (src.hasEntry()) {
            for (org.hl7.fhir.r5.model.Bundle.BundleEntryComponent t : src.getEntry()) tgt.addEntry(convertBundleEntryComponent(t));
        }
        if (src.hasSignature())
            tgt.setSignature(VersionConvertor_30_50.convertSignature(src.getSignature()));
        return tgt;
    }

    public static org.hl7.fhir.dstu3.model.Bundle.BundleEntryComponent convertBundleEntryComponent(org.hl7.fhir.r5.model.Bundle.BundleEntryComponent src) throws FHIRException {
        if (src == null)
            return null;
        org.hl7.fhir.dstu3.model.Bundle.BundleEntryComponent tgt = new org.hl7.fhir.dstu3.model.Bundle.BundleEntryComponent();
        VersionConvertor_30_50.copyElement(src, tgt);
        if (src.hasLink()) {
            for (org.hl7.fhir.r5.model.Bundle.BundleLinkComponent t : src.getLink()) tgt.addLink(convertBundleLinkComponent(t));
        }
        if (src.hasFullUrlElement())
            tgt.setFullUrlElement((org.hl7.fhir.dstu3.model.UriType) VersionConvertor_30_50.convertType(src.getFullUrlElement()));
        if (src.hasResource())
            tgt.setResource(VersionConvertor_30_50.convertResource(src.getResource(), false));
        if (src.hasSearch())
            tgt.setSearch(convertBundleEntrySearchComponent(src.getSearch()));
        if (src.hasRequest())
            tgt.setRequest(convertBundleEntryRequestComponent(src.getRequest()));
        if (src.hasResponse())
            tgt.setResponse(convertBundleEntryResponseComponent(src.getResponse()));
        return tgt;
    }

    public static org.hl7.fhir.r5.model.Bundle.BundleEntryComponent convertBundleEntryComponent(org.hl7.fhir.dstu3.model.Bundle.BundleEntryComponent src) throws FHIRException {
        if (src == null)
            return null;
        org.hl7.fhir.r5.model.Bundle.BundleEntryComponent tgt = new org.hl7.fhir.r5.model.Bundle.BundleEntryComponent();
        VersionConvertor_30_50.copyElement(src, tgt);
        if (src.hasLink()) {
            for (org.hl7.fhir.dstu3.model.Bundle.BundleLinkComponent t : src.getLink()) tgt.addLink(convertBundleLinkComponent(t));
        }
        if (src.hasFullUrlElement())
            tgt.setFullUrlElement((org.hl7.fhir.r5.model.UriType) VersionConvertor_30_50.convertType(src.getFullUrlElement()));
        if (src.hasResource())
            tgt.setResource(VersionConvertor_30_50.convertResource(src.getResource(), false));
        if (src.hasSearch())
            tgt.setSearch(convertBundleEntrySearchComponent(src.getSearch()));
        if (src.hasRequest())
            tgt.setRequest(convertBundleEntryRequestComponent(src.getRequest()));
        if (src.hasResponse())
            tgt.setResponse(convertBundleEntryResponseComponent(src.getResponse()));
        return tgt;
    }

    public static org.hl7.fhir.r5.model.Bundle.BundleEntryRequestComponent convertBundleEntryRequestComponent(org.hl7.fhir.dstu3.model.Bundle.BundleEntryRequestComponent src) throws FHIRException {
        if (src == null)
            return null;
        org.hl7.fhir.r5.model.Bundle.BundleEntryRequestComponent tgt = new org.hl7.fhir.r5.model.Bundle.BundleEntryRequestComponent();
        VersionConvertor_30_50.copyElement(src, tgt);
        if (src.hasMethod())
            tgt.setMethod(convertHTTPVerb(src.getMethod()));
        if (src.hasUrlElement())
            tgt.setUrlElement((org.hl7.fhir.r5.model.UriType) VersionConvertor_30_50.convertType(src.getUrlElement()));
        if (src.hasIfNoneMatchElement())
            tgt.setIfNoneMatchElement((org.hl7.fhir.r5.model.StringType) VersionConvertor_30_50.convertType(src.getIfNoneMatchElement()));
        if (src.hasIfModifiedSinceElement())
            tgt.setIfModifiedSinceElement((org.hl7.fhir.r5.model.InstantType) VersionConvertor_30_50.convertType(src.getIfModifiedSinceElement()));
        if (src.hasIfMatchElement())
            tgt.setIfMatchElement((org.hl7.fhir.r5.model.StringType) VersionConvertor_30_50.convertType(src.getIfMatchElement()));
        if (src.hasIfNoneExistElement())
            tgt.setIfNoneExistElement((org.hl7.fhir.r5.model.StringType) VersionConvertor_30_50.convertType(src.getIfNoneExistElement()));
        return tgt;
    }

    public static org.hl7.fhir.dstu3.model.Bundle.BundleEntryRequestComponent convertBundleEntryRequestComponent(org.hl7.fhir.r5.model.Bundle.BundleEntryRequestComponent src) throws FHIRException {
        if (src == null)
            return null;
        org.hl7.fhir.dstu3.model.Bundle.BundleEntryRequestComponent tgt = new org.hl7.fhir.dstu3.model.Bundle.BundleEntryRequestComponent();
        VersionConvertor_30_50.copyElement(src, tgt);
        if (src.hasMethod())
            tgt.setMethod(convertHTTPVerb(src.getMethod()));
        if (src.hasUrlElement())
            tgt.setUrlElement((org.hl7.fhir.dstu3.model.UriType) VersionConvertor_30_50.convertType(src.getUrlElement()));
        if (src.hasIfNoneMatchElement())
            tgt.setIfNoneMatchElement((org.hl7.fhir.dstu3.model.StringType) VersionConvertor_30_50.convertType(src.getIfNoneMatchElement()));
        if (src.hasIfModifiedSinceElement())
            tgt.setIfModifiedSinceElement((org.hl7.fhir.dstu3.model.InstantType) VersionConvertor_30_50.convertType(src.getIfModifiedSinceElement()));
        if (src.hasIfMatchElement())
            tgt.setIfMatchElement((org.hl7.fhir.dstu3.model.StringType) VersionConvertor_30_50.convertType(src.getIfMatchElement()));
        if (src.hasIfNoneExistElement())
            tgt.setIfNoneExistElement((org.hl7.fhir.dstu3.model.StringType) VersionConvertor_30_50.convertType(src.getIfNoneExistElement()));
        return tgt;
    }

    public static org.hl7.fhir.r5.model.Bundle.BundleEntryResponseComponent convertBundleEntryResponseComponent(org.hl7.fhir.dstu3.model.Bundle.BundleEntryResponseComponent src) throws FHIRException {
        if (src == null)
            return null;
        org.hl7.fhir.r5.model.Bundle.BundleEntryResponseComponent tgt = new org.hl7.fhir.r5.model.Bundle.BundleEntryResponseComponent();
        VersionConvertor_30_50.copyElement(src, tgt);
        if (src.hasStatusElement())
            tgt.setStatusElement((org.hl7.fhir.r5.model.StringType) VersionConvertor_30_50.convertType(src.getStatusElement()));
        if (src.hasLocationElement())
            tgt.setLocationElement((org.hl7.fhir.r5.model.UriType) VersionConvertor_30_50.convertType(src.getLocationElement()));
        if (src.hasEtagElement())
            tgt.setEtagElement((org.hl7.fhir.r5.model.StringType) VersionConvertor_30_50.convertType(src.getEtagElement()));
        if (src.hasLastModifiedElement())
            tgt.setLastModifiedElement((org.hl7.fhir.r5.model.InstantType) VersionConvertor_30_50.convertType(src.getLastModifiedElement()));
        if (src.hasOutcome())
            tgt.setOutcome(VersionConvertor_30_50.convertResource(src.getOutcome(), false));
        return tgt;
    }

    public static org.hl7.fhir.dstu3.model.Bundle.BundleEntryResponseComponent convertBundleEntryResponseComponent(org.hl7.fhir.r5.model.Bundle.BundleEntryResponseComponent src) throws FHIRException {
        if (src == null)
            return null;
        org.hl7.fhir.dstu3.model.Bundle.BundleEntryResponseComponent tgt = new org.hl7.fhir.dstu3.model.Bundle.BundleEntryResponseComponent();
        VersionConvertor_30_50.copyElement(src, tgt);
        if (src.hasStatusElement())
            tgt.setStatusElement((org.hl7.fhir.dstu3.model.StringType) VersionConvertor_30_50.convertType(src.getStatusElement()));
        if (src.hasLocationElement())
            tgt.setLocationElement((org.hl7.fhir.dstu3.model.UriType) VersionConvertor_30_50.convertType(src.getLocationElement()));
        if (src.hasEtagElement())
            tgt.setEtagElement((org.hl7.fhir.dstu3.model.StringType) VersionConvertor_30_50.convertType(src.getEtagElement()));
        if (src.hasLastModifiedElement())
            tgt.setLastModifiedElement((org.hl7.fhir.dstu3.model.InstantType) VersionConvertor_30_50.convertType(src.getLastModifiedElement()));
        if (src.hasOutcome())
            tgt.setOutcome(VersionConvertor_30_50.convertResource(src.getOutcome(), false));
        return tgt;
    }

    public static org.hl7.fhir.dstu3.model.Bundle.BundleEntrySearchComponent convertBundleEntrySearchComponent(org.hl7.fhir.r5.model.Bundle.BundleEntrySearchComponent src) throws FHIRException {
        if (src == null)
            return null;
        org.hl7.fhir.dstu3.model.Bundle.BundleEntrySearchComponent tgt = new org.hl7.fhir.dstu3.model.Bundle.BundleEntrySearchComponent();
        VersionConvertor_30_50.copyElement(src, tgt);
        if (src.hasMode())
            tgt.setMode(convertSearchEntryMode(src.getMode()));
        if (src.hasScoreElement())
            tgt.setScoreElement((org.hl7.fhir.dstu3.model.DecimalType) VersionConvertor_30_50.convertType(src.getScoreElement()));
        return tgt;
    }

    public static org.hl7.fhir.r5.model.Bundle.BundleEntrySearchComponent convertBundleEntrySearchComponent(org.hl7.fhir.dstu3.model.Bundle.BundleEntrySearchComponent src) throws FHIRException {
        if (src == null)
            return null;
        org.hl7.fhir.r5.model.Bundle.BundleEntrySearchComponent tgt = new org.hl7.fhir.r5.model.Bundle.BundleEntrySearchComponent();
        VersionConvertor_30_50.copyElement(src, tgt);
        if (src.hasMode())
            tgt.setMode(convertSearchEntryMode(src.getMode()));
        if (src.hasScoreElement())
            tgt.setScoreElement((org.hl7.fhir.r5.model.DecimalType) VersionConvertor_30_50.convertType(src.getScoreElement()));
        return tgt;
    }

    public static org.hl7.fhir.r5.model.Bundle.BundleLinkComponent convertBundleLinkComponent(org.hl7.fhir.dstu3.model.Bundle.BundleLinkComponent src) throws FHIRException {
        if (src == null)
            return null;
        org.hl7.fhir.r5.model.Bundle.BundleLinkComponent tgt = new org.hl7.fhir.r5.model.Bundle.BundleLinkComponent();
        VersionConvertor_30_50.copyElement(src, tgt);
        if (src.hasRelationElement())
            tgt.setRelationElement((org.hl7.fhir.r5.model.StringType) VersionConvertor_30_50.convertType(src.getRelationElement()));
        if (src.hasUrlElement())
            tgt.setUrlElement((org.hl7.fhir.r5.model.UriType) VersionConvertor_30_50.convertType(src.getUrlElement()));
        return tgt;
    }

    public static org.hl7.fhir.dstu3.model.Bundle.BundleLinkComponent convertBundleLinkComponent(org.hl7.fhir.r5.model.Bundle.BundleLinkComponent src) throws FHIRException {
        if (src == null)
            return null;
        org.hl7.fhir.dstu3.model.Bundle.BundleLinkComponent tgt = new org.hl7.fhir.dstu3.model.Bundle.BundleLinkComponent();
        VersionConvertor_30_50.copyElement(src, tgt);
        if (src.hasRelationElement())
            tgt.setRelationElement((org.hl7.fhir.dstu3.model.StringType) VersionConvertor_30_50.convertType(src.getRelationElement()));
        if (src.hasUrlElement())
            tgt.setUrlElement((org.hl7.fhir.dstu3.model.UriType) VersionConvertor_30_50.convertType(src.getUrlElement()));
        return tgt;
    }

    static public org.hl7.fhir.dstu3.model.Bundle.BundleType convertBundleType(org.hl7.fhir.r5.model.Bundle.BundleType src) throws FHIRException {
        if (src == null)
            return null;
        switch(src) {
            case DOCUMENT:
                return org.hl7.fhir.dstu3.model.Bundle.BundleType.DOCUMENT;
            case MESSAGE:
                return org.hl7.fhir.dstu3.model.Bundle.BundleType.MESSAGE;
            case TRANSACTION:
                return org.hl7.fhir.dstu3.model.Bundle.BundleType.TRANSACTION;
            case TRANSACTIONRESPONSE:
                return org.hl7.fhir.dstu3.model.Bundle.BundleType.TRANSACTIONRESPONSE;
            case BATCH:
                return org.hl7.fhir.dstu3.model.Bundle.BundleType.BATCH;
            case BATCHRESPONSE:
                return org.hl7.fhir.dstu3.model.Bundle.BundleType.BATCHRESPONSE;
            case HISTORY:
                return org.hl7.fhir.dstu3.model.Bundle.BundleType.HISTORY;
            case SEARCHSET:
                return org.hl7.fhir.dstu3.model.Bundle.BundleType.SEARCHSET;
            case COLLECTION:
                return org.hl7.fhir.dstu3.model.Bundle.BundleType.COLLECTION;
            default:
                return org.hl7.fhir.dstu3.model.Bundle.BundleType.NULL;
        }
    }

    static public org.hl7.fhir.r5.model.Bundle.BundleType convertBundleType(org.hl7.fhir.dstu3.model.Bundle.BundleType src) throws FHIRException {
        if (src == null)
            return null;
        switch(src) {
            case DOCUMENT:
                return org.hl7.fhir.r5.model.Bundle.BundleType.DOCUMENT;
            case MESSAGE:
                return org.hl7.fhir.r5.model.Bundle.BundleType.MESSAGE;
            case TRANSACTION:
                return org.hl7.fhir.r5.model.Bundle.BundleType.TRANSACTION;
            case TRANSACTIONRESPONSE:
                return org.hl7.fhir.r5.model.Bundle.BundleType.TRANSACTIONRESPONSE;
            case BATCH:
                return org.hl7.fhir.r5.model.Bundle.BundleType.BATCH;
            case BATCHRESPONSE:
                return org.hl7.fhir.r5.model.Bundle.BundleType.BATCHRESPONSE;
            case HISTORY:
                return org.hl7.fhir.r5.model.Bundle.BundleType.HISTORY;
            case SEARCHSET:
                return org.hl7.fhir.r5.model.Bundle.BundleType.SEARCHSET;
            case COLLECTION:
                return org.hl7.fhir.r5.model.Bundle.BundleType.COLLECTION;
            default:
                return org.hl7.fhir.r5.model.Bundle.BundleType.NULL;
        }
    }

    static public org.hl7.fhir.dstu3.model.Bundle.HTTPVerb convertHTTPVerb(org.hl7.fhir.r5.model.Bundle.HTTPVerb src) throws FHIRException {
        if (src == null)
            return null;
        switch(src) {
            case GET:
                return org.hl7.fhir.dstu3.model.Bundle.HTTPVerb.GET;
            case POST:
                return org.hl7.fhir.dstu3.model.Bundle.HTTPVerb.POST;
            case PUT:
                return org.hl7.fhir.dstu3.model.Bundle.HTTPVerb.PUT;
            case DELETE:
                return org.hl7.fhir.dstu3.model.Bundle.HTTPVerb.DELETE;
            default:
                return org.hl7.fhir.dstu3.model.Bundle.HTTPVerb.NULL;
        }
    }

    static public org.hl7.fhir.r5.model.Bundle.HTTPVerb convertHTTPVerb(org.hl7.fhir.dstu3.model.Bundle.HTTPVerb src) throws FHIRException {
        if (src == null)
            return null;
        switch(src) {
            case GET:
                return org.hl7.fhir.r5.model.Bundle.HTTPVerb.GET;
            case POST:
                return org.hl7.fhir.r5.model.Bundle.HTTPVerb.POST;
            case PUT:
                return org.hl7.fhir.r5.model.Bundle.HTTPVerb.PUT;
            case DELETE:
                return org.hl7.fhir.r5.model.Bundle.HTTPVerb.DELETE;
            default:
                return org.hl7.fhir.r5.model.Bundle.HTTPVerb.NULL;
        }
    }

    static public org.hl7.fhir.dstu3.model.Bundle.SearchEntryMode convertSearchEntryMode(org.hl7.fhir.r5.model.Bundle.SearchEntryMode src) throws FHIRException {
        if (src == null)
            return null;
        switch(src) {
            case MATCH:
                return org.hl7.fhir.dstu3.model.Bundle.SearchEntryMode.MATCH;
            case INCLUDE:
                return org.hl7.fhir.dstu3.model.Bundle.SearchEntryMode.INCLUDE;
            case OUTCOME:
                return org.hl7.fhir.dstu3.model.Bundle.SearchEntryMode.OUTCOME;
            default:
                return org.hl7.fhir.dstu3.model.Bundle.SearchEntryMode.NULL;
        }
    }

    static public org.hl7.fhir.r5.model.Bundle.SearchEntryMode convertSearchEntryMode(org.hl7.fhir.dstu3.model.Bundle.SearchEntryMode src) throws FHIRException {
        if (src == null)
            return null;
        switch(src) {
            case MATCH:
                return org.hl7.fhir.r5.model.Bundle.SearchEntryMode.MATCH;
            case INCLUDE:
                return org.hl7.fhir.r5.model.Bundle.SearchEntryMode.INCLUDE;
            case OUTCOME:
                return org.hl7.fhir.r5.model.Bundle.SearchEntryMode.OUTCOME;
            default:
                return org.hl7.fhir.r5.model.Bundle.SearchEntryMode.NULL;
        }
    }
}