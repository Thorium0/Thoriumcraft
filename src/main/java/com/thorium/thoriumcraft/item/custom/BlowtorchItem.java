package com.thorium.thoriumcraft.item.custom;

import com.google.common.collect.ImmutableMap;
import com.thorium.thoriumcraft.block.ModBlocks;
import com.thorium.thoriumcraft.item.ModItems;
import net.minecraft.Util;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;

import java.util.Map;

public class BlowtorchItem extends Item {
    private static final Map<Block, Item> BLOWTORCH_ITEM_CRAFT =
            new ImmutableMap.Builder<Block, Item>()
                    .put(ModBlocks.THORIUM_ORE.get(), ModItems.THORIUM_INGOT.get())
                    .put(Blocks.IRON_ORE, Items.IRON_INGOT.asItem())
                    .put(Blocks.GOLD_ORE, Items.GOLD_INGOT.asItem())
                    .put(Blocks.COPPER_ORE, Items.COPPER_INGOT.asItem())
                    .put(Blocks.SAND, Blocks.GLASS.asItem())
                    .put(Blocks.COBBLESTONE, Blocks.STONE.asItem())
                    .build();

    public BlowtorchItem(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public InteractionResult useOn(UseOnContext pContext) {
        if (!pContext.getLevel().isClientSide()) {
            Level level = pContext.getLevel();
            BlockPos positionClicked = pContext.getClickedPos();
            Block blockClicked = level.getBlockState(positionClicked).getBlock();

            if (canBlowtorch(blockClicked)) {
                ItemEntity entityItem = new ItemEntity(level, positionClicked.getX(), positionClicked.getY(), positionClicked.getZ(),
                        new ItemStack(BLOWTORCH_ITEM_CRAFT.get(blockClicked), 1));

                level.destroyBlock(positionClicked, false);
                level.addFreshEntity(entityItem);
                pContext.getItemInHand().hurtAndBreak(1, pContext.getPlayer(), p -> {
                    p.broadcastBreakEvent(pContext.getHand());
                });
            } else {
                pContext.getPlayer().sendMessage(new TextComponent("Cannot blowtorch this Block!"), Util.NIL_UUID);
            }
            return InteractionResult.SUCCESS;
        }

        return super.useOn(pContext);
    }

    private boolean canBlowtorch(Block block) {
        return BLOWTORCH_ITEM_CRAFT.containsKey(block);
    }


}
