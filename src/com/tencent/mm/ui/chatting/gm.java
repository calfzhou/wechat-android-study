package com.tencent.mm.ui.chatting;

import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.tencent.mm.b;
import com.tencent.mm.plugin.f.c.n;
import com.tencent.mm.pluginsdk.ui.chat.ChatFooter;
import com.tencent.mm.sdk.platformtools.bp;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.i;
import com.tencent.mm.ui.tools.fj;

public final class gm
{
  public static bp jrh = new bp(5, "!56@/B4Tb64lLpKwUcOR+EdWconoT4QVe0ZHl1mqxM9m75klvg8EeRcUAA==");
  private fj fqB;
  private boolean iWI;
  private i jnf;
  private hd joa;
  private fn job;
  private ChatFooter joc;
  private boolean jod = false;
  private boolean jqz = false;
  private ChattingFooterMoreBtnBar jri;
  private gv jrj;
  private ChatFooterCustom jrk;
  private Animation jrl;

  public gm(hd paramhd, ChattingFooterMoreBtnBar paramChattingFooterMoreBtnBar, fn paramfn, ChatFooter paramChatFooter, ChatFooterCustom paramChatFooterCustom, i parami, boolean paramBoolean)
  {
    this.joa = paramhd;
    this.jri = paramChattingFooterMoreBtnBar;
    this.joc = paramChatFooter;
    this.jrk = paramChatFooterCustom;
    this.job = paramfn;
    b(parami, paramBoolean);
    this.jrl = AnimationUtils.loadAnimation(paramhd.agh(), b.MD);
    if (this.jod)
      z.w("!56@/B4Tb64lLpKwUcOR+EdWconoT4QVe0ZHl1mqxM9m75klvg8EeRcUAA==", "is in show search chat result");
    while (true)
    {
      this.jri.a(3, new go(this));
      this.jri.a(2, new gq(this));
      this.jri.a(0, new gr(this));
      this.jri.a(4, new gs(this));
      this.job.o(new gn(this));
      return;
      this.fqB = new fj(true, true);
      this.fqB.a(new gu(this));
    }
  }

  public final void K(ar paramar)
  {
    if (paramar == null)
      z.w("!56@/B4Tb64lLpKwUcOR+EdWconoT4QVe0ZHl1mqxM9m75klvg8EeRcUAA==", "perform search mode click msg item fail, msg is null");
    while (!this.job.de(paramar.kk()))
      return;
    int i = this.job.acU();
    this.jri.qf(i);
    this.jri.setVisibility(0);
    this.fqB.baN();
  }

  public final void L(ar paramar)
  {
    this.joa.a(true, this.fqB);
    this.jri.startAnimation(this.jrl);
    this.jri.setVisibility(0);
    this.jqz = true;
    this.joa.aVI();
    this.job.aVb();
    this.job.aUZ();
    this.job.de(paramar.kk());
    int i = this.job.acU();
    this.jri.qf(i);
    this.joa.aWh();
    this.joa.XF();
    this.joa.aVz();
    this.joa.aVy();
    n localn = n.fTF;
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Integer.valueOf(1);
    localn.d(10811, arrayOfObject);
  }

  public final void a(gv paramgv)
  {
    this.jrj = paramgv;
  }

  public final void aVe()
  {
    this.joa.a(false, this.fqB);
    this.jri.setVisibility(8);
    this.job.RR();
    this.joa.aVI();
    this.jqz = false;
    this.joa.aVz();
    this.joa.aWi();
    this.joa.aVy();
    this.joa.XF();
    bf.aUF();
  }

  public final void aVf()
  {
    this.joa.aVI();
    this.jri.setVisibility(0);
    this.jri.qf(this.job.acU());
  }

  public final boolean aVg()
  {
    return this.jqz;
  }

  public final void aVh()
  {
    if (this.fqB != null)
      this.fqB.baN();
  }

  public final void b(i parami, boolean paramBoolean)
  {
    this.jnf = parami;
    this.iWI = paramBoolean;
  }

  public final void fl(boolean paramBoolean)
  {
    this.jod = paramBoolean;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.gm
 * JD-Core Version:    0.6.2
 */