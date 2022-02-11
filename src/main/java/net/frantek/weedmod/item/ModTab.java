package net.frantek.weedmod.item;

import net.frantek.weedmod.WeedMod;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModTab {

    public static final CreativeModeTab MOD_TAB = new CreativeModeTab(WeedMod.MOD_ID) {
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.MARIJUANA.get());
        }
    };

}
