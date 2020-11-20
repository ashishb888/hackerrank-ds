package poc.java;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import poc.java.service.MyqueueService;

@SpringBootTest
public class MyqueueServiceTest {

	@Autowired
	private MyqueueService service;

	@Test
	public void test0() {
		service.add(10);
		service.add(20);
		service.add(30);
		service.add(40);
		service.add(50);
		service.add(60);
		service.remove();
		service.remove();
	}
}
