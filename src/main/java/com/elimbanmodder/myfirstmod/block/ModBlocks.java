package com.elimbanmodder.myfirstmod.block;

import com.elimbanmodder.myfirstmod.Item.ModCreativeModeTab;
import com.elimbanmodder.myfirstmod.Item.ModItems;
import com.elimbanmodder.myfirstmod.TheMod;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, TheMod.MOD_ID);

    public static final RegistryObject<Block> DIAMOND_BLOCK = registerBlock("diamond_block",
            ()-> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(9f).requiresCorrectToolForDrops()), ModCreativeModeTab.MY_MOD_TAB);

    public static final RegistryObject<Block> RAW_DIAMOND_BLOCK = registerBlock("raw_diamond_block",
            ()-> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(7f).requiresCorrectToolForDrops()), ModCreativeModeTab.MY_MOD_TAB);

    public static final RegistryObject<Block> DIAMOND_ORE = registerBlock("diamond_ore",
            ()-> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.MY_MOD_TAB);


    public static void register (IEventBus eventBus){
        BLOCKS.register(eventBus);
    }

    private static <T extends Block>RegistryObject<T> registerBlock (String name, Supplier<T> block, CreativeModeTab tab){
        RegistryObject<T> toReturn =  BLOCKS.register(name,block);
        registerBlockItem(name,toReturn,tab);

        return toReturn;
    }

    private static <T extends Block>RegistryObject<Item> registerBlockItem (String name, RegistryObject<T> block,
                                                                            CreativeModeTab tab){
        return ModItems.ITEMS.register(name, ()-> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }
}
