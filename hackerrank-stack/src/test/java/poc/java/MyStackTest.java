package poc.java;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import poc.java.service.MyStackService;

@SpringBootTest
public class MyStackTest {

	@Autowired
	private MyStackService service;

	@Test
	public void test1() {
		service.push(10);
		service.push(20);
		service.pop();
		service.push(30);
		service.push(40);
		service.push(50);
		service.pop();
	}
}
