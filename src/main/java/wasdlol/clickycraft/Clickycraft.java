package wasdlol.clickycraft;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import wasdlol.clickycraft.registry.ClickycraftItems;


public class Clickycraft implements ModInitializer {

    public static final String MOD_ID = "clickycraft";

    public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.build(
            new Identifier(MOD_ID, "clickycraftitemgroup"),
            () -> new ItemStack(ClickycraftItems.BASIC_CLICKER));


    @Override
    public void onInitialize() {
        ClickycraftItems.registerItems();

    }
}
