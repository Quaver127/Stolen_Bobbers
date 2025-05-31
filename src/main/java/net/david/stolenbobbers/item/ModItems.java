    package net.david.stolenbobbers.item;

import net.david.stolenbobbers.StolenBobbers;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.EventBus;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, StolenBobbers.MOD_ID);


    public static final RegistryObject<Item> RED_WHITE_BOBBER = ITEMS.register("red_white_bobber", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BLUE_WHITE_BOBBER = ITEMS.register("blue_white_bobber", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GREEN_WHITE_BOBBER = ITEMS.register("green_white_bobber", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> YELLOW_WHITE_BOBBER = ITEMS.register("yellow_white_bobber", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RED_BLUE_BOBBER = ITEMS.register("red_blue_bobber", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GREEN_YELLOW_BOBBER = ITEMS.register("green_yellow_bobber", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PINK_BOBBER = ITEMS.register("pink_bobber", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SMILE_BOBBER = ITEMS.register("smile_bobber", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SKULL_BOBBER = ITEMS.register("skull_bobber", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BEAR_BOBBER = ITEMS.register("bear_bobber", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PEARL_BOBBER = ITEMS.register("pearl_bobber", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SPIKE_BOBBER = ITEMS.register("spike_bobber", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SAP_BOBBER = ITEMS.register("sap_bobber", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SLIME_BOBBER = ITEMS.register("slime_bobber", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CAT_BOBBER = ITEMS.register("cat_bobber", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DUCK_BOBBER = ITEMS.register("duck_bobber", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> HEART_BOBBER = ITEMS.register("heart_bobber", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> JOJA_BOBBER = ITEMS.register("joja_bobber", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CORK_BOBBER = ITEMS.register("cork_bobber", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> HOOK_BOBBER = ITEMS.register("hook_bobber", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PINK_SLIME_BOBBER = ITEMS.register("pink_slime_bobber", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BOAT_SLIME_BOBBER = ITEMS.register("boat_bobber", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SEAWEED_SLIME_BOBBER = ITEMS.register("seaweed_bobber", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BOOT_SLIME_BOBBER = ITEMS.register("boot_bobber", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> STICK_SLIME_BOBBER = ITEMS.register("stick_bobber", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BASEBALL_SLIME_BOBBER = ITEMS.register("baseball_bobber", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BURGER_SLIME_BOBBER = ITEMS.register("burger_bobber", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CYAN_PURPLE_BOBBER = ITEMS.register("cyan_purple_bobber", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> OSTRICH_BOBBER = ITEMS.register("ostrich_bobber", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> YELLOW_BOBBER = ITEMS.register("yellow_bobber", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BLACK_SKULL_BOBBER = ITEMS.register("black_skull_bobber", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LILY_BOBBER = ITEMS.register("lily_bobber", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> EMERALD_BOBBER = ITEMS.register("emerald_bobber", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RADIOACTIVE_BOBBER = ITEMS.register("radioactive_bobber", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> WHITE_PEARL_BOBBER = ITEMS.register("white_pearl_bobber", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> IRIDIUM_BOBBER = ITEMS.register("iridium_bobber", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> COW_BOBBER = ITEMS.register("cow_bobber", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DIAMOND_BOBBER = ITEMS.register("diamond_bobber", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> STARFRUIT_BOBBER = ITEMS.register("starfruit_bobber", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LEWIS_BOBBER = ITEMS.register("lewis_bobber", () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
