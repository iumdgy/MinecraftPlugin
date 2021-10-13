package com.jeong;

import com.destroystokyo.paper.Namespaced;
import com.google.common.collect.Multimap;
import net.kyori.adventure.text.Component;
import net.md_5.bungee.api.chat.BaseComponent;
import org.bukkit.Material;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.tags.CustomItemTagContainer;
import org.bukkit.persistence.PersistentDataContainer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class PickaxeData implements ItemMeta {
    private int forward;
    private int backward;
    private int up;
    private int down;
    private int right;
    private int left;

    public int getForward() {return forward;}
    public void setForward(int i) {forward = i;}

    public int getBackward() {return backward;}
    public void setBackward(int i) {backward = i;}

    public int getUp() {return up;}
    public void setUp(int i) {up = i;}

    public int getDown() {return down;}
    public void setDown(int i) {down = i;}

    public int getRight() {return right;}
    public void setRight(int i) {right = i;}

    public int getLeft() {return left;}
    public void setLeft(int i) {left = i;}

    @Override
    public boolean hasDisplayName() {
        return false;
    }

    @Override
    public @Nullable Component displayName() {
        return null;
    }

    @Override
    public void displayName(@Nullable Component displayName) {

    }

    @Override
    public @NotNull String getDisplayName() {
        return null;
    }

    @Override
    public @NotNull BaseComponent[] getDisplayNameComponent() {
        return new BaseComponent[0];
    }

    @Override
    public void setDisplayName(@Nullable String name) {

    }

    @Override
    public void setDisplayNameComponent(@Nullable BaseComponent[] component) {

    }

    @Override
    public boolean hasLocalizedName() {
        return false;
    }

    @Override
    public @NotNull String getLocalizedName() {
        return null;
    }

    @Override
    public void setLocalizedName(@Nullable String name) {

    }

    @Override
    public boolean hasLore() {
        return false;
    }

    @Override
    public @Nullable List<Component> lore() {
        return null;
    }

    @Override
    public void lore(@Nullable List<Component> lore) {

    }

    @Override
    public @Nullable List<String> getLore() {
        return null;
    }

    @Override
    public @Nullable List<BaseComponent[]> getLoreComponents() {
        return null;
    }

    @Override
    public void setLore(@Nullable List<String> lore) {

    }

    @Override
    public void setLoreComponents(@Nullable List<BaseComponent[]> lore) {

    }

    @Override
    public boolean hasCustomModelData() {
        return false;
    }

    @Override
    public int getCustomModelData() {
        return 0;
    }

    @Override
    public void setCustomModelData(@Nullable Integer data) {

    }

    @Override
    public boolean hasEnchants() {
        return false;
    }

    @Override
    public boolean hasEnchant(@NotNull Enchantment ench) {
        return false;
    }

    @Override
    public int getEnchantLevel(@NotNull Enchantment ench) {
        return 0;
    }

    @Override
    public @NotNull Map<Enchantment, Integer> getEnchants() {
        return null;
    }

    @Override
    public boolean addEnchant(@NotNull Enchantment ench, int level, boolean ignoreLevelRestriction) {
        return false;
    }

    @Override
    public boolean removeEnchant(@NotNull Enchantment ench) {
        return false;
    }

    @Override
    public boolean hasConflictingEnchant(@NotNull Enchantment ench) {
        return false;
    }

    @Override
    public void addItemFlags(@NotNull ItemFlag... itemFlags) {

    }

    @Override
    public void removeItemFlags(@NotNull ItemFlag... itemFlags) {

    }

    @Override
    public @NotNull Set<ItemFlag> getItemFlags() {
        return null;
    }

    @Override
    public boolean hasItemFlag(@NotNull ItemFlag flag) {
        return false;
    }

    @Override
    public boolean isUnbreakable() {
        return false;
    }

    @Override
    public void setUnbreakable(boolean unbreakable) {

    }

    @Override
    public boolean hasAttributeModifiers() {
        return false;
    }

    @Override
    public @Nullable Multimap<Attribute, AttributeModifier> getAttributeModifiers() {
        return null;
    }

    @Override
    public @NotNull Multimap<Attribute, AttributeModifier> getAttributeModifiers(@NotNull EquipmentSlot slot) {
        return null;
    }

    @Override
    public @Nullable Collection<AttributeModifier> getAttributeModifiers(@NotNull Attribute attribute) {
        return null;
    }

    @Override
    public boolean addAttributeModifier(@NotNull Attribute attribute, @NotNull AttributeModifier modifier) {
        return false;
    }

    @Override
    public void setAttributeModifiers(@Nullable Multimap<Attribute, AttributeModifier> attributeModifiers) {

    }

    @Override
    public boolean removeAttributeModifier(@NotNull Attribute attribute) {
        return false;
    }

    @Override
    public boolean removeAttributeModifier(@NotNull EquipmentSlot slot) {
        return false;
    }

    @Override
    public boolean removeAttributeModifier(@NotNull Attribute attribute, @NotNull AttributeModifier modifier) {
        return false;
    }

    @Override
    public @NotNull CustomItemTagContainer getCustomTagContainer() {
        return null;
    }

    @Override
    public void setVersion(int version) {

    }

    @Override
    public @NotNull ItemMeta clone() {
        return null;
    }

    @Override
    public Set<Material> getCanDestroy() {
        return null;
    }

    @Override
    public void setCanDestroy(Set<Material> canDestroy) {

    }

    @Override
    public Set<Material> getCanPlaceOn() {
        return null;
    }

    @Override
    public void setCanPlaceOn(Set<Material> canPlaceOn) {

    }

    @Override
    public @NotNull Set<Namespaced> getDestroyableKeys() {
        return null;
    }

    @Override
    public void setDestroyableKeys(@NotNull Collection<Namespaced> canDestroy) {

    }

    @Override
    public @NotNull Set<Namespaced> getPlaceableKeys() {
        return null;
    }

    @NotNull
    @Override
    public void setPlaceableKeys(@NotNull Collection<Namespaced> canPlaceOn) {

    }

    @Override
    public boolean hasPlaceableKeys() {
        return false;
    }

    @Override
    public boolean hasDestroyableKeys() {
        return false;
    }

    @Override
    public @NotNull Map<String, Object> serialize() {
        return null;
    }

    @Override
    public @NotNull PersistentDataContainer getPersistentDataContainer() {
        return null;
    }
}
