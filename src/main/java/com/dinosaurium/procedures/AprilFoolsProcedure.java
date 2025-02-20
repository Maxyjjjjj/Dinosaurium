package com.dinosaurium.procedures;

import java.util.Calendar;

public class AprilFoolsProcedure {
	public static boolean execute() {
		return Calendar.getInstance().get(Calendar.MONTH) == 4 && Calendar.getInstance().get(Calendar.DAY_OF_MONTH) == 1;
	}
}
