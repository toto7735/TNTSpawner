package me.toto7735.tntSpawner.listener;

import org.bukkit.entity.EntityType;
import org.bukkit.entity.TNTPrimed;
import org.bukkit.event.EventHandler;
import org.bukkit.event.block.BlockPlaceEvent;

public class Listener implements org.bukkit.event.Listener {

    @EventHandler
    public void onPlace(BlockPlaceEvent event) {
        ((TNTPrimed) event.getBlock().getWorld().spawnEntity(event.getBlock().getLocation(), EntityType.PRIMED_TNT)).setFuseTicks(120);
    }

}
