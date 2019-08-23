package io.javabrains.springbootstarter.Topics;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;




import org.springframework.stereotype.Service;
@Service
public class TopicService {
	
private List<Topic> topics = new ArrayList<>(Arrays.asList
        (new Topic("ksjdlf",1,"sjdofsf"),
		new Topic("hsj",2,"ksjflj"),
		new Topic("hello",1,"hi")
		)) ;

public List<Topic> getTopics()
{
	return topics;
}

public Topic getTopic(String st)
{   if(st.equals("First"))
	return topics.get(0);
else if(st.equals("Second"))
	return topics.get(1);
else
	return topics.get(2);
}

public List<Topic> addTopic(Topic b)
{
	topics.add(b);
	return topics;
}
public List<Topic>  deleteTopic(String st)
{
	if(st.equals("first"))
		topics.remove(topics.get(0));
	else
		topics.remove(topics.get(1));
	return topics;
}





}
