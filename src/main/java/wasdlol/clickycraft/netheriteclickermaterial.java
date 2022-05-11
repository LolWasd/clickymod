package wasdlol.clickycraft;

import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;

public class netheriteclickermaterial extends woodenclickermaterial {

    public static final netheriteclickermaterial INSTANCE = new netheriteclickermaterial();

    @Override
    public int getDurability() {
        return 4000;
    }
    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(Items.NETHERITE_INGOT);
    }
}
