package io.github.betterclient.opItem;

import java.util.ArrayList;
import java.util.List;

import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;
import org.quiltmc.qsl.item.group.api.QuiltItemGroup;
import net.minecraft.block.Blocks;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;

public class OpItems implements ModInitializer {
	QuiltItemGroup opGroup;
	
	@Override
	public void onInitialize(ModContainer mod) {
		opGroup = QuiltItemGroup.builder(new Identifier("opitems", "optab"))
				.appendItems(t -> {
					t.addAll(getItems());
				})
				.icon(() -> new ItemStack(Blocks.BARRIER))
				.build();
	}
	
	public List<ItemStack> getItems(){
				List<ItemStack> stacks = new ArrayList<>();
		
		ItemStack sharp32ksword = new ItemStack(Items.NETHERITE_SWORD);
		sharp32ksword.addEnchantment(Enchantments.SHARPNESS, 255);
		sharp32ksword.addEnchantment(Enchantments.FIRE_ASPECT, 255);
		sharp32ksword.addEnchantment(Enchantments.MENDING, 255);
		sharp32ksword.addEnchantment(Enchantments.UNBREAKING, 255);
		stacks.add(sharp32ksword);
		
		ItemStack sharp32kaxe = new ItemStack(Items.NETHERITE_AXE);
		sharp32kaxe.addEnchantment(Enchantments.EFFICIENCY, 255);
		sharp32kaxe.addEnchantment(Enchantments.SHARPNESS, 255);
		sharp32kaxe.addEnchantment(Enchantments.FIRE_ASPECT, 255);
		sharp32kaxe.addEnchantment(Enchantments.MENDING, 255);
		sharp32kaxe.addEnchantment(Enchantments.UNBREAKING, 255);
		stacks.add(sharp32kaxe);
		
		ItemStack eff32kpickaxe = new ItemStack(Items.NETHERITE_PICKAXE);
		eff32kpickaxe.addEnchantment(Enchantments.EFFICIENCY, 255);
		eff32kpickaxe.addEnchantment(Enchantments.FORTUNE, 10);
		eff32kpickaxe.addEnchantment(Enchantments.MENDING, 255);
		eff32kpickaxe.addEnchantment(Enchantments.UNBREAKING, 255);
		stacks.add(eff32kpickaxe);
		
		ItemStack silktouchpickaxe = new ItemStack(Items.NETHERITE_PICKAXE);
		silktouchpickaxe.addEnchantment(Enchantments.EFFICIENCY, 255);
		silktouchpickaxe.addEnchantment(Enchantments.SILK_TOUCH, 1);
		silktouchpickaxe.addEnchantment(Enchantments.MENDING, 255);
		silktouchpickaxe.addEnchantment(Enchantments.UNBREAKING, 255);
		stacks.add(silktouchpickaxe);
		
		ItemStack eff32kshovel = new ItemStack(Items.NETHERITE_SHOVEL);
		eff32kshovel.addEnchantment(Enchantments.EFFICIENCY, 255);
		eff32kshovel.addEnchantment(Enchantments.FORTUNE, 10);
		eff32kshovel.addEnchantment(Enchantments.MENDING, 255);
		eff32kshovel.addEnchantment(Enchantments.UNBREAKING, 255);
		stacks.add(eff32kshovel);
		
		ItemStack all32khelmet = new ItemStack(Items.NETHERITE_HELMET);
		all32khelmet.addEnchantment(Enchantments.PROTECTION, 255);
		all32khelmet.addEnchantment(Enchantments.FIRE_PROTECTION, 255);
		all32khelmet.addEnchantment(Enchantments.BLAST_PROTECTION, 255);
		all32khelmet.addEnchantment(Enchantments.PROJECTILE_PROTECTION, 255);
		all32khelmet.addEnchantment(Enchantments.RESPIRATION, 255);
		all32khelmet.addEnchantment(Enchantments.THORNS, 255);
		all32khelmet.addEnchantment(Enchantments.MENDING, 255);
		all32khelmet.addEnchantment(Enchantments.UNBREAKING, 255);
		stacks.add(all32khelmet);
		
		ItemStack all32kchestplate = new ItemStack(Items.NETHERITE_CHESTPLATE);
		all32kchestplate.addEnchantment(Enchantments.PROTECTION, 255);
		all32kchestplate.addEnchantment(Enchantments.FIRE_PROTECTION, 255);
		all32kchestplate.addEnchantment(Enchantments.BLAST_PROTECTION, 255);
		all32kchestplate.addEnchantment(Enchantments.PROJECTILE_PROTECTION, 255);
		all32kchestplate.addEnchantment(Enchantments.THORNS, 255);
		all32kchestplate.addEnchantment(Enchantments.MENDING, 255);
		all32kchestplate.addEnchantment(Enchantments.UNBREAKING, 255);
		stacks.add(all32kchestplate);
		
		ItemStack all32kleggings = new ItemStack(Items.NETHERITE_LEGGINGS);
		all32kleggings.addEnchantment(Enchantments.PROTECTION, 255);
		all32kleggings.addEnchantment(Enchantments.FIRE_PROTECTION, 255);
		all32kleggings.addEnchantment(Enchantments.BLAST_PROTECTION, 255);
		all32kleggings.addEnchantment(Enchantments.PROJECTILE_PROTECTION, 255);
		all32kleggings.addEnchantment(Enchantments.THORNS, 255);
		all32kleggings.addEnchantment(Enchantments.MENDING, 255);
		all32kleggings.addEnchantment(Enchantments.UNBREAKING, 255);
		stacks.add(all32kleggings);
		
		ItemStack all32kboots = new ItemStack(Items.NETHERITE_BOOTS);
		all32kboots.addEnchantment(Enchantments.PROTECTION, 255);
		all32kboots.addEnchantment(Enchantments.FIRE_PROTECTION, 255);
		all32kboots.addEnchantment(Enchantments.BLAST_PROTECTION, 255);
		all32kboots.addEnchantment(Enchantments.PROJECTILE_PROTECTION, 255);
		all32kboots.addEnchantment(Enchantments.THORNS, 255);
		all32kboots.addEnchantment(Enchantments.FEATHER_FALLING, 255);
		all32kboots.addEnchantment(Enchantments.MENDING, 255);
		all32kboots.addEnchantment(Enchantments.UNBREAKING, 255);
		stacks.add(all32kboots);
		
		stacks.add(new ItemStack(Blocks.COMMAND_BLOCK));
		stacks.add(new ItemStack(Blocks.BARRIER));
		stacks.add(new ItemStack(Blocks.STRUCTURE_BLOCK));
		stacks.add(new ItemStack(Blocks.STRUCTURE_VOID));
		stacks.add(new ItemStack(Blocks.LIGHT));
		stacks.add(new ItemStack(Items.COMMAND_BLOCK_MINECART));
		stacks.add(new ItemStack(Blocks.DRAGON_EGG));
		stacks.add(new ItemStack(Items.DEBUG_STICK));
		stacks.add(new ItemStack(Blocks.SPAWNER));
		
		return stacks;
	}
}
