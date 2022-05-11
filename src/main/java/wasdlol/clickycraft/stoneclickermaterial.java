package wasdlol.clickycraft;

import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;

public class stoneclickermaterial extends woodenclickermaterial {

    public static final stoneclickermaterial INSTANCE = new stoneclickermaterial();

    @Override
    public int getDurability() {
        return 500;
    }
    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(Items.COBBLESTONE);
    }
}
