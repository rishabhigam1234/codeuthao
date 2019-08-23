package io.javabrains.springbootstarter.Topics;
import static org.easymock.EasyMock.createNiceMock;
import static org.easymock.EasyMock.expect;
import static org.easymock.EasyMock.replay;
import static org.junit.Assert.assertNotNull;
import org.easymock.EasyMock;
import org.junit.*;


public class controllertest {
	
private  TopicService topicservice= createNiceMock(TopicService.class);
private NewtopicController fixture;

@Before
public void init()
{
	if(fixture==null)
		fixture = new NewtopicController(topicservice);
	
}

	


@Test
public void  testgetTopic() throws Exception{
	String st= "";
	Topic topic = new Topic("hello",1,"");
	expect(topicservice.getTopic(st)).andReturn(topic);
	replay(topicservice);
	assertNotNull(fixture.getTopic(st));
}


	
}
