package net.david.stolenbobbers.item;

import net.david.stolenbobbers.StolenBobbers;
import net.david.stolenbobbers.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.common.CreativeModeTabRegistry;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, StolenBobbers.MOD_ID);

    public static final RegistryObject<CreativeModeTab> BOBBER_TAB = CREATIVE_MODE_TABS.register("bobber_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.STARFRUIT_BOBBER.get()))
                    .title(Component.translatable("creativetab.bobber_tab"))
                    .displayItems(((itemDisplayParameters, output) -> {

                        output.accept(ModItems.RED_WHITE_BOBBER.get());
                        output.accept(ModItems.BLUE_WHITE_BOBBER.get());
                        output.accept(ModItems.GREEN_WHITE_BOBBER.get());
                        output.accept(ModItems.YELLOW_WHITE_BOBBER .get());
                        output.accept(ModItems.RED_BLUE_BOBBER.get());
                        output.accept(ModItems.GREEN_YELLOW_BOBBER.get());
                        output.accept(ModItems.CYAN_PURPLE_BOBBER.get());
                        output.accept(ModItems.PINK_BOBBER.get());
                        output.accept(ModItems.YELLOW_BOBBER.get());
                        output.accept(ModItems.SMILE_BOBBER.get());
                        output.accept(ModItems.SKULL_BOBBER.get());
                        output.accept(ModItems.BEAR_BOBBER.get());
                        output.accept(ModItems.PEARL_BOBBER.get());
                        output.accept(ModItems.WHITE_PEARL_BOBBER.get());
                        output.accept(ModItems.SPIKE_BOBBER.get());
                        output.accept(ModItems.SAP_BOBBER.get());
                        output.accept(ModItems.SLIME_BOBBER.get());
                        output.accept(ModItems.CAT_BOBBER.get());
                        output.accept(ModItems.DUCK_BOBBER.get());
                        output.accept(ModItems.HEART_BOBBER.get());
                        output.accept(ModItems.JOJA_BOBBER.get());
                        output.accept(ModItems.CORK_BOBBER.get());
                        output.accept(ModItems.HOOK_BOBBER.get());
                        output.accept(ModItems.PINK_SLIME_BOBBER.get());
                        output.accept(ModItems.BOAT_SLIME_BOBBER.get());
                        output.accept(ModItems.SEAWEED_SLIME_BOBBER.get());
                        output.accept(ModItems.BOOT_SLIME_BOBBER.get());
                        output.accept(ModItems.STICK_SLIME_BOBBER.get());
                        output.accept(ModItems.BASEBALL_SLIME_BOBBER.get());
                        output.accept(ModItems.BURGER_SLIME_BOBBER.get());
                        output.accept(ModItems.OSTRICH_BOBBER.get());
                        output.accept(ModItems.BLACK_SKULL_BOBBER.get());
                        output.accept(ModItems.LILY_BOBBER.get());
                        output.accept(ModItems.EMERALD_BOBBER.get());
                        output.accept(ModItems.RADIOACTIVE_BOBBER.get());
                        output.accept(ModItems.IRIDIUM_BOBBER.get());
                        output.accept(ModItems.COW_BOBBER.get());
                        output.accept(ModItems.DIAMOND_BOBBER.get());
                        output.accept(ModItems.STARFRUIT_BOBBER.get());
                        output.accept(ModItems.LEWIS_BOBBER.get());





                    }))
                    .build());
    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
