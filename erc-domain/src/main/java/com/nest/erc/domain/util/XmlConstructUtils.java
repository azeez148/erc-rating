package com.nest.erc.domain.util;

import com.nest.erc.domain.alg.XmlConstruct;
import com.nest.erc.domain.alg.impl.Pch;
import com.nest.erc.domain.alg.impl.Reference;
import com.nest.erc.domain.alg.impl.executable.Assign;
import com.nest.erc.domain.alg.impl.executable.Loop;

public class XmlConstructUtils {
	public Reference findParentReference(XmlConstruct element) {
		if (element.getParent() instanceof Reference) {
			return (Reference) element.getParent();
		} else {
			return findParentReference(element.getParent());
		}
	}

	public Loop findParentLoop(XmlConstruct element) {
		if (element.getParent() instanceof Loop) {
			return (Loop) element.getParent();
		} else if (element.getParent() instanceof Pch) {
			return null;
		} else {
			return findParentLoop(element.getParent());
		}
	}
	
	public Pch findParentPch(XmlConstruct element) {
		if (element.getParent() instanceof Pch) {
			return (Pch) element.getParent();
		} else {
			return findParentPch(element.getParent());
		}
	}
	public Assign findParentAssign(XmlConstruct element) {
		if(element==null) {
			return null;
		}
		else if (element.getParent() instanceof Assign) {
			return (Assign) element.getParent();
		} else {
			return findParentAssign(element.getParent());
		}
	}
}
