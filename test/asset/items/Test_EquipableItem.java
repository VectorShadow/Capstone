package asset.items;

import asset.items.EquipableItem;
import org.junit.*;
import static org.junit.Assert.*;
public class Test_EquipableItem {
    @Test
    public void testSlots(){
        EquipableItem e1 = new EquipableItem(0, EquipableItem.Slot.OFFENSE_A, "Stick", 5, 3, 1, 1.0);
        EquipableItem e2 = new EquipableItem(1, EquipableItem.Slot.OFFENSE_B, "Sword", 10, 2, 5, 5.0);
        EquipableItem e3 = new EquipableItem(2, EquipableItem.Slot.DEFENSE_A, "Jacket", 1, 3, 1, 1.0);
        EquipableItem e4 = new EquipableItem(3, EquipableItem.Slot.DEFENSE_B, "Armor", 5, 2, 1, 1.0);

        assertEquals(e1.getSlot(),EquipableItem.Slot.OFFENSE_A );
        assertEquals(e2.getSlot(),EquipableItem.Slot.OFFENSE_B);
        assertEquals(e3.getSlot(),EquipableItem.Slot.DEFENSE_A );
        assertEquals(e4.getSlot(),EquipableItem.Slot.DEFENSE_B );
    }

    @Test
    public void testNames(){
        EquipableItem e1 = new EquipableItem(0, EquipableItem.Slot.OFFENSE_A, "Stick", 5, 3, 1, 1.0);
        EquipableItem e2 = new EquipableItem(1, EquipableItem.Slot.OFFENSE_B, "Sword", 10, 2, 5, 5.0);
        EquipableItem e3 = new EquipableItem(2, EquipableItem.Slot.DEFENSE_A, "Jacket", 1, 3, 1, 1.0);
        EquipableItem e4 = new EquipableItem(3, EquipableItem.Slot.DEFENSE_B, "Armor", 5, 2, 1, 1.0);

        assertEquals(e1.getName(), "Stick");
        assertEquals(e2.getName(), "Sword");
        assertEquals(e3.getName(), "Jacket");
        assertEquals(e4.getName(), "Armor");

    }

    @Test
    public void testId(){
        EquipableItem e1 = new EquipableItem(0, EquipableItem.Slot.OFFENSE_A, "Stick", 5, 3, 1, 1.0);
        EquipableItem e2 = new EquipableItem(1, EquipableItem.Slot.OFFENSE_B, "Sword", 10, 2, 5, 5.0);
        EquipableItem e3 = new EquipableItem(2, EquipableItem.Slot.DEFENSE_A, "Jacket", 1, 3, 1, 1.0);
        EquipableItem e4 = new EquipableItem(3, EquipableItem.Slot.DEFENSE_B, "Armor", 5, 2, 1, 1.0);

        assertEquals(e1.getItemID(), 0);
        assertEquals(e2.getItemID(), 1);
        assertEquals(e3.getItemID(), 2);
        assertEquals(e4.getItemID(), 3);

    }

    @Test
    public void testPrice(){
        EquipableItem e1 = new EquipableItem(0, EquipableItem.Slot.OFFENSE_A, "Stick", 5, 3, 1, 1.0);
        EquipableItem e2 = new EquipableItem(1, EquipableItem.Slot.OFFENSE_B, "Sword", 10, 2, 5, 5.0);
        EquipableItem e3 = new EquipableItem(2, EquipableItem.Slot.DEFENSE_A, "Jacket", 1, 3, 1, 1.0);
        EquipableItem e4 = new EquipableItem(3, EquipableItem.Slot.DEFENSE_B, "Armor", 5, 2, 1, 1.0);

        assertEquals(e1.getPricetag(), 5);
        assertEquals(e2.getPricetag(), 10);
        assertEquals(e3.getPricetag(), 1);
        assertEquals(e4.getPricetag(), 5);
    }

    @Test
    public void testBaseStat(){
        EquipableItem e1 = new EquipableItem(0, EquipableItem.Slot.OFFENSE_A, "Stick", 5, 1.0, 1, 1.0);
        EquipableItem e2 = new EquipableItem(1, EquipableItem.Slot.OFFENSE_B, "Sword", 10, 5.0, 5, 5.0);
        EquipableItem e3 = new EquipableItem(2, EquipableItem.Slot.DEFENSE_A, "Jacket", 1, 1.0, 1, 1.0);
        EquipableItem e4 = new EquipableItem(3, EquipableItem.Slot.DEFENSE_B, "Armor", 5, 1.0, 1, 1.0);

        assertEquals(e1.getBaseStat(), 1.0, 0);
        assertEquals(e2.getBaseStat(), 5.0, 0);
        assertEquals(e3.getBaseStat(), 1.0, 0);
        assertEquals(e4.getBaseStat(), 1.0, 0);
    }

    @Test
    public void testAccuracy(){
        EquipableItem e1 = new EquipableItem(0, EquipableItem.Slot.OFFENSE_A, "Stick", 5, 3, 9.0, 1.0);
        EquipableItem e2 = new EquipableItem(1, EquipableItem.Slot.OFFENSE_B, "Sword", 10, 2, 9.0, 5.0);
        EquipableItem e3 = new EquipableItem(2, EquipableItem.Slot.DEFENSE_A, "Jacket", 1, 3, 9.0, 1.0);
        EquipableItem e4 = new EquipableItem(3, EquipableItem.Slot.DEFENSE_B, "Armor", 5, 2, 4.0, 1.0);

        assertEquals(e1.getAccuracy(), 9.0, 0);
        assertEquals(e2.getAccuracy(), 9.0, 0);
        assertEquals(e3.getAccuracy(), 9.0, 0);
        assertEquals(e4.getAccuracy(), 4.0, 0);
    }

    @Test
    public void testEvade(){
        EquipableItem e1 = new EquipableItem(0, EquipableItem.Slot.OFFENSE_A, "Stick", 5, 3, 1, 1.0);
        EquipableItem e2 = new EquipableItem(1, EquipableItem.Slot.OFFENSE_B, "Sword", 10, 2, 5, 0.5);
        EquipableItem e3 = new EquipableItem(2, EquipableItem.Slot.DEFENSE_A, "Jacket", 1, 3, 1, 1.0);
        EquipableItem e4 = new EquipableItem(3, EquipableItem.Slot.DEFENSE_B, "Armor", 5, 2, 1, 0.9);

        assertEquals(e1.getEvade(), 1.0, 0);
        assertEquals(e2.getEvade(), .5, 0);
        assertEquals(e3.getEvade(), 1.0, 0);
        assertEquals(e4.getEvade(), .9, 0);
    }
}
