package com.minatoorgtestcase.gae1partialsearch.model;

import com.minatoorgtestcase.gae1partialsearch.base.model.ApplicationUserBase;
import com.eva.base.annotations.Table;

@Table(name="ApplicationUser", keys={"sid"})
public class ApplicationUser extends ApplicationUserBase {

}