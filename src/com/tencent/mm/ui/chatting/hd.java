package com.tencent.mm.ui.chatting;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ResolveInfo;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.text.ClipboardManager;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.Display;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnCreateContextMenuListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewStub;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.AnimationUtils;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.mm.a.j;
import com.tencent.mm.ak.q;
import com.tencent.mm.c.a.bh;
import com.tencent.mm.c.a.fd;
import com.tencent.mm.c.a.fg;
import com.tencent.mm.c.a.gt;
import com.tencent.mm.c.a.lz;
import com.tencent.mm.model.an;
import com.tencent.mm.model.at;
import com.tencent.mm.model.av;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.ce;
import com.tencent.mm.model.dv;
import com.tencent.mm.modelsimple.ah;
import com.tencent.mm.modelvoice.br;
import com.tencent.mm.modelvoice.bs;
import com.tencent.mm.modelvoice.cb;
import com.tencent.mm.modelvoice.w;
import com.tencent.mm.n.p;
import com.tencent.mm.o.ac;
import com.tencent.mm.pluginsdk.ae;
import com.tencent.mm.pluginsdk.aj;
import com.tencent.mm.pluginsdk.model.app.bf;
import com.tencent.mm.pluginsdk.model.app.bo;
import com.tencent.mm.pluginsdk.model.app.u;
import com.tencent.mm.pluginsdk.ui.EmojiView;
import com.tencent.mm.pluginsdk.ui.chat.ChatFooter;
import com.tencent.mm.protocal.a.wq;
import com.tencent.mm.sdk.modelmsg.WXAppExtendObject;
import com.tencent.mm.sdk.modelmsg.WXMediaMessage;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.bl;
import com.tencent.mm.sdk.platformtools.bp;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.RegionCodeDecoder;
import com.tencent.mm.storage.bk;
import com.tencent.mm.storage.cj;
import com.tencent.mm.storage.ck;
import com.tencent.mm.storage.cl;
import com.tencent.mm.ui.LauncherUI;
import com.tencent.mm.ui.MMAppMgr;
import com.tencent.mm.ui.base.MMPullDownView;
import com.tencent.mm.ui.base.TalkRoomPopupNav;
import com.tencent.mm.ui.base.ad;
import com.tencent.mm.ui.base.cn;
import com.tencent.mm.ui.base.cr;
import com.tencent.mm.ui.contact.SelectContactUI;
import com.tencent.mm.ui.dm;
import com.tencent.mm.ui.dy;
import com.tencent.mm.ui.dz;
import com.tencent.mm.ui.ev;
import com.tencent.mm.ui.tools.CropImageNewUI;
import com.tencent.mm.ui.tools.cv;
import com.tencent.mm.ui.tools.ei;
import com.tencent.mm.ui.tools.fj;
import com.tencent.mm.ui.voicetranstext.VoiceTransTextUI;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public final class hd extends dz
  implements com.tencent.mm.model.ba, com.tencent.mm.o.m, com.tencent.mm.o.n, com.tencent.mm.platformtools.t, ae, com.tencent.mm.pluginsdk.ak, com.tencent.mm.sdk.f.al, com.tencent.mm.sdk.f.as, com.tencent.mm.storage.ay, com.tencent.mm.y.aa, com.tencent.mm.y.i
{
  public static boolean jqP = false;
  public static boolean jso = false;
  private cr dWq = null;
  private final com.tencent.mm.sdk.c.g diB = new na(ne.jvv, null);
  private ei eQt;
  private ClipboardManager eTo;
  private final com.tencent.mm.sdk.f.al eYK = new ih(this);
  int ebM = -1;
  private boolean ekQ = false;
  private boolean emf = false;
  private com.tencent.mm.q.a enO;
  private int es = 0;
  private MMPullDownView ewp;
  private final com.tencent.mm.sdk.f.al ezZ = new hz(this);
  private View.OnCreateContextMenuListener fPK = new kt(this);
  private com.tencent.mm.model.ao fXP;
  private String filePath;
  protected ChatFooter fpD;
  private fj fqB = null;
  private com.tencent.mm.ui.base.cm fqj = new kr(this);
  private com.tencent.mm.ui.base.aa fqo;

  @SuppressLint({"HandlerLeak"})
  private com.tencent.mm.sdk.platformtools.cm gQj = new he(this);
  private com.tencent.mm.plugin.voicereminder.a.k gTa = new hv(this);
  private final com.tencent.mm.pluginsdk.ui.chat.ao hDo = new hs(this);
  private com.tencent.mm.sdk.c.g hzB = new ic(this);
  private boolean iJk = false;
  protected boolean iWI = false;
  private cn jmI;
  private cj jne;
  protected com.tencent.mm.storage.i jnf;
  private boolean jod = false;
  private long[] joe = null;
  protected fn joh;
  private af joi = null;
  private String jok;
  public boolean jom = false;
  protected boolean jon = false;
  private int jrH = -1;
  private View jrI;
  private TextView jrJ;
  private boolean jrK = true;
  private boolean jrL = false;
  private ViewGroup jrM;
  private long jrN = -1L;
  protected ChatFooterCustom jrO;
  private ArrayList jrP;
  private ListView jrQ;
  private ShortVideoRecorderView jrR;
  private nu jrS;
  private com.tencent.mm.ui.base.aa jrT = null;
  private boolean jrU = false;
  private com.tencent.mm.sdk.platformtools.cm jrV = new com.tencent.mm.sdk.platformtools.cm();
  private boolean jrW = false;
  private boolean jrX = false;
  private boolean jrY = true;
  private boolean jrZ = true;
  private gv jrj;
  private long jsA = 0L;
  private ChattingFooterMoreBtnBar jsB;
  private gm jsC;
  private bt jsD = null;
  private boolean jsE = false;
  private boolean jsG = true;
  private int jsI = 0;
  private ImageView jsJ;
  private RelativeLayout jsK;
  private String jsL;
  private List jsM = new LinkedList();
  private int jsN = -1;
  private com.tencent.mm.ui.bindqq.g jsO;
  private com.tencent.mm.sdk.c.g jsP = new jo(this);
  private bp jsQ = new bp(5, "msg-translate-update-worker");
  private HashMap jsR = new HashMap();
  private com.tencent.mm.sdk.c.g jsS = new km(this);
  private ox jsT = null;
  int jsU;
  private final ma jsV = new hf(this);
  private final com.tencent.mm.sdk.platformtools.ay jsW = new com.tencent.mm.sdk.platformtools.ay(new hu(this), true);
  private final com.tencent.mm.sdk.f.al jsX = new hy(this);
  private final p jsY = new ia(this);
  private com.tencent.mm.sdk.c.g jsZ = new id(this);
  private int jsa = mb.juv;
  private int jsb = 0;
  private com.tencent.mm.sdk.platformtools.ay jsc = new com.tencent.mm.sdk.platformtools.ay(new ie(this), false);
  private cv jsd = cv.bam();
  private int jse = 0;
  protected LinearLayout jsf;
  protected LinearLayout jsg;
  private com.tencent.mm.ui.base.aa jsh = null;
  private boolean jsi = false;
  public boolean jsj = false;
  protected boolean jsk = false;
  private boolean jsl = false;
  private int jsm = 0;
  private final com.tencent.mm.ui.bindqq.g jsn = null;
  protected boolean jsp = true;
  protected boolean jsq = false;
  protected Map jsr = new HashMap();
  private View jss;
  private boolean jst = false;
  private boolean jsu = false;
  private boolean jsv = false;
  private TextView jsw;
  private ListView jsx;
  private View jsy;
  private boolean jsz = false;
  private final com.tencent.mm.sdk.f.al jta = new if(this);
  private final com.tencent.mm.sdk.f.al jtb = new ig(this);
  private final com.tencent.mm.sdk.f.al jtc = new ii(this);
  pj jtd = new pj(this);
  pm jte = new pm(this);

  @SuppressLint({"HandlerLeak"})
  private com.tencent.mm.sdk.platformtools.cm jtf = new ij(this);
  private com.tencent.mm.ui.c jtg;
  private boolean jth = false;
  private Runnable jti = new in(this);
  private com.tencent.mm.plugin.exdevice.a jtj;
  private boolean jtk = false;
  private boolean jtl = false;
  private String jtm;
  private final me jtn = new me(this);
  private String jto = null;
  private MenuItem.OnMenuItemClickListener jtp = new ja(this);
  private int jtq;
  private int jtr;
  private View jts = null;
  private boolean jtt = false;
  private boolean jtu = false;
  private long jtv = 0L;
  private com.tencent.mm.c.a.ag jtw = new com.tencent.mm.c.a.ag();
  private Bitmap jtx;
  private TalkRoomPopupNav jty;
  private LinearLayout jtz;

  public hd()
  {
  }

  @SuppressLint({"ValidFragment"})
  public hd(byte paramByte)
  {
    super(true);
  }

  private static boolean Ck(String paramString)
  {
    int i = -1;
    int j;
    if ((!com.tencent.mm.model.y.di(paramString)) && (com.tencent.mm.model.y.db(paramString)) && (!com.tencent.mm.model.x.cY(paramString)))
    {
      com.tencent.mm.storage.i locali1 = bg.qW().oT().ys(paramString);
      if (locali1 == null)
        break label111;
      j = locali1.getType();
      com.tencent.mm.storage.i locali2 = bg.qW().oT().ys(locali1.jk());
      if (locali2 != null)
        i = locali2.getType();
    }
    while (true)
    {
      Object[] arrayOfObject = new Object[3];
      arrayOfObject[0] = paramString;
      arrayOfObject[1] = Integer.valueOf(j);
      arrayOfObject[2] = Integer.valueOf(i);
      z.i("!32@/B4Tb64lLpKwUcOR+EdWcmybqEj/+Vl/", "isStranger:%s type:%d etype:%d", arrayOfObject);
      return true;
      return false;
      label111: j = i;
    }
  }

  private static boolean Cl(String paramString)
  {
    return (com.tencent.mm.storage.i.yc(paramString)) || (com.tencent.mm.storage.i.ya(paramString)) || (com.tencent.mm.storage.i.xY(paramString)) || (com.tencent.mm.model.y.dx(paramString));
  }

  private int Cm(String paramString)
  {
    if ((com.tencent.mm.model.y.dn(paramString)) || (com.tencent.mm.storage.i.xY(paramString)))
      return 1;
    if (com.tencent.mm.model.y.dD(paramString))
      return 2;
    int i = getIntExtra("Chat_Mode", 0);
    Object[] arrayOfObject1 = new Object[2];
    arrayOfObject1[0] = Integer.valueOf(this.jsm);
    arrayOfObject1[1] = Integer.valueOf(i);
    z.d("!32@/B4Tb64lLpKwUcOR+EdWcmybqEj/+Vl/", "dkcm getChatMode old:%d intent:%d ", arrayOfObject1);
    if (this.jsm != 0)
      i = this.jsm;
    String str = com.tencent.mm.f.e.or().getValue("DefaultMsgType");
    if ((this.jsm == 0) && (str != null))
    {
      z.d("!32@/B4Tb64lLpKwUcOR+EdWcmybqEj/+Vl/", "config def chatmode is %s", new Object[] { str });
      i = ch.getInt(com.tencent.mm.f.e.or().getValue("DefaultMsgType"), 0);
    }
    if (i == 0)
      i = ((Integer)bg.qW().oQ().get(18, Integer.valueOf(0))).intValue();
    if (i == 0)
      i = 1;
    Object[] arrayOfObject2 = new Object[2];
    arrayOfObject2[0] = Integer.valueOf(this.jsm);
    arrayOfObject2[1] = Integer.valueOf(i);
    z.d("!32@/B4Tb64lLpKwUcOR+EdWcmybqEj/+Vl/", "dkcm getChatMode old:%d intent:%d ", arrayOfObject2);
    return i;
  }

  private void I(com.tencent.mm.storage.i parami)
  {
    if ((this.jst) || (this.jod))
      this.fpD.setVisibility(8);
    while ((parami == null) || (!parami.aIg()))
      return;
    com.tencent.mm.q.e locale;
    if (this.enO != null)
    {
      locale = this.enO.tY();
      if ((locale != null) && (locale.uk()))
      {
        z.d("!32@/B4Tb64lLpKwUcOR+EdWcmybqEj/+Vl/", "bizinfo name=" + parami.getUsername() + " is hide tool bar");
        this.fpD.setVisibility(8);
        return;
      }
      if ((!ch.jb(parami.getUsername())) && (locale != null))
        switch (locale.ut())
        {
        default:
          if (this.jrO != null)
            this.jrO.setVisibility(8);
          this.fpD.setVisibility(0);
          z.e("!32@/B4Tb64lLpKwUcOR+EdWcmybqEj/+Vl/", "bizinfo name=" + parami.getUsername() + " extInfo=" + locale);
        case 2:
        }
    }
    while (true)
    {
      this.fpD.t(true, true);
      this.fpD.dG(true);
      return;
      z.d("!32@/B4Tb64lLpKwUcOR+EdWcmybqEj/+Vl/", "bizinfo name=" + parami.getUsername() + " is show custom menu");
      qj(com.tencent.mm.i.aFy);
      this.jrO = ((ChatFooterCustom)findViewById(com.tencent.mm.i.aFA));
      this.jrO.H(this.jnf);
      try
      {
        this.jrO.DP();
        this.jrO.a(this, this.jrM, locale.uB(), parami.getUsername());
        this.jrO.a(this.hDo);
        this.jrO.a(this.jsV);
        this.fpD.a(this.hDo);
        this.jrO.setVisibility(0);
        this.fpD.setVisibility(8);
      }
      catch (IllegalArgumentException localIllegalArgumentException)
      {
        this.hDo.dK(true);
      }
    }
  }

  private static String O(Context paramContext, String paramString)
  {
    PackageManager localPackageManager = paramContext.getPackageManager();
    try
    {
      PackageInfo localPackageInfo = localPackageManager.getPackageInfo(paramString, 0);
      Intent localIntent = new Intent("android.intent.action.MAIN", null);
      localIntent.addCategory("android.intent.category.LAUNCHER");
      localIntent.setPackage(localPackageInfo.packageName);
      ResolveInfo localResolveInfo = (ResolveInfo)localPackageManager.queryIntentActivities(localIntent, 0).iterator().next();
      if (localResolveInfo != null)
      {
        String str = localResolveInfo.activityInfo.name;
        return str;
      }
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
    }
    return null;
  }

  private void a(int paramInt1, int paramInt2, int paramInt3, String paramString)
  {
    if ((paramString == null) || (paramString.equals("")) || (!com.tencent.mm.a.c.ac(paramString)))
    {
      z.d("!32@/B4Tb64lLpKwUcOR+EdWcmybqEj/+Vl/", " doSendImage : filePath is null or empty");
      return;
    }
    if ((this.jne != null) && (!this.jne.aJt()))
    {
      Activity localActivity = agh();
      if (this.jne.aKG().zW("").equalsIgnoreCase("@t.qq.com"));
      int i;
      Object[] arrayOfObject;
      for (String str = getString(com.tencent.mm.n.bLg); ; str = getString(i, arrayOfObject))
      {
        com.tencent.mm.ui.base.e.o(localActivity, str, getString(com.tencent.mm.n.buo));
        return;
        i = com.tencent.mm.n.bLe;
        arrayOfObject = new Object[1];
        arrayOfObject[0] = com.tencent.mm.g.a.iJ(this.jne.getName());
      }
    }
    if (aVO())
    {
      com.tencent.mm.u.c localc = new com.tencent.mm.u.c(paramInt2, zj(), this.jnf.getUsername(), paramString, paramInt3);
      bg.qX().d(localc);
      return;
    }
    com.tencent.mm.y.ag localag = new com.tencent.mm.y.ag(4, zj(), aUL(), paramString, paramInt1, null, paramInt3, "", "", true, com.tencent.mm.h.Ti);
    bg.qX().d(localag);
    a(true, true, null);
  }

  private boolean a(com.tencent.mm.storage.ar paramar, com.tencent.mm.pluginsdk.model.app.k paramk)
  {
    int i = 0;
    if ((!paramar.kt().endsWith("@qqim")) || (!paramk.field_packageName.equals("com.tencent.mobileqq")))
      return false;
    z.d("!32@/B4Tb64lLpKwUcOR+EdWcmybqEj/+Vl/", "jacks open QQ");
    Intent localIntent = new Intent("android.intent.action.MAIN", null);
    localIntent.addCategory("android.intent.category.LAUNCHER");
    localIntent.addFlags(268435456);
    localIntent.setClassName("com.tencent.mobileqq", O(agh(), "com.tencent.mobileqq"));
    localIntent.putExtra("platformId", "wechat");
    Object localObject = bg.qW().oQ().get(9);
    if ((localObject != null) && ((localObject instanceof Integer)));
    for (int j = ((Integer)localObject).intValue(); ; j = 0)
    {
      if (j != 0);
      try
      {
        byte[] arrayOfByte1 = String.valueOf(j).getBytes("utf-8");
        byte[] arrayOfByte2 = "asdfghjkl;'".getBytes("utf-8");
        int k = arrayOfByte2.length;
        int i1;
        for (int m = 0; i < k; m = i1)
        {
          int n = arrayOfByte2[i];
          if (m >= arrayOfByte1.length)
            break;
          i1 = m + 1;
          arrayOfByte1[m] = ((byte)(n ^ arrayOfByte1[m]));
          i++;
        }
        localIntent.putExtra("tencent_gif", arrayOfByte1);
        try
        {
          label235: startActivity(localIntent);
          label241: return true;
        }
        catch (Exception localException)
        {
          break label241;
        }
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException)
      {
        break label235;
      }
    }
  }

  private void aRX()
  {
    if (this.joh == null)
      return;
    this.joh.notifyDataSetChanged();
  }

  private void aUy()
  {
    if (this.jmI != null)
      this.jmI.dismiss();
  }

  private void aVB()
  {
    if (!this.iWI)
      if (Ck(aUL()))
      {
        this.jtm = aUL();
        aVC();
      }
    while (true)
    {
      aVF();
      return;
      aVE();
      aVD();
      continue;
      com.tencent.mm.storage.b localb = bg.qW().oZ().xS(aUL());
      int j;
      label89: String str;
      if ((localb != null) && (localb.aHY().size() == 2))
      {
        int i = localb.aHY().size();
        j = 0;
        if (j < i)
        {
          str = (String)localb.aHY().get(j);
          if (!Ck(str));
        }
      }
      while (true)
      {
        this.jtm = str;
        if ((ch.jb(this.jtm)) || (!this.jrL))
          break label157;
        aVC();
        break;
        j++;
        break label89;
        str = null;
      }
      label157: aVE();
    }
  }

  private void aVC()
  {
    aVE();
    if (this.jsg == null)
    {
      qj(com.tencent.mm.i.aVF);
      this.jsg = ((LinearLayout)findViewById(com.tencent.mm.i.atQ));
    }
    this.jsg.setVisibility(0);
    LinearLayout localLinearLayout = (LinearLayout)h().getLayoutInflater().inflate(com.tencent.mm.k.bde, null);
    ImageView localImageView = (ImageView)localLinearLayout.findViewById(com.tencent.mm.i.aey);
    Bitmap localBitmap = com.tencent.mm.n.c.a(this.jtm, false, -1);
    if (localBitmap == null)
      localImageView.setImageResource(com.tencent.mm.h.Ut);
    while (true)
    {
      localImageView.setOnClickListener(new jk(this));
      ((Button)localLinearLayout.findViewById(com.tencent.mm.i.akM)).setOnClickListener(new jl(this, localLinearLayout));
      com.tencent.mm.plugin.f.c.n localn = com.tencent.mm.plugin.f.c.n.fTF;
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = this.jtm;
      arrayOfObject[1] = Integer.valueOf(1);
      localn.d(11004, arrayOfObject);
      this.jsg.addView(localLinearLayout, new ViewGroup.LayoutParams(-1, -2));
      return;
      localImageView.setImageBitmap(localBitmap);
    }
  }

  private void aVD()
  {
    if ((this.iWI) || (this.jsf == null))
      return;
    aVE();
    Activity localActivity = agh();
    int i = com.tencent.mm.ui.b.i.iWw;
    Object[] arrayOfObject1 = new Object[2];
    arrayOfObject1[0] = aUL();
    arrayOfObject1[1] = aVW();
    com.tencent.mm.pluginsdk.ui.a.a locala = com.tencent.mm.ui.b.g.a(localActivity, i, arrayOfObject1);
    if ((locala != null) && (locala.getView() != null))
    {
      this.jsf.addView(locala.getView(), new ViewGroup.LayoutParams(-1, -2));
      this.jsf.setVisibility(0);
    }
    com.tencent.mm.plugin.f.c.n localn = com.tencent.mm.plugin.f.c.n.fTF;
    Object[] arrayOfObject2 = new Object[3];
    arrayOfObject2[0] = aUL();
    arrayOfObject2[1] = Integer.valueOf(1);
    arrayOfObject2[2] = Integer.valueOf(0);
    localn.d(11003, arrayOfObject2);
  }

  private void aVE()
  {
    if (this.jsf != null)
      this.jsf.removeAllViews();
    if (this.jsg != null)
    {
      this.jsg.setVisibility(8);
      this.jsg.removeAllViews();
    }
  }

  private void aVF()
  {
    aVG();
    ViewGroup localViewGroup = (ViewGroup)findViewById(com.tencent.mm.i.alm);
    Activity localActivity = agh();
    int i = com.tencent.mm.ui.b.i.iWx;
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = aUL();
    arrayOfObject[1] = aVW();
    arrayOfObject[2] = Boolean.valueOf(this.iWI);
    com.tencent.mm.pluginsdk.ui.a.a locala = com.tencent.mm.ui.b.g.a(localActivity, i, arrayOfObject);
    if ((localViewGroup != null) && (locala != null) && (locala.getView() != null) && (this.jts == null))
    {
      this.jts = locala.getView();
      localViewGroup.addView(this.jts, new ViewGroup.LayoutParams(-1, -2));
    }
  }

  private void aVG()
  {
    ViewGroup localViewGroup = (ViewGroup)findViewById(com.tencent.mm.i.alm);
    if ((localViewGroup != null) && (this.jts != null))
    {
      localViewGroup.removeView(this.jts);
      this.jts = null;
    }
  }

  private boolean aVL()
  {
    if ((this.jsC != null) && (this.jsC.aVg()))
    {
      if (this.jsE)
      {
        aVI();
        this.jsC.aVh();
      }
      while (true)
      {
        return true;
        this.jsC.aVe();
      }
    }
    return false;
  }

  private boolean aVO()
  {
    return (this.jnf.getUsername().equals("medianote")) && ((0x4000 & com.tencent.mm.model.x.pK()) == 0);
  }

  private void aVQ()
  {
    com.tencent.mm.storage.r localr = bg.qW().oW().yE(this.jnf.getUsername());
    this.jrI = findViewById(com.tencent.mm.i.brQ);
    if ((localr != null) && (((!Cl(this.jnf.getUsername())) && (!com.tencent.mm.model.y.dO(this.jnf.getUsername())) && (!com.tencent.mm.model.y.dj(this.jnf.getUsername())) && (!com.tencent.mm.model.y.dK(this.jnf.getUsername())) && (!com.tencent.mm.model.y.dl(this.jnf.getUsername()))) || (this.jom)))
    {
      this.jrH = localr.jI();
      if (this.jrH >= 10)
      {
        this.jrI.setVisibility(0);
        this.jrJ = ((TextView)findViewById(com.tencent.mm.i.brV));
        if (this.jrH > 999)
        {
          TextView localTextView2 = this.jrJ;
          String str2 = getString(com.tencent.mm.n.cCJ);
          Object[] arrayOfObject2 = new Object[1];
          arrayOfObject2[0] = Integer.valueOf(999);
          localTextView2.setText(String.format(str2, arrayOfObject2));
        }
        while (true)
        {
          int i = bg.qW().oV().zF(this.jnf.getUsername()) - this.jrH;
          this.jrI.setOnClickListener(new ko(this, i));
          this.jrI.post(new kp(this));
          return;
          TextView localTextView1 = this.jrJ;
          String str1 = getString(com.tencent.mm.n.cCJ);
          Object[] arrayOfObject1 = new Object[1];
          arrayOfObject1[0] = Integer.valueOf(this.jrH);
          localTextView1.setText(String.format(str1, arrayOfObject1));
        }
      }
    }
    this.jrI.setVisibility(8);
  }

  private void aVR()
  {
    if (this.jrI == null)
      return;
    this.jrH = -1;
    if (this.jrI.getVisibility() == 0)
    {
      TranslateAnimation localTranslateAnimation = new TranslateAnimation(0.0F, this.jrI.getWidth(), 0.0F, 0.0F);
      localTranslateAnimation.setDuration(300L);
      localTranslateAnimation.setInterpolator(AnimationUtils.loadInterpolator(agh(), 17432581));
      this.jrI.startAnimation(localTranslateAnimation);
    }
    this.jrI.setVisibility(8);
  }

  public static hd aVo()
  {
    return new hd();
  }

  private void aVp()
  {
    if (this.es != 0)
      return;
    this.jrQ.postDelayed(new ip(this), 100L);
  }

  private void aVr()
  {
    ((ActionBarActivity)h()).aM().setCustomView(com.tencent.mm.k.bay);
    this.jtg = new com.tencent.mm.ui.c(((ActionBarActivity)h()).aM().getCustomView());
    this.jtg.eq(false);
    ActionBar localActionBar = ((ActionBarActivity)h()).aM();
    localActionBar.setDisplayOptions(0xFFFFFFF7 & (0xFFFFFFFD & (0xFFFFFFFB & (0x10 | localActionBar.getDisplayOptions()))));
    this.jsM.clear();
    this.jsM.add(getStringExtra("Chat_User"));
    a(this.jtp);
  }

  private void aVs()
  {
    if (this.jnf == null)
      z.e("!32@/B4Tb64lLpKwUcOR+EdWcmybqEj/+Vl/", "getChatroomMemberDetail() talker == null");
    while (!com.tencent.mm.model.y.dc(this.jnf.getUsername()))
      return;
    z.d("!32@/B4Tb64lLpKwUcOR+EdWcmybqEj/+Vl/", "cpan[changeTalker]");
    new com.tencent.mm.sdk.platformtools.cm().postDelayed(new il(this), 1000L);
  }

  private void aVt()
  {
    aVr();
    fg localfg = new fg();
    localfg.cKA.cKC = 0;
    localfg.cKA.cKD = com.tencent.mm.sdk.platformtools.y.aGW();
    String str2;
    int j;
    label105: String str1;
    label310: label452: long l;
    label823: label887: com.tencent.mm.storage.r localr2;
    if (com.tencent.mm.model.y.dc(this.jnf.getUsername()))
    {
      localfg.cKA.cKE = true;
      com.tencent.mm.sdk.c.a.aGB().g(localfg);
      if (com.tencent.mm.model.y.dc(this.jnf.getUsername()))
      {
        str2 = this.jnf.getUsername();
        if ((str2 != null) && (str2.toLowerCase().endsWith("@chatroom")))
          break label1613;
        j = 0;
        if (j != 0)
        {
          Object[] arrayOfObject4 = new Object[1];
          arrayOfObject4[0] = this.jnf.getUsername();
          z.d("!32@/B4Tb64lLpKwUcOR+EdWcmybqEj/+Vl/", "chattingui find chatroom contact need update %s", arrayOfObject4);
          at.qx().ec(this.jnf.getUsername());
        }
      }
      aVs();
      if ((com.tencent.mm.pluginsdk.g.axZ() != null) && (!this.jnf.getUsername().equals(com.tencent.mm.pluginsdk.g.axZ().We())))
      {
        Object[] arrayOfObject3 = new Object[1];
        arrayOfObject3[0] = com.tencent.mm.pluginsdk.g.axZ().We();
        z.i("!32@/B4Tb64lLpKwUcOR+EdWcmybqEj/+Vl/", "chatting oncreate end track %s", arrayOfObject3);
        bh localbh = new bh();
        localbh.cIk.username = this.jnf.getUsername();
        com.tencent.mm.sdk.c.a.aGB().g(localbh);
      }
      com.tencent.mm.storage.r localr1 = bg.qW().oW().yE(this.jnf.getUsername());
      h(localr1);
      if (this.joi != null)
        break label1682;
      this.joi = new af(this, this.jnf.getUsername());
      com.tencent.mm.modelvoice.bt.c(this.joi);
      com.tencent.mm.modelvoice.t.a(this.joi);
      boolean bool = ch.a((Boolean)bg.qW().oQ().get(16387), true);
      this.joi.ff(bool);
      if (this.enO != null)
      {
        com.tencent.mm.q.e locale = this.enO.tY();
        if ((locale != null) && (locale.us()))
          this.joi.aUp();
      }
      if (localr1 != null)
      {
        this.jse = localr1.jI();
        this.jsm = localr1.jJ();
      }
      Object[] arrayOfObject1 = new Object[1];
      arrayOfObject1[0] = Integer.valueOf(this.jsm);
      z.d("!32@/B4Tb64lLpKwUcOR+EdWcmybqEj/+Vl/", "dkcm init old:%d   ", arrayOfObject1);
      if (bg.qW().oJ())
        com.tencent.mm.modelsimple.aw.u(this.jok, 2);
      if (this.jon)
        break label1699;
      com.tencent.mm.plugin.a.eS(2);
      str1 = this.jok;
      if (this.fpD == null)
        this.fpD = ((ChatFooter)findViewById(com.tencent.mm.i.aFz));
      if (this.jrO != null)
      {
        this.jrO.anl();
        this.jrO.a(null);
        this.jrO.a(null);
        this.fpD.a(null);
        this.jrO.aUB();
        this.jrO.setVisibility(8);
      }
      this.fpD.setVisibility(8);
      this.fpD.aBK();
      this.fpD.aBY();
      this.fpD.setVisibility(0);
      if ((!this.jst) && (!this.jod))
        break label1731;
      this.fpD.setVisibility(8);
      I(this.jnf);
      if (this.jrR != null)
        this.jrR.bJ(this.jnf.getUsername());
      this.jrQ = ((ListView)findViewById(com.tencent.mm.i.alD));
      this.jrQ.setVisibility(0);
      this.es = 0;
      this.ewp = ((MMPullDownView)findViewById(com.tencent.mm.i.alU));
      this.ewp.aSn();
      this.ewp.a(new jz(this));
      this.ewp.a(new ka(this));
      this.ewp.eU(true);
      this.ewp.a(new kc(this));
      this.ewp.a(new kd(this));
      this.ewp.a(new ke(this));
      this.ewp.eS(true);
      this.ewp.eT(this.jod);
      this.jrQ.setOnScrollListener(new kf(this));
      if (this.joh != null)
        break label2096;
      this.joh = new fn(this, new com.tencent.mm.storage.ar(), aUL(), zj(), this.joi, this.fPK);
      this.joh.aPz();
      this.joh.c(this.gQj);
      if ((this.jod) || (this.jsu))
      {
        if ((!this.iJh) || (getArguments() != null))
          break label2118;
        l = h().getIntent().getLongExtra("msg_local_id", -1L);
        int i = this.joh.f(l, this.jsu);
        this.jrQ.post(new jg(this, l, i));
      }
      this.joh.a(new jh(this));
      if (this.jrQ.getHeaderViewsCount() <= 0)
        break label2151;
      this.jsf = ((LinearLayout)this.jrQ.findViewById(com.tencent.mm.i.aAe));
      label964: this.jsf.removeAllViews();
      aVB();
      aVQ();
      if (this.jrQ.getAdapter() == null)
      {
        this.jrQ.setAdapter(this.joh);
        z.i("!24@/B4Tb64lLpKk4tudMInS/w==", "chatHistoryList.setAdapter");
      }
      if (this.jod)
        break label2186;
      this.jrQ.setTranscriptMode(1);
      label1024: this.jrQ.setOnTouchListener(new jj(this));
      this.jrQ.setOnCreateContextMenuListener(this);
      bw localbw = new bw(this.jrQ, this.joh, this, this.fpD, this.joi, this.jok);
      this.fpD.a(localbw);
      gy localgy = new gy(agh(), this.jnf, this.jok);
      this.fpD.b(localgy);
      this.fpD.b(localgy);
      aPO();
      if (this.jst)
      {
        com.tencent.mm.plugin.f.c.n localn = com.tencent.mm.plugin.f.c.n.fTF;
        Object[] arrayOfObject2 = new Object[1];
        arrayOfObject2[0] = Integer.valueOf(1);
        localn.d(10455, arrayOfObject2);
        qj(com.tencent.mm.i.aNj);
        this.jss = findViewById(com.tencent.mm.i.aNn);
        this.jsy = findViewById(com.tencent.mm.i.aNh);
        this.jrQ.setFocusable(false);
        this.jrQ.setFocusableInTouchMode(false);
        this.jsy.setOnClickListener(new jn(this));
        if (this.jsw == null)
        {
          qj(com.tencent.mm.i.aVD);
          this.jsw = ((TextView)findViewById(com.tencent.mm.i.arB));
        }
        this.jrj = new gv(agh(), new com.tencent.mm.storage.ar(), aUL(), zj(), this.iWI);
        this.jrj.a(new jp(this));
        this.jsx = ((ListView)findViewById(com.tencent.mm.i.aNi));
        this.jsx.setAdapter(this.jrj);
        this.jsx.setOnItemClickListener(new jq(this));
        this.jsx.setOnTouchListener(new jr(this));
        this.fqB = new fj();
        this.fqB.a(new js(this));
        a(true, this.fqB);
        this.fqB.baM();
      }
      aVA();
      if (!this.iWI)
        break label2197;
      com.tencent.mm.ah.c.dDl = 1;
      label1416: aVP();
      a(this.jtp);
      if ((!com.tencent.mm.model.y.dP(aUL())) && (com.tencent.mm.model.y.dc(aUL())))
      {
        localr2 = bg.qW().oW().yE(aUL());
        if ((localr2 != null) && ((0x2 & localr2.jO()) <= 0))
          break label2221;
        z.d("!32@/B4Tb64lLpKwUcOR+EdWcmybqEj/+Vl/", "jacks ont need auto display name because : already tips");
      }
    }
    while (true)
    {
      this.jrQ.postDelayed(new im(this), 1000L);
      if ((com.tencent.mm.g.a.cv(this.jnf.getType())) && (this.jnf.aIg()))
      {
        com.tencent.mm.q.aa.va();
        com.tencent.mm.q.s.fG(aUL());
      }
      aWi();
      aWc();
      if ((this.jsz) && (this.jsD == null))
      {
        this.jsD = new bt(this, this.joh, this.fpD, this.jnf, this.iWI, this.joe);
        this.jsD.aUI();
      }
      return;
      localfg.cKA.cKE = false;
      break;
      label1613: if (!bg.qW().oZ().xW(str2))
      {
        z.d("!44@/B4Tb64lLpIELL9O96QoKOIOdFJzm+vxoPdj8s3NANo=", "state is die");
        j = 1;
        break label105;
      }
      List localList = bg.qW().oZ().xV(str2);
      if ((localList == null) || (localList.size() == 0))
      {
        j = 1;
        break label105;
      }
      j = 0;
      break label105;
      label1682: this.joi.Cc(this.jnf.getUsername());
      break label310;
      label1699: fd localfd = new fd();
      localfd.cKu.cKw = 4;
      com.tencent.mm.sdk.c.a.aGB().g(localfd);
      break label452;
      label1731: this.fpD.q(Cm(str1), false);
      this.fpD.le(str1);
      if ((!com.tencent.mm.model.y.dm(str1)) && (!com.tencent.mm.model.y.dl(str1)))
        com.tencent.mm.model.y.qn();
      while (true)
      {
        if (com.tencent.mm.storage.i.yc(str1))
        {
          this.fpD.aBZ();
          this.fpD.aCa();
          this.fpD.aCc();
          this.fpD.aBb();
          this.fpD.aBe();
        }
        if (com.tencent.mm.storage.i.ya(str1))
        {
          this.fpD.aBZ();
          this.fpD.aCa();
          this.fpD.aCc();
          this.fpD.aBb();
          this.fpD.aBe();
        }
        if (com.tencent.mm.storage.i.xY(str1))
        {
          this.fpD.aBZ();
          this.fpD.aCa();
          this.fpD.aCc();
          this.fpD.aBb();
          this.fpD.aBX();
          this.fpD.aBe();
        }
        if (com.tencent.mm.model.y.dx(str1))
        {
          this.fpD.aBZ();
          this.fpD.aCa();
          this.fpD.aCc();
          this.fpD.aBe();
        }
        if (this.jon)
        {
          this.fpD.aCc();
          this.fpD.aBZ();
          this.fpD.aCa();
          this.fpD.aCb();
          this.fpD.aBb();
          this.fpD.t(true, true);
          this.fpD.aCd();
          this.fpD.aCe();
          this.fpD.aBe();
        }
        if (com.tencent.mm.model.y.du(str1))
          this.fpD.aBZ();
        com.tencent.mm.storage.i locali = bg.qW().oT().ys(str1);
        if ((locali != null) && (locali.aIg()))
          this.fpD.aBZ();
        this.fpD.dF(com.tencent.mm.am.a.aCl());
        aVL();
        break;
        this.fpD.setVisibility(8);
      }
      label2096: this.joh.a(aUL(), this.joi, zj());
      break label823;
      label2118: if (getArguments() != null)
      {
        l = getArguments().getLong("msg_local_id", -1L);
        break label887;
      }
      l = -1L;
      break label887;
      label2151: this.jsf = ((LinearLayout)h().getLayoutInflater().inflate(com.tencent.mm.k.bdf, null));
      this.jrQ.addHeaderView(this.jsf);
      break label964;
      label2186: this.jrQ.setTranscriptMode(0);
      break label1024;
      label2197: if (this.jnf.aIg())
      {
        com.tencent.mm.ah.c.dDl = 2;
        break label1416;
      }
      com.tencent.mm.ah.c.dDl = 0;
      break label1416;
      label2221: com.tencent.mm.storage.b localb = bg.qW().oZ().xS(aUL());
      if ((localb == null) || (localb.aHY().size() < 20))
      {
        z.d("!32@/B4Tb64lLpKwUcOR+EdWcmybqEj/+Vl/", "jacks ont need auto display name because : member nums too few");
      }
      else if ((localb != null) && (!localb.aId()))
      {
        com.tencent.mm.model.v.a(aUL(), localb, true);
        bg.qX().d(new com.tencent.mm.ab.k(5));
        localr2.bw(2);
        bg.qW().oW().a(localr2, aUL());
        z.i("!32@/B4Tb64lLpKwUcOR+EdWcmybqEj/+Vl/", "Jacks Show auto Display name tips");
        com.tencent.mm.model.bw.a(aUL(), null, getString(com.tencent.mm.n.bAi), false, "", 0);
      }
    }
  }

  private void aVw()
  {
    if ((this.jsC != null) && (this.jsC.aVg()))
    {
      z.d("!32@/B4Tb64lLpKwUcOR+EdWcmybqEj/+Vl/", "trigger title icon, in show mode");
      eF(false);
      oX(8);
      oT(8);
      return;
    }
    Boolean localBoolean;
    if (((this.iWI) && (this.jnf.jv() == 0)) || (this.jnf.zW()))
    {
      oT(0);
      localBoolean = (Boolean)bg.qW().oQ().get(26);
      if (localBoolean != null)
        break label124;
      this.emf = false;
      label100: if (!this.emf)
        break label135;
    }
    label135: for (int i = 0; ; i = 8)
    {
      oX(i);
      return;
      oT(8);
      break;
      label124: this.emf = localBoolean.booleanValue();
      break label100;
    }
  }

  private void aVx()
  {
    if (this.fpD == null)
      return;
    if (this.jsa == mb.juw);
    for (boolean bool = true; ; bool = false)
    {
      this.fpD.dI(bool);
      return;
    }
  }

  private void aWa()
  {
    if (this.jtx != null)
      this.jtx.recycle();
  }

  private int aWb()
  {
    return getResources().getColor(com.tencent.mm.f.NW);
  }

  private void aWc()
  {
    if (this.joh == null)
    {
      z.e("!32@/B4Tb64lLpKwUcOR+EdWcmybqEj/+Vl/", "initBackground, adapter is not initialized properly");
      return;
    }
    com.tencent.mm.ad.a locala = com.tencent.mm.ad.s.yP().ha(this.jnf.getUsername());
    int i;
    if (locala == null)
      i = ((Integer)bg.qW().oQ().get(12311, Integer.valueOf(-2))).intValue();
    while (i == -2)
    {
      setBackgroundColor(aWb());
      if (this.joh == null)
      {
        finish();
        return;
        i = locala.yE();
      }
      else
      {
        this.joh.az(agh(), "chatting/purecolor_chat.xml");
        return;
      }
    }
    com.tencent.mm.ad.s.yO();
    int j = com.tencent.mm.ad.m.B(agh());
    int k;
    if (i == 0)
      switch (j)
      {
      default:
        k = -1;
      case 1:
      case 2:
      case 3:
      case 4:
      }
    while (k != -1)
    {
      aWa();
      try
      {
        this.jtx = BitmapFactory.decodeResource(getResources(), k);
        label186: if (this.jtx == null)
        {
          z.e("!32@/B4Tb64lLpKwUcOR+EdWcmybqEj/+Vl/", "setBackground decodeFile fail, bm is null, resId = " + k);
          setBackgroundColor(getResources().getColor(com.tencent.mm.f.NW));
          this.joh.az(agh(), "chatting/reserved_chat.xml");
          return;
          k = com.tencent.mm.h.TO;
        }
      }
      catch (IncompatibleClassChangeError localIncompatibleClassChangeError)
      {
        while (true)
        {
          z.printErrStackTrace("MicroMsg.Crash", localIncompatibleClassChangeError, "May cause dvmFindCatchBlock crash!", new Object[0]);
          throw ((IncompatibleClassChangeError)new IncompatibleClassChangeError("May cause dvmFindCatchBlock crash!").initCause(localIncompatibleClassChangeError));
          if (this.jsJ == null)
            this.jsJ = ((ImageView)findViewById(com.tencent.mm.i.alh));
          this.jsJ.setImageBitmap(this.jtx);
        }
        com.tencent.mm.ad.m localm = com.tencent.mm.ad.s.yO();
        String str1;
        if (i > 0)
        {
          String str2 = localm.F(i, 1) + "chat.xml";
          this.joh.Cj(str2);
          switch (j)
          {
          default:
            str1 = null;
          case 1:
          case 2:
          case 3:
          case 4:
          }
        }
        while (true)
        {
          aWa();
          this.jtx = com.tencent.mm.platformtools.s.jA(str1);
          if (this.jtx != null)
            break;
          z.e("!32@/B4Tb64lLpKwUcOR+EdWcmybqEj/+Vl/", "setBackground decodeFile fail, bm is null, path = " + str1);
          setBackgroundColor(aWb());
          return;
          str1 = localm.F(i, 1) + "horizontal_hdpi.jpg";
          continue;
          str1 = localm.F(i, 1) + "horizontal_ldpi.jpg";
          continue;
          str1 = localm.F(i, 1) + "vertical_hdpi.jpg";
          continue;
          str1 = localm.F(i, 1) + "vertical_ldpi.jpg";
          continue;
          this.joh.az(agh(), "chatting/default_chat.xml");
          if (locala == null)
            str1 = localm.p("default", j);
          else
            str1 = localm.p(aUL(), j);
        }
        if (this.jsJ == null)
          this.jsJ = ((ImageView)findViewById(com.tencent.mm.i.alh));
        this.jsJ.setImageBitmap(this.jtx);
        return;
      }
      catch (Throwable localThrowable)
      {
        break label186;
      }
    }
  }

  private void aWe()
  {
    if (this.jty == null)
    {
      qj(com.tencent.mm.i.aVG);
      this.jty = ((TalkRoomPopupNav)findViewById(com.tencent.mm.i.aSu));
      this.jty.a(new lu(this));
    }
  }

  private void aWg()
  {
    S("fromBanner", false);
  }

  public static boolean aWj()
  {
    return !((Boolean)bg.qW().oQ().get(75, Boolean.valueOf(false))).booleanValue();
  }

  public static void aWk()
  {
    bg.qW().oQ().set(75, Boolean.valueOf(true));
  }

  private boolean au(String paramString, int paramInt)
  {
    boolean bool = true;
    if ((paramString == null) || (paramString.length() == 0))
    {
      z.e("!32@/B4Tb64lLpKwUcOR+EdWcmybqEj/+Vl/", "doSendMessage null");
      bool = false;
    }
    do
    {
      return bool;
      this.jtn.Cq(paramString);
      this.jtw.cHJ.cHM = paramString;
      this.jtw.cHJ.context = agh();
      com.tencent.mm.sdk.c.a.aGB().g(this.jtw);
    }
    while (this.jtw.cHK.cCM);
    String str1;
    String str2;
    if (this.jne != null)
    {
      str1 = this.jne.aKG().zW("");
      if ((str1.equalsIgnoreCase("@t.qq.com")) && (!this.jne.aJt()))
        str2 = getString(com.tencent.mm.n.bLg);
    }
    while (true)
      if (str2 != null)
      {
        com.tencent.mm.ui.base.e.o(agh(), str2, getString(com.tencent.mm.n.buo));
        return false;
        if ((str1.equalsIgnoreCase("@qqim")) && ((0x40 & com.tencent.mm.model.x.pK()) == 0))
        {
          str2 = getString(com.tencent.mm.n.bLf);
        }
        else if (!this.jne.aJt())
        {
          int i = com.tencent.mm.n.bLe;
          Object[] arrayOfObject = new Object[bool];
          arrayOfObject[0] = com.tencent.mm.g.a.iJ(this.jne.getName());
          str2 = getString(i, arrayOfObject);
        }
      }
      else
      {
        this.gQj.post(new ls(this, paramString, paramInt));
        a(bool, bool, null);
        return bool;
        str2 = null;
      }
  }

  private boolean dh(long paramLong)
  {
    if (paramLong == -1L)
    {
      z.e("!32@/B4Tb64lLpKwUcOR+EdWcmybqEj/+Vl/", "doSendMessage failed  msgId " + paramLong);
      return false;
    }
    String str1;
    String str2;
    if (this.jne != null)
    {
      str1 = this.jne.aKG().zW("");
      if ((str1.equalsIgnoreCase("@t.qq.com")) && (!this.jne.aJt()))
        str2 = getString(com.tencent.mm.n.bLg);
    }
    while (true)
      if (str2 != null)
      {
        com.tencent.mm.ui.base.e.o(agh(), str2, getString(com.tencent.mm.n.buo));
        return false;
        if ((str1.equalsIgnoreCase("@qqim")) && ((0x40 & com.tencent.mm.model.x.pK()) == 0))
        {
          str2 = getString(com.tencent.mm.n.bLf);
        }
        else if (!this.jne.aJt())
        {
          int i = com.tencent.mm.n.bLe;
          Object[] arrayOfObject = new Object[1];
          arrayOfObject[0] = com.tencent.mm.g.a.iJ(this.jne.getName());
          str2 = getString(i, arrayOfObject);
        }
      }
      else
      {
        this.gQj.post(new lr(this, paramLong, 0));
        a(true, true, null);
        return true;
        str2 = null;
      }
  }

  private void fr(boolean paramBoolean)
  {
    int i = this.jrQ.getLastVisiblePosition();
    int j = -1 + this.jrQ.getCount();
    Object[] arrayOfObject = new Object[4];
    arrayOfObject[0] = Boolean.valueOf(this.jrZ);
    arrayOfObject[1] = Integer.valueOf(i);
    arrayOfObject[2] = Integer.valueOf(j);
    arrayOfObject[3] = Boolean.valueOf(paramBoolean);
    z.i("!32@/B4Tb64lLpKwUcOR+EdWcmybqEj/+Vl/", "mFirstScroll : %s, last visible/adapter=%s/%s %s", arrayOfObject);
    this.jrZ = false;
    if ((i >= j - 1) || (paramBoolean))
    {
      int k = this.joh.getCount();
      if ((k > 1) && (((com.tencent.mm.storage.ar)this.joh.getItem(k - 2)).isSystem()))
      {
        int m = j - 1;
        md.a(this.jrQ, m, 0);
      }
    }
    else
    {
      return;
    }
    md.c(this.jrQ, j);
  }

  private void fu(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      am.h(new hp(this));
      return;
    }
    ev.aZ(this.jsM);
  }

  private void goBack()
  {
    if ((com.tencent.mm.pluginsdk.g.aya() != null) && (com.tencent.mm.pluginsdk.g.aya().aw(this.jnf.getUsername(), zj())))
      com.tencent.mm.ui.base.e.a(agh(), getString(com.tencent.mm.n.cmt), getString(com.tencent.mm.n.buo), true, new kg(this), new kh(this));
    while (true)
    {
      XF();
      getWindow().setSoftInputMode(32);
      return;
      aVM();
    }
  }

  private void h(com.tencent.mm.storage.r paramr)
  {
    if ((paramr != null) && (paramr.jI() > 0))
    {
      List localList = bg.qW().oV().ah(this.jnf.getUsername(), paramr.jI());
      if (localList.size() > 0)
        this.jsA = ((com.tencent.mm.storage.ar)localList.get(0)).kn();
      ArrayList localArrayList = new ArrayList();
      Iterator localIterator = localList.iterator();
      while (localIterator.hasNext())
        localArrayList.add(((com.tencent.mm.storage.ar)localIterator.next()).getContent());
      this.jtn.a(localArrayList, false, true);
    }
    if (this.jsA == 0L)
    {
      com.tencent.mm.storage.ar localar = bg.qW().oV().zq(this.jnf.getUsername());
      if (!ch.jb(localar.kt()))
        this.jsA = localar.kn();
    }
  }

  private void k(Intent paramIntent)
  {
    com.tencent.mm.ak.a locala = new com.tencent.mm.ak.a();
    locala.a(agh(), paramIntent, new lg(this));
    Activity localActivity = agh();
    getString(com.tencent.mm.n.buo);
    this.dWq = com.tencent.mm.ui.base.e.a(localActivity, getString(com.tencent.mm.n.buA), true, new lh(this, locala));
  }

  private void n(com.tencent.mm.pluginsdk.model.app.k paramk)
  {
    if ((paramk == null) || (ch.jb(paramk.field_appId)))
    {
      z.e("!32@/B4Tb64lLpKwUcOR+EdWcmybqEj/+Vl/", "jumpServiceH5 error args");
      return;
    }
    if (ch.jb(paramk.iY()))
    {
      z.e("!32@/B4Tb64lLpKwUcOR+EdWcmybqEj/+Vl/", "ForwardUrl is null");
      return;
    }
    SharedPreferences localSharedPreferences = Bp(com.tencent.mm.sdk.platformtools.ak.aHi());
    agh();
    String str = com.tencent.mm.sdk.platformtools.y.d(localSharedPreferences);
    if (("language_default".equalsIgnoreCase(str)) && (Locale.getDefault() != null))
      str = Locale.getDefault().toString();
    com.tencent.mm.storage.b localb;
    if (com.tencent.mm.model.y.dc(aUL()))
    {
      localb = bg.qW().oZ().xS(aUL());
      if (localb == null);
    }
    for (int i = localb.aHY().size(); ; i = 1)
    {
      Intent localIntent = new Intent();
      Bundle localBundle = new Bundle();
      localBundle.putString("jsapi_args_appid", paramk.field_appId);
      localBundle.putBoolean("isFromService", true);
      localIntent.putExtra("forceHideShare", true);
      localBundle.putString("sendAppMsgToUserName", this.jnf.getUsername());
      localIntent.putExtra("jsapiargs", localBundle);
      localIntent.putExtra("show_bottom", false);
      Object[] arrayOfObject = new Object[3];
      arrayOfObject[0] = paramk.iY();
      arrayOfObject[1] = Integer.valueOf(i);
      arrayOfObject[2] = str;
      localIntent.putExtra("rawUrl", String.format("%s&wxchatmembers=%s&lang=%s", arrayOfObject));
      com.tencent.mm.am.a.b(agh(), "webview", ".ui.tools.WebViewUI", localIntent);
      return;
    }
  }

  private ViewStub qj(int paramInt)
  {
    ViewStub localViewStub = (ViewStub)findViewById(paramInt);
    if (localViewStub != null)
      localViewStub.inflate();
    return localViewStub;
  }

  private void qn(int paramInt)
  {
    if ((this.jrH < 10) || (this.jrI == null));
    FrameLayout.LayoutParams localLayoutParams;
    do
    {
      do
      {
        return;
        localLayoutParams = (FrameLayout.LayoutParams)this.jrI.getLayoutParams();
        switch (paramInt)
        {
        default:
          return;
        case -2:
        case 2:
        case 1:
        case 0:
        case -1:
        }
      }
      while ((this.jty != null) && (this.jty.getVisibility() == 0));
      localLayoutParams.setMargins(0, getResources().getDimensionPixelSize(com.tencent.mm.g.PA), 0, 0);
      return;
      localLayoutParams.setMargins(0, getResources().getDimensionPixelSize(com.tencent.mm.g.PA) + this.jtz.getHeight(), 0, 0);
      return;
      localLayoutParams.setMargins(0, getResources().getDimensionPixelSize(com.tencent.mm.g.PA) + this.jty.getHeight(), 0, 0);
      return;
      localLayoutParams.setMargins(0, getResources().getDimensionPixelSize(com.tencent.mm.g.PA), 0, 0);
      return;
    }
    while ((this.jtz != null) && (this.jtz.getVisibility() == 0));
    localLayoutParams.setMargins(0, getResources().getDimensionPixelSize(com.tencent.mm.g.PA), 0, 0);
  }

  private void sX(String paramString)
  {
    Intent localIntent = new Intent();
    localIntent.putExtra("enter_room_username", paramString);
    localIntent.setFlags(268435456);
    com.tencent.mm.am.a.b(agh(), "talkroom", ".ui.TalkRoomUI", localIntent);
  }

  private void setBackgroundColor(int paramInt)
  {
    aWa();
    if (this.jsJ == null)
    {
      View localView = findViewById(com.tencent.mm.i.ali);
      if (localView != null)
        localView.setBackgroundColor(paramInt);
      return;
    }
    this.jsJ.setImageDrawable(new ColorDrawable(paramInt));
  }

  private void u(Intent paramIntent)
  {
    if (paramIntent == null)
      z.e("!32@/B4Tb64lLpKwUcOR+EdWcmybqEj/+Vl/", "data == null");
    String str1;
    String str2;
    int i;
    do
    {
      return;
      str1 = paramIntent.getStringExtra("VideoRecorder_ToUser");
      str2 = paramIntent.getStringExtra("VideoRecorder_FileName");
      i = paramIntent.getIntExtra("VideoRecorder_VideoLength", 0);
      z.e("!32@/B4Tb64lLpKwUcOR+EdWcmybqEj/+Vl/", "fileName " + str2 + " length " + i + " user " + str1);
    }
    while ((ch.jb(str1)) || (ch.jb(str2)) || (i < 0));
    if ((str1.equals("medianote")) && ((0x4000 & com.tencent.mm.model.x.pK()) == 0))
    {
      q localq = new q();
      localq.hT(str2);
      localq.eJ(i);
      localq.setUser(str1);
      localq.hU((String)com.tencent.mm.o.f.c(2, ""));
      localq.q(ch.CL());
      localq.V(ch.CL());
      localq.eG(i);
      localq.eF(i);
      int j = com.tencent.mm.ak.r.id(com.tencent.mm.ak.m.AL().ib(str2));
      if (j <= 0)
      {
        z.e("!32@/B4Tb64lLpKT0Ff1DaNVTWjs/xAN/V6v", "get Video size failed :" + str2);
        return;
      }
      localq.cZ(j);
      String str3 = com.tencent.mm.ak.m.AL().ic(str2);
      int k = com.tencent.mm.ak.r.id(str3);
      if (k <= 0)
      {
        z.e("!32@/B4Tb64lLpKT0Ff1DaNVTWjs/xAN/V6v", "get Thumb size failed :" + str3 + " size:" + k);
        return;
      }
      localq.eI(k);
      z.d("!32@/B4Tb64lLpKT0Ff1DaNVTWjs/xAN/V6v", "init record file:" + str2 + " thumbsize:" + localq.AR() + " videosize:" + localq.sp());
      localq.setStatus(199);
      com.tencent.mm.storage.ar localar = new com.tencent.mm.storage.ar();
      localar.bJ(localq.getUser());
      localar.setType(43);
      localar.bv(1);
      localar.bK(str2);
      localar.setStatus(2);
      localar.q(com.tencent.mm.model.bw.eo(localq.getUser()));
      localq.eK((int)com.tencent.mm.model.bw.e(localar));
      com.tencent.mm.ak.m.AL().a(localq);
      return;
    }
    com.tencent.mm.ak.v.a(str2, i, str1, null);
    com.tencent.mm.ak.v.ih(str2);
    a(true, true, null);
  }

  private void v(Intent paramIntent)
  {
    if (!com.tencent.mm.network.bm.ab(agh()))
    {
      com.tencent.mm.ui.base.e.a(agh(), com.tencent.mm.n.cnT, com.tencent.mm.n.buo, new lf(this, paramIntent), null);
      return;
    }
    k(paramIntent);
  }

  private boolean xF()
  {
    if (this.jsb == 0)
    {
      this.jsb = ch.a((Integer)bg.qW().oQ().get(327681), 1);
      if (3 == this.jsb)
        this.jsb = 1;
      z.i("!32@/B4Tb64lLpKwUcOR+EdWcmybqEj/+Vl/", "autoGetImgMode: " + this.jsb);
    }
    if (2 == this.jsb)
    {
      z.d("!32@/B4Tb64lLpKwUcOR+EdWcmybqEj/+Vl/", "user don't want to get image automatically");
      return false;
    }
    boolean bool = com.tencent.mm.sdk.platformtools.bc.bP(com.tencent.mm.sdk.platformtools.ak.getContext());
    if (4 == this.jsb)
    {
      z.d("!32@/B4Tb64lLpKwUcOR+EdWcmybqEj/+Vl/", "always to download image automatically");
      return true;
    }
    if ((1 == this.jsb) && (bool))
    {
      z.d("!32@/B4Tb64lLpKwUcOR+EdWcmybqEj/+Vl/", "use wifi to download image automatically");
      return true;
    }
    z.d("!32@/B4Tb64lLpKwUcOR+EdWcmybqEj/+Vl/", "don't allow to download image automatcially");
    return false;
  }

  public final void Bt(String paramString)
  {
    int i = getResources().getDimensionPixelSize(com.tencent.mm.g.Pl);
    SpannableString localSpannableString = com.tencent.mm.ar.b.e(agh(), paramString, i);
    this.jtg.setTitle(localSpannableString);
    Bv(getString(com.tencent.mm.n.byy, new Object[] { localSpannableString }));
  }

  public final void Bu(String paramString)
  {
    z.i("!32@/B4Tb64lLpKwUcOR+EdWcmybqEj/+Vl/", "now connect state, text : %s", new Object[] { paramString });
    int i = getResources().getDimensionPixelSize(com.tencent.mm.g.Pz);
    SpannableString localSpannableString = com.tencent.mm.ar.b.e(agh(), paramString, i);
    this.jtg.u(localSpannableString);
  }

  public final boolean Cn(String paramString)
  {
    return au(paramString, 0);
  }

  public final String Co(String paramString)
  {
    if ((!TextUtils.isEmpty(paramString)) && (paramString.contains("http://weixin.qq.com/emoticonstore/")))
    {
      String str = paramString.substring(1 + paramString.lastIndexOf("/"));
      if ((com.tencent.mm.g.a.cv(this.jnf.getType())) && (this.jnf.aIg()) && (this.enO != null))
      {
        com.tencent.mm.q.e locale = this.enO.tY();
        if ((locale != null) && (!TextUtils.isEmpty(locale.uA())) && (str.contains(locale.uA())))
          return str;
      }
    }
    return null;
  }

  public final void Cp(String paramString)
  {
    Intent localIntent = new Intent();
    localIntent.putExtra("map_view_type", 6);
    localIntent.putExtra("map_sender_name", zj());
    localIntent.putExtra("map_talker_name", aUL());
    localIntent.putExtra("fromWhereShare", paramString);
    com.tencent.mm.am.a.b(agh(), "location", ".ui.RedirectUI", localIntent);
  }

  public final void O(com.tencent.mm.storage.ar paramar)
  {
    if (this.jsT != null)
    {
      this.jsT.dismiss();
      this.jsT = null;
    }
    this.jsT = new ox(agh());
    this.jsT.o(paramar.kk());
    this.jsT.hT(paramar.kp());
    this.jsT.p(this.jrQ.getHeaderViewsCount(), this.jrQ.getFirstVisiblePosition(), this.jrQ.getLastVisiblePosition());
    this.jsT.show();
  }

  public final hb P(com.tencent.mm.storage.ar paramar)
  {
    hb localhb1 = (hb)this.jsR.get(Long.valueOf(paramar.kk()));
    if (localhb1 == null)
    {
      if (!paramar.aJK())
        break label46;
      if (paramar.aJM())
        localhb1 = hb.jrB;
    }
    else
    {
      return localhb1;
    }
    return hb.jrz;
    label46: lz locallz = new lz();
    locallz.cOW.id = paramar.kk();
    com.tencent.mm.sdk.c.a.aGB().g(locallz);
    if (locallz.cOX.cOY)
    {
      hb localhb2 = hb.jrA;
      a(paramar.kk(), localhb2);
      return localhb2;
    }
    return hb.jrz;
  }

  final void Q(com.tencent.mm.storage.ar paramar)
  {
    String str1 = paramar.getContent();
    if (paramar.jK() == 0)
      str1 = at(str1, paramar.jK());
    com.tencent.mm.ai.b localb = com.tencent.mm.ai.b.iS(str1);
    com.tencent.mm.pluginsdk.model.app.k localk = com.tencent.mm.pluginsdk.model.app.l.F(localb.appId, true);
    if ((localk != null) && (u.d(agh(), localk.field_packageName)))
    {
      if (localk.field_status == 3)
        z.e("!32@/B4Tb64lLpKwUcOR+EdWcmybqEj/+Vl/", "requestAppShow fail, app is in blacklist, packageName = " + localk.field_packageName);
      do
      {
        return;
        if (!u.f(agh(), localk))
        {
          Object[] arrayOfObject1 = new Object[1];
          arrayOfObject1[0] = localk.field_appName;
          z.e("!32@/B4Tb64lLpKwUcOR+EdWcmybqEj/+Vl/", "The app %s signature is incorrect.", arrayOfObject1);
          Activity localActivity = agh();
          int i = com.tencent.mm.n.bMk;
          Object[] arrayOfObject2 = new Object[1];
          arrayOfObject2[0] = com.tencent.mm.pluginsdk.model.app.l.d(agh(), localk);
          Toast.makeText(localActivity, getString(i, arrayOfObject2), 1).show();
          return;
        }
      }
      while (a(paramar, localk));
      WXAppExtendObject localWXAppExtendObject = new WXAppExtendObject();
      localWXAppExtendObject.extInfo = localb.extInfo;
      com.tencent.mm.pluginsdk.model.app.a locala;
      if ((localb.dQY != null) && (localb.dQY.length() > 0))
      {
        locala = bf.GP().uU(localb.dQY);
        if (locala != null)
          break label352;
      }
      label352: for (String str3 = null; ; str3 = locala.field_fileFullPath)
      {
        localWXAppExtendObject.filePath = str3;
        WXMediaMessage localWXMediaMessage = new WXMediaMessage();
        localWXMediaMessage.sdkVer = 570490883;
        localWXMediaMessage.mediaObject = localWXAppExtendObject;
        localWXMediaMessage.title = localb.title;
        localWXMediaMessage.description = localb.description;
        localWXMediaMessage.messageAction = localb.messageAction;
        localWXMediaMessage.messageExt = localb.messageExt;
        localWXMediaMessage.thumbData = com.tencent.mm.a.c.a(com.tencent.mm.y.ap.yg().gR(paramar.kp()), 0, -1);
        this.jte.a(localk.field_packageName, localWXMediaMessage, localk.field_openId);
        return;
      }
    }
    String str2 = u.i(agh(), localb.appId, "message");
    Intent localIntent = new Intent();
    localIntent.putExtra("rawUrl", str2);
    com.tencent.mm.am.a.b(agh(), "webview", ".ui.tools.WebViewUI", localIntent);
  }

  final void R(com.tencent.mm.storage.ar paramar)
  {
    if (this.jsC == null)
    {
      if (this.jsB == null)
      {
        qj(com.tencent.mm.i.aVC);
        this.jsB = ((ChattingFooterMoreBtnBar)findViewById(com.tencent.mm.i.alz));
      }
      this.jsC = new gm(this, this.jsB, this.joh, this.fpD, this.jrO, this.jnf, this.iWI);
    }
    while (true)
    {
      this.jsC.L(paramar);
      this.jsC.fl(this.jsv);
      if (this.jnf.aIg())
        oS(com.tencent.mm.i.aDT);
      aVR();
      return;
      this.jsC.b(this.jnf, this.iWI);
    }
  }

  final void S(com.tencent.mm.storage.ar paramar)
  {
    if (paramar.kk() == this.joi.aUu())
      this.joi.fh(true);
    if (!this.jnf.getUsername().equals("medianote"))
      bg.qW().oS().a(new bk(paramar.kt(), paramar.kl()));
    if (com.tencent.mm.model.y.dD(this.jnf.getUsername()))
    {
      com.tencent.mm.plugin.voicereminder.a.o.eQ((int)paramar.kk());
      return;
    }
    bs.eQ((int)paramar.kk());
  }

  public final void S(String paramString, boolean paramBoolean)
  {
    if (((com.tencent.mm.pluginsdk.g.aya() != null) && (com.tencent.mm.pluginsdk.g.aya().nR(this.jnf.getUsername()))) || (paramBoolean))
    {
      LinkedList localLinkedList = com.tencent.mm.pluginsdk.g.aya().nP(this.jnf.getUsername());
      if ((localLinkedList == null) || (!localLinkedList.contains(zj())))
      {
        com.tencent.mm.plugin.f.c.n localn = com.tencent.mm.plugin.f.c.n.fTF;
        Object[] arrayOfObject = new Object[4];
        arrayOfObject[0] = Integer.valueOf(13);
        arrayOfObject[1] = Integer.valueOf(0);
        arrayOfObject[2] = Integer.valueOf(0);
        arrayOfObject[3] = Integer.valueOf(0);
        localn.d(10997, arrayOfObject);
        com.tencent.mm.ui.base.e.a(agh(), getString(com.tencent.mm.n.bFV), null, new hl(this, paramString), new hm(this));
        return;
      }
    }
    Cp(paramString);
  }

  final void T(com.tencent.mm.storage.ar paramar)
  {
    if (!this.jnf.getUsername().equals("medianote"))
      bg.qW().oS().a(new bk(paramar.kt(), paramar.kl()));
    com.tencent.mm.y.l locall = com.tencent.mm.y.ap.yg().T(paramar.kk());
    locall.dP(0);
    com.tencent.mm.y.ap.yg().a(locall.xM(), locall);
    if (locall.xR());
    for (int i = 1; ; i = 0)
    {
      String str1 = com.tencent.mm.y.ap.yg().f(locall.xN(), "", "");
      if ((str1 != null) && (!str1.equals("")) && (com.tencent.mm.a.c.ac(str1)))
        break;
      z.d("!32@/B4Tb64lLpKwUcOR+EdWcmybqEj/+Vl/", " doSendImage : filePath is null or empty");
      return;
    }
    if ((this.jne != null) && (!this.jne.aJt()))
    {
      Activity localActivity = agh();
      if (this.jne.aKG().zW("").equalsIgnoreCase("@t.qq.com"));
      int j;
      Object[] arrayOfObject;
      for (String str2 = getString(com.tencent.mm.n.bLg); ; str2 = getString(j, arrayOfObject))
      {
        com.tencent.mm.ui.base.e.o(localActivity, str2, getString(com.tencent.mm.n.buo));
        return;
        j = com.tencent.mm.n.bLe;
        arrayOfObject = new Object[1];
        arrayOfObject[0] = com.tencent.mm.g.a.iJ(this.jne.getName());
      }
    }
    this.gQj.post(new ky(this, locall, i));
    a(true, true, null);
  }

  final void U(com.tencent.mm.storage.ar paramar)
  {
    z.d("!32@/B4Tb64lLpKwUcOR+EdWcmybqEj/+Vl/", "resendEmoji");
    if (!this.jnf.getUsername().equals("medianote"))
      bg.qW().oS().a(new bk(paramar.kt(), paramar.kl()));
    com.tencent.mm.pluginsdk.g.axR().a(this.jnf.getUsername(), null, paramar);
  }

  final void V(com.tencent.mm.storage.ar paramar)
  {
    if (!this.jnf.getUsername().equals("medianote"))
      bg.qW().oS().a(new bk(paramar.kt(), paramar.kl()));
    dh(paramar.kk());
    a(true, true, null);
  }

  final void W(com.tencent.mm.storage.ar paramar)
  {
    if (!this.jnf.getUsername().equals("medianote"))
      bg.qW().oS().a(new bk(paramar.kt(), paramar.kl()));
    dh(paramar.kk());
    a(true, true, null);
  }

  final void X(com.tencent.mm.storage.ar paramar)
  {
    z.d("!32@/B4Tb64lLpKwUcOR+EdWcmybqEj/+Vl/", "resendAppMsgEmoji");
    if (!this.jnf.getUsername().equals("medianote"))
      bg.qW().oS().a(new bk(paramar.kt(), paramar.kl()));
    com.tencent.mm.pluginsdk.model.app.a locala = bf.GP().co(paramar.kk());
    if ((locala != null) && (locala.field_msgInfoId == paramar.kk()))
    {
      locala.field_status = 101L;
      locala.field_offset = 0L;
      locala.field_lastModifyTime = (System.currentTimeMillis() / 1000L);
      bf.GP().a(locala, new String[0]);
      bf.azb().run();
    }
    while (true)
    {
      a(true, true, null);
      return;
      bf.azb();
      com.tencent.mm.pluginsdk.model.app.bb.cr(paramar.kk());
    }
  }

  public final void XF()
  {
    if (this.fpD != null)
    {
      ch.ak(this.fpD);
      return;
    }
    super.XF();
  }

  final void Y(com.tencent.mm.storage.ar paramar)
  {
    String str = paramar.getContent();
    if (paramar.jK() == 0)
      at(str, paramar.jK());
    dh(paramar.kk());
    a(true, true, null);
  }

  public final void Z(com.tencent.mm.storage.ar paramar)
  {
    if (paramar == null)
    {
      z.d("!32@/B4Tb64lLpKwUcOR+EdWcmybqEj/+Vl/", "jacks go VoiceTransText need MsgInfo but null");
      return;
    }
    Intent localIntent = new Intent();
    localIntent.setClass(agh(), VoiceTransTextUI.class);
    localIntent.putExtra("voice_trans_text_msg_id", paramar.kk());
    localIntent.putExtra("voice_trans_text_img_path", paramar.kp());
    localIntent.putExtra("MMActivity.OverrideExitAnimation", com.tencent.mm.b.Mw);
    localIntent.putExtra("MMActivity.OverrideEnterAnimation", 0);
    bs.m(paramar);
    startActivity(localIntent);
    agh().overridePendingTransition(com.tencent.mm.b.Mv, com.tencent.mm.b.Mo);
  }

  public final void a(int paramInt1, int paramInt2, com.tencent.mm.o.x paramx)
  {
  }

  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.o.x paramx)
  {
    z.i("!32@/B4Tb64lLpKwUcOR+EdWcmybqEj/+Vl/", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString + " sceneType:" + paramx.getType());
    if (this.dWq != null)
    {
      this.dWq.dismiss();
      this.dWq = null;
    }
    if (this.jsh != null)
    {
      this.jsh.dismiss();
      this.jsh = null;
    }
    if (aVK())
      z.i("!32@/B4Tb64lLpKwUcOR+EdWcmybqEj/+Vl/", "onSceneEnd fragment not foreground, return");
    do
    {
      do
        return;
      while (!ch.S(agh()));
      if ((!this.iJk) && (paramInt1 == 4) && (paramInt2 == -6))
      {
        z.i("!32@/B4Tb64lLpKwUcOR+EdWcmybqEj/+Vl/", "not show verify dialog on background");
        return;
      }
      agh();
    }
    while ((dm.ba(paramInt1, paramInt2)) || ((10 != paramx.getType()) && (j(paramInt1, paramInt2, paramString))));
    if ((paramInt1 == 0) && (paramInt2 == 0))
      switch (paramx.getType())
      {
      case 110:
      case 522:
      default:
      case 10:
      case 127:
      case 594:
      case 551:
      }
    while (true)
    {
      paramx.getType();
      return;
      com.tencent.mm.modelsimple.t localt = (com.tencent.mm.modelsimple.t)paramx;
      if ((localt.zj() != null) && (localt.zj().equals(aUL())) && (!this.jod) && (!this.jst) && (!this.jsv))
      {
        if ((localt.zk() == null) || (localt.zk().length != 4))
        {
          z.e("!32@/B4Tb64lLpKwUcOR+EdWcmybqEj/+Vl/", "unknown directsend op");
          return;
        }
        int j = j.b(localt.zk(), 0);
        z.d("!32@/B4Tb64lLpKwUcOR+EdWcmybqEj/+Vl/", "directsend: status=" + j);
        switch (j)
        {
        case 2:
        default:
          this.jrU = false;
          aVP();
          break;
        case 1:
          this.jrU = true;
          oP(com.tencent.mm.n.bAl);
          Message localMessage2 = new Message();
          this.gQj.sendMessageDelayed(localMessage2, 15000L);
          break;
        case 3:
          this.jrU = true;
          oP(com.tencent.mm.n.bAm);
          Message localMessage1 = new Message();
          this.gQj.sendMessageDelayed(localMessage1, 15000L);
          continue;
          String str = ((w)paramx).getFileName();
          br localbr = com.tencent.mm.modelvoice.bm.BD().iG(str);
          if ((localbr != null) && (localbr.getStatus() == 99))
          {
            bl.z(agh(), com.tencent.mm.n.bsy);
            continue;
            wq localwq2 = ((ah)paramx).zE();
            if (!ch.jb(localwq2.irg))
            {
              com.tencent.mm.ui.base.e.a(agh(), localwq2.irg, "", getString(com.tencent.mm.n.bAc), new lk(this));
              continue;
              z.i("!32@/B4Tb64lLpKwUcOR+EdWcmybqEj/+Vl/", "cpan[refresh top btn]");
              this.jrL = com.tencent.mm.model.v.cP(aUL());
              aVA();
              continue;
              label663: wq localwq1;
              if (paramInt2 == -49)
              {
                if (this.jsO == null)
                  this.jsO = new com.tencent.mm.ui.bindqq.g(agh(), new lo(this));
                this.jsO.aUj();
                if (paramx.getType() != 594)
                  break label842;
                localwq1 = ((ah)paramx).zE();
                Object[] arrayOfObject1 = new Object[1];
                arrayOfObject1[0] = localwq1.irh;
                z.d("!32@/B4Tb64lLpKwUcOR+EdWcmybqEj/+Vl/", "[oneliang][revokeMsgTimeout] sysWording:%s", arrayOfObject1);
                if ((paramInt2 == 0) || (ch.jb(localwq1.irh)))
                  break label844;
              }
              label842: label844: for (int i = 0; ; i = 1)
              {
                if (i != 0)
                  break label850;
                Object[] arrayOfObject3 = new Object[1];
                arrayOfObject3[0] = localwq1.irh;
                z.d("!32@/B4Tb64lLpKwUcOR+EdWcmybqEj/+Vl/", "[oneliang][revokeMsg] sysWording:%s", arrayOfObject3);
                this.jsh = com.tencent.mm.ui.base.e.a(agh(), localwq1.irh, "", getString(com.tencent.mm.n.bAc), new ll(this));
                break;
                if (paramx.getType() == 109)
                {
                  com.tencent.mm.ui.base.e.b(agh(), com.tencent.mm.n.bzi, com.tencent.mm.n.buo);
                  break label663;
                }
                if ((!this.jon) || (paramInt2 != -21))
                  break label663;
                this.jsl = true;
                break label663;
                break;
              }
              label850: Object[] arrayOfObject2 = new Object[2];
              arrayOfObject2[0] = Integer.valueOf(paramInt2);
              arrayOfObject2[1] = localwq1.irh;
              z.d("!32@/B4Tb64lLpKwUcOR+EdWcmybqEj/+Vl/", "[oneliang][revokeMsg] errorCode:%s,sysWording:%s", arrayOfObject2);
              this.jsh = com.tencent.mm.ui.base.e.a(agh(), getString(com.tencent.mm.n.bAd), "", getString(com.tencent.mm.n.bAc), new ln(this));
            }
          }
          break;
        }
      }
    }
  }

  public final void a(int paramInt, com.tencent.mm.sdk.f.ap paramap, Object paramObject)
  {
    a((String)paramObject, null);
  }

  public final void a(int paramInt1, Object paramObject, int paramInt2, int paramInt3, com.tencent.mm.o.x paramx)
  {
  }

  public final void a(long paramLong, int paramInt1, int paramInt2)
  {
    this.joh.f(paramLong, paramInt1, paramInt2);
  }

  public final void a(long paramLong1, long paramLong2, int paramInt1, Object paramObject, int paramInt2, int paramInt3)
  {
    if (!xF())
      com.tencent.mm.y.ap.yh().a(this);
    if ((paramInt2 == 0) && (paramInt3 == 0));
    for (boolean bool = true; ; bool = false)
    {
      com.tencent.mm.storage.ar localar = bg.qW().oV().cV(paramLong2);
      this.joh.a(paramLong2, localar, bool);
      return;
    }
  }

  public final void a(long paramLong, hb paramhb)
  {
    this.jsR.put(Long.valueOf(paramLong), paramhb);
  }

  public final void a(long paramLong, boolean paramBoolean)
  {
    this.joh.g(paramLong, paramBoolean);
  }

  public final void a(MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener)
  {
    this.jtg.l(new ik(this, paramOnMenuItemClickListener));
  }

  public final void a(com.tencent.mm.storage.aw paramaw, com.tencent.mm.storage.ba paramba)
  {
    z.d("!32@/B4Tb64lLpKwUcOR+EdWcmybqEj/+Vl/", "on msg notify change");
    if (!this.jnf.getUsername().equals(paramba.cEh))
      fu(true);
    while ((!"insert".equals(paramba.ikc)) || (paramba.ikd.size() <= 0) || (((com.tencent.mm.storage.ar)paramba.ikd.get(0)).jK() != 0))
      return;
    z.i("!32@/B4Tb64lLpKwUcOR+EdWcmybqEj/+Vl/", "oreh onNotifyChange receive a new msg");
    this.jsA = ch.CM();
  }

  public final void a(String paramString, com.tencent.mm.sdk.f.ao paramao)
  {
    if (aVK())
      z.i("!32@/B4Tb64lLpKwUcOR+EdWcmybqEj/+Vl/", "onNotifyChange fragment not foreground, return");
    com.tencent.mm.storage.i locali;
    do
    {
      return;
      z.i("!32@/B4Tb64lLpKwUcOR+EdWcmybqEj/+Vl/", "onNotifyChange " + paramString);
      locali = bg.qW().oT().ys(aUL());
    }
    while ((locali == null) || ((int)locali.dhv == 0));
    this.jnf = locali;
    aVP();
    this.jrL = com.tencent.mm.model.v.cP(aUL());
    aVB();
  }

  @Deprecated
  protected final void a(boolean paramBoolean1, boolean paramBoolean2, mc parammc)
  {
    if (paramBoolean2)
    {
      this.gQj.postDelayed(new kk(this, paramBoolean1, null), 10L);
      return;
    }
    fr(paramBoolean1);
  }

  public final void aPG()
  {
    if (aPF() == 1)
      this.jrQ.post(new iz(this));
  }

  protected final String aPL()
  {
    if (this.jnf.aIg())
      return "_bizContact";
    if (com.tencent.mm.model.y.dc(this.jnf.getUsername()))
      return "_chatroom";
    return "";
  }

  public final void aRo()
  {
    this.jrQ.setAdapter(this.joh);
  }

  public final String aUL()
  {
    if (com.tencent.mm.storage.i.yc(this.jnf.getUsername()))
      return this.jok;
    if (this.jnf == null)
      return null;
    return this.jnf.getUsername();
  }

  protected final void aVA()
  {
    if ((this.jst) || (this.jod))
    {
      eC(false);
      return;
    }
    jd localjd = new jd(this);
    je localje = new je(this);
    if (com.tencent.mm.model.y.dl(aUL()))
    {
      a(0, com.tencent.mm.n.brv, com.tencent.mm.h.QJ, new jf(this));
      a(1, com.tencent.mm.n.brx, com.tencent.mm.h.QP, localjd);
      com.tencent.mm.plugin.f.c.n.fTF.q(10071, "1");
    }
    while (com.tencent.mm.storage.i.yc(aUL()))
    {
      eF(true);
      return;
      if (com.tencent.mm.model.y.dm(aUL()))
      {
        a(0, com.tencent.mm.n.brx, com.tencent.mm.h.QP, localjd);
      }
      else if (com.tencent.mm.model.y.dP(aUL()))
      {
        a(0, com.tencent.mm.n.brx, com.tencent.mm.h.QP, localjd);
      }
      else if ((com.tencent.mm.storage.i.xY(aUL())) || (com.tencent.mm.storage.i.ya(aUL())) || (com.tencent.mm.storage.i.yc(aUL())))
      {
        a(0, com.tencent.mm.n.bzY, com.tencent.mm.h.QM, localjd);
      }
      else if ((aUL().endsWith("@chatroom")) || (com.tencent.mm.model.y.dd(aUL())))
      {
        if (this.jrL)
        {
          z.i("!32@/B4Tb64lLpKwUcOR+EdWcmybqEj/+Vl/", "cpan show chatroom right btn");
          a(0, com.tencent.mm.n.bzY, com.tencent.mm.h.QF, localjd);
          eC(true);
        }
        else
        {
          eC(false);
        }
      }
      else
      {
        int i;
        if (1 == ch.getInt(com.tencent.mm.f.e.or().getValue("VOIPShowInChat"), 0))
        {
          i = 1;
          label286: if ((i != 0) && (!com.tencent.mm.model.y.dj(aUL())) && (!aUL().endsWith("@chatroom")) && (!com.tencent.mm.storage.i.xY(aUL())) && (!com.tencent.mm.storage.i.ya(aUL())) && (!com.tencent.mm.storage.i.yc(aUL())))
          {
            if (1 != ch.getInt(com.tencent.mm.f.e.or().getValue("VOIPCallType"), 0))
              break label392;
            a(2, com.tencent.mm.n.cCK, com.tencent.mm.h.azF, localje);
          }
        }
        while (true)
        {
          a(0, com.tencent.mm.n.bzY, com.tencent.mm.h.QM, localjd);
          break;
          i = 0;
          break label286;
          label392: a(1, com.tencent.mm.n.cCL, com.tencent.mm.h.azO, localje);
        }
      }
    }
    eC(true);
  }

  public final void aVH()
  {
    Object[] arrayOfObject = new Object[1];
    boolean bool;
    if (this.jss == null)
    {
      bool = true;
      arrayOfObject[0] = Boolean.valueOf(bool);
      z.v("!32@/B4Tb64lLpKwUcOR+EdWcmybqEj/+Vl/", "enter edit search mode, search stub view is null?%B", arrayOfObject);
      this.jsE = true;
      this.jrQ.setVisibility(8);
      if (this.jss == null)
        break label71;
      this.jss.setVisibility(0);
    }
    while (true)
    {
      qk(-1);
      return;
      bool = false;
      break;
      label71: qj(com.tencent.mm.i.aNj);
      this.jss = findViewById(com.tencent.mm.i.aNn);
      this.jss.setVisibility(0);
      this.jsy = findViewById(com.tencent.mm.i.aNh);
      this.jrQ.setFocusable(false);
      this.jrQ.setFocusableInTouchMode(false);
      this.jsy.setOnClickListener(new ju(this));
      this.jsy.setVisibility(8);
      this.jsw = ((TextView)findViewById(com.tencent.mm.i.arB));
      this.jrj = new gv(agh(), new com.tencent.mm.storage.ar(), aUL(), zj(), this.iWI);
      this.jrj.a(new jv(this));
      this.jsx = ((ListView)findViewById(com.tencent.mm.i.aNi));
      this.jsx.setVisibility(0);
      this.jsx.setAdapter(this.jrj);
      this.jsx.setOnItemClickListener(new jw(this));
      this.jsx.setOnTouchListener(new jy(this));
      if (this.jsC != null)
        this.jsC.a(this.jrj);
    }
  }

  public final void aVI()
  {
    z.v("!32@/B4Tb64lLpKwUcOR+EdWcmybqEj/+Vl/", "exit edit search mode");
    this.jsE = false;
    this.jsG = true;
    if (this.jsw != null)
      this.jsw.setVisibility(8);
    if (this.jsy != null)
      this.jsy.setVisibility(8);
    if (this.jsx != null)
      this.jsx.setVisibility(8);
    this.jrQ.setVisibility(0);
    XF();
  }

  public final boolean aVJ()
  {
    return this.jsE;
  }

  public final boolean aVK()
  {
    return (!this.jtt) && (!this.iJh);
  }

  protected final void aVM()
  {
    if (aVL());
    LauncherUI localLauncherUI;
    do
    {
      return;
      if (com.tencent.mm.storage.i.xY(aUL()))
      {
        Intent localIntent1 = new Intent();
        localIntent1.addFlags(67108864);
        com.tencent.mm.am.a.b(agh(), "tmessage", ".ui.TConversationUI", localIntent1);
      }
      do
        while (true)
        {
          finish();
          return;
          if (com.tencent.mm.storage.i.ya(aUL()))
          {
            Intent localIntent2 = new Intent();
            localIntent2.addFlags(67108864);
            com.tencent.mm.am.a.b(agh(), "qmessage", ".ui.QConversationUI", localIntent2);
          }
          else
          {
            if (!this.jon)
              break;
            if (!this.jsl)
            {
              com.tencent.mm.ui.base.e.a(agh(), getString(com.tencent.mm.n.bzt), getString(com.tencent.mm.n.buo), true, new ki(this), new kj(this));
              return;
            }
            String str = aUL();
            fd localfd = new fd();
            localfd.cKu.cKw = 6;
            localfd.cKu.cKx = str;
            com.tencent.mm.sdk.c.a.aGB().g(localfd);
          }
        }
      while (this.jsk);
      if (this.iJh)
        break;
      localLauncherUI = LauncherUI.aPm();
    }
    while (localLauncherUI == null);
    localLauncherUI.aPs();
    return;
    Intent localIntent3 = new Intent(agh(), LauncherUI.class);
    localIntent3.addFlags(67108864);
    startActivity(localIntent3);
    finish();
  }

  @Deprecated
  protected final void aVN()
  {
    a(true, true, null);
  }

  protected final void aVP()
  {
    this.jrW = false;
    this.jrX = false;
    if ((this.jsK != null) && (this.jsK.getVisibility() != 8))
      this.jsK.setVisibility(8);
    aRX();
    if (this.jst)
    {
      oP(com.tencent.mm.n.ccS);
      return;
    }
    if (com.tencent.mm.storage.i.xY(aUL()))
    {
      this.fpD.aCm();
      Bt(this.jnf.od());
      return;
    }
    if (com.tencent.mm.model.y.dN(aUL()))
    {
      Bt(this.jnf.oc());
      return;
    }
    if (com.tencent.mm.storage.i.yc(aUL()))
    {
      int k = com.tencent.mm.n.bxH;
      Object[] arrayOfObject3 = new Object[1];
      com.tencent.mm.storage.i locali = this.jnf;
      String str;
      if (locali != null)
        if (RegionCodeDecoder.zS(locali.getCountryCode()))
        {
          str = locali.jq();
          if (ch.jb(str));
        }
      while (true)
      {
        arrayOfObject3[0] = str;
        Bt(getString(k, arrayOfObject3).trim());
        return;
        str = com.tencent.mm.model.y.dX(locali.jp());
        if (ch.jb(str))
        {
          RegionCodeDecoder.aKA();
          str = RegionCodeDecoder.zT(locali.getCountryCode());
          continue;
          str = com.tencent.mm.model.y.dX(locali.jp());
          if (ch.jb(str))
            str = getString(com.tencent.mm.n.bxY);
        }
      }
    }
    if (this.jom)
    {
      if (ch.jb(this.jnf.iV()))
      {
        if (com.tencent.mm.model.v.cW(aUL()) == 0)
        {
          Bt(getString(com.tencent.mm.n.bAg));
          return;
        }
        int j = com.tencent.mm.n.bKa;
        Object[] arrayOfObject2 = new Object[2];
        arrayOfObject2[0] = getString(com.tencent.mm.n.bAg);
        arrayOfObject2[1] = Integer.valueOf(com.tencent.mm.model.v.cW(aUL()));
        Bt(getString(j, arrayOfObject2));
        return;
      }
      int i = com.tencent.mm.n.bKa;
      Object[] arrayOfObject1 = new Object[2];
      arrayOfObject1[0] = this.jnf.oc();
      arrayOfObject1[1] = Integer.valueOf(com.tencent.mm.model.v.cW(aUL()));
      Bt(getString(i, arrayOfObject1));
      return;
    }
    if (this.jon)
    {
      if (ch.jb(this.jnf.iV()))
      {
        Bt(getString(com.tencent.mm.n.bTX));
        return;
      }
      Bt(this.jnf.iV());
      return;
    }
    Bt(this.jnf.od());
    this.jtg.eq(com.tencent.mm.storage.i.ya(aUL()));
  }

  public final boolean aVS()
  {
    return (!this.jnf.aIg()) && (!com.tencent.mm.model.y.dN(aUL())) && (!com.tencent.mm.storage.i.xY(aUL())) && (!com.tencent.mm.storage.i.ya(aUL()));
  }

  protected final boolean aVT()
  {
    z.d("!32@/B4Tb64lLpKwUcOR+EdWcmybqEj/+Vl/", "writeOpLogAndMarkRead :" + aUL());
    label277: boolean bool;
    if (!com.tencent.mm.storage.i.xY(aUL()))
    {
      if ((this.jnf.aIg()) && (this.enO != null))
      {
        if (!this.enO.ui())
          break label293;
        if ((this.enO.tY() != null) && (this.enO.tY().uD() != null) && (!ch.jb(this.enO.tY().uD().dqu)))
        {
          bg.qW().oW();
          com.tencent.mm.storage.r localr3 = com.tencent.mm.storage.s.yS(this.enO.tY().uD().dqu);
          if ((localr3 != null) && (localr3.getUsername().equals(aUL())) && (localr3.jI() > 0))
            bg.qW().oW().yF(this.enO.tY().uD().dqu);
        }
      }
      if (com.tencent.mm.storage.i.ya(aUL()))
      {
        int i = ev.aZ(this.jsM);
        com.tencent.mm.storage.r localr1 = bg.qW().oW().yE("qmessage");
        if ((localr1 == null) || (ch.jb(localr1.getUsername())))
          break label369;
        localr1.bt(localr1.jI() - i);
        if (bg.qW().oW().a(localr1, localr1.getUsername()) == -1)
          z.e("!32@/B4Tb64lLpKwUcOR+EdWcmybqEj/+Vl/", "update qmessage unread failed");
      }
      bool = bg.qW().oW().yF(aUL());
    }
    label293: label369: 
    do
    {
      return bool;
      if ((this.enO.uf()) || (this.enO.ug()))
        break;
      bg.qW().oW();
      com.tencent.mm.storage.r localr2 = com.tencent.mm.storage.s.aIK();
      if ((localr2 == null) || (!localr2.getUsername().equals(aUL())) || (localr2.jI() <= 0))
        break;
      bg.qW().oW().yF("officialaccounts");
      break;
      z.e("!32@/B4Tb64lLpKwUcOR+EdWcmybqEj/+Vl/", "update Unread: can not find QMessage");
      break label277;
      bool = false;
      String str = zj();
      Cursor localCursor = bg.qW().oV().zA(aUL());
      localCursor.moveToFirst();
      while (!localCursor.isAfterLast())
      {
        com.tencent.mm.storage.ar localar = new com.tencent.mm.storage.ar();
        localar.b(localCursor);
        if (localar.getType() != 34)
        {
          localar.setStatus(4);
          if (!this.jnf.getUsername().equals("medianote"))
            bg.qW().oS().a(new com.tencent.mm.storage.bw(localar.kl(), 4, aUL(), str));
          z.d("!32@/B4Tb64lLpKwUcOR+EdWcmybqEj/+Vl/", "writeOpLog: msgSvrId = " + localar.kl() + " status = " + localar.getStatus());
        }
        localCursor.moveToNext();
        bool = true;
      }
      localCursor.close();
    }
    while (!bool);
    bg.qW().oW().yF(aUL());
    bg.qW().oV().zx(aUL());
    return bool;
  }

  public final void aVU()
  {
    Intent localIntent = new Intent(agh(), SelectContactUI.class);
    localIntent.putExtra("Contact_GroupFilter_Type", "@micromsg.with.all.biz.qq.com");
    localIntent.putExtra("favour_include_biz", true);
    localIntent.putExtra("List_Type", 4);
    localIntent.putExtra("received_card_name", aUL());
    String str = "";
    if (!this.iWI)
      str = aUL();
    localIntent.putExtra("Block_list", str);
    localIntent.putExtra("Add_SendCard", true);
    startActivityForResult(localIntent, 223);
  }

  public final void aVV()
  {
    int i;
    String[] arrayOfString;
    if ((!this.jnf.aIg()) && (!com.tencent.mm.model.y.dN(aUL())) && (!com.tencent.mm.storage.i.xY(aUL())) && (!com.tencent.mm.storage.i.ya(aUL())) && (!com.tencent.mm.storage.i.yc(aUL())))
    {
      i = 1;
      if (i != 0)
        break label96;
      arrayOfString = new String[1];
      arrayOfString[0] = getString(com.tencent.mm.n.bPY);
    }
    while (true)
    {
      com.tencent.mm.ui.base.e.b(agh(), null, arrayOfString, null, new lp(this));
      return;
      i = 0;
      break;
      label96: arrayOfString = new String[2];
      arrayOfString[0] = getString(com.tencent.mm.n.bPY);
      arrayOfString[1] = getString(com.tencent.mm.n.bPZ);
    }
  }

  public final String aVW()
  {
    if (this.jnf == null)
      return null;
    return this.jnf.iV();
  }

  protected final boolean aVX()
  {
    if (aVK())
      return false;
    return this.iJk;
  }

  public final boolean aVY()
  {
    return this.emf;
  }

  public final fn aVZ()
  {
    return this.joh;
  }

  public final boolean aVq()
  {
    return 2 == this.es;
  }

  public final void aVu()
  {
    z.d("!32@/B4Tb64lLpKwUcOR+EdWcmybqEj/+Vl/", "jacks onFragment Close");
    com.tencent.mm.storage.r localr = bg.qW().oW().yE(aUL());
    if (localr != null)
    {
      localr.by(this.fpD.aBU().trim());
      if (!ch.jb(localr.jT()))
        break label614;
    }
    label614: for (long l = localr.jM(); ; l = System.currentTimeMillis())
    {
      localr.l(com.tencent.mm.storage.s.a(localr, 1, l));
      bg.qW().oW().a(localr, localr.getUsername(), false);
      z.v("!32@/B4Tb64lLpKwUcOR+EdWcmybqEj/+Vl/", "jacks set editMsg history");
      com.tencent.mm.c.a.aa localaa = new com.tencent.mm.c.a.aa();
      localaa.cHD.type = 3;
      com.tencent.mm.sdk.c.a.aGB().g(localaa);
      z.i("!32@/B4Tb64lLpKwUcOR+EdWcmybqEj/+Vl/", "[unregitListener]");
      com.tencent.mm.y.ap.ye().a(null);
      bg.qX().b(522, this);
      bg.qX().b(110, this);
      bg.qX().b(10, this);
      bg.qX().b(127, this);
      bg.qX().b(594, this);
      bg.qX().b(551, this);
      bo.azd().aze();
      com.tencent.mm.modelvoice.bt.b(this.joi);
      com.tencent.mm.modelvoice.t.b(this.joi);
      pj localpj = this.jtd;
      agh();
      localpj.aWH();
      if (bg.oE())
      {
        bg.qW().oT().b(this);
        bg.qW().oZ().h(this.jtc);
        com.tencent.mm.pluginsdk.g.axR().b(this.jsX);
        com.tencent.mm.pluginsdk.g.axR().d(this.ezZ);
        com.tencent.mm.sdk.c.a.aGB().b("RePullEmojiInfoDesc", this.hzB);
        com.tencent.mm.sdk.c.a.aGB().b("TrackRemoveTip", this.jsZ);
        com.tencent.mm.sdk.c.a.aGB().b("TranslateMessageResult", this.jsS);
        com.tencent.mm.sdk.c.a.aGB().b("ChatroomMemberDataUpdated", this.jsP);
        bf.GP().h(this.jtb);
        bf.GO().h(this.eYK);
        bg.qW().oV().a(this);
        com.tencent.mm.y.ap.yh().a(this);
        bg.ii().b(this.fXP);
        com.tencent.mm.n.af.sh().b(this.jsY);
      }
      if (!this.iJh)
      {
        this.ewp.eU(true);
        this.fpD.aBJ();
        this.fpD.aBI();
        com.tencent.mm.ui.tools.gy.aG(this.jrQ);
      }
      if (this.jrO != null)
        this.jrO.aUB();
      if (this.jtn != null)
        this.jtn.aWq();
      com.tencent.mm.c.a.af localaf = new com.tencent.mm.c.a.af();
      com.tencent.mm.sdk.c.a.aGB().g(localaf);
      fg localfg = new fg();
      localfg.cKA.cKC = 2;
      com.tencent.mm.sdk.c.a.aGB().g(localfg);
      if (com.tencent.mm.plugin.exdevice.a.e(this.enO))
      {
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = aVW();
        z.i("!32@/B4Tb64lLpKwUcOR+EdWcmybqEj/+Vl/", "hardevice brand account, init event : %s, notify exit chattingui", arrayOfObject);
        if (this.jtj == null)
          this.jtj = new com.tencent.mm.plugin.exdevice.a(this);
        this.jtj.a(2, this.enO);
      }
      aUy();
      if (this.joh != null)
      {
        this.joh.aRo();
        z.i("!32@/B4Tb64lLpKwUcOR+EdWcmybqEj/+Vl/", "ChattingUI resetAdapter");
      }
      oj.release();
      return;
    }
  }

  public final void aVv()
  {
    getWindow().setSoftInputMode(16);
    com.tencent.mm.c.a.aa localaa = new com.tencent.mm.c.a.aa();
    localaa.cHD.type = 4;
    com.tencent.mm.sdk.c.a.aGB().g(localaa);
    this.jtu = false;
    this.jtv = 0L;
    z.i("!32@/B4Tb64lLpKwUcOR+EdWcmybqEj/+Vl/", "[regitListener]");
    bg.qX().a(522, this);
    bg.qX().a(110, this);
    bg.qX().a(10, this);
    bg.qX().a(127, this);
    bg.qX().a(594, this);
    bg.qX().a(551, this);
    bo localbo = bo.azd();
    if (bg.oE())
      bf.Uq().a(4, localbo);
    bg.qW().oT().a(this);
    bg.qW().oZ().g(this.jtc);
    bg.qW().oV().a(this, Looper.getMainLooper());
    com.tencent.mm.pluginsdk.g.axR().a(this.jsX);
    com.tencent.mm.pluginsdk.g.axR().c(this.ezZ);
    com.tencent.mm.sdk.c.a.aGB().a("RePullEmojiInfoDesc", this.hzB);
    com.tencent.mm.sdk.c.a.aGB().a("TrackRemoveTip", this.jsZ);
    com.tencent.mm.sdk.c.a.aGB().a("TranslateMessageResult", this.jsS);
    com.tencent.mm.sdk.c.a.aGB().a("ChatroomMemberDataUpdated", this.jsP);
    com.tencent.mm.ad.s.yP().g(this.jta);
    com.tencent.mm.ad.s.yO().g(this.jta);
    bf.GP().g(this.jtb);
    bf.GO().g(this.eYK);
    com.tencent.mm.n.af.sh().a(this.jsY);
    if (this.fXP == null)
      this.fXP = new io(this);
    pj localpj = this.jtd;
    agh();
    localpj.aWG();
    bg.ii().a(this.fXP);
    com.tencent.mm.y.ap.ye().a(this);
    z.d("!32@/B4Tb64lLpKwUcOR+EdWcmybqEj/+Vl/", "jacks mark reset keybord state");
    this.jsa = mb.juv;
    boolean bool1 = ch.jb(this.jok);
    if (!getStringExtra("Chat_User").equals(this.jok));
    for (int i = 1; ; i = 0)
    {
      this.jtk = false;
      this.jtl = false;
      this.jrZ = true;
      this.jsR.clear();
      if ((this.iJh) || (i != 0))
        break;
      aVr();
      aVP();
      aVA();
      this.fpD.q(Cm(this.jok), false);
      aVL();
      I(this.jnf);
      h(bg.qW().oW().yE(this.jnf.getUsername()));
      this.jrL = com.tencent.mm.model.v.cP(aUL());
      aVs();
      aVQ();
      return;
    }
    this.jok = getStringExtra("Chat_User");
    this.jsk = Bq("finish_direct").booleanValue();
    this.jst = Bq("search_chat_content").booleanValue();
    this.jod = Bq("show_search_chat_content_result").booleanValue();
    this.jsu = Bq("from_global_search").booleanValue();
    z.d("!32@/B4Tb64lLpKwUcOR+EdWcmybqEj/+Vl/", "isFromSearch  " + this.jsk);
    this.jnf = bg.qW().oT().ys(this.jok);
    com.tencent.mm.storage.i locali1 = this.jnf;
    String str1 = this.jok;
    Object[] arrayOfObject1 = new Object[2];
    arrayOfObject1[0] = str1;
    int j;
    Object localObject;
    com.tencent.mm.storage.i locali2;
    if (locali1 == null)
    {
      j = -1;
      arrayOfObject1[1] = Integer.valueOf(j);
      z.w("!32@/B4Tb64lLpKwUcOR+EdWcmybqEj/+Vl/", "protectContactNotExist user:%s contact:%d ", arrayOfObject1);
      if ((locali1 != null) && ((int)locali1.dhv != 0) && (!ch.jb(locali1.getUsername())))
        break label1151;
      localObject = new com.tencent.mm.storage.i();
      ((com.tencent.mm.storage.i)localObject).setUsername(str1);
      ((com.tencent.mm.storage.i)localObject).oA();
      ((com.tencent.mm.storage.i)localObject).bi(3);
      bg.qW().oT().E((com.tencent.mm.storage.i)localObject);
      locali2 = bg.qW().oT().ys(str1);
      if (locali2 != null)
        break label1138;
      z.e("!32@/B4Tb64lLpKwUcOR+EdWcmybqEj/+Vl/", "protectContactNotExist contact get from db is null!");
    }
    while (true)
    {
      label776: this.jnf = ((com.tencent.mm.storage.i)localObject);
      this.enO = com.tencent.mm.q.r.fE(aUL());
      this.jsz = Bq("expose_edit_mode").booleanValue();
      this.joe = getArguments().getLongArray("expose_selected_ids");
      this.jsR.clear();
      String str2 = new ck(aUL()).zW("");
      z.d("!32@/B4Tb64lLpKwUcOR+EdWcmybqEj/+Vl/", "new RoleInfo.Parser(getTalkerUserName())" + str2);
      this.jne = bg.qW().oY().zX(str2);
      String str3 = aUL();
      this.jom = str3.endsWith("@chatroom");
      this.jsj = Cl(str3);
      this.jon = com.tencent.mm.model.y.dd(str3);
      this.jrL = com.tencent.mm.model.v.cP(aUL());
      if ((this.jom) || (this.jon));
      for (boolean bool2 = true; ; bool2 = false)
      {
        this.iWI = bool2;
        com.tencent.mm.storage.r localr = bg.qW().oW().yE(aUL());
        if (localr != null)
          this.jsL = localr.jT();
        if (bool1)
        {
          this.eTo = ((ClipboardManager)agh().getSystemService("clipboard"));
          this.jrM = ((ViewGroup)findViewById(com.tencent.mm.i.alm));
          this.jrS = new nu(agh());
          EmojiView.azX();
          am.b(new iq(this), 2000L);
          bg.qX().d(new ce(new ir(this)));
          if (com.tencent.mm.plugin.exdevice.a.e(this.enO))
          {
            Object[] arrayOfObject2 = new Object[1];
            arrayOfObject2[0] = aVW();
            z.i("!32@/B4Tb64lLpKwUcOR+EdWcmybqEj/+Vl/", "hardevice brand account, init event : %s", arrayOfObject2);
            this.jtj = new com.tencent.mm.plugin.exdevice.a(this);
          }
        }
        aVt();
        return;
        j = (int)locali1.dhv;
        break;
        label1138: localObject = locali2;
        break label776;
      }
      label1151: localObject = locali1;
    }
  }

  public final void aVy()
  {
    if (this.fpD == null)
      this.fpD = ((ChatFooter)findViewById(com.tencent.mm.i.aFz));
    if (((this.jsC != null) && (this.jsC.aVg())) || ((this.jrR != null) && (this.jrR.aWy())))
    {
      this.jtq = this.fpD.getVisibility();
      this.fpD.setVisibility(8);
      if (this.jrO != null)
      {
        this.jtr = this.jrO.getVisibility();
        this.jrO.setVisibility(8);
      }
    }
    do
    {
      return;
      this.jtr = -1;
      return;
      this.fpD.setVisibility(this.jtq);
    }
    while ((this.jrO == null) || (this.jtr == -1));
    this.jrO.setVisibility(this.jtr);
  }

  public final void aVz()
  {
    if (this.jsC != null)
    {
      if (!this.jsC.aVg())
        break label27;
      eC(false);
    }
    while (true)
    {
      aVw();
      return;
      label27: aVA();
    }
  }

  public final void aWd()
  {
    try
    {
      if (this.fpD.aCk())
        this.fpD.aCj();
      return;
    }
    catch (Exception localException)
    {
    }
  }

  public final void aWf()
  {
    if ((com.tencent.mm.model.y.dc(this.jnf.getUsername())) && (!this.jrL))
      if (this.jty != null)
      {
        this.jty.setVisibility(8);
        qn(-1);
      }
    do
    {
      return;
      if ((com.tencent.mm.pluginsdk.g.aya() != null) && (com.tencent.mm.pluginsdk.g.aya().nR(this.jnf.getUsername())))
      {
        aWe();
        LinkedList localLinkedList = com.tencent.mm.pluginsdk.g.aya().nP(this.jnf.getUsername());
        String str2 = "";
        if ((localLinkedList != null) && (localLinkedList.contains(zj())))
        {
          this.jty.pP(com.tencent.mm.h.abE);
          str2 = getString(com.tencent.mm.n.cmx);
          this.jty.pQ(com.tencent.mm.h.Wn);
          this.jty.pR(com.tencent.mm.h.Wm);
          this.jty.start();
          this.jty.setVisibility(0);
          this.jty.BS(str2);
          qn(1);
          return;
        }
        this.jty.pR(-1);
        this.jty.stop();
        this.jty.pP(com.tencent.mm.h.abD);
        if ((localLinkedList != null) && (localLinkedList.size() == 1))
        {
          int k = com.tencent.mm.n.cmw;
          Object[] arrayOfObject3 = new Object[1];
          arrayOfObject3[0] = com.tencent.mm.model.y.dh((String)localLinkedList.get(0));
          str2 = getString(k, arrayOfObject3);
        }
        while (true)
        {
          this.jty.pQ(com.tencent.mm.h.Wl);
          break;
          if (localLinkedList != null)
          {
            int j = com.tencent.mm.n.cmy;
            Object[] arrayOfObject2 = new Object[1];
            arrayOfObject2[0] = Integer.valueOf(localLinkedList.size());
            str2 = getString(j, arrayOfObject2);
          }
        }
      }
      if ((com.tencent.mm.pluginsdk.g.axT() != null) && (com.tencent.mm.pluginsdk.g.axT().sU(this.jnf.getUsername())))
      {
        aWe();
        com.tencent.mm.c.a.lm locallm = new com.tencent.mm.c.a.lm();
        locallm.cOG.cOI = true;
        com.tencent.mm.sdk.c.a.aGB().g(locallm);
        if (this.jnf.getUsername().equals(locallm.cOH.cOK))
          this.jty.pP(com.tencent.mm.h.abE);
        while (true)
        {
          int i = com.tencent.mm.n.clX;
          Object[] arrayOfObject1 = new Object[1];
          arrayOfObject1[0] = Integer.valueOf(com.tencent.mm.pluginsdk.g.axT().sV(this.jnf.getUsername()).size());
          String str1 = getString(i, arrayOfObject1);
          this.jty.pQ(com.tencent.mm.h.abN);
          this.jty.pR(-1);
          this.jty.stop();
          this.jty.setVisibility(0);
          this.jty.BS(str1);
          qn(1);
          return;
          this.jty.pP(com.tencent.mm.h.abD);
        }
      }
    }
    while (this.jty == null);
    this.jty.setVisibility(8);
    this.jty.pR(-1);
    this.jty.stop();
    qn(-1);
  }

  @TargetApi(11)
  public final void aWh()
  {
    if (Build.VERSION.SDK_INT < 11)
      z.d("!32@/B4Tb64lLpKwUcOR+EdWcmybqEj/+Vl/", "sdk not support dragdrop event");
    do
    {
      return;
      if (this.jrQ != null)
        this.jrQ.setOnDragListener(null);
    }
    while (this.fpD == null);
    this.fpD.setOnDragListener(null);
    this.fpD.a(null);
  }

  @TargetApi(11)
  public final void aWi()
  {
    if ((this.jod) || (this.jst))
      return;
    if (Build.VERSION.SDK_INT < 11)
    {
      z.d("!32@/B4Tb64lLpKwUcOR+EdWcmybqEj/+Vl/", "sdk not support dragdrop event");
      return;
    }
    new hn(this).run();
  }

  protected final void acquireWakeLock()
  {
    this.jrQ.setKeepScreenOn(true);
  }

  final String at(String paramString, int paramInt)
  {
    if ((this.iWI) && (paramString != null) && (paramInt == 0))
      paramString = com.tencent.mm.model.bw.en(paramString);
    return paramString;
  }

  public final void b(long paramLong, Object paramObject)
  {
  }

  public final void dg(long paramLong)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Long.valueOf(paramLong);
    z.i("!32@/B4Tb64lLpKwUcOR+EdWcmybqEj/+Vl/", "set last click short video msg id %d", arrayOfObject);
    this.jrN = paramLong;
  }

  @SuppressLint({"DefaultLocale"})
  public final String dh(String paramString)
  {
    String str = com.tencent.mm.model.y.dg(paramString);
    if (!ch.jb(str));
    do
    {
      return str;
      if (!this.jsr.containsKey(paramString))
        break;
      str = (String)this.jsr.get(paramString);
    }
    while (!ch.jb(str));
    if ((this.jon) && (!paramString.toLowerCase().endsWith("@chatroom")))
      at.qx().a(paramString, new ht(this));
    return com.tencent.mm.model.y.dh(paramString);
  }

  public final void ee(String paramString)
  {
    if ((paramString == null) || (paramString.equals(aUL())))
      return;
    boolean bool = Bp(com.tencent.mm.sdk.platformtools.ak.aHi()).getBoolean("settings_shake", true);
    ch.a(agh(), bool);
  }

  public final void finish()
  {
    XF();
    am.b(new lj(this), 100L);
  }

  @TargetApi(9)
  public final void fn(boolean paramBoolean)
  {
    if (aPZ())
    {
      if (!paramBoolean)
        break label163;
      if (Build.VERSION.SDK_INT < 9)
        break label123;
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Integer.valueOf(getWindowManager().getDefaultDisplay().getOrientation());
      z.i("!32@/B4Tb64lLpKwUcOR+EdWcmybqEj/+Vl/", "rotation %d", arrayOfObject);
      switch (getWindowManager().getDefaultDisplay().getOrientation())
      {
      default:
      case 0:
      case 1:
      case 2:
      case 3:
      }
    }
    label123: 
    do
    {
      return;
      setRequestedOrientation(1);
      return;
      setRequestedOrientation(0);
      return;
      setRequestedOrientation(9);
      return;
      setRequestedOrientation(8);
      return;
      if (getResources().getConfiguration().orientation == 2)
      {
        setRequestedOrientation(0);
        return;
      }
    }
    while (getResources().getConfiguration().orientation != 1);
    setRequestedOrientation(1);
    return;
    label163: setRequestedOrientation(-1);
  }

  public final void fo(boolean paramBoolean)
  {
    this.jrK = paramBoolean;
  }

  public final void fp(boolean paramBoolean)
  {
    if (this.joh != null)
      this.joh.fk(paramBoolean);
  }

  public final void fq(boolean paramBoolean)
  {
    this.jtt = paramBoolean;
  }

  public final void fs(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      this.joi.fg(false);
      this.emf = true;
      bg.qW().oQ().set(26, Boolean.valueOf(true));
      oX(0);
      aUy();
      Toast.makeText(agh(), getString(com.tencent.mm.n.bKY), 0).show();
      this.joi.aUw();
      oY(com.tencent.mm.h.QE);
      return;
    }
    this.joi.fg(true);
    this.emf = false;
    bg.qW().oQ().set(26, Boolean.valueOf(false));
    oX(8);
    aUy();
    Toast.makeText(agh(), getString(com.tencent.mm.n.bKZ), 0).show();
    this.joi.aUw();
    oY(com.tencent.mm.h.QI);
  }

  public final void ft(boolean paramBoolean)
  {
    if ((this.jnf.getUsername().toLowerCase().endsWith("@chatroom")) && (!this.jrL))
    {
      com.tencent.mm.ui.base.e.o(agh(), getString(com.tencent.mm.n.clO), null);
      return;
    }
    com.tencent.mm.c.a.lm locallm = new com.tencent.mm.c.a.lm();
    locallm.cOG.cOI = true;
    com.tencent.mm.sdk.c.a.aGB().g(locallm);
    if (!paramBoolean)
    {
      if ((com.tencent.mm.pluginsdk.g.aya() != null) && (com.tencent.mm.pluginsdk.g.aya().nR(this.jnf.getUsername())))
      {
        LinkedList localLinkedList = com.tencent.mm.pluginsdk.g.aya().nP(this.jnf.getUsername());
        String str2;
        if ((localLinkedList != null) && (localLinkedList.contains(zj())))
          str2 = getString(com.tencent.mm.n.clJ);
        for (int i = com.tencent.mm.n.bFS; ; i = com.tencent.mm.n.bPk)
        {
          com.tencent.mm.plugin.f.c.n localn = com.tencent.mm.plugin.f.c.n.fTF;
          Object[] arrayOfObject = new Object[4];
          arrayOfObject[0] = Integer.valueOf(19);
          arrayOfObject[1] = Integer.valueOf(0);
          arrayOfObject[2] = Integer.valueOf(0);
          arrayOfObject[3] = Integer.valueOf(0);
          localn.d(10997, arrayOfObject);
          ad localad = new ad(agh());
          localad.BL(str2);
          localad.d(com.tencent.mm.n.bsK, new lv(this));
          localad.e(i, new lw(this, paramBoolean));
          localad.aRB().show();
          return;
          str2 = getString(com.tencent.mm.n.clK);
        }
      }
      if ((!ch.jb(locallm.cOH.cOK)) && (!this.jnf.getUsername().equals(locallm.cOH.cOK)))
      {
        com.tencent.mm.ui.base.e.a(agh(), getString(com.tencent.mm.n.clF), null, new hh(this), new hi(this));
        return;
      }
      sX(this.jnf.getUsername());
      return;
    }
    if ((ch.jb(locallm.cOH.cOK)) || (this.jnf.getUsername().equals(locallm.cOH.cOK)))
    {
      sX(this.jnf.getUsername());
      return;
    }
    if ((this.jty == null) || (this.jty.getVisibility() != 0))
    {
      com.tencent.mm.ui.base.e.a(agh(), getString(com.tencent.mm.n.clF), null, new hj(this), new hk(this));
      return;
    }
    TalkRoomPopupNav localTalkRoomPopupNav = this.jty;
    String str1 = getString(com.tencent.mm.n.clF);
    ((TextView)localTalkRoomPopupNav.findViewById(com.tencent.mm.i.aTF)).setText(str1);
    this.jty.aTt();
  }

  public final int getFirstVisiblePosition()
  {
    return this.jrQ.getFirstVisiblePosition();
  }

  protected final int getLayoutId()
  {
    return com.tencent.mm.k.bcg;
  }

  public final void i(String paramString, Bitmap paramBitmap)
  {
    if ((ch.jb(paramString)) || (this.jrQ == null) || (paramBitmap == null))
      return;
    this.jrV.post(new lt(this));
  }

  protected final boolean j(int paramInt1, int paramInt2, String paramString)
  {
    if (dy.a(agh(), paramInt1, paramInt2, paramString, 7));
    do
    {
      return true;
      if ((paramInt1 == 4) && (paramInt2 == -6))
        return false;
    }
    while (dm.a(agh(), paramInt1, paramInt2, new Intent().setClass(agh(), LauncherUI.class).putExtra("Intro_Switch", true).addFlags(67108864), paramString) != null);
    return false;
  }

  public final void k(String paramString1, String paramString2, String paramString3)
  {
    if (paramString1.equals(this.jnf.getUsername()))
      aWf();
  }

  public final void keepSignalling()
  {
    if (this.jsU == -2)
      bg.qX().d(new ce(new lc(this)));
  }

  public final void m(com.tencent.mm.pluginsdk.model.app.k paramk)
  {
    if (paramk == null)
    {
      Object[] arrayOfObject5 = new Object[1];
      arrayOfObject5[0] = ch.aHN();
      z.e("!32@/B4Tb64lLpKwUcOR+EdWcmybqEj/+Vl/", "onAppSelected, info is null, %s", arrayOfObject5);
    }
    label340: 
    do
    {
      do
      {
        do
        {
          boolean bool;
          do
          {
            return;
            if (!paramk.ayE())
              break label340;
            if ((paramk == null) || (!paramk.ayE()))
            {
              z.e("!32@/B4Tb64lLpKwUcOR+EdWcmybqEj/+Vl/", "serviceAppSelect not service app");
              return;
            }
            if ((this.jnf == null) || (ch.jb(this.jnf.getUsername())))
            {
              z.e("!32@/B4Tb64lLpKwUcOR+EdWcmybqEj/+Vl/", "serviceAppSelect talker is null");
              return;
            }
            Object[] arrayOfObject2 = new Object[3];
            arrayOfObject2[0] = Integer.valueOf(paramk.iZ());
            arrayOfObject2[1] = paramk.field_packageName;
            arrayOfObject2[2] = paramk.field_appId;
            z.i("!32@/B4Tb64lLpKwUcOR+EdWcmybqEj/+Vl/", "serviceApp, jumpType[%d], package[%s], appid[%s]", arrayOfObject2);
            if ((paramk.iZ() == 2) && (!ch.jb(paramk.iY())))
            {
              n(paramk);
              return;
            }
            if (paramk.iZ() != 3)
              break;
            if (ch.jb(paramk.field_openId))
            {
              bf.azc().vd(paramk.field_appId);
              z.e("!32@/B4Tb64lLpKwUcOR+EdWcmybqEj/+Vl/", "JUMP 3RD APP fail, openId is null, go get it");
              return;
            }
            if ((this.jtd == null) || (ch.jb(paramk.field_packageName)))
            {
              z.e("!32@/B4Tb64lLpKwUcOR+EdWcmybqEj/+Vl/", "JUMP 3RD APP fail");
              n(paramk);
              return;
            }
            bool = this.jtd.bH(paramk.field_packageName, paramk.field_openId);
            Object[] arrayOfObject4 = new Object[1];
            arrayOfObject4[0] = Boolean.valueOf(bool);
            z.i("!32@/B4Tb64lLpKwUcOR+EdWcmybqEj/+Vl/", "JUMP 3RD APP success[%s]", arrayOfObject4);
          }
          while (bool);
          n(paramk);
          return;
        }
        while (paramk.iZ() != 1);
        Object[] arrayOfObject3 = new Object[2];
        arrayOfObject3[0] = paramk.field_packageName;
        arrayOfObject3[1] = paramk.iY();
        z.i("!32@/B4Tb64lLpKwUcOR+EdWcmybqEj/+Vl/", "JUMP NATIVE ForwardUrl[%s]", arrayOfObject3);
        oj.b(agh(), paramk.iY(), false, this.jnf.getUsername());
        return;
        if (paramk.field_status == 3)
        {
          z.e("!32@/B4Tb64lLpKwUcOR+EdWcmybqEj/+Vl/", "onAppSeleted fail, app is in blacklist, packageName = " + paramk.field_packageName);
          return;
        }
      }
      while ((this.jtd.bH(paramk.field_packageName, paramk.field_openId)) || (paramk.field_status != 5));
      Object[] arrayOfObject1 = new Object[1];
      arrayOfObject1[0] = paramk.iI();
      z.d("!32@/B4Tb64lLpKwUcOR+EdWcmybqEj/+Vl/", "SuggestionApp appSuggestionIntroUrl = %s", arrayOfObject1);
    }
    while (ch.jb(paramk.iI()));
    Intent localIntent = new Intent();
    localIntent.putExtra("rawUrl", paramk.iI());
    com.tencent.mm.am.a.b(agh(), "webview", ".ui.tools.WebViewUI", localIntent);
  }

  public final void oP(int paramInt)
  {
    Bt(getString(paramInt));
  }

  public final void oQ(int paramInt)
  {
    Bu(getString(paramInt));
  }

  public final void oT(int paramInt)
  {
    com.tencent.mm.ui.c localc = this.jtg;
    if (paramInt == 0);
    for (boolean bool = true; ; bool = false)
    {
      localc.eo(bool);
      return;
    }
  }

  public final void oX(int paramInt)
  {
    com.tencent.mm.ui.c localc = this.jtg;
    if (paramInt == 0);
    for (boolean bool = true; ; bool = false)
    {
      localc.ep(bool);
      return;
    }
  }

  public final void onActivityCreated(Bundle paramBundle)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Integer.valueOf(hashCode());
    z.i("!32@/B4Tb64lLpKwUcOR+EdWcmybqEj/+Vl/", "onCreate %d", arrayOfObject);
    super.onActivityCreated(paramBundle);
    aVv();
  }

  public final void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    int i = 1;
    if (aVK())
      z.i("!32@/B4Tb64lLpKwUcOR+EdWcmybqEj/+Vl/", "onActivityResult not foreground, return");
    label492: boolean bool1;
    do
    {
      String str6;
      boolean bool4;
      do
      {
        do
        {
          do
          {
            Cursor localCursor;
            do
            {
              do
              {
                do
                {
                  do
                  {
                    do
                    {
                      int n;
                      do
                      {
                        do
                        {
                          do
                          {
                            do
                            {
                              do
                              {
                                do
                                {
                                  String str11;
                                  do
                                  {
                                    do
                                    {
                                      return;
                                      z.i("!32@/B4Tb64lLpKwUcOR+EdWcmybqEj/+Vl/", "onAcvityResult requestCode:" + paramInt1);
                                      if ((this.joh.isInEditMode()) && (this.jsE))
                                        aVI();
                                      if ((paramInt1 == 12001) && (this.jtj != null))
                                      {
                                        this.jtj.gR(paramInt2);
                                        return;
                                      }
                                      if (paramInt1 != 221)
                                        break;
                                    }
                                    while (paramIntent == null);
                                    str11 = paramIntent.getStringExtra("result_msg");
                                  }
                                  while (ch.jb(str11));
                                  com.tencent.mm.ui.base.e.aw(agh(), str11);
                                  return;
                                  if (paramInt2 == -1)
                                    break;
                                }
                                while ((paramInt1 != 200) && (paramInt1 != 201) && (paramInt1 != 203));
                                this.fpD.clearFocus();
                                new com.tencent.mm.sdk.platformtools.cm(Looper.getMainLooper()).post(new kz(this));
                                return;
                                if (this.jrO != null)
                                  this.jrO.h(paramInt1, paramIntent);
                                switch (paramInt1)
                                {
                                case 204:
                                case 205:
                                case 206:
                                case 209:
                                case 219:
                                case 221:
                                default:
                                  z.e("!32@/B4Tb64lLpKwUcOR+EdWcmybqEj/+Vl/", "onActivityResult: not found this requestCode");
                                  return;
                                case 213:
                                case 220:
                                case 200:
                                case 201:
                                case 202:
                                case 217:
                                case 203:
                                case 207:
                                case 208:
                                case 215:
                                case 218:
                                case 216:
                                case 210:
                                case 211:
                                case 212:
                                case 214:
                                case 222:
                                case 223:
                                }
                              }
                              while ((paramIntent == null) || (!paramIntent.getBooleanExtra("_delete_ok_", false)));
                              finish();
                              return;
                            }
                            while ((-1 != paramInt2) || (this.jsC == null) || (!this.jsC.aVg()));
                            this.jsC.aVe();
                            return;
                          }
                          while (paramIntent == null);
                          Intent localIntent2 = new Intent(agh(), CropImageNewUI.class);
                          localIntent2.putExtra("CropImageMode", 4);
                          localIntent2.putExtra("CropImage_Filter", i);
                          String str10 = aUL();
                          boolean bool7;
                          if (str10 != null)
                          {
                            boolean bool8 = com.tencent.mm.storage.i.xY(str10);
                            bool7 = false;
                            if (!bool8)
                            {
                              boolean bool9 = com.tencent.mm.storage.i.ya(str10);
                              bool7 = false;
                              if (!bool9)
                                break label492;
                            }
                          }
                          while (true)
                          {
                            localIntent2.putExtra("CropImage_Has_Raw_Img_Btn", bool7);
                            localIntent2.putExtra("from_source", 3);
                            com.tencent.mm.ui.tools.l.a(this, paramIntent, localIntent2, bg.qW().pa(), 203);
                            return;
                            bool7 = i;
                          }
                          this.filePath = com.tencent.mm.pluginsdk.ui.tools.bc.a(agh().getApplicationContext(), paramIntent, bg.qW().pa());
                        }
                        while (this.filePath == null);
                        Intent localIntent1 = new Intent();
                        ArrayList localArrayList = new ArrayList(i);
                        localArrayList.add(this.filePath);
                        localIntent1.putExtra("query_source_type", 3);
                        localIntent1.putExtra("preview_image", i);
                        localIntent1.putStringArrayListExtra("preview_image_list", localArrayList);
                        localIntent1.addFlags(67108864);
                        com.tencent.mm.am.a.a(this, "gallery", ".ui.GalleryEntryUI", localIntent1, 217);
                        return;
                        n = paramIntent.getIntExtra("Chat_Mode", i);
                      }
                      while (this.fpD == null);
                      this.fpD.setMode(n);
                      return;
                    }
                    while (paramIntent == null);
                    this.jrP = paramIntent.getStringArrayListExtra("CropImage_OutputPath_List");
                    if ((this.jrP == null) || (this.jrP.size() == 0))
                    {
                      z.e("!32@/B4Tb64lLpKwUcOR+EdWcmybqEj/+Vl/", "send filepath is null or nil");
                      this.fpD.clearFocus();
                      return;
                    }
                    bg.qQ().n(new la(this, paramIntent));
                    this.fpD.clearFocus();
                    this.fpD.aCj();
                    new com.tencent.mm.sdk.platformtools.cm(Looper.getMainLooper()).post(new lb(this));
                    return;
                    this.filePath = paramIntent.getStringExtra("CropImage_OutputPath");
                    if (this.filePath == null)
                    {
                      this.fpD.clearFocus();
                      return;
                    }
                    String str9 = this.filePath;
                    boolean bool5 = paramIntent.getBooleanExtra("CropImage_Compress_Img", i);
                    boolean bool6 = com.tencent.mm.model.x.b(str9, aUL(), bool5);
                    int k = paramIntent.getIntExtra("from_source", 0);
                    int m = paramIntent.getIntExtra("CropImage_rotateCount", 0);
                    z.d("!32@/B4Tb64lLpKwUcOR+EdWcmybqEj/+Vl/", "dkimgsource" + paramIntent.getIntExtra("from_source", 0));
                    if (bool6);
                    while (true)
                    {
                      a(i, k, m, str9);
                      this.fpD.clearFocus();
                      new com.tencent.mm.sdk.platformtools.cm(Looper.getMainLooper()).post(new ld(this));
                      return;
                      bool1 = false;
                    }
                    au(paramIntent.getStringExtra("art_smiley_slelct_data"), 4);
                    return;
                    v(paramIntent);
                    return;
                    v(paramIntent);
                    return;
                  }
                  while (paramIntent == null);
                  if (paramIntent.getBooleanExtra("from_record", false))
                  {
                    u(paramIntent);
                    return;
                  }
                  v(paramIntent);
                  return;
                  u(paramIntent);
                  return;
                }
                while (paramInt2 != -1);
                long l = paramIntent.getLongExtra("App_MsgId", 0L);
                Q(bg.qW().oV().cV(l));
                return;
              }
              while (paramInt2 != -1);
              Uri localUri = paramIntent.getData();
              FragmentActivity localFragmentActivity = h();
              localCursor = null;
              if (localFragmentActivity != null)
                localCursor = h().managedQuery(localUri, null, null, null, null);
            }
            while (!localCursor.moveToFirst());
            String str8 = localCursor.getString(localCursor.getColumnIndexOrThrow("_id"));
            startActivity(new Intent("android.intent.action.EDIT", Uri.parse("content://com.android.contacts/contacts/" + str8)));
            return;
          }
          while (paramIntent == null);
          String str7 = paramIntent.getStringExtra("Select_Conv_User");
          if (ch.jb(str7))
          {
            Object[] arrayOfObject5 = new Object[bool1];
            arrayOfObject5[0] = "[nobody]";
            z.d("!32@/B4Tb64lLpKwUcOR+EdWcmybqEj/+Vl/", "@ %s", arrayOfObject5);
            this.fpD.vB("");
            this.jsi = false;
            return;
          }
          Object[] arrayOfObject4 = new Object[bool1];
          arrayOfObject4[0] = str7;
          z.d("!32@/B4Tb64lLpKwUcOR+EdWcmybqEj/+Vl/", "@ %s", arrayOfObject4);
          this.fpD.vB(str7);
          this.jsi = bool1;
          return;
          ChatFooter.aCn();
          this.fpD.aCg();
          return;
        }
        while ((paramInt2 != -1) || (paramIntent == null));
        String str4 = paramIntent.getStringExtra("service_app_package_name");
        String str5 = paramIntent.getStringExtra("service_app_openid");
        str6 = paramIntent.getStringExtra("service_app_appid");
        Object[] arrayOfObject2 = new Object[4];
        if (this.jtd != null);
        for (boolean bool3 = bool1; ; bool3 = false)
        {
          arrayOfObject2[0] = Boolean.valueOf(bool3);
          arrayOfObject2[bool1] = str4;
          arrayOfObject2[2] = str6;
          arrayOfObject2[3] = str5;
          z.i("!32@/B4Tb64lLpKwUcOR+EdWcmybqEj/+Vl/", "request send wx msg, wxmessage[%b], package[%s], appId[%s], openId[%s]", arrayOfObject2);
          if (!ch.jb(str6))
            break;
          z.e("!32@/B4Tb64lLpKwUcOR+EdWcmybqEj/+Vl/", "REQUEST_CODE_SERVICE_APP openId is null");
          return;
        }
        if ((this.jtd == null) || (ch.jb(str4)))
        {
          n(com.tencent.mm.pluginsdk.model.app.l.F(str6, bool1));
          return;
        }
        if (ch.jb(str5))
        {
          bf.azc().vd(str6);
          z.e("!32@/B4Tb64lLpKwUcOR+EdWcmybqEj/+Vl/", "request send wx msg fail, openId is null, go get it");
          return;
        }
        bool4 = this.jtd.bH(str4, str5);
        Object[] arrayOfObject3 = new Object[bool1];
        arrayOfObject3[0] = Boolean.valueOf(bool4);
        z.d("!32@/B4Tb64lLpKwUcOR+EdWcmybqEj/+Vl/", "request send wx msg success = %b", arrayOfObject3);
      }
      while (bool4);
      n(com.tencent.mm.pluginsdk.model.app.l.F(str6, bool1));
      return;
    }
    while ((paramInt2 != -1) || (paramIntent == null));
    String str1 = paramIntent.getStringExtra("be_send_card_name");
    String str2 = com.tencent.mm.model.y.dh(str1);
    String str3 = paramIntent.getStringExtra("received_card_name");
    boolean bool2 = paramIntent.getBooleanExtra("Is_Chatroom", false);
    Activity localActivity1 = agh();
    Activity localActivity2 = agh();
    int j = com.tencent.mm.n.cEa;
    Object[] arrayOfObject1 = new Object[bool1];
    arrayOfObject1[0] = str2;
    com.tencent.mm.ui.base.e.a(localActivity1, localActivity2.getString(j, arrayOfObject1), "", agh().getString(com.tencent.mm.n.buh), agh().getString(com.tencent.mm.n.bsK), new le(this, str1, str3, bool2), null);
  }

  public final void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
    z.d("!32@/B4Tb64lLpKwUcOR+EdWcmybqEj/+Vl/", "getConfiguration().orientation = " + getResources().getConfiguration().orientation + ", newConfig.orientation = " + paramConfiguration.orientation);
    getResources().getConfiguration().orientation = paramConfiguration.orientation;
    this.fpD.aCi();
    aWc();
  }

  public final void onCreate(Bundle paramBundle)
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = h().getClass().getSimpleName();
    arrayOfObject[1] = Integer.valueOf(h().hashCode());
    arrayOfObject[2] = ch.bL(h());
    z.i("!32@/B4Tb64lLpKwUcOR+EdWcmybqEj/+Vl/", "dktask FragmentonCreate:%s#0x%x task:%s ", arrayOfObject);
    super.onCreate(paramBundle);
  }

  public final void onCreateOptionsMenu(Menu paramMenu, MenuInflater paramMenuInflater)
  {
    if (aVK())
      return;
    super.onCreateOptionsMenu(paramMenu, paramMenuInflater);
  }

  public final View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    View localView = super.onCreateView(paramLayoutInflater, paramViewGroup, paramBundle);
    ViewGroup.LayoutParams localLayoutParams = localView.getLayoutParams();
    if (localLayoutParams == null)
      localLayoutParams = new ViewGroup.LayoutParams(-1, -1);
    localView.setLayoutParams(localLayoutParams);
    return localView;
  }

  public final void onDestroy()
  {
    Object[] arrayOfObject1 = new Object[3];
    arrayOfObject1[0] = h().getClass().getSimpleName();
    arrayOfObject1[1] = Integer.valueOf(h().hashCode());
    arrayOfObject1[2] = ch.bL(h());
    z.i("!32@/B4Tb64lLpKwUcOR+EdWcmybqEj/+Vl/", "dktask FragmentonDestroy %s#0x%x task:%s ", arrayOfObject1);
    if (this.jok != null)
    {
      Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = Integer.valueOf(hashCode());
      z.i("!32@/B4Tb64lLpKwUcOR+EdWcmybqEj/+Vl/", "onDestroy %d", arrayOfObject2);
      if (this.jon)
      {
        fd localfd = new fd();
        localfd.cKu.cKw = 5;
        com.tencent.mm.sdk.c.a.aGB().g(localfd);
        com.tencent.mm.plugin.a.eS(3);
      }
      if (this.fpD != null)
      {
        this.fpD.a(null);
        this.fpD.b(null);
        this.fpD.b(null);
      }
      if (this.jsn != null)
        this.jsn.onDetach();
      if (this.jrO != null)
      {
        this.jrO.anl();
        this.jrO = null;
      }
      aVu();
      if (bg.oE())
      {
        com.tencent.mm.ad.s.yP().h(this.jta);
        com.tencent.mm.ad.s.yO().h(this.jta);
      }
      releaseWakeLock();
      this.joi.aUo();
      this.joi.onDestroy();
      fg localfg = new fg();
      localfg.cKA.cKC = 2;
      com.tencent.mm.sdk.c.a.aGB().g(localfg);
      this.joh.closeCursor();
      if (this.jrj != null)
        this.jrj.closeCursor();
      if (this.fqB != null)
        this.fqB.clearFocus();
      this.joh.aOD();
      aWa();
      if (bg.qW().oJ())
        com.tencent.mm.modelsimple.aw.u(aUL(), 5);
      if ((bg.oE()) && (com.tencent.mm.g.a.cv(this.jnf.getType())) && (this.jnf.aIg()))
      {
        com.tencent.mm.q.aa.va();
        com.tencent.mm.q.s.fH(aUL());
      }
      if ((this.iJh) && (this.fpD != null))
        this.fpD.destroy();
      if (this.jty != null)
        this.jty.stop();
      this.jsc.aNu();
      this.jsW.aNu();
      if (this.jtj != null)
        this.jtj.release();
      if (this.jsO != null)
        this.jsO.onDetach();
      cv localcv = this.jsd;
      localcv.cancel();
      localcv.xU();
    }
    super.onDestroy();
  }

  public final boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    int i = 1;
    Object[] arrayOfObject1 = new Object[2];
    arrayOfObject1[0] = Integer.valueOf(paramKeyEvent.getKeyCode());
    arrayOfObject1[i] = Integer.valueOf(paramKeyEvent.getAction());
    z.i("!32@/B4Tb64lLpKwUcOR+EdWcmybqEj/+Vl/", "chatting onKeyDown, code:%d action:%d", arrayOfObject1);
    if (paramKeyEvent.getKeyCode() == 4)
    {
      if (aVK())
      {
        z.i("!32@/B4Tb64lLpKwUcOR+EdWcmybqEj/+Vl/", "onKeyDown back key fragment not foreground");
        i = 0;
      }
      do
      {
        do
        {
          return i;
          if (paramKeyEvent.getAction() == 0)
          {
            this.jtu = i;
            this.jtv = System.currentTimeMillis();
          }
        }
        while (paramKeyEvent.getAction() != i);
        Object[] arrayOfObject2 = new Object[2];
        arrayOfObject2[0] = Boolean.valueOf(this.jtu);
        arrayOfObject2[i] = Long.valueOf(System.currentTimeMillis() - this.jtv);
        z.d("!32@/B4Tb64lLpKwUcOR+EdWcmybqEj/+Vl/", "hasBack %B, %d", arrayOfObject2);
      }
      while ((!this.jtu) || (System.currentTimeMillis() - this.jtv > 30000L));
      if ((this.jsC != null) && (this.jsC.aVg()))
      {
        if (this.jsE)
        {
          aVI();
          this.jsC.aVh();
          return i;
        }
        this.jsC.aVe();
        return i;
      }
      if ((this.fpD != null) && (this.fpD.aCk()))
      {
        this.fpD.aCq();
        return i;
      }
      goBack();
      return i;
    }
    if (aVK())
    {
      z.i("!32@/B4Tb64lLpKwUcOR+EdWcmybqEj/+Vl/", "onKeyDown fragment not foreground");
      return false;
    }
    AudioManager localAudioManager = (AudioManager)agh().getSystemService("audio");
    int j = localAudioManager.getStreamMaxVolume(0);
    if ((paramKeyEvent.getAction() == 0) && (paramInt == 25) && (this.joi != null) && (this.joi.isPlaying()) && ((this.emf) || (!this.joi.mw())))
    {
      int n = localAudioManager.getStreamVolume(0);
      z.v("!32@/B4Tb64lLpKwUcOR+EdWcmybqEj/+Vl/", "volume current:" + n + " max:" + j);
      int i1 = j / 7;
      if (i1 == 0)
        i1 = i;
      localAudioManager.setStreamVolume(0, n - i1, 5);
      z.v("!32@/B4Tb64lLpKwUcOR+EdWcmybqEj/+Vl/", "volume current:" + n + " max:" + j);
      return i;
    }
    if ((paramKeyEvent.getAction() == 0) && (paramInt == 24) && (this.joi != null) && (this.joi.isPlaying()) && ((this.emf) || (!this.joi.mw())))
    {
      int k = localAudioManager.getStreamVolume(0);
      z.v("!32@/B4Tb64lLpKwUcOR+EdWcmybqEj/+Vl/", "volume current:" + k + " max:" + j);
      int m = j / 7;
      if (m == 0)
        m = i;
      localAudioManager.setStreamVolume(0, m + k, 5);
      z.v("!32@/B4Tb64lLpKwUcOR+EdWcmybqEj/+Vl/", "volume current:" + k + " max:" + j);
      return i;
    }
    return false;
  }

  public final boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = Integer.valueOf(paramInt);
    arrayOfObject[1] = paramKeyEvent;
    z.d("!32@/B4Tb64lLpKwUcOR+EdWcmybqEj/+Vl/", "chatting ui fragment on key up, %d, %s", arrayOfObject);
    return super.onKeyUp(paramInt, paramKeyEvent);
  }

  public final void onPause()
  {
    z.d("!32@/B4Tb64lLpKwUcOR+EdWcmybqEj/+Vl/", "on chatting ui pause");
    com.tencent.mm.c.a.aa localaa = new com.tencent.mm.c.a.aa();
    localaa.cHD.type = 1;
    com.tencent.mm.sdk.c.a.aGB().g(localaa);
    this.jrS.aWx();
    dg(-1L);
    if (this.jok == null)
    {
      super.onPause();
      return;
    }
    if (getContentView() != null);
    for (boolean bool = getContentView().isShown(); (aVK()) || ((!this.iJh) && (!this.iJk)); bool = false)
    {
      Object[] arrayOfObject1 = new Object[2];
      arrayOfObject1[0] = Boolean.valueOf(this.iJk);
      arrayOfObject1[1] = Boolean.valueOf(bool);
      z.i("!32@/B4Tb64lLpKwUcOR+EdWcmybqEj/+Vl/", "onPause fragment not foreground, hasPause:%b, chattingShow:%b", arrayOfObject1);
      super.onPause();
      return;
    }
    Object[] arrayOfObject2 = new Object[2];
    arrayOfObject2[0] = Integer.valueOf(hashCode());
    arrayOfObject2[1] = Boolean.valueOf(bool);
    z.i("!32@/B4Tb64lLpKwUcOR+EdWcmybqEj/+Vl/", "onPause %d, chattingShow:%b", arrayOfObject2);
    super.onPause();
    this.iJk = false;
    if (this.fpD != null)
    {
      if (!this.fpD.aCz())
        break label823;
      this.jsa = mb.juw;
      z.d("!32@/B4Tb64lLpKwUcOR+EdWcmybqEj/+Vl/", "jacks mark refreshKeyBordState keybord state: show");
    }
    while (true)
    {
      stopSignalling();
      if (this.jsE)
      {
        aVI();
        if (this.jsC != null)
          this.jsC.aVh();
      }
      if (com.tencent.mm.model.y.dE(aUL()))
        ((com.tencent.mm.plugin.voicereminder.a.f)bg.qF().eA(com.tencent.mm.plugin.voicereminder.a.f.class.getName())).b(this.gTa);
      this.jsW.aNu();
      this.fpD.onPause();
      aVT();
      bg.qY().mr();
      bg.ig().bY("");
      com.tencent.mm.ab.o.b(this.jtn);
      com.tencent.mm.ab.h.a(this);
      bg.qW().oV().h(this.joh);
      com.tencent.mm.ak.m.AL().a(this.joh);
      com.tencent.mm.platformtools.s.c(this);
      bg.qW().oQ().set(18, Integer.valueOf(this.fpD.getMode()));
      bg.qW().oQ().set(26, Boolean.valueOf(this.emf));
      Object[] arrayOfObject3 = new Object[2];
      arrayOfObject3[0] = Integer.valueOf(this.jsm);
      arrayOfObject3[1] = Integer.valueOf(this.fpD.getMode());
      z.d("!32@/B4Tb64lLpKwUcOR+EdWcmybqEj/+Vl/", "dkcm old:%d footer:%d ", arrayOfObject3);
      if (this.jsm != this.fpD.getMode())
      {
        this.jsm = this.fpD.getMode();
        com.tencent.mm.storage.r localr = bg.qW().oW().yE(aUL());
        if ((localr != null) && (aUL().equals(localr.getUsername())))
        {
          localr.bu(this.jsm);
          bg.qW().oW().a(localr, aUL());
        }
      }
      z.v("!32@/B4Tb64lLpKwUcOR+EdWcmybqEj/+Vl/", "record stop on pause");
      this.fpD.St();
      com.tencent.mm.sdk.platformtools.as.AP("keep_app_silent");
      com.tencent.mm.sdk.platformtools.as.AP("keep_chatting_silent" + aUL());
      this.jsL = this.fpD.aBU();
      this.joi.fh(false);
      this.joi.release();
      bg.qY().mA();
      aUy();
      com.tencent.mm.pluginsdk.g.axR().aG(false);
      if (com.tencent.mm.pluginsdk.g.axT() != null)
        com.tencent.mm.pluginsdk.g.axT().b(this);
      if (com.tencent.mm.pluginsdk.g.aya() != null)
        com.tencent.mm.pluginsdk.g.aya().b(this);
      if ((com.tencent.mm.g.a.cv(this.jnf.getType())) && (this.jnf.aIg()) && (this.enO != null))
      {
        com.tencent.mm.q.e locale = this.enO.tY();
        if ((locale != null) && (locale.ud()))
          com.tencent.mm.q.aa.va().uV();
        if (this.jrT != null)
          this.jrT.dismiss();
      }
      XF();
      bg.qX().b(411, this);
      com.tencent.mm.y.ap.yh().a(this);
      this.jsc.aNu();
      gt localgt = new gt();
      localgt.cLK.tn = false;
      com.tencent.mm.sdk.c.a.aGB().a(localgt, Looper.getMainLooper());
      z.d("!32@/B4Tb64lLpKwUcOR+EdWcmybqEj/+Vl/", "chattingui cancel pause auto download logic");
      if (this.fpD != null)
      {
        this.fpD.aBV();
        z.i("!32@/B4Tb64lLpKwUcOR+EdWcmybqEj/+Vl/", "removeTextChangeListener");
      }
      com.tencent.mm.sdk.c.a.aGB().b("RevokeMsg", this.diB);
      return;
      label823: this.jsa = mb.juv;
      z.d("!32@/B4Tb64lLpKwUcOR+EdWcmybqEj/+Vl/", "jacks mark refreshKeyBordState keybord state: hide");
    }
  }

  public final void onResume()
  {
    boolean bool1;
    if (getContentView() != null)
    {
      bool1 = getContentView().isShown();
      if (getView() == null)
        break label80;
    }
    label80: for (boolean bool2 = getView().isShown(); ; bool2 = false)
    {
      if (!aVK())
        break label85;
      Object[] arrayOfObject9 = new Object[2];
      arrayOfObject9[0] = Boolean.valueOf(bool1);
      arrayOfObject9[1] = Boolean.valueOf(bool2);
      z.i("!32@/B4Tb64lLpKwUcOR+EdWcmybqEj/+Vl/", "onResume fragment not foreground, return,  chatting contentview is show %b, viewShow %b", arrayOfObject9);
      super.onResume();
      return;
      bool1 = false;
      break;
    }
    label85: com.tencent.mm.c.a.aa localaa = new com.tencent.mm.c.a.aa();
    localaa.cHD.type = 0;
    com.tencent.mm.sdk.c.a.aGB().g(localaa);
    this.jrS.aWw();
    if (!this.iJh)
      LauncherUI.aPm().aPp();
    this.jsb = 0;
    if (!com.tencent.mm.plugin.exdevice.a.e(this.enO))
      Bu(null);
    Object[] arrayOfObject1 = new Object[3];
    arrayOfObject1[0] = Integer.valueOf(hashCode());
    arrayOfObject1[1] = Boolean.valueOf(bool1);
    arrayOfObject1[2] = Boolean.valueOf(bool2);
    z.i("!32@/B4Tb64lLpKwUcOR+EdWcmybqEj/+Vl/", "onResume %d,  chatting is show %b, viewShow %b", arrayOfObject1);
    long l = System.currentTimeMillis();
    super.onResume();
    aVB();
    if (com.tencent.mm.plugin.exdevice.a.e(this.enO))
    {
      Object[] arrayOfObject8 = new Object[1];
      arrayOfObject8[0] = aVW();
      z.i("!32@/B4Tb64lLpKwUcOR+EdWcmybqEj/+Vl/", "hardevice brand account, onresume: %s, notify switch view enter chattingui", arrayOfObject8);
      if (this.jtj == null)
        this.jtj = new com.tencent.mm.plugin.exdevice.a(this);
      this.jtj.a(1, this.enO);
    }
    this.jto = getStringExtra("smiley_product_id");
    label406: ChatFooter localChatFooter;
    if (this.fpD != null)
    {
      boolean bool6 = ((Boolean)bg.qW().oQ().get(66832, Boolean.valueOf(false))).booleanValue();
      Object[] arrayOfObject7 = new Object[1];
      arrayOfObject7[0] = Boolean.valueOf(bool6);
      z.d("!32@/B4Tb64lLpKwUcOR+EdWcmybqEj/+Vl/", "jacks refresh Footer Plugin Setting , Enable Enter Button: %B", arrayOfObject7);
      this.fpD.aCA();
      if (bool6)
      {
        this.fpD.aCf();
        this.fpD.aCd();
      }
      if ((!this.jom) && (!this.jsj))
        break label537;
      this.fpD.t(true, true);
      if (!this.jsj)
        break label569;
      this.fpD.dG(true);
      if (bool6)
        this.fpD.aBa();
      localChatFooter = this.fpD;
      com.tencent.mm.am.a.aCl();
      if ((!com.tencent.mm.z.b.ym()) && ((0x2000000 & com.tencent.mm.model.x.pO()) == 0))
        break label582;
    }
    label537: label569: label582: for (boolean bool7 = true; ; bool7 = false)
    {
      localChatFooter.dt(bool7);
      com.tencent.mm.am.a.aCl();
      if (!com.tencent.mm.am.a.to("location"))
        this.fpD.aCa();
      com.tencent.mm.am.a.aCl();
      if (aUL().equals(com.tencent.mm.model.x.pG()))
      {
        z.d("!32@/B4Tb64lLpKwUcOR+EdWcmybqEj/+Vl/", "cpan [initFooter] Is myself");
        this.fpD.dG(true);
        this.fpD.t(true, true);
      }
      if (bg.oE())
        break label588;
      z.w("!32@/B4Tb64lLpKwUcOR+EdWcmybqEj/+Vl/", "account not ready, mabey not call onDestroy!!!");
      finish();
      return;
      if ((0x400000 & com.tencent.mm.model.x.pO()) != 0);
      for (boolean bool8 = true; ; bool8 = false)
      {
        this.fpD.t(false, bool8);
        break;
      }
      this.fpD.dG(com.tencent.mm.am.a.aCl());
      break label406;
    }
    label588: if (this.fpD.aCz())
      keepSignalling();
    agh();
    this.iJk = true;
    this.jsW.cP(300000L);
    com.tencent.mm.storage.b localb;
    boolean bool5;
    label659: label684: String str5;
    label708: label724: boolean bool3;
    label857: int i;
    label897: label965: int n;
    label1021: boolean bool4;
    label1040: label1206: String str1;
    if (com.tencent.mm.model.y.dc(aUL()))
    {
      String str4 = aUL();
      localb = bg.qW().oZ().xS(str4);
      if (localb == null)
      {
        bool5 = false;
        this.jsq = bool5;
        if (!this.jsq)
          break label1802;
        com.tencent.mm.model.v.b(aUL(), this.jsr);
        StringBuilder localStringBuilder = new StringBuilder("chatroom display  ");
        if (!this.jsq)
          break label1814;
        str5 = "show ";
        z.d("!32@/B4Tb64lLpKwUcOR+EdWcmybqEj/+Vl/", str5);
        com.tencent.mm.sdk.platformtools.as.AO("keep_chatting_silent" + aUL());
        bg.ig().bY(aUL());
        MMAppMgr.cb(aUL());
        if (com.tencent.mm.model.y.dE(aUL()))
          ((com.tencent.mm.plugin.voicereminder.a.f)bg.qF().eA(com.tencent.mm.plugin.voicereminder.a.f.class.getName())).a(this.gTa);
        com.tencent.mm.ab.o.a(this.jtn);
        bg.qW().oV().g(this.joh);
        com.tencent.mm.ak.m.AL().a(this.joh, Looper.getMainLooper());
        com.tencent.mm.platformtools.s.b(this);
        aVw();
        af localaf = this.joi;
        if (this.emf)
          break label1857;
        bool3 = true;
        localaf.fg(bool3);
        this.joh.a(null, null);
        if ((this.jtk) || (this.jod) || (this.jsu))
          break label1863;
        i = 1;
        if (i != 0)
        {
          this.jtk = true;
          this.jtl = true;
          if ((!this.jod) && (!this.jsu))
            break label1869;
          Object[] arrayOfObject6 = new Object[2];
          arrayOfObject6[0] = Boolean.valueOf(this.jod);
          arrayOfObject6[1] = Boolean.valueOf(this.jsu);
          z.i("!32@/B4Tb64lLpKwUcOR+EdWcmybqEj/+Vl/", "From Show Search ChatResult %b, From Gloabl Search %b", arrayOfObject6);
        }
        this.fpD.a(this);
        if (this.jnf != null)
        {
          if ((ch.jb(this.jsL)) || (this.fpD == null))
            break label1959;
          if ((this.fpD.getMode() != 1) || (!ch.jb(this.jto)))
            break label1895;
          n = 1;
          if (n == 0)
            break label1901;
          if (this.fpD != null)
            this.fpD.aCo();
          if ((!this.iWI) || (!this.jsi))
            break label1908;
          this.jsi = false;
          String str2 = this.fpD.aBQ();
          if (!ch.jb(str2))
          {
            int i1 = this.fpD.aBS();
            if (i1 > this.jsL.length())
              i1 = this.jsL.length();
            String str3 = this.jsL.substring(0, i1) + str2 + " " + this.jsL.substring(i1, this.jsL.length());
            int i2 = 1 + (i1 + str2.length());
            this.fpD.vC(str3);
            this.fpD.d(str3, i2, false);
            this.fpD.vB(null);
            aep();
          }
        }
        if ((!ch.jb(this.jto)) && (this.fpD != null))
        {
          Object[] arrayOfObject5 = new Object[1];
          arrayOfObject5[0] = this.jto;
          z.d("!32@/B4Tb64lLpKwUcOR+EdWcmybqEj/+Vl/", "deal use smiley panel in product: %s", arrayOfObject5);
          getWindow().setSoftInputMode(18);
          this.fpD.vA(this.jto);
          this.fpD.aBO();
        }
        this.joi.aUv();
        if (jso)
        {
          jso = false;
          a(true, true, null);
        }
        this.fpD.le(this.jnf.getUsername());
        this.fpD.aCh();
        com.tencent.mm.pluginsdk.g.axR().aG(true);
        if (com.tencent.mm.pluginsdk.g.axT() != null)
          com.tencent.mm.pluginsdk.g.axT().a(this);
        if (com.tencent.mm.pluginsdk.g.aya() != null)
          com.tencent.mm.pluginsdk.g.aya().a(this);
        aWf();
        if (!com.tencent.mm.plugin.exdevice.a.e(this.enO))
          qp(-1);
        fu(false);
        if ((com.tencent.mm.g.a.cv(this.jnf.getType())) && (this.jnf.aIg()) && (this.enO != null))
        {
          com.tencent.mm.q.e locale = this.enO.tY();
          if ((locale != null) && (locale.ud()))
          {
            if ((com.tencent.mm.modelgeo.h.xm()) || (com.tencent.mm.modelgeo.h.xn()))
              break label1973;
            bool4 = true;
            label1450: if ((this.enO.field_hadAlert != 0) && ((!this.enO.ua()) || (!bool4)))
              break label2054;
            if ((this.enO.field_hadAlert != 0) || (!bool4))
              break label1979;
            int m = com.tencent.mm.n.byB;
            Object[] arrayOfObject4 = new Object[1];
            arrayOfObject4[0] = this.jnf.od();
            str1 = getString(m, arrayOfObject4);
            label1522: this.jrT = com.tencent.mm.ui.base.e.a(agh(), str1, getString(com.tencent.mm.n.buo), new ix(this, bool4), new iy(this));
          }
        }
      }
    }
    while (true)
    {
      if (this.enO.ub())
      {
        at.qx().ec(this.jnf.getUsername());
        com.tencent.mm.n.c.eM(this.jnf.getUsername());
      }
      if (this.enO.field_status == 1)
      {
        this.enO.field_status = 0;
        com.tencent.mm.q.aa.uY().b(this.enO);
      }
      z.v("Test", "KEVIN Chatting OnResume: " + (System.currentTimeMillis() - l));
      bg.qX().a(411, this);
      gt localgt = new gt();
      localgt.cLK.tn = true;
      com.tencent.mm.sdk.c.a.aGB().a(localgt, Looper.getMainLooper());
      z.d("!32@/B4Tb64lLpKwUcOR+EdWcmybqEj/+Vl/", "ChattingUI req pause auto download logic");
      if (this.fpD != null)
      {
        this.fpD.addTextChangedListener(new lx(this, (byte)0));
        z.i("!32@/B4Tb64lLpKwUcOR+EdWcmybqEj/+Vl/", "addTextChangedListener");
      }
      if (!com.tencent.mm.sdk.c.a.aGB().c("RevokeMsg", this.diB))
        com.tencent.mm.sdk.c.a.aGB().a("RevokeMsg", this.diB);
      if (this.fpD == null)
        break;
      this.fpD.bg(zj(), aUL());
      return;
      bool5 = localb.aId();
      break label659;
      label1802: this.jsr.clear();
      break label684;
      label1814: str5 = "not show";
      break label708;
      if (com.tencent.mm.model.y.dd(aUL()))
      {
        this.jsq = true;
        break label724;
      }
      this.jsq = false;
      this.jsr.clear();
      break label724;
      label1857: bool3 = false;
      break label857;
      label1863: i = 0;
      break label897;
      label1869: this.jth = false;
      this.jrQ.getViewTreeObserver().addOnGlobalLayoutListener(new is(this));
      break label965;
      label1895: n = 0;
      break label1021;
      label1901: aVx();
      break label1040;
      label1908: this.fpD.vC(this.jsL);
      this.fpD.vD(this.jsL);
      if (ch.jb(this.jsL))
        break label1206;
      this.fpD.q(Cm(this.jok), true);
      break label1206;
      label1959: if (this.fpD == null)
        break label1206;
      aVx();
      break label1206;
      label1973: bool4 = false;
      break label1450;
      label1979: if (bool4)
      {
        int k = com.tencent.mm.n.byC;
        Object[] arrayOfObject3 = new Object[1];
        arrayOfObject3[0] = this.jnf.od();
        str1 = getString(k, arrayOfObject3);
        break label1522;
      }
      int j = com.tencent.mm.n.byA;
      Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = this.jnf.od();
      str1 = getString(j, arrayOfObject2);
      break label1522;
      label2054: com.tencent.mm.q.aa.va().fI(aUL());
    }
  }

  public final void onStart()
  {
    bg.qW().px().a(new it(this));
    bg.qW().py().a(new iv(this));
    super.onStart();
  }

  public final void onStop()
  {
    bg.qW().px().a(null);
    bg.qW().py().a(null);
    super.onStop();
  }

  public final void openContextMenu(View paramView)
  {
    if (this.eQt == null)
      this.eQt = new ei(agh());
    this.eQt.b(paramView, this.fPK, this.fqj);
  }

  public final void qk(int paramInt)
  {
    Object[] arrayOfObject1 = new Object[3];
    arrayOfObject1[0] = Integer.valueOf(paramInt);
    arrayOfObject1[1] = Boolean.valueOf(this.jsE);
    arrayOfObject1[2] = Boolean.valueOf(this.jsG);
    z.v("!32@/B4Tb64lLpKwUcOR+EdWcmybqEj/+Vl/", "search result count %d, in edit mode %B, can report %B", arrayOfObject1);
    if ((!this.jst) && (!this.jsE))
    {
      z.d("!32@/B4Tb64lLpKwUcOR+EdWcmybqEj/+Vl/", "not search now");
      return;
    }
    if ((this.jsG) && (paramInt >= 0))
    {
      this.jsG = false;
      com.tencent.mm.plugin.f.c.n localn = com.tencent.mm.plugin.f.c.n.fTF;
      Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = Integer.valueOf(2);
      localn.d(10811, arrayOfObject2);
    }
    if (paramInt > 0)
    {
      this.jsx.setVisibility(0);
      this.jrQ.setVisibility(8);
      this.jsw.setVisibility(8);
      this.jsy.setVisibility(8);
      return;
    }
    if (paramInt == 0)
    {
      this.jsx.setVisibility(8);
      this.jrQ.setVisibility(8);
      this.jsw.setVisibility(0);
      this.jsy.setVisibility(8);
      return;
    }
    this.jsx.setVisibility(8);
    this.jrQ.setVisibility(0);
    this.jsw.setVisibility(8);
    this.jsy.setVisibility(0);
  }

  protected final void ql(int paramInt)
  {
    if (paramInt == 0)
    {
      localView = this.jrQ.getChildAt(this.jrQ.getFirstVisiblePosition());
      if ((localView != null) && (localView.getTop() == 0))
        this.ewp.aSp();
      this.jsc.aNu();
      this.jsc.cP(300L);
      aVp();
      if (this.joh != null)
        this.joh.notifyDataSetChanged();
      if ((this.jsT == null) || (!this.jsT.isShowing()));
    }
    while (paramInt != 2)
    {
      View localView;
      return;
      com.tencent.mm.c.a.aa localaa = new com.tencent.mm.c.a.aa();
      localaa.cHD.type = 5;
      localaa.cHD.cHF = this.jrQ.getFirstVisiblePosition();
      localaa.cHD.cHG = this.jrQ.getLastVisiblePosition();
      localaa.cHD.cHH = this.jrQ.getHeaderViewsCount();
      com.tencent.mm.sdk.c.a.aGB().g(localaa);
    }
    com.tencent.mm.at.d.aNZ().ap(ChattingUI.class.getName() + ".Listview", 4);
    this.jsc.aNu();
    com.tencent.mm.y.ap.yh().a(this);
  }

  public final void qm(int paramInt)
  {
    int i = ((Integer)bg.qP().get(35, Integer.valueOf(10))).intValue();
    LinkedList localLinkedList = new LinkedList();
    localLinkedList.add(aUL());
    if (i == -2)
    {
      if ((this.iWI) && ((paramInt == 1) || (paramInt == 2)))
      {
        Object[] arrayOfObject4 = new Object[1];
        arrayOfObject4[0] = Integer.valueOf(paramInt);
        z.d("!32@/B4Tb64lLpKwUcOR+EdWcmybqEj/+Vl/", "oreh old logic doDirectSend not support chatStatus:%d", arrayOfObject4);
        return;
      }
      Object[] arrayOfObject3 = new Object[1];
      arrayOfObject3[0] = Integer.valueOf(paramInt);
      z.d("!32@/B4Tb64lLpKwUcOR+EdWcmybqEj/+Vl/", "oreh old logic doDirectSend done chatStatus:%d", arrayOfObject3);
      com.tencent.mm.modelsimple.t localt2 = new com.tencent.mm.modelsimple.t(localLinkedList, j.aX(paramInt));
      bg.qX().d(localt2);
      return;
    }
    if ((this.iWI) || (com.tencent.mm.storage.i.ya(this.jnf.getUsername())) || (com.tencent.mm.storage.i.xY(this.jnf.getUsername())) || (this.jnf.aIg()))
    {
      z.d("!32@/B4Tb64lLpKwUcOR+EdWcmybqEj/+Vl/", "oreh doDirectSend not support");
      return;
    }
    long l = ch.ac(this.jsA);
    if ((i == -1) || (l > 1000L * i))
    {
      Object[] arrayOfObject1 = new Object[2];
      arrayOfObject1[0] = Long.valueOf(l / 1000L);
      arrayOfObject1[1] = Integer.valueOf(i);
      z.d("!32@/B4Tb64lLpKwUcOR+EdWcmybqEj/+Vl/", "oreh doDirectSend interval too long: %d;  interval: %d", arrayOfObject1);
      return;
    }
    Object[] arrayOfObject2 = new Object[2];
    arrayOfObject2[0] = Integer.valueOf(paramInt);
    arrayOfObject2[1] = Long.valueOf(l / 1000L);
    z.d("!32@/B4Tb64lLpKwUcOR+EdWcmybqEj/+Vl/", "oreh doDirectSend done chatStatus:%d, delt:%d", arrayOfObject2);
    com.tencent.mm.modelsimple.t localt1 = new com.tencent.mm.modelsimple.t(localLinkedList, j.aX(paramInt));
    bg.qX().d(localt1);
  }

  public final String qo(int paramInt)
  {
    com.tencent.mm.storage.ar localar = (com.tencent.mm.storage.ar)this.joh.getItem(paramInt);
    if ((com.tencent.mm.plugin.b.DK()) && (localar.aJM()));
    for (int i = 1; i != 0; i = 0)
      return at(localar.getContent(), localar.jK()) + "\n\n" + at(localar.kw(), localar.jK());
    return at(localar.getContent(), localar.jK());
  }

  public final void qp(int paramInt)
  {
    if (paramInt == -1)
      if (this.jtz != null)
      {
        this.jtz.setVisibility(8);
        qn(-2);
      }
    do
    {
      return;
      if (this.jtz == null)
      {
        qj(com.tencent.mm.i.aVE);
        this.jtz = ((LinearLayout)findViewById(com.tencent.mm.i.arX));
        this.jtz.getBackground().setAlpha(230);
        this.jtz.setOnClickListener(new hr(this));
      }
    }
    while (this.jtz == null);
    this.jtz.setVisibility(0);
    qn(2);
    this.jtz.setTag(Integer.valueOf(paramInt));
  }

  protected final void releaseWakeLock()
  {
    this.jrQ.setKeepScreenOn(false);
  }

  public final void stopSignalling()
  {
    bg.qX().d(new ce(new lm(this)));
  }

  public final boolean tv()
  {
    return this.jtt;
  }

  public final void uK(String paramString)
  {
    if (paramString.equals(this.jnf.getUsername()))
      aWf();
  }

  public final String zj()
  {
    StringBuilder localStringBuilder1 = new StringBuilder("getSender ");
    boolean bool;
    StringBuilder localStringBuilder2;
    if (this.jne == null)
    {
      bool = true;
      localStringBuilder2 = localStringBuilder1.append(bool).append(" ");
      if (this.jne != null)
        break label75;
    }
    label75: for (String str = com.tencent.mm.model.x.pG(); ; str = this.jne.getName())
    {
      z.d("!32@/B4Tb64lLpKwUcOR+EdWcmybqEj/+Vl/", str);
      if (this.jne != null)
        break label87;
      return com.tencent.mm.model.x.pG();
      bool = false;
      break;
    }
    label87: return this.jne.getName();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.hd
 * JD-Core Version:    0.6.2
 */