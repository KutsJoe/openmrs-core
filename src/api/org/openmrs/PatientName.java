package org.openmrs;

import java.util.Date;

/**
 * PatientName
 */
public class PatientName implements java.io.Serializable {

	public static final long serialVersionUID = 1L;

	// Fields

	private Integer patientNameId;
	private Patient patient;
	private boolean preferred;
	private String prefix;
	private String givenName;
	private String middleName;
	private String familyNamePrefix;
	private String familyName;
	private String familyName2;
	private String familyNameSuffix;
	private String degree;
	private Date dateCreated;
	private User creator;
	private boolean voided;
	private User voidedBy;
	private Date dateVoided;
	private String voidReason;

	// Constructors

	/** default constructor */
	public PatientName() {
	}

	/** constructor with id */
	public PatientName(Integer patientNameId) {
		this.patientNameId = patientNameId;
	}

	/** 
	 * Compares two objects for similarity
	 * 
	 * @param obj
	 * @return boolean true/false whether or not they are the same objects
	 */
	public boolean equals(Object obj) {
		if (obj instanceof PatientName) {
			PatientName pname = (PatientName) obj;
			if (this.getPatientNameId() != null && pname.getPatientNameId() != null)
				return (this.getPatientNameId().equals(pname.getPatientNameId())); 
		}
		return false;
	}
	
	// Property accessors

	/**
	 * @return Returns the creator.
	 */
	public User getCreator() {
		return creator;
	}

	/**
	 * @param creator The creator to set.
	 */
	public void setCreator(User creator) {
		this.creator = creator;
	}

	/**
	 * @return Returns the dateCreated.
	 */
	public Date getDateCreated() {
		return dateCreated;
	}

	/**
	 * @param dateCreated The dateCreated to set.
	 */
	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	/**
	 * @return Returns the dateVoided.
	 */
	public Date getDateVoided() {
		return dateVoided;
	}

	/**
	 * @param dateVoided The dateVoided to set.
	 */
	public void setDateVoided(Date dateVoided) {
		this.dateVoided = dateVoided;
	}

	/**
	 * @return Returns the degree.
	 */
	public String getDegree() {
		return degree;
	}

	/**
	 * @param degree The degree to set.
	 */
	public void setDegree(String degree) {
		this.degree = degree;
	}

	/**
	 * @return Returns the familyName.
	 */
	public String getFamilyName() {
		return familyName;
	}

	/**
	 * @param familyName The familyName to set.
	 */
	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}

	/**
	 * @return Returns the familyName2.
	 */
	public String getFamilyName2() {
		return familyName2;
	}

	/**
	 * @param familyName2 The familyName2 to set.
	 */
	public void setFamilyName2(String familyName2) {
		this.familyName2 = familyName2;
	}

	/**
	 * @return Returns the familyNamePrefix.
	 */
	public String getFamilyNamePrefix() {
		return familyNamePrefix;
	}

	/**
	 * @param familyNamePrefix The familyNamePrefix to set.
	 */
	public void setFamilyNamePrefix(String familyNamePrefix) {
		this.familyNamePrefix = familyNamePrefix;
	}

	/**
	 * @return Returns the familyNameSuffix.
	 */
	public String getFamilyNameSuffix() {
		return familyNameSuffix;
	}

	/**
	 * @param familyNameSuffix The familyNameSuffix to set.
	 */
	public void setFamilyNameSuffix(String familyNameSuffix) {
		this.familyNameSuffix = familyNameSuffix;
	}

	/**
	 * @return Returns the givenName.
	 */
	public String getGivenName() {
		return givenName;
	}

	/**
	 * @param givenName The givenName to set.
	 */
	public void setGivenName(String givenName) {
		this.givenName = givenName;
	}

	/**
	 * @return Returns the middleName.
	 */
	public String getMiddleName() {
		return middleName;
	}

	/**
	 * @param middleName The middleName to set.
	 */
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	/**
	 * @return Returns the patient.
	 */
	public Patient getPatient() {
		return patient;
	}

	/**
	 * @param patient The patient to set.
	 */
	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	/**
	 * @return Returns the patientNameId.
	 */
	public Integer getPatientNameId() {
		return patientNameId;
	}

	/**
	 * @param patientNameId The patientNameId to set.
	 */
	public void setPatientNameId(Integer patientNameId) {
		this.patientNameId = patientNameId;
	}

	/**
	 * @return Returns the preferred.
	 */
	public boolean isPreferred() {
		return preferred;
	}

	/**
	 * @param preferred The preferred to set.
	 */
	public void setPreferred(boolean preferred) {
		this.preferred = preferred;
	}

	/**
	 * @return Returns the prefix.
	 */
	public String getPrefix() {
		return prefix;
	}

	/**
	 * @param prefix The prefix to set.
	 */
	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}

	/**
	 * @return Returns the voided.
	 */
	public boolean isVoided() {
		return voided;
	}

	/**
	 * @param voided The voided to set.
	 */
	public void setVoided(boolean voided) {
		this.voided = voided;
	}

	/**
	 * @return Returns the voidedBy.
	 */
	public User getVoidedBy() {
		return voidedBy;
	}

	/**
	 * @param voidedBy The voidedBy to set.
	 */
	public void setVoidedBy(User voidedBy) {
		this.voidedBy = voidedBy;
	}

	/**
	 * @return Returns the voidReason.
	 */
	public String getVoidReason() {
		return voidReason;
	}

	/**
	 * @param voidReason The voidReason to set.
	 */
	public void setVoidReason(String voidReason) {
		this.voidReason = voidReason;
	}


}