package com.nest.res.bop.al09012019.mq.publish;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@EnableBinding(BOPAL09012019Channel.class)
@Service
public class BOPAL09012019ServiceImpl implements BOPAL09012019Service{
	@Autowired
	private BOPAL09012019Channel channel;
	
	public void publishMessage(String policyXML) {
		channel.publishToBOPAL09012019().send(MessageBuilder.withPayload(policyXML).build());
	}
}
