package com.cofhelper;

import java.awt.Color;
import net.runelite.client.config.Alpha;
import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.ConfigSection;

@ConfigGroup("cofhelper")
public interface CoFHelperConfig extends Config
{
	@ConfigSection(
		name = "Default colours",
		description = "Default replacement colour values",
		position = 0
	)
	String defaultColourSection = "defaultColourSection";

	@Alpha
	@ConfigItem(
		keyName = "defaultColourMagic",
		name = "Magic spells",
		description = "Default replacement colour for requiring magic spells",
		position = 1,
		section = defaultColourSection
	)
	default Color defaultColourMagic()
	{
		return Color.BLUE;
	}

	@Alpha
	@ConfigItem(
		keyName = "defaultColourRange",
		name = "Heavy range",
		description = "Default replacement colour for requiring heavy ranged",
		position = 2,
		section = defaultColourSection
	)
	default Color defaultColourRange()
	{
		return Color.GREEN;
	}

	@Alpha
	@ConfigItem(
		keyName = "defaultColourMelee",
		name = "2H melee",
		description = "Default replacement colour for requiring two-handed melee",
		position = 3,
		section = defaultColourSection
	)
	default Color defaultColourMelee()
	{
		return Color.RED;
	}

	@Alpha
	@ConfigItem(
		keyName = "defaultColourSpecial",
		name = "Special attacks",
		description = "Default replacement colour for requiring special attacks",
		position = 4,
		section = defaultColourSection
	)
	default Color defaultColourSpecial()
	{
		return Color.YELLOW;
	}

	@Alpha
	@ConfigItem(
		keyName = "defaultColourBind",
		name = "Binding spells",
		description = "Default replacement colour for requiring binding spells",
		position = 5,
		section = defaultColourSection
	)
	default Color defaultColourBind()
	{
		return Color.WHITE;
	}
}
