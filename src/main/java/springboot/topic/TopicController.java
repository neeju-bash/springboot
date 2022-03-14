package springboot.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	@RequestMapping("/topics")
	public List<Topic> getAlltopic()
	{
		return Arrays.asList(
				new Topic("Neeraj","Mohan","M C"),
				new Topic("Mysi","Mohan","M C"),
				new Topic("Nysi","Mohan","M C"));
	}

}
