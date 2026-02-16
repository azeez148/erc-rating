package com.nest.erc.domain.alg.alg.inter;

import java.util.List;

import com.nest.erc.domain.alg.XmlConstruct;

public interface HasExecutable extends XmlConstruct {
	List<RatingExecutable> getExecutables();
}
