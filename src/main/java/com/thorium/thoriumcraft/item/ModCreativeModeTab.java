package com.thorium.thoriumcraft.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab THORIUMCRAFT_TAB = new CreativeModeTab("thoriumcraftTab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.THORIUM_INGOT.get());
        }
    };
}
