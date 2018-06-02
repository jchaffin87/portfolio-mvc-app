package com.jchaffin.portfoliomvcapp;

import static org.hamcrest.CoreMatchers.is;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import java.util.Optional;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@WebMvcTest(PortfolioController.class)
public class PortfolioControllerTest {

	@Resource
	private MockMvc mvc;

	@MockBean
	private ProjectRepository projectRepo;

	@MockBean
	private CategoryRepository categoryRepo;

	@MockBean
	private TagRepository tagRepo;

	@Mock
	private Project project;

	@Test
	public void shouldRouteToSingleProjectView() throws Exception {
		long projectId = 1;
		when(projectRepo.findById(projectId)).thenReturn(Optional.of(project));
		mvc.perform(get("/project?id=1")).andExpect(view().name(is("project")));
	}

}
