package com.x.base.core.project;

import com.x.base.core.project.annotation.Module;
import com.x.base.core.project.annotation.ModuleCategory;
import com.x.base.core.project.annotation.ModuleType;

@Module(type = ModuleType.ASSEMBLE, category = ModuleCategory.OFFICIAL, name = "门户")
public class x_portal_assemble_surface extends AssembleA {

	public x_portal_assemble_surface() {
		super();
		dependency.containerEntities.add("com.x.portal.core.entity.Portal");
		dependency.containerEntities.add("com.x.portal.core.entity.Widget");
		dependency.containerEntities.add("com.x.portal.core.entity.Page");
		dependency.containerEntities.add("com.x.portal.core.entity.Script");
		dependency.containerEntities.add("com.x.portal.core.entity.File");
		dependency.storeJars.add(x_organization_core_entity.class.getSimpleName());
		dependency.storeJars.add(x_organization_core_express.class.getSimpleName());
		dependency.storeJars.add(x_portal_core_entity.class.getSimpleName());
	}
}