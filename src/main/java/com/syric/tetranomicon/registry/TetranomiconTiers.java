package com.syric.tetranomicon.registry;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.SimpleTier;
import se.mickelus.tetra.TetraRegistries;
import se.mickelus.tetra.tools.HarvestTierRegistry;

import java.util.List;

public class TetranomiconTiers {

    public static void init() {
        TagKey<Block> eightTag = BlockTags.create(ResourceLocation.fromNamespaceAndPath("tetranomicon", "needs_tier_eight_tool"));
        Tier eightTier = HarvestTierRegistry.register(new SimpleTier(eightTag, 0, 0, 0, 0,
                () -> Ingredient.EMPTY), ResourceLocation.fromNamespaceAndPath("tetranomicon", "tier_eight"), List.of(TetraRegistries.forgeHammerTier), List.of());

        TagKey<Block> nineTag = BlockTags.create(ResourceLocation.fromNamespaceAndPath("tetranomicon", "needs_tier_nine_tool"));
        Tier nineTier = HarvestTierRegistry.register(new SimpleTier(nineTag, 0, 0, 0, 0,
                () -> Ingredient.EMPTY), ResourceLocation.fromNamespaceAndPath("tetranomicon", "tier_nine"), List.of(eightTier), List.of());

        TagKey<Block> tenTag = BlockTags.create(ResourceLocation.fromNamespaceAndPath("tetranomicon", "needs_tier_ten_tool"));
        Tier tenTier = HarvestTierRegistry.register(new SimpleTier(tenTag, 0, 0, 0, 0,
                () -> Ingredient.EMPTY), ResourceLocation.fromNamespaceAndPath("tetranomicon", "tier_ten"), List.of(nineTier), List.of());

        TagKey<Block> elevenTag = BlockTags.create(ResourceLocation.fromNamespaceAndPath("tetranomicon", "needs_tier_eleven_tool"));
        HarvestTierRegistry.register(new SimpleTier(elevenTag, 0, 0, 0, 0,
                () -> Ingredient.EMPTY), ResourceLocation.fromNamespaceAndPath("tetranomicon", "tier_eleven"), List.of(tenTier), List.of());
    }

}
