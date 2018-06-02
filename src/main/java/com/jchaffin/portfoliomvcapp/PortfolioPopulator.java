package com.jchaffin.portfoliomvcapp;

import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class PortfolioPopulator implements CommandLineRunner {

	@Resource
	ProjectRepository projectRepo;

	@Resource
	CategoryRepository categoryRepo;

	@Resource
	TagRepository tagRepo;

	@Override
	public void run(String... args) throws Exception {

		Category category1 = new Category("Exercises");
		categoryRepo.save(category1);
		Category category2 = new Category("Apps");
		categoryRepo.save(category2);
		Category category3 = new Category("Sites");
		categoryRepo.save(category3);

		Tag tag1 = new Tag("HTML");
		tagRepo.save(tag1);
		Tag tag2 = new Tag("CSS");
		tagRepo.save(tag2);
		Tag tag3 = new Tag("Javascript");
		tagRepo.save(tag3);
		Tag tag4 = new Tag("jQuery");
		tagRepo.save(tag4);
		Tag tag5 = new Tag("Java");
		tagRepo.save(tag5);
		Tag tag6 = new Tag("TDD");
		tagRepo.save(tag6);
		Tag tag7 = new Tag("Spring");
		tagRepo.save(tag7);
		Tag tag8 = new Tag("HAML");
		tagRepo.save(tag8);
		Tag tag9 = new Tag("SASS");
		tagRepo.save(tag9);

		Project project1 = new Project(category1, "Project 1", "/image.jpg", "www.github.com",
				"Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. "
						+ "Aenean massa. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. "
						+ "Donec quam felis, ultricies nec, pellentesque eu, pretium quis, sem. Nulla consequat massa quis enim. "
						+ "Donec pede justo, fringilla vel, aliquet nec, vulputate eget, arcu. In enim justo, rhoncus ut, "
						+ "imperdiet a, venenatis vitae, justo. Nullam dictum felis eu pede mollis pretium. Integer tincidunt."
						+ " Cras dapibus. Vivamus elementum semper nisi. Aenean vulputate eleifend tellus.",
				tag1);
		projectRepo.save(project1);

		Project project2 = new Project(category2, "Project 2", "/image.jpg", "www.github.com",
				"Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. "
						+ "Aenean massa. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. "
						+ "Donec quam felis, ultricies nec, pellentesque eu, pretium quis, sem. Nulla consequat massa quis enim. "
						+ "Donec pede justo, fringilla vel, aliquet nec, vulputate eget, arcu. In enim justo, rhoncus ut, "
						+ "imperdiet a, venenatis vitae, justo. Nullam dictum felis eu pede mollis pretium. Integer tincidunt."
						+ " Cras dapibus. Vivamus elementum semper nisi. Aenean vulputate eleifend tellus.",
				tag2);
		projectRepo.save(project2);

		Project project3 = new Project(category3, "Project 3", "/image.jpg", "www.github.com",
				"Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. "
						+ "Aenean massa. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. "
						+ "Donec quam felis, ultricies nec, pellentesque eu, pretium quis, sem. Nulla consequat massa quis enim. "
						+ "Donec pede justo, fringilla vel, aliquet nec, vulputate eget, arcu. In enim justo, rhoncus ut, "
						+ "imperdiet a, venenatis vitae, justo. Nullam dictum felis eu pede mollis pretium. Integer tincidunt."
						+ " Cras dapibus. Vivamus elementum semper nisi. Aenean vulputate eleifend tellus.",
				tag3, tag4, tag5, tag6, tag7, tag8, tag9);
		projectRepo.save(project3);

	}

	public PortfolioPopulator() {

	}

}
