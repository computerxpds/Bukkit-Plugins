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

/* Hash map example...
 * 
 * As of today (2nd of June 2010) I havn't tested the use of the excape characters in "\"" and "\\". 
 */
import java.util.HashMap;

public class HashMapExample{
	public static void main(String[] args) { 
		HashMap<String, Integer> pixelWidth = new HashMap<String, Integer>();
		
		pixelWidth.put ("☺", new Integer(9));
		pixelWidth.put ("☻", new Integer(9));
		pixelWidth.put ("♥", new Integer(8));
		pixelWidth.put ("♦", new Integer(8));
		pixelWidth.put ("♣", new Integer(8));
		pixelWidth.put ("♠", new Integer(8));
		pixelWidth.put ("•", new Integer(5));
		pixelWidth.put ("◘", new Integer(9));
		pixelWidth.put ("○", new Integer(7));
		pixelWidth.put ("◙", new Integer(9));
		pixelWidth.put ("♂", new Integer(9));
		pixelWidth.put ("♀", new Integer(7));
		pixelWidth.put ("♪", new Integer(9));
		pixelWidth.put ("♫", new Integer(9));
		pixelWidth.put ("☼", new Integer(9));
		pixelWidth.put ("►", new Integer(8));
		pixelWidth.put ("◄", new Integer(8));
		pixelWidth.put ("↕", new Integer(7));
		pixelWidth.put ("‼", new Integer(7));
		pixelWidth.put ("¶", new Integer(9));
		pixelWidth.put ("§", new Integer(7));
		pixelWidth.put ("▬", new Integer(7));
		pixelWidth.put ("↨", new Integer(9));
		pixelWidth.put ("↑", new Integer(7));
		pixelWidth.put ("↓", new Integer(7));
		pixelWidth.put ("→", new Integer(8));
		pixelWidth.put ("←", new Integer(8));
		pixelWidth.put ("∟", new Integer(8));
		pixelWidth.put ("↔", new Integer(9));
		pixelWidth.put ("▲", new Integer(9));
		pixelWidth.put ("▼", new Integer(9));
		pixelWidth.put (" ", new Integer(5));
		pixelWidth.put ("!", new Integer(2));
		pixelWidth.put ("\"", new Integer(5));
		pixelWidth.put ("#", new Integer(6));
		pixelWidth.put ("$", new Integer(6));
		pixelWidth.put ("%", new Integer(6));
		pixelWidth.put ("&", new Integer(6));
		pixelWidth.put ("'", new Integer(3));
		pixelWidth.put ("(", new Integer(5));
		pixelWidth.put (")", new Integer(5));
		pixelWidth.put ("*", new Integer(5));
		pixelWidth.put ("+", new Integer(6));
		pixelWidth.put (",", new Integer(2));
		pixelWidth.put ("-", new Integer(6));
		pixelWidth.put (".", new Integer(2));
		pixelWidth.put ("/", new Integer(6));
		pixelWidth.put ("0", new Integer(6));
		pixelWidth.put ("1", new Integer(6));
		pixelWidth.put ("2", new Integer(6));
		pixelWidth.put ("3", new Integer(6));
		pixelWidth.put ("4", new Integer(6));
		pixelWidth.put ("5", new Integer(6));
		pixelWidth.put ("6", new Integer(6));
		pixelWidth.put ("7", new Integer(6));
		pixelWidth.put ("8", new Integer(6));
		pixelWidth.put ("9", new Integer(6));
		pixelWidth.put (":", new Integer(2));
		pixelWidth.put (";", new Integer(2));
		pixelWidth.put ("<", new Integer(5));
		pixelWidth.put ("=", new Integer(6));
		pixelWidth.put (">", new Integer(5));
		pixelWidth.put ("?", new Integer(6));
		pixelWidth.put ("@", new Integer(7));
		pixelWidth.put ("A", new Integer(6));
		pixelWidth.put ("B", new Integer(6));
		pixelWidth.put ("C", new Integer(6));
		pixelWidth.put ("D", new Integer(6));
		pixelWidth.put ("E", new Integer(6));
		pixelWidth.put ("F", new Integer(6));
		pixelWidth.put ("G", new Integer(6));
		pixelWidth.put ("H", new Integer(6));
		pixelWidth.put ("I", new Integer(4));
		pixelWidth.put ("J", new Integer(6));
		pixelWidth.put ("K", new Integer(6));
		pixelWidth.put ("L", new Integer(6));
		pixelWidth.put ("M", new Integer(6));
		pixelWidth.put ("N", new Integer(6));
		pixelWidth.put ("O", new Integer(6));
		pixelWidth.put ("P", new Integer(6));
		pixelWidth.put ("Q", new Integer(6));
		pixelWidth.put ("R", new Integer(6));
		pixelWidth.put ("S", new Integer(6));
		pixelWidth.put ("T", new Integer(6));
		pixelWidth.put ("U", new Integer(6));
		pixelWidth.put ("V", new Integer(6));
		pixelWidth.put ("W", new Integer(6));
		pixelWidth.put ("X", new Integer(6));
		pixelWidth.put ("Y", new Integer(6));
		pixelWidth.put ("Z", new Integer(6));
		pixelWidth.put ("[", new Integer(4));
		pixelWidth.put ("\\", new Integer(6));
		pixelWidth.put ("]", new Integer(4));
		pixelWidth.put ("^", new Integer(6));
		pixelWidth.put ("_", new Integer(6));
		pixelWidth.put ("`", new Integer(3));
		pixelWidth.put ("a", new Integer(6));
		pixelWidth.put ("b", new Integer(6));
		pixelWidth.put ("c", new Integer(6));
		pixelWidth.put ("d", new Integer(6));
		pixelWidth.put ("e", new Integer(6));
		pixelWidth.put ("f", new Integer(5));
		pixelWidth.put ("g", new Integer(6));
		pixelWidth.put ("h", new Integer(6));
		pixelWidth.put ("i", new Integer(2));
		pixelWidth.put ("j", new Integer(6));
		pixelWidth.put ("k", new Integer(5));
		pixelWidth.put ("l", new Integer(3));
		pixelWidth.put ("m", new Integer(6));
		pixelWidth.put ("n", new Integer(6));
		pixelWidth.put ("o", new Integer(6));
		pixelWidth.put ("p", new Integer(6));
		pixelWidth.put ("q", new Integer(6));
		pixelWidth.put ("r", new Integer(6));
		pixelWidth.put ("s", new Integer(6));
		pixelWidth.put ("t", new Integer(4));
		pixelWidth.put ("u", new Integer(6));
		pixelWidth.put ("v", new Integer(6));
		pixelWidth.put ("w", new Integer(6));
		pixelWidth.put ("x", new Integer(6));
		pixelWidth.put ("y", new Integer(6));
		pixelWidth.put ("z", new Integer(6));
		pixelWidth.put ("{", new Integer(5));
		pixelWidth.put ("|", new Integer(2));
		pixelWidth.put ("}", new Integer(5));
		pixelWidth.put ("~", new Integer(7));
		pixelWidth.put ("⌂", new Integer(6));
		pixelWidth.put ("Ç", new Integer(6));
		pixelWidth.put ("ü", new Integer(6));
		pixelWidth.put ("é", new Integer(6));
		pixelWidth.put ("â", new Integer(6));
		pixelWidth.put ("ä", new Integer(6));
		pixelWidth.put ("à", new Integer(6));
		pixelWidth.put ("å", new Integer(6));
		pixelWidth.put ("ç", new Integer(6));
		pixelWidth.put ("ê", new Integer(6));
		pixelWidth.put ("ë", new Integer(6));
		pixelWidth.put ("è", new Integer(6));
		pixelWidth.put ("ï", new Integer(4));
		pixelWidth.put ("î", new Integer(6));
		pixelWidth.put ("ì", new Integer(3));
		pixelWidth.put ("Ä", new Integer(6));
		pixelWidth.put ("Å", new Integer(6));
		pixelWidth.put ("É", new Integer(6));
		pixelWidth.put ("æ", new Integer(6));
		pixelWidth.put ("Æ", new Integer(6));
		pixelWidth.put ("ô", new Integer(6));
		pixelWidth.put ("ö", new Integer(6));
		pixelWidth.put ("ò", new Integer(6));
		pixelWidth.put ("û", new Integer(6));
		pixelWidth.put ("ù", new Integer(6));
		pixelWidth.put ("ÿ", new Integer(6));
		pixelWidth.put ("Ö", new Integer(6));
		pixelWidth.put ("Ü", new Integer(6));
		pixelWidth.put ("¢", new Integer(6));
		pixelWidth.put ("£", new Integer(6));
		pixelWidth.put ("¥", new Integer(6));
		pixelWidth.put ("₧", new Integer(4));
		pixelWidth.put ("ƒ", new Integer(6));
		pixelWidth.put ("á", new Integer(6));
		pixelWidth.put ("í", new Integer(3));
		pixelWidth.put ("ó", new Integer(6));
		pixelWidth.put ("ú", new Integer(6));
		pixelWidth.put ("ñ", new Integer(6));
		pixelWidth.put ("Ñ", new Integer(6));
		pixelWidth.put ("ª", new Integer(6));
		pixelWidth.put ("º", new Integer(6));
		pixelWidth.put ("¿", new Integer(6));
		pixelWidth.put ("⌐", new Integer(7));
		pixelWidth.put ("¬", new Integer(6));
		pixelWidth.put ("½", new Integer(6));
		pixelWidth.put ("¼", new Integer(6));
		pixelWidth.put ("¡", new Integer(2));
		pixelWidth.put ("«", new Integer(6));
		pixelWidth.put ("»", new Integer(6));
		pixelWidth.put ("░", new Integer(9));
		pixelWidth.put ("▒", new Integer(9));
		pixelWidth.put ("▓", new Integer(9));
		pixelWidth.put ("│", new Integer(3));
		pixelWidth.put ("┤", new Integer(6));
		pixelWidth.put ("╡", new Integer(6));
		pixelWidth.put ("╢", new Integer(8));
		pixelWidth.put ("╖", new Integer(8));
		pixelWidth.put ("╕", new Integer(6));
		pixelWidth.put ("╣", new Integer(8));
		pixelWidth.put ("║", new Integer(6));
		pixelWidth.put ("╗", new Integer(8));
		pixelWidth.put ("╝", new Integer(8));
		pixelWidth.put ("╜", new Integer(9));
		pixelWidth.put ("╛", new Integer(9));
		pixelWidth.put ("┐", new Integer(9));
		pixelWidth.put ("└", new Integer(6));
		pixelWidth.put ("┴", new Integer(9));
		pixelWidth.put ("┬", new Integer(9));
		pixelWidth.put ("├", new Integer(6));
		pixelWidth.put ("─", new Integer(9));
		pixelWidth.put ("┼", new Integer(9));
		pixelWidth.put ("╞", new Integer(5));
		pixelWidth.put ("╟", new Integer(7));
		pixelWidth.put ("╚", new Integer(7));
		pixelWidth.put ("╔", new Integer(7));
		pixelWidth.put ("╩", new Integer(9));
		pixelWidth.put ("╦", new Integer(9));
		pixelWidth.put ("╠", new Integer(7));
		pixelWidth.put ("═", new Integer(9));
		pixelWidth.put ("╬", new Integer(9));
		pixelWidth.put ("╧", new Integer(9));
		pixelWidth.put ("╨", new Integer(9));
		pixelWidth.put ("╤", new Integer(9));
		pixelWidth.put ("╥", new Integer(9));
		pixelWidth.put ("╙", new Integer(7));
		pixelWidth.put ("╘", new Integer(6));
		pixelWidth.put ("╒", new Integer(6));
		pixelWidth.put ("╓", new Integer(7));
		pixelWidth.put ("╫", new Integer(9));
		pixelWidth.put ("╪", new Integer(9));
		pixelWidth.put ("┘", new Integer(7));
		pixelWidth.put ("┌", new Integer(6));
		pixelWidth.put ("█", new Integer(9));
		pixelWidth.put ("▄", new Integer(9));
		pixelWidth.put ("▌", new Integer(5));
		pixelWidth.put ("▐", new Integer(5));
		pixelWidth.put ("▀", new Integer(9));
		pixelWidth.put ("α", new Integer(8));
		pixelWidth.put ("ß", new Integer(7));
		pixelWidth.put ("Γ", new Integer(7));
		pixelWidth.put ("π", new Integer(8));
		pixelWidth.put ("Σ", new Integer(7));
		pixelWidth.put ("σ", new Integer(8));
		pixelWidth.put ("µ", new Integer(7));
		pixelWidth.put ("τ", new Integer(8));
		pixelWidth.put ("Φ", new Integer(7));
		pixelWidth.put ("Θ", new Integer(8));
		pixelWidth.put ("Ω", new Integer(8));
		pixelWidth.put ("δ", new Integer(7));
		pixelWidth.put ("∞", new Integer(9));
		pixelWidth.put ("φ", new Integer(9));
		pixelWidth.put ("ε", new Integer(6));
		pixelWidth.put ("∩", new Integer(7));
		pixelWidth.put ("≡", new Integer(7));
		pixelWidth.put ("±", new Integer(7));
		pixelWidth.put ("≥", new Integer(7));
		pixelWidth.put ("≤", new Integer(7));
		pixelWidth.put ("⌠", new Integer(6));
		pixelWidth.put ("⌡", new Integer(6));
		pixelWidth.put ("÷", new Integer(7));
		pixelWidth.put ("≈", new Integer(8));
		pixelWidth.put ("°", new Integer(6));
		pixelWidth.put ("∙", new Integer(3));
		pixelWidth.put ("·", new Integer(3));
		pixelWidth.put ("√", new Integer(9));
		pixelWidth.put ("ⁿ", new Integer(6));
		pixelWidth.put ("²", new Integer(5));
		pixelWidth.put ("■", new Integer(5));
		pixelWidth.put (" ", new Integer(5));

	}
}