package poc.java.service;

import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;
import poc.java.ds.MyQueue;

@Slf4j
@Service
public class MyqueueService {

	MyQueue queue = new MyQueue();

	public void add(int data) {
		queue.add(data);
		log.debug("add: " + queue);
	}

	public void remove() {
		queue.remove();
		log.debug("remove: " + queue);
	}
}
