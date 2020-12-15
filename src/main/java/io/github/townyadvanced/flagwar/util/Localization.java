package io.github.townyadvanced.flagwar.util;

import de.leonhard.storage.Toml;

/**
 * Work-in-Progress class to provide localization.
 * @author FlagCourier
 *
 * Note: May simply become an interface with a 3rd-party library. The point is to get the translation
 * keys without hooking into Towny.
 */
public class Localization {
  //Lets GO!!
  private final Toml lang;

  public Localization(String langChoice) {
    this.lang = new Toml(langChoice, "languages");
  }

  public void setDefaults(){
    lang.setDefault("plugin_name", "Flag War");
    lang.setDefault("language", lang.getName());
    lang.setDefault("warning","");
    lang.setDefault("warning.test", "Test");
    lang.setDefault("magic.phrase","Abra, Kadabara, Alakazam!");
  }
}
