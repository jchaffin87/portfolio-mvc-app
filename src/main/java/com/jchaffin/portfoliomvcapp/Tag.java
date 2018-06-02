package com.jchaffin.portfoliomvcapp;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Tag {

	@Id
	@GeneratedValue
	private Long tagId;
	private String tagName;

	@ManyToMany(mappedBy = "tags")
	protected Set<Project> projectsTagged = new HashSet<Project>();

	protected Tag() {

	}

	public Tag(String tagName, Project... projectsTagged) {
		this.tagName = tagName;
	}

	public Long getTagId() {
		return tagId;
	}

	public String getTagName() {
		return tagName;
	}

	public Set<Project> getProjectsTagged() {
		return projectsTagged;
	}

	@Override
	public String toString() {
		return String.format("Tag[tagId='%d', tagName='%s', reviewsTagged='%s']", tagId, tagName, projectsTagged);
	}

}
