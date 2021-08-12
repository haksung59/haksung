package aaa.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import aaa.dao.ChatDao;

@Service
public class ChatService {
	
	@Autowired
	ChatDao chatDao;
	
	public void addMessage(int roomId, String writer, String body) {
		chatDao.addMessage(roomId, writer, body);
	}

	public List getMessages() {
		// TODO Auto-generated method stub
		return chatDao.getMessages();
	}

	public List getMessagesFrom(int roomId, int from) {
		return chatDao.getMessagesFrom(roomId, from);
	}

	public void doClearAllMessages() {
		// TODO Auto-generated method stub
		chatDao.clearAllMessages();
	}
	
	
}
