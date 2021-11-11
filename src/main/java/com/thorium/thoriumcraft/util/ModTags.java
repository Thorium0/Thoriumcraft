package com.thorium.thoriumcraft.util;

import com.thorium.thoriumcraft.Thoriumcraft;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.Tags;

public class ModTags {

    public static class Blocks {

        public static final Tags.IOptionalNamedTag<Block> THORIUM_BLOCKS = createForgeTag("storage_blocks/thorium");

        private static Tags.IOptionalNamedTag<Block> createTag(String name) {
            return BlockTags.createOptional(new ResourceLocation(Thoriumcraft.MOD_ID, name));
        }

        private static Tags.IOptionalNamedTag<Block> createForgeTag(String name) {
            return BlockTags.createOptional(new ResourceLocation("forge", name));
        }
    }

    public static class Items {

        public static final Tags.IOptionalNamedTag<Item> THORIUM_INGOTS = createForgeTag("ingots/thorium");
        public static final Tags.IOptionalNamedTag<Item> THORIUM_NUGGETS = createForgeTag("nuggets/thorium");
        public static final Tags.IOptionalNamedTag<Item> THORIUM_BLOCKS = createForgeTag("storage_blocks/thorium");

        private static Tags.IOptionalNamedTag<Item> createTag(String name) {
            return ItemTags.createOptional(new ResourceLocation(Thoriumcraft.MOD_ID, name));
        }

        private static Tags.IOptionalNamedTag<Item> createForgeTag(String name) {
            return ItemTags.createOptional(new ResourceLocation("forge", name));
        }
    }
}
