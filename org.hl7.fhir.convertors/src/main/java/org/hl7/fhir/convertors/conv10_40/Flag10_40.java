package org.hl7.fhir.convertors.conv10_40;

import org.hl7.fhir.convertors.VersionConvertor_10_40;
import org.hl7.fhir.exceptions.FHIRException;

public class Flag10_40 {

    public static org.hl7.fhir.r4.model.Flag convertFlag(org.hl7.fhir.dstu2.model.Flag src) throws FHIRException {
        if (src == null || src.isEmpty())
            return null;
        org.hl7.fhir.r4.model.Flag tgt = new org.hl7.fhir.r4.model.Flag();
        VersionConvertor_10_40.copyDomainResource(src, tgt);
        for (org.hl7.fhir.dstu2.model.Identifier t : src.getIdentifier()) tgt.addIdentifier(VersionConvertor_10_40.convertIdentifier(t));
        if (src.hasCategory())
            tgt.addCategory(VersionConvertor_10_40.convertCodeableConcept(src.getCategory()));
        if (src.hasStatus())
            tgt.setStatusElement(convertFlagStatus(src.getStatusElement()));
        if (src.hasPeriod())
            tgt.setPeriod(VersionConvertor_10_40.convertPeriod(src.getPeriod()));
        if (src.hasSubject())
            tgt.setSubject(VersionConvertor_10_40.convertReference(src.getSubject()));
        if (src.hasEncounter())
            tgt.setEncounter(VersionConvertor_10_40.convertReference(src.getEncounter()));
        if (src.hasAuthor())
            tgt.setAuthor(VersionConvertor_10_40.convertReference(src.getAuthor()));
        if (src.hasCode())
            tgt.setCode(VersionConvertor_10_40.convertCodeableConcept(src.getCode()));
        return tgt;
    }

    public static org.hl7.fhir.dstu2.model.Flag convertFlag(org.hl7.fhir.r4.model.Flag src) throws FHIRException {
        if (src == null || src.isEmpty())
            return null;
        org.hl7.fhir.dstu2.model.Flag tgt = new org.hl7.fhir.dstu2.model.Flag();
        VersionConvertor_10_40.copyDomainResource(src, tgt);
        for (org.hl7.fhir.r4.model.Identifier t : src.getIdentifier()) tgt.addIdentifier(VersionConvertor_10_40.convertIdentifier(t));
        if (src.hasCategory())
            tgt.setCategory(VersionConvertor_10_40.convertCodeableConcept(src.getCategoryFirstRep()));
        if (src.hasStatus())
            tgt.setStatusElement(convertFlagStatus(src.getStatusElement()));
        if (src.hasPeriod())
            tgt.setPeriod(VersionConvertor_10_40.convertPeriod(src.getPeriod()));
        if (src.hasSubject())
            tgt.setSubject(VersionConvertor_10_40.convertReference(src.getSubject()));
        if (src.hasEncounter())
            tgt.setEncounter(VersionConvertor_10_40.convertReference(src.getEncounter()));
        if (src.hasAuthor())
            tgt.setAuthor(VersionConvertor_10_40.convertReference(src.getAuthor()));
        if (src.hasCode())
            tgt.setCode(VersionConvertor_10_40.convertCodeableConcept(src.getCode()));
        return tgt;
    }

    static public org.hl7.fhir.dstu2.model.Enumeration<org.hl7.fhir.dstu2.model.Flag.FlagStatus> convertFlagStatus(org.hl7.fhir.r4.model.Enumeration<org.hl7.fhir.r4.model.Flag.FlagStatus> src) throws FHIRException {
        if (src == null || src.isEmpty())
            return null;
        org.hl7.fhir.dstu2.model.Enumeration<org.hl7.fhir.dstu2.model.Flag.FlagStatus> tgt = new org.hl7.fhir.dstu2.model.Enumeration<>(new org.hl7.fhir.dstu2.model.Flag.FlagStatusEnumFactory());
        VersionConvertor_10_40.copyElement(src, tgt);
        switch(src.getValue()) {
            case ACTIVE:
                tgt.setValue(org.hl7.fhir.dstu2.model.Flag.FlagStatus.ACTIVE);
                break;
            case INACTIVE:
                tgt.setValue(org.hl7.fhir.dstu2.model.Flag.FlagStatus.INACTIVE);
                break;
            case ENTEREDINERROR:
                tgt.setValue(org.hl7.fhir.dstu2.model.Flag.FlagStatus.ENTEREDINERROR);
                break;
            default:
                tgt.setValue(org.hl7.fhir.dstu2.model.Flag.FlagStatus.NULL);
                break;
        }
        return tgt;
    }

    static public org.hl7.fhir.r4.model.Enumeration<org.hl7.fhir.r4.model.Flag.FlagStatus> convertFlagStatus(org.hl7.fhir.dstu2.model.Enumeration<org.hl7.fhir.dstu2.model.Flag.FlagStatus> src) throws FHIRException {
        if (src == null || src.isEmpty())
            return null;
        org.hl7.fhir.r4.model.Enumeration<org.hl7.fhir.r4.model.Flag.FlagStatus> tgt = new org.hl7.fhir.r4.model.Enumeration<>(new org.hl7.fhir.r4.model.Flag.FlagStatusEnumFactory());
        VersionConvertor_10_40.copyElement(src, tgt);
        switch(src.getValue()) {
            case ACTIVE:
                tgt.setValue(org.hl7.fhir.r4.model.Flag.FlagStatus.ACTIVE);
                break;
            case INACTIVE:
                tgt.setValue(org.hl7.fhir.r4.model.Flag.FlagStatus.INACTIVE);
                break;
            case ENTEREDINERROR:
                tgt.setValue(org.hl7.fhir.r4.model.Flag.FlagStatus.ENTEREDINERROR);
                break;
            default:
                tgt.setValue(org.hl7.fhir.r4.model.Flag.FlagStatus.NULL);
                break;
        }
        return tgt;
    }
}