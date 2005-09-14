package org.openmrs;

import java.util.Date;

/**
 * FormField 
 * 
 * @author Ben Wolfe
 * @version 1.0
 */
public class FormField implements java.io.Serializable {

	public static final long serialVersionUID = 1L;

	// Fields

	private Integer formFieldId;
	private FormField formField;
	private Form form;
	private Field field;
	private Integer fieldNumber;
	private String fieldPart;
	private Integer pageNumber;
	private Integer minOccurs;
	private Integer maxOccurs;
	private boolean required;
	private Date dateChanged;
	private Date dateCreated;
	private User changedBy;
	private User creator;

	// Constructors

	/** default constructor */
	public FormField() {
	}

	/** constructor with id */
	public FormField(Integer formFieldId) {
		this.formFieldId = formFieldId;
	}

	/** 
	 * Compares two objects for similarity
	 * 
	 * @param obj
	 * @return boolean true/false whether or not they are the same objects
	 */
	public boolean equals(Object obj) {
		if (obj instanceof FormField)
		{
			FormField f = (FormField)obj;
			if (this.getFormFieldId() != null && f.getFormFieldId() != null)
				return (this.getFormFieldId().equals(f.getFormFieldId()));
			return (this.getFormField().equals(f.getFormField()) &&
					this.getForm().equals(f.getForm()) &&
					this.getField().equals(f.getField()));
		}
		return false;
	}
	
	// Property accessors

	/**
	 * @return Returns the changedBy.
	 */
	public User getChangedBy() {
		return changedBy;
	}

	/**
	 * @param changedBy The changedBy to set.
	 */
	public void setChangedBy(User changedBy) {
		this.changedBy = changedBy;
	}

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
	 * @return Returns the dateChanged.
	 */
	public Date getDateChanged() {
		return dateChanged;
	}

	/**
	 * @param dateChanged The dateChanged to set.
	 */
	public void setDateChanged(Date dateChanged) {
		this.dateChanged = dateChanged;
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
	 * @return Returns the field.
	 */
	public Field getField() {
		return field;
	}

	/**
	 * @param field The field to set.
	 */
	public void setField(Field field) {
		this.field = field;
	}

	/**
	 * @return Returns the fieldNumber.
	 */
	public Integer getFieldNumber() {
		return fieldNumber;
	}

	/**
	 * @param fieldNumber The fieldNumber to set.
	 */
	public void setFieldNumber(Integer fieldNumber) {
		this.fieldNumber = fieldNumber;
	}

	/**
	 * @return Returns the fieldPart.
	 */
	public String getFieldPart() {
		return fieldPart;
	}

	/**
	 * @param fieldPart The fieldPart to set.
	 */
	public void setFieldPart(String fieldPart) {
		this.fieldPart = fieldPart;
	}

	/**
	 * @return Returns the form.
	 */
	public Form getForm() {
		return form;
	}

	/**
	 * @param form The form to set.
	 */
	public void setForm(Form form) {
		this.form = form;
	}

	/**
	 * @return Returns the formField.
	 */
	public FormField getFormField() {
		return formField;
	}

	/**
	 * @param formField The formField to set.
	 */
	public void setFormField(FormField formField) {
		this.formField = formField;
	}

	/**
	 * @return Returns the formFieldId.
	 */
	public Integer getFormFieldId() {
		return formFieldId;
	}

	/**
	 * @param formFieldId The formFieldId to set.
	 */
	public void setFormFieldId(Integer formFieldId) {
		this.formFieldId = formFieldId;
	}

	/**
	 * @return Returns the maxOccurs.
	 */
	public Integer getMaxOccurs() {
		return maxOccurs;
	}

	/**
	 * @param maxOccurs The maxOccurs to set.
	 */
	public void setMaxOccurs(Integer maxOccurs) {
		this.maxOccurs = maxOccurs;
	}

	/**
	 * @return Returns the minOccurs.
	 */
	public Integer getMinOccurs() {
		return minOccurs;
	}

	/**
	 * @param minOccurs The minOccurs to set.
	 */
	public void setMinOccurs(Integer minOccurs) {
		this.minOccurs = minOccurs;
	}

	/**
	 * @return Returns the pageNumber.
	 */
	public Integer getPageNumber() {
		return pageNumber;
	}

	/**
	 * @param pageNumber The pageNumber to set.
	 */
	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	/**
	 * @return Returns the required status.
	 */
	public Boolean isRequired() {
		return required;
	}

	/**
	 * @param required The required status to set.
	 */
	public void setRequired(Boolean required) {
		this.required = required;
	}


}