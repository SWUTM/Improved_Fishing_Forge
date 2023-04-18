package net.actionlord.improvedfishing.item;

import net.actionlord.improvedfishing.improvedfishing;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, improvedfishing.MOD_ID);

    public static final RegistryObject<Item> ADVANCED_STRING = ITEMS.register("advanced_string",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));

    public static final RegistryObject<Item> WOODEN_HOOK = ITEMS.register("wooden_hook",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));

    public static final RegistryObject<Item> STONE_HOOK = ITEMS.register("stone_hook",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));

    public static final RegistryObject<Item> IRON_HOOK = ITEMS.register("iron_hook",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));

    public static final RegistryObject<Item> COPPER_HOOK = ITEMS.register("copper_hook",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));

    public static final RegistryObject<Item> GOLD_HOOK = ITEMS.register("gold_hook",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));

    public static final RegistryObject<Item> DIAMOND_HOOK = ITEMS.register("diamond_hook",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));

    public static final RegistryObject<Item> NETHERITE_HOOK = ITEMS.register("netherite_hook",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
