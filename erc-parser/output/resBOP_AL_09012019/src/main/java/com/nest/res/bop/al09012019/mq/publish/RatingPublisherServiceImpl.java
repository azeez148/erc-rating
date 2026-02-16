package com.nest.res.bop.al09012019.mq.publish;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service

public class RatingPublisherServiceImpl implements RatingPublisherService {
	@Autowired
	BOPAL09012019Service service;

	@Override
	public void getPublisher(String policyXML) {
		service.publishMessage(policyXML);
	}

}
