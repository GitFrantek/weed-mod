package net.frantek.weedmod.item;

import net.frantek.weedmod.WeedMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    private static final Integer JOINT_DURABILITY = 8;

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, WeedMod.MOD_ID);

    public static final RegistryObject<Item> JOINT = ITEMS.register("joint",
            ()-> new Item(new Item.Properties()
                    .tab(ModTab.MOD_TAB)
                    .durability(JOINT_DURABILITY)
                    .setNoRepair()));

    public static final RegistryObject<Item> MARIJUANA = ITEMS.register("marijuana",
            ()-> new Item(new Item.Properties()
                    .tab(ModTab.MOD_TAB)
                    .stacksTo(Item.MAX_STACK_SIZE)));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
