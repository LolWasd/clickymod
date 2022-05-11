package wasdlol.clickycraft;

import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;

public class ironclickermaterial extends woodenclickermaterial {

    public static final ironclickermaterial INSTANCE = new ironclickermaterial();

    @Override
    public int getDurability() {
        return 1000;
    }
    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(Items.IRON_INGOT);
    }
}
