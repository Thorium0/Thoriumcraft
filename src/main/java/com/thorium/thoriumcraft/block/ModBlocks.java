package com.thorium.thoriumcraft.block;

import com.thorium.thoriumcraft.Thoriumcraft;
import com.thorium.thoriumcraft.block.custom.ThoriumTile;
import com.thorium.thoriumcraft.item.ModCreativeModeTab;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import com.thorium.thoriumcraft.item.ModItems;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, Thoriumcraft.MOD_ID);

    public static final RegistryObject<Block> THORIUM_BLOCK = registerBlock("thorium_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(8f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> THORIUM_ORE = registerBlock("thorium_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(8f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> THORIUM_TILE = registerBlock("thorium_tile",
            () -> new ThoriumTile(BlockBehaviour.Properties.of(Material.STONE).strength(6f).requiresCorrectToolForDrops()));



    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }


    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(tab)));
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(ModCreativeModeTab.THORIUMCRAFT_TAB)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
