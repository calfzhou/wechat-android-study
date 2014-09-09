package com.tencent.mm.ui.conversation;

import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.platformtools.ap;
import com.tencent.mm.storage.i;
import com.tencent.mm.storage.o;

final class y
{
  private String cEh = null;
  private boolean dQd = false;
  private i elz = null;
  private Integer jFV = null;

  public y(r paramr)
  {
  }

  public final i aYd()
  {
    if ((this.dQd) && (this.elz == null))
      this.elz = bg.qW().oT().ys(this.cEh);
    return this.elz;
  }

  public final void bJ(String paramString)
  {
    this.cEh = paramString;
    this.elz = null;
    this.jFV = null;
    this.dQd = false;
    if (!ap.jb(paramString))
      this.dQd = true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.y
 * JD-Core Version:    0.6.2
 */