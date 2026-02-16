package ${package};
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service

public class RatingPublisherServiceImpl implements RatingPublisherService {
	@Autowired
	${rateService} service;

	@Override
	public void getPublisher(String policyXML) {
		service.publishMessage(policyXML);
	}

}
