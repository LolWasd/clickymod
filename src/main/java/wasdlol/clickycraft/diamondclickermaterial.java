package wasdlol.clickycraft;

import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;

public class diamondclickermaterial extends woodenclickermaterial {

    public static final diamondclickermaterial INSTANCE = new diamondclickermaterial();

    @Override
    public int getDurability() {
        return 2000;
    }
    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(Items.DIAMOND);
    }
}
