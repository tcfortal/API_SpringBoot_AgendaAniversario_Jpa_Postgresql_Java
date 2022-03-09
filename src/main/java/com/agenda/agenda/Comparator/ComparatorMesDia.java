package com.agenda.agenda.Comparator;

import java.util.Comparator;

import com.agenda.agenda.models.Cadastro;

public class ComparatorMesDia implements Comparator<Cadastro>{

	@Override
	public int compare(Cadastro o1, Cadastro o2) {
		if(o1.getAno()>o2.getAno()) {
			return +1;
		}else if(o1.getAno()<o2.getAno()) {
			return -1;
		}
		else {
			if(o1.getMes()>o2.getMes()) {
				return +1;
			}else if(o1.getMes()<o2.getMes()) {
				return -1;
			}else {
				if(o1.getDia()>o2.getDia()) {
					return +1;
				}else{
					return -1;
				}	
			}
		}
	}
}
