package com.chefmoon.ubesdelight.registry;

import com.chefmoon.ubesdelight.UbesDelightMod;
import com.chefmoon.ubesdelight.item.ConsumableItem;
import com.chefmoon.ubesdelight.item.DrinkableItem;
import com.chefmoon.ubesdelight.item.ModBlockItem;
import com.chefmoon.ubesdelight.item.ModItemSettings;
import com.chefmoon.ubesdelight.item.enumeration.FoodItem;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import java.util.function.Supplier;

import static com.chefmoon.ubesdelight.item.ModItemSettings.base;
import static com.chefmoon.ubesdelight.item.ModItemSettings.food;


public enum ItemsRegistry {

    //Heat Source
    KALAN("kalan", () -> new ModBlockItem(BlocksRegistry.KALAN.get(),new ModItemSettings(),true)),
    // Release: TBD
    //BAKING_MAT("baking_mat", () -> new ModBlockItem(BlocksRegistry.BAKING_MAT.get(),new ModItemSettings(),true)),

    //Wild Vegetables
    WILD_UBE("wild_ube", () -> new ModBlockItem(BlocksRegistry.WILD_UBE.get())),
    WILD_GARLIC("wild_garlic", () -> new ModBlockItem(BlocksRegistry.WILD_GARLIC.get())),
    WILD_GINGER("wild_ginger", () -> new ModBlockItem(BlocksRegistry.WILD_GINGER.get())),
    WILD_LEMONGRASS("wild_lemongrass", () -> new ModBlockItem(BlocksRegistry.WILD_LEMONGRASS.get())),

    //Vegetable Crates
    UBE_CRATE("ube_crate", () -> new ModBlockItem((BlocksRegistry.UBE_CRATE.get()))),
    GARLIC_CRATE("garlic_crate", () -> new ModBlockItem((BlocksRegistry.GARLIC_CRATE.get()))),
    GINGER_CRATE("ginger_crate", () -> new ModBlockItem((BlocksRegistry.GINGER_CRATE.get()))),
    LEMONGRASS_CRATE("lemongrass_crate", () -> new ModBlockItem((BlocksRegistry.LEMONGRASS_CRATE.get()))),

    // Release: TBD
    // Jungle Log Variants
    //UBE_JUNGLE_LOG_CRATE("ube_jungle_log_crate", () -> new ModBlockItem((BlocksRegistry.UBE_JUNGLE_LOG_CRATE.get()))),
    // Jungle Plank Variants
    // UBE_JUNGLE_CRATE("ube_jungle_crate", () -> new ModBlockItem((BlocksRegistry.UBE_JUNGLE_CRATE.get()))),

    //Feasts
    UBE_CAKE("ube_cake", () -> new ModBlockItem(BlocksRegistry.UBE_CAKE.get(), new ModItemSettings().maxCount(1))),
    LECHE_FLAN_FEAST("leche_flan_feast", () -> new ModBlockItem(BlocksRegistry.LECHE_FLAN_FEAST.get(), new ModItemSettings().maxCount(1))),
    LUMPIA_FEAST("lumpia_feast", () -> new ModBlockItem(BlocksRegistry.LUMPIA_FEAST.get(), new ModItemSettings().maxCount(1))),
    HALO_HALO_FEAST("halo_halo_feast", () -> new ModBlockItem(BlocksRegistry.HALO_HALO_FEAST.get(), new ModItemSettings().maxCount(1))),
    MILK_TEA_UBE_FEAST("milk_tea_ube_feast", () -> new ModBlockItem(BlocksRegistry.MILK_TEA_UBE_FEAST.get(), new ModItemSettings().maxCount(1))),

    //Items
    POISONOUS_UBE("poisonous_ube", () -> new Item(base())),
    UBE("ube", () -> new AliasedBlockItem(BlocksRegistry.UBE_CROP.get(), food(FoodItem.UBE))),
    GARLIC("garlic", () -> new AliasedBlockItem(BlocksRegistry.GARLIC_CROP.get(), food(FoodItem.GARLIC))),
    GINGER("ginger", () -> new AliasedBlockItem(BlocksRegistry.GINGER_CROP.get(), food(FoodItem.GINGER))),
    LEMONGRASS("lemongrass", () -> new ConsumableItem(food(FoodItem.LEMONGRASS))),
    LEMONGRASS_SEEDS("lemongrass_seeds", () -> new AliasedBlockItem(BlocksRegistry.LEMONGRASS_STALK_CROP.get(), base())),

    //Ingredients
    CONDENSED_MILK_BOTTLE("condensed_milk_bottle", () -> new DrinkableItem(food(FoodItem.CONDENSED_MILK_BOTTLE, Items.GLASS_BOTTLE, 16), true)),
    FISH_SAUCE_BOTTLE("fish_sauce_bottle", () -> new DrinkableItem(food(FoodItem.FISH_SAUCE_BOTTLE, Items.GLASS_BOTTLE, 16), true)),
    MILK_POWDER("milk_powder", () -> new Item(base())),
    SUGAR_BROWN("sugar_brown", () -> new Item(base())),
    LUMPIA_WRAPPER("lumpia_wrapper", () -> new Item(base())),

    //Drinks
    MILK_TEA_UBE("milk_tea_ube", () -> new DrinkableItem(food(FoodItem.MILK_TEA_UBE, Items.GLASS_BOTTLE, 16), true)),
    HALO_HALO("halo_halo", () -> new DrinkableItem(food(FoodItem.HALO_HALO, Items.GLASS_BOTTLE, 16), true)),

    //Partial Vegetables
    GARLIC_CHOP("garlic_chop", () -> new ConsumableItem(food(FoodItem.GARLIC_CHOP))),
    GINGER_CHOP("ginger_chop", () -> new ConsumableItem(food(FoodItem.GINGER_CHOP))),

    //Finger Foods
    SINANGAG("sinangag", () -> new ConsumableItem(food(FoodItem.SINANGAG, Items.BOWL, 16), true)),
    KINILAW("kinilaw", () -> new ConsumableItem(food(FoodItem.KINILAW, Items.BOWL, 16), true)),
    LUMPIA("lumpia", () -> new ConsumableItem(food(FoodItem.LUMPIA))),
    TOCINO("tocino", () -> new ConsumableItem(food(FoodItem.TOCINO))),
    CHICKEN_INASAL("chicken_inasal", () -> new ConsumableItem(food(FoodItem.CHICKEN_INASAL))),

    //Meals
    CHICKEN_INASAL_RICE("chicken_inasal_rice", () -> new ConsumableItem(food(FoodItem.CHICKEN_INASAL_RICE, Items.BOWL, 16), true)),
    TOSILOG("tosilog", () -> new ConsumableItem(food(FoodItem.TOSILOG, Items.BOWL, 16), true)),
    BANGSILOG("bangsilog", () -> new ConsumableItem(food(FoodItem.BANGSILOG, Items.BOWL, 16), true)),
    SISIG("sisig", () -> new ConsumableItem(food(FoodItem.SISIG, Items.BOWL, 16), true)),
    BULALO("bulalo", () -> new ConsumableItem(food(FoodItem.BULALO, Items.BOWL, 16), true)),
    ARROZ_CALDO("arroz_caldo", () -> new ConsumableItem(food(FoodItem.ARROZ_CALDO, Items.BOWL, 16), true)),
    MECHADO("mechado", () -> new ConsumableItem(food(FoodItem.MECHADO, Items.BOWL, 16), true)),

    //Sweets
    COOKIE_UBE("cookie_ube", () -> new ConsumableItem(food(FoodItem.COOKIES))),
    COOKIE_GINGER("cookie_ginger", () -> new ConsumableItem(food(FoodItem.COOKIES))),
    POLVORONE("polvorone", () -> new ConsumableItem(food(FoodItem.POLVORONE))),
    POLVORONE_PINIPIG("polvorone_pinipig", () -> new ConsumableItem(food(FoodItem.POLVORONE))),
    POLVORONE_UBE("polvorone_ube", () -> new ConsumableItem(food(FoodItem.POLVORONE))),
    POLVORONE_CC("polvorone_cc", () -> new ConsumableItem(food(FoodItem.POLVORONE))),
    RAW_POLVORONE("raw_polvorone", () -> new Item(base())),
    RAW_POLVORONE_PINIPIG("raw_polvorone_pinipig", () -> new Item(base())),
    RAW_POLVORONE_UBE("raw_polvorone_ube", () -> new Item(base())),
    RAW_POLVORONE_CC("raw_polvorone_cc", () -> new Item(base())),

    LECHE_FLAN("leche_flan", () -> new ConsumableItem(food(FoodItem.LECHE_FLAN))),
    UBE_CAKE_SLICE("ube_cake_slice", () -> new ConsumableItem(food(FoodItem.UBE_CAKE_SLICE), true));


    private final String pathName;
    private final Supplier<Item> itemSupplier;
    private final Integer burnTime;
    private Item item;

    ItemsRegistry(String pathName, Supplier<Item> itemSupplier) {
        this(pathName, itemSupplier, null);
    }

    ItemsRegistry(String pathName, Supplier<Item> itemSupplier, Integer burnTime) {
        this.pathName = pathName;
        this.itemSupplier = itemSupplier;
        this.burnTime = burnTime;
    }

    public static void registerAll() {
        for (ItemsRegistry value : values()) {
            Registry.register(Registries.ITEM, new Identifier(UbesDelightMod.MOD_ID, value.pathName), value.get());
            ItemGroupEvents.modifyEntriesEvent(UbesDelightMod.ITEM_GROUP).register(entries -> entries.add(value.get()));
            if (value.burnTime != null && value.burnTime > 0) {
                FuelRegistry.INSTANCE.add(value.get(), value.burnTime);
            }
        }
    }

    public Item get() {
        if (item == null) {
            item = itemSupplier.get();
        }
        return item;
    }

    public String getId() {
        return Registries.ITEM.getId(get()).toString();
    }
}
