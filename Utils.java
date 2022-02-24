package net.kunmc.lab.%package%;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.HumanEntity;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Utils {

    public static List<String> nl = Arrays.asList("");

    public static void a(String... m) {
        for (String s : m) {
            Bukkit.getServer().broadcastMessage(s); // 广播消息
        }
    }

    public static List<String> s(List<String> l) {
        Collections.sort(l);
        return l;
    }

    public static List<String> cl(List<String> l, String a) {
        if(a.length() < 1) return s(l);
        List<String> r = new java.util.ArrayList<>();
        for (String s : l) {
            if (s.startsWith(a)) {
                r.add(s);
            }
        }
        return s(r);
    }

    public static void warning(HumanEntity h, String... m) {
        for (String s : m) {
            h.sendMessage(ChatColor.YELLOW + "⚠" + s);
        }
    }

    public static void error(HumanEntity h, String... m) {
        for (String s : m) {
            h.sendMessage(ChatColor.RED + "✖" + s);
        }
    }

    public static void success(HumanEntity h, String... m) {
        for (String s : m) {
            h.sendMessage(ChatColor.GREEN + "✔" + s);
        }
    }

    public static void info(HumanEntity h, String... m) {
        for (String s : m) {
            h.sendMessage(ChatColor.AQUA + "☞" + s);
        }
    }

}
