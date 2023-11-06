package com.minatoorgtestcase.gae1partialsearch.logic;

import com.minatoorgtestcase.gae1partialsearch.model.ApplicationUser;

import com.eva.base.authentication.logic.AppUserPrivilegeCache;
import com.vs.eva.gaelibrary.authenticator.GoogleLoginAuthenticator;

public class LoginAuthenticator extends GoogleLoginAuthenticator<ApplicationUser> {

	public LoginAuthenticator(AppUserPrivilegeCache<ApplicationUser> holder,
			IApplicationUserBL<ApplicationUser> logic) {
		super(holder, logic);
	}
}
