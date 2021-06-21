package us.acei.squared;

import net.minecraft.*;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(modid = squared.MODID, version = squared.VERSION)
public class squared
{
    public static final String MODID = "squared";
    public static final String VERSION = "0.1-alpha";
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        System.out.println("[Squared] Starting squared.FMLInitializationEvent");
        System.out.println("[Squared] Welcome to squared "+VERSION+"! :D");
        System.out.println("Totally Ç̸̠̈́͊̐̕ò̷͓̫̥̄̽̀̃̓m̴̬̤̈́͋̌̈́͊̇̚͠p̵̢̾l̶̥͈̱̙̲̓́͑̎̇͂́͘͠͠é̶͖̂͒ţ̸̻̰͉̖̑̔̃͘e̴̦͎͈̫̭̔̑̒͝ľ̶̨̲̜y̸̖̮̣̱̾͆͝ ̴̗͓̜̖̦͚͝ͅͅB̶̮͕̏ŭ̸͍g̸̨̡̼͖̖͇̞̲̽̏̌̐̅̂͊̈́l̸͉̯͎̲̤̣̪̩̦͉̾͒͆̆é̸̝̯͉̙̰̩̓͌͆̇̾͑͠ś̶̢̲̟͇̲̦͂͗̀̿̋̄̃͝s̷͇͂͂̾͛͊͐̽͋͆͘͜͜");
    }

    /*@SubscribeEvent
    public void onChat(ClientChatReceivedEvent event) {
        String message = event.message.getUnformattedText();
        if(message.contains(".fullscreen")) {
            Minecraft.getMinecraft().toggleFullscreen();
        }
    }*/
}

/*public class rightShiftMenu 
{
    public static final int RSHIFT_MENU = 0;
    private static final String[] desc = {key.rshift_menu.desc};
    private static final int[] keyValues = {Keyboard.KEY_RSHIFT};
    private final KeyBinding keys[];
    public KeyHandler() 
    {
        keys = new KeyBinding(desc[i], keyValues[i], "key.squared.rshiftmenu");
        ClientRegrestry.registerKeyBinding(keys[i]);
    }
}


@SubscribeEvent
public void onKeyInput(KeyInputEvent event) 
{
    if (!FMLClientHandler.instance().isGUIOpen(GuiChat.class));
    {
        if (keys[RSHIFT_MENU].isPressed())
        {
        //TutorialMain.packetPipeline.sendToServer(new OpenGuiPacket(TutorialMain.GUI_CUSTOM_INV));
        System.out.println("[Squared] Opening ClickGUI");
        }
    }
}

FMLCommonHandler.instance().bus().register(new KeyHandlerTutorial())*/