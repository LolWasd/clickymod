package wasdlol.clickycraft.registry;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import wasdlol.clickycraft.*;

import static wasdlol.clickycraft.Clickycraft.ITEM_GROUP;

public class ClickycraftItems {


    // Clicker weapons

    public static final ToolItem BASIC_CLICKER = new SwordItem(woodenclickermaterial.INSTANCE, 1, 8F, new Item.Settings().group(Clickycraft.ITEM_GROUP));

    public static final ToolItem STONE_CLICKER = new SwordItem(stoneclickermaterial.INSTANCE, 2, 16F, new Item.Settings().group(Clickycraft.ITEM_GROUP));

    public static final ToolItem IRON_CLICKER = new SwordItem(ironclickermaterial.INSTANCE, 3, 32F, new Item.Settings().group(Clickycraft.ITEM_GROUP));

    public static final ToolItem DIAMOND_CLICKER = new SwordItem(diamondclickermaterial.INSTANCE, 4, 64F, new Item.Settings().group(Clickycraft.ITEM_GROUP));

    public static final ToolItem NETHERITE_CLICKER = new SwordItem(netheriteclickermaterial.INSTANCE, 5, 128F, new Item.Settings().group(Clickycraft.ITEM_GROUP));



    // Registering

    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(Clickycraft.MOD_ID, "basic_clicker"), BASIC_CLICKER);
        Registry.register(Registry.ITEM, new Identifier(Clickycraft.MOD_ID, "stone_clicker"), STONE_CLICKER);
        Registry.register(Registry.ITEM, new Identifier(Clickycraft.MOD_ID, "iron_clicker"), IRON_CLICKER);
        Registry.register(Registry.ITEM, new Identifier(Clickycraft.MOD_ID, "diamond_clicker"), DIAMOND_CLICKER);
        Registry.register(Registry.ITEM, new Identifier(Clickycraft.MOD_ID, "netherite_clicker"), NETHERITE_CLICKER);
    }
}
