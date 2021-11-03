package com.thorium.thoriumcraft.item;

import com.thorium.thoriumcraft.ThoriumCraft;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;


public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ThoriumCraft.MOD_ID);


    public static final RegistryObject<Item> THORIUM_INGOT = ITEMS.register("thorium_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.THORIUMMOD_TAB)));

    public static final RegistryObject<Item> THORIUM_NUGGET = ITEMS.register("thorium_nugget",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.THORIUMMOD_TAB)));

    public static final RegistryObject<Item> RAW_THORIUM = ITEMS.register("raw_thorium",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.THORIUMMOD_TAB)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
