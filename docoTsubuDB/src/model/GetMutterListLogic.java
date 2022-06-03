package model;

import java.util.List;

import dao.MutterDAO;

public class GetMutterListLogic {
	public List<Mutter> execute(){
		System.out.println("gmll.exe通過");
		MutterDAO dao=new MutterDAO();
		List<Mutter> mutterList=dao.findAll();
		return mutterList;
	}

}
