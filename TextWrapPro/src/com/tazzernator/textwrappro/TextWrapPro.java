/*
* TextWrapPro by Tazzernator
* (Andrew Tajsic ~ atajsicDesigns ~ http://atajsic.com)
*
* THIS PLUGIN IS LICENSED UNDER THE WTFPL - (Do What The Fuck You Want To Public License)
*
* This program is free software. It comes without any warranty, to
* the extent permitted by applicable law. You can redistribute it
* and/or modify it under the terms of the Do What The Fuck You Want
* To Public License, Version 2, as published by Sam Hocevar. See
* http://sam.zoy.org/wtfpl/COPYING for more details.
*
* TERMS AND CONDITIONS FOR COPYING, DISTRIBUTION AND MODIFICATION
*
* 0. You just DO WHAT THE FUCK YOU WANT TO.
*
* */

package com.tazzernator.textwrappro;

//java imports
import java.util.logging.Logger;

//bukkit imports
import org.bukkit.event.Event;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;


public class TextWrapPro extends JavaPlugin {
private final TextWrapProListener playerListener = new TextWrapProListener(this);
public static final Logger log = Logger.getLogger("Minecraft");

public void onDisable(){
PluginDescriptionFile pdfFile = this.getDescription();
log.info("[" + pdfFile.getName() + "] (Tazzernator/Andrew Tajsic) - v" + pdfFile.getVersion() + " shutdown.");
}

public void onEnable(){
//Register our events
PluginManager pm = getServer().getPluginManager();
pm.registerEvent(Event.Type.PLAYER_CHAT, this.playerListener, Event.Priority.Highest, this);

//Say hello.
PluginDescriptionFile pdfFile = this.getDescription();
log.info("[" + pdfFile.getName() + "] (Tazzernator/Andrew Tajsic) - v" + pdfFile.getVersion() + " shutdown.");
}
}