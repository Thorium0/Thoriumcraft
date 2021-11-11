package com.thorium.thoriumcraft.world.gen;

import net.minecraft.data.worldgen.Features;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.RangeDecoratorConfiguration;
import net.minecraft.world.level.levelgen.placement.ConfiguredDecorator;
import net.minecraft.world.level.levelgen.placement.RangeDecorator;
//import net.minecraft.world.level.levelgen.placement.
import net.minecraftforge.event.world.BiomeLoadingEvent;


public class ModOreGeneration {
    public static void generateOres(final BiomeLoadingEvent event) {
        for (OreType ore: OreType.values()) {
            OreConfiguration oreConfig = new OreConfiguration(
                OreConfiguration.Predicates.NATURAL_STONE,
                ore.getBlock().get().defaultBlockState(), ore.getMaxVeinSize());

            //ConfiguredDecorator<RangeDecoratorConfiguration> configuredDecorator = RangeDecorator.RANGE.configured(
            //        new RangeDecoratorConfiguration(ore.getMinHeight(), ore.getMinHeight(), ore.getMaxHeight());
            //)
        }
    }
}
