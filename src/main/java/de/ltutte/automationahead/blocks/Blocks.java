package de.ltutte.automationahead.blocks;

import java.util.function.Supplier;

import de.ltutte.automationahead.AutomationAhead;
import de.ltutte.automationahead.items.Items;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

public class Blocks {
	public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(AutomationAhead.MODID);
	
	public static final DeferredBlock<Block> HEAT_CASE_BLOCK = registerBlock("heat_case_block", () -> new Block(BlockBehaviour.Properties.of()
			.mapColor(MapColor.METAL)
            .instrument(NoteBlockInstrument.IRON_XYLOPHONE)
            .requiresCorrectToolForDrops()
            .strength(5.0F, 6.0F)
            .sound(SoundType.METAL)));


    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        Items.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }
}
