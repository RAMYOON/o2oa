package com.x.base.core.project;

import com.x.base.core.project.annotation.Module;
import com.x.base.core.project.annotation.ModuleCategory;
import com.x.base.core.project.annotation.ModuleType;

@Module(type = ModuleType.ASSEMBLE, category = ModuleCategory.OFFICIAL, name = "组织管理接口服务")
public class x_organization_assemble_express extends AssembleA {

	public x_organization_assemble_express() {
		super();
		dependency.containerEntities.add("com.x.organization.core.entity.Group");
		dependency.containerEntities.add("com.x.organization.core.entity.Role");
		dependency.containerEntities.add("com.x.organization.core.entity.Person");
		dependency.containerEntities.add("com.x.organization.core.entity.PersonAttribute");
		dependency.containerEntities.add("com.x.organization.core.entity.Identity");
		dependency.containerEntities.add("com.x.organization.core.entity.Unit");
		dependency.containerEntities.add("com.x.organization.core.entity.UnitAttribute");
		dependency.containerEntities.add("com.x.organization.core.entity.UnitDuty");
		dependency.containerEntities.add("com.x.organization.core.entity.accredit.Trust");
		dependency.containerEntities.add("com.x.organization.core.entity.accredit.TrustLog");
		dependency.storeJars.add(x_organization_core_entity.class.getSimpleName());
	}
}
