package x.KenKOfficial.Warp.Commands;

import x.KenKOfficial.Warp.Basic.Main;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import x.KenKOfficial.Warp.Utils.ChatUtil;
import x.KenKOfficial.Warp.Apis.API;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.CommandExecutor;

public class DelwarpCommand implements CommandExecutor
{
    private static final /* synthetic */ String[] I;
    private static final /* synthetic */ int[] ll;
    private static final /* synthetic */ String COMMAND_USAGE;
    
    private static void lIIl() {
        (I = new String[DelwarpCommand.ll[6]])[DelwarpCommand.ll[0]] = I("PxEiPyMmCDd/NSMXLj96Ix8rJjU1Cg==", "GzGQT");
        DelwarpCommand.I[DelwarpCommand.ll[1]] = Il("djrlFF5wv7Q=", "UbrDi");
        DelwarpCommand.I[DelwarpCommand.ll[2]] = I("SA==", "hAQHm");
        DelwarpCommand.I[DelwarpCommand.ll[3]] = I("Vg==", "viKFG");
        DelwarpCommand.I[DelwarpCommand.ll[4]] = IIIl("JXylhSL+C7DhpW9VGWp/JneD6Fs3iY3cGkXG/IrWxZGTmOZTJLpVVQ==", "kQWKs");
        DelwarpCommand.I[DelwarpCommand.ll[5]] = IIIl("OgcUoxoCSx4rKbh3Mv5r7mnUasV2cNxL", "GbWza");
    }
    
    public boolean onCommand(final CommandSender lIIIllIllllllll, final Command IIIIllIllllllll, final String llllIlIllllllll, final String[] IIllIlIllllllll) {
        if (llIl(lIIIllIllllllll.hasPermission(DelwarpCommand.I[DelwarpCommand.ll[0]]) ? 1 : 0)) {
            lIIIllIllllllll.sendMessage(ChatUtil.fixColor(String.valueOf(new StringBuilder().append(API.PREFIX).append(DelwarpCommand.I[DelwarpCommand.ll[1]]).append(API.NO_PERM))));
            return DelwarpCommand.ll[0] != 0;
        }
        if (IIll((lIIIllIllllllll instanceof Player) ? 1 : 0)) {
            if (lIll(IIllIlIllllllll.length, DelwarpCommand.ll[1])) {
                lIIIllIllllllll.sendMessage(ChatUtil.fixColor(String.valueOf(new StringBuilder().append(API.PREFIX).append(DelwarpCommand.I[DelwarpCommand.ll[2]]).append(DelwarpCommand.COMMAND_USAGE))));
                return DelwarpCommand.ll[0] != 0;
            }
            if (Illl(IIllIlIllllllll.length, DelwarpCommand.ll[1])) {
                final String llIIllIllllllll = IIllIlIllllllll[DelwarpCommand.ll[0]];
                API.delWarp((Player)lIIIllIllllllll, llIIllIllllllll);
                return DelwarpCommand.ll[0] != 0;
            }
            lIIIllIllllllll.sendMessage(ChatUtil.fixColor(String.valueOf(new StringBuilder().append(API.PREFIX).append(DelwarpCommand.I[DelwarpCommand.ll[3]]).append(API.WRONG_ARGS))));
            "".length();
            if (" ".length() >= (0x3E ^ 0x3A)) {
                return ((0x73 ^ 0x42) & ~(0x4 ^ 0x35)) != 0x0;
            }
        }
        else {
            lIIIllIllllllll.sendMessage(String.valueOf(new StringBuilder().append(ChatColor.DARK_RED).append(DelwarpCommand.I[DelwarpCommand.ll[4]])));
        }
        return DelwarpCommand.ll[0] != 0;
    }
    
    private static boolean Illl(final int IllIlllIlllllll, final int lIlIlllIlllllll) {
        return IllIlllIlllllll == lIlIlllIlllllll;
    }
    
    private static String Il(final String IllllllIlllllll, final String lIlllllIlllllll) {
        try {
            final SecretKeySpec lIIIIIIllllllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIlllllIlllllll.getBytes(StandardCharsets.UTF_8)), DelwarpCommand.ll[7]), "DES");
            final Cipher IIIIIIIllllllll = Cipher.getInstance("DES");
            IIIIIIIllllllll.init(DelwarpCommand.ll[2], lIIIIIIllllllll);
            return new String(IIIIIIIllllllll.doFinal(Base64.getDecoder().decode(IllllllIlllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllIlllllll) {
            lllllllIlllllll.printStackTrace();
            return null;
        }
    }
    
    private static boolean llIl(final int lIllIllIlllllll) {
        return lIllIllIlllllll == 0;
    }
    
    private static boolean lIll(final int IlIIlllIlllllll, final int lIIIlllIlllllll) {
        return IlIIlllIlllllll < lIIIlllIlllllll;
    }
    
    private static String IIIl(final String llIIIlIllllllll, final String IlIIIlIllllllll) {
        try {
            final SecretKeySpec IllIIlIllllllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(IlIIIlIllllllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lIlIIlIllllllll = Cipher.getInstance("Blowfish");
            lIlIIlIllllllll.init(DelwarpCommand.ll[2], IllIIlIllllllll);
            return new String(lIlIIlIllllllll.doFinal(Base64.getDecoder().decode(llIIIlIllllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception IIlIIlIllllllll) {
            IIlIIlIllllllll.printStackTrace();
            return null;
        }
    }
    
    private static boolean IIll(final int llllIllIlllllll) {
        return llllIllIlllllll != 0;
    }
    
    private static String I(String IlllIIIllllllll, final String lIllIIIllllllll) {
        IlllIIIllllllll = (float)new String(Base64.getDecoder().decode(((String)IlllIIIllllllll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lIIIlIIllllllll = new StringBuilder();
        final char[] IIIIlIIllllllll = lIllIIIllllllll.toCharArray();
        int llllIIIllllllll = DelwarpCommand.ll[0];
        final double lIIlIIIllllllll = (Object)((String)IlllIIIllllllll).toCharArray();
        final boolean IIIlIIIllllllll = lIIlIIIllllllll.length != 0;
        double lllIIIIllllllll = DelwarpCommand.ll[0];
        while (lIll((int)lllIIIIllllllll, IIIlIIIllllllll ? 1 : 0)) {
            final char IIlIlIIllllllll = lIIlIIIllllllll[lllIIIIllllllll];
            lIIIlIIllllllll.append((char)(IIlIlIIllllllll ^ IIIIlIIllllllll[llllIIIllllllll % IIIIlIIllllllll.length]));
            "".length();
            ++llllIIIllllllll;
            ++lllIIIIllllllll;
            "".length();
            if (null != null) {
                return null;
            }
        }
        return String.valueOf(lIIIlIIllllllll);
    }
    
    private static void IlIl() {
        (ll = new int[8])[0] = ((0x66 ^ 0x71) & ~(0x34 ^ 0x23));
        DelwarpCommand.ll[1] = " ".length();
        DelwarpCommand.ll[2] = "  ".length();
        DelwarpCommand.ll[3] = "   ".length();
        DelwarpCommand.ll[4] = (0x7 ^ 0x3);
        DelwarpCommand.ll[5] = (0x41 ^ 0x44);
        DelwarpCommand.ll[6] = (0x2F ^ 0x45 ^ (0x6F ^ 0x3));
        DelwarpCommand.ll[7] = (0x1 ^ 0x5F ^ (0x5C ^ 0xA));
    }
    
    static {
        IlIl();
        lIIl();
        COMMAND_USAGE = Main.getPlugin().getConfig().getString(DelwarpCommand.I[DelwarpCommand.ll[5]]);
    }
}
