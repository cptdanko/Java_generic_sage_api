package com.bhuman.exm.models;

/*
 * Contains a small selection of fields from the Sage API found at
 * https://developer.intacct.com/api/project-resource-mgmt/projects/
 * Project POJO
 */
public class Project {

	// some required fields
	private String projectId;
	private String name;
	private String projectCategory;

	// optional fields
	private String description;
	private String parentId;
	private boolean invoiceWithParent;
	private String projectType;

	public Project() {
	}

	public Project(String projectId, String name, String category) {
		this.name = name;
		this.projectId = projectId;
		this.projectCategory = category;
	}

	public String getProjectId() {
		return projectId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProjectCategory() {
		return projectCategory;
	}

	public void setProjectCategory(String projectCategory) {
		this.projectCategory = projectCategory;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getParentId() {
		return parentId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

	public boolean isInvoiceWithParent() {
		return invoiceWithParent;
	}

	public void setInvoiceWithParent(boolean invoiceWithParent) {
		this.invoiceWithParent = invoiceWithParent;
	}

	public String getProjectType() {
		return projectType;
	}

	public void setProjectType(String projectType) {
		this.projectType = projectType;
	}

}
