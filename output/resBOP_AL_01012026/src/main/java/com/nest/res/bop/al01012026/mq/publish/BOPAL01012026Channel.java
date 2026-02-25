package com.nest.res.bop.al01012026.mq.publish;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface  BOPAL01012026Channel {
	@Output("bopal01012026Channel")
	MessageChannel publishToBOPAL01012026();
}
