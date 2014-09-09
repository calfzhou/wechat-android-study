package com.tencent.mm.ui.chatting;

import com.tencent.mm.n;
import com.tencent.mm.pluginsdk.ui.chat.ChatFooter;
import com.tencent.mm.storage.i;
import com.tencent.mm.ui.cu;

public final class bt
{
  private boolean iWI;
  private i jnf;
  private hd joa;
  private fn job;
  private ChatFooter joc;
  private boolean jod = false;
  private long[] joe = null;

  public bt(hd paramhd, fn paramfn, ChatFooter paramChatFooter, i parami, boolean paramBoolean, long[] paramArrayOfLong)
  {
    this.joa = paramhd;
    this.joc = paramChatFooter;
    this.job = paramfn;
    this.jnf = parami;
    this.iWI = paramBoolean;
    this.joe = paramArrayOfLong;
    this.joa.aPO();
    this.joa.a(this.joa.getString(n.bxt), new bu(this), cu.iMA);
    this.job.o(new bv(this));
  }

  public final void aUI()
  {
    this.joa.aVI();
    this.job.aVc();
    this.job.aUZ();
    if (this.joe != null)
      for (long l : this.joe)
        this.job.de(l);
    this.joc.setVisibility(8);
    this.joa.aWh();
    this.joa.XF();
    this.joa.aVz();
    this.joa.eF(true);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.bt
 * JD-Core Version:    0.6.2
 */