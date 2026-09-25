package com.syric.tetranomicon.registry;

import com.syric.tetranomicon.Tetranomicon;
import com.syric.tetranomicon.compat.BetterNetherCompat;
import com.syric.tetranomicon.compat.OresAboveDiamondsCompat;
import net.minecraft.world.item.*;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModList;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class TetranomiconItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Tetranomicon.MODID);
    public static final DeferredItem<Item> NETHERITE_OPAL = ITEMS.registerSimpleItem("netherite_opal");
    public static final DeferredItem<Item> CINCINNASITE_DIAMOND = ITEMS.registerSimpleItem("cincinnasite_diamond");
    public static final DeferredItem<Item> FLAMING_RUBY = ITEMS.registerSimpleItem("flaming_ruby");

    public TetranomiconItems() {}

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

    public static void buildCreativeModeTabs(BuildCreativeModeTabContentsEvent event) {
        if (ModList.get().isLoaded("oresabovediamonds")) {
            OresAboveDiamondsCompat.buildOresAboveDiamondsCreativeModeTabs(event);
        }
        if (ModList.get().isLoaded("betternether")) {
            BetterNetherCompat.buildBetterNetherCreativeModeTabs(event);
        }
    }
}
