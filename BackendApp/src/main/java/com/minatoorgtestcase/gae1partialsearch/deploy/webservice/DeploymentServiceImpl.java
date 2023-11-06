package com.minatoorgtestcase.gae1partialsearch.deploy.webservice;

import javax.ws.rs.Path;

import com.minatoorgtestcase.gae1partialsearch.deploy.logic.DeploymentBLImpl;
import com.minatoorgtestcase.gae1partialsearch.base.deploy.webservice.DeploymentServiceBaseImpl;

@Path("deploy")
public class DeploymentServiceImpl extends DeploymentServiceBaseImpl<DeploymentBLImpl> {

	public DeploymentServiceImpl() {
		super(new DeploymentBLImpl());
	}
	
}
