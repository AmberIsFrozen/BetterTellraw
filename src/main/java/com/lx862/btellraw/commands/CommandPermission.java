package com.lx862.btellraw.commands;

import com.lx862.btellraw.BetterTellraw;
import net.fabricmc.fabric.api.permission.v1.PermissionNode;

public class CommandPermission {
    public static PermissionNode<Boolean> MAIN = PermissionNode.of(BetterTellraw.id("main"));
    public static PermissionNode<Boolean> RELOAD = PermissionNode.of(BetterTellraw.id("reload"));
    public static PermissionNode<Boolean> SEND = PermissionNode.of(BetterTellraw.id("send"));
    public static PermissionNode<Boolean> ADD = PermissionNode.of(BetterTellraw.id("add"));
    public static PermissionNode<Boolean> MODIFY = PermissionNode.of(BetterTellraw.id("modify"));
    public static PermissionNode<Boolean> PREVIEW = PermissionNode.of(BetterTellraw.id("preview"));
    public static PermissionNode<Boolean> LIST = PermissionNode.of(BetterTellraw.id("list"));
    public static PermissionNode<Boolean> ABOUT = PermissionNode.of(BetterTellraw.id("about"));
}
