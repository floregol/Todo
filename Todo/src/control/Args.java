package control;

import java.util.ArrayList;
import java.util.List;

import com.beust.jcommander.Parameter;

public class Args {
	@Parameter(names={"--list", "-l"})
    public String list_name;

	public String getList_name() {
		return list_name;
	}

	public void setList_name(String list_name) {
		this.list_name = list_name;
	}

}