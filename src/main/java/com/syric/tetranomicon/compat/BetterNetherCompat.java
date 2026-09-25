package com.syric.tetranomicon.compat;

import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTab;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;

import static com.syric.tetranomicon.registry.TetranomiconItems.CINCINNASITE_DIAMOND;
import static com.syric.tetranomicon.registry.TetranomiconItems.FLAMING_RUBY;

public class BetterNetherCompat {

    public static void buildBetterNetherCreativeModeTabs(BuildCreativeModeTabContentsEvent event) {
        ResourceKey<CreativeModeTab> tab = event.getTabKey();
        if (tab.location().toString().equals("betternether:items_tab")) {
            event.accept(CINCINNASITE_DIAMOND.get());
            event.accept(FLAMING_RUBY.get());
        }
    }

}
