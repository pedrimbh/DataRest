package com.estudos.DataRest.Repository;

import java.util.logging.Logger;

import org.springframework.data.rest.core.annotation.HandleBeforeCreate;
import org.springframework.data.rest.core.annotation.RepositoryEventHandler;

import com.estudos.DataRest.Model.User;

@RepositoryEventHandler(User.class)
public interface UserEventHandler {
 Logger logger = Logger.getLogger("UserEventHandle Logger ->");
	
	
	@HandleBeforeCreate
	public static void handleSave(User user) {
		logger.info("Handler Before Save.....");
	}
}
