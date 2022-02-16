package cc.kejun.origin;


import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@RunWith(SpringRunner.class)
public class AppTest {

    private MockMvc mockMvc;
    @Autowired
    private WebApplicationContext webApplicationContext;

    @Before
    public void setUp() {
        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
    }


    @Test
    public void test1() throws Exception {
        MockHttpServletRequestBuilder request = MockMvcRequestBuilders.get("/test/get").param("a", "b");
        mockMvc.perform(request).andExpect(status().isOk()).andExpect(content().string("ok"));
        MockHttpServletRequestBuilder fr = MockMvcRequestBuilders.get("/test/get").param("ex", "true");
        mockMvc.perform(fr).andExpect(status().isInternalServerError()).andExpect(content().string("ex"));

    }

}
