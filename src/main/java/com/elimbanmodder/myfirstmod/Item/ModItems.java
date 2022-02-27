package com.elimbanmodder.myfirstmod.Item;

import com.elimbanmodder.myfirstmod.TheMod;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TheMod.MOD_ID);

    public static final RegistryObject<Item> DIAMOND = ITEMS.register("diamond",
            ()-> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC))
    );

    public static final RegistryObject<Item> SMILE = ITEMS.register("smile",
            ()-> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD)));

    public static void register (IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
