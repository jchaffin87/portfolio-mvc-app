package com.jchaffin.portfoliomvcapp;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PortfolioController {

	@Resource
	ProjectRepository projectRepo;

	@Resource
	CategoryRepository categoryRepo;

	@Resource
	TagRepository tagRepo;

	@RequestMapping("/projects")
	public String showAllProjects(Model model) {
		model.addAttribute("projects", projectRepo.findAll());
		return "/projects";
	}

	@RequestMapping("/project")
	public String showOneProject(@RequestParam(value = "id") Long projectId, Model model) {
		model.addAttribute("project", projectRepo.findById(projectId).orElse(null));

		return "/project";
	}

	@RequestMapping("/categories")
	public String showAllCategories(Model model) {
		model.addAttribute("categories", categoryRepo.findAll());
		return "categories";
	}

	@RequestMapping("/category")
	public String showOneCategory(@RequestParam(value = "id") Long categoryId, Model model) {
		model.addAttribute("category", categoryRepo.findById(categoryId).orElse(null));
		return "category";
	}

	@RequestMapping("/tags")
	public String showAllTags(Model model) {
		model.addAttribute("tags", tagRepo.findAll());
		return "tags";
	}

	@RequestMapping("/tag")
	public String showOneTag(@RequestParam(value = "id") Long tagId, Model model) {
		model.addAttribute("tag", tagRepo.findById(tagId).orElse(null));
		return "tag";
	}

}
