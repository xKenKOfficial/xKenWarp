package x.KenKOfficial.Warp.Commands;

import java.util.Iterator;
import java.util.List;
import org.bukkit.ChatColor;
import org.bukkit.plugin.Plugin;
import org.bukkit.Bukkit;
import java.util.Arrays;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.scheduler.BukkitRunnable;
import x.KenKOfficial.Warp.Utils.ChatUtil;
import x.KenKOfficial.Warp.Apis.API;
import org.bukkit.entity.Player;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import x.KenKOfficial.Warp.Basic.Main;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import org.bukkit.command.CommandExecutor;

public class WarpCommand implements CommandExecutor
{
    private static final /* synthetic */ String WARP_TIMER_MESSAGE;
    private static final /* synthetic */ String WARP_TELEPORT_CANCEL;
    private static final /* synthetic */ String NOT_FIND_WARP;
    private static final /* synthetic */ String[] IlIl;
    private static final /* synthetic */ String WARP_TELEPORT_WARP;
    private static final /* synthetic */ int[] llIl;
    
    private static String IllIIl(final String lIIlllIIIllllll, final String IIIlllIIIllllll) {
        try {
            final SecretKeySpec IIllllIIIllllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(IIIlllIIIllllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llIlllIIIllllll = Cipher.getInstance("Blowfish");
            llIlllIIIllllll.init(WarpCommand.llIl[2], IIllllIIIllllll);
            return new String(llIlllIIIllllll.doFinal(Base64.getDecoder().decode(lIIlllIIIllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception IlIlllIIIllllll) {
            IlIlllIIIllllll.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIllIl(final int lIIIllIIIllllll, final int IIIIllIIIllllll) {
        return lIIIllIIIllllll == IIIIllIIIllllll;
    }
    
    static {
        IlIlIl();
        lIIlIl();
        NOT_FIND_WARP = Main.getPlugin().getConfig().getString(WarpCommand.IlIl[WarpCommand.llIl[7]]);
        WARP_TELEPORT_WARP = Main.getPlugin().getConfig().getString(WarpCommand.IlIl[WarpCommand.llIl[8]]);
        WARP_TIMER_MESSAGE = Main.getPlugin().getConfig().getString(WarpCommand.IlIl[WarpCommand.llIl[9]]);
        WARP_TELEPORT_CANCEL = Main.getPlugin().getConfig().getString(WarpCommand.IlIl[WarpCommand.llIl[10]]);
    }
    
    private static boolean IIllIl(final int lIllIlIIIllllll, final int IIllIlIIIllllll) {
        return lIllIlIIIllllll < IIllIlIIIllllll;
    }
    
    private static boolean IlllIl(final Object IlIlIlIIIllllll) {
        return IlIlIlIIIllllll == null;
    }
    
    private static void lIIlIl() {
        (IlIl = new String[WarpCommand.llIl[11]])[WarpCommand.llIl[0]] = IllIIl("rNLUWxXwj2LjnuSicN9Hhw==", "cxssG");
        WarpCommand.IlIl[WarpCommand.llIl[1]] = lllIIl("ZXx+aVUh", "CKRIs");
        WarpCommand.IlIl[WarpCommand.llIl[2]] = lllIIl("VGNQb2xUY18VPQcxDSE8EWUfMCAEPE5paFRjCg==", "tEhQR");
        WarpCommand.IlIl[WarpCommand.llIl[3]] = IIIlIl("s3suQmPLgTc=", "mjAIp");
        WarpCommand.IlIl[WarpCommand.llIl[4]] = IllIIl("an843euCeP0=", "vULcX");
        WarpCommand.IlIl[WarpCommand.llIl[5]] = lllIIl("RQ==", "eLWCI");
        WarpCommand.IlIl[WarpCommand.llIl[6]] = IIIlIl("nv1QuYSxOMWuE02E94MAxQYk5bFEsQbPNGA8uS17H8Eprkav720YtQ==", "WLOcH");
        WarpCommand.IlIl[WarpCommand.llIl[7]] = IllIIl("DUfCRKXq1ZRA0bN9LHCcTQ==", "bUGbD");
        WarpCommand.IlIl[WarpCommand.llIl[8]] = lllIIl("FQwHNg8WCBkjIA0fARknAx8F", "bmuFP");
        WarpCommand.IlIl[WarpCommand.llIl[9]] = IllIIl("8fDb/Z36QP8z5vmdJrhdvQf75GUcQiVf", "MKqGw");
        WarpCommand.IlIl[WarpCommand.llIl[10]] = lllIIl("JwohAzAkDj8WHz8ZJywMMQUwFgM=", "PkSso");
    }
    
    public boolean onCommand(final CommandSender lIIIlllIIllllll, final Command IIIIlllIIllllll, final String llllIllIIllllll, final String[] IlllIllIIllllll) {
        if (llIlIl((lIIIlllIIllllll instanceof Player) ? 1 : 0)) {
            final List<String> lIlIlllIIllllll = (List<String>)API.getDataFolder().getFile().getStringList(WarpCommand.IlIl[WarpCommand.llIl[0]]);
            final StringBuilder IIlIlllIIllllll = new StringBuilder();
            final Iterator<String> iterator = lIlIlllIIllllll.iterator();
            while (llIlIl(iterator.hasNext() ? 1 : 0)) {
                final String IIIllllIIllllll = iterator.next();
                IIlIlllIIllllll.append(IIIllllIIllllll).append(WarpCommand.IlIl[WarpCommand.llIl[1]]);
                "".length();
                "".length();
                if (((210 + 122 - 284 + 184 ^ 125 + 125 - 188 + 104) & (0xF5 ^ 0xBB ^ ((0xB5 ^ 0x8B) & ~(0x96 ^ 0xA8)) ^ -" ".length())) != 0x0) {
                    return ((0xF6 ^ 0xC0 ^ (0xFD ^ 0x88)) & (0xAC ^ 0xA3 ^ (0x2C ^ 0x60) ^ -" ".length())) != 0x0;
                }
            }
            final String llIIlllIIllllll = String.valueOf(IIlIlllIIllllll);
            if (IIllIl(IlllIllIIllllll.length, WarpCommand.llIl[1])) {
                lIIIlllIIllllll.sendMessage(ChatUtil.fixColor(String.valueOf(new StringBuilder().append(API.PREFIX).append(WarpCommand.IlIl[WarpCommand.llIl[2]]).append(llIIlllIIllllll))));
                return WarpCommand.llIl[0] != 0;
            }
            if (lIllIl(IlllIllIIllllll.length, WarpCommand.llIl[1])) {
                final String lllIlllIIllllll = IlllIllIIllllll[WarpCommand.llIl[0]];
                final Player IllIlllIIllllll = (Player)lIIIlllIIllllll;
                if (IlllIl(API.getDataFolder().getFile().getString(String.valueOf(new StringBuilder().append(WarpCommand.IlIl[WarpCommand.llIl[3]]).append(lllIlllIIllllll))))) {
                    lIIIlllIIllllll.sendMessage(ChatUtil.fixColor(String.valueOf(new StringBuilder().append(API.PREFIX).append(WarpCommand.IlIl[WarpCommand.llIl[4]]).append(WarpCommand.NOT_FIND_WARP))));
                    "".length();
                    if (((0x12 ^ 0xD) & ~(0x46 ^ 0x59)) <= -" ".length()) {
                        return ((0x8E ^ 0xB0) & ~(0x31 ^ 0xF)) != 0x0;
                    }
                }
                else {
                    new BukkitRunnable() {
                        private static final /* synthetic */ String[] IIIl;
                        /* synthetic */ double z = IllIlllIIllllll.getLocation().getZ();
                        /* synthetic */ double x = IllIlllIIllllll.getLocation().getX();
                        private static final /* synthetic */ int[] lIIl;
                        /* synthetic */ double y = IllIlllIIllllll.getLocation().getY();
                        /* synthetic */ int i = Main.getPlugin().getConfig().getInt(WarpCommand$1.IIIl[WarpCommand$1.lIIl[0]]);
                        /* synthetic */ World world = IllIlllIIllllll.getWorld();
                        final /* synthetic */ Location last = new Location(this.world, this.x, this.y, this.z);
                        
                        private static boolean lIlIIl(final int lllIIIIlIllllll, final int IllIIIIlIllllll) {
                            return lllIIIIlIllllll < IllIIIIlIllllll;
                        }
                        
                        private static void IlIIIl() {
                            (lIIl = new int[18])[0] = ((0x14 ^ 0x57) & ~(0x70 ^ 0x33));
                            WarpCommand$1.lIIl[1] = " ".length();
                            WarpCommand$1.lIIl[2] = "  ".length();
                            WarpCommand$1.lIIl[3] = "   ".length();
                            WarpCommand$1.lIIl[4] = (0x19 ^ 0x1D);
                            WarpCommand$1.lIIl[5] = (0x64 ^ 0x61);
                            WarpCommand$1.lIIl[6] = (0x60 ^ 0x70 ^ (0x1 ^ 0x17));
                            WarpCommand$1.lIIl[7] = (0x64 ^ 0x63);
                            WarpCommand$1.lIIl[8] = (0x4 ^ 0xC);
                            WarpCommand$1.lIIl[9] = (0xBD ^ 0xB4);
                            WarpCommand$1.lIIl[10] = (0x4D ^ 0x47);
                            WarpCommand$1.lIIl[11] = (0x94 ^ 0x98 ^ (0x6D ^ 0x6A));
                            WarpCommand$1.lIIl[12] = (69 + 47 - 12 + 55 ^ 14 + 29 + 29 + 75);
                            WarpCommand$1.lIIl[13] = (0xB9 ^ 0xB4);
                            WarpCommand$1.lIIl[14] = (0x20 ^ 0x2E);
                            WarpCommand$1.lIIl[15] = (0x34 ^ 0x3B);
                            WarpCommand$1.lIIl[16] = (0x20 ^ 0x30);
                            WarpCommand$1.lIIl[17] = (0x2B ^ 0x3A);
                        }
                        
                        private static String IIIIIl(final String IIIlllIlIllllll, final String lIlIllIlIllllll) {
                            try {
                                final SecretKeySpec llIlllIlIllllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIlIllIlIllllll.getBytes(StandardCharsets.UTF_8)), WarpCommand$1.lIIl[8]), "DES");
                                final Cipher IlIlllIlIllllll = Cipher.getInstance("DES");
                                IlIlllIlIllllll.init(WarpCommand$1.lIIl[2], llIlllIlIllllll);
                                return new String(IlIlllIlIllllll.doFinal(Base64.getDecoder().decode(IIIlllIlIllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
                            }
                            catch (Exception lIIlllIlIllllll) {
                                lIIlllIlIllllll.printStackTrace();
                                return null;
                            }
                        }
                        
                        static {
                            IlIIIl();
                            lIIIIl();
                        }
                        
                        private static String Illll(String IllIlIIlIllllll, final String IlIllIIlIllllll) {
                            IllIlIIlIllllll = new String(Base64.getDecoder().decode(IllIlIIlIllllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
                            final StringBuilder lIIllIIlIllllll = new StringBuilder();
                            final char[] IIIllIIlIllllll = IlIllIIlIllllll.toCharArray();
                            int lllIlIIlIllllll = WarpCommand$1.lIIl[0];
                            final short lIIIlIIlIllllll = (Object)IllIlIIlIllllll.toCharArray();
                            final boolean IIIIlIIlIllllll = lIIIlIIlIllllll.length != 0;
                            char llllIIIlIllllll = (char)WarpCommand$1.lIIl[0];
                            while (lIlIIl(llllIIIlIllllll, IIIIlIIlIllllll ? 1 : 0)) {
                                final char IIlllIIlIllllll = lIIIlIIlIllllll[llllIIIlIllllll];
                                lIIllIIlIllllll.append((char)(IIlllIIlIllllll ^ IIIllIIlIllllll[lllIlIIlIllllll % IIIllIIlIllllll.length]));
                                "".length();
                                ++lllIlIIlIllllll;
                                ++llllIIIlIllllll;
                                "".length();
                                if ("   ".length() < " ".length()) {
                                    return null;
                                }
                            }
                            return String.valueOf(lIIllIIlIllllll);
                        }
                        
                        private static void lIIIIl() {
                            (IIIl = new String[WarpCommand$1.lIIl[17]])[WarpCommand$1.lIIl[0]] = Illll("FTgIGA0WMBcN", "bYzhR");
                            WarpCommand$1.IIIl[WarpCommand$1.lIIl[1]] = lllll("1Em6bsL7Y1I=", "EopXN");
                            WarpCommand$1.IIIl[WarpCommand$1.lIIl[2]] = Illll("Sh4=", "dfLvT");
                            WarpCommand$1.IIIl[WarpCommand$1.lIIl[3]] = lllll("JreyIRyiNW8=", "NmCmn");
                            WarpCommand$1.IIIl[WarpCommand$1.lIIl[4]] = IIIIIl("1dIoy0rxqz4=", "bCUhg");
                            WarpCommand$1.IIIl[WarpCommand$1.lIIl[5]] = lllll("lIEfkCI/HCs=", "wsnuE");
                            WarpCommand$1.IIIl[WarpCommand$1.lIIl[6]] = Illll("Qiw=", "lVdmu");
                            WarpCommand$1.IIIl[WarpCommand$1.lIIl[7]] = Illll("HBIdJxJF", "ksoWa");
                            WarpCommand$1.IIIl[WarpCommand$1.lIIl[8]] = IIIIIl("WEkbNhqUT5k=", "HZNWe");
                            WarpCommand$1.IIIl[WarpCommand$1.lIIl[9]] = lllll("9R4UfEuzOoQ=", "dpXvm");
                            WarpCommand$1.IIIl[WarpCommand$1.lIIl[10]] = Illll("eh4BMCQ8", "TnhDG");
                            WarpCommand$1.IIIl[WarpCommand$1.lIIl[11]] = Illll("MwsAGgZq", "Djrju");
                            WarpCommand$1.IIIl[WarpCommand$1.lIIl[12]] = Illll("bz0iJjol", "AJMTV");
                            WarpCommand$1.IIIl[WarpCommand$1.lIIl[13]] = Illll("Tw==", "oWhCC");
                            WarpCommand$1.IIIl[WarpCommand$1.lIIl[14]] = Illll("aw==", "KLOKX");
                            WarpCommand$1.IIIl[WarpCommand$1.lIIl[15]] = lllll("V5B7BIbPzj4JRATkF/PK7Q==", "VdaKa");
                            WarpCommand$1.IIIl[WarpCommand$1.lIIl[16]] = Illll("Rw==", "gnwCH");
                        }
                        
                        private static String lllll(final String llIlIlIlIllllll, final String IIIlIlIlIllllll) {
                            try {
                                final SecretKeySpec IlllIlIlIllllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(IIIlIlIlIllllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                                final Cipher lIllIlIlIllllll = Cipher.getInstance("Blowfish");
                                lIllIlIlIllllll.init(WarpCommand$1.lIIl[2], IlllIlIlIllllll);
                                return new String(lIllIlIlIllllll.doFinal(Base64.getDecoder().decode(llIlIlIlIllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
                            }
                            catch (Exception IIllIlIlIllllll) {
                                IIllIlIlIllllll.printStackTrace();
                                return null;
                            }
                        }
                        
                        private static boolean llIIIl(final int llIlIIIlIllllll, final int IlIlIIIlIllllll) {
                            return llIlIIIlIllllll == IlIlIIIlIllllll;
                        }
                        
                        public void run() {
                            if (llIIIl(this.i, WarpCommand$1.lIIl[1])) {
                                this.cancel();
                                final double IlIIlIllIllllll = API.getDataFolder().getFile().getDouble(String.valueOf(new StringBuilder().append(WarpCommand$1.IIIl[WarpCommand$1.lIIl[1]]).append(lllIlllIIllllll).append(WarpCommand$1.IIIl[WarpCommand$1.lIIl[2]])));
                                final double lIIIlIllIllllll = API.getDataFolder().getFile().getDouble(String.valueOf(new StringBuilder().append(WarpCommand$1.IIIl[WarpCommand$1.lIIl[3]]).append(lllIlllIIllllll).append(WarpCommand$1.IIIl[WarpCommand$1.lIIl[4]])));
                                final double IIIIlIllIllllll = API.getDataFolder().getFile().getDouble(String.valueOf(new StringBuilder().append(WarpCommand$1.IIIl[WarpCommand$1.lIIl[5]]).append(lllIlllIIllllll).append(WarpCommand$1.IIIl[WarpCommand$1.lIIl[6]])));
                                final float llllIIllIllllll = (float)API.getDataFolder().getFile().getInt(String.valueOf(new StringBuilder().append(WarpCommand$1.IIIl[WarpCommand$1.lIIl[7]]).append(lllIlllIIllllll).append(WarpCommand$1.IIIl[WarpCommand$1.lIIl[8]])));
                                final float IlllIIllIllllll = (float)API.getDataFolder().getFile().getInt(String.valueOf(new StringBuilder().append(WarpCommand$1.IIIl[WarpCommand$1.lIIl[9]]).append(lllIlllIIllllll).append(WarpCommand$1.IIIl[WarpCommand$1.lIIl[10]])));
                                final String lIllIIllIllllll = API.getDataFolder().getFile().getString(String.valueOf(new StringBuilder().append(WarpCommand$1.IIIl[WarpCommand$1.lIIl[11]]).append(lllIlllIIllllll).append(WarpCommand$1.IIIl[WarpCommand$1.lIIl[12]])));
                                IllIlllIIllllll.teleport(new Location(Bukkit.getWorld(lIllIIllIllllll), IlIIlIllIllllll, lIIIlIllIllllll, IIIIlIllIllllll, llllIIllIllllll, IlllIIllIllllll));
                                "".length();
                                IllIlllIIllllll.sendMessage(ChatUtil.fixColor(String.valueOf(new StringBuilder().append(API.PREFIX).append(WarpCommand$1.IIIl[WarpCommand$1.lIIl[13]]).append(WarpCommand.WARP_TELEPORT_WARP))));
                                "".length();
                                if (((0x36 ^ 0x41 ^ (0xFC ^ 0xA7)) & (0x6A ^ 0x27 ^ (0x2B ^ 0x4A) ^ -" ".length())) != 0x0) {
                                    return;
                                }
                            }
                            else {
                                final double IIllIIllIllllll = IllIlllIIllllll.getLocation().getX();
                                final double llIlIIllIllllll = IllIlllIIllllll.getLocation().getY();
                                final double IlIlIIllIllllll = IllIlllIIllllll.getLocation().getZ();
                                final World lIIlIIllIllllll = IllIlllIIllllll.getWorld();
                                final Location IIIlIIllIllllll = new Location(lIIlIIllIllllll, IIllIIllIllllll, llIlIIllIllllll, IlIlIIllIllllll);
                                if (IIlIIl(IIIlIIllIllllll.equals((Object)this.last) ? 1 : 0)) {
                                    this.i -= WarpCommand$1.lIIl[1];
                                    IllIlllIIllllll.sendMessage(ChatUtil.fixColor(String.valueOf(new StringBuilder().append(API.PREFIX).append(WarpCommand$1.IIIl[WarpCommand$1.lIIl[14]]).append(WarpCommand.WARP_TIMER_MESSAGE.replace(WarpCommand$1.IIIl[WarpCommand$1.lIIl[15]], String.valueOf(this.i))))));
                                    "".length();
                                    if (-"   ".length() > 0) {
                                        return;
                                    }
                                }
                                else {
                                    this.cancel();
                                    IllIlllIIllllll.sendMessage(ChatUtil.fixColor(String.valueOf(new StringBuilder().append(API.PREFIX).append(WarpCommand$1.IIIl[WarpCommand$1.lIIl[16]]).append(WarpCommand.WARP_TELEPORT_CANCEL))));
                                }
                            }
                        }
                        
                        private static boolean IIlIIl(final int IIlIIIIlIllllll) {
                            return IIlIIIIlIllllll != 0;
                        }
                    }.runTaskTimer((Plugin)Main.getPlugin(), 0L, 20L);
                    "".length();
                }
                "".length();
                if (((0x6A ^ 0x78) & ~(0x57 ^ 0x45)) < 0) {
                    return ((0xCC ^ 0x9A) & ~(0xCD ^ 0x9B)) != 0x0;
                }
            }
            else {
                lIIIlllIIllllll.sendMessage(ChatUtil.fixColor(String.valueOf(new StringBuilder().append(API.PREFIX).append(WarpCommand.IlIl[WarpCommand.llIl[5]]).append(API.WRONG_ARGS))));
            }
            "".length();
            if (-" ".length() >= 0) {
                return (" ".length() & ~" ".length()) != 0x0;
            }
        }
        else {
            lIIIlllIIllllll.sendMessage(String.valueOf(new StringBuilder().append(ChatColor.DARK_RED).append(WarpCommand.IlIl[WarpCommand.llIl[6]])));
        }
        return WarpCommand.llIl[0] != 0;
    }
    
    private static boolean llIlIl(final int IIIlIlIIIllllll) {
        return IIIlIlIIIllllll != 0;
    }
    
    private static void IlIlIl() {
        (llIl = new int[12])[0] = ((0x5C ^ 0x62 ^ (0xF0 ^ 0x91)) & (41 + 117 - 140 + 217 ^ 115 + 91 - 67 + 41 ^ -" ".length()));
        WarpCommand.llIl[1] = " ".length();
        WarpCommand.llIl[2] = "  ".length();
        WarpCommand.llIl[3] = "   ".length();
        WarpCommand.llIl[4] = (0x4E ^ 0x4A);
        WarpCommand.llIl[5] = (0x1B ^ 0x40 ^ (0x4F ^ 0x11));
        WarpCommand.llIl[6] = (0x8C ^ 0x8A);
        WarpCommand.llIl[7] = (0x41 ^ 0x20 ^ (0xEA ^ 0x8C));
        WarpCommand.llIl[8] = (138 + 10 - 128 + 161 ^ 94 + 97 - 157 + 155);
        WarpCommand.llIl[9] = (0x91 ^ 0x98);
        WarpCommand.llIl[10] = (1 + 19 + 135 + 14 ^ 116 + 55 - 24 + 16);
        WarpCommand.llIl[11] = (0x9F ^ 0x94);
    }
    
    private static String lllIIl(String llIllIlIIllllll, final String IlIllIlIIllllll) {
        llIllIlIIllllll = new String(Base64.getDecoder().decode(llIllIlIIllllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lIIllIlIIllllll = new StringBuilder();
        final char[] IIIllIlIIllllll = IlIllIlIIllllll.toCharArray();
        int lllIlIlIIllllll = WarpCommand.llIl[0];
        final short lIIIlIlIIllllll = (Object)llIllIlIIllllll.toCharArray();
        final int IIIIlIlIIllllll = lIIIlIlIIllllll.length;
        float llllIIlIIllllll = WarpCommand.llIl[0];
        while (IIllIl((int)llllIIlIIllllll, IIIIlIlIIllllll)) {
            final char IIlllIlIIllllll = lIIIlIlIIllllll[llllIIlIIllllll];
            lIIllIlIIllllll.append((char)(IIlllIlIIllllll ^ IIIllIlIIllllll[lllIlIlIIllllll % IIIllIlIIllllll.length]));
            "".length();
            ++lllIlIlIIllllll;
            ++llllIIlIIllllll;
            "".length();
            if (((0x52 ^ 0x56) & ~(0xC4 ^ 0xC0)) != 0x0) {
                return null;
            }
        }
        return String.valueOf(lIIllIlIIllllll);
    }
    
    private static String IIIlIl(final String IIlIIIlIIllllll, final String lIlIIIlIIllllll) {
        try {
            final SecretKeySpec lIIlIIlIIllllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIlIIIlIIllllll.getBytes(StandardCharsets.UTF_8)), WarpCommand.llIl[8]), "DES");
            final Cipher IIIlIIlIIllllll = Cipher.getInstance("DES");
            IIIlIIlIIllllll.init(WarpCommand.llIl[2], lIIlIIlIIllllll);
            return new String(IIIlIIlIIllllll.doFinal(Base64.getDecoder().decode(IIlIIIlIIllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllIIIlIIllllll) {
            lllIIIlIIllllll.printStackTrace();
            return null;
        }
    }
}
