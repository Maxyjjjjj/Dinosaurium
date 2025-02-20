package com.dinosaurium.configuration;

import net.neoforged.neoforge.common.ModConfigSpec;

public class CommonConfigConfiguration {
	public static final ModConfigSpec.Builder BUILDER = new ModConfigSpec.Builder();
	public static final ModConfigSpec SPEC;

	public static final ModConfigSpec.ConfigValue<Boolean> SPINOFAARUS;
	static {
		BUILDER.push("Mobs");
		SPINOFAARUS = BUILDER.comment("Enables Spinofaarus").define("Spinofaarus Outside April 1st", false);
		BUILDER.pop();

		SPEC = BUILDER.build();
	}

}
