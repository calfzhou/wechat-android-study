package com.tencent.mm.ui.chatting;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.media.ToneGenerator;
import android.os.Looper;
import android.os.Vibrator;
import android.widget.ListView;
import com.tencent.mm.c.a.ii;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.x;
import com.tencent.mm.model.y;
import com.tencent.mm.modelvoice.aj;
import com.tencent.mm.modelvoice.at;
import com.tencent.mm.modelvoice.az;
import com.tencent.mm.modelvoice.bp;
import com.tencent.mm.n;
import com.tencent.mm.o.t;
import com.tencent.mm.plugin.voicereminder.a.p;
import com.tencent.mm.pluginsdk.ui.chat.ChatFooter;
import com.tencent.mm.pluginsdk.ui.chat.aq;
import com.tencent.mm.pluginsdk.ui.chat.l;
import com.tencent.mm.sdk.c.f;
import com.tencent.mm.sdk.platformtools.as;
import com.tencent.mm.sdk.platformtools.ay;
import com.tencent.mm.sdk.platformtools.cm;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.aw;
import com.tencent.mm.storage.i;
import com.tencent.mm.storage.o;
import com.tencent.mm.ui.base.en;

public final class bw
  implements aq
{
  private i elz;
  private final ay enH;
  private final ay enI;
  private final com.tencent.mm.o.s enL = new bx(this);
  private ToneGenerator eno;
  private ChatFooter fpD;
  private final t fpI = new by(this);
  private l fqq;
  private boolean iWI;
  private hd jmH;
  private ListView jog;
  private fn joh;
  private af joi;
  private com.tencent.mm.o.r joj;
  private String jok;
  private String jol;
  private boolean jom;
  private boolean jon;
  private volatile boolean joo = false;
  private volatile boolean jop = false;
  private boolean joq;
  private Object lock = new Object();
  private Vibrator vibrator;

  public bw(ListView paramListView, fn paramfn, hd paramhd, ChatFooter paramChatFooter, af paramaf, String paramString)
  {
    this.enH = new ay(new cc(this), bool1);
    this.joq = false;
    this.enI = new ay(new cd(this), bool1);
    this.fqq = new cf(this);
    this.jog = paramListView;
    this.joh = paramfn;
    this.jmH = paramhd;
    this.fpD = paramChatFooter;
    this.joi = paramaf;
    this.jok = paramString;
    this.elz = bg.qW().oT().ys(paramString);
    this.jom = paramhd.aUL().endsWith("@chatroom");
    this.jon = y.dd(paramhd.aUL());
    boolean bool2;
    if ((this.jom) || (this.jon))
      bool2 = bool1;
    while (true)
    {
      this.iWI = bool2;
      int i = this.jmH.aQh();
      int j = this.jmH.aQg();
      int k = (int)(100.0F * (i / j));
      try
      {
        this.eno = new ToneGenerator(3, k);
        label252: this.vibrator = ((Vibrator)paramhd.agh().getSystemService("vibrator"));
        new az();
        if (y.dD(this.jok))
        {
          this.joj = new p();
          z.i("!56@/B4Tb64lLpKwUcOR+EdWcty+WvCaqY0r1h+IytP2caAOFJMyUBO6MA==", "initRecorder new VoiceRemindRecorder()");
        }
        while (true)
        {
          this.joj.a(this.fpI);
          this.joj.a(this.enL);
          paramChatFooter.a(this.fqq);
          return;
          bool2 = false;
          break;
          String str = this.jok;
          if (y.dO(str));
          while (true)
          {
            if (!bool1)
              break label495;
            this.joj = new at(this.jmH.agh());
            z.i("!56@/B4Tb64lLpKwUcOR+EdWcty+WvCaqY0r1h+IytP2caAOFJMyUBO6MA==", "initRecorder new SceneVoice.SpeexRecorder(context)");
            break;
            i locali = bg.qW().oT().ys(str);
            if ((locali != null) && (locali.aIg()))
            {
              com.tencent.mm.q.a locala = com.tencent.mm.q.r.fE(locali.getUsername());
              if (locala != null)
              {
                com.tencent.mm.q.e locale = locala.tY();
                if ((locale != null) && (locale.un()))
                  z.d("!44@/B4Tb64lLpJBvWFKDfNn3TOt6sWO3dCgZMiofh1P5do=", "bizinfo name=" + locali.getUsername() + " canReceiveSpeexVoice");
              }
            }
            else
            {
              bool1 = false;
            }
          }
          label495: this.joj = new aj(this.jmH.agh());
          z.i("!56@/B4Tb64lLpKwUcOR+EdWcty+WvCaqY0r1h+IytP2caAOFJMyUBO6MA==", "initRecorder new SceneVoice.Recorder(context)");
        }
      }
      catch (Exception localException)
      {
        break label252;
      }
    }
  }

  private void aUJ()
  {
    this.jog.smoothScrollBy(0, 0);
  }

  private boolean aUK()
  {
    this.jmH.eB(true);
    this.jmH.eA(true);
    if (this.joj != null)
    {
      int j;
      int i;
      label71: boolean bool;
      long l;
      if (this.joj.tf())
        if ((this.elz.getUsername().equals("medianote")) && ((0x4000 & x.pK()) == 0))
        {
          j = 1;
          if (j == 0)
            break label230;
          i = 1;
          bool = this.joj.md();
          this.enH.aNu();
          this.enI.aNu();
          if (i != 0)
          {
            ar localar = new ar();
            localar.bJ("medianote");
            localar.setType(34);
            localar.bv(1);
            localar.bK(this.jol);
            localar.setStatus(2);
            localar.setContent(bp.a(x.pG(), this.joj.th(), false));
            localar.q(com.tencent.mm.model.bw.eo("medianote"));
            if (this.joj.ti() == 2)
              localar.bP("SOURCE_SILK_FILE");
            l = bg.qW().oV().y(localar);
            if (l > 0L)
              break label235;
            z.e("!56@/B4Tb64lLpKwUcOR+EdWcty+WvCaqY0r1h+IytP2caAOFJMyUBO6MA==", "insertLocalMsg fail");
          }
        }
      while (true)
      {
        as.AP("keep_app_silent");
        return bool;
        j = 0;
        break;
        label230: i = 0;
        break label71;
        label235: z.i("!56@/B4Tb64lLpKwUcOR+EdWcty+WvCaqY0r1h+IytP2caAOFJMyUBO6MA==", "insertLocalMsg success, msgId = " + l);
      }
    }
    z.i("!56@/B4Tb64lLpKwUcOR+EdWcty+WvCaqY0r1h+IytP2caAOFJMyUBO6MA==", "stopRecording recorder == null");
    return false;
  }

  @Deprecated
  @SuppressLint({"NewApi"})
  private void fi(boolean paramBoolean)
  {
    this.jog.postDelayed(new ce(this, true, paramBoolean), 10L);
  }

  private static void qe(int paramInt)
  {
    ii localii = new ii();
    localii.cMQ.state = paramInt;
    com.tencent.mm.sdk.c.a.aGB().g(localii);
  }

  private void releaseWakeLock()
  {
    this.jog.setKeepScreenOn(false);
  }

  public final boolean YQ()
  {
    synchronized (this.lock)
    {
      this.joo = true;
      if (!this.jop)
      {
        z.i("!56@/B4Tb64lLpKwUcOR+EdWcty+WvCaqY0r1h+IytP2caAOFJMyUBO6MA==", "jacks in voice rcd stop but not begin.");
        return false;
      }
    }
    this.jop = false;
    releaseWakeLock();
    if (!aUK())
    {
      this.fpD.aBT();
      z.i("!56@/B4Tb64lLpKwUcOR+EdWcty+WvCaqY0r1h+IytP2caAOFJMyUBO6MA==", "record stop on stop request setRcdTooShort");
    }
    while (true)
    {
      this.joi.aUr();
      this.jmH.qm(4);
      this.jmH.stopSignalling();
      qe(1);
      this.jmH.fn(false);
      return true;
      this.fpD.St();
      z.i("!56@/B4Tb64lLpKwUcOR+EdWcty+WvCaqY0r1h+IytP2caAOFJMyUBO6MA==", "record stop on stop request resetRcdStatus");
    }
  }

  public final boolean YS()
  {
    z.v("!56@/B4Tb64lLpKwUcOR+EdWcty+WvCaqY0r1h+IytP2caAOFJMyUBO6MA==", "record cancel on cancel request");
    synchronized (this.lock)
    {
      this.joo = true;
      if (!this.jop)
      {
        z.i("!56@/B4Tb64lLpKwUcOR+EdWcty+WvCaqY0r1h+IytP2caAOFJMyUBO6MA==", "jacks in voice rcd stop but not begin.");
        return false;
      }
    }
    this.jop = false;
    releaseWakeLock();
    this.jmH.eB(true);
    this.jmH.eA(true);
    if (this.joj != null)
    {
      this.joj.cancel();
      this.enH.aNu();
      this.enI.aNu();
    }
    this.fpD.St();
    this.joi.aUr();
    this.jmH.qm(4);
    this.jmH.stopSignalling();
    qe(1);
    this.jmH.fn(false);
    return true;
  }

  public final boolean YT()
  {
    if (!bg.qW().isSDCardAvailable())
    {
      en.cp(this.jmH.agh());
      z.e("!56@/B4Tb64lLpKwUcOR+EdWcty+WvCaqY0r1h+IytP2caAOFJMyUBO6MA==", "onVoiceRcdStartRequest isSDCardAvailable() failed and return.");
      return false;
    }
    if (!com.tencent.mm.compatible.g.s.nU())
      com.tencent.mm.ui.base.e.a(this.jmH.agh(), this.jmH.getString(n.cBR), this.jmH.getString(n.cBL), this.jmH.getString(n.cBN), true, new bz(this));
    if (this.joj != null)
    {
      if (this.eno != null)
        this.eno.startTone(24);
      this.jog.postDelayed(new cb(this), 200L);
    }
    synchronized (this.lock)
    {
      this.joo = false;
      new cm(Looper.myLooper()).postDelayed(new ca(this), 200L);
      return true;
    }
  }

  public final void YU()
  {
    fi(false);
    aUJ();
  }

  public final void YV()
  {
    fi(false);
    aUJ();
  }

  public final void YW()
  {
    fi(false);
    aUJ();
  }

  public final String aUL()
  {
    if ((this.elz != null) && (i.yc(this.elz.getUsername())))
      return this.jok;
    if (this.elz == null)
      return null;
    return this.elz.getUsername();
  }

  protected final void acquireWakeLock()
  {
    this.jog.setKeepScreenOn(true);
  }

  public final void by(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      this.jmH.keepSignalling();
      return;
    }
    this.jmH.stopSignalling();
  }

  public final void onPause()
  {
    aUK();
    this.enH.aNu();
    this.enI.aNu();
  }

  public final boolean oy(String paramString)
  {
    fi(false);
    aUJ();
    return this.jmH.Cn(paramString);
  }

  public final void release()
  {
    if (this.eno != null)
      this.eno.release();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.bw
 * JD-Core Version:    0.6.2
 */