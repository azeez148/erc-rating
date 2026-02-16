package ${package};

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface BaseControllerBinding {
	String CONTROLLER_SUBSCRIBE_CHANNEL = "controllerSubscribeChannel";

    @Input(CONTROLLER_SUBSCRIBE_CHANNEL)
    SubscribableChannel channel();

}
