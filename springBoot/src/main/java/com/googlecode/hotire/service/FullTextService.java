package com.googlecode.hotire.service;

import com.googlecode.hotire.constants.MessageType;
import com.googlecode.hotire.model.BaseMessage;
import com.googlecode.hotire.utils.MessageFactory;
import com.googlecode.hotire.utils.MessageParser;
import org.springframework.stereotype.Service;

@Service
public class FullTextService {

	public BaseMessage parse(final String text) {
		final BaseMessage message = MessageFactory.createMessage(MessageType.RESPONSE);
		MessageParser.parseMessage(text, message);
		return message;
	}
}
