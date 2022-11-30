package net.runelite.client.plugins.fungusLooter;

import net.runelite.client.config.Button;
import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.ConfigSection;
import net.runelite.client.config.Range;

@ConfigGroup("unethicalFungus")
public interface fungusLooterConfig extends Config
{

	@ConfigSection(
		keyName = "delayConfig",
		name = "Sleep Delay Configuration",
		description = "Configure how the bot handles sleep delays",
		position = 6
	)
	String delayConfig = "delayConfig";

	@Range(
		min = 0,
		max = 550
	)
	@ConfigItem(
		keyName = "sleepMin",
		name = "Sleep Min",
		description = "",
		position = 7,
		section = "delayConfig"
	)
	default int sleepMin()
	{
		return 60;
	}

	@Range(
		min = 0,
		max = 550
	)
	@ConfigItem(
		keyName = "sleepMax",
		name = "Sleep Max",
		description = "",
		position = 8,
		section = "delayConfig"
	)
	default int sleepMax()
	{
		return 350;
	}

	@Range(
		min = 0,
		max = 550
	)
	@ConfigItem(
		keyName = "sleepTarget",
		name = "Sleep Target",
		description = "",
		position = 9,
		section = "delayConfig"
	)
	default int sleepTarget()
	{
		return 100;
	}

	@Range(
		min = 0,
		max = 550
	)
	@ConfigItem(
		keyName = "sleepDeviation",
		name = "Sleep Deviation",
		description = "",
		position = 10,
		section = "delayConfig"
	)
	default int sleepDeviation()
	{
		return 10;
	}

	@ConfigItem(
		keyName = "sleepWeightedDistribution",
		name = "Sleep Weighted Distribution",
		description = "Shifts the random distribution towards the lower end at the target, otherwise it will be an even distribution",
		position = 11,
		section = "delayConfig"
	)
	default boolean sleepWeightedDistribution()
	{
		return false;
	}


	@ConfigSection(
		keyName = "delayTickConfig",
		name = "Game Tick Configuration",
		description = "Configure how the bot handles game tick delays, 1 game tick equates to roughly 600ms",
		position = 12
	)
	String delayTickConfig = "delayTickConfig";

	@Range(
		min = 1,
		max = 25
	)
	@ConfigItem(
		keyName = "tickDelayMin",
		name = "Game Tick Min",
		description = "",
		position = 13,
		section = "delayTickConfig"
	)
	default int tickDelayMin()
	{
		return 1;
	}

	@Range(
		min = 1,
		max = 30
	)
	@ConfigItem(
		keyName = "tickDelayMax",
		name = "Game Tick Max",
		description = "",
		position = 14,
		section = "delayTickConfig"
	)
	default int tickDelayMax()
	{
		return 3;
	}

	@Range(
		min = 1,
		max = 30
	)
	@ConfigItem(
		keyName = "tickDelayTarget",
		name = "Game Tick Target",
		description = "",
		position = 15,
		section = "delayTickConfig"
	)
	default int tickDelayTarget()
	{
		return 2;
	}

	@Range(
		min = 1,
		max = 30
	)
	@ConfigItem(
		keyName = "tickDelayDeviation",
		name = "Game Tick Deviation",
		description = "",
		position = 16,
		section = "delayTickConfig"
	)
	default int tickDelayDeviation()
	{
		return 1;
	}

	@ConfigItem(
		keyName = "tickDelayWeightedDistribution",
		name = "Game Tick Weighted Distribution",
		description = "Shifts the random distribution towards the lower end at the target, otherwise it will be an even distribution",
		position = 17,
		section = "delayTickConfig"
	)
	default boolean tickDelayWeightedDistribution()
	{
		return false;
	}

	@ConfigItem(
		keyName = "enableUI",
		name = "Enable UI",
		description = "Enable to turn on in game UI",
		position = 29
	)
	default boolean enableUI()
	{
		return true;
	}

	@ConfigItem(
		keyName = "hideDelays",
		name = "Hide delay UI",
		description = "Enable to turn off delay UI",
		position = 30
	)
	default boolean hideDelays()
	{
		return false;
	}

	@ConfigItem(
		keyName = "startButton",
		name = "Start/Stop",
		description = "Start or stop the bot",
		position = 100
	)
	default Button startButton()
	{
		return new Button();
	}
}
