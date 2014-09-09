package com.tencent.mm.ui.tools;

import com.tencent.mm.model.bg;
import com.tencent.mm.modelsimple.i;
import com.tencent.mm.o.ac;
import com.tencent.mm.ui.applet.r;

final class ds extends r
{
  protected String iPK = null;
  protected String iPL = null;
  protected byte[] iPM = null;
  protected boolean iPN = false;
  protected String jTd = null;
  protected String jTe = null;
  protected String username = null;

  public final void aQC()
  {
    i locali = new i(this.username, this.jTd, this.jTe, this.iPN, "", "", "");
    bg.qX().d(locali);
  }

  protected final void onStart()
  {
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.ds
 * JD-Core Version:    0.6.2
 */