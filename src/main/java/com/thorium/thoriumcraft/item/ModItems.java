package com.thorium.thoriumcraft.item;

import com.thorium.thoriumcraft.ThoriumCraft;
import com.thorium.thoriumcraft.item.custom.BlowtorchItem;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.*;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;


public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ThoriumCraft.MOD_ID);


    public static final RegistryObject<Item> THORIUM_INGOT = ITEMS.register("thorium_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.THORIUMMOD_TAB)));

    public static final RegistryObject<Item> THORIUM_NUGGET = ITEMS.register("thorium_nugget",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.THORIUMMOD_TAB)));

    public static final RegistryObject<Item> RAW_THORIUM = ITEMS.register("raw_thorium",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.THORIUMMOD_TAB)));

    public static final RegistryObject<Item> THORIUM_APPLE = ITEMS.register("thorium_apple",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.THORIUMMOD_TAB)
                    .food(new FoodProperties.Builder().nutrition(4).saturationMod(0.8f).build())));

    public static final RegistryObject<Item> THORIUM_BLOWTORCH = ITEMS.register("thorium_blowtorch",
            () -> new BlowtorchItem(new Item.Properties().tab(ModCreativeModeTab.THORIUMMOD_TAB).durability(512)));

    //public static final RegistryObject<Item> THORIUM_PICKAXE = ITEMS.register("thorium_pickaxe",
    //        () -> new PickaxeItem());


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
