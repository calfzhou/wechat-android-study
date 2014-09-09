package com.tencent.mm.ui.voicetranstext;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.text.ClipboardManager;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewConfiguration;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.tencent.mm.k;
import com.tencent.mm.model.bg;
import com.tencent.mm.modelvoice.bm;
import com.tencent.mm.modelvoice.bq;
import com.tencent.mm.modelvoice.br;
import com.tencent.mm.modelvoice.bs;
import com.tencent.mm.modelvoice.cb;
import com.tencent.mm.o.ac;
import com.tencent.mm.o.x;
import com.tencent.mm.protocal.a.adu;
import com.tencent.mm.protocal.a.aev;
import com.tencent.mm.protocal.a.vh;
import com.tencent.mm.sdk.c.g;
import com.tencent.mm.sdk.platformtools.ay;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.cm;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.aw;
import com.tencent.mm.storage.ct;
import com.tencent.mm.storage.cu;
import com.tencent.mm.ui.MMActivity;

public class VoiceTransTextUI extends MMActivity
  implements View.OnClickListener, com.tencent.mm.o.m
{
  private final String TAG = "!44@/B4Tb64lLpJSXpfhstDS95++mWTUEpjt6Fx5SFp9Yf8=";
  private int dZ;
  private View eyC = null;
  private long fNH = 0L;
  private long gjL;
  private Button iXQ = null;
  private View jZY = null;
  private View jZZ = null;
  private ScrollView jqV = null;
  private boolean jra = false;
  private boolean jrb = false;
  private LinearLayout kaa = null;
  private TextView kab = null;
  private a kac;
  private c kad;
  private b kae;
  private volatile boolean kaf = false;
  private ay kag;
  private int kah = 6;
  private boolean kai = false;
  private boolean kaj = false;
  private br kak;
  private ct kal;
  private ar kam;
  private com.tencent.mm.modelvoice.b kan;
  private g kao;
  private int kap;
  private int kaq;
  private View.OnTouchListener kar;
  private View.OnClickListener kas = new e(this);
  private ClipboardManager kat;
  private View.OnLongClickListener kau = new f(this);
  private cm mHandler = new l(this);
  private int mLastY;

  private void DB(String paramString)
  {
    this.kai = true;
    if (!ch.jb(paramString))
    {
      cu localcu = bm.BE();
      ct localct = new ct();
      localct.field_msgId = this.gjL;
      String str = bck();
      if (!ch.jb(str))
        localct.field_cmsgId = str;
      localct.field_content = paramString;
      localcu.a(localct);
    }
    H(q.kaH, paramString);
  }

  private void H(int paramInt, String paramString)
  {
    switch (o.kaB[(paramInt - 1)])
    {
    default:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      if ((paramInt != q.kaH) && (paramInt != q.kaJ))
        break label225;
      this.jqV.setOnTouchListener(this.kar);
      this.eyC.setOnClickListener(this.kas);
      return;
      if (ch.jb(paramString))
      {
        paramInt = q.kaJ;
        paramString = null;
        break;
      }
      this.kaa.setVisibility(0);
      this.jZY.setVisibility(8);
      this.iXQ.setVisibility(4);
      this.jZZ.setVisibility(8);
      this.kab.setText(paramString);
      go(true);
      continue;
      this.kaa.setVisibility(0);
      this.jZY.setVisibility(0);
      this.iXQ.setVisibility(0);
      if (paramString != null)
      {
        this.kab.setText(paramString);
        go(false);
        continue;
        this.kaa.setVisibility(8);
        this.jZY.setVisibility(8);
        this.iXQ.setHeight(0);
        this.iXQ.setVisibility(8);
        this.jZZ.setVisibility(0);
      }
    }
    label225: this.jqV.setOnTouchListener(null);
    this.eyC.setOnClickListener(null);
  }

  private void bcj()
  {
    z.d("!44@/B4Tb64lLpJSXpfhstDS95++mWTUEpjt6Fx5SFp9Yf8=", "cancel all net");
    if (this.kac != null)
    {
      bg.qX().c(this.kac);
      bg.qX().b(this.kac.getType(), this);
    }
    if (this.kad != null)
    {
      bg.qX().c(this.kad);
      bg.qX().b(this.kad.getType(), this);
    }
    if (this.kae != null)
    {
      bg.qX().c(this.kae);
      bg.qX().b(this.kae.getType(), this);
    }
  }

  private String bck()
  {
    if (this.kak != null)
      return this.kak.BN();
    return this.kam.kt() + this.kam.kk() + "T" + this.kam.kn();
  }

  private com.tencent.mm.modelvoice.b bcl()
  {
    if (this.kan == null)
    {
      if (this.kak == null)
        break label33;
      this.kan = bs.iw(this.kak.getFileName());
    }
    while (true)
    {
      return this.kan;
      label33: if (this.kam != null)
        this.kan = bs.iw(this.kam.kp());
      else
        z.d("!44@/B4Tb64lLpJSXpfhstDS95++mWTUEpjt6Fx5SFp9Yf8=", "error why get fileOperator, already has transContent. ");
    }
  }

  private String getFileName()
  {
    if (this.kak != null)
      return this.kak.getFileName();
    return this.kam.kp();
  }

  private void go(boolean paramBoolean)
  {
    if ((this.jqV == null) || (this.kaa == null))
      return;
    this.mHandler.postDelayed(new m(this, paramBoolean), 5L);
  }

  private long kl()
  {
    if (this.kak == null)
      return -1L;
    return this.kak.kl();
  }

  private void rA(int paramInt)
  {
    bcj();
    switch (o.kaA[(paramInt - 1)])
    {
    default:
      return;
    case 1:
      z.i("!44@/B4Tb64lLpJSXpfhstDS95++mWTUEpjt6Fx5SFp9Yf8=", "net check");
      if (kl() > 0L)
      {
        Object[] arrayOfObject2 = new Object[1];
        arrayOfObject2[0] = Long.valueOf(kl());
        z.i("!44@/B4Tb64lLpJSXpfhstDS95++mWTUEpjt6Fx5SFp9Yf8=", "has msg svr id: %d", arrayOfObject2);
      }
      for (this.kac = new a(bck(), sp(), bcl().getFormat(), kl(), getFileName()); ; this.kac = new a(bck(), sp(), getFileName()))
      {
        bg.qX().d(this.kac);
        bg.qX().a(this.kac.getType(), this);
        if (this.kao != null)
          break;
        if (this.kao == null)
          this.kao = new j(this);
        com.tencent.mm.sdk.c.a.aGB().a("NotifyCanPullVoiceTransRes", this.kao);
        return;
        Object[] arrayOfObject1 = new Object[1];
        arrayOfObject1[0] = Long.valueOf(kl());
        z.i("!44@/B4Tb64lLpJSXpfhstDS95++mWTUEpjt6Fx5SFp9Yf8=", "not existex msg svr id: %d", arrayOfObject1);
      }
    case 2:
      z.i("!44@/B4Tb64lLpJSXpfhstDS95++mWTUEpjt6Fx5SFp9Yf8=", "net upload");
      if (this.kac == null)
      {
        z.d("!44@/B4Tb64lLpJSXpfhstDS95++mWTUEpjt6Fx5SFp9Yf8=", "request upload must after check!");
        return;
      }
      if (bcl() == null)
      {
        z.d("!44@/B4Tb64lLpJSXpfhstDS95++mWTUEpjt6Fx5SFp9Yf8=", "can't get FileOperator!");
        return;
      }
      this.kad = new c(bck(), this.kac.bcd(), bcl().getFormat(), getFileName());
      bg.qX().d(this.kad);
      bg.qX().a(this.kad.getType(), this);
      return;
    case 3:
      z.i("!44@/B4Tb64lLpJSXpfhstDS95++mWTUEpjt6Fx5SFp9Yf8=", "net upload more");
      if (this.kad == null)
      {
        z.d("!44@/B4Tb64lLpJSXpfhstDS95++mWTUEpjt6Fx5SFp9Yf8=", "upload more need has upload netScene!");
        return;
      }
      this.kad = new c(this.kad);
      bg.qX().d(this.kad);
      bg.qX().a(this.kad.getType(), this);
      return;
    case 4:
    }
    this.kaj = false;
    if (this.kaf)
    {
      z.i("!44@/B4Tb64lLpJSXpfhstDS95++mWTUEpjt6Fx5SFp9Yf8=", "pulling so pass");
      return;
    }
    z.i("!44@/B4Tb64lLpJSXpfhstDS95++mWTUEpjt6Fx5SFp9Yf8=", "net get");
    if (this.kac == null)
    {
      z.d("!44@/B4Tb64lLpJSXpfhstDS95++mWTUEpjt6Fx5SFp9Yf8=", "request get must after check!");
      return;
    }
    this.kaf = true;
    this.kae = new b(bck());
    bg.qX().d(this.kae);
    bg.qX().a(this.kae.getType(), this);
  }

  private int sp()
  {
    if (this.kak != null)
      return this.kak.sp();
    return bq.id(this.kam.kp());
  }

  protected final void DP()
  {
    oP(com.tencent.mm.n.com);
    this.iXQ.setOnClickListener(this);
    if ((this.kal != null) && (!ch.jb(this.kal.field_content)))
    {
      H(q.kaH, this.kal.field_content);
      if ((this.jqV != null) && (this.kaa != null));
    }
    for (int i = 1; ; i = 0)
    {
      if (i == 0)
        break label97;
      return;
      this.mHandler.postDelayed(new n(this), 5L);
      break;
    }
    label97: H(q.kaI, null);
    rA(p.kaC);
  }

  public final void a(int paramInt1, int paramInt2, String paramString, x paramx)
  {
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      switch (paramx.getType())
      {
      default:
      case 546:
      case 547:
      case 548:
      }
      int i;
      do
      {
        do
        {
          return;
          if (this.kac.getState() == a.jZS)
          {
            z.i("!44@/B4Tb64lLpJSXpfhstDS95++mWTUEpjt6Fx5SFp9Yf8=", "check result: done");
            boolean bool2 = this.kac.bcg();
            String str3 = null;
            if (bool2)
              str3 = this.kac.bcc().ixB;
            DB(str3);
            return;
          }
          if (this.kac.getState() == a.jZR)
          {
            if ((this.kac.bcc() != null) && (ch.jb(this.kac.bcc().ixB)))
              H(q.kaI, this.kac.bcc().ixB);
            z.i("!44@/B4Tb64lLpJSXpfhstDS95++mWTUEpjt6Fx5SFp9Yf8=", "check result: processing");
            rA(p.kaF);
            return;
          }
          if (this.kac.getState() == a.jZQ)
          {
            z.i("!44@/B4Tb64lLpJSXpfhstDS95++mWTUEpjt6Fx5SFp9Yf8=", "check result: not exist");
            rA(p.kaD);
            return;
          }
        }
        while (this.kac.bce() == null);
        this.kah = this.kac.bce().iqg;
        return;
        if (this.kad.bci())
        {
          z.i("!44@/B4Tb64lLpJSXpfhstDS95++mWTUEpjt6Fx5SFp9Yf8=", "succeed upload");
          rA(p.kaF);
          return;
        }
        Object[] arrayOfObject3 = new Object[2];
        arrayOfObject3[0] = Integer.valueOf(this.kad.bcd().hUu);
        arrayOfObject3[1] = Integer.valueOf(this.kad.bcd().hQs);
        z.d("!44@/B4Tb64lLpJSXpfhstDS95++mWTUEpjt6Fx5SFp9Yf8=", "start upload more: start:%d, len:%d", arrayOfObject3);
        rA(p.kaE);
        return;
        this.kah = this.kae.getInterval();
        this.kaf = false;
        if ((!this.kae.isComplete()) && (this.kae.bcg()))
        {
          String str2 = this.kae.bcc().ixB;
          H(q.kaI, str2);
          Object[] arrayOfObject2 = new Object[1];
          arrayOfObject2[0] = this.kae.bcc().ixB;
          z.d("!44@/B4Tb64lLpJSXpfhstDS95++mWTUEpjt6Fx5SFp9Yf8=", "result valid:%s", arrayOfObject2);
        }
        while (this.kae.isComplete())
        {
          z.i("!44@/B4Tb64lLpJSXpfhstDS95++mWTUEpjt6Fx5SFp9Yf8=", "succeed get");
          boolean bool1 = this.kae.bcg();
          String str1 = null;
          if (bool1)
            str1 = this.kae.bcc().ixB;
          DB(str1);
          return;
          if (!this.kae.bcg())
            z.d("!44@/B4Tb64lLpJSXpfhstDS95++mWTUEpjt6Fx5SFp9Yf8=", "result not valid");
        }
        if (this.kaj)
        {
          z.i("!44@/B4Tb64lLpJSXpfhstDS95++mWTUEpjt6Fx5SFp9Yf8=", "do get now! --- Notify new result");
          rA(p.kaF);
          return;
        }
        Object[] arrayOfObject1 = new Object[1];
        arrayOfObject1[0] = Integer.valueOf(this.kah);
        z.i("!44@/B4Tb64lLpJSXpfhstDS95++mWTUEpjt6Fx5SFp9Yf8=", "do get again after:%ds", arrayOfObject1);
        i = this.kah;
      }
      while (this.kai);
      if (this.kag == null)
        this.kag = new ay(new i(this, i), false);
      this.kag.cP(i * 1000);
      return;
    }
    this.kai = true;
    H(q.kaJ, null);
  }

  protected final int getLayoutId()
  {
    return k.bpf;
  }

  public void onClick(View paramView)
  {
    finish();
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.dZ = ViewConfiguration.get(aPI()).getScaledTouchSlop();
    this.kat = ((ClipboardManager)getSystemService("clipboard"));
    this.eyC = findViewById(com.tencent.mm.i.aWm);
    this.jZY = findViewById(com.tencent.mm.i.aWh);
    this.jZZ = findViewById(com.tencent.mm.i.aWl);
    this.kab = ((TextView)findViewById(com.tencent.mm.i.aWj));
    this.iXQ = ((Button)findViewById(com.tencent.mm.i.aWi));
    this.kaa = ((LinearLayout)findViewById(com.tencent.mm.i.aWk));
    this.jqV = ((ScrollView)findViewById(com.tencent.mm.i.auD));
    this.kar = new h(this);
    this.kab.setOnLongClickListener(this.kau);
    this.kab.setOnClickListener(this.kas);
    this.gjL = getIntent().getExtras().getLong("voice_trans_text_msg_id", -1L);
    int i;
    if (this.gjL < 0L)
      i = 0;
    while (true)
      if (i == 0)
      {
        z.d("!44@/B4Tb64lLpJSXpfhstDS95++mWTUEpjt6Fx5SFp9Yf8=", "error invalid msgId");
        return;
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = Long.valueOf(this.gjL);
        z.i("!44@/B4Tb64lLpJSXpfhstDS95++mWTUEpjt6Fx5SFp9Yf8=", "msg Id:%d", arrayOfObject);
        this.kal = bm.BE().db(this.gjL);
        if ((this.kal != null) && (!ch.jb(this.kal.field_content)))
        {
          z.i("!44@/B4Tb64lLpJSXpfhstDS95++mWTUEpjt6Fx5SFp9Yf8=", "get voiceTransText");
          i = 1;
        }
        else
        {
          String str = getIntent().getExtras().getString("voice_trans_text_img_path");
          if (ch.jb(str))
          {
            i = 0;
          }
          else
          {
            this.kak = bm.BD().iG(str);
            if (this.kak != null)
            {
              z.i("!44@/B4Tb64lLpJSXpfhstDS95++mWTUEpjt6Fx5SFp9Yf8=", "get voiceInfo");
              i = 1;
            }
            else
            {
              this.kam = bg.qW().oV().cV(this.gjL);
              if (this.kam != null)
              {
                z.i("!44@/B4Tb64lLpJSXpfhstDS95++mWTUEpjt6Fx5SFp9Yf8=", "get MsgInfo");
                i = 1;
              }
            }
          }
        }
      }
      else
      {
        ActionBar localActionBar = aM();
        if (localActionBar != null)
          localActionBar.hide();
        DP();
        return;
        i = 0;
      }
  }

  protected void onDestroy()
  {
    bcj();
    if (this.kag != null)
      this.kag.aNu();
    if (this.kao != null)
    {
      com.tencent.mm.sdk.c.a.aGB().b("NotifyCanPullVoiceTransRes", this.kao);
      this.kao = null;
    }
    super.onDestroy();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.voicetranstext.VoiceTransTextUI
 * JD-Core Version:    0.6.2
 */