package com.nest.res.bop.al01012026.mq.publish;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service

public class RatingPublisherServiceImpl implements RatingPublisherService {
	@Autowired
	BOPAL01012026Service service;

	@Override
	public void getPublisher(String policyXML) {
		service.publishMessage(policyXML);
	}

}
