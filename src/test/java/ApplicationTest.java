import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;



@RunWith(SpringJUnit4ClassRunner.class)
public class ApplicationTest {

	private MockMvc mockMvc;

	@Before
	public void setUp() throws Exception{

		mockMvc = MockMvcBuilders.standaloneSetup( new Application() ).build();
	}

	@Test
	public void test() throws Exception{

		mockMvc.perform(MockMvcRequestBuilders.get("/").accept(MediaType.TEXT_PLAIN) )
				.andExpect(MockMvcResultMatchers.status().isOk() )
				.andExpect( MockMvcResultMatchers.content().string(
						Matchers.equalTo("hi")
				));
	}
}
