package x.KenKOfficial.Warp.Commands;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import x.KenKOfficial.Warp.Utils.ChatUtil;
import x.KenKOfficial.Warp.Apis.API;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import x.KenKOfficial.Warp.Basic.Main;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import org.bukkit.command.CommandExecutor;

public class SetwarpCommand implements CommandExecutor
{
    private static final /* synthetic */ String[] Ill;
    private static final /* synthetic */ int[] lll;
    private static final /* synthetic */ String COMMAND_USAGE;
    
    private static String lIlIl(final String lIlIllllIllllll, final String IlIIllllIllllll) {
        try {
            final SecretKeySpec IIIlllllIllllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(IlIIllllIllllll.getBytes(StandardCharsets.UTF_8)), SetwarpCommand.lll[7]), "DES");
            final Cipher lllIllllIllllll = Cipher.getInstance("DES");
            lllIllllIllllll.init(SetwarpCommand.lll[2], IIIlllllIllllll);
            return new String(lllIllllIllllll.doFinal(Base64.getDecoder().decode(lIlIllllIllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception IllIllllIllllll) {
            IllIllllIllllll.printStackTrace();
            return null;
        }
    }
    
    private static boolean IIlll(final int lIIlIlllIllllll, final int IIIlIlllIllllll) {
        return lIIlIlllIllllll < IIIlIlllIllllll;
    }
    
    private static boolean IlIll(final int IIlIIlllIllllll) {
        return IIlIIlllIllllll == 0;
    }
    
    private static boolean llIll(final int IllIIlllIllllll) {
        return IllIIlllIllllll != 0;
    }
    
    static {
        lIIll();
        IIIll();
        COMMAND_USAGE = Main.getPlugin().getConfig().getString(SetwarpCommand.Ill[SetwarpCommand.lll[5]]);
    }
    
    private static String lllIl(final String IIIIIIIIlllllll, final String lIIIIIIIlllllll) {
        try {
            final SecretKeySpec lIlIIIIIlllllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIIIIIIIlllllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher IIlIIIIIlllllll = Cipher.getInstance("Blowfish");
            IIlIIIIIlllllll.init(SetwarpCommand.lll[2], lIlIIIIIlllllll);
            return new String(IIlIIIIIlllllll.doFinal(Base64.getDecoder().decode(IIIIIIIIlllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llIIIIIIlllllll) {
            llIIIIIIlllllll.printStackTrace();
            return null;
        }
    }
    
    private static void lIIll() {
        (lll = new int[8])[0] = (" ".length() & (" ".length() ^ -" ".length()));
        SetwarpCommand.lll[1] = " ".length();
        SetwarpCommand.lll[2] = "  ".length();
        SetwarpCommand.lll[3] = "   ".length();
        SetwarpCommand.lll[4] = (0x42 ^ 0x46);
        SetwarpCommand.lll[5] = (0x1C ^ 0x19);
        SetwarpCommand.lll[6] = (0x36 ^ 0x30);
        SetwarpCommand.lll[7] = (0x94 ^ 0x9C);
    }
    
    private static String IllIl(String IlIIlIIIlllllll, final String lIIIlIIIlllllll) {
        IlIIlIIIlllllll = new String(Base64.getDecoder().decode(IlIIlIIIlllllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lIlIlIIIlllllll = new StringBuilder();
        final char[] IIlIlIIIlllllll = lIIIlIIIlllllll.toCharArray();
        int llIIlIIIlllllll = SetwarpCommand.lll[0];
        final int lIllIIIIlllllll = (Object)IlIIlIIIlllllll.toCharArray();
        final int IIllIIIIlllllll = lIllIIIIlllllll.length;
        float llIlIIIIlllllll = SetwarpCommand.lll[0];
        while (IIlll((int)llIlIIIIlllllll, IIllIIIIlllllll)) {
            final char IIIllIIIlllllll = lIllIIIIlllllll[llIlIIIIlllllll];
            lIlIlIIIlllllll.append((char)(IIIllIIIlllllll ^ IIlIlIIIlllllll[llIIlIIIlllllll % IIlIlIIIlllllll.length]));
            "".length();
            ++llIIlIIIlllllll;
            ++llIlIIIIlllllll;
            "".length();
            if ((74 + 68 - 114 + 137 ^ 88 + 23 + 9 + 41) <= "  ".length()) {
                return null;
            }
        }
        return String.valueOf(lIlIlIIIlllllll);
    }
    
    public boolean onCommand(final CommandSender IIlIIlIIlllllll, final Command lllIIlIIlllllll, final String IllIIlIIlllllll, final String[] llIIIlIIlllllll) {
        if (IlIll(IIlIIlIIlllllll.hasPermission(SetwarpCommand.Ill[SetwarpCommand.lll[0]]) ? 1 : 0)) {
            IIlIIlIIlllllll.sendMessage(ChatUtil.fixColor(String.valueOf(new StringBuilder().append(API.PREFIX).append(SetwarpCommand.Ill[SetwarpCommand.lll[1]]).append(API.NO_PERM))));
            return SetwarpCommand.lll[0] != 0;
        }
        if (llIll((IIlIIlIIlllllll instanceof Player) ? 1 : 0)) {
            if (IIlll(llIIIlIIlllllll.length, SetwarpCommand.lll[1])) {
                IIlIIlIIlllllll.sendMessage(ChatUtil.fixColor(String.valueOf(new StringBuilder().append(API.PREFIX).append(SetwarpCommand.Ill[SetwarpCommand.lll[2]]).append(SetwarpCommand.COMMAND_USAGE))));
                return SetwarpCommand.lll[0] != 0;
            }
            if (lIlll(llIIIlIIlllllll.length, SetwarpCommand.lll[1])) {
                final String IlIlIlIIlllllll = llIIIlIIlllllll[SetwarpCommand.lll[0]];
                API.setWarp((Player)IIlIIlIIlllllll, IlIlIlIIlllllll);
                return SetwarpCommand.lll[0] != 0;
            }
            IIlIIlIIlllllll.sendMessage(ChatUtil.fixColor(String.valueOf(new StringBuilder().append(API.PREFIX).append(SetwarpCommand.Ill[SetwarpCommand.lll[3]]).append(API.WRONG_ARGS))));
            "".length();
            if ("  ".length() != "  ".length()) {
                return ((205 + 101 - 262 + 184 ^ 70 + 37 - 91 + 116) & (30 + 117 - 137 + 154 ^ 99 + 2 - 51 + 146 ^ -" ".length())) != 0x0;
            }
        }
        else {
            IIlIIlIIlllllll.sendMessage(String.valueOf(new StringBuilder().append(ChatColor.DARK_RED).append(SetwarpCommand.Ill[SetwarpCommand.lll[4]])));
        }
        return SetwarpCommand.lll[0] != 0;
    }
    
    private static void IIIll() {
        (Ill = new String[SetwarpCommand.lll[6]])[SetwarpCommand.lll[0]] = lIlIl("1oa429y1maXtvI0BB743uXHyXGIt/qCX", "uAGex");
        SetwarpCommand.Ill[SetwarpCommand.lll[1]] = lIlIl("IoGYjZZ2uJk=", "KKyYe");
        SetwarpCommand.Ill[SetwarpCommand.lll[2]] = IllIl("Vw==", "wNZBe");
        SetwarpCommand.Ill[SetwarpCommand.lll[3]] = IllIl("UA==", "ptUiq");
        SetwarpCommand.Ill[SetwarpCommand.lll[4]] = IllIl("BycfWig8LxAUJypiGxMmcy8aAC0yYgAAOiQjFlo0cykaFDA8Lhxb", "SBuzC");
        SetwarpCommand.Ill[SetwarpCommand.lll[5]] = lllIl("Uriyp91KCAqTrMbZgPVmXgi+FzV8dqob", "mlEfH");
    }
    
    private static boolean lIlll(final int lIllIlllIllllll, final int IIllIlllIllllll) {
        return lIllIlllIllllll == IIllIlllIllllll;
    }
}
