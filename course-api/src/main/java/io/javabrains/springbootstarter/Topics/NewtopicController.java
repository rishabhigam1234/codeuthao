package io.javabrains.springbootstarter.Topics;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
public class NewtopicController {
	@Autowired 
	TopicService topicService;
	public NewtopicController(TopicService topicservice)
	{
		this.topicService=topicservice;
	}
	
	
	

	@RequestMapping("/topics")
	public List<Topic> getTopics()
	{
		return topicService.getTopics();		
	}
	
	@RequestMapping("/topics/{id}")
	public Topic getTopic(@PathVariable String id)
	{
		return topicService.getTopic(id);
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/topics")
	public List<Topic> addTopic(@RequestBody Topic topic)
	{
		return topicService.addTopic(topic);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value ="/topics/{id}")
	public List<Topic> deleteTopic(@PathVariable String id)
	{
		return topicService.deleteTopic(id);
	}
}
