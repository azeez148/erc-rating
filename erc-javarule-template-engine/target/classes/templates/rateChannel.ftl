package ${package};

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface  ${rateChannelName} {
	@Output("${outputChannelName}")
	MessageChannel ${publishMethodName}();
}
