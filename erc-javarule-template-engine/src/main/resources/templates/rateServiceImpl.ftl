package ${package};

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@EnableBinding(${rateChannel}.class)
@Service
public class ${rateServiceImpl} implements ${rateService}{
	@Autowired
	private ${rateChannel} channel;
	
	public void publishMessage(String policyXML) {
		channel.publishTo${version}().send(MessageBuilder.withPayload(policyXML).build());
	}
}
