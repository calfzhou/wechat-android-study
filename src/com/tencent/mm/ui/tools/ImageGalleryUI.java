package com.tencent.mm.ui.tools;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v4.view.bz;
import android.support.v7.app.ActionBarActivity;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewStub;
import android.view.Window;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.mm.ak.q;
import com.tencent.mm.c.a.ib;
import com.tencent.mm.c.a.w;
import com.tencent.mm.h;
import com.tencent.mm.i;
import com.tencent.mm.k;
import com.tencent.mm.model.bg;
import com.tencent.mm.n;
import com.tencent.mm.o.ac;
import com.tencent.mm.sdk.c.f;
import com.tencent.mm.sdk.c.g;
import com.tencent.mm.sdk.platformtools.ay;
import com.tencent.mm.sdk.platformtools.az;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.aw;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.MMViewPager;
import com.tencent.mm.ui.base.cm;
import com.tencent.mm.ui.base.e;
import com.tencent.mm.y.l;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import junit.framework.Assert;

public class ImageGalleryUI extends MMActivity
  implements View.OnClickListener, az
{
  private long cDM;
  private String cEh;
  private String cLi;
  protected MMViewPager eXF;
  private boolean exV = false;
  private ei fez;
  private String gCp;
  private String gCs;
  private g gCu = new da(this);
  private g gCv = new df(this);
  private bt jOZ;
  private final boolean jQS = false;
  private RelativeLayout jRU;
  private View jRV;
  private Button jSg;
  private Button jSh;
  private View jSi;
  private View jSj;
  private TextView jSk;
  private ImageView jSl;
  private FrameLayout jSm;
  ColorDrawable jSn;
  ArrayList jSo = new ArrayList();
  protected boolean jSp = false;
  protected boolean jSq = false;
  Bundle jSr;
  private boolean jSs = true;
  private cm jSt = new db(this);
  private boolean jSu = true;
  private int jSv = 0;
  private bz jSw = new dc(this);
  private HashMap jSx = new HashMap();
  private ay jSy;
  private boolean jSz = false;

  private static int aE(View paramView)
  {
    if (paramView != null)
      return paramView.getVisibility();
    return 8;
  }

  private ImageGalleryUI ban()
  {
    if (this.jRV == null)
    {
      this.jRV = ((ViewStub)findViewById(i.axR)).inflate();
      this.jSg = ((Button)this.jRV.findViewById(i.apj));
      this.jSh = ((Button)this.jRV.findViewById(i.bOb));
      this.jSi = this.jRV.findViewById(i.bOc);
    }
    return this;
  }

  private ImageGalleryUI bao()
  {
    if (this.jSj == null)
    {
      this.jSj = ((ViewStub)findViewById(i.aUT)).inflate();
      this.jSl = ((ImageView)this.jSj.findViewById(i.aVk));
      this.jSk = ((TextView)this.jSj.findViewById(i.aVl));
    }
    return this;
  }

  private ImageGalleryUI bap()
  {
    if (this.jSm == null)
      this.jSm = ((FrameLayout)((ViewStub)findViewById(i.awM)).inflate());
    return this;
  }

  private String baq()
  {
    if ((this.cLi != null) && (this.cLi.length() > 0))
      return this.cLi;
    return this.cEh;
  }

  private void bar()
  {
    if (this.jOZ == null);
    while ((!this.jOZ.baf()) || (bap().jSm == null))
      return;
    bap().jSm.setVisibility(0);
  }

  private void bau()
  {
    if ((bap().jSm == null) || (this.jSz))
      return;
    bap().jSm.startAnimation(rf(300));
    this.jSz = true;
  }

  private void bav()
  {
    if ((bap().jSm == null) || (!this.jSz))
      return;
    Object[] arrayOfObject = new Object[1];
    if (bap().jSm.getVisibility() == 0);
    for (boolean bool = true; ; bool = false)
    {
      arrayOfObject[0] = Boolean.valueOf(bool);
      z.d("!32@/B4Tb64lLpJSmuQVFTi9B2JvKOm4MTV5", "fadeInEnterGirdBtn: %B", arrayOfObject);
      FrameLayout localFrameLayout = bap().jSm;
      AlphaAnimation localAlphaAnimation = new AlphaAnimation(0.0F, 1.0F);
      localAlphaAnimation.setDuration(150L);
      localAlphaAnimation.setFillAfter(true);
      localFrameLayout.startAnimation(localAlphaAnimation);
      this.jSz = false;
      return;
    }
  }

  private void bax()
  {
    z.d("!32@/B4Tb64lLpJSmuQVFTi9B2JvKOm4MTV5", "jacks stop Hide Timer");
    this.jSy.aNu();
  }

  private boolean d(ar paramar, l paraml)
  {
    try
    {
      if ((bt.b(paramar, paraml) == 0) && (paraml.xR()))
      {
        boolean bool = paramar.aJL();
        if (!bool)
          return true;
      }
    }
    catch (NullPointerException localNullPointerException)
    {
      z.e("!32@/B4Tb64lLpJSmuQVFTi9B2JvKOm4MTV5", "error:" + localNullPointerException);
    }
    return false;
  }

  private void gd(boolean paramBoolean)
  {
    if (this.jOZ == null);
    ar localar;
    l locall;
    do
    {
      do
      {
        q localq;
        do
        {
          do
          {
            return;
            if (!this.jSu)
            {
              z.w("!32@/B4Tb64lLpJSmuQVFTi9B2JvKOm4MTV5", "jacks fail downloaded img, return");
              return;
            }
          }
          while (this.jSv < 0);
          localar = this.jOZ.qP(this.jSv);
          if (this.jOZ.ae(localar))
          {
            z.w("!32@/B4Tb64lLpJSmuQVFTi9B2JvKOm4MTV5", "jacks downloading, return");
            return;
          }
          if (!bt.ad(localar))
            break;
          localq = dm.aj(localar);
        }
        while ((localq == null) || ((localq.getStatus() != 199) && (localq.getStatus() != 199)));
        ArrayList localArrayList1 = new ArrayList();
        ArrayList localArrayList2 = new ArrayList();
        localArrayList1.add(Integer.valueOf(0));
        localArrayList2.add(getString(n.cai));
        localArrayList1.add(Integer.valueOf(1));
        localArrayList2.add(getString(n.cca));
        if (com.tencent.mm.am.a.to("favorite"))
        {
          localArrayList1.add(Integer.valueOf(2));
          localArrayList2.add(getString(n.bUO));
        }
        if (this.gCs != null)
        {
          localArrayList1.add(Integer.valueOf(3));
          localArrayList2.add(getString(n.cDW));
        }
        if (this.fez == null)
          this.fez = new ei(aPI());
        this.fez.a(new dk(this, localArrayList1, localArrayList2));
        this.fez.b(this.jSt);
        this.fez.c(new dl(this));
        e.a(aPI(), this.fez.baG());
      }
      while ((!bt.ac(localar)) || (true != paramBoolean) || (bg.qX().tw() == 0));
      locall = this.jOZ.a(localar, true);
    }
    while (locall == null);
    ib localib = new ib();
    String str = ck.a(localar, locall, false);
    localib.cME.filePath = str;
    this.gCp = str;
    com.tencent.mm.sdk.c.a.aGB().g(localib);
  }

  private void rd(int paramInt)
  {
    if (!this.jSp)
    {
      finish();
      overridePendingTransition(com.tencent.mm.b.Mz, com.tencent.mm.b.MA);
    }
    while (true)
    {
      Intent localIntent = new Intent();
      localIntent.setClass(aPI(), ImageGalleryGridUI.class);
      localIntent.addFlags(67108864);
      localIntent.putExtra("kintent_intent_source", paramInt);
      localIntent.putExtra("kintent_talker", baq());
      localIntent.putExtra("kintent_image_count", this.jOZ.aPA());
      localIntent.putExtra("kintent_image_index", this.jOZ.jQL.qW(this.eXF.W()));
      localIntent.putIntegerArrayListExtra("kintent_downloaded_index_list", this.jSo);
      startActivity(localIntent);
      return;
      overridePendingTransition(0, com.tencent.mm.b.MA);
    }
  }

  private static Animation rf(int paramInt)
  {
    AlphaAnimation localAlphaAnimation = new AlphaAnimation(1.0F, 0.0F);
    localAlphaAnimation.setDuration(paramInt);
    localAlphaAnimation.setFillAfter(true);
    localAlphaAnimation.setInterpolator(new AccelerateInterpolator(10.0F));
    return localAlphaAnimation;
  }

  private static void u(View paramView, int paramInt)
  {
    if (paramView != null)
      paramView.setVisibility(paramInt);
  }

  protected final void DP()
  {
    this.jSy = new ay(this, false);
    this.exV = false;
    this.cEh = getIntent().getStringExtra("img_gallery_talker");
    this.jSp = getIntent().getBooleanExtra("img_gallery_enter_from_grid", false);
    String str1 = "!32@/B4Tb64lLpJSmuQVFTi9B2JvKOm4MTV5 initView, talker is null, stack = " + ch.aHN();
    if (this.cEh != null);
    boolean bool2;
    String str2;
    long l;
    for (boolean bool1 = true; ; bool1 = false)
    {
      Assert.assertTrue(str1, bool1);
      this.cLi = getIntent().getStringExtra("img_gallery_chatroom_name");
      bool2 = getIntent().getBooleanExtra("img_gallery_is_restransmit_after_download", false);
      str2 = getIntent().getStringExtra("img_gallery_directly_send_name");
      this.cDM = getIntent().getLongExtra("img_gallery_msg_id", 0L);
      l = getIntent().getLongExtra("img_gallery_msg_svr_id", 0L);
      if ((this.cDM > 0L) || (l > 0L))
        break;
      z.e("!32@/B4Tb64lLpJSmuQVFTi9B2JvKOm4MTV5", " initView, msgId is invalid, msgId = " + this.cDM + ", msgSvrId = " + l + ", stack = " + ch.aHN());
      finish();
      return;
    }
    if (this.cDM == 0L)
      this.cDM = bg.qW().oV().q(baq(), l).kk();
    this.jOZ = new bt(this, this.cDM, baq(), bool2, str2);
    this.jOZ.bae();
    this.jOZ.gc(getIntent().getBooleanExtra("start_chatting_ui", true));
    this.jOZ.jQR = new dg(this);
    this.jRU = ((RelativeLayout)findViewById(i.api));
    this.eXF = ((MMViewPager)findViewById(i.auH));
    this.eXF.setVerticalFadingEdgeEnabled(false);
    this.eXF.setHorizontalFadingEdgeEnabled(false);
    this.eXF.a(this.jSw);
    this.eXF.a(new dh(this));
    this.eXF.a(new di(this));
    this.eXF.l(1);
    this.eXF.a(this.jOZ);
    rc(100000);
    this.eXF.k(100000);
    bar();
    this.eXF.postDelayed(new dj(this), 150L);
  }

  public final void Do(String paramString)
  {
    if ((bao().jSk == null) || (paramString == null))
      return;
    bao().jSk.setText(paramString);
  }

  public final int W()
  {
    return this.eXF.W();
  }

  public final boolean aPE()
  {
    return true;
  }

  public final boolean ai(ar paramar)
  {
    if (this.jOZ == null);
    while ((!bt.ad(paramar)) || (paramar.kk() != this.jOZ.bag().kk()))
      return false;
    return true;
  }

  protected final void axa()
  {
    super.axa();
  }

  public final void bas()
  {
    u(this.jRV, 8);
    u(bao().jSj, 0);
  }

  public final boolean bat()
  {
    return (bao().jSl.getTag() != null) && (((Integer)bao().jSl.getTag()).intValue() == h.VX);
  }

  protected final void baw()
  {
    if ((aE(this.jRV) == 0) && (aE(this.jSg) == 0));
    for (int i = 1; (i != 0) || (!bt.ac(this.jOZ.bag())); i = 0)
      return;
    z.d("!32@/B4Tb64lLpJSmuQVFTi9B2JvKOm4MTV5", "jacks start Hide Timer");
    this.jSy.cP(6000L);
  }

  public final void bay()
  {
    bf(true);
    u(this.jSj, 8);
    ban().jRV.setVisibility(0);
    ban().jSg.setVisibility(8);
    ban().jSh.setVisibility(0);
    ban().jSi.setVisibility(8);
    bau();
    ban().jSh.setText("0%");
  }

  public final void baz()
  {
    bf(true);
    bf(true);
    Animation localAnimation = rf(1000);
    localAnimation.setAnimationListener(new de(this));
    u(this.jSj, 8);
    ban().jRV.setVisibility(0);
    ban().jSg.setVisibility(8);
    ban().jSh.setVisibility(8);
    ban().jSi.setVisibility(0);
    ban().jSi.startAnimation(localAnimation);
  }

  public final void bf(boolean paramBoolean)
  {
    int i = 8;
    if (((paramBoolean) && (this.jRU.getVisibility() == 0)) || ((!paramBoolean) && (this.jRU.getVisibility() == i)))
      return;
    RelativeLayout localRelativeLayout = this.jRU;
    if (paramBoolean)
      i = 0;
    localRelativeLayout.setVisibility(i);
    ActionBarActivity localActionBarActivity = aPI();
    if (paramBoolean);
    for (int j = com.tencent.mm.b.Mm; ; j = com.tencent.mm.b.Mn)
    {
      Animation localAnimation = AnimationUtils.loadAnimation(localActionBarActivity, j);
      this.jRU.startAnimation(localAnimation);
      return;
    }
  }

  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    if ((paramKeyEvent.getKeyCode() == 82) && (paramKeyEvent.getAction() == 1))
    {
      if (this.fez != null)
      {
        this.fez.dismiss();
        this.fez = null;
        return true;
      }
      gd(true);
      return true;
    }
    return super.dispatchKeyEvent(paramKeyEvent);
  }

  public final void e(int paramInt, ar paramar)
  {
    try
    {
      if (bt.ad(paramar))
      {
        bas();
        gf(true);
        q localq = dm.aj(paramar);
        if (localq == null);
        while (true)
        {
          return;
          bao().jSk.setText(this.jOZ.jQQ.a(paramInt, localq));
        }
      }
    }
    finally
    {
    }
    l locall = this.jOZ.a(paramar, false);
    u(this.jSj, 8);
    String str;
    Map localMap;
    int i;
    if (paramar.jK() == 0)
    {
      this.eXF.W();
      if ((d(paramar, locall)) && (!paramar.aJL()))
      {
        ban().jSg.setVisibility(0);
        ban().jSh.setVisibility(8);
        ban().jSi.setVisibility(8);
        str = (String)this.jSx.get(Long.valueOf(locall.xM()));
        if (str == null)
        {
          localMap = x.bB(locall.xS(), "msg");
          if (localMap != null)
            break label280;
          Object[] arrayOfObject = new Object[1];
          arrayOfObject[0] = locall.xS();
          z.e("!32@/B4Tb64lLpJSmuQVFTi9B2JvKOm4MTV5", "parse cdnInfo failed. [%s]", arrayOfObject);
          i = -1;
          break label430;
        }
      }
    }
    while (true)
    {
      label225: this.jSx.put(Long.valueOf(locall.xM()), str);
      ban().jSg.setText(getString(n.bDT, new Object[] { str }));
      u(this.jRV, 0);
      break;
      label280: i = ch.getInt((String)localMap.get(".msg.img.$hdlength"), 0);
      label430: long l;
      do
      {
        Object localObject2;
        BigDecimal localBigDecimal = new BigDecimal(localObject2);
        float f1 = localBigDecimal.divide(new BigDecimal(1048576), 2, 0).floatValue();
        if (f1 > 1.0F)
        {
          str = (int)f1 + "M";
          break label225;
        }
        float f2 = localBigDecimal.divide(new BigDecimal(1024), 2, 0).floatValue();
        str = (int)f2 + "K";
        break label225;
        u(this.jRV, 8);
        break;
        l = i;
      }
      while (l >= 0L);
      str = "";
    }
  }

  public final void ge(boolean paramBoolean)
  {
    this.jSu = paramBoolean;
  }

  protected final int getLayoutId()
  {
    return k.bgI;
  }

  public final void gf(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      bao().jSl.setBackgroundResource(h.VY);
      bao().jSl.setTag(Integer.valueOf(h.VY));
      return;
    }
    bao().jSl.setBackgroundResource(h.VX);
    bao().jSl.setTag(Integer.valueOf(h.VX));
  }

  public final boolean kJ()
  {
    bau();
    return false;
  }

  public final long kk()
  {
    return this.cDM;
  }

  public void onBackPressed()
  {
    if (this.jSp)
    {
      rd(1);
      return;
    }
    try
    {
      finish();
      return;
    }
    catch (Exception localException)
    {
      z.e("!32@/B4Tb64lLpJSmuQVFTi9B2JvKOm4MTV5", localException.getMessage());
    }
  }

  public void onClick(View paramView)
  {
    if (paramView.getId() == i.awM)
      rd(0);
    do
    {
      return;
      if (paramView.getId() == i.apj)
      {
        bt localbt = this.jOZ;
        int i = this.eXF.W();
        localbt.jQP.ra(i);
        return;
      }
      if (paramView.getId() == i.cAE)
      {
        this.jOZ.qT(this.eXF.W());
        return;
      }
    }
    while (paramView.getId() != i.bOb);
    this.jOZ.qV(this.eXF.W());
    rc(this.eXF.W());
    bav();
    baw();
  }

  public void onCreate(Bundle paramBundle)
  {
    requestWindowFeature(1);
    long l = System.currentTimeMillis();
    this.jSs = true;
    super.onCreate(paramBundle);
    getWindow().setFlags(1024, 1024);
    this.jSn = new ColorDrawable(-16777216);
    DP();
    this.jSr = paramBundle;
    com.tencent.mm.sdk.c.a.aGB().a("RecogQBarOfImageFileResult", this.gCu);
    com.tencent.mm.sdk.c.a.aGB().a("NotifyDealQBarStrResult", this.gCv);
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Long.valueOf(System.currentTimeMillis() - l);
    z.d("!32@/B4Tb64lLpJSmuQVFTi9B2JvKOm4MTV5", "ImageGallery onCreate spent : %s", arrayOfObject);
  }

  protected void onDestroy()
  {
    if (this.jOZ != null)
    {
      this.jOZ.detach();
      this.jOZ = null;
    }
    bax();
    com.tencent.mm.sdk.c.a.aGB().b("RecogQBarOfImageFileResult", this.gCu);
    com.tencent.mm.sdk.c.a.aGB().b("NotifyDealQBarStrResult", this.gCv);
    super.onDestroy();
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt == 82)
      return true;
    return super.onKeyDown(paramInt, paramKeyEvent);
  }

  protected void onPause()
  {
    super.onPause();
    if (this.jOZ != null)
      this.jOZ.jQQ.baA();
    if (this.gCs != null)
    {
      w localw = new w();
      localw.cHz.cHB = this;
      localw.cHz.cHA = this.gCs;
      com.tencent.mm.sdk.c.a.aGB().g(localw);
      this.gCs = null;
    }
  }

  protected void onResume()
  {
    super.onResume();
    if ((!this.jSs) && (this.jOZ != null))
      rc(this.eXF.W());
    this.jSs = false;
  }

  public void onStart()
  {
    this.jSq = getIntent().getBooleanExtra("img_gallery_back_from_grid", false);
    super.onStart();
  }

  public final void rc(int paramInt)
  {
    e(paramInt, this.jOZ.qP(paramInt));
  }

  public final void re(int paramInt)
  {
    if (bao().jSk == null)
      return;
    bao().jSk.post(new dd(this, paramInt));
  }

  public final void rg(int paramInt)
  {
    bf(true);
    u(this.jSj, 8);
    ban().jRV.setVisibility(0);
    ban().jSg.setVisibility(8);
    ban().jSh.setVisibility(0);
    ban().jSi.setVisibility(8);
    bau();
    ban().jSh.setText(paramInt + "%");
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.ImageGalleryUI
 * JD-Core Version:    0.6.2
 */