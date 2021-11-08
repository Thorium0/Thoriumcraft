package com.thorium.thoriumcraft.item;

import com.thorium.thoriumcraft.Thoriumcraft;
import com.thorium.thoriumcraft.item.custom.BlowtorchItem;
import com.thorium.thoriumcraft.item.custom.ModPickaxeItem;
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
            DeferredRegister.create(ForgeRegistries.ITEMS, Thoriumcraft.MOD_ID);


    public static final RegistryObject<Item> THORIUM_INGOT = ITEMS.register("thorium_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.THORIUMCRAFT_TAB)));

    public static final RegistryObject<Item> THORIUM_NUGGET = ITEMS.register("thorium_nugget",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.THORIUMCRAFT_TAB)));

    public static final RegistryObject<Item> RAW_THORIUM = ITEMS.register("raw_thorium",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.THORIUMCRAFT_TAB)));

    public static final RegistryObject<Item> THORIUM_APPLE = ITEMS.register("thorium_apple",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.THORIUMCRAFT_TAB)
                    .food(new FoodProperties.Builder().nutrition(4).saturationMod(0.8f).build())));

    public static final RegistryObject<Item> THORIUM_BLOWTORCH = ITEMS.register("thorium_blowtorch",
            () -> new BlowtorchItem(new Item.Properties().tab(ModCreativeModeTab.THORIUMCRAFT_TAB).durability(512)));

    public static final RegistryObject<Item> THORIUM_PICKAXE = ITEMS.register("thorium_pickaxe",
            () -> new ModPickaxeItem(ModTier.THORIUM, 0, -3f, new Item.Properties().tab(ModCreativeModeTab.THORIUMCRAFT_TAB)));

    public static final RegistryObject<Item> THORIUM_AXE = ITEMS.register("thorium_axe",
            () -> new ModPickaxeItem(ModTier.THORIUM, 5, -2.5f, new Item.Properties().tab(ModCreativeModeTab.THORIUMCRAFT_TAB)));

    public static final RegistryObject<Item> THORIUM_SWORD = ITEMS.register("thorium_sword",
            () -> new ModPickaxeItem(ModTier.THORIUM, 2, 0f, new Item.Properties().tab(ModCreativeModeTab.THORIUMCRAFT_TAB)));

    public static final RegistryObject<Item> THORIUM_SHOVEL = ITEMS.register("thorium_shovel",
            () -> new ModPickaxeItem(ModTier.THORIUM, 0, 0f, new Item.Properties().tab(ModCreativeModeTab.THORIUMCRAFT_TAB)));

    public static final RegistryObject<Item> THORIUM_HOE = ITEMS.register("thorium_hoe",
            () -> new ModPickaxeItem(ModTier.THORIUM, -1, 1f, new Item.Properties().tab(ModCreativeModeTab.THORIUMCRAFT_TAB)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
