package com.wit.fxp.nxft.ui.toolbar.menuhandler;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MenuHandlerManager {

    private static final Logger LOGGER = LoggerFactory.getLogger(MenuHandlerManager.class);

    private final Map<String, MenuHandler> menuHandlers = new HashMap<>();

    /**
     * 从名字找对应的处理器，没找到则抛异常。
     *
     * @param menuName
     * @return
     */
    public MenuHandler getMenuHandler(String menuName) {
        MenuHandler menuHandler = menuHandlers.get(menuName);
        if (menuHandler == null) {
            throw new IllegalArgumentException("未找到对应的菜单处理器。menuName = " + menuName);
        }
        return menuHandler;
    }

    /**
     * 注册处理器。
     *
     * @param taskHandler
     */
    public void registerTaskHandler(MenuHandler menuHandler) {
        if (menuHandlers.containsKey(menuHandler.menuName())) {
            throw new IllegalStateException("已注册同名的菜单处理器，不允许重复注册。menuName = " + menuHandler.menuName());
        }

        LOGGER.info("注册菜单处理器：{} = {}", menuHandler.menuName(), menuHandler);
        menuHandlers.put(menuHandler.menuName(), menuHandler);
    }

}
