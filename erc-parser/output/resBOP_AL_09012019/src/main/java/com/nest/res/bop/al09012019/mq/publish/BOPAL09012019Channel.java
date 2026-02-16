package com.nest.res.bop.al09012019.mq.publish;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface  BOPAL09012019Channel {
	@Output("bopal09012019Channel")
	MessageChannel publishToBOPAL09012019();
}
