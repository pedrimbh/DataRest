package com.estudos.DataRest.Model;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "noName" , types = {User.class})
public interface UserNoNameProjection {
	String getName();
	
}
