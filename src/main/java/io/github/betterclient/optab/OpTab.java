package io.github.betterclient.optab;

import java.util.ArrayList;
import java.util.List;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup; //QSL no longer has ItemGroup in it so fabric
import net.minecraft.item.ItemGroup;
import net.minecraft.text.Text;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;
import net.minecraft.block.Blocks;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;

public class OpTab implements ModInitializer {
	public ItemGroup opGroup;

	@Override
	public void onInitialize(ModContainer mod) {
		var builder = FabricItemGroup.builder(new Identifier("optab", "optab"));
		var items = this.getItems();
		var icon = new ItemStack(Blocks.BARRIER);

		builder.icon(() -> icon);
		builder.entries((featureFlagBitSet, itemStackCollector, bl) -> itemStackCollector.addStacks(items));

		opGroup = builder.build();
	}

	public List<ItemStack> getItems(){
		List<ItemStack> stacks = new ArrayList<>();

		ItemStack sharp32ksword = new ItemStack(Items.NETHERITE_SWORD);
		sharp32ksword.addEnchantment(Enchantments.SHARPNESS, 127);
		sharp32ksword.addEnchantment(Enchantments.FIRE_ASPECT, 127);
		sharp32ksword.addEnchantment(Enchantments.MENDING, 127);
		sharp32ksword.addEnchantment(Enchantments.UNBREAKING, 127);
		sharp32ksword.setCustomName(Text.translatable("OP Sword"));
		stacks.add(sharp32ksword);

		ItemStack sharp32kaxe = new ItemStack(Items.NETHERITE_AXE);
		sharp32kaxe.addEnchantment(Enchantments.EFFICIENCY, 127);
		sharp32kaxe.addEnchantment(Enchantments.SHARPNESS, 127);
		sharp32kaxe.addEnchantment(Enchantments.FIRE_ASPECT, 127);
		sharp32kaxe.addEnchantment(Enchantments.MENDING, 127);
		sharp32kaxe.addEnchantment(Enchantments.UNBREAKING, 127);
		sharp32kaxe.setCustomName(Text.translatable("OP Axe"));
		stacks.add(sharp32kaxe);

		ItemStack eff32kpickaxe = new ItemStack(Items.NETHERITE_PICKAXE);
		eff32kpickaxe.addEnchantment(Enchantments.EFFICIENCY, 127);
		eff32kpickaxe.addEnchantment(Enchantments.FORTUNE, 10);
		eff32kpickaxe.addEnchantment(Enchantments.MENDING, 127);
		eff32kpickaxe.addEnchantment(Enchantments.UNBREAKING, 127);
		eff32kpickaxe.setCustomName(Text.translatable("OP Pickaxe"));
		stacks.add(eff32kpickaxe);

		ItemStack silktouchpickaxe = new ItemStack(Items.NETHERITE_PICKAXE);
		silktouchpickaxe.addEnchantment(Enchantments.EFFICIENCY, 127);
		silktouchpickaxe.addEnchantment(Enchantments.SILK_TOUCH, 1);
		silktouchpickaxe.addEnchantment(Enchantments.MENDING, 127);
		silktouchpickaxe.addEnchantment(Enchantments.UNBREAKING, 127);
		silktouchpickaxe.setCustomName(Text.translatable("OP Silk Touch Pickaxe"));
		stacks.add(silktouchpickaxe);

		ItemStack eff32kshovel = new ItemStack(Items.NETHERITE_SHOVEL);
		eff32kshovel.addEnchantment(Enchantments.EFFICIENCY, 127);
		eff32kshovel.addEnchantment(Enchantments.FORTUNE, 10);
		eff32kshovel.addEnchantment(Enchantments.MENDING, 127);
		eff32kshovel.addEnchantment(Enchantments.UNBREAKING, 127);
		eff32kshovel.setCustomName(Text.translatable("OP Shovel"));
		stacks.add(eff32kshovel);

		ItemStack all32khelmet = new ItemStack(Items.NETHERITE_HELMET);
		all32khelmet.addEnchantment(Enchantments.PROTECTION, 127);
		all32khelmet.addEnchantment(Enchantments.FIRE_PROTECTION, 127);
		all32khelmet.addEnchantment(Enchantments.BLAST_PROTECTION, 127);
		all32khelmet.addEnchantment(Enchantments.PROJECTILE_PROTECTION, 127);
		all32khelmet.addEnchantment(Enchantments.RESPIRATION, 127);
		all32khelmet.addEnchantment(Enchantments.THORNS, 127);
		all32khelmet.addEnchantment(Enchantments.MENDING, 127);
		all32khelmet.addEnchantment(Enchantments.UNBREAKING, 127);
		all32khelmet.setCustomName(Text.translatable("OP Helmet"));
		stacks.add(all32khelmet);

		ItemStack all32kchestplate = new ItemStack(Items.NETHERITE_CHESTPLATE);
		all32kchestplate.addEnchantment(Enchantments.PROTECTION, 127);
		all32kchestplate.addEnchantment(Enchantments.FIRE_PROTECTION, 127);
		all32kchestplate.addEnchantment(Enchantments.BLAST_PROTECTION, 127);
		all32kchestplate.addEnchantment(Enchantments.PROJECTILE_PROTECTION, 127);
		all32kchestplate.addEnchantment(Enchantments.THORNS, 127);
		all32kchestplate.addEnchantment(Enchantments.MENDING, 127);
		all32kchestplate.addEnchantment(Enchantments.UNBREAKING, 127);
		all32kchestplate.setCustomName(Text.translatable("OP ChestPlate"));
		stacks.add(all32kchestplate);

		ItemStack all32kleggings = new ItemStack(Items.NETHERITE_LEGGINGS);
		all32kleggings.addEnchantment(Enchantments.PROTECTION, 127);
		all32kleggings.addEnchantment(Enchantments.FIRE_PROTECTION, 127);
		all32kleggings.addEnchantment(Enchantments.BLAST_PROTECTION, 127);
		all32kleggings.addEnchantment(Enchantments.PROJECTILE_PROTECTION, 127);
		all32kleggings.addEnchantment(Enchantments.THORNS, 127);
		all32kleggings.addEnchantment(Enchantments.MENDING, 127);
		all32kleggings.addEnchantment(Enchantments.UNBREAKING, 127);
		all32kleggings.setCustomName(Text.translatable("OP Leggings"));
		stacks.add(all32kleggings);

		ItemStack all32kboots = new ItemStack(Items.NETHERITE_BOOTS);
		all32kboots.addEnchantment(Enchantments.PROTECTION, 127);
		all32kboots.addEnchantment(Enchantments.FIRE_PROTECTION, 127);
		all32kboots.addEnchantment(Enchantments.BLAST_PROTECTION, 127);
		all32kboots.addEnchantment(Enchantments.PROJECTILE_PROTECTION, 127);
		all32kboots.addEnchantment(Enchantments.THORNS, 127);
		all32kboots.addEnchantment(Enchantments.FEATHER_FALLING, 127);
		all32kboots.addEnchantment(Enchantments.MENDING, 127);
		all32kboots.addEnchantment(Enchantments.UNBREAKING, 127);
		all32kboots.setCustomName(Text.translatable("OP Boots"));
		stacks.add(all32kboots);

		/*ItemStack stackedtotem = new ItemStack(Items.TOTEM_OF_UNDYING);
		stackedtotem.setCount(64);
		stackedtotem.setCustomName(Text.translatable("Stacked Totem"));
		stacks.add(stackedtotem);
		 */
		//Unfortunately 1.19.3 doesn't seem to allow stacked items in item groups

		stacks.add(new ItemStack(Blocks.COMMAND_BLOCK));
		stacks.add(new ItemStack(Blocks.BARRIER));
		stacks.add(new ItemStack(Blocks.STRUCTURE_BLOCK));
		stacks.add(new ItemStack(Blocks.STRUCTURE_VOID));
		stacks.add(new ItemStack(Blocks.LIGHT));
		stacks.add(new ItemStack(Items.COMMAND_BLOCK_MINECART));
		stacks.add(new ItemStack(Blocks.DRAGON_EGG));
		stacks.add(new ItemStack(Items.DEBUG_STICK));
		stacks.add(new ItemStack(Blocks.SPAWNER));
		stacks.add(new ItemStack(Items.KNOWLEDGE_BOOK));

		return stacks;
	}
}
