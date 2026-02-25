package com.nest.res.bop.al01012026.mq.publish;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@EnableBinding(BOPAL01012026Channel.class)
@Service
public class BOPAL01012026ServiceImpl implements BOPAL01012026Service{
	@Autowired
	private BOPAL01012026Channel channel;
	
	public void publishMessage(String policyXML) {
		channel.publishToBOPAL01012026().send(MessageBuilder.withPayload(policyXML).build());
	}
}
