package com.syric.tetranomicon.compat;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;

import static com.syric.tetranomicon.registry.TetranomiconItems.*;

public class OresAboveDiamondsCompat {

    public static void buildOresAboveDiamondsCreativeModeTabs(BuildCreativeModeTabContentsEvent event) {
        ResourceKey<CreativeModeTab> tab = event.getTabKey();
        if (tab.location().getNamespace().equals("oresabovediamonds")) {
            Item blackOpal = BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath("oresabovediamonds", "black_opal"));
            if (blackOpal != null) {
                event.accept(NETHERITE_OPAL.get());
            }
        }
    }

}
