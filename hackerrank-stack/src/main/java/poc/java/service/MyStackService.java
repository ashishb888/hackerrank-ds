package poc.java.service;

import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;
import poc.java.ds.MyStack;

@Slf4j
@Service
public class MyStackService {

	private MyStack stack = new MyStack();

	public void push(int data) {
		stack.push(data);
		log.debug("push: " + stack);
	}

	public void pop() {
		stack.pop();
		log.debug("pop: " + stack);
	}
}
