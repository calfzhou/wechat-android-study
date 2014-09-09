package com.tencent.mm.ui.base;

final class do
  implements Runnable
{
  do(MMSuperAlert paramMMSuperAlert, int paramInt1, int paramInt2, boolean paramBoolean)
  {
  }

  public final void run()
  {
    String str1;
    if (this.jcb == 0)
    {
      str1 = "";
      if (this.jcc != 0)
        break label66;
    }
    label66: for (String str2 = ""; ; str2 = this.jce.getString(this.jcc))
    {
      e.a(this.jce, str1, str2, this.jcd, new dp(this), new dq(this));
      return;
      str1 = this.jce.getString(this.jcb);
      break;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.do
 * JD-Core Version:    0.6.2
 */