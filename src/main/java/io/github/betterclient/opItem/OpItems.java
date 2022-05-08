package io.github.betterclient.opItem;

import java.util.ArrayList;
import java.util.List;

import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;
import org.quiltmc.qsl.item.group.api.QuiltItemGroup;

import net.minecraft.block.Blocks;
import net.minecraft.enchantment.Enchantment;
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
		sharp32ksword.addEnchantment(Enchantment.byRawId(16), 32766);//Sharpness
		sharp32ksword.addEnchantment(Enchantment.byRawId(20), 32766);//Fire aspect
		sharp32ksword.addEnchantment(Enchantment.byRawId(70), 32766);//Mending
		sharp32ksword.addEnchantment(Enchantment.byRawId(34), 32766);//Unbreaking
		stacks.add(sharp32ksword);
		
		ItemStack sharp32kaxe = new ItemStack(Items.NETHERITE_AXE);
		sharp32kaxe.addEnchantment(Enchantment.byRawId(32), 32766);//Efficiency
		sharp32kaxe.addEnchantment(Enchantment.byRawId(16), 32766);//Sharpness
		sharp32kaxe.addEnchantment(Enchantment.byRawId(20), 32766);//Fire aspect
		sharp32kaxe.addEnchantment(Enchantment.byRawId(70), 32766);//Mending
		sharp32kaxe.addEnchantment(Enchantment.byRawId(34), 32766);//Unbreaking
		stacks.add(sharp32kaxe);
		
		ItemStack eff32kpickaxe = new ItemStack(Items.NETHERITE_PICKAXE);
		eff32kpickaxe.addEnchantment(Enchantment.byRawId(32), 32766);//Efficiency
		eff32kpickaxe.addEnchantment(Enchantment.byRawId(35), 10);//Fortune
		eff32kpickaxe.addEnchantment(Enchantment.byRawId(70), 32766);//Mending
		eff32kpickaxe.addEnchantment(Enchantment.byRawId(34), 32766);//Unbreaking
		stacks.add(eff32kpickaxe);
		
		ItemStack silktouchpickaxe = new ItemStack(Items.NETHERITE_PICKAXE);
		silktouchpickaxe.addEnchantment(Enchantment.byRawId(32), 32766);//Efficiency
		silktouchpickaxe.addEnchantment(Enchantment.byRawId(33), 1);//Silk Touch
		silktouchpickaxe.addEnchantment(Enchantment.byRawId(70), 32766);//Mending
		silktouchpickaxe.addEnchantment(Enchantment.byRawId(34), 32766);//Unbreaking
		stacks.add(silktouchpickaxe);
		
		ItemStack eff32kshovel = new ItemStack(Items.NETHERITE_SHOVEL);
		eff32kshovel.addEnchantment(Enchantment.byRawId(32), 32766);//Efficiency
		eff32kshovel.addEnchantment(Enchantment.byRawId(35), 10);//Fortune
		eff32kshovel.addEnchantment(Enchantment.byRawId(70), 32766);//Mending
		eff32kshovel.addEnchantment(Enchantment.byRawId(34), 32766);//Unbreaking
		stacks.add(eff32kshovel);
		
		ItemStack all32khelmet = new ItemStack(Items.NETHERITE_HELMET);
		all32khelmet.addEnchantment(Enchantment.byRawId(0), 32766);//Protection
		all32khelmet.addEnchantment(Enchantment.byRawId(1), 32766);//Fire Protection
		all32khelmet.addEnchantment(Enchantment.byRawId(3), 32766);//Blast Protection
		all32khelmet.addEnchantment(Enchantment.byRawId(4), 32766);//Projectile Protection
		all32khelmet.addEnchantment(Enchantment.byRawId(5), 32766);//Respiration
		all32khelmet.addEnchantment(Enchantment.byRawId(7), 32766);//Thorns
		all32khelmet.addEnchantment(Enchantment.byRawId(70), 32766);//Mending
		all32khelmet.addEnchantment(Enchantment.byRawId(34), 32766);//Unbreaking
		stacks.add(all32khelmet);
		
		ItemStack all32kchestplate = new ItemStack(Items.NETHERITE_CHESTPLATE);
		all32kchestplate.addEnchantment(Enchantment.byRawId(0), 32766);//Protection
		all32kchestplate.addEnchantment(Enchantment.byRawId(1), 32766);//Fire Protection
		all32kchestplate.addEnchantment(Enchantment.byRawId(3), 32766);//Blast Protection
		all32kchestplate.addEnchantment(Enchantment.byRawId(4), 32766);//Projectile Protection
		all32kchestplate.addEnchantment(Enchantment.byRawId(7), 32766);//Thorns
		all32kchestplate.addEnchantment(Enchantment.byRawId(70), 32766);//Mending
		all32kchestplate.addEnchantment(Enchantment.byRawId(34), 32766);//Unbreaking
		stacks.add(all32kchestplate);
		
		ItemStack all32kleggings = new ItemStack(Items.NETHERITE_LEGGINGS);
		all32kleggings.addEnchantment(Enchantment.byRawId(0), 32766);//Protection
		all32kleggings.addEnchantment(Enchantment.byRawId(1), 32766);//Fire Protection
		all32kleggings.addEnchantment(Enchantment.byRawId(3), 32766);//Blast Protection
		all32kleggings.addEnchantment(Enchantment.byRawId(4), 32766);//Projectile Protection
		all32kleggings.addEnchantment(Enchantment.byRawId(7), 32766);//Thorns
		all32kleggings.addEnchantment(Enchantment.byRawId(70), 32766);//Mending
		all32kleggings.addEnchantment(Enchantment.byRawId(34), 32766);//Unbreaking
		stacks.add(all32kleggings);
		
		ItemStack all32kboots = new ItemStack(Items.NETHERITE_BOOTS);
		all32kboots.addEnchantment(Enchantment.byRawId(0), 32766);//Protection
		all32kboots.addEnchantment(Enchantment.byRawId(1), 32766);//Fire Protection
		all32kboots.addEnchantment(Enchantment.byRawId(3), 32766);//Blast Protection
		all32kboots.addEnchantment(Enchantment.byRawId(4), 32766);//Projectile Protection
		all32kboots.addEnchantment(Enchantment.byRawId(7), 32766);//Thorns
		all32kboots.addEnchantment(Enchantment.byRawId(2), 32766);//Feather falling
		all32kboots.addEnchantment(Enchantment.byRawId(70), 32766);//Mending
		all32kboots.addEnchantment(Enchantment.byRawId(34), 32766);//Unbreaking
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
