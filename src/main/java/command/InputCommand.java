package command;

import servlet.ResponseContext;

public class InputCommand extends AbstractCommand{
	public ResponseContext execute(ResponseContext resc){
		
		resc.setTarget("input");
		return resc;
	}
}