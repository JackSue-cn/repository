<#assign className = table.classNameBo>
<#assign classNameLower = className?uncap_first>
<#include "/macro.include"/>
/*
 * Copyright (c) 2013-2014, thinkjoy Inc. All Rights Reserved.
 *
 * Project Name: ${module}
 * $Id:  ${className}Service.java ${now?string('yyyy-MM-dd HH:mm:ss')} $
 */

package ${basepackage}.service;

public Interface ${className}Service extends BaseService, PageService{
}
