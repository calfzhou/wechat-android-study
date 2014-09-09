package com.tencent.mm.ui;

import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.chatting.hd;

final class bq
  implements Runnable
{
  bq(bp parambp)
  {
  }

  public final void run()
  {
    boolean bool = true;
    Object[] arrayOfObject = new Object[bool];
    if (LauncherUI.e(this.iKp.iKj) == null);
    while (true)
    {
      arrayOfObject[0] = Boolean.valueOf(bool);
      z.d("!32@/B4Tb64lLpKf6BwZaHy6XqYgvUDwrgQ2", "on select image ActivityResult. after creat chattingUI, chatting fragment is null? %B", arrayOfObject);
      if (LauncherUI.e(this.iKp.iKj) != null)
      {
        z.d("!32@/B4Tb64lLpKf6BwZaHy6XqYgvUDwrgQ2", "on select image ActivityResult. do post activity result");
        LauncherUI.e(this.iKp.iKj).onActivityResult(0xFFFF & this.iKp.cKo, this.iKp.cKp, this.iKp.cKq);
      }
      return;
      bool = false;
    }
  }

  public final String toString()
  {
    return super.toString() + "|PostSelectImageJob|onActivityResult";
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.bq
 * JD-Core Version:    0.6.2
 */