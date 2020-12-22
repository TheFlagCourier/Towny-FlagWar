package io.github.townyadvanced.flagwar.util;

import com.palmergames.util.TimeTools;
import de.leonhard.storage.Toml;
import org.bukkit.Material;
import org.bukkit.Tag;

public class Configuration {

  private static final Toml conf = new Toml("config.toml","");

	protected static final Material[] woolColors = new Material[] {
			Material.LIME_WOOL, Material.GREEN_WOOL, Material.BLUE_WOOL, Material.CYAN_WOOL,
			Material.LIGHT_BLUE_WOOL, Material.GRAY_WOOL, Material.WHITE_WOOL,
			Material.PINK_WOOL, Material.ORANGE_WOOL, Material.RED_WOOL };

	private static Material flagBaseMaterial = null;
	private static Material flagLightMaterial = null;
	private static Material beaconWireFrameMaterial = null;
  public static final String CONFIG_VERSION = "0.1";

  private Configuration() {
		// Utility class, mask implicit public constructor.
	}

  /**
   * Builds the initial configuration file, and populates it.
   * If a file already exists, but a key is missing, that key will be added to the file.
   */
  public static void generateInitialConfig() {
	  // Builds the initial configuration, or updates configuration files
    // TODO: Use builder to write to file ONCE. Currently, every value is a new write.
    // TODO: Also, check if there's a way to add comments programaticaly.
    conf.setDefault("config-version", CONFIG_VERSION);

	  conf.setDefault("beacon.draw", true);
	  conf.setDefault("beacon.radius", 3);
    conf.setDefault("beacon.height-above-flag.min", 3);
    conf.setDefault("beacon.height-above-flag.max", 64);

    conf.setDefault("rule.allow-attacks", true);
    conf.setDefault("rule.flag-waiting-time", 50000L);
    conf.setDefault("rule.attack.borders-only", true);
    conf.setDefault("rule.attack.take-ownership", true);
    conf.setDefault("rule.min-players-online.town", 4);
    conf.setDefault("rule.min-players-online.nation", 3);
    conf.setDefault("rule.max-active-flags-per-player", 1);

    conf.setDefault("economy.won.town-block", 10.00);
    conf.setDefault("economy.won.home-block", 100.00);
    conf.setDefault("economy.flag.attack", 10.00);
    conf.setDefault("economy.flag.defend", 10.00);
  }

  /**
   * Not currently useful, but used to remove any legacy keys from previous configuration versions.
   */
  public static void removeOldKeys() {
    if (conf.contains("example.key"))
      conf.remove("example.key");
  }

  public static void updateConfVersion() {
	  conf.set("config-version", CONFIG_VERSION);
  }

	public static boolean isAffectedMaterial(Material material) {

		return Tag.WOOL.isTagged(material) ||
      material == getFlagBaseMaterial() ||
      material == getFlagLightMaterial() ||
      material == getBeaconWireFrameMaterial();
	}

	public static Material[] getWoolColors() {

		return woolColors;
	}

	public static boolean isAllowingAttacks() {
		// Default to false for testing purposes.
		return conf.getBoolean("rule.allow-attacks");
		//return TownySettings.getBoolean(ConfigNodes.WAR_ENEMY_ALLOW_ATTACKS);
	}

	public static long getFlagWaitingTime() {
		// Default to 50000L for testing
		// Note: Port TimeTools? Keep using it? Or use a different (agnostic) library?
		return TimeTools.convertToTicks(conf.getLong("rule.flag-waiting-time"));
		//return TimeTools.convertToTicks(TownySettings.getSeconds(ConfigNodes.WAR_ENEMY_FLAG_WAITING_TIME));
	}

	public static boolean isDrawingBeacon() {

		return conf.getOrDefault("beacon.draw", true);
		//return TownySettings.getBoolean(ConfigNodes.WAR_ENEMY_BEACON_DRAW);
	}

	public static int getMaxActiveFlagsPerPerson() {

		return conf.getOrDefault("rule.max-active-flags-per-player", 1);
		//return TownySettings.getInt(ConfigNodes.WAR_ENEMY_MAX_ACTIVE_FLAGS_PER_PLAYER);
	}

	public static Material getFlagBaseMaterial() {

		return flagBaseMaterial;
	}

	public static Material getFlagLightMaterial() {

		return flagLightMaterial;
	}

	public static Material getBeaconWireFrameMaterial() {

		return beaconWireFrameMaterial;
	}

	public static int getBeaconRadius() {

		return conf.getOrDefault("beacon.radius", 3);
		//return TownySettings.getInt(ConfigNodes.WAR_ENEMY_BEACON_RADIUS);
	}

	public static int getBeaconSize() {

		return getBeaconRadius() * 2 - 1;
	}

	public static int getBeaconMinHeightAboveFlag() {

		return conf.getOrDefault("beacon.height-above-flag.min", 3);
		//return TownySettings.getInt(ConfigNodes.WAR_ENEMY_BEACON_HEIGHT_ABOVE_FLAG_MIN);
	}

	public static int getBeaconMaxHeightAboveFlag() {

		return conf.getOrDefault("beacon.height-above-flag.max", 64);
		//return TownySettings.getInt(ConfigNodes.WAR_ENEMY_BEACON_HEIGHT_ABOVE_FLAG_MAX);
	}

	//TODO IMPORT THIS CALL!!!
	public static void setFlagBaseMaterial(Material flagBaseMaterial) {

		Configuration.flagBaseMaterial = flagBaseMaterial;
	}

	//TODO IMPORT THIS CALL!!!
	public static void setFlagLightMaterial(Material flagLightMaterial) {

		Configuration.flagLightMaterial = flagLightMaterial;
	}

	//TODO IMPORT THIS CALL!!!
	public static void setBeaconWireFrameMaterial(Material beaconWireFrameMaterial) {

		Configuration.beaconWireFrameMaterial = beaconWireFrameMaterial;
	}

	public static int getMinPlayersOnlineInTownForWar() {

		return conf.getOrDefault("rule.min-players-online.town", 4);
		//return TownySettings.getInt(ConfigNodes.WAR_ENEMY_MIN_PLAYERS_ONLINE_IN_TOWN);
	}

	public static int getMinPlayersOnlineInNationForWar() {

		return conf.getOrDefault("rule.min-players-online.nation", 3);
		//return TownySettings.getInt(ConfigNodes.WAR_ENEMY_MIN_PLAYERS_ONLINE_IN_NATION);
	}

	public static double getWonTownblockReward() {

		return conf.getOrDefault("economy.won.town-block", 10.00);
		//return TownySettings.getDouble(ConfigNodes.WAR_ECONOMY_TOWNBLOCK_WON);
	}

	public static double getWonHomeblockReward() {

		return conf.getOrDefault("economy.won.home-block", 100.00);
		//return TownySettings.getDouble(ConfigNodes.WAR_ECONOMY_HOMEBLOCK_WON);
	}

	public static double getCostToPlaceWarFlag() {

		return conf.getOrDefault("economy.flag.attack", 10.00);
		//return TownySettings.getDouble(ConfigNodes.WAR_ECONOMY_ENEMY_PLACE_FLAG);
	}

	public static double getDefendedAttackReward() {

		return conf.getOrDefault("economy.flag.defend", 10.00);
		//return TownySettings.getDouble(ConfigNodes.WAR_ECONOMY_ENEMY_DEFENDED_ATTACK);
	}

    public static boolean isAttackingBordersOnly() {

        return conf.getOrDefault("rule.attack.borders-only", true);
		//return TownySettings.getBoolean(ConfigNodes.WAR_ENEMY_ONLY_ATTACK_BORDER);
    }

	public static boolean isFlaggedTownblockTransfered() {

		return conf.getOrDefault("rule.attack.take-ownership", true);
		//return TownySettings.getBoolean(ConfigNodes.WAR_ENEMY_FLAG_TAKES_OWNERSHIP_OF_TOWNBLOCKS);
	}
}
