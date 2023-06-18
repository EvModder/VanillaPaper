package net.evmodder.vanillapaper;

import net.evmodder.EvLib.EvPlugin;

/**
*
* @author EvModder (evdoc at altcraft.net)
*/
public class VanillaPaper extends EvPlugin{
	@Override public void onEvEnable(){
		if(getConfig().getBoolean("fix-paper-rng-manip", true)) new PaperFix_EntityAddToWorldListener(this);
		if(getConfig().getBoolean("fix-paper-gravity-dupe", true)) new PaperFix_EntityChangeBlockListener(this);
	}
}