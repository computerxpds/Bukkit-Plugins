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

import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerChatEvent;
import org.bukkit.event.player.PlayerListener;

/* Thoughts table:
* Find pixel length to the end of the line.
* Find if there are colours in the line. Preserve for the next line if found, and also note that they do not count towards the count.
*/

public class TextWrapProListener extends PlayerListener {

//define the plugin
private final TextWrapPro plugin;

public TextWrapProListener(TextWrapPro instance) {
this.plugin = instance;
}

public void onPlayerChat(PlayerChatEvent event){
//Let's find our player, and their message.
Player player = event.getPlayer();
String playerMessage = event.getMessage();

//to be done!!
}

}