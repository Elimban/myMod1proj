package com.elimbanmodder.myfirstmod.Item;

import com.elimbanmodder.myfirstmod.Item.custom.DowsingRodItem;
import com.elimbanmodder.myfirstmod.TheMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TheMod.MOD_ID);

    public static final RegistryObject<Item> DIAMOND = ITEMS.register("diamond",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.MY_MOD_TAB))
    );

    public static final RegistryObject<Item> SMILE = ITEMS.register("smile",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.MY_MOD_TAB)));

    public static final RegistryObject<Item> DOWSING_ROD = ITEMS.register("dowsing_rod",
            ()-> new DowsingRodItem(new Item.Properties().tab(ModCreativeModeTab.MY_MOD_TAB).durability(16)));

    public static void register (IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
