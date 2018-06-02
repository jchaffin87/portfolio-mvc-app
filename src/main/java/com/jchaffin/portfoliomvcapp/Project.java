package com.jchaffin.portfoliomvcapp;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Project {

	@Id
	@GeneratedValue
	private Long projectId;
	private String projectName;
	private String imageUrl;
	private String githubUrl;

	@Lob
	private String projectDescription;

	@ManyToOne
	private Category category;

	@ManyToMany
	private Set<Tag> tags;

	public Project() {

	}

	public Project(Category category, String projectName, String imageUrl, String githubUrl, String projectDescription,
			Tag... tags) {
		this.category = category;
		this.projectName = projectName;
		this.imageUrl = imageUrl;
		this.githubUrl = githubUrl;
		this.projectDescription = projectDescription;
		this.tags = new HashSet<>(Arrays.asList(tags));

	}

	public Long getProjectId() {
		return projectId;
	}

	public String getProjectName() {
		return projectName;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public String getGithubUrl() {
		return githubUrl;
	}

	public String getProjectDescription() {
		return projectDescription;
	}

	public Category getCategory() {
		return category;
	}

	public Set<Tag> getTags() {
		return tags;
	}

	@Override
	public String toString() {
		return String.format(
				"Project[projectId='%d', category'%s', projectName='%s',"
						+ "imageUrl='%s', githubUrl='%s', projectDescription='%s', tag='%s']",
				projectId, category, projectName, imageUrl, githubUrl, projectDescription, tags);
	}

}
