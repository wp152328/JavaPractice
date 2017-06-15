package org.dimigo.abstractclass;

public class ActionManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
if(args == null || args.length == 0) return;
	System.out.println(args[0]);
	
	Action action = getAction(args[0]);
	action.execute();
	}
	
	//객체를 정적으로 생성(new InsertAction())
	private static Action getAction(String actionName) {
		Action action = null;
		if("insert".equals(actionName)) {
			action = new InsertAction();
		} else if("update".equals(actionName)) {
			action = new UpdateAction();
		} else if("delete".equals(actionName)) {
			action = new DeleteAction();
		}
		return action;
	}
}
