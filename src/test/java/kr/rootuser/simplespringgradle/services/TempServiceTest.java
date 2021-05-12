package kr.rootuser.simplespringgradle.services;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class TempServiceTest {

	@Autowired
	private MockMvc mvc;

	@Test
	public void testController() throws Exception {

		MvcResult retn = mvc.perform(MockMvcRequestBuilders.get("/api/v1")).
				andExpect(status().isOk()).
				andReturn();
		String str = retn.getResponse().getContentAsString();
		assertThat(str).startsWith("Simple");

	}
	
	@Test
	public void testListDocs() throws Exception {

		MvcResult retn = mvc.perform(MockMvcRequestBuilders.get("/api/v1/documents")).
				andExpect(status().isOk()).
				andReturn();
		String str = retn.getResponse().getContentAsString();
		List<String> temp = Arrays.asList(str);
		assertThat(temp.size()).isEqualTo(1);

	}
}