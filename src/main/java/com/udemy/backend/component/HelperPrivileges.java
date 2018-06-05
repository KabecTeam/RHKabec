package com.udemy.backend.component;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.udemy.backend.entity.UserRole;
import com.udemy.backend.model.HelperPrivilegeModel;
import com.udemy.backend.model.HelperPrivilegeNameSubItem;


//esta clase nos ayuda a generar los algoritmos que nos apoyaran para poder determinar los privilegios que tiene 
//cada usuario y mostrarlos en el frontend

public class HelperPrivileges {

	
	//este metodo nos apoya par una vez pasados los privilegios de la base por el usuario logeado
	//hace unicos los nombres de los menus deslizables (sin repetirse) 
	public List<String> discartMenuName(List<UserRole> privilegesComplex) {
		List<String> privileges = new ArrayList<String>();
		for (UserRole x : privilegesComplex)
			privileges.add(x.getNameMenuPrivilege());
		HashSet hs = new HashSet();
		hs.addAll(privileges);
		privileges.clear();
		privileges.addAll(hs);
		return privileges;
	}

	// este metodo nos construye  la lista que pasaremos al frontEnd 
	public List<HelperPrivilegeModel> returnPrivileges(List<UserRole> privilegesComplex) {
		List<HelperPrivilegeModel> helperPrivilegeMode = new ArrayList<HelperPrivilegeModel>();
		for (String x : discartMenuName(privilegesComplex)) {
			List<HelperPrivilegeNameSubItem> privilegeName = new ArrayList<HelperPrivilegeNameSubItem>();
			for (UserRole uR : privilegesComplex) {
				if (x.equals(uR.getNameMenuPrivilege()))
					privilegeName.add(new HelperPrivilegeNameSubItem(uR.getPrivilege(), uR.getNameprivilege()));
			}
			helperPrivilegeMode.add(new HelperPrivilegeModel(x, privilegeName));
		}
		
		return helperPrivilegeMode;
	}
}
